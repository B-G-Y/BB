#include <stdio.h>

int Count = 0;
void qsort(int* arr, int start, int end) {
	//분할된 원소가 0개이거나 1개 일때까지 함수 호출 
	if (start >= end) {
		return;
	}

	int pivot = start;	//피봇은 첫 번째 원소 
	int i = pivot + 1;	//i는 피봇 다음원소 
	int j = end;	//j는 마지막 원소 
	int temp;

	while (i <= j) {
		//피봇 보다 큰 값 만날 때 까지
		while (i <= end && arr[i] <= arr[pivot]) {
			++i;
		}
		//피봇 보다 작은 값 만날 때 까지
		while (j > start && arr[j] >= arr[pivot]) {
			--j;
		}

		//위에서 계산된 i와 j가 만나거나 엇갈리면 종료
		if (i >= j) break;

		//두 원소 교환 
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		Count += 3;
	}

	//피봇 정렬 완료 
	temp = arr[j];
	arr[j] = arr[pivot];
	arr[pivot] = temp;
	Count += 3;

	qsort(arr, start, j - 1);	//피봇 중심으로 왼쪽부분 분할
	qsort(arr, j + 1, end);	//피봇 중심으로 오른쪽부분 분할

}

int main() {

	int i;
	//1~10 무작위 배열
	int arr[10] = { 5, 6, 10, 4, 3, 8, 7, 1, 2, 9 };

	//배열, [0], [9]
	qsort(arr, 0, 9);

	//출력 
	for (i = 0; i < 10; ++i) {
		printf("%d ", arr[i]);
	}
	printf("\n");
	printf("%d", Count);
	return 0;
}
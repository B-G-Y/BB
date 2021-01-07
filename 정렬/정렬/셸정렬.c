#include<stdio.h>
#define MAX 6

void inc_insertion_sort(int list[], int first, int last, int gap)
{
	int i, j, key;
	for (i = first + gap; i <= last; i = i + gap)
	{
		key = list[i];
		for (j = i - gap; j >= first && key < list[j]; j = j - gap)
			list[j + gap] = list[j];
		list[j + gap] = key;
	}
}

void shell_sort(int list[], int n)
{
	int i, gap;
	for (gap = n / 2; gap > 0; gap = gap / 2)
	{
		if ((gap % 2) == 0) gap++;
		for (i = 0; i < gap; i++)
			inc_insertion_sort(list, i, n - 1, gap);
	}
}

int main()
{
	int n;
	int list[MAX];

	printf("임의의 양의 정수를 6번 입력하시오. \n");
	scanf_s("%d %d %d %d %d %d", &list[0], &list[1], &list[2], &list[3], &list[4], &list[5]);

	shell_sort(list, MAX);

	for (n = 0; n < MAX; n++)
		printf("%d ", list[n]);

	return 0;
}
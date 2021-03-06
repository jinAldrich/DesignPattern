package com.yujin.demo.algorithm;

public class ShellSort {

    public void shellSort(int[] list) {
        int gap = list.length / 2;

        while (gap >= 1) {
            // 把距离为 gap 的元素编为一个组，扫描所有组
            for (int i = gap; i < list.length; i++) {
                System.out.format("gap = %d: i = %d ", gap, i);
                int j = 0;
                int temp = list[i];

                // 对距离为 gap 的元素组进行排序
                for (j = i - gap; j >= 0 && temp < list[j]; j = j- gap) {
                    System.out.format("j+gp=%d j=%d ", (j+gap), j);
                    list[j + gap] = list[j];
                }
                list[j + gap] = temp;
            }

            System.out.format("gap = %d:\t", gap);
            printAll(list);
            gap = gap / 2; // 减小增量
        }
    }

    // 打印完整序列
    public void printAll(int[] list) {
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 9, 1, 2, 5, 7, 4, 8, 6, 3, 5};

        // 调用希尔排序方法
        ShellSort shell = new ShellSort();
        System.out.print("排序前:\t\t");
        shell.printAll(array);
        shell.shellSort(array);
        System.out.print("排序后:\t\t");
        shell.printAll(array);
    }

}

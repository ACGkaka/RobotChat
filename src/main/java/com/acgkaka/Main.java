package com.acgkaka;

import java.util.Scanner;

/**
 * <p> @Title Main
 * <p> @Description 主程序
 *
 * @author ACGkaka
 * @date 2020/12/8 17:37
 */
public class Main {

    /**
     * 退出术语
     */
    private static final String EXIT_MSG = "退出";

    public static void main(String[] args) throws InterruptedException {
        // 声明并实例化我们刚刚封装好的工具类
        RobotChatUtil util = new RobotChatUtil();
        System.out.println("欢迎使用傻瓜牌机器人~");
        System.out.print("你说 -> ");
        // 接收用户输入
        Scanner scanner = new Scanner(System.in);
        String message;
        // 输入 "退出"，退出程序
        while (!EXIT_MSG.equals(message = scanner.nextLine())) {
            //直接输出机器人的回复
            System.err.println("Ta 对你说 -> " + util.getMessage(message));
            Thread.sleep(100L);
            System.out.print("你说 -> ");
        }
        System.out.println("拜拜~");
        scanner.close();
    }
}

package com.google.android.apps.search.weather.suggestions.p10696c;

/* renamed from: com.google.android.apps.search.weather.suggestions.c.a */
/* compiled from: PG */
final class C142135a {
    /* renamed from: a */
    public static long m230749a(String str) {
        if (str.length() != 16 || Integer.parseInt(String.valueOf(str.charAt(0)), 16) <= 7) {
            return Long.parseLong(str, 16);
        }
        int parseInt = Integer.parseInt(String.valueOf(str.charAt(0)), 16);
        String substring = str.substring(1);
        StringBuilder sb = new StringBuilder();
        sb.append(parseInt - 8);
        sb.append(substring);
        return Long.parseLong(sb.toString(), 16) | Long.MIN_VALUE;
    }
}

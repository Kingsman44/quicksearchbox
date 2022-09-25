package com.google.android.libraries.notifications.p2268e.p2287j.p2288a;

/* renamed from: com.google.android.libraries.notifications.e.j.a.l */
/* compiled from: PG */
public final class C29949l {
    /* renamed from: a */
    public static int m55504a(String str, String str2, int i) {
        return (str + ":e:" + i + ":a:" + str2).hashCode();
    }

    /* renamed from: b */
    public static String m55505b(String str, String str2) {
        if (str == null) {
            str = "Anonymous";
        }
        int hashCode = str.hashCode();
        return hashCode + "::" + str2;
    }

    /* renamed from: c */
    public static String m55506c(String str, String str2) {
        if (str == null) {
            str = "Anonymous";
        }
        int hashCode = str.hashCode();
        return hashCode + "::SUMMARY::" + str2;
    }
}

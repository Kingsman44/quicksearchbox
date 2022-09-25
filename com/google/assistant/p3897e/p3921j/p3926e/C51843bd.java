package com.google.assistant.p3897e.p3921j.p3926e;

/* renamed from: com.google.assistant.e.j.e.bd */
/* compiled from: PG */
public enum C51843bd {
    APPLICATION_URL,
    APPLICATION_HTML,
    EXIT,
    APPLICATION_NOT_SET;

    /* renamed from: a */
    public static C51843bd m86399a(int i) {
        if (i == 0) {
            return APPLICATION_NOT_SET;
        }
        if (i == 1) {
            return APPLICATION_URL;
        }
        if (i == 2) {
            return APPLICATION_HTML;
        }
        if (i != 7) {
            return null;
        }
        return EXIT;
    }
}

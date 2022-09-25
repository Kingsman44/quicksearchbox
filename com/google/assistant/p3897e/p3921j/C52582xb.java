package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.xb */
/* compiled from: PG */
public enum C52582xb implements C62957cd {
    UNKNOWN_TRIGGER_TYPE(0),
    ASSISTANT(1),
    DEEPLINK(2),
    GOOGLE_APP_BROWSER(3),
    AIWA(4),
    GOOGLE_APP_BROWSER_DOGFOODER(5),
    REEVE_ASSISTANT(6),
    READ_EMAIL(7);
    

    /* renamed from: i */
    public final int f138062i;

    private C52582xb(int i) {
        this.f138062i = i;
    }

    /* renamed from: a */
    public static C52582xb m86658a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TRIGGER_TYPE;
            case 1:
                return ASSISTANT;
            case 2:
                return DEEPLINK;
            case 3:
                return GOOGLE_APP_BROWSER;
            case 4:
                return AIWA;
            case 5:
                return GOOGLE_APP_BROWSER_DOGFOODER;
            case 6:
                return REEVE_ASSISTANT;
            case 7:
                return READ_EMAIL;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86659b() {
        return C52581xa.f138052a;
    }

    public final int getNumber() {
        return this.f138062i;
    }

    public final String toString() {
        return Integer.toString(this.f138062i);
    }
}

package com.google.android.apps.gsa.searchplate.p6965c;

/* renamed from: com.google.android.apps.gsa.searchplate.c.a */
/* compiled from: PG */
public final class C88927a {
    /* renamed from: a */
    public static String m144526a(int i) {
        switch (i) {
            case 0:
                return "MODE_CLEAR";
            case 1:
                return "MODE_TEXT_INPUT";
            case 2:
                return "MODE_VOICE_INPUT";
            case 3:
                return "MODE_MUSIC_INPUT";
            case 4:
                return "MODE_TEXT_RESULT";
            case 5:
                return "MODE_VOICE_RESULT";
            case 6:
                return "MODE_FOLLOW_ON";
            case 7:
                return "MODE_AUDIO_ERROR";
            case 8:
                return "MODE_VOICE_INTERACTION";
            default:
                return "unknown mode: " + i;
        }
    }

    /* renamed from: b */
    public static boolean m144527b(int i) {
        return i == 4 || i == 5;
    }

    /* renamed from: c */
    public static boolean m144528c(int i) {
        return i == 7 || i == 2 || i == 3;
    }

    /* renamed from: d */
    public static boolean m144529d(int i) {
        return i == 0 || i == 1 || i == 4;
    }

    /* renamed from: e */
    public static boolean m144530e(int i) {
        return i >= 0 && i <= 8;
    }

    /* renamed from: f */
    public static boolean m144531f(int i) {
        return i == 2 || i == 6 || i == 8;
    }
}

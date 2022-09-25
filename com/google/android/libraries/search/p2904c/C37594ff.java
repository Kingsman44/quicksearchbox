package com.google.android.libraries.search.p2904c;

/* renamed from: com.google.android.libraries.search.c.ff */
/* compiled from: PG */
public final class C37594ff {
    /* renamed from: a */
    public static /* synthetic */ String m66585a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "OUTCOME_NOT_SET" : "AUDIO_BUFFER_OUTCOME" : "HOTWORD_FIRST_BYTE_READ_OUTCOME" : "AUDIO_REQUEST_FIRST_BYTE_READ_OUTCOME";
    }

    /* renamed from: b */
    public static int m66586b(int i) {
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }
}

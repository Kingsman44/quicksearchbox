package org.tensorflow.lite;

/* renamed from: org.tensorflow.lite.a */
/* compiled from: PG */
public final class C72664a {
    /* renamed from: a */
    public static /* synthetic */ String m107475a(int i) {
        switch (i) {
            case 1:
                return "FLOAT32";
            case 2:
                return "INT32";
            case 3:
                return "UINT8";
            case 4:
                return "INT64";
            case 5:
                return "STRING";
            case 6:
                return "BOOL";
            case 7:
                return "INT16";
            case 8:
                return "INT8";
            default:
                return "null";
        }
    }

    /* renamed from: b */
    public static int m107476b(int i) {
        int i2 = i - 1;
        if (i2 == 0 || i2 == 1) {
            return 4;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return 8;
            }
            if (i2 == 6) {
                return 2;
            }
            if (i2 != 7) {
                return -1;
            }
        }
        return 1;
    }
}

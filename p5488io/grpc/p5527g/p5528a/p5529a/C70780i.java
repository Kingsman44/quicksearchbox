package p5488io.grpc.p5527g.p5528a.p5529a;

import com.evernote.android.state.BuildConfig;
import java.util.Locale;

/* renamed from: io.grpc.g.a.a.i */
/* compiled from: PG */
public final class C70780i {

    /* renamed from: a */
    private static final String[] f188749a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: b */
    private static final String[] f188750b = new String[64];

    /* renamed from: c */
    private static final String[] f188751c = new String[256];

    static {
        for (int i = 0; i < 256; i++) {
            f188751c[i] = String.format("%8s", new Object[]{Integer.toBinaryString(i)}).replace(' ', '0');
        }
        String[] strArr = f188750b;
        strArr[0] = BuildConfig.FLAVOR;
        strArr[1] = "END_STREAM";
        int[] iArr = {1};
        strArr[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            String[] strArr2 = f188750b;
            strArr2[i3 | 8] = String.valueOf(strArr2[i3]).concat("|PADDED");
        }
        String[] strArr3 = f188750b;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 <= 0; i6++) {
                int i7 = iArr[i6];
                int i8 = i7 | i5;
                String[] strArr4 = f188750b;
                String str = strArr4[i7];
                String str2 = strArr4[i5];
                strArr4[i8] = str + "|" + str2;
                String str3 = strArr4[i7];
                String str4 = strArr4[i5];
                strArr4[i8 | 8] = str3 + "|" + str4 + "|PADDED";
            }
        }
        for (int i9 = 0; i9 < 64; i9++) {
            String[] strArr5 = f188750b;
            if (strArr5[i9] == null) {
                strArr5[i9] = f188751c[i9];
            }
        }
    }

    C70780i() {
    }

    /* renamed from: a */
    public static String m103513a(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String str2;
        String format = b < 10 ? f188749a[b] : String.format("0x%02x", new Object[]{Byte.valueOf(b)});
        if (b2 == 0) {
            str = BuildConfig.FLAVOR;
        } else {
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    str = b2 == 1 ? "ACK" : f188751c[b2];
                } else if (!(b == 7 || b == 8)) {
                    if (b2 < 64) {
                        str2 = f188750b[b2];
                    } else {
                        str2 = f188751c[b2];
                    }
                    if (b == 5) {
                        if ((b2 & 4) != 0) {
                            str = str2.replace("HEADERS", "PUSH_PROMISE");
                        }
                    } else if (b == 0 && (b2 & 32) != 0) {
                        str = str2.replace("PRIORITY", "COMPRESSED");
                    }
                    str = str2;
                }
            }
            str = f188751c[b2];
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = true != z ? ">>" : "<<";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = format;
        objArr[4] = str;
        return String.format(locale, "%s 0x%08x %5d %-13s %s", objArr);
    }
}

package org.p5623b.p5624a;

import java.io.IOException;
import org.chromium.net.PrivateKeyType;
import org.p5623b.p5629b.C72123b;

/* renamed from: org.b.a.b */
/* compiled from: PG */
public abstract class C72041b extends C72108u implements C72017ac {

    /* renamed from: c */
    public static final /* synthetic */ int f191796c = 0;

    /* renamed from: d */
    private static final char[] f191797d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final byte[] f191798a;

    /* renamed from: b */
    public final int f191799b;

    public C72041b(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        } else if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        } else {
            this.f191798a = C72123b.m105660b(bArr);
            this.f191799b = i;
        }
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72041b)) {
            return false;
        }
        C72041b bVar = (C72041b) uVar;
        if (this.f191799b != bVar.f191799b) {
            return false;
        }
        byte[] bArr = this.f191798a;
        byte[] bArr2 = bVar.f191798a;
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        int i = length - 1;
        if (i < 0) {
            return true;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        byte b = bArr[i];
        int i3 = PrivateKeyType.INVALID << this.f191799b;
        if (((byte) (b & i3)) == ((byte) (bArr2[i] & i3))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final String mo63226e() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] o = mo63293o();
            for (int i = 0; i != o.length; i++) {
                char[] cArr = f191797d;
                stringBuffer.append(cArr[(o[i] >>> 4) & 15]);
                stringBuffer.append(cArr[o[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new C72107t("Internal error encoding BitString: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    /* renamed from: f */
    public C72108u mo63228f() {
        return new C72034at(this.f191798a, this.f191799b);
    }

    public final int hashCode() {
        int i;
        byte[] bArr = this.f191798a;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        byte b = (byte) (bArr[length] & (PrivateKeyType.INVALID << this.f191799b));
        if (bArr == null) {
            i = 0;
        } else {
            int i2 = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 = (i2 * 257) ^ bArr[length];
            }
            i = i2;
        }
        return ((i * 257) ^ b) ^ this.f191799b;
    }

    public final String toString() {
        return mo63226e();
    }
}

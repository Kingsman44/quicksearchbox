package androidx.core.p095g;

import java.util.Comparator;

/* renamed from: androidx.core.g.d */
/* compiled from: PG */
public final /* synthetic */ class C1906d implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C1906d f5782a = new C1906d();

    private /* synthetic */ C1906d() {
    }

    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int length = bArr.length;
        int length2 = bArr2.length;
        if (length != length2) {
            return length - length2;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }
}

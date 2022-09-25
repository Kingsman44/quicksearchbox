package p5488io.grpc;

import com.google.common.p4541l.C59326i;
import java.nio.charset.Charset;

/* renamed from: io.grpc.bv */
/* compiled from: PG */
public final class C70251bv {

    /* renamed from: a */
    public static final Charset f187249a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final C59326i f187250b = C70334de.f187482d;

    /* renamed from: a */
    public static int m102398a(C70334de deVar) {
        return deVar.f187484f;
    }

    /* renamed from: b */
    public static C70297cz m102399b(String str, C70250bu buVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return C70297cz.m102497e(str, z, buVar);
    }

    /* renamed from: c */
    public static C70334de m102400c(byte[]... bArr) {
        return new C70334de(bArr.length >> 1, (Object[]) bArr);
    }

    /* renamed from: d */
    public static C70334de m102401d(int i, Object[] objArr) {
        return new C70334de(i, objArr);
    }

    /* renamed from: e */
    public static Object m102402e(C70294cw cwVar, Object obj) {
        return new C70331db(cwVar, obj);
    }

    /* renamed from: f */
    public static Object[] m102403f(C70334de deVar) {
        int i = deVar.f187484f;
        Object[] objArr = new Object[(i + i)];
        for (int i2 = 0; i2 < deVar.f187484f; i2++) {
            int i3 = i2 + i2;
            objArr[i3] = deVar.mo62036k(i2);
            int i4 = i3 + 1;
            Object c = deVar.mo62028c(i2);
            if (!(c instanceof byte[])) {
                c = ((C70331db) c).mo62022b();
            }
            objArr[i4] = c;
        }
        return objArr;
    }

    /* renamed from: g */
    public static byte[][] m102404g(C70334de deVar) {
        int i = deVar.f187484f;
        int i2 = i + i;
        byte[][] bArr = new byte[i2][];
        Object[] objArr = deVar.f187483e;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i2);
        } else {
            for (int i3 = 0; i3 < deVar.f187484f; i3++) {
                int i4 = i3 + i3;
                bArr[i4] = deVar.mo62036k(i3);
                bArr[i4 + 1] = deVar.mo62037m(i3);
            }
        }
        return bArr;
    }
}

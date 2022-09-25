package androidx.media3.extractor;

import androidx.media3.common.C2599az;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2617e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.extractor.f */
/* compiled from: PG */
public final class C3395f {

    /* renamed from: a */
    public final List f10281a;

    /* renamed from: b */
    public final int f10282b;

    /* renamed from: c */
    public final int f10283c;

    /* renamed from: d */
    public final int f10284d;

    /* renamed from: e */
    public final float f10285e;

    /* renamed from: f */
    public final String f10286f;

    private C3395f(List list, int i, int i2, int i3, float f, String str) {
        this.f10281a = list;
        this.f10282b = i;
        this.f10283c = i2;
        this.f10284d = i3;
        this.f10285e = f;
        this.f10286f = str;
    }

    /* renamed from: a */
    public static C3395f m9815a(C2604ac acVar) {
        String str;
        float f;
        int i;
        int i2;
        try {
            acVar.mo6131A(acVar.f7235b + 4);
            int g = (acVar.mo6139g() & 3) + 1;
            if (g != 3) {
                ArrayList arrayList = new ArrayList();
                int g2 = acVar.mo6139g() & 31;
                for (int i3 = 0; i3 < g2; i3++) {
                    arrayList.add(m9816b(acVar));
                }
                int g3 = acVar.mo6139g();
                for (int i4 = 0; i4 < g3; i4++) {
                    arrayList.add(m9816b(acVar));
                }
                if (g2 > 0) {
                    C3346au c = C3347av.m9694c((byte[]) arrayList.get(0), g + 1, ((byte[]) arrayList.get(0)).length);
                    int i5 = c.f10105e;
                    int i6 = c.f10106f;
                    float f2 = c.f10107g;
                    str = C2617e.m7013a(c.f10101a, c.f10102b, c.f10103c);
                    i2 = i5;
                    i = i6;
                    f = f2;
                } else {
                    str = null;
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new C3395f(arrayList, g, i2, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C2599az.m6819a("Error parsing AVC config", e);
        }
    }

    /* renamed from: b */
    private static byte[] m9816b(C2604ac acVar) {
        int j = acVar.mo6142j();
        int i = acVar.f7235b;
        acVar.mo6131A(i + j);
        byte[] bArr = acVar.f7234a;
        byte[] bArr2 = C2617e.f7267a;
        byte[] bArr3 = new byte[(j + 4)];
        System.arraycopy(C2617e.f7267a, 0, bArr3, 0, 4);
        System.arraycopy(bArr, i, bArr3, 4, j);
        return bArr3;
    }
}

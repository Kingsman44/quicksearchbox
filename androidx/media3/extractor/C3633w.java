package androidx.media3.extractor;

import androidx.media3.common.p136b.C2604ac;

/* renamed from: androidx.media3.extractor.w */
/* compiled from: PG */
public final class C3633w {

    /* renamed from: a */
    public final String f11579a;

    private C3633w(String str) {
        this.f11579a = str;
    }

    /* renamed from: a */
    public static C3633w m10477a(C2604ac acVar) {
        String str;
        acVar.mo6131A(acVar.f7235b + 2);
        int g = acVar.mo6139g();
        int i = g >> 1;
        int g2 = (acVar.mo6139g() >> 3) | ((g & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = g2 < 10 ? ".0" : ".";
        return new C3633w(str + ".0" + i + str2 + g2);
    }
}

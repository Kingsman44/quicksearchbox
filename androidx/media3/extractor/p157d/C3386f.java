package androidx.media3.extractor.p157d;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3347av;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3395f;

/* renamed from: androidx.media3.extractor.d.f */
/* compiled from: PG */
final class C3386f extends C3385e {

    /* renamed from: a */
    private final C2604ac f10250a = new C2604ac(C3347av.f10114a);

    /* renamed from: b */
    private final C2604ac f10251b = new C2604ac(4);

    /* renamed from: c */
    private int f10252c;

    /* renamed from: e */
    private boolean f10253e;

    /* renamed from: f */
    private boolean f10254f;

    /* renamed from: g */
    private int f10255g;

    public C3386f(C3368bf bfVar) {
        super(bfVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7368a(C2604ac acVar) {
        int g = acVar.mo6139g();
        int i = g >> 4;
        int i2 = g & 15;
        if (i2 == 7) {
            this.f10255g = i;
            return i != 5;
        }
        throw new C3384d("Video format not supported: " + i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo7369b(C2604ac acVar, long j) {
        C2604ac acVar2 = acVar;
        int g = acVar.mo6139g();
        byte[] bArr = acVar2.f7234a;
        int i = acVar2.f7235b;
        int i2 = i + 1;
        acVar2.f7235b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        acVar2.f7235b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        acVar2.f7235b = i4;
        long j2 = j + (((long) ((bArr[i3] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8))) * 1000);
        if (g == 0) {
            if (!this.f10253e) {
                C2604ac acVar3 = new C2604ac(new byte[(acVar2.f7236c - i4)]);
                acVar2.mo6155w(acVar3.f7234a, 0, acVar2.f7236c - acVar2.f7235b);
                C3395f a = C3395f.m9815a(acVar3);
                this.f10252c = a.f10282b;
                C2679w wVar = new C2679w();
                wVar.f7459k = "video/avc";
                wVar.f7456h = a.f10286f;
                wVar.f7464p = a.f10283c;
                wVar.f7465q = a.f10284d;
                wVar.f7468t = a.f10285e;
                wVar.f7461m = a.f10281a;
                this.f10249d.mo6850b(new C2680x(wVar));
                this.f10253e = true;
                return false;
            }
        } else if (g == 1 && this.f10253e) {
            int i5 = this.f10255g == 1 ? 1 : 0;
            if (!this.f10254f && i5 == 0) {
                return false;
            }
            byte[] bArr2 = this.f10251b.f7234a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i6 = 4 - this.f10252c;
            int i7 = 0;
            while (acVar2.f7236c - acVar2.f7235b > 0) {
                acVar2.mo6155w(this.f10251b.f7234a, i6, this.f10252c);
                this.f10251b.mo6131A(0);
                int i8 = this.f10251b.mo6141i();
                this.f10250a.mo6131A(0);
                this.f10249d.mo6851c(this.f10250a, 4);
                this.f10249d.mo6851c(acVar2, i8);
                i7 = i7 + 4 + i8;
            }
            this.f10249d.mo6852d(j2, i5, i7, 0, (C3367be) null);
            this.f10254f = true;
            return true;
        }
        return false;
    }
}

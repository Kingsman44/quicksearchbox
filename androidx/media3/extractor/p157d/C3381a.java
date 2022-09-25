package androidx.media3.extractor.p157d;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3324a;
import androidx.media3.extractor.C3352b;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;
import java.util.Collections;

/* renamed from: androidx.media3.extractor.d.a */
/* compiled from: PG */
final class C3381a extends C3385e {

    /* renamed from: a */
    private static final int[] f10226a = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f10227b;

    /* renamed from: c */
    private boolean f10228c;

    /* renamed from: e */
    private int f10229e;

    public C3381a(C3368bf bfVar) {
        super(bfVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo7369b(C2604ac acVar, long j) {
        if (this.f10229e == 2) {
            int i = acVar.f7236c - acVar.f7235b;
            this.f10249d.mo6851c(acVar, i);
            this.f10249d.mo6852d(j, 1, i, 0, (C3367be) null);
            return true;
        }
        int g = acVar.mo6139g();
        if (g == 0 && !this.f10228c) {
            int i2 = acVar.f7236c - acVar.f7235b;
            byte[] bArr = new byte[i2];
            acVar.mo6155w(bArr, 0, i2);
            C3324a a = C3352b.m9711a(bArr);
            C2679w wVar = new C2679w();
            wVar.f7459k = "audio/mp4a-latm";
            wVar.f7456h = a.f10032c;
            wVar.f7472x = a.f10031b;
            wVar.f7473y = a.f10030a;
            wVar.f7461m = Collections.singletonList(bArr);
            this.f10249d.mo6850b(new C2680x(wVar));
            this.f10228c = true;
            return false;
        } else if (this.f10229e == 10 && g != 1) {
            return false;
        } else {
            int i3 = acVar.f7236c - acVar.f7235b;
            this.f10249d.mo6851c(acVar, i3);
            this.f10249d.mo6852d(j, 1, i3, 0, (C3367be) null);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7368a(C2604ac acVar) {
        if (!this.f10227b) {
            int g = acVar.mo6139g();
            int i = g >> 4;
            this.f10229e = i;
            if (i == 2) {
                int i2 = f10226a[(g >> 2) & 3];
                C2679w wVar = new C2679w();
                wVar.f7459k = "audio/mpeg";
                wVar.f7472x = 1;
                wVar.f7473y = i2;
                this.f10249d.mo6850b(new C2680x(wVar));
                this.f10228c = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                C2679w wVar2 = new C2679w();
                wVar2.f7459k = str;
                wVar2.f7472x = 1;
                wVar2.f7473y = 8000;
                this.f10249d.mo6850b(new C2680x(wVar2));
                this.f10228c = true;
            } else if (i != 10) {
                throw new C3384d("Audio format not supported: " + i);
            }
            this.f10227b = true;
        } else {
            acVar.mo6131A(acVar.f7235b + 1);
        }
        return true;
    }
}

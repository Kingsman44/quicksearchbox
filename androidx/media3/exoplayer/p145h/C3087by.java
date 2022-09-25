package androidx.media3.exoplayer.p145h;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.C2584ak;
import androidx.media3.common.C2590aq;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.exoplayer.p139c.C2868k;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2504h;
import androidx.media3.p132b.C2505i;

/* renamed from: androidx.media3.exoplayer.h.by */
/* compiled from: PG */
public final class C3087by extends C3005a implements C3079bq {

    /* renamed from: a */
    private final C2590aq f9004a;

    /* renamed from: b */
    private final C2584ak f9005b;

    /* renamed from: c */
    private final C2504h f9006c;

    /* renamed from: d */
    private final C2868k f9007d;

    /* renamed from: e */
    private final int f9008e;

    /* renamed from: f */
    private boolean f9009f = true;

    /* renamed from: g */
    private long f9010g = -9223372036854775807L;

    /* renamed from: h */
    private boolean f9011h;

    /* renamed from: i */
    private boolean f9012i;

    /* renamed from: j */
    private C2495an f9013j;

    /* renamed from: k */
    private final C3085bw f9014k;

    public C3087by(C2590aq aqVar, C2504h hVar, C3085bw bwVar, C2868k kVar, int i) {
        C2584ak akVar = aqVar.f7154c;
        akVar.getClass();
        this.f9005b = akVar;
        this.f9004a = aqVar;
        this.f9006c = hVar;
        this.f9014k = bwVar;
        this.f9007d = kVar;
        this.f9008e = i;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.media3.exoplayer.h.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m8909d() {
        /*
            r7 = this;
            androidx.media3.exoplayer.h.cj r6 = new androidx.media3.exoplayer.h.cj
            long r1 = r7.f9010g
            boolean r3 = r7.f9011h
            boolean r4 = r7.f9012i
            androidx.media3.common.aq r5 = r7.f9004a
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            boolean r0 = r7.f9009f
            if (r0 == 0) goto L_0x0018
            androidx.media3.exoplayer.h.bv r0 = new androidx.media3.exoplayer.h.bv
            r0.<init>(r6)
            r6 = r0
        L_0x0018:
            r7.mo6952y(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3087by.m8909d():void");
    }

    /* renamed from: a */
    public final C2590aq mo6745a() {
        return this.f9004a;
    }

    /* renamed from: b */
    public final void mo7049b(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f9010g;
        }
        if (this.f9009f || this.f9010g != j || this.f9011h != z || this.f9012i != z2) {
            this.f9010g = j;
            this.f9011h = z;
            this.f9012i = z2;
            this.f9009f = false;
            m8909d();
        }
    }

    /* renamed from: c */
    public final void mo6747c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo6750f(C2495an anVar) {
        this.f9013j = anVar;
        this.f9007d.mo6611b();
        C2868k kVar = this.f9007d;
        Looper.myLooper().getClass();
        C2601a.m6829a(this.f8712q);
        kVar.mo6615f();
        m8909d();
    }

    /* renamed from: h */
    public final void mo6752h(C3034aq aqVar) {
        C3083bu buVar = (C3083bu) aqVar;
        if (buVar.f8982k) {
            for (C3094ce ceVar : buVar.f8981j) {
                ceVar.mo7081q();
                ceVar.mo7085v();
            }
        }
        buVar.f8976e.mo7251d(buVar);
        buVar.f8978g.removeCallbacksAndMessages((Object) null);
        buVar.f8979h = null;
        buVar.f8989r = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo6753i() {
        this.f9007d.mo6612c();
    }

    /* renamed from: m */
    public final C3034aq mo6757m(C3036as asVar, C3241g gVar, long j) {
        C2505i a = this.f9006c.mo5878a();
        C2495an anVar = this.f9013j;
        if (anVar != null) {
            a.mo5884f(anVar);
        }
        Uri uri = this.f9005b.f7131a;
        C3085bw bwVar = this.f9014k;
        C2601a.m6829a(this.f8712q);
        return new C3083bu(uri, a, new C3089c(bwVar.f8998a), this.f9007d, mo6943p(asVar), mo6944q(asVar), this, gVar, this.f9008e);
    }
}

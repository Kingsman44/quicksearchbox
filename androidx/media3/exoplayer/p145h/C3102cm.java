package androidx.media3.exoplayer.p145h;

import androidx.media3.common.C2652bn;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.C2897cz;
import androidx.media3.exoplayer.p150j.C3197ad;
import androidx.media3.exoplayer.p151k.C3245k;
import androidx.media3.exoplayer.p151k.C3248n;
import androidx.media3.exoplayer.p151k.C3249o;
import androidx.media3.exoplayer.p151k.C3250p;
import androidx.media3.exoplayer.p151k.C3252r;
import androidx.media3.exoplayer.p151k.C3256v;
import androidx.media3.p132b.C2493al;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2504h;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2510n;
import com.evernote.android.state.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: androidx.media3.exoplayer.h.cm */
/* compiled from: PG */
final class C3102cm implements C3034aq, C3249o {

    /* renamed from: a */
    public final C3065bc f9088a;

    /* renamed from: b */
    final C3256v f9089b = new C3256v("SingleSampleMediaPeriod");

    /* renamed from: c */
    final C2680x f9090c;

    /* renamed from: d */
    boolean f9091d;

    /* renamed from: e */
    byte[] f9092e;

    /* renamed from: f */
    int f9093f;

    /* renamed from: g */
    private final C2510n f9094g;

    /* renamed from: h */
    private final C2504h f9095h;

    /* renamed from: i */
    private final C2495an f9096i;

    /* renamed from: j */
    private final C3107cr f9097j;

    /* renamed from: k */
    private final ArrayList f9098k = new ArrayList();

    public C3102cm(C2510n nVar, C2504h hVar, C2495an anVar, C2680x xVar, C3065bc bcVar) {
        this.f9094g = nVar;
        this.f9095h = hVar;
        this.f9096i = anVar;
        this.f9090c = xVar;
        this.f9088a = bcVar;
        this.f9097j = new C3107cr(new C2652bn(BuildConfig.FLAVOR, xVar));
    }

    /* renamed from: a */
    public final long mo6807a(long j, C2897cz czVar) {
        return j;
    }

    /* renamed from: c */
    public final long mo6808c() {
        return this.f9091d ? Long.MIN_VALUE : 0;
    }

    /* renamed from: d */
    public final long mo6809d() {
        return (this.f9091d || this.f9089b.mo7253f()) ? Long.MIN_VALUE : 0;
    }

    /* renamed from: e */
    public final long mo6810e() {
        return -9223372036854775807L;
    }

    /* renamed from: eX */
    public final /* bridge */ /* synthetic */ void mo6825eX(C3252r rVar, boolean z) {
        C3101cl clVar = (C3101cl) rVar;
        C2493al alVar = clVar.f9086c;
        long j = clVar.f9084a;
        this.f9088a.mo7017p(new C3027aj(clVar.f9085b, (byte[]) null), 1, -1, (C2680x) null, 0, 0, -9223372036854775807L);
    }

    /* renamed from: f */
    public final long mo6811f(long j) {
        for (int i = 0; i < this.f9098k.size(); i++) {
            C3100ck ckVar = (C3100ck) this.f9098k.get(i);
            if (ckVar.f9081a == 2) {
                ckVar.f9081a = 1;
            }
        }
        return j;
    }

    /* renamed from: fb */
    public final /* bridge */ /* synthetic */ void mo6826fb(C3252r rVar, long j, long j2) {
        C3101cl clVar = (C3101cl) rVar;
        this.f9093f = (int) clVar.f9086c.f6845a;
        byte[] bArr = clVar.f9087d;
        bArr.getClass();
        this.f9092e = bArr;
        this.f9091d = true;
        long j3 = clVar.f9084a;
        this.f9088a.mo7018q(new C3027aj(clVar.f9085b, (byte[]) null), 1, -1, this.f9090c, 0, 0, -9223372036854775807L);
    }

    /* renamed from: fc */
    public final void mo6812fc(C3033ap apVar, long j) {
        apVar.mo6620eY(this);
    }

    /* renamed from: fe */
    public final /* bridge */ /* synthetic */ C3250p mo6827fe(C3252r rVar, IOException iOException, int i) {
        C3250p pVar;
        IOException iOException2 = iOException;
        int i2 = i;
        C3101cl clVar = (C3101cl) rVar;
        C2493al alVar = clVar.f9086c;
        long j = clVar.f9084a;
        C3027aj ajVar = new C3027aj(clVar.f9085b, (byte[]) null);
        int i3 = C2612ak.f7249a;
        long c = C3245k.m9468c(new C3248n(iOException2, i2));
        if (c == -9223372036854775807L || i2 >= C3245k.m9467b(1)) {
            C2633u.m7050e("SingleSampleMediaPeriod", C2633u.m7046a("Loading failed, treating as end-of-stream.", iOException2));
            this.f9091d = true;
            pVar = C3256v.f9786b;
        } else {
            pVar = new C3250p(0, c);
        }
        C3250p pVar2 = pVar;
        boolean z = !pVar2.mo7243a();
        this.f9088a.mo7019r(ajVar, 1, -1, this.f9090c, 0, 0, -9223372036854775807L, iOException, z);
        if (z) {
            long j2 = clVar.f9084a;
        }
        return pVar2;
    }

    /* renamed from: g */
    public final long mo6813g(C3197ad[] adVarArr, boolean[] zArr, C3095cf[] cfVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < adVarArr.length; i++) {
            C3095cf cfVar = cfVarArr[i];
            if (cfVar != null && (adVarArr[i] == null || !zArr[i])) {
                this.f9098k.remove(cfVar);
                cfVar = null;
                cfVarArr[i] = null;
            }
            if (cfVar == null && adVarArr[i] != null) {
                C3100ck ckVar = new C3100ck(this);
                this.f9098k.add(ckVar);
                cfVarArr[i] = ckVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    /* renamed from: h */
    public final C3107cr mo6814h() {
        return this.f9097j;
    }

    /* renamed from: i */
    public final void mo6815i(long j, boolean z) {
    }

    /* renamed from: j */
    public final void mo6816j() {
    }

    /* renamed from: m */
    public final void mo6818m(long j) {
    }

    /* renamed from: n */
    public final boolean mo6819n(long j) {
        if (this.f9091d) {
            return false;
        }
        C3256v vVar = this.f9089b;
        if (vVar.mo7253f() || vVar.mo7252e()) {
            return false;
        }
        C2505i a = this.f9095h.mo5878a();
        C2495an anVar = this.f9096i;
        if (anVar != null) {
            a.mo5884f(anVar);
        }
        this.f9089b.mo7254g(new C3101cl(this.f9094g, a), this, C3245k.m9467b(1));
        this.f9088a.mo7020s(new C3027aj(this.f9094g), 1, -1, this.f9090c, 0, 0, -9223372036854775807L);
        return true;
    }

    /* renamed from: o */
    public final boolean mo6820o() {
        return this.f9089b.mo7253f();
    }
}

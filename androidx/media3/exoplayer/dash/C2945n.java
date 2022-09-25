package androidx.media3.exoplayer.dash;

import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3065bc;
import androidx.media3.exoplayer.p151k.C3249o;
import androidx.media3.exoplayer.p151k.C3250p;
import androidx.media3.exoplayer.p151k.C3252r;
import androidx.media3.exoplayer.p151k.C3256v;
import androidx.media3.exoplayer.p151k.C3259y;
import androidx.media3.p132b.C2493al;
import androidx.media3.p132b.C2510n;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.dash.n */
/* compiled from: PG */
final class C2945n implements C3249o {

    /* renamed from: a */
    final /* synthetic */ DashMediaSource f8452a;

    public C2945n(DashMediaSource dashMediaSource) {
        this.f8452a = dashMediaSource;
    }

    /* renamed from: eX */
    public final /* synthetic */ void mo6825eX(C3252r rVar, boolean z) {
        this.f8452a.mo6758n((C3259y) rVar);
    }

    /* renamed from: fb */
    public final /* synthetic */ void mo6826fb(C3252r rVar, long j, long j2) {
        C3259y yVar = (C3259y) rVar;
        DashMediaSource dashMediaSource = this.f8452a;
        long j3 = yVar.f9791a;
        C2510n nVar = yVar.f9792b;
        C2493al alVar = yVar.f9794d;
        dashMediaSource.f8276a.mo7007f(new C3027aj(nVar, (byte[]) null), yVar.f9793c);
        dashMediaSource.mo6749e(((Long) yVar.f9795e).longValue() - j);
    }

    /* renamed from: fe */
    public final /* synthetic */ C3250p mo6827fe(C3252r rVar, IOException iOException, int i) {
        C3259y yVar = (C3259y) rVar;
        DashMediaSource dashMediaSource = this.f8452a;
        C3065bc bcVar = dashMediaSource.f8276a;
        long j = yVar.f9791a;
        C2510n nVar = yVar.f9792b;
        C2493al alVar = yVar.f9794d;
        bcVar.mo7009h(new C3027aj(nVar, (byte[]) null), yVar.f9793c, iOException, true);
        long j2 = yVar.f9791a;
        dashMediaSource.mo6748d(iOException);
        return C3256v.f9786b;
    }
}

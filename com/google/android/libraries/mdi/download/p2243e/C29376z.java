package com.google.android.libraries.mdi.download.p2243e;

import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.android.libraries.mdi.download.foreground.C29421a;
import com.google.android.libraries.mdi.download.foreground.C29422b;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.mdi.download.e.z */
/* compiled from: PG */
final class C29376z implements C29353c {

    /* renamed from: a */
    final /* synthetic */ C29422b f79633a;

    /* renamed from: b */
    final /* synthetic */ C1839z f79634b;

    /* renamed from: c */
    final /* synthetic */ C29359i f79635c;

    /* renamed from: d */
    final /* synthetic */ C1800aq f79636d;

    /* renamed from: e */
    final /* synthetic */ int f79637e;

    /* renamed from: f */
    final /* synthetic */ String f79638f;

    /* renamed from: g */
    final /* synthetic */ C29348ab f79639g;

    public C29376z(C29348ab abVar, C29422b bVar, C1839z zVar, C29359i iVar, C1800aq aqVar, int i, String str) {
        this.f79639g = abVar;
        this.f79633a = bVar;
        this.f79634b = zVar;
        this.f79635c = iVar;
        this.f79636d = aqVar;
        this.f79637e = i;
        this.f79638f = str;
    }

    /* renamed from: a */
    public final C60870cx mo34574a() {
        C60870cx cxVar;
        if (this.f79635c.mo34673e().mo56113h()) {
            cxVar = ((C29353c) this.f79635c.mo34673e().mo56107c()).mo34574a();
        } else {
            cxVar = C60866ct.f164955a;
        }
        return C29670b.m54719g(cxVar).mo34822i(new C29370t(this, this.f79634b, this.f79635c, this.f79636d, this.f79637e, this.f79633a), this.f79639g.f79555c).mo34820f(Exception.class, new C29371u(this, this.f79635c, this.f79634b, this.f79636d, this.f79637e), this.f79639g.f79555c).mo34822i(new C29372v(this, this.f79635c, this.f79633a), this.f79639g.f79555c);
    }

    /* renamed from: b */
    public final void mo34575b(Throwable th) {
        C29374x xVar = new C29374x(this, this.f79634b, this.f79636d, this.f79637e, this.f79635c, th, this.f79633a);
        C60856cj.m92905n(C47810es.m84965e(xVar), this.f79639g.f79555c);
    }

    /* renamed from: c */
    public final void mo34576c() {
        C60870cx c = this.f79639g.f79559g.mo34566c(((C29421a) this.f79633a).f79765a);
        C29373w wVar = new C29373w(this.f79634b, this.f79638f, this.f79636d, this.f79637e, this.f79635c);
        C60922j.m93045h(c, C47810es.m84966f(wVar), this.f79639g.f79555c);
    }

    /* renamed from: d */
    public final void mo34577d(long j) {
        C60870cx c = this.f79639g.f79559g.mo34566c(((C29421a) this.f79633a).f79765a);
        C29375y yVar = new C29375y(this.f79634b, this.f79635c, j, this.f79636d, this.f79637e);
        C60922j.m93045h(c, C47810es.m84966f(yVar), this.f79639g.f79555c);
    }
}

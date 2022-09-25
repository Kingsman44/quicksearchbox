package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7596b;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97043f;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7592a.C97029d;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7592a.C97032g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import java.util.TimerTask;
import java.util.concurrent.CancellationException;
import org.p5633c.p5634a.C72296t;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.b.k */
/* compiled from: PG */
final class C97060k extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ C97063n f271199a;

    public C97060k(C97063n nVar) {
        this.f271199a = nVar;
    }

    public final void run() {
        C22871g gVar;
        C97063n nVar = this.f271199a;
        if (nVar.mo90426g()) {
            long j = nVar.f271214m;
            nVar.f271214m = 1 + j;
            C97061l d = C97061l.m160649d(j, new C72296t(), nVar.f271211j);
            C22871g gVar2 = nVar.f271204c;
            C60870cx a = nVar.f271206e.mo90399a(nVar.f271211j);
            C97032g gVar3 = nVar.f271208g;
            Objects.requireNonNull(gVar3);
            C60870cx i = gVar2.mo28209i(a, "SendFetchRequest", new C97055f(gVar3));
            C97043f fVar = nVar.f271205d;
            if (fVar.mo90406b()) {
                gVar = fVar.f271168b;
            } else {
                gVar = fVar.f271167a;
            }
            C90873ag agVar = new C90873ag(i, gVar, "HandleFetchResponse", new C97056g(nVar, d));
            agVar.mo85225c(CancellationException.class, C97057h.f271196a);
            C97029d dVar = nVar.f271213l;
            Objects.requireNonNull(dVar);
            agVar.mo85223a(new C97058i(dVar));
        }
    }
}

package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import androidx.work.C4381ae;
import androidx.work.C4410f;
import androidx.work.C4634o;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.bv */
/* compiled from: PG */
public final /* synthetic */ class C138447bv implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138454cb f376604a;

    public /* synthetic */ C138447bv(C138454cb cbVar) {
        this.f376604a = cbVar;
    }

    public final Object apply(Object obj) {
        C138454cb cbVar = this.f376604a;
        C46573g gVar = new C46573g(((Duration) obj).toMinutes(), TimeUnit.MINUTES);
        C46582p j = C46586t.m83063j(C138454cb.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("com.google.android.libraries.search.suggest.sources.completeserver.CompleteServerZeroPrefixWorker", C4634o.REPLACE));
        dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(gVar));
        dVar.f121754c = gVar;
        if (cbVar.f376612c.getRestrictBackgroundStatus() == 3) {
            C4410f fVar = new C4410f();
            fVar.mo9351c(C4381ae.UNMETERED);
            dVar.f121753b = fVar.mo9349a();
        }
        return j.mo50561a();
    }
}

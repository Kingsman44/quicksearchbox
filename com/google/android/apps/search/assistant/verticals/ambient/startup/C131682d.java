package com.google.android.apps.search.assistant.verticals.ambient.startup;

import androidx.work.C4634o;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130890ac;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.experiments.phenotype.C47064r;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.startup.d */
/* compiled from: PG */
final class C131682d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C131683e f359782a;

    public C131682d(C131683e eVar) {
        this.f359782a = eVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C131683e.f359783a.mo56226d()).mo56372aa(39179)).mo56386p("Failed to update Smartspace flags");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        ((C59052c) ((C59052c) C131683e.f359783a.mo56224b()).mo56372aa(39180)).mo56389s("Successfully loaded Smartspace flags. Applied %b", Boolean.valueOf(((C47064r) obj).f122655a));
        C131683e eVar = this.f359782a;
        if (!eVar.f359784b.mo110135j()) {
            ((C59052c) ((C59052c) C131683e.f359783a.mo56224b()).mo56372aa(39181)).mo56386p("Not eligible for settings logging. Skipping task enqueuing and cancelling any preexisting work.");
            C46459k.m82829b(((C46578l) eVar.f359785c.mo17428b()).mo50545a("com.google.android.apps.search.assistant.verticals.ambient.logger.AmbientLoggerWorker"), "Failed to cancel AmbientLoggerWorker", new Object[0]);
            return;
        }
        C46582p j = C46586t.m83063j(C130890ac.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("com.google.android.apps.search.assistant.verticals.ambient.logger.AmbientLoggerWorker", C4634o.UPDATE));
        dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g(1, TimeUnit.DAYS)));
        C46459k.m82829b(((C46578l) eVar.f359785c.mo17428b()).mo50546b(j.mo50561a()), "Failed to schedule AmbientLoggerWorker.", new Object[0]);
    }
}

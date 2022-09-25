package com.google.android.apps.gsa.search.core.service.p6852g.p6853a;

import com.google.android.apps.gsa.search.core.service.p6845b.C86633b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6856h.C86744b;
import com.google.android.apps.gsa.search.core.service.p6859i.p6860a.C86750a;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.a.f */
/* compiled from: PG */
final class C86708f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f234209a;

    /* renamed from: b */
    final /* synthetic */ C86710h f234210b;

    public C86708f(C86710h hVar, String str) {
        this.f234210b = hVar;
        this.f234209a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f234210b.f234222h.remove(this.f234209a);
        C86710h hVar = this.f234210b;
        String str = this.f234209a;
        if (th instanceof C86750a) {
            C59104x d = C86710h.f234215a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "WorkController");
            ((C59052c) ((C59052c) d).mo56372aa(8506)).mo56389s("Loading failed for worker [%s]: worker not found", str);
        } else if (th instanceof C86633b) {
            C59104x b = C86710h.f234215a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WorkController");
            ((C59052c) ((C59052c) b).mo56372aa(8505)).mo56389s("Worker [%s] was not acquired because WorkerManager is disposed", str);
        } else {
            C59104x c = C86710h.f234215a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WorkController");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(8504)).mo56389s("Loading failed for worker [%s]", str);
        }
        C86712j jVar = hVar.f234216b;
        C58480gp e = C58485gu.m89837e();
        for (C86731k kVar : Collections.unmodifiableCollection(jVar.f234235b.f234202b)) {
            if (kVar.mo80347i().equals(str) && jVar.mo80319c(kVar)) {
                e.mo55395g(kVar);
            }
        }
        C58485gu f = e.mo55394f();
        int i = ((C58724pq) f).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            ((C86731k) f.get(i2)).mo57357o(th);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C86744b bVar = (C86744b) obj;
        this.f234210b.f234222h.remove(this.f234209a);
        C86710h hVar = this.f234210b;
        String ia = bVar.mo80349ia();
        hVar.mo80314e("Perform work for worker [" + ia + "]", new C86707e(hVar, bVar));
    }
}

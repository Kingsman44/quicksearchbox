package com.google.android.apps.gsa.search.core.service.p6859i.p6861b.p6862a.p6863a;

import com.google.android.apps.gsa.search.core.service.p6859i.p6861b.C86751a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.search.core.service.i.b.a.a.h */
/* compiled from: PG */
public final class C86760h implements C86755c {

    /* renamed from: c */
    private static final C59071e f234339c = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.i.b.a.a.h");

    /* renamed from: a */
    public final String f234340a;

    /* renamed from: b */
    public final C68214a f234341b;

    /* renamed from: d */
    private final C60870cx f234342d;

    /* renamed from: e */
    private final C68214a f234343e;

    /* renamed from: f */
    private boolean f234344f;

    public C86760h(String str, C60870cx cxVar, C68214a aVar, C68214a aVar2) {
        this.f234340a = str;
        this.f234342d = cxVar;
        this.f234341b = aVar;
        this.f234343e = aVar2;
    }

    /* renamed from: a */
    public final void mo80257a() {
        if (!this.f234344f) {
            this.f234344f = true;
        }
    }

    /* renamed from: b */
    public final C86754b mo80372b() {
        C58838bb.m90884s(!this.f234344f, "acquireWorker() called after disposal");
        C60870cx h = C60922j.m93045h(this.f234342d, new C86759g(this), C60826bg.f164896a);
        C86758f fVar = (C86758f) this.f234343e.mo27525b();
        String str = this.f234340a;
        str.getClass();
        C68214a a = C68219e.m98518a(((C68226l) fVar.f234335a).f184585a);
        a.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) fVar.f234336b).f184585a);
        a2.getClass();
        C86751a aVar = (C86751a) fVar.f234337c.mo17428b();
        aVar.getClass();
        return new C86757e(str, h, a, a2, aVar).mo80372b();
    }

    /* renamed from: c */
    public final C86755c mo80373c() {
        C58838bb.m90884s(!this.f234344f, "unloadWorkerIfDisused() called after disposal");
        return this;
    }

    /* renamed from: e */
    public final void mo80374e() {
        ((C59052c) ((C59052c) f234339c.mo56225c()).mo56372aa(8561)).mo56389s("Attempt to release a not loaded worker [%s]", this.f234340a);
        throw new AssertionError();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("WorkerNotLoaded");
        fVar.mo85279c("unloading future").mo85276a(C90752i.m148229c(C90877ak.m148476j(this.f234342d)));
    }
}

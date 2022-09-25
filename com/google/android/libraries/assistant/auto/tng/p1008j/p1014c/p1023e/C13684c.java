package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1023e;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13703p;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13707t;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1021c.p1022a.C13669b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.android.concurrent.C58301z;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.e.c */
/* compiled from: PG */
public final class C13684c {

    /* renamed from: a */
    public static final C59071e f41754a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.j.c.e.c");

    /* renamed from: b */
    public final C13703p f41755b;

    /* renamed from: c */
    public final C60870cx f41756c;

    /* renamed from: d */
    public final C21370a f41757d;

    /* renamed from: e */
    public final AtomicBoolean f41758e = new AtomicBoolean(false);

    /* renamed from: f */
    public long f41759f;

    /* renamed from: g */
    public C2164c f41760g;

    /* renamed from: h */
    public C13669b f41761h;

    /* renamed from: i */
    private final C60888db f41762i;

    /* renamed from: j */
    private C60870cx f41763j;

    /* renamed from: k */
    private final C13685d f41764k;

    public C13684c(C21370a aVar, C60888db dbVar, C13669b bVar, C13685d dVar, C13703p pVar) {
        this.f41757d = aVar;
        this.f41759f = aVar.mo26871c();
        this.f41761h = bVar;
        this.f41764k = dVar;
        this.f41755b = pVar;
        this.f41762i = dbVar;
        this.f41756c = C2169h.m6027a(new C13683b(this));
        if (bVar != null) {
            mo21220c(bVar);
        }
    }

    /* renamed from: a */
    public final void mo21218a() {
        C60870cx cxVar = this.f41763j;
        if (cxVar != null && !(((C60873d) cxVar).value instanceof C60873d.C60875b) && !this.f41763j.isDone()) {
            this.f41763j.cancel(false);
        }
    }

    /* renamed from: b */
    public final void mo21219b(C13707t tVar) {
        C59104x b = f41754a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "UAARequestCompleter");
        ((C59052c) ((C59052c) b).mo56372aa(44947)).mo56386p("#fulfill");
        C2164c cVar = this.f41760g;
        cVar.getClass();
        cVar.mo5437b(tVar);
        C13685d dVar = this.f41764k;
        dVar.f41765a.f41769b.remove(this.f41755b.f41799e);
        mo21218a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo21220c(C13669b bVar) {
        C59104x b = f41754a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "UAARequestCompleter");
        ((C59052c) ((C59052c) b).mo56372aa(44952)).mo56386p("#registerDataSenderAndSchedule");
        if (this.f41758e.compareAndSet(false, true)) {
            this.f41761h = bVar;
            this.f41759f = this.f41757d.mo26871c();
            this.f41763j = C58301z.m89281a(new C13682a(this), 0, 2000, TimeUnit.MILLISECONDS, this.f41757d, this.f41762i);
        }
    }
}

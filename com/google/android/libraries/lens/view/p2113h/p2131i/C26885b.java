package com.google.android.libraries.lens.view.p2113h.p2131i;

import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.h.i.b */
/* compiled from: PG */
public final class C26885b {

    /* renamed from: a */
    public static final Duration f73292a = Duration.ofSeconds(2);

    /* renamed from: b */
    public final C25758g f73293b = new C25758g(false);

    /* renamed from: c */
    public final C60888db f73294c;

    /* renamed from: d */
    public final C69464a f73295d;

    /* renamed from: e */
    public final C37215b f73296e;

    /* renamed from: f */
    public C60870cx f73297f;

    public C26885b(C37215b bVar, C60888db dbVar, C69464a aVar) {
        this.f73294c = dbVar;
        this.f73295d = aVar;
        this.f73296e = bVar;
    }

    /* renamed from: a */
    public final void mo32257a() {
        C60870cx cxVar = this.f73297f;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f73297f = null;
        }
    }

    /* renamed from: b */
    public final void mo32258b(boolean z) {
        if (((Boolean) this.f73293b.mo3842a()).booleanValue() != z) {
            this.f73293b.mo5708l(Boolean.valueOf(z));
        }
    }
}

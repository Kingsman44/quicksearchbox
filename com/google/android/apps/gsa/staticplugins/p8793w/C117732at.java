package com.google.android.apps.gsa.staticplugins.p8793w;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.at */
/* compiled from: PG */
public final class C117732at {

    /* renamed from: a */
    public static final C59071e f326791a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.w.at");

    /* renamed from: b */
    public final String f326792b;

    /* renamed from: c */
    public final C22869e f326793c;

    /* renamed from: d */
    public C60870cx f326794d;

    /* renamed from: e */
    public final C118831d f326795e;

    /* renamed from: f */
    private final C22871g f326796f;

    public C117732at(String str, C118569b bVar, C22869e eVar, C22871g gVar, C118827a aVar) {
        this.f326792b = str;
        this.f326793c = eVar;
        this.f326796f = gVar;
        this.f326795e = bVar == null ? null : aVar.mo77944g(bVar, C118575h.GRAPH_CAR_ASSISTANT);
    }

    /* renamed from: a */
    public final void mo103444a() {
        if (this.f326794d != null) {
            C58976aa aaVar = C58975e.f156826a;
            C60870cx cxVar = this.f326794d;
            cxVar.getClass();
            cxVar.cancel(false);
            this.f326794d = null;
        }
    }

    /* renamed from: b */
    public final void mo103445b(int i) {
        mo103444a();
        if (i > 0) {
            C58976aa aaVar = C58975e.f156826a;
            this.f326794d = this.f326796f.mo28208h(this.f326792b, (long) i, new C117731as(this));
        }
    }
}

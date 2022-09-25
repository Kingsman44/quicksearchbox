package com.google.android.apps.gsa.staticplugins.p8832y;

import com.google.android.apps.gsa.binaries.satin.app.alt;
import com.google.android.apps.gsa.binaries.satin.app.alv;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6763v.C85605a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.customtabs.C98585aj;
import com.google.android.apps.gsa.staticplugins.p8832y.p8833a.C118277b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.y.b */
/* compiled from: PG */
public final class C118289b extends C86734a implements C85605a {

    /* renamed from: a */
    public final C91097g f328362a;

    /* renamed from: b */
    public final C98585aj f328363b;

    /* renamed from: c */
    private final C118277b f328364c;

    /* renamed from: f */
    private final C22871g f328365f;

    public C118289b(C118277b bVar, C91097g gVar, C22871g gVar2, C98585aj ajVar) {
        super(C118575h.WORKER_CHROME_EXPERIMENT, "chromeexperiment");
        this.f328364c = bVar;
        this.f328362a = gVar;
        this.f328365f = gVar2;
        this.f328363b = ajVar;
    }

    /* renamed from: a */
    public final C60870cx mo79092a(Query query) {
        boolean z = false;
        if (query.mo84339bX() && query.mo84392cY()) {
            z = true;
        }
        C58838bb.m90868c(z);
        C22871g gVar = this.f328365f;
        C118277b bVar = this.f328364c;
        alt alt = bVar.f328342a;
        alt.f197688c = bVar.f328343b.mo78026b("SearchUriGenerator", C118575h.GRAPH_CHROME_EXPERIMENT_URI_GENERATOR, C118575h.WORKER_CHROME_EXPERIMENT);
        alt.f197687b = C60856cj.m92900i(query);
        C68225k.m98529a(alt.f197687b, C60870cx.class);
        C68225k.m98529a(alt.f197688c, C89356b.class);
        return gVar.mo28209i(new alv(alt.f197686a, alt.f197687b, alt.f197688c).b.mo60297gq(), "Launch Chrome intent", new C118275a(this));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}

package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.aw */
/* compiled from: PG */
public final /* synthetic */ class C112478aw implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112519cj f312000a;

    /* renamed from: b */
    public final /* synthetic */ C48634bw f312001b;

    public /* synthetic */ C112478aw(C112519cj cjVar, C48634bw bwVar) {
        this.f312000a = cjVar;
        this.f312001b = bwVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C112519cj cjVar = this.f312000a;
        C48634bw bwVar = this.f312001b;
        Boolean bool = (Boolean) obj;
        C121537f fVar = C112519cj.f312068a;
        String name = bwVar.name();
        C112518ci ciVar = (C112518ci) fVar.mo105237f("fetchData_".concat(String.valueOf(name)), cjVar.f312073f, new C112493bk(cjVar, bwVar));
        if (ciVar == null) {
            return C60856cj.m92900i(C48635bx.f125704d);
        }
        if (ciVar.mo99561c()) {
            C60870cx cxVar = ciVar.f312064d;
            if (cxVar == null) {
                return C60856cj.m92900i(C48635bx.f125704d);
            }
            return cxVar;
        } else if (ciVar.mo99562d(cjVar.f312076i.mo26870b())) {
            return C60856cj.m92900i(C48635bx.f125704d);
        } else {
            return C60856cj.m92900i(ciVar.f312063c);
        }
    }
}

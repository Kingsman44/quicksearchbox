package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113263ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113284bi;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113286bk;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54813af;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.s */
/* compiled from: PG */
public final /* synthetic */ class C111415s implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111419w f309976a;

    /* renamed from: b */
    public final /* synthetic */ C111418v f309977b;

    public /* synthetic */ C111415s(C111419w wVar, C111418v vVar) {
        this.f309976a = wVar;
        this.f309977b = vVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111419w wVar = this.f309976a;
        C111418v vVar = this.f309977b;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            vVar.mo99130c();
            return Optional.empty();
        }
        Optional k = wVar.f309984e.mo99852k(vVar.mo99130c());
        if (k.isEmpty()) {
            return Optional.empty();
        }
        C113263ap apVar = new C113263ap();
        apVar.f313630b = Optional.m71637of(vVar.mo99129b());
        apVar.f313629a = Optional.m71637of((C113286bk) k.get());
        C113284bi a = apVar.mo99958a();
        String obj2 = ((CharSequence) optional.get()).toString();
        C113414ey q = wVar.mo100187q();
        q.mo100164i(obj2);
        q.mo100174s(vVar.mo99128a());
        q.mo100168m(a);
        q.mo100167l(20010);
        q.mo100180y(20010);
        q.mo100177v(C48580an.ICON_SHORTCUT);
        q.mo100169n(C54813af.APPS);
        q.mo100173r(wVar.f309988i.mo99841a(obj2, vVar.mo99130c()));
        return Optional.m71637of(q.mo100156a());
    }
}

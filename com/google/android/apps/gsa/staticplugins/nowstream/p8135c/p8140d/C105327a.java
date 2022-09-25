package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8140d;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90994c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90997f;
import com.google.android.apps.gsa.shared.util.p7159c.C90930c;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91395g;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91397i;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105445o;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58570jy;
import com.google.p375ai.p378b.C7744ii;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.d.a */
/* compiled from: PG */
public final class C105327a implements C91007g {

    /* renamed from: a */
    public final C105445o f293894a;

    /* renamed from: b */
    public C91396h f293895b;

    /* renamed from: c */
    public C91395g f293896c;

    /* renamed from: d */
    private final C90994c f293897d;

    /* renamed from: e */
    private final C86124t f293898e;

    public C105327a(C105445o oVar, C21370a aVar, C86124t tVar) {
        new C90930c();
        this.f293894a = oVar;
        C7744ii iiVar = C7744ii.f27054p;
        this.f293895b = C91396h.m149472e(C91397i.m149477e(iiVar), iiVar, false);
        this.f293897d = new C90994c(aVar, 10);
        this.f293898e = tVar;
    }

    /* renamed from: a */
    public static List m174973a(Iterator it) {
        ArrayList arrayList = new ArrayList();
        C58570jy.m90163o(arrayList, it);
        return arrayList;
    }

    /* renamed from: b */
    public final void mo94725b(String str) {
        this.f293897d.mo85270f(str, C90996e.f254198a);
    }

    /* renamed from: c */
    public final void mo94726c(C91396h hVar) {
        mo94725b("updated entry tree data");
        this.f293895b = hVar;
    }

    /* renamed from: e */
    public final boolean mo94727e() {
        return !((Boolean) ((C23251a) this.f293894a.mo94617b()).f63720e).booleanValue() && !((Boolean) this.f293894a.mo94623h().f63720e).booleanValue();
    }

    /* renamed from: f */
    public final void mo94728f() {
        this.f293898e.mo79746e(C90010bp.f246926V);
    }

    /* renamed from: g */
    public final void mo94729g() {
        C91395g gVar = this.f293896c;
        if (gVar != null) {
            gVar.hasNext();
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        this.f293897d.mo85271g(fVar, "cursor events", (C90997f) null, false);
    }
}

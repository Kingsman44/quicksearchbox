package com.google.android.apps.gsa.staticplugins.p7780de.p7782b;

import android.graphics.Rect;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6899i.C87347a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.C90254a;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a.C97319ad;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a.C97322ag;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.b.aq */
/* compiled from: PG */
final class C99400aq implements C87347a {

    /* renamed from: a */
    public final Set f278075a = new HashSet();

    /* renamed from: b */
    final /* synthetic */ C99403at f278076b;

    /* renamed from: c */
    public C97322ag f278077c;

    public C99400aq(C99403at atVar) {
        this.f278076b = atVar;
    }

    /* renamed from: a */
    public final void mo80998a() {
        if (!this.f278076b.f63405W.mo28420E()) {
            if (((C23186f) this.f278076b.f278110e.mo91436b()).mo28631l()) {
                ((C23186f) this.f278076b.f278110e.mo91436b()).mo28627h();
            }
            this.f278077c = null;
        }
    }

    /* renamed from: b */
    public final void mo80999b(String str, Rect rect) {
        if (!this.f278076b.f63405W.mo28420E() && !this.f278076b.mo91433u()) {
            int intValue = ((Integer) ((C23251a) this.f278076b.f278110e.mo91444j()).f63720e).intValue();
            if (intValue == 1 || intValue == 5) {
                C90208n nVar = (C90208n) ((C58833ax) ((C23251a) this.f278076b.f278110e.mo91441g()).f63720e).mo56107c();
                if ((nVar == C90208n.INTERESTS_TAB || nVar == C90208n.SEARCH_TAB) && rect.top >= 0 && !((C23186f) this.f278076b.f278110e.mo91437c()).mo28631l()) {
                    if (!((C23186f) this.f278076b.f278110e.mo91436b()).mo28631l()) {
                        ((C23186f) this.f278076b.f278110e.mo91436b()).mo28623d(C90254a.f252114d, ProtoParcelable.f63423a);
                    }
                    ((C23186f) this.f278076b.f278110e.mo91436b()).mo28626g(new C99398ao(this, str, rect));
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo81000c() {
        C97322ag agVar;
        if (this.f278076b.f63405W.mo28420E() || (agVar = this.f278077c) == null) {
            return false;
        }
        return agVar.mo90659f();
    }

    /* renamed from: d */
    public final void mo81001d(C97319ad adVar, C23052c cVar) {
        if (this.f278075a.add(adVar)) {
            cVar.mo28427o(new C99399ap(this, cVar, adVar));
        }
    }
}

package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6899i.C87347a;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97353e;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97356h;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.a.ag */
/* compiled from: PG */
public final class C97322ag extends C23056g implements C97353e {

    /* renamed from: a */
    public final C97356h f271844a;

    /* renamed from: b */
    public final C87347a f271845b;

    /* renamed from: c */
    public Set f271846c;

    public C97322ag(C23052c cVar, C97356h hVar, C87347a aVar) {
        super(cVar);
        this.f271844a = hVar;
        this.f271845b = aVar;
    }

    /* renamed from: e */
    public final void mo90658e() {
        throw null;
    }

    /* renamed from: f */
    public final boolean mo90659f() {
        return ((Boolean) ((C97324b) this.f271844a).f271848b.f63720e).booleanValue();
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        Set<C97319ad> set;
        C58976aa aaVar = C58975e.f156826a;
        if (mo90659f() && (set = this.f271846c) != null) {
            for (C97319ad b : set) {
                b.mo90642b();
            }
        }
    }
}

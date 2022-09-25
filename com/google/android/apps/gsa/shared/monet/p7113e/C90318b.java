package com.google.android.apps.gsa.shared.monet.p7113e;

import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.monet.e.b */
/* compiled from: PG */
public final class C90318b {

    /* renamed from: a */
    public final C23084ao f252245a;

    /* renamed from: b */
    public final Set f252246b = new HashSet();

    public C90318b(C23084ao aoVar) {
        this.f252245a = aoVar;
    }

    /* renamed from: a */
    public final C90317a mo83998a(C22945j jVar) {
        this.f252245a.mo28328a();
        C90317a aVar = new C90317a(jVar);
        this.f252246b.add(aVar);
        C58976aa aaVar = C58975e.f156826a;
        return aVar;
    }

    /* renamed from: b */
    public final void mo83999b(C90317a aVar) {
        this.f252245a.mo28328a();
        C58838bb.m90887v(this.f252246b.remove(aVar), "Unlock called with invalid lock: %s", aVar.toString());
        C58976aa aaVar = C58975e.f156826a;
    }
}

package com.google.android.apps.gsa.shared.monet.p7113e;

import com.google.android.libraries.gsa.monet.shared.C23084ao;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.monet.e.c */
/* compiled from: PG */
public final class C90319c implements C90320d {

    /* renamed from: a */
    public final C23084ao f252247a;

    /* renamed from: b */
    public final Set f252248b = new HashSet();

    /* renamed from: c */
    public boolean f252249c;

    public C90319c(C23084ao aoVar) {
        this.f252247a = aoVar;
    }

    /* renamed from: a */
    public final void mo84000a(C90321e eVar) {
        this.f252247a.mo28328a();
        this.f252248b.add(eVar);
        if (this.f252249c) {
            eVar.mo84002a();
        }
    }

    /* renamed from: b */
    public final void mo84001b(C90321e eVar) {
        this.f252247a.mo28328a();
        this.f252248b.remove(eVar);
    }
}

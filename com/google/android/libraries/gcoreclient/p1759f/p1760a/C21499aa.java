package com.google.android.libraries.gcoreclient.p1759f.p1760a;

import com.google.android.apps.gsa.staticplugins.p7371ae.C93724aj;
import com.google.android.apps.gsa.staticplugins.p7371ae.C93725ak;
import com.google.android.gms.contextmanager.C144030d;
import com.google.android.gms.contextmanager.ContextData;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.f.a.aa */
/* compiled from: PG */
public final class C21499aa extends C144030d {

    /* renamed from: a */
    private final C93725ak f59921a;

    public C21499aa(C93725ak akVar) {
        this.f59921a = akVar;
    }

    /* renamed from: a */
    public final void mo22588a(ContextData contextData) {
        C93725ak akVar = this.f59921a;
        akVar.f261563a.mo84765i(new C93724aj(akVar, new C21515q(contextData)), "onReceive");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21499aa)) {
            return false;
        }
        return this.f59921a.equals(((C21499aa) obj).f59921a);
    }

    public final int hashCode() {
        return this.f59921a.hashCode();
    }
}

package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.core.C42264aq;
import com.google.android.libraries.social.populous.p3296e.C42385a;
import com.google.android.libraries.social.populous.p3296e.C42448c;
import com.google.android.libraries.social.populous.p3296e.C42500d;
import com.google.android.libraries.social.populous.p3296e.C42511e;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.social.populous.ac */
/* compiled from: PG */
final class C42149ac implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C42549n f110395a;

    /* renamed from: b */
    final /* synthetic */ AutocompleteSession f110396b;

    public C42149ac(AutocompleteSession autocompleteSession, C42549n nVar) {
        this.f110396b = autocompleteSession;
        this.f110395a = nVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        AutocompleteSession autocompleteSession = this.f110396b;
        C42448c m = C42500d.m74917m();
        C42549n nVar = this.f110395a;
        if (nVar != null) {
            C42385a aVar = (C42385a) m;
            aVar.f111158d = nVar;
            aVar.f111155a = C58485gu.m89842j(C58485gu.m89845m());
            aVar.f111157c = C42264aq.m74421c(1, 16);
            m.mo45366b(0);
            m.mo45367c(true);
            m.mo45369e(0);
            autocompleteSession.mo44818g(m.mo45365a());
            return;
        }
        throw new NullPointerException("Null queryState");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        ((C42511e) obj).mo45523a(this.f110395a);
    }
}

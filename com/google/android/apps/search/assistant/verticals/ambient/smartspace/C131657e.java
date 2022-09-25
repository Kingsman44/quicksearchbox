package com.google.android.apps.search.assistant.verticals.ambient.smartspace;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import java.util.HashSet;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.e */
/* compiled from: PG */
public final class C131657e implements C131650d {

    /* renamed from: b */
    private final HashSet f359731b = new HashSet();

    /* renamed from: a */
    public final void mo110242a(C31164au auVar) {
        C31167ax.m58112a().mo36914e(auVar);
        this.f359731b.add(auVar);
    }

    /* renamed from: b */
    public final void mo110243b(C31164au auVar) {
        mo110244c(auVar, 1);
    }

    /* renamed from: c */
    public final void mo110244c(C31164au auVar, int i) {
        if (this.f359731b.contains(auVar)) {
            C31167ax.m58112a().f84035a.mo36911p(auVar, i);
            this.f359731b.remove(auVar);
        }
    }
}

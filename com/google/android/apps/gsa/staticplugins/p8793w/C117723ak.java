package com.google.android.apps.gsa.staticplugins.p8793w;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87726bh;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.ak */
/* compiled from: PG */
final class C117723ak {

    /* renamed from: a */
    public C87726bh f326724a = C87726bh.IDLE;

    /* renamed from: b */
    final Set f326725b = new HashSet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo103435a(C117722aj ajVar) {
        this.f326725b.add(ajVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo103436b(C87726bh bhVar) {
        C87726bh bhVar2 = this.f326724a;
        this.f326724a = bhVar;
        if (bhVar2 != bhVar) {
            for (C117722aj a : this.f326725b) {
                a.mo103434a(bhVar);
            }
        }
    }
}

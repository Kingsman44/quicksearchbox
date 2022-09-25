package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.k */
/* compiled from: PG */
public final class C98444k {

    /* renamed from: a */
    final /* synthetic */ C98446m f274832a;

    /* renamed from: b */
    private final String f274833b;

    /* renamed from: c */
    private final Set f274834c = new HashSet();

    /* renamed from: d */
    private boolean f274835d;

    public C98444k(C98446m mVar, String str) {
        this.f274832a = mVar;
        this.f274833b = str;
    }

    /* renamed from: a */
    public final void mo91112a(C98400bu buVar) {
        synchronized (this.f274832a.f274846d) {
            C58838bb.m90884s(!this.f274835d, "Cannot add after the batch has been sent");
            C58976aa aaVar = C58975e.f156826a;
            this.f274834c.add(buVar);
        }
    }

    /* renamed from: b */
    public final void mo91113b() {
        synchronized (this.f274832a.f274846d) {
            C58838bb.m90884s(!this.f274835d, "Request batch can be sent only once");
            this.f274832a.mo91117c();
            C58976aa aaVar = C58975e.f156826a;
            if (!this.f274834c.isEmpty()) {
                C98446m mVar = this.f274832a;
                mVar.mo91121j(mVar.mo91116b());
                for (C98400bu h : this.f274834c) {
                    this.f274832a.mo91119h(h);
                }
                this.f274834c.clear();
                this.f274832a.mo91072l();
            }
            this.f274835d = true;
        }
    }

    public final String toString() {
        return String.format(Locale.US, "RequestBatch[%s]", new Object[]{this.f274833b});
    }
}

package com.google.android.apps.gsa.nga.shared.p6417x;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.nga.shared.x.m */
/* compiled from: PG */
public final class C83363m {

    /* renamed from: a */
    private static final C58974d f227204a = C58974d.m91136j();

    /* renamed from: b */
    private final Object f227205b = new Object();

    /* renamed from: c */
    private final Queue f227206c = new ArrayDeque();

    /* renamed from: a */
    public final void mo76661a() {
        synchronized (this.f227205b) {
            if (this.f227206c.isEmpty()) {
                ((C58970a) ((C58970a) f227204a.mo56226d()).mo56372aa(6115)).mo56386p("Disposing empty manager. Did you forgot to subscribe observables?");
            }
            while (!this.f227206c.isEmpty()) {
                C83362l lVar = (C83362l) this.f227206c.remove();
                lVar.f227202a.mo76659e(lVar.f227203b);
            }
        }
    }

    /* renamed from: b */
    public final void mo76662b(C83358h hVar, C90919bp bpVar) {
        synchronized (this.f227205b) {
            hVar.mo76658d(bpVar);
            this.f227206c.add(new C83362l(hVar, bpVar));
        }
    }

    /* renamed from: c */
    public final void mo76663c(C83358h hVar, C90919bp bpVar) {
        synchronized (this.f227205b) {
            C83349aj.m132649d(hVar, bpVar);
            this.f227206c.add(new C83362l(hVar, bpVar));
        }
    }
}

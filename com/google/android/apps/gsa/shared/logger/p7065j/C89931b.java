package com.google.android.apps.gsa.shared.logger.p7065j;

import android.view.ViewGroup;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.logger.j.b */
/* compiled from: PG */
public final class C89931b implements Runnable {

    /* renamed from: a */
    private int f246385a;

    /* renamed from: b */
    private int f246386b = 0;

    /* renamed from: c */
    private C89932c f246387c;

    /* renamed from: d */
    private ViewGroup f246388d;

    /* renamed from: e */
    private C89933d f246389e;

    /* renamed from: c */
    private final void m146481c() {
        if (this.f246385a == 0) {
            int i = this.f246386b;
            if (i == 1) {
                this.f246387c.mo83776f(this.f246388d, this.f246389e);
                this.f246386b = 3;
            } else if (i == 2) {
                this.f246387c.mo83775e(this.f246388d);
                this.f246386b = 3;
            } else {
                C59104x d = C89932c.f246390a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ActionCardEventLogger");
                ((C59052c) ((C59052c) d).mo56372aa(10711)).mo56387q("Invalid logging mode %d", this.f246386b);
            }
        }
    }

    /* renamed from: a */
    public final void mo83769a(C89932c cVar, ViewGroup viewGroup, C89933d dVar) {
        C58838bb.m90883r(this.f246386b == 0);
        this.f246386b = 1;
        this.f246387c = cVar;
        this.f246389e = dVar;
        this.f246388d = viewGroup;
        m146481c();
    }

    /* renamed from: b */
    public final void mo83770b() {
        this.f246385a++;
    }

    public final void run() {
        this.f246385a--;
        m146481c();
    }
}

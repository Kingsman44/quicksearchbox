package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.b.q */
/* compiled from: PG */
public class C121509q implements AutoCloseable {

    /* renamed from: d */
    final C121509q f337198d;

    /* renamed from: e */
    final List f337199e = new ArrayList();

    /* renamed from: f */
    final C58485gu f337200f;

    /* renamed from: g */
    final C121501i f337201g;

    /* renamed from: h */
    boolean f337202h;

    protected C121509q(C121509q qVar, C121501i iVar) {
        this.f337198d = qVar;
        if (qVar != null) {
            qVar.f337199e.add(this);
            C58480gp f = C58485gu.m89838f(((C58724pq) qVar.f337200f).f156474d + 1);
            f.mo55396h(qVar.f337200f);
            f.mo55395g(iVar);
            this.f337200f = f.mo55394f();
        } else {
            this.f337200f = C58485gu.m89846n(iVar);
        }
        this.f337201g = iVar;
        this.f337202h = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo105206a() {
    }

    public final void close() {
        if (!this.f337202h) {
            for (C121509q qVar : this.f337199e) {
                if (!qVar.f337202h) {
                    ((C59052c) ((C59052c) C121510r.f337203a.mo56226d()).mo56372aa(35846)).mo56359L("Monitoring span %s not closed before %s in context %s", qVar.f337201g, this.f337201g, this.f337200f);
                    qVar.close();
                }
            }
            this.f337199e.clear();
            if (this.f337198d != null) {
                C121510r.f337204b.set(this.f337198d);
            } else {
                C121510r.f337204b.remove();
            }
            this.f337202h = true;
            mo105206a();
        }
    }
}

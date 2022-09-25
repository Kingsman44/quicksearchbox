package com.google.android.libraries.gsa.monet.shared;

import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1893c.C23095a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.gsa.monet.shared.ai */
/* compiled from: PG */
public class C23078ai {

    /* renamed from: a */
    public final C23129y f63427a;

    /* renamed from: b */
    protected final Set f63428b;

    /* renamed from: c */
    public boolean f63429c;

    /* renamed from: d */
    private boolean f63430d = false;

    protected C23078ai(C23129y yVar) {
        this.f63427a = yVar;
        this.f63428b = new HashSet();
    }

    /* renamed from: a */
    public static C23078ai m43249a(C23078ai aiVar, C23075af afVar, String str) {
        C23078ai h = afVar.mo28339h(str);
        if (aiVar != null) {
            afVar.mo28344p(aiVar);
            aiVar.mo28526c();
        }
        return h;
    }

    /* renamed from: b */
    public final void mo28525b(C23077ah ahVar) {
        if (mo28527d()) {
            C23095a.m43281d("ScopeLockLoaderTask", "Task is already closed", new Object[0]);
        } else if (this.f63429c) {
            ahVar.mo28367a();
        } else {
            this.f63428b.add(ahVar);
        }
    }

    /* renamed from: c */
    public final void mo28526c() {
        if (mo28527d()) {
            C23095a.m43281d("ScopeLockLoaderTask", "Task is already closed", new Object[0]);
            return;
        }
        this.f63428b.clear();
        this.f63430d = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo28527d() {
        if (this.f63430d) {
            C23067b.m43233f(this.f63428b.isEmpty(), "Task must have no listeners once it's closed");
        }
        return this.f63430d;
    }
}

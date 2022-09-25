package com.google.android.libraries.gsa.monet.tools.children.p1913b;

import android.support.p033v7.widget.C0673gh;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.b.ah */
/* compiled from: PG */
public final class C23203ah implements C23208e {

    /* renamed from: a */
    public final List f63626a = new ArrayList();

    /* renamed from: b */
    public C23207d f63627b;

    public C23203ah(C23209f... fVarArr) {
        for (C23209f a : fVarArr) {
            mo28668g(this.f63626a.size(), a.mo28655a());
        }
    }

    /* renamed from: i */
    private final Object m43448i(int i, C23202ag agVar) {
        int i2 = 0;
        for (C23208e eVar : this.f63626a) {
            int a = eVar.mo28662a() + i2;
            if (a > i) {
                return agVar.mo28658a(eVar, i - i2);
            }
            i2 = a;
        }
        throw new IllegalArgumentException(String.format("The requested index %d is not currently in scope. Size: %d.", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: a */
    public final int mo28662a() {
        int i = 0;
        for (C23208e a : this.f63626a) {
            i += a.mo28662a();
        }
        return i;
    }

    /* renamed from: b */
    public final C23129y mo28663b(int i) {
        return (C23129y) m43448i(i, C23200ae.f63623a);
    }

    /* renamed from: c */
    public final void mo28664c(C0673gh ghVar, int i) {
        m43448i(i, new C23199ad(ghVar));
    }

    /* renamed from: d */
    public final void mo28665d() {
        this.f63627b = null;
    }

    /* renamed from: e */
    public final void mo28666e(C23207d dVar) {
        C23067b.m43233f(this.f63627b == null, "Listener already set.");
        this.f63627b = dVar;
        for (C23208e eVar : this.f63626a) {
            eVar.mo28666e(new C23201af(this, eVar));
        }
    }

    /* renamed from: f */
    public final int mo28667f(C23208e eVar) {
        int i = 0;
        for (C23208e eVar2 : this.f63626a) {
            if (eVar.equals(eVar2)) {
                return i;
            }
            i += eVar2.mo28662a();
        }
        throw new NoSuchElementException("The target tracker has not been added.");
    }

    /* renamed from: g */
    public final void mo28668g(int i, C23208e eVar) {
        this.f63626a.add(i, eVar);
        if (this.f63627b != null) {
            eVar.mo28666e(new C23201af(this, eVar));
        }
    }

    /* renamed from: h */
    public final void mo28669h(int i) {
        C23067b.m43235h(i, this.f63626a.size());
        C23208e eVar = (C23208e) this.f63626a.get(i);
        C23207d dVar = this.f63627b;
        if (dVar != null) {
            dVar.mo28660b(mo28667f(eVar), eVar.mo28662a());
        }
        eVar.mo28665d();
        C23208e eVar2 = (C23208e) this.f63626a.remove(i);
    }
}

package com.google.android.libraries.gsa.monet.tools.children.p1913b;

import android.support.p033v7.widget.C0673gh;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.p1914a.C23195a;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.b.r */
/* compiled from: PG */
public final class C23221r implements C23208e {

    /* renamed from: a */
    public final C23226w f63657a;

    /* renamed from: b */
    public final C22945j f63658b;

    /* renamed from: c */
    public C23203ah f63659c;

    /* renamed from: d */
    public C22939d f63660d;

    public C23221r(C23226w wVar, C22945j jVar) {
        this.f63657a = wVar;
        this.f63658b = jVar;
    }

    /* renamed from: f */
    private final void m43490f(int i) {
        boolean z = true;
        if (this.f63659c == null) {
            if (!this.f63657a.mo28694d() || i != 0) {
                z = false;
            } else {
                i = 0;
            }
            C23067b.m43230c(z, "The requested index %s not currently in scope.", Integer.valueOf(i));
            return;
        }
        if (i < 0) {
            z = false;
        }
        C23067b.m43228a(z);
    }

    /* renamed from: a */
    public final int mo28662a() {
        C23203ah ahVar = this.f63659c;
        if (ahVar == null) {
            return this.f63657a.mo28694d() ? 1 : 0;
        }
        return ahVar.mo28662a();
    }

    /* renamed from: b */
    public final C23129y mo28663b(int i) {
        m43490f(i);
        C23203ah ahVar = this.f63659c;
        if (ahVar == null) {
            return this.f63657a.mo28691a();
        }
        return ahVar.mo28663b(i);
    }

    /* renamed from: c */
    public final void mo28664c(C0673gh ghVar, int i) {
        m43490f(i);
        C23203ah ahVar = this.f63659c;
        if (ahVar == null) {
            this.f63658b.mo28306q(((C23195a) ghVar).f63612a, this.f63657a.mo28692b());
            return;
        }
        ahVar.mo28664c(ghVar, i);
    }

    /* renamed from: d */
    public final void mo28665d() {
        this.f63657a.f63667c = null;
    }

    /* renamed from: e */
    public final void mo28666e(C23207d dVar) {
        this.f63657a.mo28693c(new C23220q(this, dVar));
    }
}

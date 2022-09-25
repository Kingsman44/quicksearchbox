package com.google.android.libraries.p1623at.p1626c;

import android.os.Bundle;

/* renamed from: com.google.android.libraries.at.c.ar */
/* compiled from: PG */
public final class C19491ar extends C19498ay {

    /* renamed from: c */
    private C19497ax f54423c;

    /* renamed from: d */
    private C19497ax f54424d;

    /* renamed from: e */
    private C19497ax f54425e;

    /* renamed from: f */
    private C19497ax f54426f;

    /* renamed from: g */
    private C19497ax f54427g;

    /* renamed from: h */
    private C19497ax f54428h;

    /* renamed from: i */
    public static final void m37202i(C19517bp bpVar) {
        if (bpVar instanceof C19483aj) {
            ((C19483aj) bpVar).mo24711a();
        }
    }

    /* renamed from: b */
    public final void mo24714b() {
        C19497ax axVar = this.f54425e;
        if (axVar != null) {
            mo24725E(axVar);
            this.f54425e = null;
        }
        for (int i = 0; i < this.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) this.f54432a.get(i);
            bpVar.getClass();
            if (bpVar instanceof C19479af) {
                ((C19479af) bpVar).mo24707a();
            }
        }
    }

    /* renamed from: c */
    public final void mo24715c() {
        C19497ax axVar = this.f54423c;
        if (axVar != null) {
            mo24725E(axVar);
            this.f54423c = null;
        }
        for (int i = 0; i < this.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) this.f54432a.get(i);
            bpVar.getClass();
            if (bpVar instanceof C19480ag) {
                ((C19480ag) bpVar).mo24708a();
            }
        }
    }

    /* renamed from: d */
    public final void mo24685d() {
        super.mo24685d();
        C19497ax axVar = this.f54424d;
        if (axVar != null) {
            mo24725E(axVar);
            this.f54424d = null;
        }
        C19497ax axVar2 = this.f54426f;
        if (axVar2 != null) {
            mo24725E(axVar2);
            this.f54426f = null;
        }
        C19497ax axVar3 = this.f54428h;
        if (axVar3 != null) {
            mo24725E(axVar3);
            this.f54428h = null;
        }
    }

    /* renamed from: h */
    public final void mo24718h(boolean z) {
        C19497ax axVar = this.f54427g;
        if (axVar != null) {
            mo24725E(axVar);
            this.f54427g = null;
        }
        if (z) {
            for (int i = 0; i < this.f54432a.size(); i++) {
                m37202i((C19517bp) this.f54432a.get(i));
            }
            return;
        }
        C19487an anVar = new C19487an();
        mo24726F(anVar);
        this.f54427g = anVar;
    }

    /* renamed from: a */
    public final void mo24713a(Bundle bundle) {
        C19486am amVar = new C19486am(bundle);
        mo24726F(amVar);
        this.f54424d = amVar;
    }

    /* renamed from: e */
    public final void mo24716e() {
        if (this.f54428h == null) {
            C19490aq aqVar = new C19490aq();
            mo24726F(aqVar);
            this.f54428h = aqVar;
        }
    }

    /* renamed from: g */
    public final void mo24717g(Bundle bundle) {
        C19488ao aoVar = new C19488ao(bundle);
        mo24726F(aoVar);
        this.f54426f = aoVar;
    }

    /* renamed from: j */
    public final void mo24719j() {
        C19485al alVar = new C19485al();
        mo24726F(alVar);
        this.f54423c = alVar;
    }

    /* renamed from: k */
    public final void mo24720k(Bundle bundle) {
        C19489ap apVar = new C19489ap(bundle);
        mo24726F(apVar);
        this.f54425e = apVar;
    }
}

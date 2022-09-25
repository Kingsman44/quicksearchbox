package com.google.android.libraries.p1623at.p1626c;

import android.os.Bundle;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.libraries.at.c.ay */
/* compiled from: PG */
public class C19498ay {

    /* renamed from: c */
    private static final Bundle f54431c = new Bundle();

    /* renamed from: a */
    public final List f54432a = new ArrayList();

    /* renamed from: b */
    protected final List f54433b = new ArrayList();

    /* renamed from: d */
    private C19497ax f54434d;

    /* renamed from: e */
    private C19497ax f54435e;

    /* renamed from: f */
    private C19497ax f54436f;

    /* renamed from: g */
    private C19497ax f54437g;

    /* renamed from: h */
    private C19497ax f54438h;

    public C19498ay() {
        new HashSet();
        Thread.currentThread().getId();
    }

    /* renamed from: G */
    public static final String m37218G(C19517bp bpVar) {
        if (!(bpVar instanceof C19514bm)) {
            return null;
        }
        if (bpVar instanceof C19518bq) {
            return ((C19518bq) bpVar).mo24755a();
        }
        return bpVar.getClass().getName();
    }

    /* renamed from: H */
    public static final Bundle m37219H(C19517bp bpVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String G = m37218G(bpVar);
        return G != null ? bundle.getBundle(G) : f54431c;
    }

    /* renamed from: I */
    public static final void m37220I(C19517bp bpVar) {
        if (bpVar instanceof C19545t) {
            ((C19545t) bpVar).mo24799a();
        }
    }

    /* renamed from: C */
    public final void mo24723C() {
        C19497ax axVar = this.f54435e;
        if (axVar != null) {
            mo24725E(axVar);
            this.f54435e = null;
        }
        for (int i = 0; i < this.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) this.f54432a.get(i);
            bpVar.getClass();
            if (bpVar instanceof C19516bo) {
                ((C19516bo) bpVar).mo24754a();
            }
        }
    }

    /* renamed from: D */
    public final void mo24724D(boolean z) {
        if (z) {
            C19492as asVar = new C19492as();
            mo24726F(asVar);
            this.f54438h = asVar;
            return;
        }
        C19497ax axVar = this.f54438h;
        if (axVar != null) {
            mo24725E(axVar);
            this.f54438h = null;
        }
        for (int i = 0; i < this.f54432a.size(); i++) {
            m37220I((C19517bp) this.f54432a.get(i));
        }
    }

    /* renamed from: E */
    public final void mo24725E(C19497ax axVar) {
        this.f54433b.remove(axVar);
    }

    /* renamed from: F */
    public final void mo24726F(C19497ax axVar) {
        C19559g.m37304c();
        for (int i = 0; i < this.f54432a.size(); i++) {
            axVar.mo24681a((C19517bp) this.f54432a.get(i));
        }
        this.f54433b.add(axVar);
    }

    /* renamed from: J */
    public final void mo24727J() {
        for (int i = 0; i < this.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) this.f54432a.get(i);
            if (bpVar instanceof C19499az) {
                ((C19499az) bpVar).mo24738a();
            }
        }
    }

    /* renamed from: K */
    public final void mo24728K() {
        for (int i = 0; i < this.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) this.f54432a.get(i);
            if (bpVar instanceof C19502ba) {
                ((C19502ba) bpVar).mo24740a();
            }
        }
    }

    /* renamed from: L */
    public final boolean mo24729L() {
        for (int i = 0; i < this.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) this.f54432a.get(i);
            if (bpVar instanceof C19503bb) {
                if (((C19503bb) bpVar).mo24741a()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: M */
    public final void mo24730M() {
        for (int i = 0; i < this.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) this.f54432a.get(i);
            if (bpVar instanceof C19505bd) {
                ((C19505bd) bpVar).mo24743a();
            }
        }
    }

    /* renamed from: N */
    public final boolean mo24731N() {
        boolean z = false;
        for (int i = 0; i < this.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) this.f54432a.get(i);
            if (bpVar instanceof C19506be) {
                z |= ((C19506be) bpVar).mo24744a();
            }
        }
        return z;
    }

    /* renamed from: O */
    public final boolean mo24732O() {
        for (int i = 0; i < this.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) this.f54432a.get(i);
            if (bpVar instanceof C19509bh) {
                if (((C19509bh) bpVar).mo24747a()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: P */
    public final boolean mo24733P() {
        boolean z = false;
        for (int i = 0; i < this.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) this.f54432a.get(i);
            if (bpVar instanceof C19511bj) {
                z |= ((C19511bj) bpVar).mo24749a();
            }
        }
        return z;
    }

    /* renamed from: Q */
    public final void mo24734Q() {
        for (int i = 0; i < this.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) this.f54432a.get(i);
            if (bpVar instanceof C19512bk) {
                ((C19512bk) bpVar).mo24750a();
            }
        }
    }

    /* renamed from: d */
    public void mo24685d() {
        C19497ax axVar = this.f54437g;
        if (axVar != null) {
            mo24725E(axVar);
            this.f54437g = null;
        }
        C19497ax axVar2 = this.f54434d;
        if (axVar2 != null) {
            mo24725E(axVar2);
            this.f54434d = null;
        }
        for (int i = 0; i < this.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) this.f54432a.get(i);
            bpVar.getClass();
            if (bpVar instanceof C19507bf) {
                ((C19507bf) bpVar).mo24745a();
            }
        }
    }

    /* renamed from: f */
    public void mo24687f() {
        C19497ax axVar = this.f54436f;
        if (axVar != null) {
            mo24725E(axVar);
            this.f54436f = null;
        }
        for (int i = 0; i < this.f54432a.size(); i++) {
            C19517bp bpVar = (C19517bp) this.f54432a.get(i);
            bpVar.getClass();
            if (bpVar instanceof C19510bi) {
                ((C19510bi) bpVar).mo24748a();
            }
        }
    }

    /* renamed from: y */
    public final void mo24736y() {
        for (C19517bp bpVar : this.f54432a) {
            if (bpVar instanceof C19508bg) {
                ((C19508bg) bpVar).mo24746a();
            }
        }
    }

    /* renamed from: A */
    public final void mo24721A(Bundle bundle) {
        C19496aw awVar = new C19496aw(bundle);
        mo24726F(awVar);
        this.f54437g = awVar;
    }

    /* renamed from: B */
    public final void mo24722B() {
        C19494au auVar = new C19494au();
        mo24726F(auVar);
        this.f54435e = auVar;
    }

    /* renamed from: x */
    public final void mo24735x(Bundle bundle) {
        C19493at atVar = new C19493at(bundle);
        mo24726F(atVar);
        this.f54434d = atVar;
    }

    /* renamed from: z */
    public final void mo24737z() {
        C19495av avVar = new C19495av();
        mo24726F(avVar);
        this.f54436f = avVar;
    }
}

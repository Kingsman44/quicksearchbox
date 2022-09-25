package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ss */
/* compiled from: PG */
public abstract class C7290ss implements C7323ty {

    /* renamed from: a */
    private final ArrayList f23763a = new ArrayList(1);

    /* renamed from: b */
    private final HashSet f23764b = new HashSet(1);

    /* renamed from: c */
    private final C7332ug f23765c = new C7332ug();

    /* renamed from: d */
    private final C7033je f23766d = new C7033je();

    /* renamed from: e */
    private Looper f23767e;

    /* renamed from: f */
    private C6912es f23768f;

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo16466X() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16467a(adh adh);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo16468c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo16469d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo16470e(C6912es esVar) {
        this.f23768f = esVar;
        ArrayList arrayList = this.f23763a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C7322tx) arrayList.get(i)).mo15711a(this, esVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C7332ug mo16471f(C7321tw twVar) {
        return this.f23765c.mo16552a(0, twVar, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C7332ug mo16472g(C7321tw twVar, long j) {
        return this.f23765c.mo16552a(0, twVar, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C7033je mo16473h(C7321tw twVar) {
        return this.f23766d.mo16067a(0, twVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C7033je mo16474i(int i, C7321tw twVar) {
        return this.f23766d.mo16067a(i, twVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo16475j() {
        return !this.f23764b.isEmpty();
    }

    /* renamed from: k */
    public final void mo16476k(Handler handler, C7333uh uhVar) {
        ary.m19467t(handler);
        ary.m19467t(uhVar);
        this.f23765c.mo16553b(handler, uhVar);
    }

    /* renamed from: l */
    public final void mo16477l(C7333uh uhVar) {
        this.f23765c.mo16554c(uhVar);
    }

    /* renamed from: m */
    public final void mo16478m(Handler handler, C7034jf jfVar) {
        ary.m19467t(handler);
        ary.m19467t(jfVar);
        this.f23766d.mo16068b(handler, jfVar);
    }

    /* renamed from: n */
    public final void mo16479n(C7322tx txVar, adh adh) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f23767e;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        ary.m19462o(z);
        C6912es esVar = this.f23768f;
        this.f23763a.add(txVar);
        if (this.f23767e == null) {
            this.f23767e = myLooper;
            this.f23764b.add(txVar);
            mo16467a(adh);
        } else if (esVar != null) {
            mo16480o(txVar);
            txVar.mo15711a(this, esVar);
        }
    }

    /* renamed from: o */
    public final void mo16480o(C7322tx txVar) {
        ary.m19467t(this.f23767e);
        boolean isEmpty = this.f23764b.isEmpty();
        this.f23764b.add(txVar);
        if (isEmpty) {
            mo16466X();
        }
    }

    /* renamed from: p */
    public final void mo16481p(C7322tx txVar) {
        boolean isEmpty = this.f23764b.isEmpty();
        this.f23764b.remove(txVar);
        if ((!isEmpty) && this.f23764b.isEmpty()) {
            mo16468c();
        }
    }

    /* renamed from: q */
    public final void mo16482q(C7322tx txVar) {
        this.f23763a.remove(txVar);
        if (this.f23763a.isEmpty()) {
            this.f23767e = null;
            this.f23768f = null;
            this.f23764b.clear();
            mo16469d();
            return;
        }
        mo16481p(txVar);
    }

    /* renamed from: r */
    public C6912es mo16483r() {
        return null;
    }

    /* renamed from: s */
    public boolean mo16484s() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C7332ug mo16485t(int i, C7321tw twVar) {
        return this.f23765c.mo16552a(i, twVar, 0);
    }
}

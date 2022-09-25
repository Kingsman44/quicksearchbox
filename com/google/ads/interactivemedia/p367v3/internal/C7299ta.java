package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import java.util.HashMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ta */
/* compiled from: PG */
public abstract class C7299ta extends C7290ss {

    /* renamed from: a */
    private final HashMap f23791a = new HashMap();

    /* renamed from: b */
    private Handler f23792b;

    /* renamed from: c */
    private adh f23793c;

    protected C7299ta() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C7321tw mo16513A(Object obj, C7321tw twVar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract void mo16514B(Object obj, C6912es esVar);

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo16466X() {
        for (C7297sz szVar : this.f23791a.values()) {
            szVar.f23786a.mo16480o(szVar.f23787b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16467a(adh adh) {
        this.f23793c = adh;
        this.f23792b = aeu.m18541k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo16468c() {
        for (C7297sz szVar : this.f23791a.values()) {
            szVar.f23786a.mo16481p(szVar.f23787b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16469d() {
        for (C7297sz szVar : this.f23791a.values()) {
            szVar.f23786a.mo16482q(szVar.f23787b);
            szVar.f23786a.mo16477l(szVar.f23788c);
        }
        this.f23791a.clear();
    }

    /* renamed from: u */
    public void mo16515u() {
        for (C7297sz szVar : this.f23791a.values()) {
            szVar.f23786a.mo16515u();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo16516v(Object obj, C7323ty tyVar) {
        ary.m19462o(!this.f23791a.containsKey(obj));
        C7295sx sxVar = new C7295sx(this, obj);
        C7296sy syVar = new C7296sy(this, obj);
        this.f23791a.put(obj, new C7297sz(tyVar, sxVar, syVar));
        Handler handler = this.f23792b;
        ary.m19467t(handler);
        tyVar.mo16476k(handler, syVar);
        Handler handler2 = this.f23792b;
        ary.m19467t(handler2);
        tyVar.mo16478m(handler2, syVar);
        tyVar.mo16479n(sxVar, this.f23793c);
        if (!mo16475j()) {
            tyVar.mo16481p(sxVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo16517w(Object obj) {
        C7297sz szVar = (C7297sz) this.f23791a.get(obj);
        ary.m19467t(szVar);
        szVar.f23786a.mo16480o(szVar.f23787b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo16518x(Object obj) {
        C7297sz szVar = (C7297sz) this.f23791a.get(obj);
        ary.m19467t(szVar);
        szVar.f23786a.mo16481p(szVar.f23787b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo16519y(Object obj) {
        C7297sz szVar = (C7297sz) this.f23791a.remove(obj);
        ary.m19467t(szVar);
        szVar.f23786a.mo16482q(szVar.f23787b);
        szVar.f23786a.mo16477l(szVar.f23788c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo16520z(Object obj, int i) {
        return i;
    }
}

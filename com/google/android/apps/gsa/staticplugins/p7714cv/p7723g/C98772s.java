package com.google.android.apps.gsa.staticplugins.p7714cv.p7723g;

import com.google.android.apps.gsa.shared.speech.C90530b;
import com.google.android.apps.gsa.shared.speech.C90603k;
import com.google.android.apps.gsa.shared.speech.C90605m;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.speech.p7294j.C92435e;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7724h.C98785l;
import com.google.speech.p5224k.p5225a.C67186ad;
import com.google.speech.p5224k.p5225a.C67194al;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.g.s */
/* compiled from: PG */
public final class C98772s implements C98769p {

    /* renamed from: a */
    private final C90605m f275917a = new C90605m();

    /* renamed from: b */
    private final C92435e f275918b;

    /* renamed from: c */
    private boolean f275919c;

    public C98772s(C92435e eVar) {
        this.f275918b = eVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo91292a(C90603k kVar) {
        C67186ad adVar = ((C98785l) kVar).f275937a;
        if (!this.f275919c) {
            this.f275918b.mo87100f();
            this.f275919c = true;
        }
        if (adVar.f182615c) {
            C90606n a = this.f275917a.mo84745a();
            if (((C90530b) a).f253083a.mo59031d() > 0) {
                this.f275918b.mo87107m(a);
                return;
            }
            return;
        }
        this.f275917a.mo84746b(adVar.f182614b);
        if ((adVar.f182613a & 16) != 0) {
            C90605m mVar = this.f275917a;
            C67194al alVar = adVar.f182616d;
            if (alVar == null) {
                alVar = C67194al.f182643d;
            }
            mVar.mo84747c(alVar);
        }
    }
}

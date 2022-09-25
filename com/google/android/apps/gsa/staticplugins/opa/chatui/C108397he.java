package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.he */
/* compiled from: PG */
public final class C108397he extends C108232bc {

    /* renamed from: a */
    private final C108395hc f301506a;

    public C108397he(C108395hc hcVar) {
        super((byte[]) null);
        this.f301506a = hcVar;
    }

    /* renamed from: d */
    public final boolean mo96597d() {
        return true;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 141563;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 32;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        return this.f301506a.mo96836b(false);
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        C28295m.m52919e(blVar.f301084k, this.f301030l);
        blVar.f301065O.removeAllViews();
        blVar.f301065O.scrollTo(0, 0);
        C108395hc hcVar = this.f301506a;
        hcVar.f301491d = bhVar;
        hcVar.mo96837c(blVar.f301065O, false);
    }

    /* renamed from: jz */
    public final int mo96576jz(BitFlags bitFlags) {
        return 1;
    }

    /* renamed from: k */
    public final void mo95833k(C108241bl blVar) {
        blVar.f301065O.scrollTo(0, 0);
    }
}

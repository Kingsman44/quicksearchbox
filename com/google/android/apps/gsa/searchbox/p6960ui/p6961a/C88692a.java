package com.google.android.apps.gsa.searchbox.p6960ui.p6961a;

import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.searchbox.shared.p3200a.C41640a;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;
import com.google.common.p4552o.ane;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.a.a */
/* compiled from: PG */
public final class C88692a extends C41641b implements C89203h, C89204i {

    /* renamed from: a */
    private C89205j f239808a;

    /* renamed from: a */
    public final void mo82393a() {
        C89205j jVar = this.f239808a;
        if (jVar != null) {
            jVar.mo83169i("IMAGE_CAROUSEL_COLLAPSE_ICON_TAP_COUNT");
        }
    }

    /* renamed from: c */
    public final void mo82394c() {
        C89205j jVar = this.f239808a;
        if (jVar != null) {
            jVar.mo83169i("IMAGE_CAROUSEL_EXPAND_ICON_TAP_COUNT");
        }
    }

    /* renamed from: e */
    public final void mo78004e() {
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f239808a = jVar;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        C89205j jVar = this.f239808a;
        if (jVar != null) {
            jVar.mo83171k("IMAGE_CAROUSEL_EXPAND_ICON_TAP_COUNT", 0);
            this.f239808a.mo83171k("IMAGE_CAROUSEL_COLLAPSE_ICON_TAP_COUNT", 0);
        }
    }

    /* renamed from: l */
    public final void mo44232l(C41640a aVar) {
        C89205j jVar = this.f239808a;
        if (jVar != null) {
            if (jVar.mo83161a("IMAGE_CAROUSEL_EXPAND_ICON_TAP_COUNT") > 0) {
                aVar.mo44227b(ane.IMAGE_CAROUSEL_EXPAND_ICON_TAP_COUNT, this.f239808a.mo83161a("IMAGE_CAROUSEL_EXPAND_ICON_TAP_COUNT"));
            } else {
                aVar.mo44226a(ane.IMAGE_CAROUSEL_EXPAND_ICON_TAP_COUNT);
            }
            if (this.f239808a.mo83161a("IMAGE_CAROUSEL_COLLAPSE_ICON_TAP_COUNT") > 0) {
                aVar.mo44227b(ane.IMAGE_CAROUSEL_COLLAPSE_ICON_TAP_COUNT, this.f239808a.mo83161a("IMAGE_CAROUSEL_COLLAPSE_ICON_TAP_COUNT"));
            } else {
                aVar.mo44226a(ane.IMAGE_CAROUSEL_COLLAPSE_ICON_TAP_COUNT);
            }
        }
    }
}

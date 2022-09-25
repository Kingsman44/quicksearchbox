package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60866ct;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69424bs;
import p5451f.p5452a.p5453a.p5454a.C69425bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.a.c */
/* compiled from: PG */
public final /* synthetic */ class C97325c implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C97320ae f271851a;

    /* renamed from: b */
    public final /* synthetic */ C69396ar f271852b;

    public /* synthetic */ C97325c(C97320ae aeVar, C69396ar arVar) {
        this.f271851a = aeVar;
        this.f271852b = arVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C69425bt btVar;
        C69425bt btVar2;
        C97320ae aeVar = this.f271851a;
        C69396ar arVar = this.f271852b;
        if (arVar.f185680a == 6) {
            btVar = (C69425bt) arVar.f185681b;
        } else {
            btVar = C69425bt.f185762e;
        }
        int a = C69424bs.m100753a(btVar.f185765b);
        if (a == 0) {
            a = 1;
        }
        if (a == 2) {
            return aeVar.f271796f.mo28209i(aeVar.f271800j.mo46042d(), "Show particle disc tooltip after reading proto store", new C97340r(aeVar, arVar));
        }
        if (a != 3) {
            return C60866ct.f164955a;
        }
        if (arVar.f185680a == 6) {
            btVar2 = (C69425bt) arVar.f185681b;
        } else {
            btVar2 = C69425bt.f185762e;
        }
        aeVar.mo90656r(arVar, aeVar.mo90645f(btVar2, R.string.search_history_tooltip_text, 0));
        return C60866ct.f164955a;
    }
}

package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a;

import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.C97426g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69425bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.a.r */
/* compiled from: PG */
public final /* synthetic */ class C97340r implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C97320ae f271867a;

    /* renamed from: b */
    public final /* synthetic */ C69396ar f271868b;

    public /* synthetic */ C97340r(C97320ae aeVar, C69396ar arVar) {
        this.f271867a = aeVar;
        this.f271868b = arVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str;
        C69425bt btVar;
        C69425bt btVar2;
        C97320ae aeVar = this.f271867a;
        C69396ar arVar = this.f271868b;
        if (((C97426g) obj).f272071a) {
            if (arVar.f185680a == 6) {
                btVar2 = (C69425bt) arVar.f185681b;
            } else {
                btVar2 = C69425bt.f185762e;
            }
            str = aeVar.mo90645f(btVar2, R.string.incognito_tooltip_text_second_time, 1);
        } else {
            if (arVar.f185680a == 6) {
                btVar = (C69425bt) arVar.f185681b;
            } else {
                btVar = C69425bt.f185762e;
            }
            str = aeVar.mo90645f(btVar, R.string.incognito_tooltip_text_first_time, 0);
        }
        aeVar.mo90656r(arVar, str);
        return null;
    }
}

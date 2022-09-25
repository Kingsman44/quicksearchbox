package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.f */
/* compiled from: PG */
public final /* synthetic */ class C107595f implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107597h f299321a;

    public /* synthetic */ C107595f(C107597h hVar) {
        this.f299321a = hVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C107597h hVar = this.f299321a;
        C107596g gVar = C107596g.UNKNOWN;
        int ordinal = ((C107596g) obj).ordinal();
        if (ordinal == 1) {
            return C58485gu.m89846n(hVar.mo96062a(R.drawable.quantum_ic_work_googblue_24, hVar.f299332a.getResources().getString(R.string.opa_rich_input_navigate_work)));
        }
        if (ordinal == 2 || ordinal == 3) {
            return C58485gu.m89846n(hVar.mo96062a(R.drawable.quantum_ic_home_googblue_24, hVar.f299332a.getResources().getString(R.string.opa_rich_input_navigate_home)));
        }
        if (ordinal != 4) {
            return C58485gu.m89845m();
        }
        return C58485gu.m89846n(hVar.mo96062a(R.drawable.quantum_ic_navigation_googblue_24, hVar.f299332a.getResources().getString(R.string.opa_rich_input_navigate)));
    }
}

package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124549e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.dx */
/* compiled from: PG */
public final /* synthetic */ class C96174dx implements C124549e {

    /* renamed from: a */
    public static final /* synthetic */ C96174dx f269212a = new C96174dx();

    private /* synthetic */ C96174dx() {
    }

    /* renamed from: a */
    public final boolean mo89077a(C124548d dVar) {
        C59071e eVar = C96183ef.f269221b;
        if (dVar.mo106513k() != C124719q.GACS_DEVICE) {
            return false;
        }
        if (dVar.mo106512j() == C124715m.FULLY_CONNECTED || dVar.mo106512j() == C124715m.GATT_CONNECTED) {
            return true;
        }
        return false;
    }
}

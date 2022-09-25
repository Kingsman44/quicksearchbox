package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.kf */
/* compiled from: PG */
public final /* synthetic */ class C96345kf implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C96348ki f269563a;

    public /* synthetic */ C96345kf(C96348ki kiVar) {
        this.f269563a = kiVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C96348ki kiVar = this.f269563a;
        kiVar.f269571q = ((C124548d) obj).mo106519q();
        C124625ar arVar = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        C124625ar a = C124625ar.m204290a(kiVar.f269571q.f343821h);
        if (a == null) {
            a = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        }
        if (!arVar.equals(a) || kiVar.f269572r) {
            return null;
        }
        C59104x c = C96348ki.f269566m.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OtaZeroDayInProgress");
        ((C59052c) ((C59052c) c).mo56372aa(17082)).mo56386p("0-day OTA not started");
        kiVar.f269032f = false;
        kiVar.mo77318iT().mo77312a();
        return null;
    }
}

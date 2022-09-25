package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.DialogInterface;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124669ch;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124697di;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124698dj;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.ax */
/* compiled from: PG */
public final /* synthetic */ class C9578ax implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33180a;

    /* renamed from: b */
    public final /* synthetic */ boolean f33181b;

    public /* synthetic */ C9578ax(C9619ck ckVar, boolean z) {
        this.f33180a = ckVar;
        this.f33181b = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C60870cx cxVar;
        C9619ck ckVar = this.f33180a;
        boolean z = this.f33181b;
        C58976aa aaVar = C58975e.f156826a;
        String str = ckVar.f33286t;
        if (str != null) {
            if (ckVar.f33284r.mo83555j(150)) {
                C124697di diVar = (C124697di) C124698dj.f344014d.createBuilder();
                diVar.copyOnWrite();
                C124698dj djVar = (C124698dj) diVar.instance;
                djVar.f344016a |= 1;
                djVar.f344017b = str;
                diVar.copyOnWrite();
                C124698dj djVar2 = (C124698dj) diVar.instance;
                djVar2.f344016a |= 2;
                djVar2.f344018c = z;
                cxVar = ((C124669ch) ckVar.f33282p.mo27525b()).mo106581c((C124698dj) diVar.build());
            } else {
                cxVar = ckVar.f33239C.mo83520d(C58833ax.m90833j(ckVar.f33281o.mo79668a()), str, z);
            }
            ckVar.f33237A = cxVar;
            PersonalResultsSwitchPreference personalResultsSwitchPreference = ckVar.f33283q;
            if (personalResultsSwitchPreference != null) {
                personalResultsSwitchPreference.mo8391j(z);
            }
            ckVar.mo17790D(false);
            C90875ai.m148465b(new C9572ar(ckVar, z), ckVar.f33237A, ckVar.f33278l, "set-userconsent").mo85223a(new C9573as(ckVar, z));
            return;
        }
        C59104x c = C9619ck.f33236i.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
        ((C59052c) ((C59052c) c).mo56372aa(404)).mo56386p("Device ID is null");
    }
}

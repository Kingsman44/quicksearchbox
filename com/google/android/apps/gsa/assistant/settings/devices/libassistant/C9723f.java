package com.google.android.apps.gsa.assistant.settings.devices.libassistant;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.SecondaryWidgetRadioButtonPreference;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.C49912dp;
import com.google.assistant.p3861at.C49913dq;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.libassistant.f */
/* compiled from: PG */
public final /* synthetic */ class C9723f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9726i f33599a;

    /* renamed from: b */
    public final /* synthetic */ SecondaryWidgetRadioButtonPreference f33600b;

    public /* synthetic */ C9723f(C9726i iVar, SecondaryWidgetRadioButtonPreference secondaryWidgetRadioButtonPreference) {
        this.f33599a = iVar;
        this.f33600b = secondaryWidgetRadioButtonPreference;
    }

    public final void run() {
        C9726i iVar = this.f33599a;
        SecondaryWidgetRadioButtonPreference secondaryWidgetRadioButtonPreference = this.f33600b;
        C58976aa aaVar = C58975e.f156826a;
        if (iVar.f33607m == null) {
            C59104x c = C9726i.f33603i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MediaTargetController");
            ((C59052c) ((C59052c) c).mo56372aa(453)).mo56386p("no assistant device id");
            return;
        }
        C49912dp dpVar = (C49912dp) C49913dq.f129735e.createBuilder();
        String str = secondaryWidgetRadioButtonPreference.f12748t;
        if (str.startsWith("audio_cast_device_")) {
            String replace = str.replace("audio_cast_device_", BuildConfig.FLAVOR);
            dpVar.copyOnWrite();
            C49913dq dqVar = (C49913dq) dpVar.instance;
            replace.getClass();
            dqVar.f129737a = 1;
            dqVar.f129738b = replace;
        } else if (str.startsWith("video_cast_device_")) {
            String replace2 = str.replace("video_cast_device_", BuildConfig.FLAVOR);
            dpVar.copyOnWrite();
            C49913dq dqVar2 = (C49913dq) dpVar.instance;
            replace2.getClass();
            dqVar2.f129739c = 2;
            dqVar2.f129740d = replace2;
        } else if (str.startsWith("audio_home_graph_device_")) {
            String replace3 = str.replace("audio_home_graph_device_", BuildConfig.FLAVOR);
            dpVar.copyOnWrite();
            C49913dq dqVar3 = (C49913dq) dpVar.instance;
            replace3.getClass();
            dqVar3.f129737a = 3;
            dqVar3.f129738b = replace3;
        } else if (str.startsWith("video_home_graph_device_")) {
            String replace4 = str.replace("video_home_graph_device_", BuildConfig.FLAVOR);
            dpVar.copyOnWrite();
            C49913dq dqVar4 = (C49913dq) dpVar.instance;
            replace4.getClass();
            dqVar4.f129739c = 4;
            dqVar4.f129740d = replace4;
        }
        C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
        cnVar.copyOnWrite();
        C49891cv cvVar = (C49891cv) cnVar.instance;
        C49913dq dqVar5 = (C49913dq) dpVar.build();
        dqVar5.getClass();
        cvVar.f129684w = dqVar5;
        cvVar.f129664b |= 1;
        C49891cv cvVar2 = (C49891cv) cnVar.build();
        C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
        C49875cf cfVar = C49875cf.LIBASSISTANT;
        dfVar.copyOnWrite();
        C49903dg dgVar = (C49903dg) dfVar.instance;
        dgVar.f129716c = cfVar.f129621v;
        dgVar.f129714a |= 2;
        String str2 = iVar.f33607m;
        str2.getClass();
        dfVar.copyOnWrite();
        C49903dg dgVar2 = (C49903dg) dfVar.instance;
        dgVar2.f129714a |= 1;
        dgVar2.f129715b = str2;
        dfVar.copyOnWrite();
        C49903dg dgVar3 = (C49903dg) dfVar.instance;
        cvVar2.getClass();
        dgVar3.f129719f = cvVar2;
        dgVar3.f129714a |= 32;
        C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
        daVar.mo53372c((C49903dg) dfVar.build());
        C49898db dbVar = (C49898db) daVar.build();
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        dbVar.getClass();
        acx.f128991h = dbVar;
        acx.f128984a |= 32;
        iVar.mo17814y((acx) acw.build(), new C9725h(iVar));
    }
}

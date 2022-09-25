package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9697a;

import com.google.android.apps.gsa.binaries.satin.app.aov;
import com.google.android.apps.gsa.binaries.satin.app.aow;
import com.google.android.apps.search.assistant.platform.p9236j.p9237a.p9238a.p9239a.C121540a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126929g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126930h;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130353c;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.a.i */
/* compiled from: PG */
public final /* synthetic */ class C128270i {
    /* renamed from: a */
    public static C126930h m209355a(C130353c cVar, C121540a aVar, aow aow) {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "device.WAIT_ACTIVITY";
        return C126929g.m207622c((C51785da) czVar.build(), new C128265d(aow, cVar, aVar));
    }

    /* renamed from: b */
    public static Set m209356b(C130353c cVar, aov aov, C121540a aVar, boolean z) {
        HashSet hashSet = new HashSet();
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "device.EXECUTE_APP_CONTROL";
        C126930h c = C126929g.m207622c((C51785da) czVar.build(), new C128269h(aov, aVar, cVar));
        if (z) {
            hashSet.add(c);
        }
        return hashSet;
    }
}

package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p981b.p982a;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p981b.C13557b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C13548a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C13556i f41514a;

    public /* synthetic */ C13548a(C13556i iVar) {
        this.f41514a = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C13556i iVar = this.f41514a;
        C59104x b = C13556i.f41523a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SmartActionProcessor");
        ((C59052c) ((C59052c) b).mo56372aa(44888)).mo56386p("getSmartActionsForTappedMessage");
        C13557b bVar = iVar.f41524b;
        ((C59052c) ((C59052c) C13557b.f41531a.mo56224b()).mo56372aa(44885)).mo56386p("getSmartActionsForTappedMessage");
        if (bVar.f41532b.isEmpty()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        return (C60870cx) bVar.f41532b.get(0);
    }
}

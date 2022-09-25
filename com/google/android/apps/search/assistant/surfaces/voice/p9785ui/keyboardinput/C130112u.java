package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130305c;
import com.google.assistant.p3897e.p3921j.p3922a.C51655m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.u */
/* compiled from: PG */
final class C130112u implements C130305c {

    /* renamed from: a */
    final /* synthetic */ C130109s f356770a;

    public C130112u(C130109s sVar) {
        this.f356770a = sVar;
    }

    /* renamed from: a */
    public final void mo109504a(String str, C51655m mVar) {
        C130109s sVar = this.f356770a;
        if (!sVar.f356762l) {
            C59104x d = C130109s.f356751a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "KeyboardInputFragment");
            ((C59052c) ((C59052c) d).mo56372aa(38680)).mo56386p("Keyboard corrections are not enabled. Ignore clicks on span.");
            return;
        }
        sVar.f356758h.mo109484a(str, Optional.m71637of(mVar));
    }
}

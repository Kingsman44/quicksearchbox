package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.ce */
/* compiled from: PG */
final class C126823ce implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C126824cf f349259a;

    public C126823ce(C126824cf cfVar) {
        this.f349259a = cfVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C59104x c = C126824cf.f349260a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "IntentApiFragmentPeer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37196)).mo56386p("Audio level loading failed");
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        int i = ((C119785ag) obj).f333650a;
        C126833cm cmVar = this.f349259a.f349277r;
        cmVar.getClass();
        DrawSoundLevelsView drawSoundLevelsView = cmVar.f349296g;
        C59104x b = DrawSoundLevelsView.f349086a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DrawSoundLevelsView");
        ((C59052c) ((C59052c) b).mo56372aa(37166)).mo56387q("#setSpeechLevel %d", i);
        drawSoundLevelsView.f349087b.add(Integer.valueOf(i));
        drawSoundLevelsView.invalidate();
    }
}

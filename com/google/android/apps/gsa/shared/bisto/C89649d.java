package com.google.android.apps.gsa.shared.bisto;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.service.voice.VoiceInteractionService;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124519a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.shared.bisto.d */
/* compiled from: PG */
public final class C89649d {

    /* renamed from: a */
    static final ComponentName f242753a = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.voiceinteraction.GsaVoiceInteractionService");

    /* renamed from: b */
    private static final C59071e f242754b = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.d");

    /* renamed from: c */
    private final Context f242755c;

    /* renamed from: d */
    private final C68214a f242756d;

    /* renamed from: e */
    private final C89647bd f242757e;

    /* renamed from: f */
    private final C89656k f242758f;

    public C89649d(Context context, C68214a aVar, C89656k kVar, C89647bd bdVar) {
        this.f242755c = context;
        this.f242757e = bdVar;
        this.f242756d = aVar;
        this.f242758f = kVar;
    }

    /* renamed from: a */
    public final boolean mo83540a(Intent intent) {
        String action = intent.getAction();
        if (("android.speech.action.WEB_SEARCH".equals(action) || "android.speech.action.VOICE_SEARCH_HANDS_FREE".equals(action)) && this.f242757e.mo83538b() && VoiceInteractionService.isActiveService(this.f242755c, f242753a)) {
            C58976aa aaVar = C58975e.f156826a;
            C88489j jVar = new C88489j(C87739bu.BISTO_HANDLE_VOICE_SEARCH_INTENT);
            jVar.mo82015c(intent);
            C89651f.m145940a((C88483e) this.f242756d.mo27525b(), jVar.mo82013a());
            return true;
        } else if (!"android.intent.action.VOICE_COMMAND".equals(intent.getAction()) || !this.f242758f.mo83555j(102)) {
            return false;
        } else {
            C59104x b = f242754b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoVSIntentHandler");
            ((C59052c) ((C59052c) b).mo56372aa(10207)).mo56386p("Starting legacy BT voice search intent");
            C124519a.m203974a(this.f242755c, intent);
            return true;
        }
    }
}

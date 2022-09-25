package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import android.service.voice.AlwaysOnHotwordDetector;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33497h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.n.c.a.g */
/* compiled from: PG */
public final /* synthetic */ class C39529g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C39633o f104085a;

    /* renamed from: b */
    public final /* synthetic */ AlwaysOnHotwordDetector.Callback f104086b;

    public /* synthetic */ C39529g(C39633o oVar, AlwaysOnHotwordDetector.Callback callback) {
        this.f104085a = oVar;
        this.f104086b = callback;
    }

    public final void run() {
        C39633o oVar = this.f104085a;
        AlwaysOnHotwordDetector.Callback callback = this.f104086b;
        C59104x b = C39633o.f104316a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
        ((C59052c) ((C59052c) b).mo56372aa(53510)).mo56354G("Create alwaysOnHotwordDetector for hotword keyphrase %s, hotword locale %s", oVar.f104329n.mo41816c(), oVar.f104329n.mo41817d());
        C33497h hVar = oVar.f104334s;
        String c = oVar.f104329n.mo41816c();
        String d = oVar.f104329n.mo41817d();
        C69664n.m101061g(c, "hotwordPhrase");
        C69664n.m101061g(d, "locale");
        AlwaysOnHotwordDetector createAlwaysOnHotwordDetector = hVar.f89651a.createAlwaysOnHotwordDetector(c, Locale.forLanguageTag(d), callback);
        C69664n.m101060f(createAlwaysOnHotwordDetector, "service.createAlwaysOnHo…ageTag(locale), callback)");
        oVar.f104332q = createAlwaysOnHotwordDetector;
        String d2 = oVar.f104329n.mo41817d();
        String c2 = oVar.f104329n.mo41816c();
        oVar.mo41963d("ALWAYS_ON_HOTWORD_DETECTOR_CREATED for locale : " + d2 + ", keyphrase : " + c2);
    }
}

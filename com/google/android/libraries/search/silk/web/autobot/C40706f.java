package com.google.android.libraries.search.silk.web.autobot;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3215d.C41718a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4300e.C56682d;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.autobot.f */
/* compiled from: PG */
public final /* synthetic */ class C40706f implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkAutobotMessageHandler f106765a;

    /* renamed from: b */
    public final /* synthetic */ C41718a f106766b;

    public /* synthetic */ C40706f(SilkAutobotMessageHandler silkAutobotMessageHandler, C41718a aVar) {
        this.f106765a = silkAutobotMessageHandler;
        this.f106766b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkAutobotMessageHandler silkAutobotMessageHandler = this.f106765a;
        C41718a aVar = this.f106766b;
        C40769f fVar = silkAutobotMessageHandler.f106759d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40704d(aVar), oVar, jSONObject, "Autobot", "startAutobot", C56682d.f151297c.getParserForType());
    }
}

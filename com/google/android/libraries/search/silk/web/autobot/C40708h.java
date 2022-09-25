package com.google.android.libraries.search.silk.web.autobot;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3215d.C41718a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4300e.C56684f;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.autobot.h */
/* compiled from: PG */
public final /* synthetic */ class C40708h implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkAutobotMessageHandler f106768a;

    /* renamed from: b */
    public final /* synthetic */ C41718a f106769b;

    public /* synthetic */ C40708h(SilkAutobotMessageHandler silkAutobotMessageHandler, C41718a aVar) {
        this.f106768a = silkAutobotMessageHandler;
        this.f106769b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkAutobotMessageHandler silkAutobotMessageHandler = this.f106768a;
        C41718a aVar = this.f106769b;
        C40769f fVar = silkAutobotMessageHandler.f106759d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40709i(aVar), oVar, jSONObject, "Autobot", "startAutobotViaIntent", C56684f.f151302b.getParserForType());
    }
}

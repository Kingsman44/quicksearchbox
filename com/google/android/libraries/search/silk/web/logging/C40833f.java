package com.google.android.libraries.search.silk.web.logging;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3227p.C41730a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4311p.C56788f;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.logging.f */
/* compiled from: PG */
public final /* synthetic */ class C40833f implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkLoggingMessageHandler f107011a;

    /* renamed from: b */
    public final /* synthetic */ C41730a f107012b;

    public /* synthetic */ C40833f(SilkLoggingMessageHandler silkLoggingMessageHandler, C41730a aVar) {
        this.f107011a = silkLoggingMessageHandler;
        this.f107012b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkLoggingMessageHandler silkLoggingMessageHandler = this.f107011a;
        C41730a aVar = this.f107012b;
        C40769f fVar = silkLoggingMessageHandler.f107005d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40836i(aVar), oVar, jSONObject, "Logging", "log", C56788f.f151536g.getParserForType());
    }
}

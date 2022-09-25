package com.google.android.libraries.search.silk.web.channels;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3217f.C41720a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4301f.C56692h;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.channels.i */
/* compiled from: PG */
public final /* synthetic */ class C40721i implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkChannelsMessageHandler f106800a;

    /* renamed from: b */
    public final /* synthetic */ C41720a f106801b;

    public /* synthetic */ C40721i(SilkChannelsMessageHandler silkChannelsMessageHandler, C41720a aVar) {
        this.f106800a = silkChannelsMessageHandler;
        this.f106801b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkChannelsMessageHandler silkChannelsMessageHandler = this.f106800a;
        C41720a aVar = this.f106801b;
        C40769f fVar = silkChannelsMessageHandler.f106788d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40723k(aVar), oVar, jSONObject, "Channels", "setChannelFollowState", C56692h.f151323c.getParserForType());
    }
}

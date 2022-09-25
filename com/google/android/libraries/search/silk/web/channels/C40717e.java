package com.google.android.libraries.search.silk.web.channels;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3217f.C41720a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4301f.C56690f;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.channels.e */
/* compiled from: PG */
public final /* synthetic */ class C40717e implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkChannelsMessageHandler f106794a;

    /* renamed from: b */
    public final /* synthetic */ C41720a f106795b;

    public /* synthetic */ C40717e(SilkChannelsMessageHandler silkChannelsMessageHandler, C41720a aVar) {
        this.f106794a = silkChannelsMessageHandler;
        this.f106795b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkChannelsMessageHandler silkChannelsMessageHandler = this.f106794a;
        C41720a aVar = this.f106795b;
        C40769f fVar = silkChannelsMessageHandler.f106788d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40724l(aVar), oVar, jSONObject, "Channels", "openChannel", C56690f.f151315f.getParserForType());
    }
}

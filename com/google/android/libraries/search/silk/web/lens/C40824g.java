package com.google.android.libraries.search.silk.web.lens;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3226o.C41729a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.lens.g */
/* compiled from: PG */
public final /* synthetic */ class C40824g implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkLensMessageHandler f106993a;

    /* renamed from: b */
    public final /* synthetic */ C41729a f106994b;

    public /* synthetic */ C40824g(SilkLensMessageHandler silkLensMessageHandler, C41729a aVar) {
        this.f106993a = silkLensMessageHandler;
        this.f106994b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkLensMessageHandler silkLensMessageHandler = this.f106993a;
        C41729a aVar = this.f106994b;
        C40769f fVar = silkLensMessageHandler.f106986d;
        Objects.requireNonNull(aVar);
        fVar.mo42721e(new C40822e(aVar), oVar, jSONObject, "Lens", "getLensApiCapabilities");
    }
}

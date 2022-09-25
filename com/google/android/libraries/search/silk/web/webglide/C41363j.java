package com.google.android.libraries.search.silk.web.webglide;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3210ad.C41713a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4294ad.C56636f;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.webglide.j */
/* compiled from: PG */
public final /* synthetic */ class C41363j implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkWebGlideMessageHandler f108093a;

    /* renamed from: b */
    public final /* synthetic */ C41713a f108094b;

    public /* synthetic */ C41363j(SilkWebGlideMessageHandler silkWebGlideMessageHandler, C41713a aVar) {
        this.f108093a = silkWebGlideMessageHandler;
        this.f108094b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkWebGlideMessageHandler silkWebGlideMessageHandler = this.f108093a;
        C41713a aVar = this.f108094b;
        C40769f fVar = silkWebGlideMessageHandler.f108081e;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C41357d(aVar), oVar, jSONObject, "WebGlide", "openWebPages", C56636f.f151205c.getParserForType());
    }
}

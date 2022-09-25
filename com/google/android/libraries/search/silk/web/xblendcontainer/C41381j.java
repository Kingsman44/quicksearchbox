package com.google.android.libraries.search.silk.web.xblendcontainer;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3211ae.C41714a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4295ae.C56648f;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.xblendcontainer.j */
/* compiled from: PG */
public final /* synthetic */ class C41381j implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkXblendContainerMessageHandler f108120a;

    /* renamed from: b */
    public final /* synthetic */ C41714a f108121b;

    public /* synthetic */ C41381j(SilkXblendContainerMessageHandler silkXblendContainerMessageHandler, C41714a aVar) {
        this.f108120a = silkXblendContainerMessageHandler;
        this.f108121b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkXblendContainerMessageHandler silkXblendContainerMessageHandler = this.f108120a;
        C41714a aVar = this.f108121b;
        C40769f fVar = silkXblendContainerMessageHandler.f108108d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C41377f(aVar), oVar, jSONObject, "XblendContainer", "prefetchXblendContent", C56648f.f151232a.getParserForType());
    }
}

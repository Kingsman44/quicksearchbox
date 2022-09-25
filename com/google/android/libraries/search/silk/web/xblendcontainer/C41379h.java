package com.google.android.libraries.search.silk.web.xblendcontainer;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3211ae.C41714a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4295ae.C56646d;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.xblendcontainer.h */
/* compiled from: PG */
public final /* synthetic */ class C41379h implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkXblendContainerMessageHandler f108117a;

    /* renamed from: b */
    public final /* synthetic */ C41714a f108118b;

    public /* synthetic */ C41379h(SilkXblendContainerMessageHandler silkXblendContainerMessageHandler, C41714a aVar) {
        this.f108117a = silkXblendContainerMessageHandler;
        this.f108118b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkXblendContainerMessageHandler silkXblendContainerMessageHandler = this.f108117a;
        C41714a aVar = this.f108118b;
        C40769f fVar = silkXblendContainerMessageHandler.f108108d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C41376e(aVar), oVar, jSONObject, "XblendContainer", "openFullScreenPane", C56646d.f151227c.getParserForType());
    }
}

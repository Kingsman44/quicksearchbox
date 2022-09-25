package com.google.android.libraries.search.silk.web.lens;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3226o.C41729a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56757ak;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.lens.i */
/* compiled from: PG */
public final /* synthetic */ class C40826i implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkLensMessageHandler f106996a;

    /* renamed from: b */
    public final /* synthetic */ C41729a f106997b;

    public /* synthetic */ C40826i(SilkLensMessageHandler silkLensMessageHandler, C41729a aVar) {
        this.f106996a = silkLensMessageHandler;
        this.f106997b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkLensMessageHandler silkLensMessageHandler = this.f106996a;
        C41729a aVar = this.f106997b;
        C40769f fVar = silkLensMessageHandler.f106986d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40827j(aVar), oVar, jSONObject, "Lens", "startLens", C56757ak.f151469k.getParserForType());
    }
}

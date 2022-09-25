package com.google.android.libraries.search.silk.web.footprintsconsent;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3222k.C41725a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4306k.C56722f;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.footprintsconsent.h */
/* compiled from: PG */
public final /* synthetic */ class C40783h implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkFootprintsConsentMessageHandler f106919a;

    /* renamed from: b */
    public final /* synthetic */ C41725a f106920b;

    public /* synthetic */ C40783h(SilkFootprintsConsentMessageHandler silkFootprintsConsentMessageHandler, C41725a aVar) {
        this.f106919a = silkFootprintsConsentMessageHandler;
        this.f106920b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkFootprintsConsentMessageHandler silkFootprintsConsentMessageHandler = this.f106919a;
        C41725a aVar = this.f106920b;
        C40769f fVar = silkFootprintsConsentMessageHandler.f106910d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40785j(aVar), oVar, jSONObject, "FootprintsConsent", "sendConsentResult", C56722f.f151389b.getParserForType());
    }
}

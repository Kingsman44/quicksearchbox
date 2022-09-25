package com.google.android.libraries.search.silk.web.footprintsconsent;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3222k.C41725a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4306k.C56724h;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.footprintsconsent.f */
/* compiled from: PG */
public final /* synthetic */ class C40781f implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkFootprintsConsentMessageHandler f106916a;

    /* renamed from: b */
    public final /* synthetic */ C41725a f106917b;

    public /* synthetic */ C40781f(SilkFootprintsConsentMessageHandler silkFootprintsConsentMessageHandler, C41725a aVar) {
        this.f106916a = silkFootprintsConsentMessageHandler;
        this.f106917b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkFootprintsConsentMessageHandler silkFootprintsConsentMessageHandler = this.f106916a;
        C41725a aVar = this.f106917b;
        C40769f fVar = silkFootprintsConsentMessageHandler.f106910d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40779d(aVar), oVar, jSONObject, "FootprintsConsent", "sendLoadingResult", C56724h.f151393b.getParserForType());
    }
}

package com.google.android.libraries.search.silk.web.initialization;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3225n.C41728a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.initialization.f */
/* compiled from: PG */
public final /* synthetic */ class C40811f implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkInitializationMessageHandler f106973a;

    public /* synthetic */ C40811f(SilkInitializationMessageHandler silkInitializationMessageHandler) {
        this.f106973a = silkInitializationMessageHandler;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkInitializationMessageHandler silkInitializationMessageHandler = this.f106973a;
        C40769f fVar = silkInitializationMessageHandler.f106967d;
        C41728a aVar = silkInitializationMessageHandler.f106966c;
        Objects.requireNonNull(aVar);
        fVar.mo42721e(new C40816k(aVar), oVar, jSONObject, "Initialization", "setSearchRefinementSuggestions");
    }
}

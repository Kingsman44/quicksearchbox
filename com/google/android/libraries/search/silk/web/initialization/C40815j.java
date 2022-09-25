package com.google.android.libraries.search.silk.web.initialization;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3225n.C41728a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4309n.C56745d;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.initialization.j */
/* compiled from: PG */
public final /* synthetic */ class C40815j implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkInitializationMessageHandler f106977a;

    public /* synthetic */ C40815j(SilkInitializationMessageHandler silkInitializationMessageHandler) {
        this.f106977a = silkInitializationMessageHandler;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkInitializationMessageHandler silkInitializationMessageHandler = this.f106977a;
        C40769f fVar = silkInitializationMessageHandler.f106967d;
        C41728a aVar = silkInitializationMessageHandler.f106966c;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40817l(aVar), oVar, jSONObject, "Initialization", "setSearchRefinementSuggestions", C56745d.f151443b.getParserForType());
    }
}

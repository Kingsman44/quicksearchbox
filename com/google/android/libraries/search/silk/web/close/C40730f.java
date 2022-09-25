package com.google.android.libraries.search.silk.web.close;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3218g.C41721a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.close.f */
/* compiled from: PG */
public final /* synthetic */ class C40730f implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkCloseMessageHandler f106817a;

    /* renamed from: b */
    public final /* synthetic */ C41721a f106818b;

    public /* synthetic */ C40730f(SilkCloseMessageHandler silkCloseMessageHandler, C41721a aVar) {
        this.f106817a = silkCloseMessageHandler;
        this.f106818b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkCloseMessageHandler silkCloseMessageHandler = this.f106817a;
        C41721a aVar = this.f106818b;
        C40769f fVar = silkCloseMessageHandler.f106811d;
        Objects.requireNonNull(aVar);
        fVar.mo42719c(new C40728d(aVar), oVar, jSONObject, "Close", "close");
    }
}

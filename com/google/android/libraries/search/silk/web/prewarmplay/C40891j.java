package com.google.android.libraries.search.silk.web.prewarmplay;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3232u.C41735a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.prewarmplay.j */
/* compiled from: PG */
public final /* synthetic */ class C40891j implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkPrewarmPlayMessageHandler f107112a;

    /* renamed from: b */
    public final /* synthetic */ C41735a f107113b;

    public /* synthetic */ C40891j(SilkPrewarmPlayMessageHandler silkPrewarmPlayMessageHandler, C41735a aVar) {
        this.f107112a = silkPrewarmPlayMessageHandler;
        this.f107113b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkPrewarmPlayMessageHandler silkPrewarmPlayMessageHandler = this.f107112a;
        C41735a aVar = this.f107113b;
        C40769f fVar = silkPrewarmPlayMessageHandler.f107101d;
        Objects.requireNonNull(aVar);
        fVar.mo42719c(new C40886e(aVar), oVar, jSONObject, "PrewarmPlay", "detach");
    }
}

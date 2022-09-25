package com.google.android.libraries.search.silk.web.share;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3235x.C41739b;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.share.n */
/* compiled from: PG */
public final /* synthetic */ class C40918n implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkShareMessageHandler f107168a;

    /* renamed from: b */
    public final /* synthetic */ C41739b f107169b;

    public /* synthetic */ C40918n(SilkShareMessageHandler silkShareMessageHandler, C41739b bVar) {
        this.f107168a = silkShareMessageHandler;
        this.f107169b = bVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkShareMessageHandler silkShareMessageHandler = this.f107168a;
        C41739b bVar = this.f107169b;
        C40769f fVar = silkShareMessageHandler.f107152e;
        Objects.requireNonNull(bVar);
        fVar.mo42719c(new C40911g(bVar), oVar, jSONObject, "Share", "bindCallbackToNativeShareButton");
    }
}

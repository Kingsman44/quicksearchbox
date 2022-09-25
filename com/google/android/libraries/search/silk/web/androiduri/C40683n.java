package com.google.android.libraries.search.silk.web.androiduri;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3213b.C41716a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4297b.C56654b;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.androiduri.n */
/* compiled from: PG */
public final /* synthetic */ class C40683n implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkAndroidUriMessageHandler f106725a;

    /* renamed from: b */
    public final /* synthetic */ C41716a f106726b;

    public /* synthetic */ C40683n(SilkAndroidUriMessageHandler silkAndroidUriMessageHandler, C41716a aVar) {
        this.f106725a = silkAndroidUriMessageHandler;
        this.f106726b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkAndroidUriMessageHandler silkAndroidUriMessageHandler = this.f106725a;
        C41716a aVar = this.f106726b;
        C40769f fVar = silkAndroidUriMessageHandler.f106709d;
        Objects.requireNonNull(aVar);
        fVar.mo42722f(new C40676g(aVar), oVar, jSONObject, "AndroidUri", "canLaunchApp", C56654b.f151243b.getParserForType());
    }
}

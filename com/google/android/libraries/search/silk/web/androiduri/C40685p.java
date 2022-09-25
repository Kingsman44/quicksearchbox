package com.google.android.libraries.search.silk.web.androiduri;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3213b.C41716a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4297b.C56666n;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.androiduri.p */
/* compiled from: PG */
public final /* synthetic */ class C40685p implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkAndroidUriMessageHandler f106728a;

    /* renamed from: b */
    public final /* synthetic */ C41716a f106729b;

    public /* synthetic */ C40685p(SilkAndroidUriMessageHandler silkAndroidUriMessageHandler, C41716a aVar) {
        this.f106728a = silkAndroidUriMessageHandler;
        this.f106729b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkAndroidUriMessageHandler silkAndroidUriMessageHandler = this.f106728a;
        C41716a aVar = this.f106729b;
        C40769f fVar = silkAndroidUriMessageHandler.f106709d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40673d(aVar), oVar, jSONObject, "AndroidUri", "launchAppViaIntentUri", C56666n.f151268b.getParserForType());
    }
}

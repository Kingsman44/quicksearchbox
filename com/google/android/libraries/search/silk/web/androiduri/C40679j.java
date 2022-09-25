package com.google.android.libraries.search.silk.web.androiduri;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3213b.C41716a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4297b.C56658f;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.androiduri.j */
/* compiled from: PG */
public final /* synthetic */ class C40679j implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkAndroidUriMessageHandler f106719a;

    /* renamed from: b */
    public final /* synthetic */ C41716a f106720b;

    public /* synthetic */ C40679j(SilkAndroidUriMessageHandler silkAndroidUriMessageHandler, C41716a aVar) {
        this.f106719a = silkAndroidUriMessageHandler;
        this.f106720b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkAndroidUriMessageHandler silkAndroidUriMessageHandler = this.f106719a;
        C41716a aVar = this.f106720b;
        C40769f fVar = silkAndroidUriMessageHandler.f106709d;
        Objects.requireNonNull(aVar);
        fVar.mo42722f(new C40677h(aVar), oVar, jSONObject, "AndroidUri", "canUriBeHandledByPackage", C56658f.f151251c.getParserForType());
    }
}

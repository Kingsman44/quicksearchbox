package com.google.android.libraries.search.silk.web.geolocation;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3223l.C41726a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.geolocation.f */
/* compiled from: PG */
public final /* synthetic */ class C40791f implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkGeolocationMessageHandler f106935a;

    /* renamed from: b */
    public final /* synthetic */ C41726a f106936b;

    public /* synthetic */ C40791f(SilkGeolocationMessageHandler silkGeolocationMessageHandler, C41726a aVar) {
        this.f106935a = silkGeolocationMessageHandler;
        this.f106936b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkGeolocationMessageHandler silkGeolocationMessageHandler = this.f106935a;
        C41726a aVar = this.f106936b;
        C40769f fVar = silkGeolocationMessageHandler.f106929d;
        Objects.requireNonNull(aVar);
        fVar.mo42721e(new C40796k(aVar), oVar, jSONObject, "Geolocation", "getCurrentLocation");
    }
}

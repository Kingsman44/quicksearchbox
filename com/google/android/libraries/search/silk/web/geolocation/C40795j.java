package com.google.android.libraries.search.silk.web.geolocation;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3223l.C41726a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.geolocation.j */
/* compiled from: PG */
public final /* synthetic */ class C40795j implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkGeolocationMessageHandler f106941a;

    /* renamed from: b */
    public final /* synthetic */ C41726a f106942b;

    public /* synthetic */ C40795j(SilkGeolocationMessageHandler silkGeolocationMessageHandler, C41726a aVar) {
        this.f106941a = silkGeolocationMessageHandler;
        this.f106942b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkGeolocationMessageHandler silkGeolocationMessageHandler = this.f106941a;
        C41726a aVar = this.f106942b;
        C40769f fVar = silkGeolocationMessageHandler.f106929d;
        Objects.requireNonNull(aVar);
        fVar.mo42721e(new C40797l(aVar), oVar, jSONObject, "Geolocation", "getGeolocationPermissionState");
    }
}

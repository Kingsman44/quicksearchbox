package com.google.android.libraries.search.silk.web.geolocation;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3223l.C41726a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56730f;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.geolocation.h */
/* compiled from: PG */
public final /* synthetic */ class C40793h implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkGeolocationMessageHandler f106938a;

    /* renamed from: b */
    public final /* synthetic */ C41726a f106939b;

    public /* synthetic */ C40793h(SilkGeolocationMessageHandler silkGeolocationMessageHandler, C41726a aVar) {
        this.f106938a = silkGeolocationMessageHandler;
        this.f106939b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkGeolocationMessageHandler silkGeolocationMessageHandler = this.f106938a;
        C41726a aVar = this.f106939b;
        C40769f fVar = silkGeolocationMessageHandler.f106929d;
        Objects.requireNonNull(aVar);
        fVar.mo42722f(new C40798m(aVar), oVar, jSONObject, "Geolocation", "getCurrentLocationWithOptions", C56730f.f151413b.getParserForType());
    }
}

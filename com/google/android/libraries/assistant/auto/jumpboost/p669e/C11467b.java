package com.google.android.libraries.assistant.auto.jumpboost.p669e;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.auto.p450a.p451a.C8912e;
import com.google.android.apps.auto.p450a.p451a.C8913f;
import com.google.android.gearhead.sdk.assistant.CarAssistantEvent;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.e.b */
/* compiled from: PG */
public final /* synthetic */ class C11467b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11469d f37263a;

    /* renamed from: b */
    public final /* synthetic */ Uri f37264b;

    public /* synthetic */ C11467b(C11469d dVar, Uri uri) {
        this.f37263a = dVar;
        this.f37264b = uri;
    }

    public final C60870cx apply(Object obj) {
        C11469d dVar = this.f37263a;
        Uri uri = this.f37264b;
        if (((Boolean) obj).booleanValue()) {
            C8912e eVar = (C8912e) C8913f.f30923e.createBuilder();
            String uri2 = uri.toString();
            eVar.copyOnWrite();
            C8913f fVar = (C8913f) eVar.instance;
            uri2.getClass();
            fVar.f30925a |= 4;
            fVar.f30928d = uri2;
            eVar.copyOnWrite();
            C8913f fVar2 = (C8913f) eVar.instance;
            fVar2.f30925a |= 2;
            fVar2.f30927c = "and.gsa.fusion.deeplink";
            return C60922j.m93044g(dVar.f37268c.mo20027d((C8913f) eVar.build()), C47810es.m84963c(C11466a.f37262a), dVar.f37269d);
        }
        Bundle bundle = new Bundle();
        bundle.putString("VOICE_SESSION_DEEPLINK_KEY", uri.toString());
        CarAssistantEvent carAssistantEvent = new CarAssistantEvent();
        carAssistantEvent.f387090a = 1;
        carAssistantEvent.f387093d = bundle;
        return C60922j.m93045h(dVar.f37267b.mo20063a(), C47810es.m84966f(new C11468c(carAssistantEvent)), dVar.f37269d);
    }
}

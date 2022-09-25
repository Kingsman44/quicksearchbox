package com.google.android.libraries.search.silk.web.uimodes;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3207aa.C41710a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.uimodes.e */
/* compiled from: PG */
public final /* synthetic */ class C40941e implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkUiModesMessageHandler f107218a;

    /* renamed from: b */
    public final /* synthetic */ C41710a f107219b;

    public /* synthetic */ C40941e(SilkUiModesMessageHandler silkUiModesMessageHandler, C41710a aVar) {
        this.f107218a = silkUiModesMessageHandler;
        this.f107219b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkUiModesMessageHandler silkUiModesMessageHandler = this.f107218a;
        C41710a aVar = this.f107219b;
        C40769f fVar = silkUiModesMessageHandler.f107211c;
        Objects.requireNonNull(aVar);
        fVar.mo42719c(new C40945i(aVar), oVar, jSONObject, "UiModes", "enterBasicMode");
    }
}

package com.google.android.libraries.search.silk.web.settings;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3234w.C41737a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4319x.C56835d;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.settings.d */
/* compiled from: PG */
public final /* synthetic */ class C40902d implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkSettingsMessageHandler f107141a;

    /* renamed from: b */
    public final /* synthetic */ C41737a f107142b;

    public /* synthetic */ C40902d(SilkSettingsMessageHandler silkSettingsMessageHandler, C41737a aVar) {
        this.f107141a = silkSettingsMessageHandler;
        this.f107142b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkSettingsMessageHandler silkSettingsMessageHandler = this.f107141a;
        C41737a aVar = this.f107142b;
        C40769f fVar = silkSettingsMessageHandler.f107136d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40903e(aVar), oVar, jSONObject, "Settings", "updateSettingValue", C56835d.f151640c.getParserForType());
    }
}

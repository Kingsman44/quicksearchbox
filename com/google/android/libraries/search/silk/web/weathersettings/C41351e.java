package com.google.android.libraries.search.silk.web.weathersettings;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3209ac.C41712a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4293ac.C56630b;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.weathersettings.e */
/* compiled from: PG */
public final /* synthetic */ class C41351e implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkWeatherSettingsMessageHandler f108070a;

    /* renamed from: b */
    public final /* synthetic */ C41712a f108071b;

    public /* synthetic */ C41351e(SilkWeatherSettingsMessageHandler silkWeatherSettingsMessageHandler, C41712a aVar) {
        this.f108070a = silkWeatherSettingsMessageHandler;
        this.f108071b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkWeatherSettingsMessageHandler silkWeatherSettingsMessageHandler = this.f108070a;
        C41712a aVar = this.f108071b;
        C40769f fVar = silkWeatherSettingsMessageHandler.f108065d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C41353g(aVar), oVar, jSONObject, "WeatherSettings", "updateTemperatureUnit", C56630b.f151195c.getParserForType());
    }
}

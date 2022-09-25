package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.widget.Toast;
import androidx.core.content.C1882h;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132659v;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10082b.C132610b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53258hf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.g */
/* compiled from: PG */
public final class C132643g {

    /* renamed from: a */
    public static final C59071e f361980a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.g");

    /* renamed from: b */
    public final ConfigurationActivity f361981b;

    /* renamed from: c */
    public final C132659v f361982c;

    /* renamed from: d */
    public final C132610b f361983d;

    /* renamed from: e */
    public final ConnectivityManager f361984e;

    public C132643g(ConfigurationActivity configurationActivity, C132659v vVar, C132610b bVar, ConnectivityManager connectivityManager) {
        this.f361981b = configurationActivity;
        this.f361982c = vVar;
        this.f361983d = bVar;
        this.f361984e = connectivityManager;
    }

    /* renamed from: a */
    public final int mo110849a() {
        Bundle extras = this.f361981b.getIntent().getExtras();
        if (extras != null) {
            return extras.getInt("appWidgetId", 0);
        }
        return 0;
    }

    /* renamed from: b */
    public final String mo110850b() {
        Bundle extras;
        Intent intent = this.f361981b.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return extras.getString("config_activity_trigger_type");
    }

    /* renamed from: c */
    public final void mo110851c() {
        C59104x d = f361980a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "WeatherWidgetConfigurationActivity");
        ((C59052c) ((C59052c) d).mo56372aa(39689)).mo56386p("#finishAndHaltInstallation()");
        mo110853e(0);
        this.f361981b.finish();
    }

    /* renamed from: d */
    public final void mo110852d() {
        C59104x d = f361980a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "WeatherWidgetConfigurationActivity");
        ((C59052c) ((C59052c) d).mo56372aa(39690)).mo56386p("#finishAndInstallWidget()");
        mo110853e(-1);
        if (!mo110855g()) {
            C132610b bVar = this.f361983d;
            C53258hf a = C132582aa.m215547a(this.f361981b.getApplicationContext(), mo110849a());
            C39141kp kpVar = bVar.f361909b;
            ((C19567d) kpVar.f103005dd.mo6453a()).mo24822a(1, a.name());
        }
        if (mo110849a() != 0) {
            if (C132582aa.m215550d(this.f361981b.getApplicationContext()).length + C132582aa.m215549c(this.f361981b.getApplicationContext()).length <= 1 && !mo110855g() && mo110856h()) {
                Toast.makeText(this.f361981b.getApplicationContext(), this.f361981b.getText(R.string.assistant_weather_widget_location_access_message_short), 1).show();
            }
        }
        this.f361981b.finish();
    }

    /* renamed from: e */
    public final void mo110853e(int i) {
        int a = mo110849a();
        if (a != 0) {
            Intent intent = new Intent();
            intent.putExtra("appWidgetIds", new int[]{a});
            this.f361981b.setResult(i, intent);
        }
    }

    /* renamed from: f */
    public final void mo110854f() {
        C59104x d = f361980a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "WeatherWidgetConfigurationActivity");
        ((C59052c) ((C59052c) d).mo56372aa(39693)).mo56386p("#updateAllWidgets()");
        C132659v vVar = this.f361982c;
        Context applicationContext = this.f361981b.getApplicationContext();
        C60870cx a = vVar.f362014b.mo104411a(C132659v.C132660a.class);
        C132656s sVar = new C132656s(applicationContext);
        C60922j.m93044g(a, C47810es.m84963c(sVar), vVar.f362013a);
    }

    /* renamed from: g */
    public final boolean mo110855g() {
        return mo110850b() != null;
    }

    /* renamed from: h */
    public final boolean mo110856h() {
        return C1882h.m5137c(this.f361981b, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0;
    }
}

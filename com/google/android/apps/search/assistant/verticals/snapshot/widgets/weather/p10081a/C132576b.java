package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10081a;

import android.content.Context;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.a.b */
/* compiled from: PG */
public final class C132576b {

    /* renamed from: d */
    private static final C59071e f361800d = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.a.b");

    /* renamed from: a */
    public final Context f361801a;

    /* renamed from: b */
    public final Boolean f361802b;

    /* renamed from: c */
    public final Boolean f361803c;

    /* renamed from: e */
    private final C60887da f361804e;

    public C132576b(Context context, C60887da daVar, Boolean bool, Boolean bool2) {
        this.f361801a = context;
        this.f361804e = daVar;
        this.f361802b = bool;
        this.f361803c = bool2;
    }

    /* renamed from: a */
    public final C60870cx mo110822a() {
        if (!C132577c.m215541a().booleanValue()) {
            return C60866ct.f164955a;
        }
        C59104x b = f361800d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "WeatherWidgetTNGFlagsImpl");
        ((C59052c) ((C59052c) b).mo56372aa(39755)).mo56389s("enableWidgetsForAllPixelsAndAndroidSProd: %b", this.f361803c);
        return this.f361804e.mo19399b(C47810es.m84978r(new C132575a(this)));
    }
}

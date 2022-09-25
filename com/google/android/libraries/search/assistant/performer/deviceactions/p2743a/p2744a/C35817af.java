package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.content.pm.PackageManager;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35934c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35935d;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.af */
/* compiled from: PG */
public final class C35817af {

    /* renamed from: a */
    public static final C59071e f93839a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.af");

    /* renamed from: b */
    public final PackageManager f93840b;

    /* renamed from: c */
    public final C35863t f93841c;

    /* renamed from: d */
    public final C60887da f93842d;

    /* renamed from: e */
    public final C35934c f93843e;

    public C35817af(PackageManager packageManager, C35863t tVar, C35935d dVar, C60887da daVar) {
        this.f93841c = tVar;
        this.f93842d = daVar;
        this.f93840b = packageManager;
        this.f93843e = dVar.mo39899a("device.GET_SETTINGS");
    }

    /* renamed from: a */
    public static void m64225a(Map map, String str, String str2, String str3) {
        map.put("battery_usage_app_names", str);
        map.put("noe_battery_usage_names", str2);
        map.put("noe_battery_usage_percentages", str3);
    }
}

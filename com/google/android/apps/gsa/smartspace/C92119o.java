package com.google.android.apps.gsa.smartspace;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.apps.gsa.smartspace.o */
/* compiled from: PG */
public final class C92119o {

    /* renamed from: c */
    private static final C59071e f256834c = C59071e.m91332i("com.google.android.apps.gsa.smartspace.o");

    /* renamed from: d */
    private static final ComponentName f256835d = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.smartspace.widget.SmartspaceWidgetProvider");

    /* renamed from: a */
    public final SharedPreferences f256836a;

    /* renamed from: b */
    public final C92118n f256837b;

    /* renamed from: e */
    private final Context f256838e;

    /* renamed from: f */
    private final C91123v f256839f;

    public C92119o(SharedPreferences sharedPreferences, Context context, C91123v vVar, C92118n nVar) {
        this.f256836a = sharedPreferences;
        this.f256838e = context;
        this.f256839f = vVar;
        this.f256837b = nVar;
    }

    /* renamed from: a */
    public final void mo86745a(boolean z) {
        this.f256836a.edit().putBoolean("smartspace_calendar_enabled", z).apply();
    }

    /* renamed from: b */
    public final void mo86746b(boolean z) {
        this.f256836a.edit().putBoolean("smartspace_reminder_enabled", z).apply();
    }

    /* renamed from: c */
    public final boolean mo86747c() {
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f256838e);
        return instance != null && !this.f256839f.mo85390b() && instance.getAppWidgetIds(f256835d).length > 0;
    }

    /* renamed from: d */
    public final boolean mo86748d(String str) {
        try {
            Boolean bool = (Boolean) PackageManager.class.getMethod("isPackageSuspended", new Class[]{String.class}).invoke(this.f256838e.getPackageManager(), new Object[]{str});
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            C59104x d = f256834c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SmartspaceIntentLgUtils");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(11960)).mo56386p("Failed to check package suspension status.");
            return false;
        }
    }

    /* renamed from: e */
    public final boolean mo86749e() {
        String str = Build.MODEL;
        return str.startsWith("Pixel") || this.f256838e.getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_2017_EXPERIENCE") || this.f256837b.mo64689a(C90014bt.f247552jM).contains(str);
    }

    /* renamed from: f */
    public final boolean mo86750f() {
        if (!mo86751g() || !this.f256836a.getBoolean("smartspace_birthday_enabled", true)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo86751g() {
        return mo86755k() && this.f256837b.mo64691c(C90014bt.f247696ly);
    }

    /* renamed from: h */
    public final boolean mo86752h() {
        if (!mo86753i() || !this.f256836a.getBoolean("smartspace_calendar_enabled", true)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo86753i() {
        return mo86755k() && !mo86748d("com.google.android.calendar");
    }

    /* renamed from: j */
    public final boolean mo86754j() {
        if (!mo86755k() || !this.f256836a.getBoolean("smartspace_commute_enabled", true)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo86755k() {
        if (this.f256836a.getBoolean("smartspace_enabled", false) || mo86747c() || mo86749e() || this.f256838e.getPackageManager().hasSystemFeature("com.google.android.googlequicksearchbox.SMARTSPACE_DEVICE_FEATURE")) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo86756l() {
        if (!mo86757m() || !this.f256836a.getBoolean("smartspace_flight_enabled", true)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean mo86757m() {
        return mo86749e() && Build.VERSION.SDK_INT >= 31 && this.f256837b.mo64691c(C90014bt.f247650lE);
    }

    /* renamed from: n */
    public final boolean mo86758n() {
        if (!mo86755k() || !this.f256836a.getBoolean("smartspace_reminder_enabled", true)) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean mo86759o() {
        if (!mo86760p() || !this.f256836a.getBoolean("smartspace_sports_enabled", true)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean mo86760p() {
        return mo86755k() && this.f256837b.mo64691c(C90014bt.f247656lK);
    }

    /* renamed from: q */
    public final boolean mo86761q() {
        return mo86755k() && this.f256837b.mo64691c(C90014bt.f247659lN);
    }

    /* renamed from: r */
    public final boolean mo86762r() {
        if (!mo86761q() || !this.f256836a.getBoolean("smartspace_stock_price_change_enabled", true)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final boolean mo86763s() {
        if (!mo86764t() || !this.f256836a.getBoolean("smartspace_weather_alert_enabled", true)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public final boolean mo86764t() {
        return mo86755k() && this.f256837b.mo64691c(C90014bt.f247661lP);
    }

    /* renamed from: u */
    public final boolean mo86765u() {
        if (!mo86755k() || !this.f256836a.getBoolean("smartspace_weather_enabled", true)) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean mo86766v() {
        if (!mo86755k() || !this.f256836a.getBoolean("smartspace_work_profile_access_enabled", true) || !this.f256837b.mo64691c(C90014bt.f247663lR)) {
            return false;
        }
        return true;
    }
}

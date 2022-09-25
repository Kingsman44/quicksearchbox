package com.google.android.apps.search.googleapp.searchwidget;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings;
import com.google.android.apps.search.googleapp.promomanager.p10371a.C136897a;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139070av;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139073ay;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139074az;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139077bb;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139079bd;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139080be;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60757n;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.z */
/* compiled from: PG */
public final class C139135z {

    /* renamed from: a */
    public static final ComponentName f378397a = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.googlequicksearchbox.SearchWidgetProvider");

    /* renamed from: c */
    private static final C59071e f378398c = C59071e.m91332i("com.google.android.apps.search.googleapp.searchwidget.z");

    /* renamed from: d */
    private static final ComponentName f378399d = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.searchwidget.GoogleSearchWidgetProvider");

    /* renamed from: b */
    public final Context f378400b;

    /* renamed from: e */
    private final C136897a f378401e;

    public C139135z(Context context, C136897a aVar) {
        this.f378400b = context;
        this.f378401e = aVar;
    }

    /* renamed from: a */
    public static int m226015a(C139080be beVar) {
        C139077bb a = C139077bb.m225892a(beVar.f378253d);
        if (a == null) {
            a = C139077bb.BAR_RADIUS_24;
        }
        C139079bd bdVar = C139079bd.THEME_UNKNOWN;
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return R.drawable.googleapp_gradient_protection_24dp;
        }
        if (ordinal == 1) {
            return R.drawable.googleapp_gradient_protection_2dp;
        }
        if (ordinal == 2) {
            return R.drawable.googleapp_gradient_protection_8dp;
        }
        if (ordinal == 3) {
            return R.drawable.googleapp_gradient_protection_24dp;
        }
        throw new AssertionError(a);
    }

    /* renamed from: b */
    public static int m226016b(C139080be beVar) {
        C139077bb a = C139077bb.m225892a(beVar.f378253d);
        if (a == null) {
            a = C139077bb.BAR_RADIUS_24;
        }
        C139079bd bdVar = C139079bd.THEME_UNKNOWN;
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return R.drawable.googleapp_search_widget_bg_24dp;
        }
        if (ordinal == 1) {
            return R.drawable.googleapp_search_widget_bg_2dp;
        }
        if (ordinal == 2) {
            return R.drawable.googleapp_search_widget_bg_8dp;
        }
        if (ordinal == 3) {
            return R.drawable.googleapp_search_widget_bg_24dp;
        }
        throw new AssertionError(a);
    }

    /* renamed from: c */
    public static int m226017c(C139080be beVar) {
        C139077bb a = C139077bb.m225892a(beVar.f378253d);
        if (a == null) {
            a = C139077bb.BAR_RADIUS_24;
        }
        C139079bd bdVar = C139079bd.THEME_UNKNOWN;
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return R.drawable.googleapp_search_widget_shadow_24dp;
        }
        if (ordinal == 1) {
            return R.drawable.googleapp_search_widget_shadow_2dp;
        }
        if (ordinal == 2) {
            return R.drawable.googleapp_search_widget_shadow_8dp;
        }
        if (ordinal == 3) {
            return R.drawable.googleapp_search_widget_shadow_24dp;
        }
        throw new AssertionError(a);
    }

    /* renamed from: d */
    public static C139080be m226018d() {
        C139070av avVar = (C139070av) C139080be.f378248g.createBuilder();
        avVar.copyOnWrite();
        C139080be beVar = (C139080be) avVar.instance;
        beVar.f378250a |= 1;
        beVar.f378251b = false;
        avVar.copyOnWrite();
        C139080be beVar2 = (C139080be) avVar.instance;
        beVar2.f378250a |= 2;
        beVar2.f378252c = 230;
        C139077bb bbVar = C139077bb.BAR_RADIUS_24;
        avVar.copyOnWrite();
        C139080be beVar3 = (C139080be) avVar.instance;
        beVar3.f378253d = bbVar.f378239e;
        beVar3.f378250a |= 4;
        avVar.copyOnWrite();
        C139080be beVar4 = (C139080be) avVar.instance;
        beVar4.f378254e = 1;
        beVar4.f378250a |= 8;
        C139073ay ayVar = (C139073ay) C139074az.f378227d.createBuilder();
        C139079bd bdVar = C139079bd.STANDARD_COLOR;
        ayVar.copyOnWrite();
        C139074az azVar = (C139074az) ayVar.instance;
        azVar.f378230b = bdVar.f378247f;
        azVar.f378229a |= 1;
        avVar.copyOnWrite();
        C139080be beVar5 = (C139080be) avVar.instance;
        C139074az azVar2 = (C139074az) ayVar.build();
        azVar2.getClass();
        beVar5.f378255f = azVar2;
        beVar5.f378250a |= 16;
        return (C139080be) avVar.build();
    }

    /* renamed from: e */
    public static Optional m226019e(Context context, C139080be beVar) {
        Resources resources = context.getResources();
        C139074az azVar = beVar.f378255f;
        if (azVar == null) {
            azVar = C139074az.f378227d;
        }
        C139079bd a = C139079bd.m225894a(azVar.f378230b);
        if (a == null) {
            a = C139079bd.THEME_UNKNOWN;
        }
        C139077bb bbVar = C139077bb.BAR_RADIUS_UNKNOWN;
        int ordinal = a.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return Optional.empty();
        }
        int i = R.color.google_grey700;
        if (ordinal == 2) {
            return Optional.m71637of(Integer.valueOf(resources.getColor(R.color.google_grey700)));
        }
        if (ordinal == 3) {
            return Optional.m71637of(Integer.valueOf(resources.getColor(R.color.google_white)));
        }
        if (ordinal == 4) {
            C139074az azVar2 = beVar.f378255f;
            if (azVar2 == null) {
                azVar2 = C139074az.f378227d;
            }
            int i2 = azVar2.f378231c;
            int red = Color.red(i2);
            int green = Color.green(i2);
            int blue = Color.blue(i2);
            Resources resources2 = context.getResources();
            double d = (double) red;
            Double.isNaN(d);
            double d2 = (double) green;
            Double.isNaN(d2);
            double d3 = (d * 0.299d) + (d2 * 0.587d);
            double d4 = (double) blue;
            Double.isNaN(d4);
            if (1.0d - ((d3 + (d4 * 0.114d)) / 255.0d) >= 0.5d) {
                i = R.color.google_white;
            }
            return Optional.m71637of(Integer.valueOf(resources2.getColor(i)));
        }
        throw new AssertionError(a);
    }

    /* renamed from: f */
    public static Optional m226020f(Context context, C139080be beVar) {
        Resources resources = context.getResources();
        C139074az azVar = beVar.f378255f;
        if (azVar == null) {
            azVar = C139074az.f378227d;
        }
        C139079bd a = C139079bd.m225894a(azVar.f378230b);
        if (a == null) {
            a = C139079bd.THEME_UNKNOWN;
        }
        C139077bb bbVar = C139077bb.BAR_RADIUS_UNKNOWN;
        int ordinal = a.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return Optional.empty();
        }
        if (ordinal == 2) {
            return Optional.m71637of(Integer.valueOf(resources.getColor(R.color.google_white)));
        }
        if (ordinal == 3) {
            return Optional.m71637of(Integer.valueOf(resources.getColor(R.color.google_black)));
        }
        if (ordinal == 4) {
            C139074az azVar2 = beVar.f378255f;
            if (azVar2 == null) {
                azVar2 = C139074az.f378227d;
            }
            return Optional.m71637of(Integer.valueOf(azVar2.f378231c));
        }
        throw new AssertionError(a);
    }

    /* renamed from: o */
    static boolean m226021o(Bundle bundle) {
        return bundle.getInt("appWidgetCategory") == 4;
    }

    /* renamed from: r */
    private final boolean m226022r() {
        UserManager userManager = (UserManager) this.f378400b.getSystemService("user");
        if (userManager == null || userManager.getUserProfiles().size() <= 1) {
            return false;
        }
        for (UserHandle equals : userManager.getUserProfiles()) {
            if (!equals.equals(Process.myUserHandle())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    private final int[] m226023s(ComponentName componentName) {
        try {
            AppWidgetManager instance = AppWidgetManager.getInstance(this.f378400b);
            if (instance == null) {
                return new int[0];
            }
            return instance.getAppWidgetIds(componentName);
        } catch (SecurityException unused) {
            return new int[0];
        }
    }

    /* renamed from: g */
    public final String mo114758g() {
        String string = Settings.Secure.getString(this.f378400b.getContentResolver(), "selected_search_engine_aga");
        return (string == null || "NO_DATA".equals(string)) ? "com.google.android.googlequicksearchbox" : string;
    }

    /* renamed from: h */
    public final void mo114759h() {
        Intent intent = new Intent("update-widget");
        intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.googlequicksearchbox.SearchWidgetProvider"));
        intent.addFlags(268435456);
        intent.putExtra("update_widget_customization", true);
        this.f378400b.sendBroadcast(intent);
    }

    /* renamed from: i */
    public final void mo114760i() {
        ComponentName componentName = f378399d;
        boolean z = false;
        if (mo114763l() && !mo114764m() && !m226022r()) {
            z = true;
        }
        if (z || m226023s(componentName).length <= 0) {
            try {
                int componentEnabledSetting = this.f378400b.getPackageManager().getComponentEnabledSetting(componentName);
                int i = true != z ? 2 : 1;
                if (componentEnabledSetting != i) {
                    this.f378400b.getPackageManager().setComponentEnabledSetting(componentName, i, 1);
                }
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f378398c.mo56225c()).mo56382g(e)).mo56372aa(41316)).mo56386p("Couldn't find GoogleSearchWidget component.");
            }
        }
    }

    /* renamed from: j */
    public final void mo114761j(boolean z) {
        C46459k.m82829b(this.f378401e.mo103979d(z), "Failed to update widget presence.", new Object[0]);
    }

    /* renamed from: k */
    public final void mo114762k() {
        boolean z = (mo114763l() && !mo114764m()) || m226022r();
        if (z) {
            try {
                AppWidgetManager.getInstance(this.f378400b).updateAppWidgetProviderInfo(f378397a, "hidden_provider_info");
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f378398c.mo56226d()).mo56382g(e)).mo56372aa(41318)).mo56389s("Failed to update SearchWidgetProviderInfo to %s.", true != z ? "Google" : "hidden");
            }
        } else {
            AppWidgetManager.getInstance(this.f378400b).updateAppWidgetProviderInfo(f378397a, "android.appwidget.provider");
        }
    }

    /* renamed from: l */
    public final boolean mo114763l() {
        try {
            if ((this.f378400b.getPackageManager().getApplicationInfo("com.google.android.googlequicksearchbox", 0).flags & 129) == 0 || !this.f378400b.getPackageManager().hasSystemFeature("com.google.android.feature.EEA_V2_DEVICE")) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f378398c.mo56225c()).mo56382g(e)).mo56372aa(41320)).mo56389s("Could not find ApplicationInfo for %s", "com.google.android.googlequicksearchbox");
        }
    }

    /* renamed from: m */
    public final boolean mo114764m() {
        return "com.google.android.googlequicksearchbox".equals(mo114758g());
    }

    /* renamed from: n */
    public final boolean mo114765n() {
        return mo114763l() && !mo114764m();
    }

    /* renamed from: p */
    public final int[] mo114766p() {
        return C60757n.m92751l(m226023s(f378397a), m226023s(f378399d));
    }

    /* renamed from: q */
    public final int[] mo114767q() {
        return C60757n.m92751l(mo114764m() ? m226023s(f378397a) : new int[0], m226023s(f378399d));
    }
}

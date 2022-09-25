package com.google.android.apps.gsa.shared.p6995aq;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.C90771bo;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60757n;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.aq.aa */
/* compiled from: PG */
public final class C89257aa {

    /* renamed from: a */
    public static final C58485gu f242019a = C58485gu.m89848p(C89258ab.EMPTY, C89258ab.HIDDEN, C89258ab.UNKNOWN);

    /* renamed from: b */
    public static final C58528ij f242020b = C58528ij.m90015O("android.appwidget.action.APPWIDGET_UPDATE", "android.appwidget.action.APPWIDGET_UPDATE_OPTIONS", "android.appwidget.action.APPWIDGET_DELETED", "android.appwidget.action.APPWIDGET_ENABLED", "android.appwidget.action.APPWIDGET_DISABLED", "android.appwidget.action.APPWIDGET_RESTORED", "update-widget-intent", "update-widget");

    /* renamed from: c */
    public static final C58528ij f242021c = C58528ij.m90011K("com.google.android.finsky.intent.action.UPDATE_DSE", "com.google.android.finsky.intent.action.UPDATE_DSE_APP_STATE");

    /* renamed from: e */
    private static final C59071e f242022e = C59071e.m91332i("com.google.android.apps.gsa.shared.aq.aa");

    /* renamed from: f */
    private static final int[] f242023f = new int[0];

    /* renamed from: d */
    public final Context f242024d;

    /* renamed from: g */
    private final C90021c f242025g;

    public C89257aa(Context context, C90021c cVar) {
        this.f242024d = context;
        this.f242025g = cVar;
    }

    /* renamed from: a */
    public static ComponentName m145189a() {
        return new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.searchwidget.GoogleSearchWidgetProvider");
    }

    /* renamed from: b */
    public static ComponentName m145190b() {
        return new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.googlequicksearchbox.SearchWidgetProvider");
    }

    /* renamed from: c */
    public static Intent m145191c(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://play.google.com/store/apps/details?id=%s", new Object[]{str})));
    }

    /* renamed from: d */
    public static Intent m145192d(C89283z zVar, String str) {
        Intent a = C90334c.m146886a("com.google.android.apps.gsa.monet.searchwidget.WidgetCustomizationActivity", new C23129y("customization.customization-root"), C23245b.m43556a(zVar));
        a.putExtra("widget-customization-source-key", str);
        a.setFlags(268468224);
        return a;
    }

    /* renamed from: e */
    public static Intent m145193e() {
        Intent intent = new Intent("update-widget-intent");
        intent.setComponent(m145190b());
        return intent;
    }

    /* renamed from: f */
    public static Intent m145194f(List list, List list2) {
        boolean isEmpty = TextUtils.isEmpty(new C58827ar(BuildConfig.FLAVOR).mo56097d(list).trim());
        Intent intent = new Intent("update-hint");
        intent.setComponent(m145190b());
        intent.putStringArrayListExtra("hint-texts", isEmpty ? new ArrayList() : new ArrayList(list));
        intent.putStringArrayListExtra("alternative-small-hint-texts", isEmpty ? new ArrayList() : new ArrayList(list2));
        return intent;
    }

    /* renamed from: g */
    public static C89258ab m145195g(SharedPreferences sharedPreferences, int i) {
        String valueOf = String.valueOf(i);
        Set<String> stringSet = sharedPreferences.getStringSet("search_widgets_with_big_hint_ids", (Set) null);
        if (stringSet != null && stringSet.contains(valueOf)) {
            return C89258ab.BIG_HINT;
        }
        Set<String> stringSet2 = sharedPreferences.getStringSet("search_widgets_with_small_hint_ids", (Set) null);
        if (stringSet2 != null && stringSet2.contains(valueOf)) {
            return C89258ab.SMALL_HINT;
        }
        Set<String> stringSet3 = sharedPreferences.getStringSet("search_widgets_with_hidden_hint_ids", (Set) null);
        if (stringSet3 != null && stringSet3.contains(valueOf)) {
            return C89258ab.HIDDEN;
        }
        if (sharedPreferences.getString("search_widget_current_hint_list", BuildConfig.FLAVOR).isEmpty()) {
            return C89258ab.EMPTY;
        }
        return C89258ab.UNKNOWN;
    }

    /* renamed from: i */
    public static void m145196i(AppWidgetManager appWidgetManager, int i, RemoteViews remoteViews, boolean z, C89911f fVar) {
        if (z) {
            try {
                appWidgetManager.partiallyUpdateAppWidget(i, remoteViews);
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f242022e.mo56225c()).mo56382g(e)).mo56372aa(11062)).mo56387q("Failed to update the appWidget (id=%d)", i);
                fVar.mo83755a(e, 28057326, 29).mo83721a();
            } catch (RuntimeException e2) {
                ((C59052c) ((C59052c) ((C59052c) f242022e.mo56225c()).mo56382g(e2)).mo56372aa(11063)).mo56387q("System crashed while updating appWidget (id=%d)", i);
            }
        } else {
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
    }

    /* renamed from: o */
    public static boolean m145197o(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("search_widget_present", false);
    }

    /* renamed from: u */
    public static Intent m145198u() {
        Intent intent = new Intent("com.google.android.apps.gsa.searchwidget.SHOW_WIDGET_CUSTOMIZATION");
        intent.setComponent(m145190b());
        intent.putExtra("widget-customization-source-key", "account-drawer");
        intent.setFlags(268435456);
        return intent;
    }

    /* renamed from: v */
    public static Intent m145199v(String str) {
        return m145194f(C58485gu.m89846n(str), C58485gu.m89846n(BuildConfig.FLAVOR));
    }

    /* renamed from: h */
    public final String mo83217h() {
        String string = Settings.Secure.getString(this.f242024d.getContentResolver(), "selected_search_engine_aga");
        return (string == null || "NO_DATA".equals(string)) ? "com.google.android.googlequicksearchbox" : string;
    }

    /* renamed from: j */
    public final void mo83218j() {
        int[] iArr;
        ComponentName a = m145189a();
        boolean z = false;
        if (mo83220l() && !mo83221m() && !C90771bo.m148273b(this.f242024d, UserHandleCompat.m148154a())) {
            z = true;
        }
        if (!z) {
            AppWidgetManager instance = AppWidgetManager.getInstance(this.f242024d);
            if (instance != null) {
                iArr = instance.getAppWidgetIds(m145189a());
            } else {
                iArr = f242023f;
            }
            if (iArr.length > 0) {
                return;
            }
        }
        try {
            int componentEnabledSetting = this.f242024d.getPackageManager().getComponentEnabledSetting(a);
            int i = true != z ? 2 : 1;
            if (componentEnabledSetting != i) {
                this.f242024d.getPackageManager().setComponentEnabledSetting(a, i, 1);
            }
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) f242022e.mo56225c()).mo56382g(e)).mo56372aa(11066)).mo56386p("Couldn't find GoogleSearchWidget component.");
        }
    }

    /* renamed from: k */
    public final void mo83219k() {
        boolean z = (mo83220l() && !mo83221m()) || C90771bo.m148273b(this.f242024d, UserHandleCompat.m148154a());
        if (z) {
            try {
                AppWidgetManager.getInstance(this.f242024d).updateAppWidgetProviderInfo(m145190b(), "hidden_provider_info");
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f242022e.mo56226d()).mo56382g(e)).mo56372aa(11068)).mo56389s("Failed to update SearchWidgetProviderInfo to %s.", true != z ? "Google" : "hidden");
            }
        } else {
            AppWidgetManager.getInstance(this.f242024d).updateAppWidgetProviderInfo(m145190b(), "android.appwidget.provider");
        }
    }

    /* renamed from: l */
    public final boolean mo83220l() {
        try {
            if ((this.f242024d.getPackageManager().getApplicationInfo("com.google.android.googlequicksearchbox", 0).flags & 129) == 0 || !this.f242024d.getPackageManager().hasSystemFeature("com.google.android.feature.EEA_V2_DEVICE") || !this.f242025g.mo79746e(C89985ax.f246721d)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f242022e.mo56225c()).mo56382g(e)).mo56372aa(11070)).mo56389s("Could not find ApplicationInfo for %s", "com.google.android.googlequicksearchbox");
        }
    }

    /* renamed from: m */
    public final boolean mo83221m() {
        return "com.google.android.googlequicksearchbox".equals(mo83217h());
    }

    /* renamed from: n */
    public final boolean mo83222n(int i) {
        AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(this.f242024d).getAppWidgetInfo(i);
        return appWidgetInfo == null || appWidgetInfo.provider == null || appWidgetInfo.provider.equals(m145190b());
    }

    /* renamed from: p */
    public final boolean mo83223p() {
        return !mo83224q() && mo83227t().length > 0;
    }

    /* renamed from: q */
    public final boolean mo83224q() {
        return mo83220l() && !mo83221m();
    }

    /* renamed from: r */
    public final int[] mo83225r(int[] iArr) {
        if (!mo83220l() || mo83221m()) {
            return iArr;
        }
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (!mo83222n(i)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return C60757n.m92752m(arrayList);
    }

    /* renamed from: s */
    public final int[] mo83226s() {
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f242024d);
        if (instance == null) {
            return f242023f;
        }
        return C60757n.m92751l(instance.getAppWidgetIds(m145190b()), instance.getAppWidgetIds(m145189a()));
    }

    /* renamed from: t */
    public final int[] mo83227t() {
        int[] iArr;
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f242024d);
        if (instance == null) {
            return f242023f;
        }
        if (!mo83221m()) {
            iArr = f242023f;
        } else {
            iArr = instance.getAppWidgetIds(m145190b());
        }
        return C60757n.m92751l(iArr, instance.getAppWidgetIds(m145189a()));
    }
}

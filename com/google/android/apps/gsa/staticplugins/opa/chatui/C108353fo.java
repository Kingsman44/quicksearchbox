package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.os.UserHandle;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120919ao;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120920ap;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120921aq;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120922ar;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120923as;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120927aw;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120930az;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.fo */
/* compiled from: PG */
public final class C108353fo implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ OpaAppWidgetCard f301394a;

    public C108353fo(OpaAppWidgetCard opaAppWidgetCard) {
        this.f301394a = opaAppWidgetCard;
    }

    public final void onGlobalLayout() {
        C120923as asVar;
        C108354fp fpVar;
        AppWidgetProviderInfo appWidgetProviderInfo;
        if (!this.f301394a.f300916a.isDone()) {
            OpaAppWidgetCard opaAppWidgetCard = this.f301394a;
            SettableFuture settableFuture = opaAppWidgetCard.f300916a;
            C120921aq aqVar = opaAppWidgetCard.f300917b;
            aqVar.getClass();
            C120923as asVar2 = opaAppWidgetCard.f300918c;
            if (asVar2 != null) {
                asVar2.mo104996e();
            }
            ViewGroup viewGroup = (ViewGroup) opaAppWidgetCard.findViewById(R.id.widget_card_wrapper);
            int measuredWidth = viewGroup.getMeasuredWidth();
            AppWidgetManager appWidgetManager = opaAppWidgetCard.f300920e;
            C120919ao aoVar = new C120919ao(measuredWidth, aqVar.mo104981b());
            if (aqVar.mo104980a() != null) {
                Iterator<AppWidgetProviderInfo> it = appWidgetManager.getInstalledProvidersForPackage(aqVar.mo104987i(), (UserHandle) null).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ComponentName a = aqVar.mo104980a();
                        a.getClass();
                        String className = a.getClassName();
                        ComponentName a2 = aqVar.mo104980a();
                        a2.getClass();
                        ((C59052c) ((C59052c) C120927aw.f336217a.mo56226d()).mo56372aa(35659)).mo56354G("Could not find widget provider %s from %s", className, a2.getPackageName());
                        C120922ar b = C120923as.m200152b();
                        ((C120930az) b).f336241c = 5;
                        asVar = b.mo104991a();
                        break;
                    }
                    AppWidgetProviderInfo next = it.next();
                    if (next.provider.equals(aqVar.mo104980a())) {
                        asVar = C120927aw.m200159a(appWidgetManager, aqVar, viewGroup, aoVar, next);
                        break;
                    }
                }
            } else if (aqVar.mo104987i() != null) {
                List<AppWidgetProviderInfo> installedProvidersForPackage = appWidgetManager.getInstalledProvidersForPackage(aqVar.mo104987i(), (UserHandle) null);
                if (installedProvidersForPackage.isEmpty()) {
                    ((C59052c) ((C59052c) C120927aw.f336217a.mo56226d()).mo56372aa(35657)).mo56389s("No widget providers found for %s", aqVar.mo104987i());
                    C120922ar b2 = C120923as.m200152b();
                    ((C120930az) b2).f336241c = 3;
                    asVar = b2.mo104991a();
                } else {
                    Iterator<AppWidgetProviderInfo> it2 = installedProvidersForPackage.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            appWidgetProviderInfo = null;
                            break;
                        }
                        appWidgetProviderInfo = it2.next();
                        int i = appWidgetProviderInfo.widgetFeatures;
                        boolean z = ((i & 4) == 0 && (i & 1) == 0) ? false : true;
                        if (appWidgetProviderInfo.configure != null) {
                            if (z) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (appWidgetProviderInfo == null) {
                        ((C59052c) ((C59052c) C120927aw.f336217a.mo56226d()).mo56372aa(35656)).mo56389s("No widget providers found without a configuration activity for %s", aqVar.mo104987i());
                        C120922ar b3 = C120923as.m200152b();
                        ((C120930az) b3).f336241c = 4;
                        asVar = b3.mo104991a();
                    } else {
                        C120920ap d = aqVar.mo104982d();
                        d.mo104973i(appWidgetProviderInfo.provider);
                        asVar = C120927aw.m200159a(appWidgetManager, d.mo104967c(), viewGroup, aoVar, appWidgetProviderInfo);
                    }
                }
            } else {
                C120922ar b4 = C120923as.m200152b();
                ((C120930az) b4).f336241c = 3;
                asVar = b4.mo104991a();
            }
            opaAppWidgetCard.f300918c = asVar;
            int f = asVar.mo104997f();
            int i2 = f - 1;
            if (f != 0) {
                if (i2 == 0) {
                    ((TextView) opaAppWidgetCard.findViewById(R.id.widget_card_footer)).setText(opaAppWidgetCard.f300919d.getString(R.string.widget_footer_text, new Object[]{aqVar.mo104985g()}));
                    if (aqVar.mo104989k()) {
                        aqVar.mo104990l().mo96808a(Locale.getDefault().toLanguageTag(), opaAppWidgetCard.f300919d.getString(R.string.widget_fallback_text, new Object[]{aqVar.mo104986h()}));
                        opaAppWidgetCard.mo96561d(opaAppWidgetCard.f300919d.getString(R.string.widget_fallback_text, new Object[]{aqVar.mo104985g()}));
                    }
                    fpVar = C108354fp.OK;
                } else if (i2 != 2) {
                    aqVar.mo104990l().mo96808a(Locale.getDefault().toLanguageTag(), opaAppWidgetCard.f300919d.getString(R.string.widget_error_text, new Object[]{aqVar.mo104986h()}));
                    opaAppWidgetCard.mo96561d(opaAppWidgetCard.f300919d.getString(R.string.widget_error_text, new Object[]{aqVar.mo104985g()}));
                    fpVar = C108354fp.NO_RENDERED_RESULT;
                } else {
                    aqVar.mo104990l().mo96808a(Locale.getDefault().toLanguageTag(), opaAppWidgetCard.f300919d.getString(R.string.no_widget_text, new Object[]{aqVar.mo104986h()}));
                    opaAppWidgetCard.mo96561d(opaAppWidgetCard.f300919d.getString(R.string.no_widget_text, new Object[]{aqVar.mo104985g()}));
                    fpVar = C108354fp.NO_RENDERED_RESULT;
                }
                settableFuture.mo57356n(fpVar);
            } else {
                throw null;
            }
        }
        this.f301394a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}

package com.google.android.apps.search.googleapp.promomanager.p10377f;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import androidx.core.app.C1793aj;
import androidx.core.app.C1800aq;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134712j;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139322d;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139323e;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139324f;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139325g;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139326h;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139338t;
import com.google.android.apps.search.weather.p10685d.C142073b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56609a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.protos.p4880aq.C63752i;
import com.google.protos.p4880aq.C63758o;
import java.util.ArrayList;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.j */
/* compiled from: PG */
public final class C137116j {

    /* renamed from: b */
    private static final C59071e f373113b = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.f.j");

    /* renamed from: a */
    final Context f373114a;

    /* renamed from: c */
    private final Fragment f373115c;

    /* renamed from: d */
    private final AccountId f373116d;

    /* renamed from: e */
    private final C139338t f373117e;

    /* renamed from: f */
    private final C21370a f373118f;

    public C137116j(Fragment fragment, AccountId accountId, C139338t tVar, C21370a aVar) {
        this.f373115c = fragment;
        this.f373114a = fragment.getContext();
        this.f373116d = accountId;
        this.f373117e = tVar;
        this.f373118f = aVar;
    }

    /* renamed from: b */
    private final void m222822b(Intent intent) {
        String string = this.f373114a.getResources().getString(R.string.googleapp_weather_query);
        ((ShortcutManager) this.f373114a.getSystemService(ShortcutManager.class)).requestPinShortcut(new ShortcutInfo.Builder(this.f373114a, "WeatherHomescreenShortcut").setShortLabel(string).setLongLabel(string).setIcon(Icon.createWithResource(this.f373114a, R.mipmap.product_logo_weather_launcher_color_48)).setIntent(intent).build(), PendingIntent.getActivity(this.f373114a, 0, new Intent("android.intent.action.MAIN").addFlags(268435456).addCategory("android.intent.category.HOME"), 1140850688).getIntentSender());
    }

    /* renamed from: c */
    private final void m222823c() {
        C47709i.m84861a(this.f373115c, new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", this.f373114a.getApplicationInfo().packageName));
    }

    /* renamed from: d */
    private final void m222824d(String str) {
        if (!C1793aj.m4937b(new C1800aq(this.f373114a).f5622a)) {
            m222823c();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("importance");
        Intent putExtra = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", this.f373114a.getApplicationInfo().packageName).putExtra("android.provider.extra.CHANNEL_ID", str);
        putExtra.putStringArrayListExtra("android.provider.extra.CHANNEL_FILTER_LIST", arrayList);
        C47709i.m84861a(this.f373115c, putExtra);
    }

    /* renamed from: e */
    private final void m222825e(String str) {
        C56609a aVar = (C56609a) C56610b.f151140k.createBuilder();
        aVar.copyOnWrite();
        C56610b bVar = (C56610b) aVar.instance;
        bVar.f151142a |= 2;
        bVar.f151144c = str;
        aVar.copyOnWrite();
        C56610b bVar2 = (C56610b) aVar.instance;
        bVar2.f151142a |= 1;
        bVar2.f151143b = "https://searchwebstories.withgoogle.com/discover-ways-to-search/";
        C139323e eVar = (C139323e) C139324f.f378925k.createBuilder();
        eVar.mo114903b((C56610b) aVar.build());
        C139325g gVar = (C139325g) C139326h.f378938c.createBuilder();
        gVar.copyOnWrite();
        C139326h hVar = (C139326h) gVar.instance;
        hVar.f378940a |= 1;
        hVar.f378941b = true;
        C139326h hVar2 = (C139326h) gVar.build();
        eVar.copyOnWrite();
        C139324f fVar = (C139324f) eVar.instance;
        hVar2.getClass();
        fVar.f378933g = hVar2;
        fVar.f378927a |= 16;
        eVar.copyOnWrite();
        C139324f fVar2 = (C139324f) eVar.instance;
        fVar2.f378927a |= 64;
        fVar2.f378935i = true;
        eVar.copyOnWrite();
        C139324f fVar3 = (C139324f) eVar.instance;
        fVar3.f378932f = 2;
        fVar3.f378927a |= 8;
        try {
            C47709i.m84861a(this.f373115c, this.f373117e.mo114907a((C139324f) eVar.build(), this.f373116d));
        } catch (C139322d e) {
            ((C59052c) ((C59052c) ((C59052c) f373113b.mo56225c()).mo56382g(e)).mo56372aa(40900)).mo56386p("Could not open stamp viewer.");
        }
    }

    /* renamed from: a */
    public final void mo113536a(C63758o oVar) {
        String str;
        if ((oVar.f172483a & 1) == 0) {
            int a = C63752i.m96302a(oVar.f172485c);
            if (a == 0) {
                a = 1;
            }
            C59052c cVar = (C59052c) ((C59052c) f373113b.mo56224b()).mo56372aa(40899);
            switch (a) {
                case 1:
                    str = "ACTION_UNKNOWN";
                    break;
                case 2:
                    str = "ACTION_PIN_SEARCH_WIDGET";
                    break;
                case 3:
                    str = "ACTION_LAUNCH_LENS";
                    break;
                case 4:
                    str = "ACTION_MANAGE_WAA_SETTINGS";
                    break;
                case 5:
                    str = "ACTION_OPEN_STAMP_VIEWER_V3";
                    break;
                case 6:
                    str = "ACTION_OPEN_STAMP_VIEWER_V4";
                    break;
                case 7:
                    str = "ACTION_ADD_SRP_WEATHER_SHORTCUT";
                    break;
                case 8:
                    str = "ACTION_ADD_FROGGY_WEATHER_SHORTCUT";
                    break;
                case 9:
                    str = "ACTION_OPEN_SIGN_IN_PAGE";
                    break;
                case 10:
                    str = "ACTION_OPEN_SRP_WITH_TIGER_QUERY";
                    break;
                case 11:
                    str = "ACTION_OPTIN_APP_NOTIFICATION";
                    break;
                case 12:
                    str = "ACTION_OPTIN_SPORTS_NOTIFICATION";
                    break;
                case 13:
                    str = "ACTION_OPTIN_NEWS_NOTIFICATION";
                    break;
                default:
                    str = "ACTION_OPTIN_WEATHER_NOTIFICATION";
                    break;
            }
            cVar.mo56389s("Handling custom action %s", str);
            switch (a - 1) {
                case 0:
                    throw new IllegalArgumentException("Custom action is unknown.");
                case 1:
                    AppWidgetManager.getInstance(this.f373114a).requestPinAppWidget(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.googlequicksearchbox.SearchWidgetProvider"), (Bundle) null, (PendingIntent) null);
                    return;
                case 3:
                    this.f373115c.startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 224).putExtra("extra.screen.myactivityProduct", "search").putExtra("extra.screen.myactivityUtmSource", "agsa").putExtra("extra.screen.myactivityUtmCampaign", "homepage-waatout"), 0);
                    return;
                case 4:
                    m222825e("https://searchwebstories-withgoogle-com.cdn.ampproject.org/c/s/searchwebstories.withgoogle.com/discover-ways-to-search/?utm_medium=aga&utm_source=nsupromo&utm_campaign=EN_v3");
                    return;
                case 5:
                    m222825e("https://searchwebstories-withgoogle-com.cdn.ampproject.org/c/s/searchwebstories.withgoogle.com/discover-ways-to-search/?utm_medium=aga&utm_source=nsupromo&utm_campaign=EN_v4");
                    return;
                case 6:
                    long b = this.f373118f.mo26870b();
                    Intent putExtra = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH").setClassName(this.f373114a, "com.google.android.googlequicksearchbox.SearchActivity").putExtra("id", "Weather_" + b).putExtra("query", this.f373114a.getResources().getString(R.string.googleapp_weather_query)).putExtra("query-header-visibility", 1).putExtra("ved", "1t:54131");
                    putExtra.putExtra("source", "and.gsa.weather.launcher.icon");
                    m222822b(putExtra);
                    return;
                case 7:
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    C142073b.m230648b(intent);
                    intent.putExtra("source", "and.gsa.weather.launcher.icon");
                    m222822b(intent);
                    return;
                case 8:
                    C47393f.m84237h(C134712j.f366831a, this.f373115c.requireView());
                    return;
                case 9:
                    String string = this.f373114a.getString(R.string.googleapp_srp_query_tiger);
                    Optional of = Optional.m71637of("/m/07dm6");
                    Optional of2 = Optional.m71637of("ar_promo");
                    Intent intent2 = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
                    if (of.isPresent()) {
                        intent2.putExtra("kg-mid", (String) of.get());
                    }
                    intent2.putExtra("query", string);
                    if (of2.isPresent()) {
                        intent2.putExtra("source", (String) of2.get());
                    }
                    C47709i.m84861a(this.f373115c, intent2);
                    return;
                case 10:
                    m222823c();
                    return;
                case 11:
                    m222824d("30");
                    return;
                case 12:
                    m222824d("32");
                    return;
                case 13:
                    m222824d("21");
                    return;
                default:
                    return;
            }
        } else {
            ((C59052c) ((C59052c) f373113b.mo56224b()).mo56372aa(40898)).mo56386p("Handling action intent URI");
            C47709i.m84861a(this.f373115c, Intent.parseUri(oVar.f172484b, 1));
        }
    }
}

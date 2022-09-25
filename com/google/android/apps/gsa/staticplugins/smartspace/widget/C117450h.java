package com.google.android.apps.gsa.staticplugins.smartspace.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50719d;
import com.google.assistant.p3886c.p3888b.C50720e;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62971cq;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.widget.h */
/* compiled from: PG */
public final class C117450h {

    /* renamed from: a */
    public static final C59071e f326000a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.smartspace.widget.h");

    /* renamed from: b */
    public final Context f326001b;

    /* renamed from: c */
    public final C86124t f326002c;

    /* renamed from: d */
    public final C21370a f326003d;

    /* renamed from: e */
    public final C83807w f326004e;

    /* renamed from: f */
    private final C91189au f326005f;

    public C117450h(Context context, C86124t tVar, C91189au auVar, C21370a aVar, C83807w wVar) {
        this.f326001b = context;
        this.f326002c = tVar;
        this.f326005f = auVar;
        this.f326003d = aVar;
        this.f326004e = wVar;
    }

    /* renamed from: b */
    public static Intent m195196b(C50818do doVar) {
        if ((doVar.f132304a & 2048) != 0) {
            C50733r rVar = doVar.f132316m;
            if (rVar == null) {
                rVar = C50733r.f132021d;
            }
            String str = rVar.f132025c;
            if (!TextUtils.isEmpty(str)) {
                try {
                    Intent parseUri = Intent.parseUri(str, 0);
                    C50733r rVar2 = doVar.f132316m;
                    if (rVar2 == null) {
                        rVar2 = C50733r.f132021d;
                    }
                    C50731p a = C50731p.m85907a(rVar2.f132024b);
                    if (a == null) {
                        a = C50731p.UNDEFINED;
                    }
                    C92122r.m151193o(parseUri, a);
                    return parseUri;
                } catch (URISyntaxException e) {
                    C59104x c = f326000a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "SSWidgetRndr");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33132)).mo56389s("Bad intent URI: %s", str);
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public static String m195197g(C50723h hVar) {
        int i;
        if (hVar == null || (i = hVar.f132001a & 1) == 0) {
            return BuildConfig.FLAVOR;
        }
        String str = hVar.f132002b;
        if (i == 0 || hVar.f132004d.size() == 0) {
            return str;
        }
        C62971cq cqVar = hVar.f132004d;
        int size = cqVar.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            C50720e eVar = (C50720e) cqVar.get(i2);
            C50719d dVar = C50719d.UNDEFINED;
            C50719d a = C50719d.m85891a(eVar.f131990d);
            if (a == null) {
                a = C50719d.UNDEFINED;
            }
            int ordinal = a.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                C59104x c = f326000a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SSWidgetRndr");
                ((C59052c) ((C59052c) c).mo56372aa(33154)).mo56386p("Received unexpected time field, cannot process");
                strArr[i2] = BuildConfig.FLAVOR;
            } else if (ordinal != 3) {
                strArr[i2] = BuildConfig.FLAVOR;
            } else {
                strArr[i2] = (eVar.f131987a & 1) != 0 ? eVar.f131988b : BuildConfig.FLAVOR;
            }
        }
        return String.format(str, (Object[]) strArr);
    }

    /* renamed from: j */
    public static void m195198j(RemoteViews remoteViews, int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            remoteViews.setContentDescription(i, str);
        } else {
            remoteViews.setContentDescription(i, (CharSequence) null);
        }
    }

    /* renamed from: k */
    private static Intent m195199k() {
        Uri.Builder appendPath = CalendarContract.CONTENT_URI.buildUpon().appendPath("time");
        ContentUris.appendId(appendPath, System.currentTimeMillis());
        return new Intent("android.intent.action.VIEW").setData(appendPath.build()).addFlags(270532609);
    }

    /* renamed from: a */
    public final PendingIntent mo103302a(Intent intent, int i, C50731p pVar) {
        if (pVar == C50731p.BROADCAST) {
            return PendingIntent.getBroadcast(this.f326001b, i, intent, 201326592);
        }
        return PendingIntent.getActivity(this.f326001b, i, intent, 201326592);
    }

    /* renamed from: c */
    public final C92113i mo103303c(C92113i[] iVarArr, C50792cp cpVar) {
        for (C92113i iVar : iVarArr) {
            C50792cp a = C50792cp.m85936a(iVar.f256820a.f132306c);
            if (a == null) {
                a = C50792cp.PRIORITY_UNDEFINED;
            }
            if (a == cpVar) {
                C50818do doVar = iVar.f256820a;
                long b = this.f326003d.mo26870b();
                long j = -1;
                if ((doVar.f132304a & 32768) != 0) {
                    C50796ct ctVar = doVar.f132320q;
                    if (ctVar == null) {
                        ctVar = C50796ct.f132223c;
                    }
                    if ((ctVar.f132225a & 1) != 0) {
                        C50796ct ctVar2 = doVar.f132320q;
                        if (ctVar2 == null) {
                            ctVar2 = C50796ct.f132223c;
                        }
                        j = ctVar2.f132226b;
                    }
                }
                if (j >= b) {
                    return iVar;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C58833ax mo103304d() {
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f326001b);
        int[] appWidgetIds = instance.getAppWidgetIds(SmartspaceWidgetProvider.f325979f);
        int length = appWidgetIds.length;
        if (length <= 0) {
            C58976aa aaVar = C58975e.f156826a;
            return C58836b.f156633a;
        }
        int i = instance.getAppWidgetOptions(appWidgetIds[length - 1]).getInt("appWidgetMaxHeight");
        if (i != 0) {
            return C58833ax.m90834k(Integer.valueOf(i));
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return C58836b.f156633a;
    }

    /* renamed from: e */
    public final C60870cx mo103305e(C92113i iVar) {
        float f;
        float f2;
        C92113i iVar2 = iVar;
        C58976aa aaVar = C58975e.f156826a;
        if (iVar2 != null && this.f326002c.mo79746e(C89985ax.f246718az)) {
            C50818do doVar = iVar2.f256820a;
            if ((doVar.f132304a & 268435456) != 0 && !doVar.f132297C.isEmpty()) {
                C59071e eVar = f326000a;
                C59104x b = eVar.mo56224b();
                b.mo56378ag(C58975e.f156826a, "SSWidgetRndr");
                ((C59052c) ((C59052c) b).mo56372aa(33139)).mo56386p("hasLocationName");
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "SSWidgetRndr");
                ((C59052c) ((C59052c) b2).mo56372aa(33148)).mo56386p("multiLineWeatherCityDisplay");
                RemoteViews remoteViews = new RemoteViews(this.f326001b.getPackageName(), R.layout.double_line_weather);
                String bestDateTimePattern = DateFormat.getBestDateTimePattern(Locale.getDefault(), this.f326001b.getResources().getString(R.string.icu_abbrev_wday_month_day_no_year));
                remoteViews.setCharSequence(R.id.date_text_weather_weather_city, "setFormat12Hour", bestDateTimePattern);
                remoteViews.setCharSequence(R.id.date_text_weather_weather_city, "setFormat24Hour", bestDateTimePattern);
                remoteViews.setOnClickPendingIntent(R.id.date_text_weather_weather_city, PendingIntent.getActivity(this.f326001b, 2, m195199k(), 201326592));
                return mo103306f(iVar, remoteViews, R.id.subtitle_weather_content_city, R.id.subtitle_weather_icon_city, R.id.subtitle_weather_text_city, true);
            }
        }
        RemoteViews remoteViews2 = new RemoteViews(this.f326001b.getPackageName(), R.layout.single_line);
        remoteViews2.setViewVisibility(R.id.title_weather_content, 8);
        String bestDateTimePattern2 = DateFormat.getBestDateTimePattern(Locale.getDefault(), this.f326001b.getResources().getString(R.string.icu_abbrev_wday_month_day_no_year));
        remoteViews2.setCharSequence(R.id.date_text, "setFormat12Hour", bestDateTimePattern2);
        remoteViews2.setCharSequence(R.id.date_text, "setFormat24Hour", bestDateTimePattern2);
        if (this.f326002c.mo79746e(C89985ax.f246676aC)) {
            Configuration configuration = this.f326001b.getResources().getConfiguration();
            float f3 = 1.0f;
            if (configuration.fontScale > 1.2f) {
                String format = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), this.f326001b.getResources().getString(R.string.icu_abbrev_wday_month_day_no_year)), Locale.getDefault()).format(Calendar.getInstance().getTime());
                if (format.length() >= 16) {
                    f2 = 0.3f;
                } else {
                    f2 = (format.length() <= 14 || format.length() >= 16) ? 0.1f : 0.2f;
                }
                f = 1.0f - f2;
                f3 = 0.9f;
            } else {
                f = 1.0f;
            }
            if (configuration.screenWidthDp <= 320) {
                f -= 44.8f;
                f3 -= 44.8f;
            }
            if (configuration.screenWidthDp <= 360) {
                f -= 44.8f;
                f3 -= 44.8f;
            }
            if (((double) f) != 1.0d) {
                float dimension = this.f326001b.getResources().getDimension(R.dimen.smartspace_title_size) * f;
                float dimension2 = this.f326001b.getResources().getDimension(R.dimen.smartspace_text_size) * f3;
                remoteViews2.setTextViewTextSize(R.id.date_text, 0, dimension);
                remoteViews2.setTextViewTextSize(R.id.title_weather_text, 0, dimension);
                remoteViews2.setTextViewTextSize(R.id.title_leading_truncatable, 0, dimension2);
                remoteViews2.setTextViewTextSize(R.id.title_fixed_text, 0, dimension2);
                remoteViews2.setTextViewTextSize(R.id.title_trailing_truncatable, 0, dimension2);
                remoteViews2.setTextViewTextSize(R.id.subtitle_text, 0, dimension2);
                remoteViews2.setTextViewTextSize(R.id.subtitle_weather_text, 0, dimension2);
            }
        }
        remoteViews2.setOnClickPendingIntent(R.id.date_text, PendingIntent.getActivity(this.f326001b, 2, m195199k(), 201326592));
        C58833ax d = mo103304d();
        if (d.mo56113h()) {
            this.f326004e.mo77192a(C118569b.SMARTSPACE_WIDGET_SIZE_DIP, (long) ((Integer) d.mo56107c()).intValue());
        }
        return mo103306f(iVar, remoteViews2, R.id.title_weather_content, R.id.title_weather_icon, R.id.title_weather_text, false);
    }

    /* renamed from: f */
    public final C60870cx mo103306f(C92113i iVar, RemoteViews remoteViews, int i, int i2, int i3, boolean z) {
        String str;
        String str2;
        if (iVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            C50818do doVar = iVar.f256820a;
            remoteViews.setViewVisibility(i, 0);
            if (!z || !this.f326002c.mo79746e(C89985ax.f246718az)) {
                C50802cz czVar = doVar.f132309f;
                if (czVar == null) {
                    czVar = C50802cz.f132236g;
                }
                C50723h hVar = czVar.f132239b;
                if (hVar == null) {
                    hVar = C50723h.f131999e;
                }
                str = hVar.f132002b;
            } else {
                Resources resources = this.f326001b.getResources();
                Object[] objArr = new Object[2];
                C50802cz czVar2 = doVar.f132309f;
                if (czVar2 == null) {
                    czVar2 = C50802cz.f132236g;
                }
                C50723h hVar2 = czVar2.f132239b;
                if (hVar2 == null) {
                    hVar2 = C50723h.f131999e;
                }
                objArr[0] = hVar2.f132002b;
                objArr[1] = doVar.f132297C;
                str = resources.getString(R.string.temperature_display_city, objArr);
            }
            remoteViews.setTextViewText(i3, str);
            Intent b = m195196b(doVar);
            if (b != null) {
                C50733r rVar = doVar.f132316m;
                if (rVar == null) {
                    rVar = C50733r.f132021d;
                }
                C50731p a = C50731p.m85907a(rVar.f132024b);
                if (a == null) {
                    a = C50731p.UNDEFINED;
                }
                remoteViews.setOnClickPendingIntent(i, mo103302a(b, 0, a));
            }
            if ((doVar.f132304a & 512) != 0) {
                C50729n nVar = doVar.f132314k;
                if (nVar == null) {
                    nVar = C50729n.f132007g;
                }
                str2 = nVar.f132012d;
            } else {
                str2 = BuildConfig.FLAVOR;
            }
            String str3 = str2;
            Bitmap bitmap = iVar.f256821b;
            if (bitmap == null) {
                C50729n nVar2 = doVar.f132314k;
                if (nVar2 == null) {
                    nVar2 = C50729n.f132007g;
                }
                if ((nVar2.f132009a & 4) != 0) {
                    C50729n nVar3 = doVar.f132314k;
                    if (nVar3 == null) {
                        nVar3 = C50729n.f132007g;
                    }
                    String str4 = nVar3.f132011c;
                    SettableFuture settableFuture = new SettableFuture();
                    C91189au auVar = this.f326005f;
                    auVar.mo85428r(auVar.mo85417d(Uri.parse(str4)), "SSWidgetRndr.ImageCallback", new C117449g(this, remoteViews, i2, str3, settableFuture));
                    return settableFuture;
                }
            } else {
                remoteViews.setImageViewBitmap(i2, bitmap);
                m195198j(remoteViews, i2, str3);
                mo103308i(remoteViews);
                return C118826c.f331423b;
            }
        }
        mo103308i(remoteViews);
        return C118826c.f331423b;
    }

    /* renamed from: h */
    public final void mo103307h() {
        mo103308i(new RemoteViews(this.f326001b.getPackageName(), R.layout.disabled));
    }

    /* renamed from: i */
    public final void mo103308i(RemoteViews remoteViews) {
        AppWidgetManager.getInstance(this.f326001b).updateAppWidget(SmartspaceWidgetProvider.f325979f, remoteViews);
    }
}

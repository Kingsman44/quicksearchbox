package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10082b.C132610b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p10908a.p10911c.p10914c.C146644b;
import com.google.android.libraries.p10908a.p10911c.p10914c.C146645c;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.assistant.p3994s.p3995a.C53258hf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ai */
/* compiled from: PG */
final class C132590ai {

    /* renamed from: a */
    public static final C59071e f361852a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ai");

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005c, code lost:
        if (((double) r4.f396087a) > (r13 * 1.5d)) goto L_0x014b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x023c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.widget.RemoteViews m215557a(android.content.Context r19, int r20, com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132655r r21, com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132586ae r22, boolean r23, com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132613bc r24, com.google.android.libraries.p10908a.p10911c.p10914c.C146644b r25) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r24
            r4 = r25
            android.widget.RemoteViews r5 = new android.widget.RemoteViews
            java.lang.String r6 = r19.getPackageName()
            r7 = 2131624400(0x7f0e01d0, float:1.8875979E38)
            r5.<init>(r6, r7)
            android.content.res.Resources r6 = r19.getResources()
            r7 = 2131166172(0x7f0703dc, float:1.7946582E38)
            int r6 = r6.getDimensionPixelSize(r7)
            int r8 = r4.f396088b
            int r9 = r4.f396087a
            int r8 = java.lang.Math.min(r8, r9)
            int r9 = r4.f396087a
            int r10 = r4.f396088b
            int r11 = r9 / 2
            int r11 = java.lang.Math.min(r8, r11)
            boolean r12 = m215563g(r0, r4)
            double r13 = (double) r9
            double r9 = (double) r10
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r9)
            double r13 = r13 / r9
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.String r15 = "°"
            r7 = 2
            int r17 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r17 >= 0) goto L_0x014b
            if (r12 != 0) goto L_0x014b
            int r9 = r4.f396088b
            if (r9 <= r6) goto L_0x0060
            int r4 = r4.f396087a
            double r9 = (double) r4
            double r13 = (double) r6
            r17 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            java.lang.Double.isNaN(r13)
            double r13 = r13 * r17
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0060
            goto L_0x014b
        L_0x0060:
            int r4 = java.lang.Math.min(r6, r8)
            double r4 = (double) r4
            double r8 = (double) r6
            java.lang.Double.isNaN(r4)
            java.lang.Double.isNaN(r8)
            double r4 = r4 / r8
            r6 = 3
            r3.mo110841c(r6)
            android.content.res.Resources r3 = r19.getResources()
            r6 = 2131166172(0x7f0703dc, float:1.7946582E38)
            int r3 = r3.getDimensionPixelSize(r6)
            double r8 = (double) r3
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r4
            int r3 = (int) r8
            android.widget.RemoteViews r6 = new android.widget.RemoteViews
            java.lang.String r8 = r19.getPackageName()
            r9 = 2131624397(0x7f0e01cd, float:1.8875973E38)
            r6.<init>(r8, r9)
            float r8 = (float) r3
            r9 = 2131429122(0x7f0b0702, float:1.8479908E38)
            r10 = 0
            r6.setViewLayoutWidth(r9, r8, r10)
            r6.setViewLayoutHeight(r9, r8, r10)
            long r8 = (long) r3
            double r13 = (double) r3
            r16 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            java.lang.Double.isNaN(r13)
            double r13 = r13 * r16
            long r13 = java.lang.Math.round(r13)
            long r8 = r8 - r13
            int r3 = (int) r8
            float r3 = (float) r3
            r8 = 16908288(0x1020000, float:2.387723E-38)
            r6.setViewLayoutWidth(r8, r3, r10)
            r6.setViewLayoutHeight(r8, r3, r10)
            android.content.res.Resources r3 = r19.getResources()
            r8 = 2131166174(0x7f0703de, float:1.7946586E38)
            int r3 = r3.getDimensionPixelSize(r8)
            double r8 = (double) r3
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r4
            int r3 = (int) r8
            float r3 = (float) r3
            r8 = 2131429121(0x7f0b0701, float:1.8479906E38)
            r6.setViewLayoutWidth(r8, r3, r10)
            r6.setViewLayoutHeight(r8, r3, r10)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00de
            r8 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r4 = r4 * r8
        L_0x00de:
            android.content.res.Resources r3 = r19.getResources()
            r8 = 2131166173(0x7f0703dd, float:1.7946584E38)
            int r3 = r3.getDimensionPixelSize(r8)
            double r8 = (double) r3
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r4
            int r3 = (int) r8
            float r3 = (float) r3
            r4 = 3
            r5 = 2131429121(0x7f0b0701, float:1.8479906E38)
            r8 = 0
            r6.setViewLayoutMargin(r5, r4, r3, r8)
            r4 = 4
            r6.setViewLayoutMargin(r5, r4, r3, r8)
            if (r2 != 0) goto L_0x010b
            r3 = 8
            r6.setViewVisibility(r5, r3)
            r4 = 2131429156(0x7f0b0724, float:1.8479977E38)
            r6.setViewVisibility(r4, r3)
            goto L_0x0146
        L_0x010b:
            r6.setViewVisibility(r5, r8)
            android.graphics.Bitmap r3 = r2.f362005b
            r6.setImageViewBitmap(r5, r3)
            com.google.assistant.s.a.gt r3 = r2.f362004a
            com.google.protobuf.cq r3 = r3.f139569c
            java.lang.Object r3 = r3.get(r8)
            com.google.assistant.s.a.ge r3 = (com.google.assistant.p3994s.p3995a.C53230ge) r3
            java.lang.String r3 = r3.f139507c
            int r4 = r3.length()
            if (r4 <= r7) goto L_0x012f
            r4 = 1115160576(0x42780000, float:62.0)
            r5 = 1
            r7 = 2131429156(0x7f0b0724, float:1.8479977E38)
            r6.setTextViewTextSize(r7, r5, r4)
            goto L_0x0138
        L_0x012f:
            r5 = 1
            r7 = 2131429156(0x7f0b0724, float:1.8479977E38)
            r4 = 1116471296(0x428c0000, float:70.0)
            r6.setTextViewTextSize(r7, r5, r4)
        L_0x0138:
            r6.setViewVisibility(r7, r8)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r3.concat(r15)
            r6.setTextViewText(r7, r3)
        L_0x0146:
            r3 = r22
            r5 = r6
            goto L_0x0237
        L_0x014b:
            r8 = 0
            int r4 = r11 + r11
            float r4 = (float) r4
            r6 = 16908288(0x1020000, float:2.387723E-38)
            r5.setViewLayoutWidth(r6, r4, r8)
            float r4 = (float) r11
            r5.setViewLayoutHeight(r6, r4, r8)
            r6 = 8
            int r11 = r11 / r6
            int r6 = r11 * 6
            float r6 = (float) r6
            r9 = 2131429121(0x7f0b0701, float:1.8479906E38)
            r5.setViewLayoutWidth(r9, r6, r8)
            r5.setViewLayoutHeight(r9, r6, r8)
            float r6 = (float) r11
            r10 = 3
            r5.setViewLayoutMargin(r9, r10, r6, r8)
            r11 = 4
            r5.setViewLayoutMargin(r9, r11, r6, r8)
            r9 = 2131429130(0x7f0b070a, float:1.8479924E38)
            r5.setViewLayoutMargin(r9, r11, r4, r8)
            r11 = 1077936128(0x40400000, float:3.0)
            float r6 = r6 / r11
            r11 = 1
            r5.setViewLayoutMargin(r9, r11, r6, r8)
            r5.setViewLayoutMargin(r9, r10, r6, r8)
            r9 = 1074580685(0x400ccccd, float:2.2)
            float r4 = r4 / r9
            r9 = 2131429156(0x7f0b0724, float:1.8479977E38)
            r5.setTextViewTextSize(r9, r8, r4)
            r10 = 1063675494(0x3f666666, float:0.9)
            float r10 = r10 * r4
            r11 = 2131429158(0x7f0b0726, float:1.847998E38)
            r5.setTextViewTextSize(r11, r8, r10)
            r10 = 2131429154(0x7f0b0722, float:1.8479973E38)
            if (r2 != 0) goto L_0x01b0
            r13 = 8
            r5.setViewVisibility(r11, r13)
            r5.setViewVisibility(r9, r13)
            r3 = 2131429121(0x7f0b0701, float:1.8479906E38)
            r5.setViewVisibility(r3, r13)
            m215565i(r5)
            r5.setViewVisibility(r10, r13)
            goto L_0x0235
        L_0x01b0:
            com.google.assistant.s.a.gt r9 = r2.f362004a
            com.google.protobuf.cq r9 = r9.f139569c
            java.lang.Object r9 = r9.get(r8)
            com.google.assistant.s.a.ge r9 = (com.google.assistant.p3994s.p3995a.C53230ge) r9
            java.lang.String r9 = r9.f139507c
            r5.setViewVisibility(r11, r8)
            r5.setTextViewText(r11, r15)
            r11 = 2131429156(0x7f0b0724, float:1.8479977E38)
            r5.setViewVisibility(r11, r8)
            r5.setTextViewText(r11, r9)
            r9 = 2131429121(0x7f0b0701, float:1.8479906E38)
            r5.setViewVisibility(r9, r8)
            android.graphics.Bitmap r11 = r2.f362005b
            r5.setImageViewBitmap(r9, r11)
            com.google.assistant.s.a.gt r9 = r2.f362004a
            java.lang.String r9 = r9.f139576j
            r5.setViewVisibility(r10, r8)
            r5.setTextViewText(r10, r9)
            if (r12 == 0) goto L_0x01e9
            m215565i(r5)
            r3.mo110841c(r7)
            goto L_0x0235
        L_0x01e9:
            r7 = 4
            r3.mo110841c(r7)
            com.google.assistant.s.a.gt r3 = r2.f362004a
            r7 = 3
            r9 = 2131429156(0x7f0b0724, float:1.8479977E38)
            r5.setViewLayoutMargin(r9, r7, r6, r8)
            com.google.protobuf.cq r6 = r3.f139569c
            java.lang.Object r6 = r6.get(r8)
            com.google.assistant.s.a.ge r6 = (com.google.assistant.p3994s.p3995a.C53230ge) r6
            java.lang.String r6 = r6.f139508d
            com.google.protobuf.cq r3 = r3.f139569c
            java.lang.Object r3 = r3.get(r8)
            com.google.assistant.s.a.ge r3 = (com.google.assistant.p3994s.p3995a.C53230ge) r3
            java.lang.String r3 = r3.f139509e
            r7 = 2131429159(0x7f0b0727, float:1.8479983E38)
            r5.setViewVisibility(r7, r8)
            r7 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 / r7
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r6.concat(r15)
            r7 = 2131429160(0x7f0b0728, float:1.8479985E38)
            r5.setTextViewText(r7, r6)
            r5.setTextViewTextSize(r7, r8, r4)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r3.concat(r15)
            r6 = 2131429161(0x7f0b0729, float:1.8479987E38)
            r5.setTextViewText(r6, r3)
            r5.setTextViewTextSize(r6, r8, r4)
        L_0x0235:
            r3 = r22
        L_0x0237:
            m215562f(r0, r5, r1, r12, r3)
            if (r2 == 0) goto L_0x0249
            java.lang.String r2 = "com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.FreeformWeatherWidget_Receiver"
            r3 = r23
            android.app.PendingIntent r0 = com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132614bd.m215598b(r0, r3, r2, r1)
            r1 = 16908288(0x1020000, float:2.387723E-38)
            r5.setOnClickPendingIntent(r1, r0)
        L_0x0249:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132590ai.m215557a(android.content.Context, int, com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.r, com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ae, boolean, com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.bc, com.google.android.libraries.a.c.c.b):android.widget.RemoteViews");
    }

    /* renamed from: b */
    public static C132588ag m215558b(C146644b bVar, Context context, boolean z) {
        C132588ag agVar = C132588ag.MINI;
        int i = 0;
        C132587af[] afVarArr = {new C132587af(C132588ag.SQUARE, true), new C132587af(C132588ag.MEDIUM, true), new C132587af(C132588ag.LARGE, z)};
        while (i < 3) {
            C132587af afVar = afVarArr[i];
            if (afVar.f361840b) {
                if (bVar.f396087a < context.getResources().getDimensionPixelSize(afVar.f361839a.f361848g)) {
                    break;
                }
                if (bVar.f396088b < context.getResources().getDimensionPixelSize(afVar.f361839a.f361849h)) {
                    break;
                }
                agVar = afVar.f361839a;
                i++;
            } else {
                break;
            }
        }
        return agVar;
    }

    /* renamed from: c */
    public static void m215559c(Context context, AppWidgetManager appWidgetManager, int[] iArr, C132655r rVar, C132586ae aeVar, boolean z, C132613bc bcVar, C132610b bVar) {
        HashMap hashMap = new HashMap();
        for (int i : iArr) {
            Context context2 = context;
            hashMap.put(Integer.valueOf(i), C146645c.m238881a(context, AppWidgetManager.getInstance(context), i, new C132584ac(context, i, rVar, aeVar, z, bcVar)));
        }
        AppWidgetManager appWidgetManager2 = appWidgetManager;
        try {
            m215566j(appWidgetManager, hashMap);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f361852a.mo56226d()).mo56382g(e)).mo56372aa(39716)).mo56386p("Rendering freeform widget failed.");
            bVar.mo110834a(C53258hf.WIDGET_TYPE_FREEFORM);
        }
    }

    /* renamed from: d */
    public static void m215560d(Context context, AppWidgetManager appWidgetManager, int[] iArr, C132655r rVar, boolean z, boolean z2, C132613bc bcVar, C132610b bVar) {
        HashMap hashMap = new HashMap();
        for (int i : iArr) {
            Context context2 = context;
            hashMap.put(Integer.valueOf(i), C146645c.m238881a(context, AppWidgetManager.getInstance(context), i, new C132585ad(context, z2, i, rVar, z, bcVar)));
        }
        AppWidgetManager appWidgetManager2 = appWidgetManager;
        try {
            m215566j(appWidgetManager, hashMap);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f361852a.mo56226d()).mo56382g(e)).mo56372aa(39717)).mo56386p("Rendering square widget failed.");
            bVar.mo110834a(C53258hf.WIDGET_TYPE_SQUARE);
        }
    }

    /* renamed from: e */
    public static void m215561e(RemoteViews remoteViews, int i) {
        remoteViews.setViewVisibility(R.id.assistant_weather_icon, i);
        remoteViews.setViewVisibility(R.id.assistant_weather_widget_location_title, i);
        remoteViews.setViewVisibility(R.id.assistant_weather_widget_temperature, i);
        remoteViews.setViewVisibility(R.id.assistant_weather_widget_temperature_high, i);
        remoteViews.setViewVisibility(R.id.assistant_weather_widget_temperature_low, i);
        remoteViews.setViewVisibility(R.id.assistant_weather_widget_condition_title, i);
        remoteViews.setViewVisibility(R.id.assistant_weather_widget_forecast, i);
        remoteViews.setViewVisibility(R.id.assistant_weather_widget_source, i);
        remoteViews.setViewVisibility(R.id.assistant_weather_widget_daily_forecast, i);
    }

    /* renamed from: f */
    public static void m215562f(Context context, RemoteViews remoteViews, int i, boolean z, C132586ae aeVar) {
        PendingIntent pendingIntent;
        if (aeVar == null) {
            remoteViews.setViewVisibility(R.id.assistant_weather_widget_notice_layout, 8);
            return;
        }
        remoteViews.setViewVisibility(R.id.assistant_weather_widget_notice_layout, 0);
        remoteViews.setTextViewText(R.id.assistant_weather_widget_notice_text, context.getString(aeVar.f361838g));
        if (aeVar.f361837f != -1) {
            remoteViews.setViewVisibility(R.id.assistant_weather_widget_notice_icon, 0);
            remoteViews.setImageViewResource(R.id.assistant_weather_widget_notice_icon, aeVar.f361837f);
        } else {
            remoteViews.setViewVisibility(R.id.assistant_weather_widget_notice_icon, 8);
        }
        if (aeVar.f361837f == -1 || !z) {
            remoteViews.setContentDescription(R.id.assistant_weather_widget_notice_icon, BuildConfig.FLAVOR);
            remoteViews.setViewVisibility(R.id.assistant_weather_widget_notice_text, 0);
        } else {
            remoteViews.setContentDescription(R.id.assistant_weather_widget_notice_icon, context.getResources().getString(aeVar.f361838g));
            remoteViews.setViewVisibility(R.id.assistant_weather_widget_notice_text, 8);
        }
        int ordinal = aeVar.ordinal();
        if (ordinal == 0) {
            pendingIntent = C132614bd.m215597a(context, i, "ERROR_INTERNET");
        } else if (ordinal == 1) {
            pendingIntent = C132614bd.m215597a(context, i, "ERROR_LOCATION_PERMISSION");
        } else if (ordinal == 2) {
            pendingIntent = C132614bd.m215597a(context, i, "ERROR_AADC_OFF");
        } else if (ordinal == 3) {
            pendingIntent = C132614bd.m215597a(context, i, "ERROR_LOCATION_OFF");
        } else if (ordinal != 4) {
            pendingIntent = null;
        } else {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.WeatherWidget_Receiver");
            intent.setAction("android.appwidget.action.UPDATE_ALL_WEATHER_WIDGETS");
            intent.putExtra("update_source", "tap_widget");
            pendingIntent = PendingIntent.getBroadcast(context, i, C147798a.m240896b(intent, 201326592, 0), 201326592);
        }
        remoteViews.setOnClickPendingIntent(R.id.assistant_weather_widget_notice_layout, pendingIntent);
    }

    /* renamed from: g */
    public static boolean m215563g(Context context, C146644b bVar) {
        return Math.min(bVar.f396087a, bVar.f396088b) < context.getResources().getDimensionPixelSize(R.dimen.assistant_weather_widget_minimum_size_for_freeform);
    }

    /* renamed from: h */
    public static void m215564h(int i, Context context, AppWidgetManager appWidgetManager, int[] iArr, int i2, boolean z) {
        C132589ah ahVar = new C132589ah(z);
        C132586ae aeVar = C132586ae.NO_INTERNET;
        int i3 = i - 1;
        int i4 = 0;
        if (i3 == 1) {
            ((C59052c) ((C59052c) f361852a.mo56224b()).mo56372aa(39719)).mo56386p("#updateWidgetsWithLocationPermissionErrorState()");
            while (i4 < iArr.length) {
                appWidgetManager.updateAppWidget(iArr[i4], m215567k(context, iArr[i4], i2, C132586ae.NO_PERMISSION, ahVar));
                i4++;
            }
        } else if (i3 == 2) {
            ((C59052c) ((C59052c) f361852a.mo56224b()).mo56372aa(39720)).mo56386p("#updateWidgetsWithNoAadcErrorState()");
            while (i4 < iArr.length) {
                appWidgetManager.updateAppWidget(iArr[i4], m215567k(context, iArr[i4], i2, C132586ae.NO_AADC, ahVar));
                i4++;
            }
        } else if (i3 == 3) {
            ((C59052c) ((C59052c) f361852a.mo56224b()).mo56372aa(39718)).mo56386p("#updateWidgetsWithLocationNotAvailableErrorState()");
            while (i4 < iArr.length) {
                appWidgetManager.updateAppWidget(iArr[i4], m215567k(context, iArr[i4], i2, C132586ae.NO_LOCATION, ahVar));
                i4++;
            }
        } else if (i3 != 4) {
            ((C59052c) ((C59052c) f361852a.mo56224b()).mo56372aa(39722)).mo56386p("#updateWidgetsWithSomethingWentWrongErrorState()");
            HashMap hashMap = new HashMap();
            int length = iArr.length;
            while (i4 < length) {
                int i5 = iArr[i4];
                hashMap.put(Integer.valueOf(i5), m215567k(context, i5, i2, C132586ae.SOMETHING_WENT_WRONG, ahVar));
                i4++;
            }
            m215566j(appWidgetManager, hashMap);
        } else {
            ((C59052c) ((C59052c) f361852a.mo56224b()).mo56372aa(39721)).mo56386p("#updateWidgetsWithNoInternetErrorState()");
            HashMap hashMap2 = new HashMap();
            int length2 = iArr.length;
            while (i4 < length2) {
                int i6 = iArr[i4];
                hashMap2.put(Integer.valueOf(i6), m215567k(context, i6, i2, C132586ae.NO_INTERNET, ahVar));
                i4++;
            }
            m215566j(appWidgetManager, hashMap2);
        }
    }

    /* renamed from: i */
    private static void m215565i(RemoteViews remoteViews) {
        remoteViews.setViewLayoutMargin(R.id.assistant_weather_widget_temperature, 3, 0.0f, 0);
        remoteViews.setViewVisibility(R.id.assistant_weather_widget_temperature_hi_low_container, 8);
        remoteViews.setViewVisibility(R.id.assistant_weather_widget_provider, 8);
    }

    /* renamed from: j */
    private static void m215566j(AppWidgetManager appWidgetManager, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            appWidgetManager.updateAppWidget(((Integer) entry.getKey()).intValue(), (RemoteViews) entry.getValue());
        }
    }

    /* renamed from: k */
    private static RemoteViews m215567k(Context context, int i, int i2, C132586ae aeVar, C132589ah ahVar) {
        return C146645c.m238881a(context, AppWidgetManager.getInstance(context), i, new C132583ab(context, ahVar, i2, context.getResources().getDimensionPixelSize(R.dimen.assistant_weather_widget_default_size), i, aeVar));
    }
}

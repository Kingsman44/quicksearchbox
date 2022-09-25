package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8469r;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.staticplugins.opa.ambient.activity.C106426u;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
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
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62971cq;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.r.k */
/* compiled from: PG */
public final class C110925k {

    /* renamed from: a */
    public static final ComponentName f308998a = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.smartspace.widget.SmartspaceWidgetProvider");

    /* renamed from: b */
    public static final long f308999b = Duration.ofSeconds(15).toMillis();

    /* renamed from: g */
    private static final int[] f309000g = {R.id.date_text, R.id.title_weather_text, R.id.title_trailing_truncatable};

    /* renamed from: c */
    public final C58974d f309001c;

    /* renamed from: d */
    public final C83807w f309002d;

    /* renamed from: e */
    public final Context f309003e;

    /* renamed from: f */
    public Runnable f309004f = null;

    /* renamed from: h */
    private C50738bc f309005h;

    /* renamed from: i */
    private final C86124t f309006i;

    /* renamed from: j */
    private final C91189au f309007j;

    /* renamed from: k */
    private final C21370a f309008k;

    /* renamed from: l */
    private final C86127w f309009l;

    /* renamed from: m */
    private final Handler f309010m;

    /* renamed from: n */
    private final C106426u f309011n;

    /* renamed from: o */
    private final C60888db f309012o;

    public C110925k(Context context, C86124t tVar, C91189au auVar, C21370a aVar, C86127w wVar, C106426u uVar, C83564a aVar2, C83807w wVar2, C60888db dbVar) {
        this.f309003e = context;
        this.f309006i = tVar;
        this.f309007j = auVar;
        this.f309008k = aVar;
        this.f309009l = wVar;
        this.f309012o = dbVar;
        this.f309010m = new Handler(Looper.getMainLooper());
        this.f309011n = uVar;
        this.f309001c = aVar2.mo76900a("AmbientWidgetRndr");
        this.f309002d = wVar2;
    }

    /* renamed from: g */
    public static void m184667g(RemoteViews remoteViews, int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            remoteViews.setContentDescription(i, str);
        } else {
            remoteViews.setContentDescription(i, (CharSequence) null);
        }
    }

    /* renamed from: h */
    private final PendingIntent m184668h(Intent intent, int i, C50731p pVar) {
        if (pVar == C50731p.BROADCAST) {
            return PendingIntent.getBroadcast(this.f309003e, i, intent, 201326592);
        }
        return PendingIntent.getActivity(this.f309003e, i, intent, 201326592);
    }

    /* renamed from: i */
    private final Intent m184669i(C50818do doVar) {
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
                } catch (URISyntaxException unused) {
                    ((C58970a) ((C58970a) this.f309001c.mo56225c()).mo56372aa(26860)).mo56389s("Bad intent URI: %s", str);
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    private final Bitmap m184670j(Bitmap bitmap) {
        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        int a = C1878d.m5128a(this.f309003e, R.color.cw_text_shadow);
        Bitmap createBitmap = Bitmap.createBitmap(copy.getWidth(), copy.getHeight(), Bitmap.Config.ALPHA_8);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, (float) copy.getWidth(), (float) copy.getHeight()), new RectF(0.0f, 0.0f, (float) copy.getWidth(), (float) copy.getHeight()), Matrix.ScaleToFit.CENTER);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-2.0f, -2.0f);
        matrix2.postScale(1.03f, 1.03f);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(copy, matrix, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        canvas.drawBitmap(copy, matrix2, paint);
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(9.0f, BlurMaskFilter.Blur.NORMAL);
        paint.reset();
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint.setMaskFilter(blurMaskFilter);
        paint.setFilterBitmap(true);
        Bitmap createBitmap2 = Bitmap.createBitmap(copy.getWidth(), copy.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        canvas2.drawBitmap(copy, matrix, (Paint) null);
        createBitmap.recycle();
        return createBitmap2;
    }

    /* renamed from: k */
    private final C92113i m184671k(C92113i[] iVarArr, C50792cp cpVar) {
        for (C92113i iVar : iVarArr) {
            C50792cp a = C50792cp.m85936a(iVar.f256820a.f132306c);
            if (a == null) {
                a = C50792cp.PRIORITY_UNDEFINED;
            }
            if (a == cpVar) {
                C50818do doVar = iVar.f256820a;
                long b = this.f309008k.mo26870b();
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

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.common.util.concurrent.C60870cx m184672l(android.widget.RemoteViews r12, java.util.List r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L_0x0017
            j$.util.stream.Stream r13 = p3186j$.util.Collection.EL.stream(r13)
            com.google.android.apps.gsa.staticplugins.opa.smartspace.r.d r0 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8469r.C110918d.f308977a
            j$.util.stream.Stream r13 = r13.filter(r0)
            j$.util.stream.Collector r0 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r13 = r13.collect(r0)
            java.util.List r13 = (java.util.List) r13
            goto L_0x001b
        L_0x0017:
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x001b:
            r0 = 2131435949(0x7f0b21ad, float:1.8493755E38)
            r1 = 1
            r2 = 0
            r3 = 0
            if (r13 == 0) goto L_0x00aa
            boolean r4 = r13.isEmpty()
            if (r4 != 0) goto L_0x00aa
            java.lang.Object r4 = r13.get(r3)
            r7 = r4
            com.google.android.apps.gsa.opa.smartspace.r r7 = (com.google.android.apps.gsa.opa.smartspace.C83802r) r7
            r8 = 2131429980(0x7f0b0a5c, float:1.8481648E38)
            r9 = 2131429982(0x7f0b0a5e, float:1.8481652E38)
            r10 = 2131429981(0x7f0b0a5d, float:1.848165E38)
            r5 = r11
            r6 = r12
            r5.m184675o(r6, r7, r8, r9, r10)
            int r4 = r13.size()
            if (r4 <= r1) goto L_0x004c
            java.lang.Object r4 = r13.get(r1)
            com.google.android.apps.gsa.opa.smartspace.r r4 = (com.google.android.apps.gsa.opa.smartspace.C83802r) r4
            r7 = r4
            goto L_0x004d
        L_0x004c:
            r7 = r2
        L_0x004d:
            if (r7 == 0) goto L_0x0059
            com.google.common.base.ax r2 = r7.mo77094d()
            java.lang.Object r2 = r2.mo56111f()
            com.google.assistant.c.bc r2 = (com.google.assistant.p3886c.C50738bc) r2
        L_0x0059:
            if (r2 == 0) goto L_0x008f
            com.google.assistant.c.bc r4 = r11.f309005h
            if (r4 == 0) goto L_0x008f
            int r4 = r2.f132040g
            com.google.assistant.c.am r4 = com.google.assistant.p3886c.C50701am.m85887a(r4)
            if (r4 != 0) goto L_0x0069
            com.google.assistant.c.am r4 = com.google.assistant.p3886c.C50701am.UNKNOWN
        L_0x0069:
            com.google.assistant.c.bc r5 = r11.f309005h
            r5.getClass()
            int r5 = r5.f132040g
            com.google.assistant.c.am r5 = com.google.assistant.p3886c.C50701am.m85887a(r5)
            if (r5 != 0) goto L_0x0078
            com.google.assistant.c.am r5 = com.google.assistant.p3886c.C50701am.UNKNOWN
        L_0x0078:
            boolean r4 = com.google.common.base.C58832aw.m90831a(r4, r5)
            if (r4 == 0) goto L_0x008f
            java.lang.String r4 = r2.f132037d
            com.google.assistant.c.bc r5 = r11.f309005h
            r5.getClass()
            java.lang.String r5 = r5.f132037d
            boolean r4 = com.google.common.base.C58832aw.m90831a(r4, r5)
            if (r4 == 0) goto L_0x008f
            r4 = 1
            goto L_0x0090
        L_0x008f:
            r4 = 0
        L_0x0090:
            r11.f309005h = r2
            if (r4 != 0) goto L_0x0098
            r9 = 2131435949(0x7f0b21ad, float:1.8493755E38)
            goto L_0x0099
        L_0x0098:
            r9 = 0
        L_0x0099:
            r8 = 2131435947(0x7f0b21ab, float:1.849375E38)
            r10 = 2131435948(0x7f0b21ac, float:1.8493753E38)
            r5 = r11
            r6 = r12
            r5.m184675o(r6, r7, r8, r9, r10)
            if (r4 != 0) goto L_0x00d8
            r11.m184674n()
            goto L_0x00d8
        L_0x00aa:
            r4 = 2131429980(0x7f0b0a5c, float:1.8481648E38)
            r5 = 8
            r12.setViewVisibility(r4, r5)
            r6 = 2131429981(0x7f0b0a5d, float:1.848165E38)
            r12.setViewVisibility(r6, r5)
            r6 = 2131429982(0x7f0b0a5e, float:1.8481652E38)
            r12.setViewVisibility(r6, r5)
            r12.setOnClickPendingIntent(r4, r2)
            r11.f309005h = r2
            r11.m184674n()
            r4 = 2131435947(0x7f0b21ab, float:1.849375E38)
            r12.setViewVisibility(r4, r5)
            r6 = 2131435948(0x7f0b21ac, float:1.8493753E38)
            r12.setViewVisibility(r6, r5)
            r12.setViewVisibility(r0, r5)
            r12.setOnClickPendingIntent(r4, r2)
        L_0x00d8:
            if (r13 == 0) goto L_0x00e1
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r1 = 0
        L_0x00e2:
            com.google.android.apps.gsa.staticplugins.opa.ambient.activity.u r13 = r11.f309011n
            android.content.Context r0 = r11.f309003e
            com.google.android.apps.gsa.shared.m.c r13 = r13.f296862a
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247860B
            boolean r13 = r13.mo79746e(r2)
            if (r13 != 0) goto L_0x00f5
            j$.util.Optional r13 = p3186j$.util.Optional.empty()
            goto L_0x0100
        L_0x00f5:
            android.content.Intent r13 = new android.content.Intent
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.ambient.activity.AmbientAssistantFeedbackActivity> r2 = com.google.android.apps.gsa.staticplugins.opa.ambient.activity.AmbientAssistantFeedbackActivity.class
            r13.<init>(r0, r2)
            j$.util.Optional r13 = p3186j$.util.Optional.m71637of(r13)
        L_0x0100:
            com.google.android.apps.gsa.staticplugins.opa.ambient.activity.t r2 = new com.google.android.apps.gsa.staticplugins.opa.ambient.activity.t
            r2.<init>(r0)
            j$.util.Optional r13 = r13.map(r2)
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
            com.google.android.apps.gsa.staticplugins.opa.smartspace.r.e r0 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.r.e
            r0.<init>(r11, r12, r1)
            com.google.common.util.concurrent.db r12 = r11.f309012o
            com.google.common.base.ah r0 = com.google.apps.tiktok.tracing.C47810es.m84963c(r0)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60922j.m93044g(r13, r0, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.smartspace.p8469r.C110925k.m184672l(android.widget.RemoteViews, java.util.List):com.google.common.util.concurrent.cx");
    }

    /* renamed from: m */
    private final String m184673m(C50723h hVar) {
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
            C50794cr crVar = C50794cr.UNDEFINED;
            C50719d a = C50719d.m85891a(eVar.f131990d);
            if (a == null) {
                a = C50719d.UNDEFINED;
            }
            int ordinal = a.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                ((C58970a) ((C58970a) this.f309001c.mo56225c()).mo56372aa(26894)).mo56386p("Received unexpected time field, cannot process");
                strArr[i2] = BuildConfig.FLAVOR;
            } else if (ordinal != 3) {
                strArr[i2] = BuildConfig.FLAVOR;
            } else {
                strArr[i2] = (eVar.f131987a & 1) != 0 ? eVar.f131988b : BuildConfig.FLAVOR;
            }
        }
        return String.format(str, (Object[]) strArr);
    }

    /* renamed from: n */
    private final void m184674n() {
        Runnable runnable = this.f309004f;
        if (runnable != null) {
            this.f309010m.removeCallbacks(runnable);
            this.f309004f = null;
        }
    }

    /* renamed from: o */
    private final void m184675o(RemoteViews remoteViews, C83802r rVar, int i, int i2, int i3) {
        if (rVar == null || !rVar.mo77094d().mo56113h()) {
            remoteViews.setViewVisibility(i, 8);
            remoteViews.setViewVisibility(i2, 8);
            remoteViews.setViewVisibility(i3, 8);
            return;
        }
        C50738bc bcVar = (C50738bc) rVar.mo77094d().mo56107c();
        remoteViews.setViewVisibility(i, 0);
        if (i2 != 0) {
            remoteViews.setViewVisibility(i2, 0);
            remoteViews.setTextViewText(i2, bcVar.f132037d);
        }
        if (rVar.mo77093c().mo56113h()) {
            remoteViews.setOnClickPendingIntent(i, (PendingIntent) rVar.mo77093c().mo56107c());
        } else {
            remoteViews.setOnClickPendingIntent(i, (PendingIntent) null);
        }
        if (rVar.mo77091a() != null) {
            Bitmap a = rVar.mo77091a();
            a.getClass();
            remoteViews.setImageViewBitmap(i3, m184670j(a));
            remoteViews.setViewVisibility(i3, 0);
            return;
        }
        remoteViews.setViewVisibility(i3, 8);
    }

    /* renamed from: a */
    public final C58833ax mo98933a() {
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f309003e);
        int[] appWidgetIds = instance.getAppWidgetIds(f308998a);
        int length = appWidgetIds.length;
        if (length <= 0) {
            return C58836b.f156633a;
        }
        int i = instance.getAppWidgetOptions(appWidgetIds[length - 1]).getInt("appWidgetMaxHeight");
        if (i == 0) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo98934b(C92113i iVar, List list) {
        float f;
        RemoteViews remoteViews = new RemoteViews(this.f309003e.getPackageName(), R.layout.widget_single_line);
        remoteViews.setViewVisibility(R.id.title_weather_content, 8);
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(Locale.getDefault(), this.f309003e.getResources().getString(R.string.cw_icu_abbrev_wday_month_day_no_year));
        remoteViews.setCharSequence(R.id.date_text, "setFormat12Hour", bestDateTimePattern);
        remoteViews.setCharSequence(R.id.date_text, "setFormat24Hour", bestDateTimePattern);
        int[] iArr = f309000g;
        for (int i = 0; i < 3; i++) {
            remoteViews.setTextViewTextSize(iArr[i], 0, this.f309003e.getResources().getDimension(R.dimen.cw_smartspace_title_size));
        }
        if (this.f309006i.mo79746e(C89985ax.f246676aC)) {
            Configuration configuration = this.f309003e.getResources().getConfiguration();
            float f2 = 1.0f;
            if (configuration.fontScale > 1.2f) {
                float f3 = 0.1f;
                if (this.f309003e.getResources().getDimension(R.dimen.cw_smartspace_title_size) >= this.f309003e.getResources().getDimension(R.dimen.cw_smartspace_title_size)) {
                    String format = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), this.f309003e.getResources().getString(R.string.cw_icu_abbrev_wday_month_day_no_year)), Locale.getDefault()).format(Calendar.getInstance().getTime());
                    if (format.length() >= 16) {
                        f3 = 0.3f;
                    } else if (format.length() > 14) {
                        f3 = 0.2f;
                    }
                }
                f = 1.0f - f3;
                f2 = 0.9f;
            } else {
                f = 1.0f;
            }
            if (configuration.screenWidthDp <= 320) {
                f -= 44.8f;
                f2 -= 44.8f;
            }
            if (configuration.screenWidthDp <= 360) {
                f -= 44.8f;
                f2 -= 44.8f;
            }
            if (((double) f) != 1.0d) {
                float dimension = this.f309003e.getResources().getDimension(R.dimen.cw_smartspace_title_size) * f;
                float dimension2 = this.f309003e.getResources().getDimension(R.dimen.cw_smartspace_text_size) * f2;
                remoteViews.setTextViewTextSize(R.id.date_text, 0, dimension);
                remoteViews.setTextViewTextSize(R.id.title_weather_text, 0, dimension);
                remoteViews.setTextViewTextSize(R.id.title_leading_truncatable, 0, dimension2);
                remoteViews.setTextViewTextSize(R.id.title_fixed_text, 0, dimension2);
                remoteViews.setTextViewTextSize(R.id.title_trailing_truncatable, 0, dimension2);
                remoteViews.setTextViewTextSize(R.id.subtitle_text, 0, dimension2);
                remoteViews.setTextViewTextSize(R.id.subtitle_weather_text, 0, dimension2);
            }
        }
        Context context = this.f309003e;
        Uri.Builder appendPath = CalendarContract.CONTENT_URI.buildUpon().appendPath("time");
        ContentUris.appendId(appendPath, this.f309008k.mo26870b());
        remoteViews.setOnClickPendingIntent(R.id.date_text, PendingIntent.getActivity(context, 2, new Intent("android.intent.action.VIEW").setData(appendPath.build()).addFlags(270532609), 201326592));
        if (!this.f309009l.f232790a.mo79722a().getBoolean("com.google.android.apps.oemsmartspace.SMARTSPACE_ENABLE_DATE_KEY", true) && this.f309006i.mo79746e(C90017bw.f247938b)) {
            remoteViews.setViewVisibility(R.id.date_text, 8);
        }
        return C60922j.m93045h(m184672l(remoteViews, list), C47810es.m84966f(new C110921g(this, remoteViews, iVar)), this.f309012o);
    }

    /* renamed from: c */
    public final C60870cx mo98935c(C92113i iVar, RemoteViews remoteViews, int i, int i2, int i3) {
        String str;
        if (iVar != null) {
            C50818do doVar = iVar.f256820a;
            remoteViews.setViewVisibility(i, 0);
            C50802cz czVar = doVar.f132309f;
            if (czVar == null) {
                czVar = C50802cz.f132236g;
            }
            C50723h hVar = czVar.f132239b;
            if (hVar == null) {
                hVar = C50723h.f131999e;
            }
            remoteViews.setTextViewText(i3, hVar.f132002b);
            Intent i4 = m184669i(doVar);
            if (i4 != null) {
                C50733r rVar = doVar.f132316m;
                if (rVar == null) {
                    rVar = C50733r.f132021d;
                }
                C50731p a = C50731p.m85907a(rVar.f132024b);
                if (a == null) {
                    a = C50731p.UNDEFINED;
                }
                remoteViews.setOnClickPendingIntent(i, m184668h(i4, 0, a));
            }
            if ((doVar.f132304a & 512) != 0) {
                C50729n nVar = doVar.f132314k;
                if (nVar == null) {
                    nVar = C50729n.f132007g;
                }
                str = nVar.f132012d;
            } else {
                str = BuildConfig.FLAVOR;
            }
            String str2 = str;
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
                    String str3 = nVar3.f132011c;
                    SettableFuture settableFuture = new SettableFuture();
                    C91189au auVar = this.f309007j;
                    auVar.mo85428r(auVar.mo85417d(Uri.parse(str3)), "AmbientWidgetRndr.ImageCallback", new C110924j(this, remoteViews, i2, str2, settableFuture));
                    return settableFuture;
                }
            } else {
                remoteViews.setImageViewBitmap(i2, m184670j(bitmap));
                m184667g(remoteViews, i2, str2);
                mo98938f(remoteViews);
                return C118826c.f331423b;
            }
        }
        mo98938f(remoteViews);
        return C118826c.f331423b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x02e8  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo98936d(com.google.android.apps.gsa.smartspace.C92113i[] r17, java.util.List r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            com.google.android.apps.gsa.search.core.i.t r3 = r1.f309006i
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246675aB
            boolean r3 = r3.mo79746e(r4)
            if (r3 != 0) goto L_0x0024
            android.widget.RemoteViews r0 = new android.widget.RemoteViews
            android.content.Context r2 = r1.f309003e
            java.lang.String r2 = r2.getPackageName()
            r3 = 2131627277(0x7f0e0d0d, float:1.8881814E38)
            r0.<init>(r2, r3)
            r1.mo98938f(r0)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r0
        L_0x0024:
            if (r0 != 0) goto L_0x0029
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r0
        L_0x0029:
            com.google.assistant.c.cp r3 = com.google.assistant.p3886c.C50792cp.PRIMARY
            com.google.android.apps.gsa.smartspace.i r3 = r1.m184671k(r0, r3)
            com.google.assistant.c.cp r4 = com.google.assistant.p3886c.C50792cp.SECONDARY
            com.google.android.apps.gsa.smartspace.i r4 = r1.m184671k(r0, r4)
            if (r3 == 0) goto L_0x0335
            com.google.assistant.c.do r0 = r3.f256820a
            boolean r5 = r0.f132305b
            if (r5 == 0) goto L_0x003f
            goto L_0x0335
        L_0x003f:
            com.google.android.libraries.f.a r5 = r1.f309008k
            long r5 = r5.mo26870b()
            long r7 = r0.f132318o
            long r9 = r0.f132319p
            long r9 = r9 + r7
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x0062
            int r5 = r0.f132304a
            r5 = r5 & 64
            if (r5 == 0) goto L_0x005b
            com.google.assistant.c.cz r0 = r0.f132311h
            if (r0 != 0) goto L_0x0091
            com.google.assistant.c.cz r0 = com.google.assistant.p3886c.C50802cz.f132236g
            goto L_0x0091
        L_0x005b:
            com.google.assistant.c.cz r0 = r0.f132308e
            if (r0 != 0) goto L_0x0091
            com.google.assistant.c.cz r0 = com.google.assistant.p3886c.C50802cz.f132236g
            goto L_0x0091
        L_0x0062:
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x007e
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x007e
            int r5 = r0.f132304a
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0077
            com.google.assistant.c.cz r0 = r0.f132312i
            if (r0 != 0) goto L_0x0091
            com.google.assistant.c.cz r0 = com.google.assistant.p3886c.C50802cz.f132236g
            goto L_0x0091
        L_0x0077:
            com.google.assistant.c.cz r0 = r0.f132309f
            if (r0 != 0) goto L_0x0091
            com.google.assistant.c.cz r0 = com.google.assistant.p3886c.C50802cz.f132236g
            goto L_0x0091
        L_0x007e:
            int r5 = r0.f132304a
            r5 = r5 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x008b
            com.google.assistant.c.cz r0 = r0.f132313j
            if (r0 != 0) goto L_0x0091
            com.google.assistant.c.cz r0 = com.google.assistant.p3886c.C50802cz.f132236g
            goto L_0x0091
        L_0x008b:
            com.google.assistant.c.cz r0 = r0.f132310g
            if (r0 != 0) goto L_0x0091
            com.google.assistant.c.cz r0 = com.google.assistant.p3886c.C50802cz.f132236g
        L_0x0091:
            int r5 = r0.f132238a
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0330
            android.widget.RemoteViews r5 = new android.widget.RemoteViews
            android.content.Context r7 = r1.f309003e
            java.lang.String r7 = r7.getPackageName()
            r8 = 2131627278(0x7f0e0d0e, float:1.8881816E38)
            r5.<init>(r7, r8)
            r7 = 2131436614(0x7f0b2446, float:1.8495103E38)
            r8 = 0
            r5.setViewVisibility(r7, r8)
            r9 = 2131436604(0x7f0b243c, float:1.8495083E38)
            r5.setViewVisibility(r9, r8)
            r10 = 2131436603(0x7f0b243b, float:1.8495081E38)
            r5.setViewVisibility(r10, r8)
            r11 = 2131436205(0x7f0b22ad, float:1.8494274E38)
            r12 = 8
            r5.setViewVisibility(r11, r12)
            com.google.assistant.c.b.h r11 = r0.f132239b
            if (r11 != 0) goto L_0x00c6
            com.google.assistant.c.b.h r11 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
        L_0x00c6:
            com.google.protobuf.cq r11 = r11.f132004d
            r13 = 0
        L_0x00c9:
            int r14 = r11.size()
            if (r13 >= r14) goto L_0x00e7
            java.lang.Object r14 = r11.get(r13)
            com.google.assistant.c.b.e r14 = (com.google.assistant.p3886c.p3888b.C50720e) r14
            int r14 = r14.f131989c
            com.google.assistant.c.b.g r14 = com.google.assistant.p3886c.p3888b.C50722g.m85893a(r14)
            if (r14 != 0) goto L_0x00df
            com.google.assistant.c.b.g r14 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
        L_0x00df:
            com.google.assistant.c.b.g r15 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            if (r14 == r15) goto L_0x00e4
            goto L_0x00e8
        L_0x00e4:
            int r13 = r13 + 1
            goto L_0x00c9
        L_0x00e7:
            r13 = -1
        L_0x00e8:
            com.google.assistant.c.b.h r11 = r0.f132239b
            if (r11 != 0) goto L_0x00ee
            com.google.assistant.c.b.h r11 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
        L_0x00ee:
            com.google.protobuf.cq r11 = r11.f132004d
            int r11 = r11.size()
            r14 = 2
            r15 = 4
            if (r11 != r14) goto L_0x0209
            if (r13 < 0) goto L_0x0209
            com.google.assistant.c.b.h r11 = r0.f132239b
            if (r11 != 0) goto L_0x0100
            com.google.assistant.c.b.h r11 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
        L_0x0100:
            java.lang.String r14 = r11.f132002b
            java.lang.String r10 = "%1"
            int r10 = r14.indexOf(r10)
            java.lang.String r14 = r11.f132002b
            java.lang.String r9 = "%2"
            int r9 = r14.indexOf(r9)
            java.lang.String r14 = "%1$s"
            java.lang.String r6 = "%2$s"
            if (r13 != 0) goto L_0x018e
            if (r10 >= r9) goto L_0x0153
            r5.setViewVisibility(r7, r12)
            java.lang.String r7 = r11.f132002b
            int r10 = r10 + r15
            java.lang.String r7 = r7.substring(r8, r10)
            com.google.protobuf.cq r9 = r11.f132004d
            java.lang.Object r9 = r9.get(r8)
            com.google.assistant.c.b.e r9 = (com.google.assistant.p3886c.p3888b.C50720e) r9
            java.lang.String r9 = r9.f131988b
            java.lang.String r7 = r7.replace(r14, r9)
            java.lang.String r9 = r11.f132002b
            java.lang.String r9 = r9.substring(r10)
            com.google.protobuf.cq r10 = r11.f132004d
            r11 = 1
            java.lang.Object r10 = r10.get(r11)
            com.google.assistant.c.b.e r10 = (com.google.assistant.p3886c.p3888b.C50720e) r10
            java.lang.String r10 = r10.f131988b
            java.lang.String r6 = r9.replace(r6, r10)
            r10 = 2131436604(0x7f0b243c, float:1.8495083E38)
            r5.setTextViewText(r10, r7)
            r7 = 2131436603(0x7f0b243b, float:1.8495081E38)
            r5.setTextViewText(r7, r6)
            goto L_0x0222
        L_0x0153:
            r10 = 2131436604(0x7f0b243c, float:1.8495083E38)
            r5.setViewVisibility(r10, r12)
            java.lang.String r10 = r11.f132002b
            int r9 = r9 + r15
            java.lang.String r10 = r10.substring(r8, r9)
            com.google.protobuf.cq r13 = r11.f132004d
            r15 = 1
            java.lang.Object r13 = r13.get(r15)
            com.google.assistant.c.b.e r13 = (com.google.assistant.p3886c.p3888b.C50720e) r13
            java.lang.String r13 = r13.f131988b
            java.lang.String r6 = r10.replace(r6, r13)
            java.lang.String r10 = r11.f132002b
            java.lang.String r9 = r10.substring(r9)
            com.google.protobuf.cq r10 = r11.f132004d
            java.lang.Object r10 = r10.get(r8)
            com.google.assistant.c.b.e r10 = (com.google.assistant.p3886c.p3888b.C50720e) r10
            java.lang.String r10 = r10.f131988b
            java.lang.String r9 = r9.replace(r14, r10)
            r5.setTextViewText(r7, r9)
            r7 = 2131436603(0x7f0b243b, float:1.8495081E38)
            r5.setTextViewText(r7, r6)
            goto L_0x0222
        L_0x018e:
            r15 = 1
            if (r13 != r15) goto L_0x0222
            if (r10 >= r9) goto L_0x01ce
            r13 = 2131436604(0x7f0b243c, float:1.8495083E38)
            r5.setViewVisibility(r13, r12)
            java.lang.String r9 = r11.f132002b
            r13 = 4
            int r10 = r10 + r13
            java.lang.String r9 = r9.substring(r8, r10)
            com.google.protobuf.cq r13 = r11.f132004d
            java.lang.Object r13 = r13.get(r8)
            com.google.assistant.c.b.e r13 = (com.google.assistant.p3886c.p3888b.C50720e) r13
            java.lang.String r13 = r13.f131988b
            java.lang.String r9 = r9.replace(r14, r13)
            java.lang.String r13 = r11.f132002b
            java.lang.String r10 = r13.substring(r10)
            com.google.protobuf.cq r11 = r11.f132004d
            r13 = 1
            java.lang.Object r11 = r11.get(r13)
            com.google.assistant.c.b.e r11 = (com.google.assistant.p3886c.p3888b.C50720e) r11
            java.lang.String r11 = r11.f131988b
            java.lang.String r6 = r10.replace(r6, r11)
            r5.setTextViewText(r7, r6)
            r6 = 2131436603(0x7f0b243b, float:1.8495081E38)
            r5.setTextViewText(r6, r9)
            goto L_0x0222
        L_0x01ce:
            r5.setViewVisibility(r7, r12)
            java.lang.String r7 = r11.f132002b
            r10 = 4
            int r9 = r9 + r10
            java.lang.String r7 = r7.substring(r8, r9)
            com.google.protobuf.cq r10 = r11.f132004d
            r13 = 1
            java.lang.Object r10 = r10.get(r13)
            com.google.assistant.c.b.e r10 = (com.google.assistant.p3886c.p3888b.C50720e) r10
            java.lang.String r10 = r10.f131988b
            java.lang.String r6 = r7.replace(r6, r10)
            java.lang.String r7 = r11.f132002b
            java.lang.String r7 = r7.substring(r9)
            com.google.protobuf.cq r9 = r11.f132004d
            java.lang.Object r9 = r9.get(r8)
            com.google.assistant.c.b.e r9 = (com.google.assistant.p3886c.p3888b.C50720e) r9
            java.lang.String r9 = r9.f131988b
            java.lang.String r7 = r7.replace(r14, r9)
            r9 = 2131436604(0x7f0b243c, float:1.8495083E38)
            r5.setTextViewText(r9, r6)
            r6 = 2131436603(0x7f0b243b, float:1.8495081E38)
            r5.setTextViewText(r6, r7)
            goto L_0x0222
        L_0x0209:
            r6 = 2131436603(0x7f0b243b, float:1.8495081E38)
            r5.setViewVisibility(r6, r12)
            r5.setViewVisibility(r7, r12)
            com.google.assistant.c.b.h r6 = r0.f132239b
            if (r6 != 0) goto L_0x0218
            com.google.assistant.c.b.h r6 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
        L_0x0218:
            java.lang.String r6 = r1.m184673m(r6)
            r7 = 2131436604(0x7f0b243c, float:1.8495083E38)
            r5.setTextViewText(r7, r6)
        L_0x0222:
            int r6 = r0.f132238a
            r7 = 4
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0238
            com.google.assistant.c.b.h r0 = r0.f132241d
            if (r0 != 0) goto L_0x022e
            com.google.assistant.c.b.h r0 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
        L_0x022e:
            r6 = 2131436202(0x7f0b22aa, float:1.8494268E38)
            java.lang.String r0 = r1.m184673m(r0)
            r5.setTextViewText(r6, r0)
        L_0x0238:
            android.graphics.Bitmap r0 = r3.f256821b
            r6 = 2131436199(0x7f0b22a7, float:1.8494262E38)
            if (r0 == 0) goto L_0x02f4
            android.graphics.Bitmap r7 = r1.m184670j(r0)
            com.google.android.apps.gsa.search.core.i.w r0 = r1.f309009l
            com.google.android.apps.gsa.search.core.i.aa r0 = r0.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r0 = r0.mo79722a()
            com.google.android.apps.gsa.search.core.i.t r9 = r1.f309006i
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247875Q
            boolean r9 = r9.mo79746e(r10)
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x02da
            java.lang.String r9 = "com.google.android.apps.oemsmartspace.SMARTSPACE_RESOURCE_PACKAGE"
            boolean r11 = r0.contains(r9)
            if (r11 == 0) goto L_0x02da
            java.lang.String r9 = r0.getString(r9, r10)
            android.content.Context r0 = r1.f309003e     // Catch:{ NameNotFoundException -> 0x02c4 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x02c4 }
            r11 = 2
            android.content.Context r0 = r0.createPackageContext(r9, r11)     // Catch:{ NameNotFoundException -> 0x02c4 }
            com.google.assistant.c.do r11 = r3.f256820a     // Catch:{ NameNotFoundException -> 0x02c4 }
            int r11 = r11.f132315l     // Catch:{ NameNotFoundException -> 0x02c4 }
            com.google.assistant.c.cr r11 = com.google.assistant.p3886c.C50794cr.m85938a(r11)     // Catch:{ NameNotFoundException -> 0x02c4 }
            if (r11 != 0) goto L_0x027a
            com.google.assistant.c.cr r11 = com.google.assistant.p3886c.C50794cr.UNDEFINED     // Catch:{ NameNotFoundException -> 0x02c4 }
        L_0x027a:
            com.google.assistant.c.b.d r13 = com.google.assistant.p3886c.p3888b.C50719d.UNDEFINED     // Catch:{ NameNotFoundException -> 0x02c4 }
            int r11 = r11.ordinal()     // Catch:{ NameNotFoundException -> 0x02c4 }
            r13 = 2
            if (r11 == r13) goto L_0x0296
            r13 = 3
            if (r11 == r13) goto L_0x0293
            r13 = 4
            if (r11 == r13) goto L_0x0290
            if (r11 == r12) goto L_0x028d
            r11 = r10
            goto L_0x0298
        L_0x028d:
            java.lang.String r11 = "reminder"
            goto L_0x0298
        L_0x0290:
            java.lang.String r11 = "flight"
            goto L_0x0298
        L_0x0293:
            java.lang.String r11 = "commute"
            goto L_0x0298
        L_0x0296:
            java.lang.String r11 = "calendar"
        L_0x0298:
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NameNotFoundException -> 0x02c4 }
            java.lang.String r13 = "drawable"
            int r0 = r0.getIdentifier(r11, r13, r9)     // Catch:{ NameNotFoundException -> 0x02c4 }
            if (r0 == 0) goto L_0x02ab
            r5.setImageViewResource(r6, r0)     // Catch:{ NameNotFoundException -> 0x02c4 }
            r5.setViewVisibility(r6, r8)     // Catch:{ NameNotFoundException -> 0x02c4 }
            goto L_0x02e0
        L_0x02ab:
            r5.setViewVisibility(r6, r12)     // Catch:{ NameNotFoundException -> 0x02c4 }
            com.google.common.f.a.d r0 = r1.f309001c     // Catch:{ NameNotFoundException -> 0x02c4 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ NameNotFoundException -> 0x02c4 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ NameNotFoundException -> 0x02c4 }
            r12 = 26892(0x690c, float:3.7684E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r12)     // Catch:{ NameNotFoundException -> 0x02c4 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ NameNotFoundException -> 0x02c4 }
            java.lang.String r12 = "failed to get the resources: %d, cardName: %s"
            r0.mo56395y(r12, r8, r11)     // Catch:{ NameNotFoundException -> 0x02c4 }
            goto L_0x02da
        L_0x02c4:
            r0 = move-exception
            com.google.common.f.a.d r11 = r1.f309001c
            com.google.common.f.x r11 = r11.mo56225c()
            com.google.common.f.a.a r11 = (com.google.common.p4526f.p4527a.C58970a) r11
            r12 = 26893(0x690d, float:3.7685E-41)
            com.google.common.f.x r11 = r11.mo56372aa(r12)
            com.google.common.f.a.a r11 = (com.google.common.p4526f.p4527a.C58970a) r11
            java.lang.String r12 = "Failed to find the target package: %s %s"
            r11.mo56354G(r12, r9, r0)
        L_0x02da:
            r5.setImageViewBitmap(r6, r7)
            r5.setViewVisibility(r6, r8)
        L_0x02e0:
            com.google.assistant.c.do r0 = r3.f256820a
            int r7 = r0.f132304a
            r7 = r7 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x02f0
            com.google.assistant.c.b.n r0 = r0.f132314k
            if (r0 != 0) goto L_0x02ee
            com.google.assistant.c.b.n r0 = com.google.assistant.p3886c.p3888b.C50729n.f132007g
        L_0x02ee:
            java.lang.String r10 = r0.f132012d
        L_0x02f0:
            m184667g(r5, r6, r10)
            goto L_0x02f7
        L_0x02f4:
            r5.setViewVisibility(r6, r12)
        L_0x02f7:
            com.google.assistant.c.do r0 = r3.f256820a
            android.content.Intent r0 = r1.m184669i(r0)
            if (r0 == 0) goto L_0x031c
            com.google.assistant.c.do r3 = r3.f256820a
            com.google.assistant.c.b.r r3 = r3.f132316m
            if (r3 != 0) goto L_0x0307
            com.google.assistant.c.b.r r3 = com.google.assistant.p3886c.p3888b.C50733r.f132021d
        L_0x0307:
            int r3 = r3.f132024b
            com.google.assistant.c.b.p r3 = com.google.assistant.p3886c.p3888b.C50731p.m85907a(r3)
            if (r3 != 0) goto L_0x0311
            com.google.assistant.c.b.p r3 = com.google.assistant.p3886c.p3888b.C50731p.UNDEFINED
        L_0x0311:
            r6 = 2131437209(0x7f0b2699, float:1.849631E38)
            r7 = 1
            android.app.PendingIntent r0 = r1.m184668h(r0, r7, r3)
            r5.setOnClickPendingIntent(r6, r0)
        L_0x031c:
            com.google.common.util.concurrent.cx r0 = r1.m184672l(r5, r2)
            com.google.android.apps.gsa.staticplugins.opa.smartspace.r.h r2 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.r.h
            r2.<init>(r1, r5, r4)
            com.google.common.util.concurrent.db r3 = r1.f309012o
            com.google.common.util.concurrent.s r2 = com.google.apps.tiktok.tracing.C47810es.m84966f(r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r0, r2, r3)
            goto L_0x0339
        L_0x0330:
            com.google.common.util.concurrent.cx r0 = r1.mo98934b(r4, r2)
            goto L_0x0339
        L_0x0335:
            com.google.common.util.concurrent.cx r0 = r1.mo98934b(r4, r2)
        L_0x0339:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.smartspace.p8469r.C110925k.mo98936d(com.google.android.apps.gsa.smartspace.i[], java.util.List):com.google.common.util.concurrent.cx");
    }

    /* renamed from: e */
    public final void mo98937e(RemoteViews remoteViews, C58833ax axVar) {
        remoteViews.setViewVisibility(R.id.widget_chip_carousel, 0);
        if (axVar.mo56113h() && ((float) ((Integer) axVar.mo56107c()).intValue()) < 87.0f) {
            ((C58970a) ((C58970a) this.f309001c.mo56224b()).mo56372aa(26883)).mo56389s("Chips will not fit. Widget height %d", axVar.mo56107c());
            remoteViews.setViewVisibility(R.id.widget_chip_carousel, 8);
            if (((float) ((Integer) axVar.mo56107c()).intValue()) > 50.0f) {
                this.f309006i.mo79746e(C90017bw.f248026cz);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo98938f(RemoteViews remoteViews) {
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f309003e);
        instance.updateAppWidget(f308998a, remoteViews);
        if (this.f309004f == null && this.f309005h != null) {
            C110923i iVar = new C110923i(this, remoteViews, instance);
            this.f309004f = iVar;
            this.f309010m.postDelayed(iVar, f308999b);
        }
    }
}

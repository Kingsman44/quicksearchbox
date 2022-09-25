package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.provider.CalendarContract;
import android.text.format.Time;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.p3624b.C46356a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58837ba;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.TimeZone;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.e */
/* compiled from: PG */
public final class C123860e implements C123827a {

    /* renamed from: a */
    static final String[] f342140a = {"event_id", "title", "eventLocation", "begin", "end", "accessLevel", "selfAttendeeStatus", "account_type", "_sync_id", "original_sync_id", "allDay", "calendar_id"};

    /* renamed from: b */
    static final String[] f342141b = {"_id", "account_name", "calendar_displayName", "name", "cal_sync1", "sync_events", "visible"};

    /* renamed from: c */
    public static final C58881cr f342142c = C58886cw.m90973a(C123859d.f342139a);

    /* renamed from: d */
    private final Context f342143d;

    /* renamed from: e */
    private final C46877q f342144e;

    /* renamed from: f */
    private final C58974d f342145f;

    public C123860e(Context context, C46877q qVar, C130603a aVar) {
        this.f342143d = context;
        this.f342144e = qVar;
        this.f342145f = aVar.mo109739a("PCP.LocalCalendar");
    }

    /* renamed from: c */
    public static long m203169c(int i) {
        Time time = new Time(TimeZone.getDefault().getID());
        time.setJulianDay(i);
        return time.toMillis(false) / 1000;
    }

    /* renamed from: d */
    public static boolean m203170d(String str) {
        return C58837ba.m90859h(str) || str.trim().length() == 0;
    }

    /* renamed from: e */
    private final C46463o m203171e(Uri uri, String[] strArr, String str) {
        C47558bi a = C46356a.m82648a(C39227c.m68658b(C39226b.TAG_ASSISTANT_PCP));
        try {
            C46463o b = this.f342144e.mo50872b(uri, strArr, str, (String[]) null, (String) null);
            a.close();
            return b;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: f */
    private static void m203172f() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Should NOT be done on the UI thread");
        }
    }

    /* renamed from: g */
    private final boolean m203173g() {
        if (this.f342143d.checkPermission("android.permission.READ_CALENDAR", Process.myPid(), Process.myUid()) == 0) {
            return true;
        }
        ((C58970a) ((C58970a) this.f342145f.mo56226d()).mo56372aa(35276)).mo56386p("Does not have permission to access calendar content provider");
        return false;
    }

    /* renamed from: a */
    public final C60870cx mo106138a() {
        m203172f();
        if (!m203173g()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        return m203171e(CalendarContract.Calendars.CONTENT_URI, f342141b, "(visible=1) AND (calendar_access_level=700)").f121591a.mo57272e(C47810es.m84970j(C123854b.f342136a), C60826bg.f164896a).mo57275g();
    }

    /* renamed from: b */
    public final C60870cx mo106139b(Instant instant, Instant instant2) {
        m203172f();
        if (!m203173g()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        Uri.Builder buildUpon = CalendarContract.Instances.CONTENT_URI.buildUpon();
        ContentUris.appendId(buildUpon, instant.toEpochMilli());
        ContentUris.appendId(buildUpon, instant2.toEpochMilli());
        return m203171e(buildUpon.build(), f342140a, "(visible=1) AND (calendar_access_level=700) AND (selfAttendeeStatus!=2) AND ((account_type!='com.google') OR (sync_data9 IS NULL) OR ((sync_data9!='true') AND ((CAST(sync_data9 AS INTEGER)&1)=0)))").f121591a.mo57272e(C47810es.m84970j(C123858c.f342138a), C60826bg.f164896a).mo57275g();
    }
}

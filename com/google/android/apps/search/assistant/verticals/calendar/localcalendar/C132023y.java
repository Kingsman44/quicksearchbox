package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Process;
import android.provider.CalendarContract;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.C131982a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.p3624b.C46356a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.y */
/* compiled from: PG */
final class C132023y implements C131982a {

    /* renamed from: a */
    static final String[] f360367a = {"_id", "account_name", "account_type", "ownerAccount", "isPrimary", "visible"};

    /* renamed from: b */
    static final String[] f360368b = {"calendar_id", "allDay"};

    /* renamed from: c */
    private final Context f360369c;

    /* renamed from: d */
    private final C46877q f360370d;

    /* renamed from: e */
    private final Executor f360371e;

    /* renamed from: f */
    private final C60950i f360372f;

    /* renamed from: g */
    private final Duration f360373g;

    public C132023y(Context context, C46877q qVar, Executor executor, C60950i iVar, long j) {
        this.f360369c = context;
        this.f360370d = qVar;
        this.f360371e = executor;
        this.f360372f = iVar;
        this.f360373g = Duration.ofDays(j);
    }

    /* renamed from: a */
    public final C60870cx mo110365a() {
        if (this.f360369c.checkPermission("android.permission.READ_CALENDAR", Process.myPid(), Process.myUid()) != 0) {
            return C60856cj.m92899h(new Exception("Does not have permission to access calendar content provider"));
        }
        C47558bi a = C46356a.m82648a(C39227c.m68658b(C39226b.TAG_ASSISTANT_CALENDAR));
        try {
            Uri.Builder buildUpon = CalendarContract.Instances.CONTENT_URI.buildUpon();
            Instant a2 = this.f360372f.mo57444a();
            ContentUris.appendId(buildUpon, a2.toEpochMilli());
            ContentUris.appendId(buildUpon, a2.plus(this.f360373g).toEpochMilli());
            C60817ay ayVar = this.f360370d.mo50872b(buildUpon.build(), f360368b, (String) null, (String[]) null, (String) null).f121591a;
            C60817ay ayVar2 = this.f360370d.mo50872b(CalendarContract.Calendars.CONTENT_URI, f360367a, (String) null, (String[]) null, (String) null).f121591a;
            C60838bs g = C60817ay.m92814a(ayVar, ayVar2).mo57266a(new C132022x(ayVar, ayVar2), this.f360371e).mo57275g();
            a.close();
            return g;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}

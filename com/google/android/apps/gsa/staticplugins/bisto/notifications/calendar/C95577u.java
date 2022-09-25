package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Build;
import android.provider.CalendarContract;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90424e;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90425f;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95598as;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60904dr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.u */
/* compiled from: PG */
public final class C95577u {

    /* renamed from: a */
    public static final C59071e f267461a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.u");

    /* renamed from: b */
    public static final long f267462b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c */
    public static final long f267463c = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: k */
    private static final long f267464k = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: l */
    private static final long f267465l = TimeUnit.MINUTES.toMillis(4);

    /* renamed from: m */
    private static final long f267466m = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: d */
    public final Context f267467d;

    /* renamed from: e */
    public final C21370a f267468e;

    /* renamed from: f */
    public final BroadcastReceiver f267469f;

    /* renamed from: g */
    public final BroadcastReceiver f267470g;

    /* renamed from: h */
    public final C95571o f267471h;

    /* renamed from: i */
    public final Map f267472i = new HashMap();

    /* renamed from: j */
    public final Set f267473j = new HashSet();

    /* renamed from: n */
    private final C89656k f267474n;

    /* renamed from: o */
    private final C95598as f267475o;

    /* renamed from: p */
    private final Executor f267476p;

    public C95577u(Context context, C21370a aVar, C89656k kVar, Executor executor, C95598as asVar) {
        Context applicationContext = context.getApplicationContext();
        this.f267467d = applicationContext;
        this.f267468e = aVar;
        this.f267474n = kVar;
        this.f267475o = asVar;
        C95575s sVar = new C95575s(this);
        this.f267469f = sVar;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.EVENT_REMINDER");
        intentFilter.addDataScheme("content");
        applicationContext.registerReceiver(sVar, intentFilter);
        C95576t tVar = new C95576t(this);
        this.f267470g = tVar;
        applicationContext.registerReceiver(tVar, new IntentFilter("com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.ACTION_POST_ANNOUNCEMENT"));
        this.f267471h = new C95571o(applicationContext, C39226b.TAG_CLASSIC_ASSISTANT_BISTO);
        this.f267476p = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C90421b mo89511a(AnnounceableEvent announceableEvent, Long l) {
        String str;
        C58976aa aaVar = C58975e.f156826a;
        C$AutoValue_AnnounceableEvent _autovalue_announceableevent = (C$AutoValue_AnnounceableEvent) announceableEvent;
        if (C58837ba.m90859h(_autovalue_announceableevent.f267424c)) {
            str = this.f267467d.getString(R.string.calendar_event_tts_no_title);
        } else {
            str = this.f267467d.getString(R.string.calendar_event_tts, new Object[]{_autovalue_announceableevent.f267424c});
        }
        String format = String.format(Locale.US, "eventId = %d; instanceId = %d", new Object[]{Long.valueOf(_autovalue_announceableevent.f267422a), Long.valueOf(_autovalue_announceableevent.f267423b)});
        C90424e eVar = new C90424e(this.f267468e);
        eVar.f252565b = this.f267467d.getString(R.string.calendar_app_name_override);
        eVar.f252575l = this.f267467d.getPackageName();
        eVar.f252568e = "event";
        eVar.f252571h = true;
        eVar.f252576m = Long.valueOf(this.f267468e.mo26870b());
        String packageName = this.f267467d.getPackageName();
        eVar.f252573j = "0|" + packageName + "|0|" + format + "|0";
        eVar.f252566c = false;
        eVar.f252599q = Long.valueOf(_autovalue_announceableevent.f267427f);
        eVar.f252600r = str;
        if (l != null) {
            eVar.f252601s = l;
        }
        return new C90425f(eVar);
    }

    /* renamed from: b */
    public final void mo89512b(List list) {
        C58976aa aaVar = C58975e.f156826a;
        int i = ((C58724pq) list).f156474d;
        if (!list.isEmpty() && C36619a.m65149e(this.f267467d)) {
            this.f267475o.mo89542f(list);
        }
    }

    /* renamed from: c */
    public final void mo89513c(Runnable runnable) {
        this.f267476p.execute(runnable);
    }

    /* renamed from: d */
    public final void mo89514d(AnnounceableEvent announceableEvent) {
        Cursor query;
        Throwable th;
        C58976aa aaVar = C58975e.f156826a;
        C$AutoValue_AnnounceableEvent _autovalue_announceableevent = (C$AutoValue_AnnounceableEvent) announceableEvent;
        if (_autovalue_announceableevent.f267427f - this.f267468e.mo26870b() > 0) {
            C95571o oVar = this.f267471h;
            long j = _autovalue_announceableevent.f267422a;
            ArrayList<C95570n> arrayList = new ArrayList<>();
            try {
                query = CalendarContract.Reminders.query(oVar.f267454b, j, new String[]{"minutes", "method"});
                while (query != null) {
                    if (!query.moveToNext()) {
                        break;
                    }
                    arrayList.add(new C95563g(C95571o.m158228a(query, "minutes"), C95571o.m158228a(query, "method")));
                }
                if (query != null) {
                    query.close();
                }
            } catch (RuntimeException e) {
                C59104x d = C95571o.f267453a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CalendarContractWrapper");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(16140)).mo56386p("Error getting reminder info.");
            } catch (Throwable th2) {
                C95564h.m158199a(th, th2);
            }
            for (C95570n nVar : arrayList) {
                if (TimeUnit.MINUTES.toMillis((long) nVar.mo89500b()) <= f267465l && (nVar.mo89499a() == 1 || nVar.mo89499a() == 0)) {
                    C59104x b = f267461a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "CalendarManager");
                    ((C59052c) ((C59052c) b).mo56372aa(16160)).mo56386p("There was already a reminder near the event start time.");
                    return;
                }
            }
            AlarmManager alarmManager = (AlarmManager) this.f267467d.getSystemService("alarm");
            if (!this.f267472i.containsKey(Long.valueOf(_autovalue_announceableevent.f267427f))) {
                Intent intent = new Intent("com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.ACTION_POST_ANNOUNCEMENT");
                intent.putExtra("com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.EXTRA_START_TIME", _autovalue_announceableevent.f267427f);
                PendingIntent broadcast = PendingIntent.getBroadcast(this.f267467d, (int) _autovalue_announceableevent.f267422a, intent, 335544320);
                if (Build.VERSION.SDK_INT < 31 || alarmManager.canScheduleExactAlarms()) {
                    alarmManager.setExact(0, _autovalue_announceableevent.f267427f - f267464k, broadcast);
                } else {
                    long j2 = f267464k;
                    long j3 = f267466m;
                    alarmManager.setWindow(0, _autovalue_announceableevent.f267427f - (j2 + j3), j3, broadcast);
                }
                this.f267472i.put(Long.valueOf(_autovalue_announceableevent.f267427f), broadcast);
                return;
            }
            return;
        }
        return;
        throw th;
    }

    /* renamed from: e */
    public final boolean mo89515e(C95568l lVar, long j) {
        Cursor query;
        C58976aa aaVar = C58975e.f156826a;
        if (!lVar.mo89490i() || lVar.mo89486f() || lVar.mo89487g() || lVar.mo89480a() == 2) {
            return false;
        }
        if (this.f267468e.mo26870b() - j >= TimeUnit.MINUTES.toMillis(this.f267474n.mo83546a("calendar_mins_after_event_start_to_remove"))) {
            return false;
        }
        if (!lVar.mo89488h()) {
            long b = lVar.mo89481b();
            C95571o oVar = this.f267471h;
            ArrayList<C95566j> arrayList = new ArrayList<>();
            try {
                query = CalendarContract.Attendees.query(oVar.f267454b, b, new String[]{"attendeeName", "attendeeEmail", "attendeeStatus"});
                while (query != null) {
                    if (!query.moveToNext()) {
                        break;
                    }
                    arrayList.add(new C95559c(C95571o.m158230c(query, "attendeeName"), C95571o.m158230c(query, "attendeeEmail"), C95571o.m158228a(query, "attendeeStatus")));
                }
                if (query != null) {
                    query.close();
                }
            } catch (RuntimeException e) {
                C59104x d = C95571o.f267453a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CalendarContractWrapper");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(16137)).mo56386p("Error getting attendee info.");
            } catch (Throwable th) {
                C95564h.m158199a(th, th);
            }
            for (C95566j jVar : arrayList) {
                if (jVar.mo89470a() == 2 || !this.f267473j.contains(jVar.mo89471b())) {
                }
            }
            return false;
        }
        return true;
        throw th;
    }
}

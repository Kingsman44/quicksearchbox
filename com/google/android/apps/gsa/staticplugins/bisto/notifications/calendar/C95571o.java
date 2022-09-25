package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.provider.CalendarContract;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.p4522b.C58704ox;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.o */
/* compiled from: PG */
final class C95571o {

    /* renamed from: a */
    public static final C59071e f267453a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.o");

    /* renamed from: b */
    public final ContentResolver f267454b;

    public C95571o(Context context, C39226b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f267454b = C39239a.m68666a(context, bVar).getContentResolver();
        } else {
            this.f267454b = context.getContentResolver();
        }
    }

    /* renamed from: a */
    public static int m158228a(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndex(str));
    }

    /* renamed from: b */
    public static long m158229b(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    /* renamed from: c */
    public static String m158230c(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndex(str));
    }

    /* renamed from: e */
    public static boolean m158231e(Cursor cursor, String str) {
        return m158228a(cursor, str) == 1;
    }

    /* renamed from: d */
    public final Collection mo89505d(long j, long j2) {
        Cursor query;
        Throwable th;
        ArrayList arrayList = new ArrayList();
        try {
            String format = String.format("%s >= ? AND %s <= ?", new Object[]{"alarmTime", "alarmTime"});
            String[] strArr = {String.valueOf(j), String.valueOf(j2)};
            query = this.f267454b.query(CalendarContract.CalendarAlerts.CONTENT_URI, (String[]) C58704ox.m90448a(new String[]{"_id", "event_id", "alarmTime", "begin", "state"}, C95568l.m158212k(), String.class), format, strArr, (String) null);
            while (query != null) {
                if (!query.moveToNext()) {
                    break;
                }
                long b = m158229b(query, "event_id");
                arrayList.add(new C95558b(m158229b(query, "_id"), b, m158229b(query, "alarmTime"), m158229b(query, "begin"), m158228a(query, "state"), C95568l.m158211j(b, query)));
            }
            if (query != null) {
                query.close();
            }
        } catch (RuntimeException e) {
            C59104x d = f267453a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CalendarContractWrapper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(16136)).mo56386p("Error getting alert info.");
        } catch (Throwable th2) {
            C95564h.m158199a(th, th2);
        }
        return arrayList;
        throw th;
    }
}

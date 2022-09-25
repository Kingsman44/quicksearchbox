package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7503e;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90420a;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90425f;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90432m;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90433n;
import com.google.android.apps.gsa.shared.notificationlistening.common.GroupDataKey;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.StandardNotification;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60904dr;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.e.d */
/* compiled from: PG */
public final class C95635d extends SQLiteOpenHelper {

    /* renamed from: a */
    private static final C59071e f267644a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.e.d");

    /* renamed from: b */
    private final Executor f267645b;

    /* renamed from: c */
    private final boolean f267646c;

    public C95635d(Context context, Executor executor, C89656k kVar) {
        super(context, "notification.db", (SQLiteDatabase.CursorFactory) null, 11);
        this.f267645b = new C60904dr(executor);
        this.f267646c = kVar.mo83555j(167);
    }

    /* renamed from: a */
    public static long m158329a(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    /* renamed from: b */
    public static Uri m158330b(Cursor cursor, String str) {
        String e = m158333e(cursor, str);
        if (e == null) {
            return null;
        }
        return Uri.parse(e);
    }

    /* renamed from: c */
    public static Integer m158331c(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (cursor.isNull(columnIndex)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(columnIndex));
    }

    /* renamed from: d */
    public static Long m158332d(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (cursor.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(columnIndex));
    }

    /* renamed from: e */
    public static String m158333e(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (cursor.isNull(columnIndex)) {
            return null;
        }
        return cursor.getString(columnIndex);
    }

    /* renamed from: h */
    public static void m158334h(ContentValues contentValues, String str, Object obj) {
        if (obj == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, obj.toString());
        }
    }

    /* renamed from: i */
    public static boolean m158335i(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndex(str)) != 0;
    }

    /* renamed from: p */
    private final SQLiteDatabase m158336p() {
        try {
            return getReadableDatabase();
        } catch (SQLiteException e) {
            C59104x d = f267644a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(16304)).mo56386p("fail to open");
            return null;
        }
    }

    /* renamed from: q */
    private final SQLiteDatabase m158337q() {
        try {
            return getWritableDatabase();
        } catch (SQLiteException e) {
            C59104x d = f267644a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(16305)).mo56386p("fail to open");
            return null;
        }
    }

    /* renamed from: r */
    private static String m158338r(String str, String str2) {
        if (str != null) {
            return str;
        }
        C59104x d = f267644a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
        ((C59052c) ((C59052c) d).mo56372aa(16307)).mo56389s("%s is missing from DB.", str2);
        return BuildConfig.FLAVOR;
    }

    /* renamed from: s */
    private static void m158339s(C90420a aVar, Cursor cursor) {
        long j;
        aVar.f252577n = Long.valueOf(m158329a(cursor, "id"));
        aVar.f252565b = m158338r(m158333e(cursor, "app_name"), "App name");
        aVar.f252567d = m158330b(cursor, "audio_contents");
        aVar.f252568e = m158333e(cursor, "category");
        aVar.f252569f = m158330b(cursor, "chime");
        aVar.f252570g = m158331c(cursor, "content_version_id");
        aVar.f252571h = m158335i(cursor, "does_alert");
        String e = m158333e(cursor, "group_data_key");
        aVar.f252572i = e == null ? null : new GroupDataKey(e);
        aVar.f252566c = m158335i(cursor, "is_group_child");
        aVar.f252573j = m158338r(m158333e(cursor, "key"), "System notification key");
        aVar.f252575l = m158338r(m158333e(cursor, "package_name"), "Package name");
        aVar.f252576m = Long.valueOf(m158329a(cursor, "post_time"));
        Long d = m158332d(cursor, "content_creation_time");
        if (d == null) {
            j = aVar.f252576m.longValue();
        } else {
            j = d.longValue();
        }
        aVar.f252578o = Long.valueOf(j);
    }

    /* renamed from: t */
    private final void m158340t(C90421b bVar, C21370a aVar) {
        int intValue;
        int intValue2;
        if (!bVar.mo84146f()) {
            C59104x d = f267644a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
            ((C59052c) ((C59052c) d).mo56372aa(16323)).mo56386p("Cannot restore state without a notification ID!");
            return;
        }
        SQLiteDatabase p = m158336p();
        if (p != null) {
            Cursor cursor = null;
            try {
                ArrayList arrayList = new ArrayList();
                long a = bVar.mo84144a();
                Cursor query = p.query("playback_event", C95632a.f267641a, "notification_id=?", new String[]{Long.toString(a)}, (String) null, (String) null, "timestamp ASC");
                while (query.moveToNext()) {
                    Integer c = m158331c(query, "type");
                    if (c == null || (intValue2 = c.intValue()) < 0 || intValue2 > 12) {
                        C58976aa aaVar = C58975e.f156826a;
                    } else {
                        long a2 = m158329a(query, "timestamp");
                        arrayList.add(new C90432m(c.intValue(), m158335i(query, "is_interruptive"), a2));
                    }
                }
                query.close();
                cursor = p.query("playback_state", C95633b.f267642a, "notification_id=?", new String[]{Long.toString(a)}, (String) null, (String) null, (String) null);
                if (cursor.moveToFirst()) {
                    Integer c2 = m158331c(cursor, "intended_playback_type");
                    if (c2 == null || (intValue = c2.intValue()) < 0 || intValue > 4) {
                        C58976aa aaVar2 = C58975e.f156826a;
                    } else {
                        bVar.f252594o = new C90433n(aVar, a, c2.intValue(), arrayList);
                        if (cursor != null) {
                            cursor.close();
                            return;
                        }
                        return;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLException e) {
                C59104x d2 = f267644a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(16321)).mo56386p("Failed to restore playback state from database.");
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public final synchronized void close() {
        mo89592o(new C95634c(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ea, code lost:
        if (r3 != null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0116, code lost:
        if (r3 != null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0118, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011b, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011e  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection mo89585f(com.google.android.libraries.p1730f.C21370a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "NotificationDbHelper"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.database.sqlite.SQLiteDatabase r2 = r10.m158336p()
            if (r2 == 0) goto L_0x0122
            r3 = 0
            java.lang.String r4 = "SELECT * FROM event_notification JOIN audio_notification ON event_notification.notification_id = audio_notification.id"
            android.database.Cursor r4 = r2.rawQuery(r4, r3)     // Catch:{ SQLException -> 0x00ef }
        L_0x0014:
            boolean r5 = r4.moveToNext()     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            if (r5 == 0) goto L_0x0070
            com.google.android.apps.gsa.shared.notificationlistening.common.e r5 = new com.google.android.apps.gsa.shared.notificationlistening.common.e     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r5.<init>(r11)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            m158339s(r5, r4)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            java.lang.String r6 = "event_start_timestamp"
            java.lang.Long r6 = m158332d(r4, r6)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            java.lang.String r7 = "Start timestamp"
            if (r6 != 0) goto L_0x0044
            com.google.common.f.e r6 = f267644a     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r6.mo56378ag(r8, r0)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            java.lang.String r8 = "%s is missing from DB."
            r9 = 16306(0x3fb2, float:2.285E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r9)).mo56389s(r8, r7)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r6 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
        L_0x0044:
            long r6 = r6.longValue()     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r5.f252599q = r6     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            java.lang.String r6 = "event_title"
            java.lang.String r6 = m158333e(r4, r6)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            java.lang.String r7 = "Title"
            java.lang.String r6 = m158338r(r6, r7)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r5.f252600r = r6     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            java.lang.String r6 = "event_reminder_timestamp"
            java.lang.Long r6 = m158332d(r4, r6)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r5.f252601s = r6     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            com.google.android.apps.gsa.shared.notificationlistening.common.f r6 = new com.google.android.apps.gsa.shared.notificationlistening.common.f     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r6.<init>(r5)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r10.m158340t(r6, r11)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r1.add(r6)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            goto L_0x0014
        L_0x0070:
            r4.close()     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            java.lang.String r5 = "SELECT * FROM message_notification JOIN audio_notification ON message_notification.notification_id = audio_notification.id"
            android.database.Cursor r4 = r2.rawQuery(r5, r3)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
        L_0x0079:
            boolean r5 = r4.moveToNext()     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            if (r5 == 0) goto L_0x00b1
            com.google.android.apps.gsa.shared.notificationlistening.common.j r5 = new com.google.android.apps.gsa.shared.notificationlistening.common.j     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r5.<init>(r11)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            m158339s(r5, r4)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            java.lang.String r6 = "group_name_column"
            java.lang.String r6 = m158333e(r4, r6)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r5.f252620q = r6     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            java.lang.String r6 = "message"
            java.lang.String r6 = m158333e(r4, r6)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r5.f252622s = r6     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            java.lang.String r6 = "sender_name"
            java.lang.String r6 = m158333e(r4, r6)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            java.lang.String r7 = "Sender name"
            java.lang.String r6 = m158338r(r6, r7)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r5.f252615D = r6     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r6 = new com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r6.<init>(r5)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r10.m158340t(r6, r11)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            r1.add(r6)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            goto L_0x0079
        L_0x00b1:
            r4.close()     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
            java.lang.String r5 = "SELECT * FROM standard_notification JOIN audio_notification ON standard_notification.notification_id = audio_notification.id"
            android.database.Cursor r3 = r2.rawQuery(r5, r3)     // Catch:{ SQLException -> 0x00f4, all -> 0x00f1 }
        L_0x00ba:
            boolean r2 = r3.moveToNext()     // Catch:{ SQLException -> 0x00ef }
            if (r2 == 0) goto L_0x00ea
            com.google.android.apps.gsa.shared.notificationlistening.common.p r2 = new com.google.android.apps.gsa.shared.notificationlistening.common.p     // Catch:{ SQLException -> 0x00ef }
            r2.<init>(r11)     // Catch:{ SQLException -> 0x00ef }
            m158339s(r2, r3)     // Catch:{ SQLException -> 0x00ef }
            java.lang.String r4 = "content_header"
            java.lang.String r4 = m158333e(r3, r4)     // Catch:{ SQLException -> 0x00ef }
            r2.f252645q = r4     // Catch:{ SQLException -> 0x00ef }
            java.lang.String r4 = "content_body"
            java.lang.String r4 = m158333e(r3, r4)     // Catch:{ SQLException -> 0x00ef }
            java.lang.String r5 = "Content body"
            java.lang.String r4 = m158338r(r4, r5)     // Catch:{ SQLException -> 0x00ef }
            r2.f252646r = r4     // Catch:{ SQLException -> 0x00ef }
            com.google.android.apps.gsa.shared.notificationlistening.common.StandardNotification r4 = new com.google.android.apps.gsa.shared.notificationlistening.common.StandardNotification     // Catch:{ SQLException -> 0x00ef }
            r4.<init>(r2)     // Catch:{ SQLException -> 0x00ef }
            r10.m158340t(r4, r11)     // Catch:{ SQLException -> 0x00ef }
            r1.add(r4)     // Catch:{ SQLException -> 0x00ef }
            goto L_0x00ba
        L_0x00ea:
            if (r3 == 0) goto L_0x011b
            goto L_0x0118
        L_0x00ed:
            r11 = move-exception
            goto L_0x011c
        L_0x00ef:
            r11 = move-exception
            goto L_0x00f6
        L_0x00f1:
            r11 = move-exception
            r3 = r4
            goto L_0x011c
        L_0x00f4:
            r11 = move-exception
            r3 = r4
        L_0x00f6:
            com.google.common.f.e r2 = f267644a     // Catch:{ all -> 0x00ed }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x00ed }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00ed }
            r2.mo56378ag(r4, r0)     // Catch:{ all -> 0x00ed }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00ed }
            com.google.common.f.x r11 = r2.mo56382g(r11)     // Catch:{ all -> 0x00ed }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x00ed }
            r0 = 16308(0x3fb4, float:2.2852E-41)
            com.google.common.f.x r11 = r11.mo56372aa(r0)     // Catch:{ all -> 0x00ed }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "Exception reading from database."
            r11.mo56386p(r0)     // Catch:{ all -> 0x00ed }
            if (r3 == 0) goto L_0x011b
        L_0x0118:
            r3.close()
        L_0x011b:
            return r1
        L_0x011c:
            if (r3 == 0) goto L_0x0121
            r3.close()
        L_0x0121:
            throw r11
        L_0x0122:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7503e.C95635d.mo89585f(com.google.android.libraries.f.a):java.util.Collection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo89586g() {
        super.close();
    }

    /* renamed from: j */
    public final void mo89587j() {
        C59104x d;
        char c;
        C58976aa aaVar = C58975e.f156826a;
        SQLiteDatabase q = m158337q();
        if (q != null) {
            q.beginTransaction();
            try {
                q.delete("audio_notification", (String) null, (String[]) null);
                q.delete("event_notification", (String) null, (String[]) null);
                q.delete("message_notification", (String) null, (String[]) null);
                q.delete("standard_notification", (String) null, (String[]) null);
                q.execSQL("CREATE TABLE IF NOT EXISTS playback_state (notification_id INTEGER PRIMARY KEY REFERENCES audio_notification(id) ON DELETE CASCADE, intended_playback_type INTEGER NOT NULL);");
                q.execSQL("CREATE TABLE IF NOT EXISTS playback_event (notification_id INTEGER NOT NULL REFERENCES audio_notification(id) ON DELETE CASCADE, is_interruptive INTEGER NOT NULL, timestamp INEGER NOT NULL, type INTEGER NOT NULL);");
                q.execSQL("CREATE TABLE IF NOT EXISTS engagement (serialized_identifier TEXT NOT NULL PRIMARY KEY, expiration_timestamp INTEGER, interruptive_notification_id INTEGER REFERENCES audio_notification(id) ON DELETE CASCADE, state INTEGER )");
                q.setTransactionSuccessful();
                try {
                    q.endTransaction();
                } catch (SQLiteDiskIOException e) {
                    e = e;
                    d = f267644a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                    c = 16312;
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(c)).mo56386p("fail transaction");
                }
            } catch (SQLException e2) {
                C59104x d2 = f267644a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(16313)).mo56386p("Failed to delete notification from database.");
                try {
                    q.endTransaction();
                } catch (SQLiteDiskIOException e3) {
                    e = e3;
                    d = f267644a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                    c = 16314;
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(c)).mo56386p("fail transaction");
                }
            } catch (Throwable th) {
                try {
                    q.endTransaction();
                } catch (SQLiteDiskIOException e4) {
                    C59104x d3 = f267644a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                    ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e4)).mo56372aa(16315)).mo56386p("fail transaction");
                }
                throw th;
            }
        }
    }

    /* renamed from: k */
    public final void mo89588k(C90421b bVar) {
        SQLiteDatabase q;
        C59104x d;
        char c;
        if (bVar.mo84146f() && (q = m158337q()) != null) {
            q.beginTransactionNonExclusive();
            try {
                q.delete("audio_notification", "id=?", new String[]{String.valueOf(bVar.mo84144a())});
                q.setTransactionSuccessful();
                try {
                    q.endTransaction();
                } catch (SQLiteDiskIOException e) {
                    e = e;
                    d = f267644a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                    c = 16316;
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(c)).mo56386p("fail transaction");
                }
            } catch (SQLException e2) {
                C59104x d2 = f267644a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(16317)).mo56386p("Failed to delete notification from database.");
                try {
                    q.endTransaction();
                } catch (SQLiteDiskIOException e3) {
                    e = e3;
                    d = f267644a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                    c = 16318;
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(c)).mo56386p("fail transaction");
                }
            } catch (Throwable th) {
                try {
                    q.endTransaction();
                } catch (SQLiteDiskIOException e4) {
                    C59104x d3 = f267644a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                    ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e4)).mo56372aa(16319)).mo56386p("fail transaction");
                }
                throw th;
            }
        }
    }

    /* renamed from: l */
    public final void mo89589l(C90421b bVar) {
        String str;
        ContentValues contentValues;
        SQLiteDatabase q = m158337q();
        if (q != null) {
            boolean z = false;
            if (!this.f267646c) {
                q.setForeignKeyConstraintsEnabled(false);
            }
            q.beginTransactionNonExclusive();
            try {
                ContentValues contentValues2 = new ContentValues();
                if (bVar.mo84146f()) {
                    contentValues2.put("id", Long.valueOf(bVar.mo84144a()));
                }
                contentValues2.put("app_name", bVar.f252581b);
                m158334h(contentValues2, "audio_contents", bVar.f252582c);
                m158334h(contentValues2, "category", bVar.f252584e);
                m158334h(contentValues2, "chime", bVar.f252585f);
                Integer num = bVar.f252586g;
                if (num == null) {
                    contentValues2.putNull("content_version_id");
                } else {
                    contentValues2.put("content_version_id", num);
                }
                contentValues2.put("does_alert", Boolean.valueOf(bVar.f252587h));
                m158334h(contentValues2, "group_data_key", bVar.f252588i);
                contentValues2.put("is_group_child", Boolean.valueOf(bVar.f252583d));
                contentValues2.put("is_removed", Boolean.valueOf(bVar.f252596q));
                contentValues2.put("key", bVar.f252589j);
                Intent intent = bVar.f252590k;
                if (intent == null) {
                    contentValues2.putNull("on_delivered");
                } else {
                    contentValues2.put("on_delivered", intent.toUri(0));
                }
                contentValues2.put("package_name", bVar.f252591l);
                contentValues2.put("post_time", Long.valueOf(bVar.f252592m));
                contentValues2.put("content_creation_time", Long.valueOf(bVar.f252593n));
                long replaceOrThrow = q.replaceOrThrow("audio_notification", (String) null, contentValues2);
                if (!bVar.mo84146f()) {
                    C90433n nVar = bVar.f252594o;
                    if (nVar != null) {
                        if (bVar.f252595p == null) {
                            bVar.f252595p = Long.valueOf(replaceOrThrow);
                            nVar.mo84168c(replaceOrThrow);
                        }
                    }
                    ((C59052c) ((C59052c) C90421b.f252580a.mo56226d()).mo56372aa(10937)).mo56386p("No state yet, or identifier already set.");
                    int i = C90755l.f253831a;
                }
                boolean z2 = bVar instanceof C90425f;
                if (z2) {
                    str = "event_notification";
                } else if (bVar instanceof MessageNotification) {
                    str = "message_notification";
                } else {
                    str = bVar instanceof StandardNotification ? "standard_notification" : BuildConfig.FLAVOR;
                }
                if (z2) {
                    C90425f fVar = (C90425f) bVar;
                    contentValues = new ContentValues();
                    contentValues.put("notification_id", Long.valueOf(fVar.mo84144a()));
                    contentValues.put("event_start_timestamp", Long.valueOf(fVar.f252603r));
                    Long l = fVar.f252606u;
                    if (l == null) {
                        contentValues.putNull("event_reminder_timestamp");
                    } else {
                        contentValues.put("event_reminder_timestamp", l);
                    }
                    contentValues.put("event_title", fVar.f252604s.toString());
                } else if (bVar instanceof MessageNotification) {
                    MessageNotification messageNotification = (MessageNotification) bVar;
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put("notification_id", Long.valueOf(messageNotification.mo84144a()));
                    m158334h(contentValues3, "group_name_column", messageNotification.f252541r);
                    m158334h(contentValues3, "message", messageNotification.f252543t);
                    m158334h(contentValues3, "message_type", messageNotification.f252545v);
                    m158334h(contentValues3, "data_uri", messageNotification.f252546w);
                    m158334h(contentValues3, "original_message", messageNotification.f252544u);
                    contentValues3.put("sender_name", messageNotification.f252535E.toString());
                    if (messageNotification.f252548y != null) {
                        z = true;
                    }
                    contentValues3.put("has_reply_action", Boolean.valueOf(z));
                    contentValues = contentValues3;
                } else if (bVar instanceof StandardNotification) {
                    StandardNotification standardNotification = (StandardNotification) bVar;
                    contentValues = new ContentValues();
                    contentValues.put("notification_id", Long.valueOf(standardNotification.mo84144a()));
                    contentValues.put("content_body", standardNotification.f252562s.toString());
                    m158334h(contentValues, "content_header", standardNotification.f252561r);
                } else {
                    contentValues = new ContentValues();
                }
                q.replaceOrThrow(str, (String) null, contentValues);
                q.setTransactionSuccessful();
                try {
                    q.endTransaction();
                } catch (SQLiteDiskIOException e) {
                    C59104x d = f267644a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(16324)).mo56386p("fail transaction");
                }
                if (!this.f267646c) {
                    q.setForeignKeyConstraintsEnabled(true);
                }
            } catch (SQLException e2) {
                C59104x d2 = f267644a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(16325)).mo56386p("Failed to save notification to database.");
                try {
                    q.endTransaction();
                } catch (SQLiteDiskIOException e3) {
                    C59104x d3 = f267644a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                    ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e3)).mo56372aa(16326)).mo56386p("fail transaction");
                }
                if (!this.f267646c) {
                    q.setForeignKeyConstraintsEnabled(true);
                }
            } catch (Throwable th) {
                try {
                    q.endTransaction();
                } catch (SQLiteDiskIOException e4) {
                    C59104x d4 = f267644a.mo56226d();
                    d4.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                    ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e4)).mo56372aa(16327)).mo56386p("fail transaction");
                }
                if (!this.f267646c) {
                    q.setForeignKeyConstraintsEnabled(true);
                }
                throw th;
            }
        }
    }

    /* renamed from: m */
    public final void mo89590m(C90432m mVar, C90433n nVar) {
        C59104x d;
        char c;
        Long l = nVar.f252644d;
        if (l != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("notification_id", l);
            contentValues.put("is_interruptive", Boolean.valueOf(mVar.f252639c));
            contentValues.put("timestamp", Long.valueOf(mVar.f252638b));
            contentValues.put("type", Integer.valueOf(mVar.f252637a));
            SQLiteDatabase q = m158337q();
            if (q != null) {
                q.beginTransactionNonExclusive();
                try {
                    q.insertOrThrow("playback_event", (String) null, contentValues);
                    q.setTransactionSuccessful();
                    try {
                        q.endTransaction();
                    } catch (SQLiteDiskIOException e) {
                        e = e;
                        d = f267644a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                        c = 16328;
                        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(c)).mo56386p("fail transaction");
                    }
                } catch (SQLException e2) {
                    C59104x d2 = f267644a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                    ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(16329)).mo56386p("Failed to save playback event.");
                    try {
                        q.endTransaction();
                    } catch (SQLiteDiskIOException e3) {
                        e = e3;
                        d = f267644a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                        c = 16330;
                        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(c)).mo56386p("fail transaction");
                    }
                } catch (Throwable th) {
                    try {
                        q.endTransaction();
                    } catch (SQLiteDiskIOException e4) {
                        C59104x d3 = f267644a.mo56226d();
                        d3.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                        ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e4)).mo56372aa(16331)).mo56386p("fail transaction");
                    }
                    throw th;
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo89591n(C90433n nVar) {
        Long l = nVar.f252644d;
        if (l == null) {
            C59104x d = f267644a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
            ((C59052c) ((C59052c) d).mo56372aa(16336)).mo56386p("Cannot save state without a notification ID!");
            return;
        }
        Integer num = nVar.f252643c;
        if (num != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("notification_id", l);
            contentValues.put("intended_playback_type", num);
            SQLiteDatabase q = m158337q();
            if (q != null) {
                q.beginTransactionNonExclusive();
                try {
                    q.replaceOrThrow("playback_state", (String) null, contentValues);
                    q.setTransactionSuccessful();
                    try {
                        q.endTransaction();
                    } catch (SQLiteDiskIOException e) {
                        C59104x d2 = f267644a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                        ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(16332)).mo56386p("fail transaction");
                    }
                } catch (SQLException e2) {
                    C59104x d3 = f267644a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                    ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e2)).mo56372aa(16333)).mo56386p("Failed to save playback state to database.");
                    try {
                        q.endTransaction();
                    } catch (SQLiteDiskIOException e3) {
                        C59104x d4 = f267644a.mo56226d();
                        d4.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                        ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e3)).mo56372aa(16334)).mo56386p("fail transaction");
                    }
                } catch (Throwable th) {
                    try {
                        q.endTransaction();
                    } catch (SQLiteDiskIOException e4) {
                        C59104x d5 = f267644a.mo56226d();
                        d5.mo56378ag(C58975e.f156826a, "NotificationDbHelper");
                        ((C59052c) ((C59052c) ((C59052c) d5).mo56382g(e4)).mo56372aa(16335)).mo56386p("fail transaction");
                    }
                    throw th;
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo89592o(Runnable runnable) {
        this.f267645b.execute(runnable);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS audio_notification (id INTEGER PRIMARY KEY, app_name TEXT NOT NULL, audio_contents TEXT, category TEXT, chime TEXT, content_version_id INTEGER, does_alert INTEGER NOT NULL, group_data_key TEXT, is_group_child INTEGER NOT NULL, is_removed INTEGER NOT NULL, key TEXT NOT NULL, on_delivered TEXT, package_name TEXT NOT NULL, post_time INTEGER NOT NULL, content_creation_time INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS event_notification (notification_id INTEGER PRIMARY KEY REFERENCES audio_notification(id) ON DELETE CASCADE, event_start_timestamp INTEGER NOT NULL, event_reminder_timestamp INTEGER, event_title TEXT NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS message_notification (notification_id INTEGER PRIMARY KEY REFERENCES audio_notification(id) ON DELETE CASCADE, group_name_column TEXT, message TEXT, message_type TEXT, data_uri TEXT, original_message TEXT, sender_name TEXT NOT NULL, has_reply_action INTEGER NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS standard_notification (notification_id INTEGER PRIMARY KEY REFERENCES audio_notification(id) ON DELETE CASCADE, content_body TEXT NOT NULL, content_header TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS playback_state (notification_id INTEGER PRIMARY KEY REFERENCES audio_notification(id) ON DELETE CASCADE, intended_playback_type INTEGER NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS playback_event (notification_id INTEGER NOT NULL REFERENCES audio_notification(id) ON DELETE CASCADE, is_interruptive INTEGER NOT NULL, timestamp INEGER NOT NULL, type INTEGER NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS engagement (serialized_identifier TEXT NOT NULL PRIMARY KEY, expiration_timestamp INTEGER, interruptive_notification_id INTEGER REFERENCES audio_notification(id) ON DELETE CASCADE, state INTEGER )");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 9) {
            C58976aa aaVar = C58975e.f156826a;
            sQLiteDatabase.execSQL("alter table message_notification add has_reply_action not null default 0");
        }
        if (i < 10) {
            C58976aa aaVar2 = C58975e.f156826a;
            sQLiteDatabase.execSQL("alter table message_notification add message_type");
        }
        if (i < 11) {
            sQLiteDatabase.execSQL("alter table message_notification add data_uri");
        }
    }
}

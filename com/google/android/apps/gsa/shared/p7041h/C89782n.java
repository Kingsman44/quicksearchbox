package com.google.android.apps.gsa.shared.p7041h;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.Base64;
import com.google.android.apps.gsa.shared.util.C91089t;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.libraries.gsa.util.C23341f;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.base.C58837ba;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.h.n */
/* compiled from: PG */
public final class C89782n {

    /* renamed from: a */
    private static final C59071e f243002a = C59071e.m91332i("com.google.android.apps.gsa.shared.h.n");

    /* renamed from: b */
    private static final String[] f243003b = {"event_id", "title", "eventLocation", "begin", "end", "accessLevel", "selfAttendeeStatus", "account_type", "_sync_id", "original_sync_id", "allDay", "calendar_id"};

    /* renamed from: c */
    private static final String[] f243004c = {"attendeeName"};

    /* renamed from: d */
    private static final String[] f243005d = {"_id", "account_name", "calendar_displayName", "name", "cal_sync1", "sync_events", "visible"};

    /* renamed from: e */
    private static final C58881cr f243006e = C58886cw.m90973a(C89780l.f243000a);

    /* renamed from: f */
    private static final C58881cr f243007f = C58886cw.m90973a(C89781m.f243001a);

    /* renamed from: g */
    private final Context f243008g;

    /* renamed from: h */
    private final AtomicBoolean f243009h = new AtomicBoolean();

    /* renamed from: i */
    private final C39141kp f243010i;

    public C89782n(Context context, C39226b bVar, C39141kp kpVar) {
        this.f243008g = C39239a.m68666a(context, bVar);
        this.f243010i = kpVar;
    }

    /* renamed from: a */
    public static long m146151a(int i) {
        Time time = new Time(TimeZone.getDefault().getID());
        time.setJulianDay(i);
        return time.toMillis(false) / 1000;
    }

    /* renamed from: b */
    public static C89770b m146152b(long j, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C89770b bVar = (C89770b) it.next();
            if (bVar.f242971b == j) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m146153c(C89776h hVar) {
        MessageDigest messageDigest = (MessageDigest) f243007f.mo6453a();
        messageDigest.update(TextUtils.join("|", C58485gu.m89849q(hVar.f242984d, Long.valueOf(hVar.f242985e), Long.valueOf(hVar.f242986f), hVar.f242987g)).getBytes());
        return Base64.encodeToString(messageDigest.digest(), 3);
    }

    /* renamed from: d */
    static /* synthetic */ MessageDigest m146154d() {
        try {
            return MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    private final Cursor m146155g(ContentResolver contentResolver, Uri uri, String[] strArr, String str) {
        if (!C91077d.m148794e(this.f243008g, "android.permission.READ_CALENDAR")) {
            return null;
        }
        try {
            return contentResolver.query(uri, strArr, str, (String[]) null, (String) null);
        } catch (SQLException | Exception | IllegalArgumentException | NullPointerException | SecurityException e) {
            ((C59052c) ((C59052c) f243002a.mo56226d()).mo56372aa(10515)).mo56389s("Calendar ContentProvider query failed: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    private static boolean m146156h(String str) {
        return str == null || C23341f.m43774a(str, 0, str.length()) == -1;
    }

    /* renamed from: e */
    public final Collection mo83623e() {
        Throwable th;
        Cursor cursor;
        List list;
        C90748e.m148224b();
        ContentResolver contentResolver = this.f243008g.getContentResolver();
        Collections.emptyList();
        try {
            cursor = m146155g(contentResolver, CalendarContract.Calendars.CONTENT_URI, f243005d, "(visible=1) AND (calendar_access_level=700)");
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        list = C58597ky.m90213d(cursor.getCount());
                        Pattern pattern = (Pattern) f243006e.mo6453a();
                        do {
                            String string = cursor.getString(1);
                            String string2 = cursor.getString(2);
                            if (string2 == null) {
                                string2 = cursor.getString(3);
                            }
                            String string3 = cursor.getString(4);
                            if (string3 == null || !pattern.matcher(string3).matches()) {
                                string3 = String.format("%s_%s", new Object[]{string2, string});
                            }
                            C89769a aVar = (C89769a) C89770b.f242968h.createBuilder();
                            long j = cursor.getLong(0);
                            aVar.copyOnWrite();
                            C89770b bVar = (C89770b) aVar.instance;
                            bVar.f242970a = 1 | bVar.f242970a;
                            bVar.f242971b = j;
                            String g = C58837ba.m90858g(string);
                            aVar.copyOnWrite();
                            C89770b bVar2 = (C89770b) aVar.instance;
                            bVar2.f242970a = 4 | bVar2.f242970a;
                            bVar2.f242973d = g;
                            String g2 = C58837ba.m90858g(string2);
                            aVar.copyOnWrite();
                            C89770b bVar3 = (C89770b) aVar.instance;
                            bVar3.f242970a |= 8;
                            bVar3.f242974e = g2;
                            aVar.copyOnWrite();
                            C89770b bVar4 = (C89770b) aVar.instance;
                            string3.getClass();
                            bVar4.f242970a |= 2;
                            bVar4.f242972c = string3;
                            int i = cursor.getInt(5);
                            aVar.copyOnWrite();
                            C89770b bVar5 = (C89770b) aVar.instance;
                            bVar5.f242970a |= 16;
                            bVar5.f242975f = i;
                            int i2 = cursor.getInt(6);
                            aVar.copyOnWrite();
                            C89770b bVar6 = (C89770b) aVar.instance;
                            bVar6.f242970a |= 32;
                            bVar6.f242976g = i2;
                            list.add((C89770b) aVar.build());
                        } while (cursor.moveToNext());
                        C91089t.m148813b(cursor);
                        return list;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C91089t.m148813b(cursor);
                    throw th;
                }
            }
            list = C58485gu.m89845m();
            C91089t.m148813b(cursor);
            return list;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            C91089t.m148813b(cursor);
            throw th;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:81:0x02dc=Splitter:B:81:0x02dc, B:42:0x01bf=Splitter:B:42:0x01bf} */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection mo83624f(long r22, long r24, boolean r26) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()
            android.content.Context r0 = r1.f243008g
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r5 = android.provider.CalendarContract.Instances.CONTENT_URI     // Catch:{ all -> 0x02e7 }
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ all -> 0x02e7 }
            android.content.ContentUris.appendId(r5, r2)     // Catch:{ all -> 0x02e7 }
            long r2 = r2 + r24
            android.content.ContentUris.appendId(r5, r2)     // Catch:{ all -> 0x02e7 }
            android.net.Uri r2 = r5.build()     // Catch:{ all -> 0x02e7 }
            java.lang.String[] r3 = f243003b     // Catch:{ all -> 0x02e7 }
            java.lang.String r5 = "(visible=1) AND (calendar_access_level=700) AND (selfAttendeeStatus!=2) AND ((account_type!='com.google') OR (sync_data9 IS NULL) OR ((sync_data9!='true') AND ((CAST(sync_data9 AS INTEGER)&1)=0)))"
            android.database.Cursor r2 = r1.m146155g(r0, r2, r3, r5)     // Catch:{ all -> 0x02e7 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f243009h     // Catch:{ all -> 0x02e4 }
            r3 = 0
            r5 = 1
            if (r2 != 0) goto L_0x002f
            r6 = 1
            goto L_0x0030
        L_0x002f:
            r6 = 0
        L_0x0030:
            r0.set(r6)     // Catch:{ all -> 0x02e4 }
            if (r2 == 0) goto L_0x02dc
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x02e4 }
            if (r0 != 0) goto L_0x003d
            goto L_0x02dc
        L_0x003d:
            int r0 = r2.getCount()     // Catch:{ all -> 0x02e4 }
            java.util.ArrayList r0 = com.google.common.p4522b.C58597ky.m90213d(r0)     // Catch:{ all -> 0x02e4 }
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0048:
            r9 = 3
            long r10 = r2.getLong(r9)     // Catch:{ all -> 0x02e4 }
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r12
            r14 = 16
            long r15 = r10 << r14
            long r17 = r2.getLong(r3)     // Catch:{ all -> 0x02e4 }
            long r12 = r15 ^ r17
            r15 = 5
            int r15 = r2.getInt(r15)     // Catch:{ all -> 0x02e4 }
            int r15 = com.google.android.apps.gsa.shared.p7041h.C89772d.m146146a(r15)     // Catch:{ all -> 0x02e4 }
            if (r15 != 0) goto L_0x0066
            r15 = 1
        L_0x0066:
            r4 = 6
            int r4 = r2.getInt(r4)     // Catch:{ all -> 0x02e4 }
            int r4 = com.google.android.apps.gsa.shared.p7041h.C89774f.m146147a(r4)     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r17 = com.google.android.apps.gsa.shared.p7041h.C89776h.f242979p     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bn r17 = r17.createBuilder()     // Catch:{ all -> 0x02e4 }
            r9 = r17
            com.google.android.apps.gsa.shared.h.g r9 = (com.google.android.apps.gsa.shared.p7041h.C89775g) r9     // Catch:{ all -> 0x02e4 }
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r14 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r14 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r14     // Catch:{ all -> 0x02e4 }
            int r3 = r14.f242981a     // Catch:{ all -> 0x02e4 }
            r3 = r3 | r5
            r14.f242981a = r3     // Catch:{ all -> 0x02e4 }
            r14.f242982b = r12     // Catch:{ all -> 0x02e4 }
            r3 = 0
            long r12 = r2.getLong(r3)     // Catch:{ all -> 0x02e4 }
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r3 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r3 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r3     // Catch:{ all -> 0x02e4 }
            int r14 = r3.f242981a     // Catch:{ all -> 0x02e4 }
            r5 = 2
            r14 = r14 | r5
            r3.f242981a = r14     // Catch:{ all -> 0x02e4 }
            r3.f242983c = r12     // Catch:{ all -> 0x02e4 }
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r3 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r3 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r3     // Catch:{ all -> 0x02e4 }
            int r12 = r3.f242981a     // Catch:{ all -> 0x02e4 }
            r13 = 8
            r12 = r12 | r13
            r3.f242981a = r12     // Catch:{ all -> 0x02e4 }
            r3.f242985e = r10     // Catch:{ all -> 0x02e4 }
            r3 = 4
            long r10 = r2.getLong(r3)     // Catch:{ all -> 0x02e4 }
            r19 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r19
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r12 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r12 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r12     // Catch:{ all -> 0x02e4 }
            int r14 = r12.f242981a     // Catch:{ all -> 0x02e4 }
            r19 = 16
            r14 = r14 | 16
            r12.f242981a = r14     // Catch:{ all -> 0x02e4 }
            r12.f242986f = r10     // Catch:{ all -> 0x02e4 }
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r10 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r10     // Catch:{ all -> 0x02e4 }
            int r15 = r15 + -1
            r10.f242989i = r15     // Catch:{ all -> 0x02e4 }
            int r11 = r10.f242981a     // Catch:{ all -> 0x02e4 }
            r11 = r11 | 128(0x80, float:1.794E-43)
            r10.f242981a = r11     // Catch:{ all -> 0x02e4 }
            if (r4 != 0) goto L_0x00d9
            r4 = 1
        L_0x00d9:
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r10 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r10     // Catch:{ all -> 0x02e4 }
            int r4 = r4 + -1
            r10.f242991k = r4     // Catch:{ all -> 0x02e4 }
            int r4 = r10.f242981a     // Catch:{ all -> 0x02e4 }
            r4 = r4 | 512(0x200, float:7.175E-43)
            r10.f242981a = r4     // Catch:{ all -> 0x02e4 }
            r4 = 1
            java.lang.String r10 = r2.getString(r4)     // Catch:{ all -> 0x02e4 }
            java.lang.String r4 = r2.getString(r5)     // Catch:{ all -> 0x02e4 }
            boolean r5 = m146156h(r10)     // Catch:{ all -> 0x02e4 }
            if (r5 != 0) goto L_0x010b
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r5 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r5 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r5     // Catch:{ all -> 0x02e4 }
            r10.getClass()     // Catch:{ all -> 0x02e4 }
            int r11 = r5.f242981a     // Catch:{ all -> 0x02e4 }
            r3 = r3 | r11
            r5.f242981a = r3     // Catch:{ all -> 0x02e4 }
            r5.f242984d = r10     // Catch:{ all -> 0x02e4 }
            goto L_0x0125
        L_0x010b:
            android.content.Context r5 = r1.f243008g     // Catch:{ all -> 0x02e4 }
            r10 = 2132085535(0x7f150b1f, float:1.9811272E38)
            java.lang.String r5 = r5.getString(r10)     // Catch:{ all -> 0x02e4 }
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r10 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r10     // Catch:{ all -> 0x02e4 }
            r5.getClass()     // Catch:{ all -> 0x02e4 }
            int r11 = r10.f242981a     // Catch:{ all -> 0x02e4 }
            r3 = r3 | r11
            r10.f242981a = r3     // Catch:{ all -> 0x02e4 }
            r10.f242984d = r5     // Catch:{ all -> 0x02e4 }
        L_0x0125:
            r3 = 10
            int r3 = r2.getInt(r3)     // Catch:{ all -> 0x02e4 }
            if (r3 == 0) goto L_0x0170
            r3 = 3
            long r10 = r2.getLong(r3)     // Catch:{ all -> 0x02e4 }
            r14 = 0
            int r3 = android.text.format.Time.getJulianDay(r10, r14)     // Catch:{ all -> 0x02e4 }
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r5 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r5 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r5     // Catch:{ all -> 0x02e4 }
            int r10 = r5.f242981a     // Catch:{ all -> 0x02e4 }
            r10 = r10 | 8192(0x2000, float:1.14794E-41)
            r5.f242981a = r10     // Catch:{ all -> 0x02e4 }
            r10 = 1
            r5.f242994n = r10     // Catch:{ all -> 0x02e4 }
            long r10 = m146151a(r3)     // Catch:{ all -> 0x02e4 }
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r5 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r5 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r5     // Catch:{ all -> 0x02e4 }
            int r12 = r5.f242981a     // Catch:{ all -> 0x02e4 }
            r12 = r12 | r13
            r5.f242981a = r12     // Catch:{ all -> 0x02e4 }
            r5.f242985e = r10     // Catch:{ all -> 0x02e4 }
            int r3 = r3 + 1
            long r10 = m146151a(r3)     // Catch:{ all -> 0x02e4 }
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r3 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r3 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r3     // Catch:{ all -> 0x02e4 }
            int r5 = r3.f242981a     // Catch:{ all -> 0x02e4 }
            r12 = 16
            r5 = r5 | r12
            r3.f242981a = r5     // Catch:{ all -> 0x02e4 }
            r3.f242986f = r10     // Catch:{ all -> 0x02e4 }
        L_0x0170:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x02e4 }
            r3.<init>()     // Catch:{ all -> 0x02e4 }
            if (r26 != 0) goto L_0x01dd
            com.google.protobuf.bv r3 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r3 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r3     // Catch:{ all -> 0x02e4 }
            long r10 = r3.f242983c     // Catch:{ all -> 0x02e4 }
            android.content.Context r3 = r1.f243008g     // Catch:{ all -> 0x02e4 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x02e4 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x02e4 }
            r5.<init>()     // Catch:{ all -> 0x02e4 }
            android.net.Uri r12 = android.provider.CalendarContract.Attendees.CONTENT_URI     // Catch:{ all -> 0x01d7 }
            java.lang.String[] r14 = f243004c     // Catch:{ all -> 0x01d7 }
            java.util.Locale r15 = java.util.Locale.US     // Catch:{ all -> 0x01d7 }
            r23 = r0
            r13 = 1
            java.lang.Object[] r0 = new java.lang.Object[r13]     // Catch:{ all -> 0x01d7 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x01d7 }
            r11 = 0
            r0[r11] = r10     // Catch:{ all -> 0x01d7 }
            java.lang.String r10 = "(event_id=%d)"
            java.lang.String r0 = java.lang.String.format(r15, r10, r0)     // Catch:{ all -> 0x01d7 }
            android.database.Cursor r3 = r1.m146155g(r3, r12, r14, r0)     // Catch:{ all -> 0x01d7 }
            if (r3 == 0) goto L_0x01be
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x01be
            r0 = 0
        L_0x01ad:
            java.lang.String r10 = r3.getString(r0)     // Catch:{ all -> 0x01bb }
            r5.add(r10)     // Catch:{ all -> 0x01bb }
            boolean r10 = r3.moveToNext()     // Catch:{ all -> 0x01bb }
            if (r10 != 0) goto L_0x01ad
            goto L_0x01bf
        L_0x01bb:
            r0 = move-exception
            r4 = r3
            goto L_0x01d9
        L_0x01be:
            r0 = 0
        L_0x01bf:
            com.google.android.apps.gsa.shared.util.C91089t.m148813b(r3)     // Catch:{ all -> 0x02e4 }
            int r3 = r5.size()     // Catch:{ all -> 0x02e4 }
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r10 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r10     // Catch:{ all -> 0x02e4 }
            int r11 = r10.f242981a     // Catch:{ all -> 0x02e4 }
            r11 = r11 | 256(0x100, float:3.59E-43)
            r10.f242981a = r11     // Catch:{ all -> 0x02e4 }
            r10.f242990j = r3     // Catch:{ all -> 0x02e4 }
            r3 = r5
            goto L_0x01e0
        L_0x01d7:
            r0 = move-exception
            r4 = 0
        L_0x01d9:
            com.google.android.apps.gsa.shared.util.C91089t.m148813b(r4)     // Catch:{ all -> 0x02e4 }
            throw r0     // Catch:{ all -> 0x02e4 }
        L_0x01dd:
            r23 = r0
            r0 = 0
        L_0x01e0:
            boolean r5 = m146156h(r4)     // Catch:{ all -> 0x02e4 }
            if (r5 != 0) goto L_0x021a
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r5 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r5 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r5     // Catch:{ all -> 0x02e4 }
            r4.getClass()     // Catch:{ all -> 0x02e4 }
            int r10 = r5.f242981a     // Catch:{ all -> 0x02e4 }
            r10 = r10 | 32
            r5.f242981a = r10     // Catch:{ all -> 0x02e4 }
            r5.f242987g = r4     // Catch:{ all -> 0x02e4 }
            if (r26 != 0) goto L_0x021a
            java.lang.String r5 = "\\s*,\\s*"
            java.lang.String[] r4 = r4.split(r5)     // Catch:{ all -> 0x02e4 }
            java.util.ArrayList r4 = com.google.common.p4522b.C58597ky.m90212c(r4)     // Catch:{ all -> 0x02e4 }
            r4.retainAll(r3)     // Catch:{ all -> 0x02e4 }
            boolean r3 = r4.isEmpty()     // Catch:{ all -> 0x02e4 }
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r4 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r4 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r4     // Catch:{ all -> 0x02e4 }
            int r5 = r4.f242981a     // Catch:{ all -> 0x02e4 }
            r5 = r5 | 64
            r4.f242981a = r5     // Catch:{ all -> 0x02e4 }
            r4.f242988h = r3     // Catch:{ all -> 0x02e4 }
        L_0x021a:
            r3 = 7
            java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x02e4 }
            java.lang.String r4 = "com.google"
            boolean r4 = r4.equals(r3)     // Catch:{ all -> 0x02e4 }
            java.lang.String r5 = "GOOGLE"
            java.lang.String r10 = "OUTLOOK"
            java.lang.String r11 = "OTHER"
            if (r4 == 0) goto L_0x0289
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r3 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r3 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r3     // Catch:{ all -> 0x02e4 }
            int r4 = r3.f242981a     // Catch:{ all -> 0x02e4 }
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            r3.f242981a = r4     // Catch:{ all -> 0x02e4 }
            r4 = 1
            r3.f242995o = r4     // Catch:{ all -> 0x02e4 }
            r3 = 8
            java.lang.String r12 = r2.getString(r3)     // Catch:{ all -> 0x02e4 }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x02e4 }
            if (r12 != 0) goto L_0x024e
            java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x02e4 }
            goto L_0x0254
        L_0x024e:
            r3 = 9
            java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x02e4 }
        L_0x0254:
            boolean r12 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x02e4 }
            if (r12 != 0) goto L_0x026c
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r12 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r12 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r12     // Catch:{ all -> 0x02e4 }
            r3.getClass()     // Catch:{ all -> 0x02e4 }
            int r13 = r12.f242981a     // Catch:{ all -> 0x02e4 }
            r13 = r13 | 2048(0x800, float:2.87E-42)
            r12.f242981a = r13     // Catch:{ all -> 0x02e4 }
            r12.f242993m = r3     // Catch:{ all -> 0x02e4 }
        L_0x026c:
            r3 = 11
            long r12 = r2.getLong(r3)     // Catch:{ all -> 0x02e4 }
            r9.copyOnWrite()     // Catch:{ all -> 0x02e4 }
            com.google.protobuf.bv r3 = r9.instance     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.h.h r3 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r3     // Catch:{ all -> 0x02e4 }
            int r14 = r3.f242981a     // Catch:{ all -> 0x02e4 }
            r14 = r14 | 1024(0x400, float:1.435E-42)
            r3.f242981a = r14     // Catch:{ all -> 0x02e4 }
            r3.f242992l = r12     // Catch:{ all -> 0x02e4 }
            com.google.android.libraries.search.logging.d.kp r3 = r1.f243010i     // Catch:{ all -> 0x02e4 }
            r3.mo41669C(r5)     // Catch:{ all -> 0x02e4 }
            int r7 = r7 + 1
            goto L_0x02a1
        L_0x0289:
            r4 = 1
            java.lang.String r12 = "com.microsoft.office.outlook.USER_ACCOUNT"
            boolean r3 = r12.equals(r3)     // Catch:{ all -> 0x02e4 }
            if (r3 == 0) goto L_0x029a
            com.google.android.libraries.search.logging.d.kp r3 = r1.f243010i     // Catch:{ all -> 0x02e4 }
            r3.mo41669C(r10)     // Catch:{ all -> 0x02e4 }
            int r6 = r6 + 1
            goto L_0x02a1
        L_0x029a:
            com.google.android.libraries.search.logging.d.kp r3 = r1.f243010i     // Catch:{ all -> 0x02e4 }
            r3.mo41669C(r11)     // Catch:{ all -> 0x02e4 }
            int r8 = r8 + 1
        L_0x02a1:
            r3 = r23
            r3.add(r9)     // Catch:{ all -> 0x02e4 }
            boolean r9 = r2.moveToNext()     // Catch:{ all -> 0x02e4 }
            if (r9 != 0) goto L_0x02d7
            if (r7 <= 0) goto L_0x02b3
            com.google.android.libraries.search.logging.d.kp r0 = r1.f243010i     // Catch:{ all -> 0x02e4 }
            r0.mo41668B(r5)     // Catch:{ all -> 0x02e4 }
        L_0x02b3:
            if (r6 <= 0) goto L_0x02ba
            com.google.android.libraries.search.logging.d.kp r0 = r1.f243010i     // Catch:{ all -> 0x02e4 }
            r0.mo41668B(r10)     // Catch:{ all -> 0x02e4 }
        L_0x02ba:
            if (r8 <= 0) goto L_0x02c1
            com.google.android.libraries.search.logging.d.kp r0 = r1.f243010i     // Catch:{ all -> 0x02e4 }
            r0.mo41668B(r11)     // Catch:{ all -> 0x02e4 }
        L_0x02c1:
            com.google.android.apps.gsa.shared.util.C91089t.m148813b(r2)
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.apps.gsa.shared.h.k r2 = com.google.android.apps.gsa.shared.p7041h.C89779k.f242999a
            j$.util.stream.Stream r0 = r0.map(r2)
            j$.util.stream.Collector r2 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r0 = r0.collect(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
        L_0x02d7:
            r0 = r3
            r3 = 0
            r5 = 1
            goto L_0x0048
        L_0x02dc:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x02e4 }
            com.google.android.apps.gsa.shared.util.C91089t.m148813b(r2)
            return r0
        L_0x02e4:
            r0 = move-exception
            r4 = r2
            goto L_0x02e9
        L_0x02e7:
            r0 = move-exception
            r4 = 0
        L_0x02e9:
            com.google.android.apps.gsa.shared.util.C91089t.m148813b(r4)
            goto L_0x02ee
        L_0x02ed:
            throw r0
        L_0x02ee:
            goto L_0x02ed
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7041h.C89782n.mo83624f(long, long, boolean):java.util.Collection");
    }
}

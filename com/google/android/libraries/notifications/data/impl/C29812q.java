package com.google.android.libraries.notifications.data.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.libraries.notifications.p2292g.C30001i;
import com.google.android.libraries.notifications.p2292g.C30002j;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.p11027an.p11028a.C147765a;
import com.google.android.libraries.p11027an.p11028a.C147766b;
import com.google.android.libraries.p11027an.p11028a.C147767c;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.data.impl.q */
/* compiled from: PG */
public final class C29812q {
    /* renamed from: a */
    public static int m55066a(Cursor cursor, String str) {
        try {
            return cursor.getColumnIndexOrThrow(str);
        } catch (IllegalArgumentException e) {
            throw new C29811p(str, e);
        }
    }

    /* renamed from: b */
    public static void m55067b(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        C147767c cVar = new C147767c();
        cVar.f398712a.append("ALTER TABLE ");
        cVar.f398712a.append(str);
        cVar.f398712a.append(" ADD COLUMN ");
        cVar.f398712a.append(str2);
        cVar.f398712a.append(" ");
        cVar.f398712a.append(str3);
        C147766b a = cVar.mo124445a();
        sQLiteDatabase.execSQL(((C147765a) a).f398710a, a.mo124444c());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m55068c(android.database.sqlite.SQLiteDatabase r8, java.lang.String r9, java.lang.String... r10) {
        /*
            r2 = 0
            java.lang.String r3 = "0"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            android.database.Cursor r8 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x002c }
            int r9 = r10.length     // Catch:{ all -> 0x002a }
            r0 = 0
            r1 = 0
        L_0x0010:
            if (r1 >= r9) goto L_0x0023
            r2 = r10[r1]     // Catch:{ all -> 0x002a }
            int r2 = r8.getColumnIndex(r2)     // Catch:{ all -> 0x002a }
            if (r2 >= 0) goto L_0x0020
            if (r8 == 0) goto L_0x001f
            r8.close()
        L_0x001f:
            return r0
        L_0x0020:
            int r1 = r1 + 1
            goto L_0x0010
        L_0x0023:
            if (r8 == 0) goto L_0x0028
            r8.close()
        L_0x0028:
            r8 = 1
            return r8
        L_0x002a:
            r9 = move-exception
            goto L_0x002f
        L_0x002c:
            r8 = move-exception
            r9 = r8
            r8 = 0
        L_0x002f:
            if (r8 == 0) goto L_0x0034
            r8.close()
        L_0x0034:
            goto L_0x0036
        L_0x0035:
            throw r9
        L_0x0036:
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.data.impl.C29812q.m55068c(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[]):boolean");
    }

    /* renamed from: d */
    public static boolean m55069d(C147766b bVar) {
        return bVar == null || ((C147765a) bVar).f398710a.isEmpty();
    }

    /* renamed from: e */
    public static C58485gu m55070e(C147766b bVar, String str, String[] strArr) {
        int length = strArr.length;
        if (length <= 900) {
            C147767c cVar = new C147767c();
            if (!m55069d(bVar)) {
                cVar.mo124446b(((C147765a) bVar).f398710a, (Object[]) bVar.mo124444c());
                cVar.f398712a.append(" AND ");
            }
            cVar.mo124446b(m55073h(str, length), (Object[]) strArr);
            return C58485gu.m89846n(cVar.mo124445a());
        }
        C58480gp e = C58485gu.m89837e();
        int i = 0;
        while (true) {
            int length2 = strArr.length;
            if (i >= length2) {
                return e.mo55394f();
            }
            int i2 = i + 900;
            String[] strArr2 = (String[]) Arrays.copyOfRange(strArr, i, Math.min(i2, length2));
            C147767c cVar2 = new C147767c();
            if (!m55069d(bVar)) {
                cVar2.mo124446b(((C147765a) bVar).f398710a, (Object[]) bVar.mo124444c());
                cVar2.f398712a.append(" AND ");
            }
            cVar2.mo124446b(m55073h(str, strArr2.length), (Object[]) strArr2);
            e.mo55395g(cVar2.mo124445a());
            i = i2;
        }
    }

    /* renamed from: f */
    public static MessageLite m55071f(Cursor cursor, MessageLite messageLite, String str) {
        try {
            byte[] blob = cursor.getBlob(m55066a(cursor, str));
            if (blob != null) {
                return messageLite.toBuilder().mergeFrom(blob).build();
            }
            return null;
        } catch (C62974ct e) {
            C30058b.m55792d("ChimeThreadStorageHelper", e, "Error parsing column %s for notification %s", str, cursor.getString(m55066a(cursor, "thread_id")));
            return null;
        }
    }

    /* renamed from: g */
    public static List m55072g(Cursor cursor, MessageLite messageLite, String str) {
        C30002j jVar;
        ArrayList arrayList = new ArrayList();
        try {
            byte[] blob = cursor.getBlob(m55066a(cursor, str));
            if (!(blob == null || (jVar = (C30002j) ((C30001i) ((C30001i) C30002j.f81213b.createBuilder()).mergeFrom(blob)).build()) == null)) {
                for (C63070h hVar : jVar.f81215a) {
                    arrayList.add(messageLite.toBuilder().mergeFrom(hVar.f170218b).build());
                }
            }
        } catch (C62974ct e) {
            C30058b.m55792d("ChimeThreadStorageHelper", e, "Error parsing column %s for notification %s", str, cursor.getString(m55066a(cursor, "thread_id")));
        }
        return arrayList;
    }

    /* renamed from: h */
    private static String m55073h(String str, int i) {
        if (i <= 0 || TextUtils.isEmpty(str)) {
            C30058b.m55792d("QueryHelper", new Exception(), "Error creating IN clause for number: [%d], column [%s]", Integer.valueOf(i), str);
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" IN (");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append("?,");
        }
        sb.append("?)");
        return sb.toString();
    }
}

package com.google.android.libraries.geller.portable.database;

import android.database.DatabaseUtils;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4985f.p5030q.p5032b.C65059f;
import com.google.protos.p4985f.p5030q.p5032b.C65070q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.geller.portable.database.k */
/* compiled from: PG */
final class C21963k {

    /* renamed from: a */
    private static final C59071e f60586a = C59071e.m91332i("com.google.android.libraries.geller.portable.database.k");

    /* renamed from: a */
    static String m41182a(String str, String str2, Iterable iterable) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        Iterator it = iterable.iterator();
        boolean z = true;
        while (true) {
            str3 = "(";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (true != z) {
                str3 = ", ";
            }
            sb.append(str3);
            if (next instanceof Number) {
                sb.append(next);
            } else {
                DatabaseUtils.appendEscapedSQLString(sb, String.valueOf(next));
            }
            z = false;
        }
        if (z) {
            sb.append(str3);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006b */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List m41183b(android.database.sqlite.SQLiteDatabase r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String[] r18, com.google.common.base.C58833ax r19, com.google.common.base.C58833ax r20) {
        /*
            r0 = r16
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ IllegalArgumentException -> 0x006c }
            r13 = 0
            r6[r13] = r0     // Catch:{ IllegalArgumentException -> 0x006c }
            java.lang.Object r3 = r19.mo56111f()     // Catch:{ IllegalArgumentException -> 0x006c }
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IllegalArgumentException -> 0x006c }
            boolean r3 = r20.mo56113h()     // Catch:{ IllegalArgumentException -> 0x006c }
            if (r3 == 0) goto L_0x0025
            java.lang.Object r3 = r20.mo56107c()     // Catch:{ IllegalArgumentException -> 0x006c }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IllegalArgumentException -> 0x006c }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x006c }
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            r12 = r3
            r4 = 1
            r9 = 0
            r10 = 0
            r3 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IllegalArgumentException -> 0x006c }
        L_0x0034:
            boolean r4 = r3.moveToNext()     // Catch:{ all -> 0x004c }
            if (r4 == 0) goto L_0x0046
            int r4 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ all -> 0x004c }
            r1.add(r4)     // Catch:{ all -> 0x004c }
            goto L_0x0034
        L_0x0046:
            if (r3 == 0) goto L_0x007b
            r3.close()     // Catch:{ IllegalArgumentException -> 0x006c }
            goto L_0x007b
        L_0x004c:
            r0 = move-exception
            r4 = r0
            if (r3 == 0) goto L_0x006b
            r3.close()     // Catch:{ all -> 0x0054 }
            goto L_0x006b
        L_0x0054:
            r0 = move-exception
            r3 = r0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x006b }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r0[r13] = r5     // Catch:{ Exception -> 0x006b }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r6, r0)     // Catch:{ Exception -> 0x006b }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x006b }
            r2[r13] = r3     // Catch:{ Exception -> 0x006b }
            r0.invoke(r4, r2)     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            throw r4     // Catch:{ IllegalArgumentException -> 0x006c }
        L_0x006c:
            r0 = move-exception
            com.google.common.f.e r2 = f60586a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Column doesn't exist"
            r4 = 48123(0xbbfb, float:6.7435E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.portable.database.C21963k.m41183b(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[], com.google.common.base.ax, com.google.common.base.ax):java.util.List");
    }

    /* renamed from: c */
    static String m41184c(C65070q qVar) {
        int size = qVar.f176206a.size();
        String str = BuildConfig.FLAVOR;
        if (size != 0) {
            str = str.concat(m41182a("timestamp_micro", "IN", qVar.f176206a));
        }
        if (qVar.f176207b.size() == 0) {
            return str;
        }
        if (!str.isEmpty()) {
            str = str.concat(" AND ");
        }
        return str.concat(m41182a("key", "IN", qVar.f176207b));
    }

    /* renamed from: d */
    static String m41185d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C65059f fVar = (C65059f) it.next();
            if (!fVar.f176184c.isEmpty() || fVar.f176183b != 0) {
                ArrayList arrayList2 = new ArrayList();
                if ((fVar.f176182a & 1) != 0) {
                    long j = fVar.f176183b;
                    if (j >= 0) {
                        arrayList2.add(m41182a("timestamp_micro", "=", C58485gu.m89846n(Long.valueOf(j))));
                    }
                }
                if (!fVar.f176184c.isEmpty()) {
                    arrayList2.add(m41182a("key", "=", C58485gu.m89846n(fVar.f176184c)));
                }
                arrayList.add(String.format("(%s)", new Object[]{new C58827ar(" AND ").mo56097d(arrayList2)}));
            }
        }
        return String.format("(%s)", new Object[]{new C58827ar(" OR ").mo56097d(arrayList)});
    }

    /* renamed from: e */
    static List m41186e(List list) {
        ArrayList arrayList = new ArrayList();
        for (List d : C58597ky.m90215f(list, 100)) {
            arrayList.add(m41185d(d));
        }
        return arrayList;
    }

    /* renamed from: f */
    static String m41187f(List list, List list2) {
        boolean isEmpty = list.isEmpty();
        String str = BuildConfig.FLAVOR;
        if (!isEmpty) {
            str = str.concat(m41182a("timestamp_micro", "IN", list));
        }
        if (list2.isEmpty()) {
            return str;
        }
        if (!str.isEmpty()) {
            str = str.concat(" AND ");
        }
        return str.concat(m41182a("key", "IN", list2));
    }
}

package com.google.android.apps.search.googleapp.discover.p10244v;

import android.content.ContentValues;
import com.google.android.apps.search.googleapp.discover.p10214s.C134556au;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import com.google.android.libraries.storage.p3315b.C42842ba;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.y */
/* compiled from: PG */
public final class C135205y {

    /* renamed from: a */
    public final C42847bf f368296a;

    /* renamed from: b */
    final /* synthetic */ C135130ab f368297b;

    public C135205y(C135130ab abVar, C42847bf bfVar) {
        this.f368297b = abVar;
        this.f368296a = bfVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007a, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007f, code lost:
        throw r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58495hd mo112163a(com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f r6, java.util.Set r7) {
        /*
            r5 = this;
            java.lang.String r0 = "keys"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r0)
            com.google.android.libraries.storage.b.az r0 = new com.google.android.libraries.storage.b.az
            r0.<init>()
            java.lang.StringBuilder r1 = r0.f112130a
            java.lang.String r2 = "\n              SELECT name, value\n              FROM feed_content_table\n              WHERE\n                feed_id = ?\n                AND name IN ("
            r1.append(r2)
            java.lang.String r6 = r6.f366925c
            java.util.ArrayList r1 = r0.f112131b
            r1.add(r6)
            java.util.Iterator r6 = r7.iterator()
            r7 = 1
            r1 = 1
        L_0x001e:
            boolean r2 = r6.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.ArrayList r4 = r0.f112131b
            r4.add(r2)
            if (r1 != 0) goto L_0x0039
            java.lang.StringBuilder r1 = r0.f112130a
            java.lang.String r2 = ", "
            r1.append(r2)
        L_0x0039:
            java.lang.StringBuilder r1 = r0.f112130a
            java.lang.String r2 = "?"
            r1.append(r2)
            r1 = 0
            goto L_0x001e
        L_0x0042:
            java.lang.StringBuilder r6 = r0.f112130a
            java.lang.String r1 = ")"
            r6.append(r1)
            com.google.common.b.gz r6 = new com.google.common.b.gz
            r1 = 4
            r6.<init>(r1)
            com.google.android.libraries.storage.b.bf r1 = r5.f368296a
            com.google.android.libraries.storage.b.ay r0 = r0.mo45920a()
            android.database.Cursor r0 = r1.mo45932d(r0)
        L_0x0059:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x006f
            java.lang.String r1 = r0.getString(r3)     // Catch:{ all -> 0x0078 }
            byte[] r2 = r0.getBlob(r7)     // Catch:{ all -> 0x0078 }
            com.google.protobuf.z r2 = com.google.protobuf.C63088z.m96139A(r2)     // Catch:{ all -> 0x0078 }
            r6.mo55429h(r1, r2)     // Catch:{ all -> 0x0078 }
            goto L_0x0059
        L_0x006f:
            r7 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r7)
            com.google.common.b.hd r6 = r6.mo55427f(r3)
            return r6
        L_0x0078:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x007a }
        L_0x007a:
            r7 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r6)
            goto L_0x0080
        L_0x007f:
            throw r7
        L_0x0080:
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10244v.C135205y.mo112163a(com.google.android.apps.search.googleapp.discover.streamui.h.f, java.util.Set):com.google.common.b.hd");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0060, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo112164b(com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f r6) {
        /*
            r5 = this;
            com.google.android.libraries.storage.b.az r0 = new com.google.android.libraries.storage.b.az
            r0.<init>()
            java.lang.StringBuilder r1 = r0.f112130a
            java.lang.String r2 = "\n              SELECT session_state\n              FROM feed_table\n              WHERE feed_id = ?;\n            "
            r1.append(r2)
            java.lang.String r1 = r6.f366925c
            java.util.ArrayList r2 = r0.f112131b
            r2.add(r1)
            com.google.android.libraries.storage.b.ay r0 = r0.mo45920a()
            com.google.android.libraries.storage.b.bf r1 = r5.f368296a
            android.database.Cursor r0 = r1.mo45932d(r0)
            int r1 = r0.getCount()     // Catch:{ all -> 0x005e }
            r2 = 1
            if (r1 == r2) goto L_0x0048
            com.google.common.f.e r1 = com.google.android.apps.search.googleapp.discover.p10244v.C135130ab.f368049a     // Catch:{ all -> 0x005e }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x005e }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x005e }
            java.lang.String r2 = "Didn't find the session %s"
            java.lang.String r6 = r6.f366925c     // Catch:{ all -> 0x005e }
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x005e }
            r4 = 40412(0x9ddc, float:5.6629E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x005e }
            r1.mo56379ah(r3)     // Catch:{ all -> 0x005e }
            r1.mo56389s(r2, r6)     // Catch:{ all -> 0x005e }
            j$.util.Optional r6 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "{\n          logger.atWar…ptional.empty()\n        }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)     // Catch:{ all -> 0x005e }
            goto L_0x0059
        L_0x0048:
            r0.moveToNext()     // Catch:{ all -> 0x005e }
            r6 = 0
            byte[] r6 = r0.getBlob(r6)     // Catch:{ all -> 0x005e }
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r6)     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "{\n          cursor.moveT…sor.getBlob(0))\n        }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)     // Catch:{ all -> 0x005e }
        L_0x0059:
            r1 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            return r6
        L_0x005e:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10244v.C135205y.mo112164b(com.google.android.apps.search.googleapp.discover.streamui.h.f):j$.util.Optional");
    }

    /* renamed from: c */
    public final void mo112165c(C134755f fVar, C134556au auVar) {
        C69664n.m101061g(auVar, "sessionState");
        if (mo112164b(fVar).isPresent()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("session_state", auVar.toByteArray());
            ArrayList arrayList = new ArrayList();
            new ContentValues();
            ContentValues contentValues2 = new ContentValues(contentValues);
            arrayList.add(fVar.f366925c);
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            C42847bf bfVar = this.f368296a;
            C42847bf.m75694g();
            C47558bi s = C47831fm.m85024s("UPDATE WHERE ".concat("feed_id=?"));
            try {
                bfVar.f112138b.update("feed_table", contentValues2, "feed_id=?", strArr);
                s.close();
                return;
            } catch (Throwable th) {
                C42842ba.m75685a(th, th);
            }
        } else {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("feed_id", fVar.f366925c);
            contentValues3.put("session_state", auVar.toByteArray());
            this.f368296a.mo45931c("feed_table", contentValues3, 5);
            return;
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo112166d(C134755f fVar, Map map) {
        C69664n.m101061g(map, "contents");
        for (Map.Entry entry : map.entrySet()) {
            byte[] N = ((C63088z) entry.getValue()).mo59174N();
            C69664n.m101060f(N, "value.toByteArray()");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feed_id", fVar.f366925c);
            contentValues.put("name", (String) entry.getKey());
            contentValues.put("value", N);
            this.f368296a.mo45931c("feed_content_table", contentValues, 5);
        }
    }
}

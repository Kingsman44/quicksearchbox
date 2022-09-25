package com.google.android.apps.gsa.search.core.p6805i;

import android.content.Context;
import android.net.Uri;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.search.core.i.a */
/* compiled from: PG */
public final class C86093a {

    /* renamed from: a */
    static final Uri f232693a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    static final String[] f232694b = {"android_id"};

    /* renamed from: c */
    private static final C59071e f232695c = C59071e.m91332i("com.google.android.apps.gsa.search.core.i.a");

    /* renamed from: d */
    private static final Object f232696d = new Object();

    /* renamed from: e */
    private static String f232697e;

    /* renamed from: f */
    private static final HashMap f232698f = new HashMap();

    /* renamed from: g */
    private static boolean f232699g;

    /* renamed from: h */
    private final Context f232700h;

    public C86093a(Context context) {
        this.f232700h = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r1 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r1 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ba, code lost:
        return r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072 A[Catch:{ SecurityException -> 0x0032 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo79721a(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.Object r0 = f232696d
            monitor-enter(r0)
            boolean r1 = f232699g     // Catch:{ all -> 0x00bb }
            r2 = 0
            if (r1 != 0) goto L_0x0076
            android.content.Context r1 = r10.f232700h     // Catch:{ all -> 0x00bb }
            r3 = 1
            android.content.ContentResolver r4 = r1.getContentResolver()     // Catch:{ SecurityException -> 0x003d, all -> 0x003b }
            android.net.Uri r5 = f232693a     // Catch:{ SecurityException -> 0x003d, all -> 0x003b }
            r6 = 0
            r7 = 0
            java.lang.String[] r8 = f232694b     // Catch:{ SecurityException -> 0x003d, all -> 0x003b }
            r9 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ SecurityException -> 0x003d, all -> 0x003b }
            if (r1 == 0) goto L_0x0034
            boolean r4 = r1.moveToFirst()     // Catch:{ SecurityException -> 0x0032 }
            if (r4 == 0) goto L_0x0034
            int r4 = r1.getColumnCount()     // Catch:{ SecurityException -> 0x0032 }
            r5 = 2
            if (r4 >= r5) goto L_0x002a
            goto L_0x0034
        L_0x002a:
            java.lang.String r4 = r1.getString(r3)     // Catch:{ SecurityException -> 0x0032 }
            r1.close()     // Catch:{ all -> 0x00bb }
            goto L_0x0065
        L_0x0032:
            r4 = move-exception
            goto L_0x0040
        L_0x0034:
            if (r1 == 0) goto L_0x0039
        L_0x0036:
            r1.close()     // Catch:{ all -> 0x00bb }
        L_0x0039:
            r4 = r2
            goto L_0x0065
        L_0x003b:
            r11 = move-exception
            goto L_0x0070
        L_0x003d:
            r1 = move-exception
            r4 = r1
            r1 = r2
        L_0x0040:
            com.google.common.f.e r5 = f232695c     // Catch:{ all -> 0x006e }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x006e }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x006e }
            java.lang.String r7 = "CidGenerator"
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x006e }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x006e }
            com.google.common.f.x r4 = r5.mo56382g(r4)     // Catch:{ all -> 0x006e }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x006e }
            r5 = 7589(0x1da5, float:1.0634E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x006e }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x006e }
            java.lang.String r5 = "Unable to get android ID"
            r4.mo56386p(r5)     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x0039
            goto L_0x0036
        L_0x0065:
            java.lang.String r1 = com.google.android.libraries.p1704e.C20675a.m38859b(r4)     // Catch:{ all -> 0x00bb }
            f232697e = r1     // Catch:{ all -> 0x00bb }
            f232699g = r3     // Catch:{ all -> 0x00bb }
            goto L_0x0076
        L_0x006e:
            r11 = move-exception
            r2 = r1
        L_0x0070:
            if (r2 == 0) goto L_0x0075
            r2.close()     // Catch:{ all -> 0x00bb }
        L_0x0075:
            throw r11     // Catch:{ all -> 0x00bb }
        L_0x0076:
            java.lang.String r1 = f232697e     // Catch:{ all -> 0x00bb }
            if (r1 != 0) goto L_0x007c
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return r2
        L_0x007c:
            java.util.HashMap r1 = f232698f     // Catch:{ all -> 0x00bb }
            java.lang.Object r1 = r1.get(r11)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00bb }
            if (r1 != 0) goto L_0x00b9
            java.lang.String r2 = f232697e     // Catch:{ Exception -> 0x008d }
            java.lang.String r1 = com.google.android.libraries.p1704e.C20675a.m38858a(r11, r2)     // Catch:{ Exception -> 0x008d }
            goto L_0x00b4
        L_0x008d:
            r2 = move-exception
            com.google.common.f.e r3 = f232695c     // Catch:{ all -> 0x00bb }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x00bb }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = "CidGenerator"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x00bb }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00bb }
            com.google.common.f.x r3 = r3.mo56382g(r2)     // Catch:{ all -> 0x00bb }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00bb }
            r4 = 7588(0x1da4, float:1.0633E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x00bb }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = "%s"
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x00bb }
            r3.mo56389s(r4, r2)     // Catch:{ all -> 0x00bb }
        L_0x00b4:
            java.util.HashMap r2 = f232698f     // Catch:{ all -> 0x00bb }
            r2.put(r11, r1)     // Catch:{ all -> 0x00bb }
        L_0x00b9:
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return r1
        L_0x00bb:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            goto L_0x00bf
        L_0x00be:
            throw r11
        L_0x00bf:
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6805i.C86093a.mo79721a(java.lang.String):java.lang.String");
    }
}

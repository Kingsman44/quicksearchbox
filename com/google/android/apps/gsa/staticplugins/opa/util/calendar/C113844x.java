package com.google.android.apps.gsa.staticplugins.opa.util.calendar;

import android.content.Context;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.calendar.x */
/* compiled from: PG */
public final class C113844x implements C113843w {

    /* renamed from: a */
    static final String[] f315249a = {"_id", "dtstart", "dtend", "duration"};

    /* renamed from: b */
    private final Context f315250b;

    public C113844x(Context context) {
        this.f315250b = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:28|29) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:110|111|(2:113|114)|119|120) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0 = com.google.common.base.C58836b.f156633a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r4 = com.google.common.base.C58836b.f156633a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x0261 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01e6 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0119 A[Catch:{ a -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b4 A[Catch:{ a -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c9 A[Catch:{ a -> 0x01e6 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:119:0x0261=Splitter:B:119:0x0261, B:102:0x0227=Splitter:B:102:0x0227} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo100692a(com.google.android.apps.gsa.staticplugins.opa.util.calendar.OpenCalendarEventIntentData r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = r0.f315217b     // Catch:{ Exception -> 0x026e }
            java.lang.String r0 = r0.f315218c     // Catch:{ Exception -> 0x026e }
            if (r1 == 0) goto L_0x0262
            if (r0 == 0) goto L_0x0262
            java.lang.String r2 = "%s LIKE \"%%%s%%\" AND %s = \"%s\""
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x026e }
            java.lang.String r4 = "_sync_id"
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x026e }
            r4 = 95
            int r6 = r1.indexOf(r4)     // Catch:{ Exception -> 0x026e }
            if (r6 < 0) goto L_0x0021
            java.lang.String r6 = r1.substring(r5, r6)     // Catch:{ Exception -> 0x026e }
            goto L_0x0022
        L_0x0021:
            r6 = r1
        L_0x0022:
            r7 = 1
            r3[r7] = r6     // Catch:{ Exception -> 0x026e }
            java.lang.String r6 = "ownerAccount"
            r8 = 2
            r3[r8] = r6     // Catch:{ Exception -> 0x026e }
            r6 = 3
            r3[r6] = r0     // Catch:{ Exception -> 0x026e }
            java.lang.String r12 = java.lang.String.format(r2, r3)     // Catch:{ Exception -> 0x026e }
            r2 = r20
            android.content.Context r0 = r2.f315250b     // Catch:{ Exception -> 0x026c }
            android.content.ContentResolver r9 = r0.getContentResolver()     // Catch:{ Exception -> 0x026c }
            android.net.Uri r10 = android.provider.CalendarContract.Events.CONTENT_URI     // Catch:{ Exception -> 0x026c }
            java.lang.String[] r11 = f315249a     // Catch:{ Exception -> 0x026c }
            r13 = 0
            java.lang.String r14 = "calendar_access_level desc"
            android.database.Cursor r3 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x026c }
            if (r3 == 0) goto L_0x0237
            int r0 = r3.getCount()     // Catch:{ all -> 0x023f }
            if (r0 == 0) goto L_0x0237
            int r0 = r1.indexOf(r4)     // Catch:{ all -> 0x023f }
            r4 = -1
            if (r0 != r4) goto L_0x0056
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x023f }
            goto L_0x00c4
        L_0x0056:
            int r0 = r0 + r7
            java.lang.String r0 = r1.substring(r0)     // Catch:{ all -> 0x023f }
            java.lang.String r1 = "yyyyMMdd'T'HHmmss'Z'"
            org.c.a.e.b r1 = org.p5633c.p5634a.p5639e.C72234a.m106517a(r1)     // Catch:{ RuntimeException -> 0x009e }
            org.c.a.w r1 = r1.mo63599e(r0)     // Catch:{ RuntimeException -> 0x009e }
            org.c.a.l r9 = org.p5633c.p5634a.C72288l.f192416b     // Catch:{ RuntimeException -> 0x009e }
            org.c.a.l r9 = org.p5633c.p5634a.C72285i.m106777e(r9)     // Catch:{ RuntimeException -> 0x009e }
            org.c.a.a r10 = r1.f192456b     // Catch:{ RuntimeException -> 0x009e }
            org.c.a.a r19 = r10.mo63348e(r9)     // Catch:{ RuntimeException -> 0x009e }
            org.c.a.d r9 = new org.c.a.d     // Catch:{ RuntimeException -> 0x009e }
            int r12 = r1.mo63688n()     // Catch:{ RuntimeException -> 0x009e }
            int r13 = r1.mo63686l()     // Catch:{ RuntimeException -> 0x009e }
            int r14 = r1.mo63682d()     // Catch:{ RuntimeException -> 0x009e }
            int r15 = r1.mo63683g()     // Catch:{ RuntimeException -> 0x009e }
            int r16 = r1.mo63685k()     // Catch:{ RuntimeException -> 0x009e }
            int r17 = r1.mo63687m()     // Catch:{ RuntimeException -> 0x009e }
            int r18 = r1.mo63684j()     // Catch:{ RuntimeException -> 0x009e }
            r11 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ RuntimeException -> 0x009e }
            long r9 = r9.f191962a     // Catch:{ RuntimeException -> 0x009e }
            java.lang.Long r1 = java.lang.Long.valueOf(r9)     // Catch:{ RuntimeException -> 0x009e }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r1)     // Catch:{ RuntimeException -> 0x009e }
            goto L_0x00c4
        L_0x009e:
            java.lang.String r1 = "yyyyMMdd"
            org.c.a.e.b r1 = org.p5633c.p5634a.p5639e.C72234a.m106517a(r1)     // Catch:{ RuntimeException -> 0x00c2 }
            org.c.a.w r0 = r1.mo63599e(r0)     // Catch:{ RuntimeException -> 0x00c2 }
            org.c.a.v r1 = new org.c.a.v     // Catch:{ RuntimeException -> 0x00c2 }
            long r9 = r0.f192455a     // Catch:{ RuntimeException -> 0x00c2 }
            org.c.a.a r0 = r0.f192456b     // Catch:{ RuntimeException -> 0x00c2 }
            r1.<init>((long) r9, (org.p5633c.p5634a.C72132a) r0)     // Catch:{ RuntimeException -> 0x00c2 }
            org.c.a.l r0 = org.p5633c.p5634a.C72288l.f192416b     // Catch:{ RuntimeException -> 0x00c2 }
            org.c.a.d r0 = r1.mo63680g(r0)     // Catch:{ RuntimeException -> 0x00c2 }
            long r0 = r0.f191962a     // Catch:{ RuntimeException -> 0x00c2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ RuntimeException -> 0x00c2 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ RuntimeException -> 0x00c2 }
            goto L_0x00c4
        L_0x00c2:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x023f }
        L_0x00c4:
            boolean r1 = r3.moveToNext()     // Catch:{ all -> 0x023f }
            if (r1 == 0) goto L_0x022f
            int r1 = r3.getInt(r5)     // Catch:{ all -> 0x023f }
            long r9 = r3.getLong(r7)     // Catch:{ all -> 0x023f }
            long r11 = r3.getLong(r8)     // Catch:{ all -> 0x023f }
            r13 = 0
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x00e7
            long r11 = r11 - r9
            java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x023f }
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)     // Catch:{ all -> 0x023f }
            goto L_0x01e8
        L_0x00e7:
            java.lang.String r6 = r3.getString(r6)     // Catch:{ all -> 0x023f }
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x023f }
            if (r8 == 0) goto L_0x00f5
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x023f }
            goto L_0x01e8
        L_0x00f5:
            int r8 = r6.length()     // Catch:{ a -> 0x01e6 }
            if (r8 > 0) goto L_0x0104
            r4 = 1
        L_0x00fc:
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            goto L_0x01a4
        L_0x0104:
            char r9 = r6.charAt(r5)     // Catch:{ a -> 0x01e6 }
            r10 = 45
            if (r9 != r10) goto L_0x010e
        L_0x010c:
            r9 = 1
            goto L_0x0116
        L_0x010e:
            r4 = 43
            if (r9 != r4) goto L_0x0114
            r4 = 1
            goto L_0x010c
        L_0x0114:
            r4 = 1
            r9 = 0
        L_0x0116:
            if (r9 < r8) goto L_0x0119
        L_0x0118:
            goto L_0x00fc
        L_0x0119:
            char r10 = r6.charAt(r9)     // Catch:{ a -> 0x01e6 }
            r11 = 80
            java.lang.String r12 = "Duration.parse(str='"
            if (r10 != r11) goto L_0x01cc
            int r9 = r9 + r7
            if (r9 < r8) goto L_0x0127
            goto L_0x0118
        L_0x0127:
            char r10 = r6.charAt(r9)     // Catch:{ a -> 0x01e6 }
            r11 = 84
            if (r10 != r11) goto L_0x0131
            int r9 = r9 + 1
        L_0x0131:
            r10 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x013b:
            if (r9 >= r8) goto L_0x01a1
            char r5 = r6.charAt(r9)     // Catch:{ a -> 0x01e6 }
            r7 = 48
            if (r5 < r7) goto L_0x0150
            r7 = 57
            if (r5 > r7) goto L_0x0150
            int r19 = r19 * 10
            int r5 = r5 + -48
            int r19 = r19 + r5
            goto L_0x0177
        L_0x0150:
            r7 = 87
            if (r5 != r7) goto L_0x0159
            r18 = r19
        L_0x0156:
            r19 = 0
            goto L_0x0177
        L_0x0159:
            r7 = 72
            if (r5 != r7) goto L_0x0160
            r16 = r19
            goto L_0x0156
        L_0x0160:
            r7 = 77
            if (r5 != r7) goto L_0x0167
            r15 = r19
            goto L_0x0156
        L_0x0167:
            r7 = 83
            if (r5 != r7) goto L_0x016e
            r10 = r19
            goto L_0x0156
        L_0x016e:
            r7 = 68
            if (r5 != r7) goto L_0x0175
            r17 = r19
            goto L_0x0156
        L_0x0175:
            if (r5 != r11) goto L_0x017c
        L_0x0177:
            int r9 = r9 + 1
            r5 = 0
            r7 = 1
            goto L_0x013b
        L_0x017c:
            com.android.b.a r4 = new com.android.b.a     // Catch:{ a -> 0x01e6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ a -> 0x01e6 }
            r7.<init>()     // Catch:{ a -> 0x01e6 }
            r7.append(r12)     // Catch:{ a -> 0x01e6 }
            r7.append(r6)     // Catch:{ a -> 0x01e6 }
            java.lang.String r6 = "') unexpected char '"
            r7.append(r6)     // Catch:{ a -> 0x01e6 }
            r7.append(r5)     // Catch:{ a -> 0x01e6 }
            java.lang.String r5 = "' at index="
            r7.append(r5)     // Catch:{ a -> 0x01e6 }
            r7.append(r9)     // Catch:{ a -> 0x01e6 }
            java.lang.String r5 = r7.toString()     // Catch:{ a -> 0x01e6 }
            r4.<init>(r5)     // Catch:{ a -> 0x01e6 }
            throw r4     // Catch:{ a -> 0x01e6 }
        L_0x01a1:
            r12 = r10
            r5 = r18
        L_0x01a4:
            r6 = r4
            r7 = r5
            r8 = r17
            r9 = r16
            r10 = r15
            r11 = r12
            long r6 = com.android.p256b.C5016b.m13807a(r6, r7, r8, r9, r10, r11)     // Catch:{ a -> 0x01e6 }
            int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r8 < 0) goto L_0x01c9
            r6 = r4
            r7 = r5
            r8 = r17
            r9 = r16
            r10 = r15
            r11 = r12
            long r4 = com.android.p256b.C5016b.m13807a(r6, r7, r8, r9, r10, r11)     // Catch:{ a -> 0x01e6 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ a -> 0x01e6 }
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)     // Catch:{ a -> 0x01e6 }
            goto L_0x01e8
        L_0x01c9:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a     // Catch:{ a -> 0x01e6 }
            goto L_0x01e8
        L_0x01cc:
            com.android.b.a r4 = new com.android.b.a     // Catch:{ a -> 0x01e6 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ a -> 0x01e6 }
            r5.<init>(r12)     // Catch:{ a -> 0x01e6 }
            r5.append(r6)     // Catch:{ a -> 0x01e6 }
            java.lang.String r6 = "') expected 'P' at index="
            r5.append(r6)     // Catch:{ a -> 0x01e6 }
            r5.append(r9)     // Catch:{ a -> 0x01e6 }
            java.lang.String r5 = r5.toString()     // Catch:{ a -> 0x01e6 }
            r4.<init>(r5)     // Catch:{ a -> 0x01e6 }
            throw r4     // Catch:{ a -> 0x01e6 }
        L_0x01e6:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x023f }
        L_0x01e8:
            android.net.Uri r5 = android.provider.CalendarContract.Events.CONTENT_URI     // Catch:{ all -> 0x023f }
            long r6 = (long) r1     // Catch:{ all -> 0x023f }
            android.net.Uri r1 = android.content.ContentUris.withAppendedId(r5, r6)     // Catch:{ all -> 0x023f }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x023f }
            java.lang.String r6 = "android.intent.action.VIEW"
            r5.<init>(r6, r1)     // Catch:{ all -> 0x023f }
            boolean r1 = r0.mo56113h()     // Catch:{ all -> 0x023f }
            if (r1 == 0) goto L_0x0227
            boolean r1 = r4.mo56113h()     // Catch:{ all -> 0x023f }
            if (r1 == 0) goto L_0x0227
            java.lang.String r1 = "beginTime"
            java.lang.Object r6 = r0.mo56107c()     // Catch:{ all -> 0x023f }
            java.io.Serializable r6 = (java.io.Serializable) r6     // Catch:{ all -> 0x023f }
            r5.putExtra(r1, r6)     // Catch:{ all -> 0x023f }
            java.lang.String r1 = "endTime"
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x023f }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x023f }
            long r6 = r0.longValue()     // Catch:{ all -> 0x023f }
            java.lang.Object r0 = r4.mo56107c()     // Catch:{ all -> 0x023f }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x023f }
            long r8 = r0.longValue()     // Catch:{ all -> 0x023f }
            long r6 = r6 + r8
            r5.putExtra(r1, r6)     // Catch:{ all -> 0x023f }
        L_0x0227:
            r3.close()     // Catch:{ Exception -> 0x026c }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r5)     // Catch:{ Exception -> 0x026c }
            return r0
        L_0x022f:
            com.google.android.apps.gsa.staticplugins.opa.util.calendar.l r0 = new com.google.android.apps.gsa.staticplugins.opa.util.calendar.l     // Catch:{ all -> 0x023f }
            java.lang.String r1 = "No events in result set"
            r0.<init>(r1)     // Catch:{ all -> 0x023f }
            throw r0     // Catch:{ all -> 0x023f }
        L_0x0237:
            com.google.android.apps.gsa.staticplugins.opa.util.calendar.l r0 = new com.google.android.apps.gsa.staticplugins.opa.util.calendar.l     // Catch:{ all -> 0x023f }
            java.lang.String r1 = "No events returned that match the syncId and ownerAccount"
            r0.<init>(r1)     // Catch:{ all -> 0x023f }
            throw r0     // Catch:{ all -> 0x023f }
        L_0x023f:
            r0 = move-exception
            r1 = r0
            if (r3 == 0) goto L_0x0261
            r3.close()     // Catch:{ all -> 0x0247 }
            goto L_0x0261
        L_0x0247:
            r0 = move-exception
            r3 = r0
            r4 = 1
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0261 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r0[r5] = r4     // Catch:{ Exception -> 0x0261 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r6, r0)     // Catch:{ Exception -> 0x0261 }
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0261 }
            r4[r5] = r3     // Catch:{ Exception -> 0x0261 }
            r0.invoke(r1, r4)     // Catch:{ Exception -> 0x0261 }
        L_0x0261:
            throw r1     // Catch:{ Exception -> 0x026c }
        L_0x0262:
            r2 = r20
            com.google.android.apps.gsa.staticplugins.opa.util.calendar.l r0 = new com.google.android.apps.gsa.staticplugins.opa.util.calendar.l     // Catch:{ Exception -> 0x026c }
            java.lang.String r1 = "syncId or ownerAccount missing from intent"
            r0.<init>(r1)     // Catch:{ Exception -> 0x026c }
            throw r0     // Catch:{ Exception -> 0x026c }
        L_0x026c:
            r0 = move-exception
            goto L_0x0271
        L_0x026e:
            r0 = move-exception
            r2 = r20
        L_0x0271:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.util.calendar.C113844x.mo100692a(com.google.android.apps.gsa.staticplugins.opa.util.calendar.OpenCalendarEventIntentData):com.google.common.util.concurrent.cx");
    }
}

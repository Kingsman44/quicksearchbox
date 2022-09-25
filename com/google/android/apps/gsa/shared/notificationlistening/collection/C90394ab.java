package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Telephony;
import androidx.core.app.C1831r;
import androidx.core.app.C1832s;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90429j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.ab */
/* compiled from: PG */
public final class C90394ab implements C90411r {

    /* renamed from: a */
    static final Uri f252459a = Uri.parse("content://mms-sms/canonical-address");

    /* renamed from: b */
    static final Uri f252460b = Telephony.Threads.CONTENT_URI.buildUpon().appendQueryParameter("simple", "true").build();

    /* renamed from: c */
    static final String[] f252461c = {"_id", "recipient_ids"};

    /* renamed from: d */
    static final String[] f252462d = {"_id", "transport_type"};

    /* renamed from: e */
    static final String[] f252463e = {"date", "date_sent", "body"};

    /* renamed from: f */
    static final String[] f252464f = {"date", "date_sent"};

    /* renamed from: g */
    static final String[] f252465g = {"ct", "_data", "text", "_id"};

    /* renamed from: h */
    static final String[] f252466h = {"address", "charset"};

    /* renamed from: k */
    private static final C59071e f252467k = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.collection.ab");

    /* renamed from: i */
    public long f252468i = 604800;

    /* renamed from: j */
    public boolean f252469j;

    /* renamed from: l */
    private long f252470l;

    /* renamed from: a */
    static long m147003a(String str) {
        int lastIndexOf = str.lastIndexOf("*");
        if (!str.endsWith("_by_xms_parser") || lastIndexOf < 0) {
            C59104x c = f252467k.mo56225c();
            c.mo56378ag(C58975e.f156826a, "XmsParser");
            ((C59052c) ((C59052c) c).mo56372aa(10849)).mo56389s("Key suffix is not from %s", "XmsParser");
        }
        return Long.parseLong(str.substring(lastIndexOf + 1).replace("_by_xms_parser", BuildConfig.FLAVOR));
    }

    /* renamed from: b */
    public static boolean m147004b(String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith("_by_xms_parser");
    }

    /* renamed from: c */
    static final C1832s m147005c(Context context, C90367af afVar) {
        C1832s c = C90366ae.m146964c(afVar.f252393a.getNotification());
        if (c != null) {
            return c;
        }
        C1831r rVar = new C1831r(0, BuildConfig.FLAVOR, PendingIntent.getBroadcast(context, 0, new Intent(), 603979776));
        rVar.f5646a = 1;
        return rVar.mo5008a();
    }

    /* renamed from: e */
    private static String m147006e(long j) {
        return j + "_by_xms_parser";
    }

    /* renamed from: f */
    private static void m147007f(C90429j jVar) {
        jVar.f252565b = "SMS";
        jVar.f252575l = "parser.xms";
    }

    /* renamed from: g */
    private final boolean m147008g(long j) {
        return j < this.f252470l - (this.f252468i * 1000);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v9, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v28, resolved type: android.database.Cursor} */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:123|124|125|126) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:193|194|(2:196|197)|210|211|213|214) */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r0 = r0.getBytes();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r11 = new java.lang.String(r0, "iso-8859-1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r11 = new java.lang.String(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x0306 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x0323 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x032b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:213:0x0532 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x035f A[Catch:{ all -> 0x033e, all -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0361 A[Catch:{ all -> 0x033e, all -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x036f A[Catch:{ all -> 0x033e, all -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x039b A[Catch:{ all -> 0x033e, all -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x05f3 A[Catch:{ all -> 0x0200, all -> 0x0621 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0601 A[Catch:{ all -> 0x0200, all -> 0x0621 }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0221 A[Catch:{ all -> 0x0200, all -> 0x0621 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0235 A[Catch:{ all -> 0x0200, all -> 0x0621 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo84092d(android.content.Context r36, com.google.android.apps.gsa.shared.bisto.C89656k r37, com.google.android.libraries.p1730f.C21370a r38, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af r39, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o r40, com.google.common.p4552o.C60242lp r41, boolean r42) {
        /*
            r35 = this;
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r42
            long r8 = r38.mo26870b()
            r1.f252470l = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Locale r0 = java.util.Locale.US
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r11 = "read"
            r12 = 0
            r10[r12] = r11
            java.lang.String r11 = "archived"
            r13 = 1
            r10[r13] = r11
            java.lang.String r11 = "%s = 0 AND %s = 0"
            java.lang.String r17 = java.lang.String.format(r0, r11, r10)
            android.content.ContentResolver r14 = r36.getContentResolver()
            android.net.Uri r15 = f252460b
            java.lang.String[] r16 = f252461c
            r18 = 0
            java.lang.String r19 = "date DESC LIMIT 5"
            android.database.Cursor r10 = r14.query(r15, r16, r17, r18, r19)
            if (r10 == 0) goto L_0x0684
        L_0x0040:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x067d }
            if (r0 == 0) goto L_0x0674
            long r14 = r10.getLong(r12)     // Catch:{ all -> 0x067d }
            java.lang.String r11 = r10.getString(r13)     // Catch:{ all -> 0x067d }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x067d }
            com.google.common.b.gp r9 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x067d }
            com.google.common.base.m r0 = new com.google.common.base.m     // Catch:{ all -> 0x067d }
            r12 = 32
            r0.<init>(r12)     // Catch:{ all -> 0x067d }
            com.google.common.base.cf r0 = com.google.common.base.C58869cf.m90936b(r0)     // Catch:{ all -> 0x067d }
            java.lang.Iterable r0 = r0.mo56153g(r11)     // Catch:{ all -> 0x067d }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x067d }
            r0 = 0
        L_0x0068:
            boolean r17 = r12.hasNext()     // Catch:{ all -> 0x067d }
            java.lang.String r13 = "XmsParser"
            if (r17 == 0) goto L_0x00fc
            java.lang.Object r17 = r12.next()     // Catch:{ all -> 0x067d }
            r20 = r12
            r12 = r17
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x067d }
            r21 = r10
            r17 = 1
            int r10 = r0 + 1
            r22 = r8
            r8 = 5
            if (r10 <= r8) goto L_0x0089
            r9.mo55395g(r12)     // Catch:{ all -> 0x0672 }
            goto L_0x00f0
        L_0x0089:
            long r7 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x00dd }
            r23 = 0
            int r0 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ae
            com.google.common.f.e r0 = f252467k     // Catch:{ NumberFormatException -> 0x00dd }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ NumberFormatException -> 0x00dd }
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ NumberFormatException -> 0x00dd }
            r0.mo56378ag(r12, r13)     // Catch:{ NumberFormatException -> 0x00dd }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ NumberFormatException -> 0x00dd }
            r12 = 10853(0x2a65, float:1.5208E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r12)     // Catch:{ NumberFormatException -> 0x00dd }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ NumberFormatException -> 0x00dd }
            java.lang.String r12 = "getContactEndpointsFromRecipientIds: invalid id %d"
            r0.mo56388r(r12, r7)     // Catch:{ NumberFormatException -> 0x00dd }
            goto L_0x00f0
        L_0x00ae:
            android.content.ContentResolver r23 = r36.getContentResolver()     // Catch:{ all -> 0x0672 }
            android.net.Uri r0 = f252459a     // Catch:{ all -> 0x0672 }
            android.net.Uri r24 = android.content.ContentUris.withAppendedId(r0, r7)     // Catch:{ all -> 0x0672 }
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            android.database.Cursor r7 = r23.query(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0672 }
            if (r7 == 0) goto L_0x00f0
            boolean r0 = r7.moveToFirst()     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x00d4
            r8 = 0
            java.lang.String r0 = r7.getString(r8)     // Catch:{ all -> 0x00d8 }
            r9.mo55395g(r0)     // Catch:{ all -> 0x00d8 }
        L_0x00d4:
            r7.close()     // Catch:{ all -> 0x0672 }
            goto L_0x00f0
        L_0x00d8:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0672 }
            throw r0     // Catch:{ all -> 0x0672 }
        L_0x00dd:
            r0 = move-exception
            com.google.common.f.e r7 = f252467k     // Catch:{ all -> 0x0672 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x0672 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0672 }
            r7.mo56378ag(r8, r13)     // Catch:{ all -> 0x0672 }
            java.lang.String r8 = "getContactEndpointsFromRecipientIds: invalid id"
            r12 = 10854(0x2a66, float:1.521E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r0)).mo56372aa(r12)).mo56386p(r8)     // Catch:{ all -> 0x0672 }
        L_0x00f0:
            r7 = r42
            r0 = r10
            r12 = r20
            r10 = r21
            r8 = r22
            r13 = 1
            goto L_0x0068
        L_0x00fc:
            r22 = r8
            r21 = r10
            com.google.common.b.gu r7 = r9.mo55394f()     // Catch:{ all -> 0x0672 }
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x0672 }
            if (r0 == 0) goto L_0x011c
            com.google.common.f.e r0 = f252467k     // Catch:{ all -> 0x0672 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0672 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0672 }
            r0.mo56378ag(r8, r13)     // Catch:{ all -> 0x0672 }
            java.lang.String r8 = "No MMS contacts found from ids string [%s]"
            r9 = 10852(0x2a64, float:1.5207E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r9)).mo56389s(r8, r11)     // Catch:{ all -> 0x0672 }
        L_0x011c:
            com.google.common.b.gp r8 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x0672 }
            android.content.ContentResolver r23 = r36.getContentResolver()     // Catch:{ all -> 0x0672 }
            android.net.Uri r0 = android.provider.Telephony.Threads.CONTENT_URI     // Catch:{ all -> 0x0672 }
            android.net.Uri r24 = android.content.ContentUris.withAppendedId(r0, r14)     // Catch:{ all -> 0x0672 }
            java.lang.String[] r25 = f252462d     // Catch:{ all -> 0x0672 }
            java.lang.String r26 = "read = 0"
            r27 = 0
            r28 = 0
            android.database.Cursor r9 = r23.query(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0672 }
            if (r9 == 0) goto L_0x0635
            boolean r0 = r9.moveToLast()     // Catch:{ all -> 0x062e }
            if (r0 == 0) goto L_0x0623
            r17 = r13
            r10 = 0
            r11 = 0
        L_0x0142:
            long r12 = r9.getLong(r11)     // Catch:{ all -> 0x062e }
            java.lang.String r0 = "sms"
            r20 = r10
            r11 = 1
            java.lang.String r10 = r9.getString(r11)     // Catch:{ all -> 0x062e }
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x062e }
            java.lang.String r10 = "text/plain"
            if (r0 == 0) goto L_0x023d
            android.content.ContentResolver r23 = r36.getContentResolver()     // Catch:{ all -> 0x062e }
            android.net.Uri r0 = android.provider.Telephony.Sms.Inbox.CONTENT_URI     // Catch:{ all -> 0x062e }
            android.net.Uri r24 = android.content.ContentUris.withAppendedId(r0, r12)     // Catch:{ all -> 0x062e }
            java.lang.String[] r25 = f252463e     // Catch:{ all -> 0x062e }
            java.lang.String r26 = "read = 0"
            r27 = 0
            r28 = 0
            android.database.Cursor r11 = r23.query(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x062e }
            if (r11 == 0) goto L_0x0213
            boolean r0 = r11.moveToFirst()     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0202
            r23 = r8
            r24 = r9
            r12 = 0
            long r8 = r11.getLong(r12)     // Catch:{ all -> 0x0200 }
            boolean r0 = r1.m147008g(r8)     // Catch:{ all -> 0x0200 }
            if (r0 == 0) goto L_0x018d
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x0200 }
            r11.close()     // Catch:{ all -> 0x0621 }
            r8 = r42
            goto L_0x021b
        L_0x018d:
            com.google.android.apps.gsa.shared.notificationlistening.common.j r0 = new com.google.android.apps.gsa.shared.notificationlistening.common.j     // Catch:{ all -> 0x0200 }
            r0.<init>(r4)     // Catch:{ all -> 0x0200 }
            com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146971j(r2, r3, r5, r6, r0)     // Catch:{ all -> 0x0200 }
            r8 = r42
            if (r8 != 0) goto L_0x019c
            m147007f(r0)     // Catch:{ all -> 0x0200 }
        L_0x019c:
            r9 = 0
            long r12 = r11.getLong(r9)     // Catch:{ all -> 0x0200 }
            r9 = 1
            long r25 = r11.getLong(r9)     // Catch:{ all -> 0x0200 }
            r9 = 2
            java.lang.String r3 = r11.getString(r9)     // Catch:{ all -> 0x0200 }
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0200 }
            r0.f252576m = r9     // Catch:{ all -> 0x0200 }
            java.lang.Long r9 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x0200 }
            r0.f252578o = r9     // Catch:{ all -> 0x0200 }
            r9 = 0
            java.lang.Object r12 = r7.get(r9)     // Catch:{ all -> 0x0200 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0200 }
            java.lang.String r9 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146967f(r2, r12, r8)     // Catch:{ all -> 0x0200 }
            r0.f252615D = r9     // Catch:{ all -> 0x0200 }
            r0.f252621r = r7     // Catch:{ all -> 0x0200 }
            r0.f252622s = r3     // Catch:{ all -> 0x0200 }
            r0.f252623t = r10     // Catch:{ all -> 0x0200 }
            android.service.notification.StatusBarNotification r3 = r5.f252393a     // Catch:{ all -> 0x0200 }
            java.lang.String r3 = r3.getKey()     // Catch:{ all -> 0x0200 }
            java.lang.String r9 = m147006e(r14)     // Catch:{ all -> 0x0200 }
            r0.mo84143a(r3, r9)     // Catch:{ all -> 0x0200 }
            android.service.notification.StatusBarNotification r3 = r5.f252393a     // Catch:{ all -> 0x0200 }
            android.app.Notification r3 = r3.getNotification()     // Catch:{ all -> 0x0200 }
            r0.f252614C = r3     // Catch:{ all -> 0x0200 }
            androidx.core.app.s r3 = m147005c(r2, r5)     // Catch:{ all -> 0x0200 }
            r0.mo84160c(r3)     // Catch:{ all -> 0x0200 }
            android.service.notification.StatusBarNotification r3 = r5.f252393a     // Catch:{ all -> 0x0200 }
            android.app.Notification r3 = r3.getNotification()     // Catch:{ all -> 0x0200 }
            androidx.core.app.s r3 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146963b(r3)     // Catch:{ all -> 0x0200 }
            r0.mo84159b(r3)     // Catch:{ all -> 0x0200 }
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r3 = new com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification     // Catch:{ all -> 0x0200 }
            r3.<init>(r0)     // Catch:{ all -> 0x0200 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r3)     // Catch:{ all -> 0x0200 }
            r11.close()     // Catch:{ all -> 0x0621 }
            goto L_0x021b
        L_0x0200:
            r0 = move-exception
            goto L_0x020f
        L_0x0202:
            r23 = r8
            r24 = r9
            r8 = r42
            r11.close()     // Catch:{ all -> 0x0621 }
            goto L_0x0219
        L_0x020c:
            r0 = move-exception
            r24 = r9
        L_0x020f:
            r11.close()     // Catch:{ all -> 0x0621 }
            throw r0     // Catch:{ all -> 0x0621 }
        L_0x0213:
            r23 = r8
            r24 = r9
            r8 = r42
        L_0x0219:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x0621 }
        L_0x021b:
            boolean r3 = r0.mo56113h()     // Catch:{ all -> 0x0621 }
            if (r3 == 0) goto L_0x0235
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x0621 }
            com.google.android.apps.gsa.shared.notificationlistening.common.b r0 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90421b) r0     // Catch:{ all -> 0x0621 }
            r3 = r23
            r3.mo55395g(r0)     // Catch:{ all -> 0x0621 }
            int r10 = r20 + 1
            r1 = r3
            r12 = r17
            r16 = 0
            goto L_0x0605
        L_0x0235:
            r12 = r17
            r1 = r23
            r16 = 0
            goto L_0x0603
        L_0x023d:
            r3 = r8
            r24 = r9
            r8 = r42
            android.content.ContentResolver r25 = r36.getContentResolver()     // Catch:{ all -> 0x0621 }
            android.net.Uri r0 = android.provider.Telephony.Mms.Inbox.CONTENT_URI     // Catch:{ all -> 0x0621 }
            android.net.Uri r26 = android.content.ContentUris.withAppendedId(r0, r12)     // Catch:{ all -> 0x0621 }
            java.lang.String[] r27 = f252464f     // Catch:{ all -> 0x0621 }
            java.lang.String r28 = "read = 0"
            r29 = 0
            r30 = 0
            android.database.Cursor r9 = r25.query(r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0621 }
            if (r9 == 0) goto L_0x05d9
            boolean r0 = r9.moveToFirst()     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x05c6
            r11 = 0
            long r25 = r9.getLong(r11)     // Catch:{ all -> 0x05d2 }
            r27 = 1000(0x3e8, double:4.94E-321)
            r23 = r10
            long r10 = r25 * r27
            boolean r0 = r1.m147008g(r10)     // Catch:{ all -> 0x05d2 }
            if (r0 == 0) goto L_0x027e
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x05d2 }
            r9.close()     // Catch:{ all -> 0x0621 }
            r26 = r3
            r12 = r17
            r16 = 0
            goto L_0x05e1
        L_0x027e:
            com.google.android.apps.gsa.shared.notificationlistening.common.j r10 = new com.google.android.apps.gsa.shared.notificationlistening.common.j     // Catch:{ all -> 0x05d2 }
            r10.<init>(r4)     // Catch:{ all -> 0x05d2 }
            r11 = r37
            com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146971j(r2, r11, r5, r6, r10)     // Catch:{ all -> 0x05d2 }
            if (r8 != 0) goto L_0x028d
            m147007f(r10)     // Catch:{ all -> 0x05d2 }
        L_0x028d:
            r4 = 0
            long r25 = r9.getLong(r4)     // Catch:{ all -> 0x05d2 }
            long r25 = r25 * r27
            r4 = 1
            long r29 = r9.getLong(r4)     // Catch:{ all -> 0x05d2 }
            long r29 = r29 * r27
            java.lang.Long r0 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x05d2 }
            r10.f252576m = r0     // Catch:{ all -> 0x05d2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r29)     // Catch:{ all -> 0x05d2 }
            r10.f252578o = r0     // Catch:{ all -> 0x05d2 }
            r0 = r7
            com.google.common.b.pq r0 = (com.google.common.p4522b.C58724pq) r0     // Catch:{ all -> 0x05d2 }
            int r0 = r0.f156474d     // Catch:{ all -> 0x05d2 }
            java.lang.String r4 = "content://mms/"
            r6 = 1
            if (r0 != r6) goto L_0x02c2
            r6 = 0
            java.lang.Object r0 = r7.get(r6)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146967f(r2, r0, r8)     // Catch:{ all -> 0x05d2 }
            r26 = r3
            r28 = r9
            goto L_0x041b
        L_0x02c2:
            android.content.ContentResolver r26 = r36.getContentResolver()     // Catch:{ all -> 0x05d2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05d2 }
            r0.<init>()     // Catch:{ all -> 0x05d2 }
            r0.append(r4)     // Catch:{ all -> 0x05d2 }
            r0.append(r12)     // Catch:{ all -> 0x05d2 }
            java.lang.String r6 = "/addr"
            r0.append(r6)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05d2 }
            android.net.Uri r27 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String[] r28 = f252466h     // Catch:{ all -> 0x05d2 }
            java.lang.String r29 = "type = 137"
            r30 = 0
            r31 = 0
            android.database.Cursor r6 = r26.query(r27, r28, r29, r30, r31)     // Catch:{ all -> 0x05d2 }
            if (r6 == 0) goto L_0x0343
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x033e }
            if (r0 == 0) goto L_0x0338
            r11 = 0
            java.lang.String r0 = r6.getString(r11)     // Catch:{ all -> 0x033e }
            r11 = 1
            int r26 = r6.getInt(r11)     // Catch:{ all -> 0x033e }
            r11 = 4
            java.lang.String r11 = com.google.android.p3502m.p3503a.C44495a.m78595a(r11)     // Catch:{ UnsupportedEncodingException -> 0x0306 }
            byte[] r0 = r0.getBytes(r11)     // Catch:{ UnsupportedEncodingException -> 0x0306 }
            goto L_0x030a
        L_0x0306:
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x033e }
        L_0x030a:
            if (r26 != 0) goto L_0x0314
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x033e }
            r11.<init>(r0)     // Catch:{ all -> 0x033e }
            r26 = r3
            goto L_0x0330
        L_0x0314:
            java.lang.String r11 = com.google.android.p3502m.p3503a.C44495a.m78595a(r26)     // Catch:{ UnsupportedEncodingException -> 0x0321 }
            r26 = r3
            java.lang.String r3 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0323 }
            r3.<init>(r0, r11)     // Catch:{ UnsupportedEncodingException -> 0x0323 }
            r11 = r3
            goto L_0x0330
        L_0x0321:
            r26 = r3
        L_0x0323:
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x032b }
            java.lang.String r3 = "iso-8859-1"
            r11.<init>(r0, r3)     // Catch:{ UnsupportedEncodingException -> 0x032b }
            goto L_0x0330
        L_0x032b:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x033e }
            r11.<init>(r0)     // Catch:{ all -> 0x033e }
        L_0x0330:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r11)     // Catch:{ all -> 0x033e }
            r6.close()     // Catch:{ all -> 0x05d2 }
            goto L_0x0347
        L_0x0338:
            r26 = r3
            r6.close()     // Catch:{ all -> 0x05d2 }
            goto L_0x0345
        L_0x033e:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x05d2 }
            throw r0     // Catch:{ all -> 0x05d2 }
        L_0x0343:
            r26 = r3
        L_0x0345:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x05d2 }
        L_0x0347:
            java.lang.Object r3 = r0.mo56111f()     // Catch:{ all -> 0x05d2 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x05d2 }
            java.lang.String r3 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146967f(r2, r3, r8)     // Catch:{ all -> 0x05d2 }
            java.lang.Object r0 = r0.mo56111f()     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x05d2 }
            r6 = r7
            com.google.common.b.pq r6 = (com.google.common.p4522b.C58724pq) r6     // Catch:{ all -> 0x05d2 }
            int r6 = r6.f156474d     // Catch:{ all -> 0x05d2 }
            r11 = 2
            if (r6 < r11) goto L_0x0361
            r6 = 1
            goto L_0x0362
        L_0x0361:
            r6 = 0
        L_0x0362:
            java.lang.String r11 = "Group must have at least two other members."
            com.google.common.base.C58838bb.m90884s(r6, r11)     // Catch:{ all -> 0x05d2 }
            r6 = r7
            com.google.common.b.pq r6 = (com.google.common.p4522b.C58724pq) r6     // Catch:{ all -> 0x05d2 }
            int r6 = r6.f156474d     // Catch:{ all -> 0x05d2 }
            r11 = 2
            if (r6 != r11) goto L_0x039b
            r6 = 0
            java.lang.Object r11 = r7.get(r6)     // Catch:{ all -> 0x05d2 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x05d2 }
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x05d2 }
            r6 = 2132089419(0x7f151a4b, float:1.981915E38)
            java.lang.String r6 = r2.getString(r6)     // Catch:{ all -> 0x05d2 }
            r27 = r3
            r11 = 1
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ all -> 0x05d2 }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146967f(r2, r0, r8)     // Catch:{ all -> 0x05d2 }
            r11 = 0
            r3[r11] = r0     // Catch:{ all -> 0x05d2 }
            java.lang.String r0 = java.lang.String.format(r6, r3)     // Catch:{ all -> 0x05d2 }
            r28 = r9
            goto L_0x0417
        L_0x039b:
            r27 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x05d2 }
            r6 = 2
            r3.<init>(r6)     // Catch:{ all -> 0x05d2 }
            r28 = r9
            r11 = 0
        L_0x03a6:
            int r9 = r3.size()     // Catch:{ all -> 0x05c4 }
            if (r9 >= r6) goto L_0x03de
            r6 = r7
            com.google.common.b.pq r6 = (com.google.common.p4522b.C58724pq) r6     // Catch:{ all -> 0x05c4 }
            int r6 = r6.f156474d     // Catch:{ all -> 0x05c4 }
            if (r11 >= r6) goto L_0x03de
            java.lang.Object r6 = r7.get(r11)     // Catch:{ all -> 0x05c4 }
            if (r6 == 0) goto L_0x03de
            java.lang.Object r6 = r7.get(r11)     // Catch:{ all -> 0x05c4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05c4 }
            boolean r6 = r6.equals(r0)     // Catch:{ all -> 0x05c4 }
            if (r6 != 0) goto L_0x03da
            java.lang.Object r6 = r7.get(r11)     // Catch:{ all -> 0x05c4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05c4 }
            java.lang.String r6 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146967f(r2, r6, r8)     // Catch:{ all -> 0x05c4 }
            if (r6 != 0) goto L_0x03d7
            java.lang.Object r6 = r7.get(r11)     // Catch:{ all -> 0x05c4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05c4 }
        L_0x03d7:
            r3.add(r6)     // Catch:{ all -> 0x05c4 }
        L_0x03da:
            int r11 = r11 + 1
            r6 = 2
            goto L_0x03a6
        L_0x03de:
            int r0 = r3.size()     // Catch:{ all -> 0x05c4 }
            r6 = 2
            if (r0 != r6) goto L_0x0410
            r0 = 2132089420(0x7f151a4c, float:1.9819151E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05c4 }
            r6 = 3
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x05c4 }
            r6 = r7
            com.google.common.b.pq r6 = (com.google.common.p4522b.C58724pq) r6     // Catch:{ all -> 0x05c4 }
            int r6 = r6.f156474d     // Catch:{ all -> 0x05c4 }
            r11 = 1
            int r6 = r6 + r11
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x05c4 }
            r11 = 0
            r9[r11] = r6     // Catch:{ all -> 0x05c4 }
            java.lang.Object r6 = r3.get(r11)     // Catch:{ all -> 0x05c4 }
            r11 = 1
            r9[r11] = r6     // Catch:{ all -> 0x05c4 }
            java.lang.Object r3 = r3.get(r11)     // Catch:{ all -> 0x05c4 }
            r6 = 2
            r9[r6] = r3     // Catch:{ all -> 0x05c4 }
            java.lang.String r0 = java.lang.String.format(r0, r9)     // Catch:{ all -> 0x05c4 }
            goto L_0x0417
        L_0x0410:
            r0 = 2132093361(0x7f1529b1, float:1.9827145E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05c4 }
        L_0x0417:
            r10.f252620q = r0     // Catch:{ all -> 0x05c4 }
            r0 = r27
        L_0x041b:
            r10.f252615D = r0     // Catch:{ all -> 0x05c4 }
            r10.f252621r = r7     // Catch:{ all -> 0x05c4 }
            android.service.notification.StatusBarNotification r0 = r5.f252393a     // Catch:{ all -> 0x05c4 }
            java.lang.String r0 = r0.getKey()     // Catch:{ all -> 0x05c4 }
            java.lang.String r3 = m147006e(r14)     // Catch:{ all -> 0x05c4 }
            r10.mo84143a(r0, r3)     // Catch:{ all -> 0x05c4 }
            android.service.notification.StatusBarNotification r0 = r5.f252393a     // Catch:{ all -> 0x05c4 }
            android.app.Notification r0 = r0.getNotification()     // Catch:{ all -> 0x05c4 }
            r10.f252614C = r0     // Catch:{ all -> 0x05c4 }
            androidx.core.app.s r0 = m147005c(r2, r5)     // Catch:{ all -> 0x05c4 }
            r10.mo84160c(r0)     // Catch:{ all -> 0x05c4 }
            android.service.notification.StatusBarNotification r0 = r5.f252393a     // Catch:{ all -> 0x05c4 }
            android.app.Notification r0 = r0.getNotification()     // Catch:{ all -> 0x05c4 }
            androidx.core.app.s r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146963b(r0)     // Catch:{ all -> 0x05c4 }
            r10.mo84159b(r0)     // Catch:{ all -> 0x05c4 }
            com.google.common.b.gp r3 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x05c4 }
            com.google.common.b.gp r6 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x05c4 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x05c4 }
            r9 = 2
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ all -> 0x05c4 }
            java.lang.String r9 = "ct"
            r16 = 0
            r11[r16] = r9     // Catch:{ all -> 0x05c4 }
            java.lang.String r9 = "application/smil"
            r18 = 1
            r11[r18] = r9     // Catch:{ all -> 0x05c4 }
            java.lang.String r9 = "%s != '%s'"
            java.lang.String r32 = java.lang.String.format(r0, r9, r11)     // Catch:{ all -> 0x05c4 }
            android.content.ContentResolver r29 = r36.getContentResolver()     // Catch:{ all -> 0x05c4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05c4 }
            r0.<init>()     // Catch:{ all -> 0x05c4 }
            r0.append(r4)     // Catch:{ all -> 0x05c4 }
            r0.append(r12)     // Catch:{ all -> 0x05c4 }
            java.lang.String r4 = "/part"
            r0.append(r4)     // Catch:{ all -> 0x05c4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05c4 }
            android.net.Uri r30 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x05c4 }
            java.lang.String[] r31 = f252465g     // Catch:{ all -> 0x05c4 }
            r33 = 0
            java.lang.String r34 = "_id DESC"
            android.database.Cursor r4 = r29.query(r30, r31, r32, r33, r34)     // Catch:{ all -> 0x05c4 }
            if (r4 == 0) goto L_0x05ad
        L_0x048f:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x05a8 }
            if (r0 == 0) goto L_0x05a0
            r9 = 0
            java.lang.String r0 = r4.getString(r9)     // Catch:{ all -> 0x05a8 }
            r9 = 1
            java.lang.String r11 = r4.getString(r9)     // Catch:{ all -> 0x05a8 }
            r9 = 2
            java.lang.String r12 = r4.getString(r9)     // Catch:{ all -> 0x05a8 }
            r13 = 3
            java.lang.String r9 = r4.getString(r13)     // Catch:{ all -> 0x05a8 }
            if (r0 == 0) goto L_0x0598
            java.lang.String r0 = com.google.common.base.C58890d.m90988c(r0)     // Catch:{ all -> 0x05a8 }
            r10.f252623t = r0     // Catch:{ all -> 0x05a8 }
            r13 = r23
            boolean r23 = r13.equals(r0)     // Catch:{ all -> 0x05a8 }
            if (r23 == 0) goto L_0x04c1
            r10.f252622s = r12     // Catch:{ all -> 0x05a8 }
        L_0x04bb:
            r12 = r17
            r16 = 0
            goto L_0x0586
        L_0x04c1:
            java.lang.String r12 = "image"
            boolean r12 = r0.startsWith(r12)     // Catch:{ all -> 0x05a8 }
            if (r12 == 0) goto L_0x0559
            r0 = 2132092344(0x7f1525b8, float:1.9825082E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05a8 }
            r10.f252622s = r0     // Catch:{ all -> 0x05a8 }
            boolean r0 = r1.f252469j     // Catch:{ all -> 0x05a8 }
            if (r0 == 0) goto L_0x04bb
            android.content.ContentResolver r0 = r36.getContentResolver()     // Catch:{ all -> 0x05a8 }
            java.lang.String r12 = "content://mms/part/"
            java.lang.String r11 = java.lang.String.valueOf(r9)     // Catch:{ IOException -> 0x053d, NullPointerException -> 0x053b, IllegalArgumentException -> 0x0539 }
            java.lang.String r11 = r12.concat(r11)     // Catch:{ IOException -> 0x053d, NullPointerException -> 0x053b, IllegalArgumentException -> 0x0539 }
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ IOException -> 0x053d, NullPointerException -> 0x053b, IllegalArgumentException -> 0x0539 }
            java.io.InputStream r11 = com.google.android.libraries.gsa.util.C23335a.m43765b(r0, r11)     // Catch:{ IOException -> 0x053d, NullPointerException -> 0x053b, IllegalArgumentException -> 0x0539 }
            r12 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r11, r12, r12)     // Catch:{ all -> 0x0509 }
            r0.getClass()
            j$.util.Optional r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90385s.m146989a(r0)     // Catch:{ all -> 0x0509 }
            java.lang.Object r0 = r0.orElse(r12)     // Catch:{ all -> 0x0509 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0509 }
            if (r11 == 0) goto L_0x0503
            r11.close()     // Catch:{ IOException -> 0x053d, NullPointerException -> 0x053b, IllegalArgumentException -> 0x0539 }
        L_0x0503:
            r11 = r0
            r12 = r17
            r16 = 0
            goto L_0x0556
        L_0x0509:
            r0 = move-exception
            r12 = r0
            if (r11 == 0) goto L_0x052f
            r11.close()     // Catch:{ all -> 0x0511 }
            goto L_0x052f
        L_0x0511:
            r0 = move-exception
            r11 = r0
            r1 = 1
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0530 }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r16 = 0
            r0[r16] = r1     // Catch:{ Exception -> 0x052d }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r5, r0)     // Catch:{ Exception -> 0x052d }
            r1 = 1
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0532 }
            r5[r16] = r11     // Catch:{ Exception -> 0x0532 }
            r0.invoke(r12, r5)     // Catch:{ Exception -> 0x0532 }
            goto L_0x0532
        L_0x052d:
            r1 = 1
            goto L_0x0532
        L_0x052f:
            r1 = 1
        L_0x0530:
            r16 = 0
        L_0x0532:
            throw r12     // Catch:{ IOException -> 0x0537, NullPointerException -> 0x0535, IllegalArgumentException -> 0x0533 }
        L_0x0533:
            r0 = move-exception
            goto L_0x0541
        L_0x0535:
            r0 = move-exception
            goto L_0x0541
        L_0x0537:
            r0 = move-exception
            goto L_0x0541
        L_0x0539:
            r0 = move-exception
            goto L_0x053e
        L_0x053b:
            r0 = move-exception
            goto L_0x053e
        L_0x053d:
            r0 = move-exception
        L_0x053e:
            r1 = 1
            r16 = 0
        L_0x0541:
            com.google.common.f.e r5 = f252467k     // Catch:{ all -> 0x05a8 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x05a8 }
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x05a8 }
            r12 = r17
            r5.mo56378ag(r11, r12)     // Catch:{ all -> 0x05a8 }
            java.lang.String r11 = "Failed to load image: %s"
            r1 = 10851(0x2a63, float:1.5205E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r1)).mo56389s(r11, r9)     // Catch:{ all -> 0x05a8 }
            r11 = 0
        L_0x0556:
            r10.f252613B = r11     // Catch:{ all -> 0x05a8 }
            goto L_0x0586
        L_0x0559:
            r12 = r17
            r16 = 0
            java.lang.String r1 = "video"
            boolean r1 = r0.startsWith(r1)     // Catch:{ all -> 0x05a8 }
            if (r1 == 0) goto L_0x056f
            r0 = 2132092345(0x7f1525b9, float:1.9825084E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05a8 }
            r10.f252622s = r0     // Catch:{ all -> 0x05a8 }
            goto L_0x0586
        L_0x056f:
            java.lang.String r1 = "audio"
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x05a8 }
            if (r0 == 0) goto L_0x058e
            r0 = 2132092338(0x7f1525b2, float:1.982507E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05a8 }
            r10.f252622s = r0     // Catch:{ all -> 0x05a8 }
            android.net.Uri r0 = android.net.Uri.parse(r11)     // Catch:{ all -> 0x05a8 }
            r10.f252567d = r0     // Catch:{ all -> 0x05a8 }
        L_0x0586:
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r0 = new com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification     // Catch:{ all -> 0x05a8 }
            r0.<init>(r10)     // Catch:{ all -> 0x05a8 }
            r6.mo55395g(r0)     // Catch:{ all -> 0x05a8 }
        L_0x058e:
            r1 = r35
            r5 = r39
            r17 = r12
            r23 = r13
            goto L_0x048f
        L_0x0598:
            r16 = 0
            r1 = r35
            r5 = r39
            goto L_0x048f
        L_0x05a0:
            r12 = r17
            r16 = 0
            r4.close()     // Catch:{ all -> 0x05c4 }
            goto L_0x05b1
        L_0x05a8:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x05c4 }
            throw r0     // Catch:{ all -> 0x05c4 }
        L_0x05ad:
            r12 = r17
            r16 = 0
        L_0x05b1:
            com.google.common.b.gu r0 = r6.mo55394f()     // Catch:{ all -> 0x05c4 }
            r3.mo55396h(r0)     // Catch:{ all -> 0x05c4 }
            com.google.common.b.gu r0 = r3.mo55394f()     // Catch:{ all -> 0x05c4 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ all -> 0x05c4 }
            r28.close()     // Catch:{ all -> 0x0621 }
            goto L_0x05e1
        L_0x05c4:
            r0 = move-exception
            goto L_0x05d5
        L_0x05c6:
            r26 = r3
            r28 = r9
            r12 = r17
            r16 = 0
            r28.close()     // Catch:{ all -> 0x0621 }
            goto L_0x05df
        L_0x05d2:
            r0 = move-exception
            r28 = r9
        L_0x05d5:
            r28.close()     // Catch:{ all -> 0x0621 }
            throw r0     // Catch:{ all -> 0x0621 }
        L_0x05d9:
            r26 = r3
            r12 = r17
            r16 = 0
        L_0x05df:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x0621 }
        L_0x05e1:
            boolean r1 = r0.mo56113h()     // Catch:{ all -> 0x0621 }
            if (r1 == 0) goto L_0x0601
            java.lang.Object r1 = r0.mo56107c()     // Catch:{ all -> 0x0621 }
            com.google.common.b.gu r1 = (com.google.common.p4522b.C58485gu) r1     // Catch:{ all -> 0x0621 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0621 }
            if (r1 != 0) goto L_0x0601
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x0621 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0621 }
            r1 = r26
            r1.mo55396h(r0)     // Catch:{ all -> 0x0621 }
            int r10 = r20 + 1
            goto L_0x0605
        L_0x0601:
            r1 = r26
        L_0x0603:
            r10 = r20
        L_0x0605:
            boolean r0 = r24.moveToPrevious()     // Catch:{ all -> 0x0621 }
            if (r0 == 0) goto L_0x062a
            r3 = 5
            if (r10 < r3) goto L_0x060f
            goto L_0x062a
        L_0x060f:
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r8 = r1
            r17 = r12
            r9 = r24
            r11 = 0
            r1 = r35
            goto L_0x0142
        L_0x0621:
            r0 = move-exception
            goto L_0x0631
        L_0x0623:
            r1 = r8
            r24 = r9
            r16 = 0
            r8 = r42
        L_0x062a:
            r24.close()     // Catch:{ all -> 0x0672 }
            goto L_0x063a
        L_0x062e:
            r0 = move-exception
            r24 = r9
        L_0x0631:
            r24.close()     // Catch:{ all -> 0x0672 }
            throw r0     // Catch:{ all -> 0x0672 }
        L_0x0635:
            r1 = r8
            r16 = 0
            r8 = r42
        L_0x063a:
            com.google.common.b.gu r0 = r1.mo55394f()     // Catch:{ all -> 0x0672 }
            if (r0 == 0) goto L_0x065e
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0672 }
            if (r1 != 0) goto L_0x065e
            r1 = r22
            r1.add(r0)     // Catch:{ all -> 0x0672 }
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r8
            r10 = r21
            r9 = 2
            r12 = 0
            r13 = 1
            r8 = r1
            r1 = r35
            goto L_0x0040
        L_0x065e:
            r1 = r35
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r8
            r10 = r21
            r8 = r22
            r9 = 2
            r12 = 0
            r13 = 1
            goto L_0x0040
        L_0x0672:
            r0 = move-exception
            goto L_0x0680
        L_0x0674:
            r1 = r8
            r21 = r10
            r16 = 0
            r21.close()
            goto L_0x0687
        L_0x067d:
            r0 = move-exception
            r21 = r10
        L_0x0680:
            r21.close()
            throw r0
        L_0x0684:
            r1 = r8
            r16 = 0
        L_0x0687:
            com.google.android.apps.gsa.shared.notificationlistening.collection.aa r0 = new com.google.android.apps.gsa.shared.notificationlistening.collection.aa
            r0.<init>()
            java.util.Collections.sort(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r1.size()
            r12 = 0
        L_0x0699:
            if (r12 >= r2) goto L_0x06a7
            java.lang.Object r3 = r1.get(r12)
            java.util.List r3 = (java.util.List) r3
            r0.addAll(r3)
            int r12 = r12 + 1
            goto L_0x0699
        L_0x06a7:
            java.util.Collections.reverse(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.notificationlistening.collection.C90394ab.mo84092d(android.content.Context, com.google.android.apps.gsa.shared.bisto.k, com.google.android.libraries.f.a, com.google.android.apps.gsa.shared.notificationlistening.collection.a.af, com.google.android.apps.gsa.shared.notificationlistening.collection.a.o, com.google.common.o.lp, boolean):java.util.List");
    }
}

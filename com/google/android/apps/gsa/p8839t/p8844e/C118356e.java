package com.google.android.apps.gsa.p8839t.p8844e;

import android.content.Context;
import com.google.android.apps.gsa.contacts.bz;
import com.google.android.apps.gsa.opa.C83581al;
import com.google.android.apps.gsa.p8839t.p8847h.C118426bs;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.t.e.e */
/* compiled from: PG */
public final class C118356e {

    /* renamed from: a */
    public static final C59071e f328505a = C59071e.m91332i("com.google.android.apps.gsa.t.e.e");

    /* renamed from: b */
    public final C22871g f328506b;

    /* renamed from: c */
    public final C22871g f328507c;

    /* renamed from: d */
    public final C86124t f328508d;

    /* renamed from: e */
    public final C83581al f328509e;

    /* renamed from: f */
    public final bz f328510f;

    /* renamed from: g */
    public final C68214a f328511g;

    /* renamed from: h */
    public final C118426bs f328512h;

    /* renamed from: i */
    public final Context f328513i;

    /* renamed from: j */
    public boolean f328514j = false;

    /* renamed from: k */
    public SettableFuture f328515k = new SettableFuture();

    public C118356e(C86124t tVar, C83581al alVar, bz bzVar, C22871g gVar, C22871g gVar2, C68214a aVar, C118426bs bsVar, Context context) {
        this.f328508d = tVar;
        this.f328509e = alVar;
        this.f328506b = gVar2;
        this.f328507c = gVar;
        this.f328510f = bzVar;
        this.f328511g = aVar;
        this.f328512h = bsVar;
        this.f328513i = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        throw r10;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00d8 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc A[SYNTHETIC, Splitter:B:30:0x00dc] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58485gu mo103676a(java.util.List r17, com.google.android.apps.search.assistant.platform.pcp.p9329f.C123762cb r18, android.content.Context r19) {
        /*
            r16 = this;
            java.lang.String r1 = ""
            com.google.common.b.gp r2 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Iterator r3 = r17.iterator()
        L_0x000a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0118
            java.lang.Object r0 = r3.next()
            com.google.android.apps.gsa.contacts.ap r0 = (com.google.android.apps.gsa.contacts.ap) r0
            double r4 = r0.d
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0112
            com.google.android.apps.search.assistant.platform.pcp.f.cf r4 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf.f341884i
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.search.assistant.platform.pcp.f.ce r4 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123765ce) r4
            java.lang.String r5 = r0.c
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.apps.search.assistant.platform.pcp.f.cf r6 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf) r6
            r5.getClass()
            int r7 = r6.f341886a
            r8 = 1
            r7 = r7 | r8
            r6.f341886a = r7
            r6.f341887b = r5
            java.lang.String r5 = r0.b
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.apps.search.assistant.platform.pcp.f.cf r6 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf) r6
            r5.getClass()
            int r7 = r6.f341886a
            r7 = r7 | 4
            r6.f341886a = r7
            r6.f341889d = r5
            double r5 = r0.d
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.android.apps.search.assistant.platform.pcp.f.cf r7 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf) r7
            int r9 = r7.f341886a
            r9 = r9 | 32
            r7.f341886a = r9
            r7.f341892g = r5
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.search.assistant.platform.pcp.f.cf r5 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf) r5
            r6 = r18
            int r7 = r6.f341879e
            r5.f341891f = r7
            int r7 = r5.f341886a
            r7 = r7 | 16
            r5.f341886a = r7
            r5 = r16
            com.google.android.apps.gsa.search.core.i.t r7 = r5.f328508d
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90069du.f249729g
            boolean r7 = r7.mo79746e(r9)
            if (r7 == 0) goto L_0x0107
            java.lang.String r0 = r0.b
            java.lang.String[] r11 = new java.lang.String[r8]
            r7 = 0
            java.lang.String r15 = "data1"
            r11[r7] = r15
            r9 = 2
            java.lang.String[] r13 = new java.lang.String[r9]
            r13[r7] = r0
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            r13[r8] = r0
            java.lang.String r12 = "contact_id = ? AND mimetype = ?"
            android.content.ContentResolver r9 = r19.getContentResolver()     // Catch:{ RuntimeException -> 0x00e0 }
            android.net.Uri r10 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ RuntimeException -> 0x00e0 }
            r14 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ RuntimeException -> 0x00e0 }
            if (r9 == 0) goto L_0x00d9
            boolean r0 = r9.moveToFirst()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x00d9
            int r0 = r9.getColumnIndex(r15)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x00bb }
            boolean r10 = com.google.common.base.C58837ba.m90859h(r0)     // Catch:{ all -> 0x00bb }
            if (r10 == 0) goto L_0x00b4
            goto L_0x00d9
        L_0x00b4:
            java.lang.String r10 = "[\\D]"
            java.lang.String r0 = r0.replaceAll(r10, r1)     // Catch:{ all -> 0x00bb }
            goto L_0x00da
        L_0x00bb:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch:{ all -> 0x00c1 }
            goto L_0x00d8
        L_0x00c1:
            r0 = move-exception
            r9 = r0
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x00d8 }
            java.lang.Class<java.lang.Throwable> r11 = java.lang.Throwable.class
            r0[r7] = r11     // Catch:{ Exception -> 0x00d8 }
            java.lang.Class<java.lang.Throwable> r11 = java.lang.Throwable.class
            java.lang.String r12 = "addSuppressed"
            java.lang.reflect.Method r0 = r11.getDeclaredMethod(r12, r0)     // Catch:{ Exception -> 0x00d8 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x00d8 }
            r8[r7] = r9     // Catch:{ Exception -> 0x00d8 }
            r0.invoke(r10, r8)     // Catch:{ Exception -> 0x00d8 }
        L_0x00d8:
            throw r10     // Catch:{ RuntimeException -> 0x00e0 }
        L_0x00d9:
            r0 = r1
        L_0x00da:
            if (r9 == 0) goto L_0x00f5
            r9.close()     // Catch:{ RuntimeException -> 0x00e1 }
            goto L_0x00f5
        L_0x00e0:
            r0 = r1
        L_0x00e1:
            com.google.common.f.e r7 = f328505a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r9 = "PCP.TopContactManager"
            r7.mo56378ag(r8, r9)
            java.lang.String r8 = "exception occurred during fetching contactId phone number"
            r9 = 6941(0x1b1d, float:9.726E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)
        L_0x00f5:
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.android.apps.search.assistant.platform.pcp.f.cf r7 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf) r7
            r0.getClass()
            int r8 = r7.f341886a
            r8 = r8 | 64
            r7.f341886a = r8
            r7.f341893h = r0
        L_0x0107:
            com.google.protobuf.bv r0 = r4.build()
            com.google.android.apps.search.assistant.platform.pcp.f.cf r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf) r0
            r2.mo55395g(r0)
            goto L_0x000a
        L_0x0112:
            r5 = r16
            r6 = r18
            goto L_0x000a
        L_0x0118:
            r5 = r16
            com.google.common.b.gu r0 = r2.mo55394f()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p8839t.p8844e.C118356e.mo103676a(java.util.List, com.google.android.apps.search.assistant.platform.pcp.f.cb, android.content.Context):com.google.common.b.gu");
    }

    /* renamed from: b */
    public final C60870cx mo103677b() {
        C58976aa aaVar = C58975e.f156826a;
        return this.f328506b.mo28201a("Fetch contacts from content provider.", new C118352a(this));
    }
}

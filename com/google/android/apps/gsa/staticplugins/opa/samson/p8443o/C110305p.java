package com.google.android.apps.gsa.staticplugins.opa.samson.p8443o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.C73844bk;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.o.p */
/* compiled from: PG */
public final class C110305p implements C73844bk {

    /* renamed from: a */
    public static final C59071e f307427a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.o.p");

    /* renamed from: b */
    public static final C110299j f307428b = new C110290a((String) null, -1, -1);

    /* renamed from: l */
    private static final C110299j f307429l = new C110290a((String) null, -1, 0);

    /* renamed from: c */
    public Uri f307430c;

    /* renamed from: d */
    public Uri f307431d;

    /* renamed from: e */
    public String f307432e;

    /* renamed from: f */
    public String f307433f;

    /* renamed from: g */
    public final ContentObserver f307434g = new C110303n(this);

    /* renamed from: h */
    public final C110304o f307435h;

    /* renamed from: i */
    public final C22871g f307436i;

    /* renamed from: j */
    public final C22871g f307437j;

    /* renamed from: k */
    public final ContentResolver f307438k;

    /* renamed from: m */
    private final C86124t f307439m;

    public C110305p(Context context, C22871g gVar, C86124t tVar, C22871g gVar2) {
        this.f307438k = context.getContentResolver();
        this.f307436i = gVar;
        this.f307437j = gVar2;
        this.f307439m = tVar;
        C110304o oVar = new C110304o(this);
        this.f307435h = oVar;
        oVar.mo5706i(f307428b);
        mo98552c();
    }

    /* renamed from: a */
    public final C60870cx mo65327a() {
        return this.f307436i.mo28201a("fetch saved", new C110301l(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.staticplugins.opa.samson.p8443o.C110299j mo98551b() {
        /*
            r11 = this;
            java.lang.String r0 = "DCProviderAcc"
            com.google.android.apps.gsa.staticplugins.opa.samson.o.j r1 = f307429l
            boolean r2 = r11.mo98552c()
            if (r2 == 0) goto L_0x00ad
            android.content.ContentResolver r3 = r11.f307438k     // Catch:{ all -> 0x0079 }
            android.net.Uri r4 = r11.f307430c     // Catch:{ all -> 0x0079 }
            r2 = 2
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = r11.f307432e     // Catch:{ all -> 0x0079 }
            r9 = 0
            r5[r9] = r2     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "authenticated"
            r10 = 1
            r5[r10] = r2     // Catch:{ all -> 0x0079 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0079 }
            if (r2 == 0) goto L_0x0055
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0075 }
            if (r3 == 0) goto L_0x0055
            java.lang.String r3 = r2.getString(r9)     // Catch:{ all -> 0x0075 }
            int r4 = r2.getInt(r10)     // Catch:{ all -> 0x0075 }
            com.google.android.apps.gsa.staticplugins.opa.samson.o.a r5 = new com.google.android.apps.gsa.staticplugins.opa.samson.o.a     // Catch:{ all -> 0x0075 }
            r5.<init>(r3, r4, r10)     // Catch:{ all -> 0x0075 }
            com.google.common.f.e r1 = f307427a     // Catch:{ all -> 0x0053 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0053 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0053 }
            r1.mo56378ag(r3, r0)     // Catch:{ all -> 0x0053 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0053 }
            r3 = 25989(0x6585, float:3.6418E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)     // Catch:{ all -> 0x0053 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0053 }
            java.lang.String r3 = "found row, cs c"
            r1.mo56386p(r3)     // Catch:{ all -> 0x0053 }
            r1 = r5
            goto L_0x006f
        L_0x0053:
            r1 = move-exception
            goto L_0x007e
        L_0x0055:
            com.google.common.f.e r3 = f307427a     // Catch:{ all -> 0x0075 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x0075 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0075 }
            r3.mo56378ag(r4, r0)     // Catch:{ all -> 0x0075 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0075 }
            r4 = 25987(0x6583, float:3.6416E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x0075 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = "no row, cs d"
            r3.mo56386p(r4)     // Catch:{ all -> 0x0075 }
        L_0x006f:
            if (r2 == 0) goto L_0x00ad
            r2.close()
            return r1
        L_0x0075:
            r3 = move-exception
            r5 = r1
            r1 = r3
            goto L_0x007e
        L_0x0079:
            r2 = move-exception
            r3 = 0
            r5 = r1
            r1 = r2
            r2 = r3
        L_0x007e:
            com.google.common.f.e r3 = f307427a     // Catch:{ all -> 0x00a6 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x00a6 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00a6 }
            r3.mo56378ag(r4, r0)     // Catch:{ all -> 0x00a6 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00a6 }
            com.google.common.f.x r0 = r3.mo56382g(r1)     // Catch:{ all -> 0x00a6 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00a6 }
            r1 = 25988(0x6584, float:3.6417E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x00a6 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "Failed to fetch"
            r0.mo56386p(r1)     // Catch:{ all -> 0x00a6 }
            if (r2 != 0) goto L_0x00a2
            r1 = r5
            goto L_0x00ad
        L_0x00a2:
            r2.close()
            return r5
        L_0x00a6:
            r0 = move-exception
            if (r2 == 0) goto L_0x00ac
            r2.close()
        L_0x00ac:
            throw r0
        L_0x00ad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.samson.p8443o.C110305p.mo98551b():com.google.android.apps.gsa.staticplugins.opa.samson.o.j");
    }

    /* renamed from: c */
    public final boolean mo98552c() {
        if (this.f307430c == null) {
            String x = this.f307439m.mo79758x(C90014bt.f247121bF);
            if (TextUtils.isEmpty(x)) {
                return false;
            }
            this.f307430c = Uri.parse(x);
        }
        if (this.f307431d == null) {
            String x2 = this.f307439m.mo79758x(C90014bt.f247120bE);
            if (TextUtils.isEmpty(x2)) {
                return false;
            }
            this.f307431d = Uri.parse(x2);
        }
        if (this.f307432e == null) {
            String x3 = this.f307439m.mo79758x(C90014bt.f247124bI);
            this.f307432e = x3;
            if (TextUtils.isEmpty(x3)) {
                return false;
            }
        }
        if (this.f307433f != null) {
            return true;
        }
        String x4 = this.f307439m.mo79758x(C90014bt.f247125bJ);
        this.f307433f = x4;
        if (TextUtils.isEmpty(x4)) {
            return false;
        }
        return true;
    }
}

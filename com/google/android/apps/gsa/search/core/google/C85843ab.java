package com.google.android.apps.gsa.search.core.google;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3003h.p3004a.C38400d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.google.ab */
/* compiled from: PG */
public class C85843ab extends C85851ai {

    /* renamed from: k */
    private static final C59071e f232106k = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.ab");

    /* renamed from: a */
    public C21370a f232107a;

    /* renamed from: b */
    public C68214a f232108b;

    /* renamed from: c */
    public C68214a f232109c;

    /* renamed from: d */
    public C68214a f232110d;

    /* renamed from: e */
    public C68214a f232111e;

    /* renamed from: f */
    public C68214a f232112f;

    /* renamed from: g */
    public C68214a f232113g;

    /* renamed from: h */
    public C68214a f232114h;

    /* renamed from: i */
    public C68214a f232115i;

    /* renamed from: j */
    public C38400d f232116j;

    /* renamed from: b */
    private final void m137927b(Intent intent) {
        try {
            C59104x b = f232106k.mo56224b();
            b.mo56378ag(C58975e.f156826a, "QSB.GoogleSearch");
            ((C59052c) ((C59052c) b).mo56372aa(7843)).mo56389s("Launching intent: %s", intent.toUri(0));
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            C59104x d = f232106k.mo56226d();
            d.mo56378ag(C58975e.f156826a, "QSB.GoogleSearch");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7844)).mo56389s("No activity found to handle: %s", intent);
        }
    }

    /* renamed from: d */
    private static void m137928d(Intent intent, Intent intent2, String str) {
        if (intent2.hasExtra(str)) {
            String stringExtra = intent2.getStringExtra(str);
            if (!TextUtils.isEmpty(stringExtra)) {
                intent.putExtra(str, stringExtra);
            }
        }
    }

    /* renamed from: e */
    private final boolean m137929e(PendingIntent pendingIntent, Intent intent) {
        try {
            pendingIntent.send(this, -1, intent);
            return true;
        } catch (PendingIntent.CanceledException unused) {
            C59104x b = f232106k.mo56224b();
            b.mo56378ag(C58975e.f156826a, "QSB.GoogleSearch");
            ((C59052c) ((C59052c) b).mo56372aa(7847)).mo56389s("Pending intent cancelled: %s", pendingIntent);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b2, code lost:
        if (r6.checkPermission("android.permission.ACCESS_FINE_LOCATION", r9) != 0) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r26) {
        /*
            r25 = this;
            r1 = r25
            super.onCreate(r26)
            android.content.Intent r0 = r25.getIntent()
            com.google.common.f.e r2 = f232106k
            com.google.common.f.x r3 = r2.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "QSB.GoogleSearch"
            r3.mo56378ag(r4, r5)
            r4 = 0
            java.lang.String r6 = r0.toUri(r4)
            r7 = 7845(0x1ea5, float:1.0993E-41)
            java.lang.String r8 = "Got intent: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r7)).mo56389s(r8, r6)
            java.lang.String r3 = r0.getAction()
            java.lang.String r6 = "android.intent.action.WEB_SEARCH"
            boolean r6 = r6.equals(r3)
            java.lang.String r7 = "android.intent.action.VIEW"
            r8 = 0
            if (r6 != 0) goto L_0x008e
            java.lang.String r6 = "android.intent.action.SEARCH"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x003a
            goto L_0x008e
        L_0x003a:
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x007c
            android.net.Uri r3 = r0.getData()
            if (r3 != 0) goto L_0x0058
            com.google.common.f.x r0 = r2.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r5)
            java.lang.String r2 = "Got ACTION_VIEW with no data."
            r3 = 7842(0x1ea2, float:1.0989E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x030d
        L_0x0058:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            r2.setComponent(r8)
            int r0 = r2.getFlags()
            r0 = r0 & -2
            r2.setFlags(r0)
            int r0 = r2.getFlags()
            r0 = r0 & -3
            r2.setFlags(r0)
            java.lang.String r0 = "intent_extra_data_key"
            r2.putExtra(r0, r8)
            r1.m137927b(r2)
            goto L_0x030d
        L_0x007c:
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r5)
            java.lang.String r3 = "Unhandled intent: %s"
            r4 = 7846(0x1ea6, float:1.0995E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56389s(r3, r0)
            goto L_0x030d
        L_0x008e:
            java.lang.String r3 = "web_search_pendingintent"
            android.os.Parcelable r3 = r0.getParcelableExtra(r3)
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            android.content.pm.PackageManager r6 = r25.getPackageManager()
            r6.getClass()
            if (r3 != 0) goto L_0x00a0
            goto L_0x00b5
        L_0x00a0:
            java.lang.String r9 = r3.getTargetPackage()
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            r11 = 6
            if (r10 == 0) goto L_0x00ac
            goto L_0x00c1
        L_0x00ac:
            java.lang.String r10 = "android.permission.ACCESS_FINE_LOCATION"
            int r6 = r6.checkPermission(r10, r9)
            if (r6 == 0) goto L_0x00b5
            goto L_0x00c1
        L_0x00b5:
            dagger.a r6 = r1.f232109c
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.search.core.google.bd r6 = (com.google.android.apps.gsa.search.core.google.C85881bd) r6
            int r11 = r6.mo79517h(r4)
        L_0x00c1:
            r6 = 1
            if (r11 != r6) goto L_0x00f5
            com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.m148680c()
            dagger.a r9 = r1.f232108b     // Catch:{ all -> 0x00f3 }
            java.lang.Object r9 = r9.mo27525b()     // Catch:{ all -> 0x00f3 }
            com.google.android.apps.gsa.location.ae r9 = (com.google.android.apps.gsa.location.C74637ae) r9     // Catch:{ all -> 0x00f3 }
            com.google.android.libraries.search.m.b.b r10 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_CLASSIC_SEARCH_LO     // Catch:{ all -> 0x00f3 }
            com.google.android.libraries.search.location.y r10 = com.google.android.libraries.search.location.C38726z.m68011d(r10)     // Catch:{ all -> 0x00f3 }
            r11 = 1
            j$.time.Duration r11 = p3186j$.time.Duration.ofDays(r11)     // Catch:{ all -> 0x00f3 }
            r10.mo41493b(r11)     // Catch:{ all -> 0x00f3 }
            com.google.android.libraries.search.location.z r10 = r10.mo41492a()     // Catch:{ all -> 0x00f3 }
            com.google.common.util.concurrent.cx r9 = r9.mo71020c(r10)     // Catch:{ all -> 0x00f3 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00f3 }
            com.google.android.apps.gsa.shared.util.p7159c.C90933cc.m148547b(r9, r10)     // Catch:{ all -> 0x00f3 }
            java.lang.Object r9 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148475i(r9, r8)     // Catch:{ all -> 0x00f3 }
            android.location.Location r9 = (android.location.Location) r9     // Catch:{ all -> 0x00f3 }
            r11 = 1
            goto L_0x00f6
        L_0x00f3:
            r0 = move-exception
            throw r0
        L_0x00f5:
            r9 = r8
        L_0x00f6:
            com.google.android.libraries.f.a r10 = r1.f232107a
            dagger.a r12 = r1.f232110d
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.google.cb r12 = (com.google.android.apps.gsa.search.core.google.C85908cb) r12
            dagger.a r13 = r1.f232111e
            java.lang.Object r13 = r13.mo27525b()
            com.google.android.apps.gsa.search.core.google.cw r13 = (com.google.android.apps.gsa.search.core.google.C85929cw) r13
            dagger.a r14 = r1.f232112f
            java.lang.Object r14 = r14.mo27525b()
            com.google.android.apps.gsa.search.core.google.at r14 = (com.google.android.apps.gsa.search.core.google.C85862at) r14
            dagger.a r15 = r1.f232113g
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.search.core.google.by r15 = (com.google.android.apps.gsa.search.core.google.C85902by) r15
            dagger.a r8 = r1.f232114h
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.google.al r8 = (com.google.android.apps.gsa.search.core.google.C85854al) r8
            dagger.a r6 = r1.f232115i
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.search.core.google.dl r6 = (com.google.android.apps.gsa.search.core.google.C85966dl) r6
            java.lang.String r4 = "query"
            java.lang.String r1 = r0.getStringExtra(r4)
            boolean r16 = android.text.TextUtils.isEmpty(r1)
            r17 = r4
            java.lang.String r4 = "ved"
            if (r16 == 0) goto L_0x014f
            com.google.common.f.x r1 = r2.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r5)
            java.lang.String r2 = "Got search intent with no query."
            r6 = 7840(0x1ea0, float:1.0986E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r6)).mo56386p(r2)
            r16 = r3
            r18 = r5
            r2 = 0
            goto L_0x0227
        L_0x014f:
            java.lang.String r2 = "com.android.browser.application_id"
            java.lang.String r16 = r0.getStringExtra(r2)
            if (r16 != 0) goto L_0x015b
            java.lang.String r16 = r25.getPackageName()
        L_0x015b:
            r18 = r5
            r5 = r16
            r16 = r3
            java.lang.String r3 = "new_search"
            r19 = r2
            r2 = 0
            boolean r3 = r0.getBooleanExtra(r3, r2)
            java.lang.String r2 = "query_submit_ts"
            r21 = r5
            r20 = r6
            long r5 = r10.mo26870b()
            long r5 = r0.getLongExtra(r2, r5)
            java.lang.String r2 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r0)
            if (r2 != 0) goto L_0x0180
            java.lang.String r2 = "unknown"
        L_0x0180:
            com.google.android.apps.gsa.search.core.google.f.c r10 = new com.google.android.apps.gsa.search.core.google.f.c
            r10.<init>()
            r22 = r3
            dagger.a r3 = r13.f232341q
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.google.dn r3 = (com.google.android.apps.gsa.search.core.google.C85968dn) r3
            r23 = r7
            com.google.android.apps.gsa.search.core.i.t r7 = r13.f232330f
            r24 = r13
            com.google.android.apps.gsa.shared.m.h r13 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250790aC
            java.lang.String r7 = r7.mo79758x(r13)
            r3.mo79435c(r10, r7)
            r15.mo79531h(r10)
            java.lang.String r3 = "hl"
            java.lang.String r7 = r8.mo79488a()
            r10.mo79638d(r3, r7)
            java.lang.String r3 = "client"
            java.lang.String r7 = r12.mo79534a()
            r10.mo79638d(r3, r7)
            java.lang.String r3 = "q"
            r10.mo79638d(r3, r1)
            com.google.android.apps.gsa.search.core.google.C85908cb.m138047c(r10, r5)
            com.google.android.apps.gsa.search.core.google.p6796f.C85982d.m138242a(r10, r2)
            java.lang.String r1 = r0.getStringExtra(r4)
            if (r1 == 0) goto L_0x01c7
            r10.mo79638d(r4, r1)
        L_0x01c7:
            r1 = 1
            if (r11 != r1) goto L_0x01e0
            com.google.android.apps.gsa.search.core.google.du r1 = new com.google.android.apps.gsa.search.core.google.du
            r1.<init>()
            r1.f232481a = r9
            java.lang.String r1 = r1.mo79631a()
            if (r1 == 0) goto L_0x01e3
            if (r9 == 0) goto L_0x01db
            r2 = 1
            goto L_0x01dc
        L_0x01db:
            r2 = 0
        L_0x01dc:
            r14.mo79494c(r10, r1, r2)
            goto L_0x01e3
        L_0x01e0:
            r14.mo79497g(r10, r11)
        L_0x01e3:
            r13 = r24
            com.google.android.apps.gsa.search.core.google.dk r1 = r13.mo79566f(r10)
            r6 = r20
            com.google.android.apps.gsa.search.shared.api.UriRequest r1 = r1.mo79626b(r6)
            android.content.Intent r2 = new android.content.Intent
            android.net.Uri r3 = r1.f236331a
            java.lang.String r3 = r3.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r5 = r23
            r2.<init>(r5, r3)
            r5 = r19
            r3 = r21
            r2.putExtra(r5, r3)
            if (r22 == 0) goto L_0x0210
            java.lang.String r3 = "create_new_tab"
            r5 = 1
            r2.putExtra(r3, r5)
            goto L_0x0211
        L_0x0210:
            r5 = 1
        L_0x0211:
            if (r11 != r5) goto L_0x0222
            if (r9 == 0) goto L_0x0222
            com.google.common.b.hd r1 = r1.mo81502a()
            android.os.Bundle r1 = com.google.android.apps.gsa.shared.util.C90772bp.m148300h(r1)
            java.lang.String r3 = "com.android.browser.headers"
            r2.putExtra(r3, r1)
        L_0x0222:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r1)
        L_0x0227:
            r1 = r25
            if (r16 == 0) goto L_0x0233
            r3 = r16
            boolean r2 = r1.m137929e(r3, r2)
            if (r2 != 0) goto L_0x030d
        L_0x0233:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "com.google.android.googlequicksearchbox.GOOGLE_SEARCH"
            r2.<init>(r3)
            r5 = r17
            java.lang.String r6 = r0.getStringExtra(r5)
            com.google.android.libraries.search.h.a.h r7 = com.google.android.libraries.search.p3003h.p3004a.C38404h.f101652g
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.search.h.a.f r7 = (com.google.android.libraries.search.p3003h.p3004a.C38402f) r7
            java.lang.String r8 = "search-stick"
            java.lang.String r9 = "query-header-visibility"
            if (r6 == 0) goto L_0x0290
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.android.libraries.search.h.a.h r10 = (com.google.android.libraries.search.p3003h.p3004a.C38404h) r10
            int r11 = r10.f101654a
            r12 = 1
            r11 = r11 | r12
            r10.f101654a = r11
            r10.f101655b = r6
            java.lang.String r6 = r0.getStringExtra(r8)
            java.lang.String r10 = r0.getStringExtra(r4)
            r11 = 0
            int r11 = r0.getIntExtra(r9, r11)
            if (r6 == 0) goto L_0x0271
            java.lang.String r12 = "stick"
            r7.mo41412a(r12, r6)
        L_0x0271:
            if (r10 == 0) goto L_0x0276
            r7.mo41412a(r4, r10)
        L_0x0276:
            int r6 = com.google.android.libraries.search.p3003h.p3004a.C38399c.m67672a(r11)
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.android.libraries.search.h.a.h r10 = (com.google.android.libraries.search.p3003h.p3004a.C38404h) r10
            int r11 = r6 + -1
            if (r6 == 0) goto L_0x028e
            r10.f101658e = r11
            int r6 = r10.f101654a
            r6 = r6 | 4
            r10.f101654a = r6
            goto L_0x0290
        L_0x028e:
            r6 = 0
            throw r6
        L_0x0290:
            com.google.android.libraries.search.h.a.d r6 = r1.f232116j
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.libraries.search.h.a.h r7 = (com.google.android.libraries.search.p3003h.p3004a.C38404h) r7
            android.content.Intent r2 = r6.mo41411a(r2, r7)
            java.lang.String r6 = "web-search-intent"
            java.lang.String r7 = "source"
            if (r2 == 0) goto L_0x02af
            java.lang.String r10 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r0)
            java.lang.Object r10 = com.google.common.base.C58831av.m90830c(r10, r6)
            java.lang.String r10 = (java.lang.String) r10
            r2.putExtra(r7, r10)
        L_0x02af:
            if (r2 != 0) goto L_0x030a
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r3)
            java.lang.String r3 = r0.getStringExtra(r5)
            r2.putExtra(r5, r3)
            java.lang.String r3 = "com.google.android.googlequicksearchbox"
            r2.setPackage(r3)
            java.lang.String r3 = "search_immersive_base_page"
            m137928d(r2, r0, r3)
            java.lang.String r3 = "search-miniapp-landing-page"
            m137928d(r2, r0, r3)
            m137928d(r2, r0, r8)
            m137928d(r2, r0, r4)
            java.lang.String r3 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r0)
            java.lang.Object r3 = com.google.common.base.C58831av.m90830c(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            r2.putExtra(r7, r3)
            boolean r3 = r0.hasExtra(r9)
            if (r3 == 0) goto L_0x030a
            java.lang.String r0 = r0.getStringExtra(r9)     // Catch:{ NumberFormatException -> 0x02f3 }
            if (r0 == 0) goto L_0x030a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x02f3 }
            r2.putExtra(r9, r0)     // Catch:{ NumberFormatException -> 0x02f3 }
            goto L_0x030a
        L_0x02f3:
            r0 = move-exception
            com.google.common.f.e r3 = f232106k
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5 = r18
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "header-visibility extra has an invalid value, should be a number."
            r5 = 7841(0x1ea1, float:1.0988E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x030a:
            r1.m137927b(r2)
        L_0x030d:
            r25.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.C85843ab.onCreate(android.os.Bundle):void");
    }
}

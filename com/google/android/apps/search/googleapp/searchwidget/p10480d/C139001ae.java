package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import android.content.Context;
import android.widget.RemoteViews;
import com.bumptech.glide.p282c.p283a.C5528f;
import com.google.android.apps.search.googleapp.searchwidget.C138923a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.ae */
/* compiled from: PG */
public final class C139001ae {

    /* renamed from: a */
    public static final C59071e f378015a = C59071e.m91332i("com.google.android.apps.search.googleapp.searchwidget.d.ae");

    /* renamed from: b */
    public final Context f378016b;

    /* renamed from: c */
    public final C60888db f378017c;

    /* renamed from: d */
    public final C42876ab f378018d;

    /* renamed from: e */
    public final C42876ab f378019e;

    /* renamed from: f */
    public final C42876ab f378020f;

    /* renamed from: g */
    private final Optional f378021g;

    /* renamed from: h */
    private final C47449e f378022h;

    public C139001ae(Context context, C60888db dbVar, C42876ab abVar, C42876ab abVar2, C42876ab abVar3, Optional optional, C47449e eVar) {
        this.f378016b = context;
        this.f378017c = dbVar;
        this.f378018d = abVar;
        this.f378019e = abVar2;
        this.f378020f = abVar3;
        this.f378021g = optional;
        this.f378022h = eVar;
    }

    /* renamed from: d */
    private final C60870cx m225800d(RemoteViews remoteViews, C139006f fVar, C139010j jVar, boolean z) {
        C60870cx b = C5528f.m14300b(C5528f.m14299a(this.f378022h.mo51286a().mo11864b().mo12448j(jVar.f378056c)));
        C139026z zVar = new C139026z(this, fVar, remoteViews, z);
        return C60922j.m93044g(b, C47810es.m84963c(zVar), this.f378017c);
    }

    /* renamed from: e */
    private final void m225801e() {
        if (this.f378021g.isPresent()) {
            ((C138923a) this.f378021g.get()).mo114635a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fc A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.PendingIntent mo114652a(java.lang.String r6, com.google.android.apps.search.googleapp.searchwidget.p10480d.C139002b r7, int r8) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            android.content.Context r3 = r5.f378016b     // Catch:{ NameNotFoundException -> 0x00cd }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00cd }
            r3.getPackageInfo(r6, r0)     // Catch:{ NameNotFoundException -> 0x00cd }
            int r0 = r7.f378025a
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00bd
            com.google.android.apps.search.googleapp.searchwidget.d.d r0 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139004d.UNKNOWN
            int r0 = r7.f378026b
            com.google.android.apps.search.googleapp.searchwidget.d.d r0 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139004d.m225805a(r0)
            if (r0 != 0) goto L_0x001d
            com.google.android.apps.search.googleapp.searchwidget.d.d r0 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139004d.UNKNOWN
        L_0x001d:
            int r0 = r0.ordinal()
            r3 = 2
            java.lang.String r4 = "Intent definition of type %s missing required fields."
            if (r0 == r1) goto L_0x0090
            if (r0 == r3) goto L_0x0060
            r1 = 3
            if (r0 == r1) goto L_0x003b
            com.google.common.f.e r6 = f378015a
            com.google.common.f.x r6 = r6.mo56226d()
            java.lang.String r7 = "Intent definition specified with invalid build type."
            r0 = 41343(0xa17f, float:5.7934E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r0)).mo56386p(r7)
            goto L_0x00cb
        L_0x003b:
            int r0 = r7.f378025a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x004d
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r7 = r7.f378029e
            r0.<init>(r7)
            r0.setPackage(r6)
            goto L_0x00f1
        L_0x004d:
            com.google.common.f.e r6 = f378015a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.android.apps.search.googleapp.searchwidget.d.d r7 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139004d.ACTION_BASED
            java.lang.String r7 = r7.name()
            r0 = 41346(0xa182, float:5.7938E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r0)).mo56389s(r4, r7)
            goto L_0x00cb
        L_0x0060:
            int r0 = r7.f378025a
            r1 = r0 & 8
            if (r1 == 0) goto L_0x007d
            r0 = r0 & 4
            if (r0 == 0) goto L_0x007d
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = r7.f378029e
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r7 = r7.f378028d
            r1.<init>(r6, r7)
            r0.setComponent(r1)
            goto L_0x00f1
        L_0x007d:
            com.google.common.f.e r6 = f378015a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.android.apps.search.googleapp.searchwidget.d.d r7 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139004d.CLASS_BASED
            java.lang.String r7 = r7.name()
            r0 = 41345(0xa181, float:5.7937E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r0)).mo56389s(r4, r7)
            goto L_0x00cb
        L_0x0090:
            int r0 = r7.f378025a
            r1 = r0 & 8
            if (r1 == 0) goto L_0x00aa
            r0 = r0 & r3
            if (r0 == 0) goto L_0x00aa
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = r7.f378029e
            java.lang.String r7 = r7.f378027c
            android.net.Uri r7 = android.net.Uri.parse(r7)
            r0.<init>(r1, r7)
            r0.setPackage(r6)
            goto L_0x00f1
        L_0x00aa:
            com.google.common.f.e r6 = f378015a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.android.apps.search.googleapp.searchwidget.d.d r7 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139004d.URI_BASED
            java.lang.String r7 = r7.name()
            r0 = 41344(0xa180, float:5.7935E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r0)).mo56389s(r4, r7)
            goto L_0x00cb
        L_0x00bd:
            com.google.common.f.e r6 = f378015a
            com.google.common.f.x r6 = r6.mo56226d()
            java.lang.String r7 = "Intent definition type not specified."
            r0 = 41347(0xa183, float:5.794E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r0)).mo56386p(r7)
        L_0x00cb:
            r0 = r2
            goto L_0x00f1
        L_0x00cd:
            com.google.common.f.e r7 = f378015a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r3 = "App not installed for provided package %s"
            r4 = 41352(0xa188, float:5.7946E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r4)).mo56389s(r3, r6)
            android.content.Intent r7 = new android.content.Intent
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            java.lang.String r6 = "https://play.google.com/store/apps/details?id=%s"
            java.lang.String r6 = java.lang.String.format(r6, r1)
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.lang.String r0 = "android.intent.action.VIEW"
            r7.<init>(r0, r6)
            r0 = r7
        L_0x00f1:
            if (r0 == 0) goto L_0x00fc
            android.content.Context r6 = r5.f378016b
            r7 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r6 = android.app.PendingIntent.getActivity(r6, r8, r0, r7)
            return r6
        L_0x00fc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.searchwidget.p10480d.C139001ae.mo114652a(java.lang.String, com.google.android.apps.search.googleapp.searchwidget.d.b, int):android.app.PendingIntent");
    }

    /* renamed from: c */
    public final C60870cx mo114654c(String str, C139006f fVar, C139010j jVar) {
        RemoteViews remoteViews = new RemoteViews(str, R.layout.googleapp_third_party_widget_small);
        m225801e();
        return m225800d(remoteViews, fVar, jVar, true);
    }

    /* renamed from: b */
    public final C60870cx mo114653b(String str, C139006f fVar, C139010j jVar, C139012l lVar) {
        if ((lVar.f378059a & 2) != 0) {
            RemoteViews remoteViews = new RemoteViews(str, R.layout.googleapp_third_party_widget_with_voice_search);
            m225801e();
            C60870cx d = m225800d(remoteViews, fVar, jVar, false);
            C60870cx b = C5528f.m14300b(C5528f.m14299a(this.f378022h.mo51286a().mo11864b().mo12448j(lVar.f378061c)));
            C138997aa aaVar = new C138997aa(this, fVar, remoteViews);
            C60870cx g = C60922j.m93044g(b, C47810es.m84963c(aaVar), this.f378017c);
            return C47638k.m84751b(d, g).mo51520a(new C139000ad(d, g, remoteViews), this.f378017c);
        }
        RemoteViews remoteViews2 = new RemoteViews(str, R.layout.googleapp_third_party_widget_text_search_only);
        m225801e();
        return m225800d(remoteViews2, fVar, jVar, false);
    }
}

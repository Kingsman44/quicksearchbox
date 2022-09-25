package com.google.android.apps.gsa.staticplugins.searchwidget.p8757d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139002b;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139006f;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139008h;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139010j;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139012l;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.d.j */
/* compiled from: PG */
public final class C117273j {

    /* renamed from: a */
    public static final C59071e f325539a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchwidget.d.j");

    /* renamed from: b */
    public final Context f325540b;

    /* renamed from: c */
    public final C68214a f325541c;

    /* renamed from: d */
    public final C42876ab f325542d;

    /* renamed from: e */
    public final C42876ab f325543e;

    /* renamed from: f */
    public final C42876ab f325544f;

    /* renamed from: g */
    public C139006f f325545g;

    /* renamed from: h */
    public C139010j f325546h;

    /* renamed from: i */
    public C139012l f325547i;

    /* renamed from: j */
    private final PackageManager f325548j;

    public C117273j(Context context, C68214a aVar, C42876ab abVar, C42876ab abVar2, C42876ab abVar3) {
        this.f325540b = context;
        this.f325548j = context.getPackageManager();
        this.f325541c = aVar;
        this.f325542d = abVar;
        this.f325543e = abVar2;
        this.f325544f = abVar3;
    }

    /* renamed from: b */
    static Bitmap m194889b(C63088z zVar) {
        if (zVar == null || zVar.mo59173M()) {
            return null;
        }
        byte[] N = zVar.mo59174N();
        return BitmapFactory.decodeByteArray(N, 0, N.length);
    }

    /* renamed from: d */
    private final PendingIntent m194890d() {
        C139006f fVar = this.f325545g;
        if (fVar != null) {
            int i = fVar.f378039a;
            if (!((i & 1) == 0 || (i & 2) == 0)) {
                C139008h hVar = fVar.f378041c;
                if (hVar == null) {
                    hVar = C139008h.f378043h;
                }
                if ((hVar.f378045a & 32) != 0) {
                    String str = fVar.f378040b;
                    C139008h hVar2 = fVar.f378041c;
                    if (hVar2 == null) {
                        hVar2 = C139008h.f378043h;
                    }
                    C139002b bVar = hVar2.f378051g;
                    if (bVar == null) {
                        bVar = C139002b.f378023f;
                    }
                    return mo103225a(str, bVar, 200);
                }
            }
        }
        C59104x d = f325539a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SelectableWidgetRndr");
        ((C59052c) ((C59052c) d).mo56372aa(32802)).mo56386p("missing data to build text search pending intent");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0113 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.PendingIntent mo103225a(java.lang.String r7, com.google.android.apps.search.googleapp.searchwidget.p10480d.C139002b r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "SelectableWidgetRndr"
            r1 = 0
            android.content.pm.PackageManager r2 = r6.f325548j     // Catch:{ NameNotFoundException -> 0x00f1 }
            r3 = 0
            r2.getPackageInfo(r7, r3)     // Catch:{ NameNotFoundException -> 0x00f1 }
            int r2 = r8.f378025a
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L_0x00dc
            com.google.android.apps.search.googleapp.searchwidget.d.d r2 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139004d.UNKNOWN
            int r2 = r8.f378026b
            com.google.android.apps.search.googleapp.searchwidget.d.d r2 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139004d.m225805a(r2)
            if (r2 != 0) goto L_0x001b
            com.google.android.apps.search.googleapp.searchwidget.d.d r2 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139004d.UNKNOWN
        L_0x001b:
            int r2 = r2.ordinal()
            r4 = 2
            java.lang.String r5 = "Intent definition of type %s missing required fields."
            if (r2 == r3) goto L_0x00a6
            if (r2 == r4) goto L_0x006d
            r3 = 3
            if (r2 == r3) goto L_0x003e
            com.google.common.f.e r7 = f325539a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r0)
            java.lang.String r8 = "Intent definition specified with invalid build type."
            r0 = 32804(0x8024, float:4.5968E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r0)).mo56386p(r8)
            goto L_0x00ef
        L_0x003e:
            int r2 = r8.f378025a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x0050
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r8 = r8.f378029e
            r0.<init>(r8)
            r0.setPackage(r7)
            goto L_0x0108
        L_0x0050:
            com.google.common.f.e r7 = f325539a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r0)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            r8 = 32807(0x8027, float:4.5972E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.android.apps.search.googleapp.searchwidget.d.d r8 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139004d.ACTION_BASED
            r7.mo56389s(r5, r8)
            goto L_0x00ef
        L_0x006d:
            int r2 = r8.f378025a
            r3 = r2 & 8
            if (r3 == 0) goto L_0x008a
            r2 = r2 & 4
            if (r2 == 0) goto L_0x008a
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = r8.f378029e
            r0.<init>(r2)
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r8 = r8.f378028d
            r2.<init>(r7, r8)
            r0.setComponent(r2)
            goto L_0x0108
        L_0x008a:
            com.google.common.f.e r7 = f325539a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r0)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            r8 = 32806(0x8026, float:4.5971E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.android.apps.search.googleapp.searchwidget.d.d r8 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139004d.CLASS_BASED
            r7.mo56389s(r5, r8)
            goto L_0x00ef
        L_0x00a6:
            int r2 = r8.f378025a
            r3 = r2 & 8
            if (r3 == 0) goto L_0x00c0
            r2 = r2 & r4
            if (r2 == 0) goto L_0x00c0
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = r8.f378029e
            java.lang.String r8 = r8.f378027c
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r0.<init>(r2, r8)
            r0.setPackage(r7)
            goto L_0x0108
        L_0x00c0:
            com.google.common.f.e r7 = f325539a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r0)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            r8 = 32805(0x8025, float:4.597E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.android.apps.search.googleapp.searchwidget.d.d r8 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139004d.URI_BASED
            r7.mo56389s(r5, r8)
            goto L_0x00ef
        L_0x00dc:
            com.google.common.f.e r7 = f325539a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r0)
            java.lang.String r8 = "Intent definition type not specified."
            r0 = 32808(0x8028, float:4.5974E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r0)).mo56386p(r8)
        L_0x00ef:
            r0 = r1
            goto L_0x0108
        L_0x00f1:
            com.google.common.f.e r8 = f325539a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r2, r0)
            java.lang.String r0 = "App not installed for provided package %s"
            r2 = 32814(0x802e, float:4.5982E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r2)).mo56389s(r0, r7)
            android.content.Intent r0 = com.google.android.apps.gsa.shared.p6995aq.C89257aa.m145191c(r7)
        L_0x0108:
            if (r0 == 0) goto L_0x0113
            android.content.Context r7 = r6.f325540b
            r8 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r7 = android.app.PendingIntent.getActivity(r7, r9, r0, r8)
            return r7
        L_0x0113:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchwidget.p8757d.C117273j.mo103225a(java.lang.String, com.google.android.apps.search.googleapp.searchwidget.d.b, int):android.app.PendingIntent");
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c0 A[Catch:{ IllegalStateException -> 0x0124 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d3 A[Catch:{ IllegalStateException -> 0x0124 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00eb A[Catch:{ IllegalStateException -> 0x0124 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f3 A[Catch:{ IllegalStateException -> 0x0124 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.RemoteViews mo103226c(boolean r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0011
            android.widget.RemoteViews r0 = new android.widget.RemoteViews
            android.content.Context r1 = r8.f325540b
            java.lang.String r1 = r1.getPackageName()
            r2 = 2131626802(0x7f0e0b32, float:1.888085E38)
            r0.<init>(r1, r2)
            goto L_0x001f
        L_0x0011:
            android.widget.RemoteViews r0 = new android.widget.RemoteViews
            android.content.Context r1 = r8.f325540b
            java.lang.String r1 = r1.getPackageName()
            r2 = 2131626801(0x7f0e0b31, float:1.8880848E38)
            r0.<init>(r1, r2)
        L_0x001f:
            com.google.android.apps.search.googleapp.searchwidget.d.f r1 = r8.f325545g
            java.lang.String r2 = "SelectableWidgetRndr"
            if (r1 == 0) goto L_0x0139
            r3 = 0
            com.google.android.apps.search.googleapp.searchwidget.d.j r4 = r8.f325546h     // Catch:{ IllegalStateException -> 0x0124 }
            if (r4 == 0) goto L_0x011c
            int r1 = r1.f378039a     // Catch:{ IllegalStateException -> 0x0124 }
            r1 = r1 & 2
            if (r1 == 0) goto L_0x011c
            int r1 = r4.f378054a     // Catch:{ IllegalStateException -> 0x0124 }
            r1 = r1 & 1
            if (r1 == 0) goto L_0x011c
            com.google.protobuf.z r1 = r4.f378055b     // Catch:{ IllegalStateException -> 0x0124 }
            android.graphics.Bitmap r1 = m194889b(r1)     // Catch:{ IllegalStateException -> 0x0124 }
            if (r1 == 0) goto L_0x0114
            android.app.PendingIntent r4 = r8.m194890d()     // Catch:{ IllegalStateException -> 0x0124 }
            if (r4 == 0) goto L_0x010c
            r5 = 2131435702(0x7f0b20b6, float:1.8493254E38)
            r0.setImageViewBitmap(r5, r1)     // Catch:{ IllegalStateException -> 0x0124 }
            r0.setOnClickPendingIntent(r5, r4)     // Catch:{ IllegalStateException -> 0x0124 }
            r1 = 0
            r0.setViewVisibility(r5, r1)     // Catch:{ IllegalStateException -> 0x0124 }
            if (r9 != 0) goto L_0x010b
            com.google.android.apps.search.googleapp.searchwidget.d.f r9 = r8.f325545g     // Catch:{ IllegalStateException -> 0x0124 }
            r4 = 2131435703(0x7f0b20b7, float:1.8493256E38)
            if (r9 == 0) goto L_0x0067
            int r5 = r9.f378039a     // Catch:{ IllegalStateException -> 0x0124 }
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            r9 = 8
            r0.setViewVisibility(r4, r9)     // Catch:{ IllegalStateException -> 0x0124 }
            goto L_0x00c9
        L_0x0067:
            if (r9 == 0) goto L_0x0103
            com.google.android.apps.search.googleapp.searchwidget.d.l r9 = r8.f325547i     // Catch:{ IllegalStateException -> 0x0124 }
            if (r9 == 0) goto L_0x0103
            int r5 = r9.f378059a     // Catch:{ IllegalStateException -> 0x0124 }
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0103
            com.google.protobuf.z r9 = r9.f378060b     // Catch:{ IllegalStateException -> 0x0124 }
            android.graphics.Bitmap r9 = m194889b(r9)     // Catch:{ IllegalStateException -> 0x0124 }
            if (r9 == 0) goto L_0x00fb
            com.google.android.apps.search.googleapp.searchwidget.d.f r5 = r8.f325545g     // Catch:{ IllegalStateException -> 0x0124 }
            if (r5 == 0) goto L_0x00aa
            int r6 = r5.f378039a     // Catch:{ IllegalStateException -> 0x0124 }
            r7 = r6 & 1
            if (r7 == 0) goto L_0x00aa
            r6 = r6 & 4
            if (r6 == 0) goto L_0x00aa
            com.google.android.apps.search.googleapp.searchwidget.d.h r6 = r5.f378042d     // Catch:{ IllegalStateException -> 0x0124 }
            if (r6 != 0) goto L_0x008f
            com.google.android.apps.search.googleapp.searchwidget.d.h r6 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139008h.f378043h     // Catch:{ IllegalStateException -> 0x0124 }
        L_0x008f:
            int r6 = r6.f378045a     // Catch:{ IllegalStateException -> 0x0124 }
            r6 = r6 & 32
            if (r6 == 0) goto L_0x00aa
            java.lang.String r6 = r5.f378040b     // Catch:{ IllegalStateException -> 0x0124 }
            com.google.android.apps.search.googleapp.searchwidget.d.h r5 = r5.f378042d     // Catch:{ IllegalStateException -> 0x0124 }
            if (r5 != 0) goto L_0x009d
            com.google.android.apps.search.googleapp.searchwidget.d.h r5 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139008h.f378043h     // Catch:{ IllegalStateException -> 0x0124 }
        L_0x009d:
            com.google.android.apps.search.googleapp.searchwidget.d.b r5 = r5.f378051g     // Catch:{ IllegalStateException -> 0x0124 }
            if (r5 != 0) goto L_0x00a3
            com.google.android.apps.search.googleapp.searchwidget.d.b r5 = com.google.android.apps.search.googleapp.searchwidget.p10480d.C139002b.f378023f     // Catch:{ IllegalStateException -> 0x0124 }
        L_0x00a3:
            r7 = 201(0xc9, float:2.82E-43)
            android.app.PendingIntent r5 = r8.mo103225a(r6, r5, r7)     // Catch:{ IllegalStateException -> 0x0124 }
            goto L_0x00be
        L_0x00aa:
            com.google.common.f.e r5 = f325539a     // Catch:{ IllegalStateException -> 0x0124 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ IllegalStateException -> 0x0124 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IllegalStateException -> 0x0124 }
            r5.mo56378ag(r6, r2)     // Catch:{ IllegalStateException -> 0x0124 }
            java.lang.String r6 = "missing data to build voice search pending intent"
            r7 = 32803(0x8023, float:4.5967E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)     // Catch:{ IllegalStateException -> 0x0124 }
            r5 = r3
        L_0x00be:
            if (r5 == 0) goto L_0x00f3
            r0.setImageViewBitmap(r4, r9)     // Catch:{ IllegalStateException -> 0x0124 }
            r0.setOnClickPendingIntent(r4, r5)     // Catch:{ IllegalStateException -> 0x0124 }
            r0.setViewVisibility(r4, r1)     // Catch:{ IllegalStateException -> 0x0124 }
        L_0x00c9:
            com.google.android.apps.search.googleapp.searchwidget.d.f r9 = r8.f325545g     // Catch:{ IllegalStateException -> 0x0124 }
            if (r9 == 0) goto L_0x00eb
            int r9 = r9.f378039a     // Catch:{ IllegalStateException -> 0x0124 }
            r9 = r9 & 2
            if (r9 == 0) goto L_0x00eb
            android.app.PendingIntent r9 = r8.m194890d()     // Catch:{ IllegalStateException -> 0x0124 }
            if (r9 == 0) goto L_0x00e3
            r4 = 2131435701(0x7f0b20b5, float:1.8493252E38)
            r0.setOnClickPendingIntent(r4, r9)     // Catch:{ IllegalStateException -> 0x0124 }
            r0.setViewVisibility(r4, r1)     // Catch:{ IllegalStateException -> 0x0124 }
            goto L_0x010b
        L_0x00e3:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0124 }
            java.lang.String r0 = "Cannot build hint text view as pending intent is empty"
            r9.<init>(r0)     // Catch:{ IllegalStateException -> 0x0124 }
            throw r9     // Catch:{ IllegalStateException -> 0x0124 }
        L_0x00eb:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0124 }
            java.lang.String r0 = "Cannot build hint text view as search intent data is missing"
            r9.<init>(r0)     // Catch:{ IllegalStateException -> 0x0124 }
            throw r9     // Catch:{ IllegalStateException -> 0x0124 }
        L_0x00f3:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0124 }
            java.lang.String r0 = "Cannot build voice search icon as pending intent is empty"
            r9.<init>(r0)     // Catch:{ IllegalStateException -> 0x0124 }
            throw r9     // Catch:{ IllegalStateException -> 0x0124 }
        L_0x00fb:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0124 }
            java.lang.String r0 = "Cannot build voice search icon as image data is empty"
            r9.<init>(r0)     // Catch:{ IllegalStateException -> 0x0124 }
            throw r9     // Catch:{ IllegalStateException -> 0x0124 }
        L_0x0103:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0124 }
            java.lang.String r0 = "Cannot build voice search icon as icon image data is missing"
            r9.<init>(r0)     // Catch:{ IllegalStateException -> 0x0124 }
            throw r9     // Catch:{ IllegalStateException -> 0x0124 }
        L_0x010b:
            return r0
        L_0x010c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0124 }
            java.lang.String r0 = "Cannot build logo icon as pending intent is empty"
            r9.<init>(r0)     // Catch:{ IllegalStateException -> 0x0124 }
            throw r9     // Catch:{ IllegalStateException -> 0x0124 }
        L_0x0114:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0124 }
            java.lang.String r0 = "Cannot build logo icon as image data is empty"
            r9.<init>(r0)     // Catch:{ IllegalStateException -> 0x0124 }
            throw r9     // Catch:{ IllegalStateException -> 0x0124 }
        L_0x011c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0124 }
            java.lang.String r0 = "Cannot build logo icon as icon image data is missing"
            r9.<init>(r0)     // Catch:{ IllegalStateException -> 0x0124 }
            throw r9     // Catch:{ IllegalStateException -> 0x0124 }
        L_0x0124:
            r9 = move-exception
            com.google.common.f.e r0 = f325539a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Failed to render selectable search widget."
            r2 = 32809(0x8029, float:4.5975E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r9)).mo56372aa(r2)).mo56386p(r1)
            return r3
        L_0x0139:
            com.google.common.f.e r9 = f325539a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r1, r2)
            java.lang.String r1 = "selected provider proto in the proto datastore is either empty or uninitialized"
            r2 = 32810(0x802a, float:4.5977E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r2)).mo56386p(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchwidget.p8757d.C117273j.mo103226c(boolean):android.widget.RemoteViews");
    }
}

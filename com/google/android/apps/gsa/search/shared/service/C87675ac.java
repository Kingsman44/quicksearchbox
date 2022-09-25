package com.google.android.apps.gsa.search.shared.service;

/* renamed from: com.google.android.apps.gsa.search.shared.service.ac */
/* compiled from: PG */
final class C87675ac implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C87676ad f237012a;

    public C87675ac(C87676ad adVar) {
        this.f237012a = adVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: android.content.IntentSender} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0122, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0124, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0125, code lost:
        r0 = com.google.android.apps.gsa.search.shared.service.C87676ad.f237013a.mo56226d();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "ClientActivityStarter");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r7)).mo56372aa(9765)).mo56386p("Failed to read parcelable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0137, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0122 A[ExcHandler: BadParcelableException (e android.os.BadParcelableException), Splitter:B:15:0x004a] */
    /* renamed from: fM */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData r7) {
        /*
            r6 = this;
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
            com.google.android.apps.gsa.search.shared.service.b.uo r0 = r7.f236959a
            int r0 = r0.f238699b
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r0)
            if (r0 != 0) goto L_0x000e
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
        L_0x000e:
            int r0 = r0.ordinal()
            r1 = 23
            if (r0 == r1) goto L_0x0017
            return
        L_0x0017:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88318xf.f238845a
            java.lang.Object r0 = r7.mo81918e(r0)
            com.google.android.apps.gsa.search.shared.service.b.xh r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88320xh) r0
            int r1 = r0.f238848a
            r2 = r1 & 1
            java.lang.String r3 = "ClientActivityStarter"
            if (r2 == 0) goto L_0x0138
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0138
            java.lang.Class<com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable> r1 = com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable.class
            boolean r1 = r7.mo81913d(r1)
            if (r1 != 0) goto L_0x0048
            com.google.common.f.e r7 = com.google.android.apps.gsa.search.shared.service.C87676ad.f237013a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r0, r3)
            java.lang.String r0 = "Missing event parcelable pair"
            r1 = 9769(0x2629, float:1.3689E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0048:
            java.lang.Class<com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable> r1 = com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable.class
            android.os.Parcelable r7 = r7.mo81912b(r1)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable r7 = (com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable) r7     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            if (r7 != 0) goto L_0x006d
            com.google.common.f.e r7 = com.google.android.apps.gsa.search.shared.service.C87676ad.f237013a     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            r7.mo56378ag(r0, r3)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            r0 = 9768(0x2628, float:1.3688E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            java.lang.String r0 = "Missing compound parcelable"
            r7.mo56386p(r0)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            return
        L_0x006d:
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            boolean r1 = r7.mo81922b(r1)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            if (r1 == 0) goto L_0x007f
            com.google.android.apps.gsa.search.shared.service.ad r1 = r6.f237012a     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            android.os.Parcelable r2 = r7.mo81921a(r2)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            r1.f237014b = r2     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
        L_0x007f:
            int r1 = r0.f238849b     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.android.apps.gsa.search.shared.service.ab r2 = new com.google.android.apps.gsa.search.shared.service.ab     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.android.apps.gsa.search.shared.service.ad r4 = r6.f237012a     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            r2.<init>(r4, r1)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            int r0 = r0.f238850c     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            int r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88163rm.m142790a(r0)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            r4 = 0
            if (r0 != 0) goto L_0x0092
            goto L_0x00ca
        L_0x0092:
            r5 = 1
            if (r0 == r5) goto L_0x00ca
            android.os.Parcelable r7 = r7.f236963a     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            if (r7 != 0) goto L_0x009a
            goto L_0x00a5
        L_0x009a:
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.Object r7 = r0.cast(r7)     // Catch:{ ClassCastException -> 0x00a4, BadParcelableException -> 0x0122 }
            android.content.IntentSender r7 = (android.content.IntentSender) r7     // Catch:{ ClassCastException -> 0x00a4, BadParcelableException -> 0x0122 }
            r4 = r7
            goto L_0x00a5
        L_0x00a4:
        L_0x00a5:
            if (r4 != 0) goto L_0x00c2
            com.google.common.f.e r7 = com.google.android.apps.gsa.search.shared.service.C87676ad.f237013a     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            r7.mo56378ag(r0, r3)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            r0 = 9767(0x2627, float:1.3686E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            java.lang.String r0 = "Missing intent sender"
            r7.mo56386p(r0)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            return
        L_0x00c2:
            com.google.android.apps.gsa.search.shared.service.ad r7 = r6.f237012a     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.android.apps.gsa.shared.util.t.g r7 = r7.f237015c     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            r7.mo65091c(r4, r2)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            return
        L_0x00ca:
            android.os.Parcelable r7 = r7.f236963a     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            if (r7 != 0) goto L_0x00cf
            goto L_0x00da
        L_0x00cf:
            java.lang.Class<android.content.Intent> r0 = android.content.Intent.class
            java.lang.Object r7 = r0.cast(r7)     // Catch:{ ClassCastException -> 0x00d9, BadParcelableException -> 0x0122 }
            android.content.Intent r7 = (android.content.Intent) r7     // Catch:{ ClassCastException -> 0x00d9, BadParcelableException -> 0x0122 }
            r4 = r7
            goto L_0x00da
        L_0x00d9:
        L_0x00da:
            if (r4 != 0) goto L_0x00f7
            com.google.common.f.e r7 = com.google.android.apps.gsa.search.shared.service.C87676ad.f237013a     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            r7.mo56378ag(r0, r3)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            r0 = 9766(0x2626, float:1.3685E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            java.lang.String r0 = "Missing intent"
            r7.mo56386p(r0)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            return
        L_0x00f7:
            com.google.android.apps.gsa.search.shared.service.ad r7 = r6.f237012a     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.common.base.ax r7 = r7.f237016d     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            boolean r7 = r7.mo56113h()     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            if (r7 == 0) goto L_0x011a
            int r7 = r4.getFlags()     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            r0 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r7 = r7 & r0
            r4.setFlags(r7)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.android.apps.gsa.search.shared.service.ad r7 = r6.f237012a     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.common.base.ax r7 = r7.f237016d     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            java.lang.Object r7 = r7.mo56107c()     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            android.app.Activity r7 = (android.app.Activity) r7     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            r7.startActivityForResult(r4, r1)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            return
        L_0x011a:
            com.google.android.apps.gsa.search.shared.service.ad r7 = r6.f237012a     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            com.google.android.apps.gsa.shared.util.t.g r7 = r7.f237015c     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            r7.mo65090b(r4, r2)     // Catch:{ ClassCastException -> 0x0124, BadParcelableException -> 0x0122 }
            return
        L_0x0122:
            r7 = move-exception
            goto L_0x0125
        L_0x0124:
            r7 = move-exception
        L_0x0125:
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.shared.service.C87676ad.f237013a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r3)
            java.lang.String r1 = "Failed to read parcelable"
            r2 = 9765(0x2625, float:1.3684E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r7)).mo56372aa(r2)).mo56386p(r1)
            return
        L_0x0138:
            com.google.common.f.e r7 = com.google.android.apps.gsa.search.shared.service.C87676ad.f237013a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r0, r3)
            java.lang.String r0 = "Unexpected start activity for result event with missing data"
            r1 = 9763(0x2623, float:1.3681E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.service.C87675ac.mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void");
    }
}

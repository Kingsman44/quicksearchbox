package com.google.android.apps.gsa.staticplugins.gearhead;

import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.aj */
/* compiled from: PG */
public final /* synthetic */ class C101299aj implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282709a;

    /* renamed from: b */
    public final /* synthetic */ ServiceEventData f282710b;

    public /* synthetic */ C101299aj(C101325be beVar, ServiceEventData serviceEventData) {
        this.f282709a = beVar;
        this.f282710b = serviceEventData;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r7 == com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ASSISTANT_REQUEST_ID) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r7) {
        /*
            r6 = this;
            com.google.android.apps.gsa.staticplugins.gearhead.be r0 = r6.f282709a
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r1 = r6.f282710b
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x005b
            com.google.android.apps.gsa.search.shared.service.b.uo r7 = r1.f236959a     // Catch:{ NullPointerException -> 0x003d }
            int r7 = r7.f238699b     // Catch:{ NullPointerException -> 0x003d }
            com.google.android.apps.gsa.search.shared.service.b.um r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r7)     // Catch:{ NullPointerException -> 0x003d }
            if (r7 != 0) goto L_0x0018
            com.google.android.apps.gsa.search.shared.service.b.um r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW     // Catch:{ NullPointerException -> 0x003d }
        L_0x0018:
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.AUTO_QUERY_COMMIT     // Catch:{ NullPointerException -> 0x003d }
            if (r7 == r2) goto L_0x002c
            com.google.android.apps.gsa.search.shared.service.b.uo r7 = r1.f236959a     // Catch:{ NullPointerException -> 0x003d }
            int r7 = r7.f238699b     // Catch:{ NullPointerException -> 0x003d }
            com.google.android.apps.gsa.search.shared.service.b.um r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r7)     // Catch:{ NullPointerException -> 0x003d }
            if (r7 != 0) goto L_0x0028
            com.google.android.apps.gsa.search.shared.service.b.um r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW     // Catch:{ NullPointerException -> 0x003d }
        L_0x0028:
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ASSISTANT_REQUEST_ID     // Catch:{ NullPointerException -> 0x003d }
            if (r7 != r2) goto L_0x004b
        L_0x002c:
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r7 = com.google.android.apps.gsa.shared.search.Query.class
            android.os.Parcelable r7 = r1.mo81912b(r7)     // Catch:{ NullPointerException -> 0x003d }
            com.google.android.apps.gsa.shared.search.Query r7 = (com.google.android.apps.gsa.shared.search.Query) r7     // Catch:{ NullPointerException -> 0x003d }
            long r2 = r7.f252749G     // Catch:{ NullPointerException -> 0x003d }
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ NullPointerException -> 0x003d }
            r0.f282750G = r7     // Catch:{ NullPointerException -> 0x003d }
            goto L_0x004b
        L_0x003d:
            r7 = move-exception
            com.google.common.f.a.d r2 = com.google.android.apps.gsa.staticplugins.gearhead.C101325be.f282743a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "No request ID available for this service event."
            r4 = 20022(0x4e36, float:2.8057E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56382g(r7)).mo56372aa(r4)).mo56386p(r3)
        L_0x004b:
            com.google.android.apps.gsa.search.shared.service.b.uo r7 = r1.f236959a
            int r7 = r7.f238699b
            com.google.android.apps.gsa.search.shared.service.b.um r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r7)
            if (r7 != 0) goto L_0x0057
            com.google.android.apps.gsa.search.shared.service.b.um r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
        L_0x0057:
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.HANDLE_HOTWORD_QUERY
            if (r7 != r2) goto L_0x007d
        L_0x005b:
            com.google.android.apps.gsa.search.shared.service.b.uo r7 = r1.f236959a
            int r7 = r7.f238699b
            com.google.android.apps.gsa.search.shared.service.b.um r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r7)
            if (r7 != 0) goto L_0x0067
            com.google.android.apps.gsa.search.shared.service.b.um r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
        L_0x0067:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.p r2 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13054p.IDLE
            com.google.android.apps.auto.a.a.bp r2 = com.google.android.apps.auto.p450a.p451a.C8898bp.EVENT_TYPE_UNSPECIFIED
            int r7 = r7.ordinal()
            r2 = 19
            java.lang.String r3 = "requestHandsfreeVoiceSession()"
            if (r7 == r2) goto L_0x00c1
            r2 = 50
            if (r7 == r2) goto L_0x00b8
            r2 = 94
            if (r7 == r2) goto L_0x007e
        L_0x007d:
            return
        L_0x007e:
            com.google.protobuf.bt r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C87717az.f237190a
            com.google.android.apps.gsa.search.shared.service.b.uo r2 = r1.f236959a
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)
            r2.mo58887l(r7)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r7 = r7.f169971d
            boolean r7 = r2.mo58857o(r7)
            if (r7 == 0) goto L_0x00af
            com.google.protobuf.bt r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C87717az.f237190a
            java.lang.Object r7 = r1.mo81918e(r7)
            com.google.android.apps.gsa.search.shared.service.b.bb r7 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87720bb) r7
            boolean r2 = r7.f237195c
            if (r2 == 0) goto L_0x00af
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97463ai
            long r4 = r7.f237194b
            com.google.android.libraries.search.b.i.a r7 = r2.mo40811d(r4)
            r0.mo92234k(r7)
            com.google.android.libraries.search.b.i.g r7 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97470ap
            r0.mo92234k(r7)
        L_0x00af:
            com.google.android.apps.gsa.staticplugins.gearhead.ah r7 = new com.google.android.apps.gsa.staticplugins.gearhead.ah
            r7.<init>(r0, r1)
            r0.mo92237n(r3, r7)
            return
        L_0x00b8:
            com.google.android.apps.gsa.staticplugins.gearhead.ai r7 = new com.google.android.apps.gsa.staticplugins.gearhead.ai
            r7.<init>(r0, r1)
            r0.mo92237n(r3, r7)
            return
        L_0x00c1:
            com.google.android.apps.gsa.staticplugins.gearhead.ag r7 = new com.google.android.apps.gsa.staticplugins.gearhead.ag
            r7.<init>(r0, r1)
            r0.mo92237n(r3, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.gearhead.C101299aj.accept(java.lang.Object):void");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

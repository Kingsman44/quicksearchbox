package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.content.Context;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.ar */
/* compiled from: PG */
public final class C92883ar extends C22538o {

    /* renamed from: a */
    public static final /* synthetic */ int f259133a = 0;

    /* renamed from: b */
    private static final C59071e f259134b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.ar");

    /* renamed from: c */
    private final Context f259135c;

    /* renamed from: d */
    private final C22695ah f259136d;

    /* renamed from: e */
    private final C22720x f259137e;

    /* renamed from: f */
    private final C68214a f259138f;

    /* renamed from: g */
    private final C68214a f259139g;

    /* renamed from: h */
    private final C68214a f259140h;

    /* renamed from: i */
    private final C68214a f259141i;

    /* renamed from: j */
    private final C68214a f259142j;

    public C92883ar(Context context, C22695ah ahVar, C22720x xVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f259135c = context;
        this.f259136d = ahVar;
        this.f259137e = xVar;
        this.f259138f = aVar;
        this.f259139g = aVar2;
        this.f259140h = aVar3;
        this.f259141i = aVar4;
        this.f259142j = aVar5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r8, com.google.android.libraries.gsa.conversation.clientop.C22434e r9) {
        /*
            r7 = this;
            com.google.common.f.e r0 = f259134b
            com.google.common.f.x r1 = r0.mo56224b()
            java.lang.String r2 = "AGSA-C RequestPermissionPerformer"
            r3 = 13103(0x332f, float:1.8361E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            java.lang.String r1 = r8.f135936b
            java.lang.String r2 = "device.REQUEST_PERMISSION"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0236
            com.google.assistant.e.j.dw r1 = r8.f135938d
            if (r1 != 0) goto L_0x001d
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x001d:
            com.google.assistant.e.j.rt r2 = com.google.assistant.p3897e.p3921j.C52438rt.f137645h
            com.google.protobuf.eb r2 = r2.getParserForType()
            java.lang.String r3 = "device_request_permission_args"
            com.google.protobuf.MessageLite r1 = m41992m(r1, r3, r2)
            com.google.assistant.e.j.rt r1 = (com.google.assistant.p3897e.p3921j.C52438rt) r1
            int r2 = r1.f137647a
            r3 = r2 & 1
            r4 = 1
            if (r3 == 0) goto L_0x00a6
            java.lang.String r0 = r1.f137648b
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0047
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r9 = "Android permission is empty"
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            goto L_0x00a5
        L_0x0047:
            int r1 = r0.hashCode()
            r2 = -2003032073(0xffffffff889c27f7, float:-9.398304E-34)
            if (r1 == r2) goto L_0x0060
            r2 = -977599629(0xffffffffc5bb0373, float:-5984.431)
            if (r1 == r2) goto L_0x0056
            goto L_0x006a
        L_0x0056:
            java.lang.String r1 = "android.settings.ACTION_OPEN_SCREEN_CONTEXT_DIALOG"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x006a
            r1 = 1
            goto L_0x006b
        L_0x0060:
            java.lang.String r1 = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x006a
            r1 = 0
            goto L_0x006b
        L_0x006a:
            r1 = -1
        L_0x006b:
            if (r1 == 0) goto L_0x008f
            if (r1 == r4) goto L_0x0084
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r9 = "Unsupported Android permission: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r9 = r9.concat(r0)
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            goto L_0x00a5
        L_0x0084:
            com.google.android.libraries.gsa.conversation.h.x r0 = r7.f259137e
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90833j(r9)
            com.google.common.util.concurrent.cx r8 = r0.mo27814b(r8, r9)
            goto L_0x00a5
        L_0x008f:
            android.content.Context r8 = r7.f259135c
            com.google.android.apps.gsa.notificationlistener.C83395k.m132733d(r8)
            android.content.Context r8 = r7.f259135c
            android.content.Intent r8 = com.google.android.apps.gsa.notificationlistener.C83395k.m132731b(r8)
            if (r8 == 0) goto L_0x00a3
            com.google.android.libraries.gsa.conversation.h.ah r9 = r7.f259136d
            if (r9 == 0) goto L_0x00a3
            r9.mo27807a(r8)
        L_0x00a3:
            com.google.common.util.concurrent.cx r8 = com.google.android.libraries.gsa.conversation.clientop.C22538o.f62144n
        L_0x00a5:
            return r8
        L_0x00a6:
            r3 = r2 & 4
            r5 = 3
            if (r3 == 0) goto L_0x00e6
            r0 = r2 & 8
            if (r0 == 0) goto L_0x00db
            int r0 = r1.f137650d
            int r0 = com.google.assistant.p3897e.p3921j.C52437rs.m86632a(r0)
            if (r0 != 0) goto L_0x00b8
            goto L_0x00db
        L_0x00b8:
            if (r0 != r5) goto L_0x00db
            dagger.a r8 = r7.f259141i
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.ae.e r8 = (com.google.android.apps.gsa.staticplugins.opa.p8181ae.C106115e) r8
            int r9 = r1.f137649c
            com.google.bj.c.a.b r9 = com.google.p4184bj.p4193c.p4194a.C55912b.m87801a(r9)
            if (r9 != 0) goto L_0x00cc
            com.google.bj.c.a.b r9 = com.google.p4184bj.p4193c.p4194a.C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN
        L_0x00cc:
            com.google.common.util.concurrent.cx r8 = r8.mo95287a(r9)
            com.google.android.apps.gsa.staticplugins.accl.performers.aq r9 = com.google.android.apps.gsa.staticplugins.accl.performers.C92882aq.f259132a
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60922j.m93044g(r8, r9, r0)
            com.google.android.apps.gsa.shared.s.a.a r9 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x00e5
        L_0x00db:
            com.google.android.libraries.gsa.conversation.h.x r0 = r7.f259137e
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90833j(r9)
            com.google.common.util.concurrent.cx r8 = r0.mo27814b(r8, r9)
        L_0x00e5:
            return r8
        L_0x00e6:
            r8 = r2 & 16
            if (r8 == 0) goto L_0x0230
            com.google.assistant.e.j.rp r8 = com.google.assistant.p3897e.p3921j.C52434rp.UNKNOWN
            int r8 = r1.f137651e
            com.google.assistant.e.j.rp r8 = com.google.assistant.p3897e.p3921j.C52434rp.m86630a(r8)
            if (r8 != 0) goto L_0x00f6
            com.google.assistant.e.j.rp r8 = com.google.assistant.p3897e.p3921j.C52434rp.UNKNOWN
        L_0x00f6:
            int r8 = r8.ordinal()
            if (r8 == r4) goto L_0x01da
            r9 = 2
            if (r8 == r9) goto L_0x0101
            goto L_0x020d
        L_0x0101:
            dagger.a r8 = r7.f259140h
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.service.af r8 = (com.google.android.apps.gsa.search.core.service.C86610af) r8
            com.google.android.apps.gsa.search.core.service.r r8 = r8.f233977l
            if (r8 != 0) goto L_0x011b
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL
            java.lang.String r9 = "Failed to get search service client"
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            goto L_0x022f
        L_0x011b:
            com.google.android.apps.gsa.search.shared.service.ClientConfig r9 = r8.f234384f
            boolean r9 = r9.mo81901s()
            if (r4 == r9) goto L_0x0124
            goto L_0x0125
        L_0x0124:
            r5 = 6
        L_0x0125:
            dagger.a r9 = r7.f259141i
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.ae.e r9 = (com.google.android.apps.gsa.staticplugins.opa.p8181ae.C106115e) r9
            boolean r9 = r9.mo95288b(r5)
            if (r9 != 0) goto L_0x0141
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL
            java.lang.String r9 = "Failed to record third party disclosure acknowledgement"
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            goto L_0x022f
        L_0x0141:
            int r9 = r1.f137647a
            r9 = r9 & 32
            if (r9 == 0) goto L_0x01d3
            com.google.android.apps.gsa.search.shared.service.j r9 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.OPA_CLIENT_INPUT
            r9.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r0)
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow.f238173a
            com.google.android.apps.gsa.search.shared.service.b.oy r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy.f238174g
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.ox r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox) r2
            com.google.protobuf.z r1 = r1.f137652f
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.gsa.search.shared.service.b.oy r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r3
            r1.getClass()
            int r5 = r3.f238176a
            r5 = r5 | r4
            r3.f238176a = r5
            r3.f238177b = r1
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.apps.gsa.search.shared.service.b.oy r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r1
            r9.mo82014b(r0, r1)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r9 = r9.mo82013a()
            r8.mo80387i(r9)
            dagger.a r9 = r7.f259138f
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r9 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r9
            com.google.android.apps.gsa.shared.logger.b.f r0 = new com.google.android.apps.gsa.shared.logger.b.f
            r0.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_AOG_VUI_CONSENT_REISSUE_QUERY
            r0.f246201a = r1
            com.google.android.apps.gsa.shared.logger.b.g r0 = r0.mo83699a()
            r9.mo74236a(r0)
            dagger.a r9 = r7.f259139g
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r9 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r9
            com.google.android.apps.gsa.shared.m.f r0 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250442dH
            long r0 = r9.mo79743a(r0)
            com.google.android.apps.gsa.search.shared.service.al r9 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.OPA_KEEP_SCREEN_ON
            r9.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r2)
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88116pt.f238220a
            com.google.android.apps.gsa.search.shared.service.b.px r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88120px.f238222d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.pu r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88117pu) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.apps.gsa.search.shared.service.b.px r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88120px) r5
            int r6 = r5.f238224a
            r4 = r4 | r6
            r5.f238224a = r4
            int r1 = (int) r0
            r5.f238225b = r1
            com.google.protobuf.bv r0 = r3.build()
            com.google.android.apps.gsa.search.shared.service.b.px r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88120px) r0
            r9.mo81965b(r2, r0)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r9 = r9.mo81964a()
            com.google.android.apps.gsa.search.core.service.n r8 = r8.f234383e
            r8.mo80379b(r9)
        L_0x01d3:
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            goto L_0x022f
        L_0x01da:
            boolean r8 = com.google.android.apps.gsa.staticplugins.accl.p7338h.C92846a.m152879a(r9)
            if (r8 == 0) goto L_0x020d
            dagger.a r8 = r7.f259142j
            java.lang.Object r8 = r8.mo27525b()
            com.google.common.base.ax r8 = (com.google.common.base.C58833ax) r8
            boolean r8 = r8.mo56113h()
            if (r8 == 0) goto L_0x0202
            dagger.a r8 = r7.f259142j
            java.lang.Object r8 = r8.mo27525b()
            com.google.common.base.ax r8 = (com.google.common.base.C58833ax) r8
            java.lang.Object r8 = r8.mo56107c()
            com.google.android.apps.gsa.shared.bisto.au r8 = (com.google.android.apps.gsa.shared.bisto.C89623au) r8
            r8.mo83494a()
            com.google.common.util.concurrent.cx r8 = com.google.android.libraries.gsa.conversation.clientop.C22538o.f62144n
            goto L_0x022f
        L_0x0202:
            com.google.common.f.x r8 = r0.mo56225c()
            java.lang.String r9 = "PersonalResultsNotification is absent for a bisto query."
            r0 = 13105(0x3331, float:1.8364E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r0)).mo56386p(r9)
        L_0x020d:
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            int r9 = r1.f137651e
            com.google.assistant.e.j.rp r9 = com.google.assistant.p3897e.p3921j.C52434rp.m86630a(r9)
            if (r9 != 0) goto L_0x0219
            com.google.assistant.e.j.rp r9 = com.google.assistant.p3897e.p3921j.C52434rp.UNKNOWN
        L_0x0219:
            java.lang.String r9 = r9.name()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "Unsupported Assistant permission: "
            java.lang.String r9 = r0.concat(r9)
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r8, r9)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
        L_0x022f:
            return r8
        L_0x0230:
            com.google.android.libraries.gsa.conversation.clientop.k r8 = new com.google.android.libraries.gsa.conversation.clientop.k
            r8.<init>()
            throw r8
        L_0x0236:
            com.google.android.libraries.gsa.conversation.clientop.d r9 = new com.google.android.libraries.gsa.conversation.clientop.d
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.C92883ar.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }
}

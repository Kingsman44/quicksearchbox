package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.ca */
/* compiled from: PG */
public final class C92978ca extends C22538o {

    /* renamed from: a */
    public static final C59071e f259360a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.ca");

    /* renamed from: b */
    public final C68214a f259361b;

    /* renamed from: c */
    private final C22720x f259362c;

    /* renamed from: d */
    private final C22871g f259363d;

    /* renamed from: e */
    private final C68214a f259364e;

    /* renamed from: f */
    private final C68214a f259365f;

    /* renamed from: g */
    private final C68214a f259366g;

    /* renamed from: h */
    private final C68214a f259367h;

    /* renamed from: i */
    private final boolean f259368i;

    /* renamed from: j */
    private final C68214a f259369j;

    public C92978ca(C22720x xVar, C22871g gVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, boolean z, C68214a aVar6) {
        this.f259362c = xVar;
        this.f259363d = gVar;
        this.f259364e = aVar;
        this.f259361b = aVar2;
        this.f259365f = aVar4;
        this.f259366g = aVar3;
        this.f259367h = aVar5;
        this.f259368i = z;
        this.f259369j = aVar6;
    }

    /* renamed from: c */
    private static MessageLite m153020c(C51809dy dyVar, String str, C63010eb ebVar) {
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C58833ax c = C58557jl.m90122c(dwVar.f135932a, new C92923bz(str));
        if (!c.mo56113h()) {
            ((C59052c) ((C59052c) f259360a.mo56226d()).mo56372aa(13141)).mo56354G("Failed to find %s argument in %s client op", str, dyVar.f135936b);
            return null;
        }
        try {
            C52230ka kaVar = ((C52232kc) c.mo56107c()).f137066c;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            return (MessageLite) ebVar.mo59008g(kaVar.f137061c);
        } catch (C62974ct unused) {
            ((C59052c) ((C59052c) f259360a.mo56225c()).mo56372aa(13140)).mo56354G("Failed to parse %s argument from %s client op", str, dyVar.f135936b);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b9, code lost:
        if (((com.google.android.apps.gsa.search.core.p6491a.C84349ah) r0.mo56107c()).f229566a.mo84363bw("android.opa.extra.TRIGGERED_BY_HEADSET") != false) goto L_0x0217;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r7, com.google.android.libraries.gsa.conversation.clientop.C22434e r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f135936b
            java.lang.String r1 = "sdk_actions.EXECUTE"
            boolean r0 = r1.equals(r0)
            java.lang.String r2 = "provider.BIND_APP_ACTIONS_SERVICE"
            r3 = 0
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = r7.f135936b
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0102
        L_0x0015:
            dagger.a r0 = r6.f259365f
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            com.google.android.apps.gsa.staticplugins.accl.performers.bv r4 = com.google.android.apps.gsa.staticplugins.accl.performers.C92919bv.f259233a
            com.google.common.base.ax r0 = r0.mo56106b(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r0 = r0.mo56109e(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0102
            boolean r0 = com.google.android.apps.gsa.staticplugins.accl.p7338h.C92846a.m152879a(r8)
            if (r0 == 0) goto L_0x0102
            dagger.a r0 = r6.f259366g
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0102
            java.lang.String r8 = r7.f135936b
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x009e
            com.google.assistant.e.j.qr r8 = com.google.assistant.p3897e.p3921j.C52409qr.f137528b
            com.google.protobuf.eb r8 = r8.getParserForType()
            java.lang.String r0 = "device_actions_response"
            com.google.protobuf.MessageLite r8 = m153020c(r7, r0, r8)
            com.google.assistant.e.j.qr r8 = (com.google.assistant.p3897e.p3921j.C52409qr) r8
            if (r8 == 0) goto L_0x008b
            dagger.a r0 = r6.f259366g
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.nga.a.b.b r0 = (com.google.android.apps.gsa.staticplugins.nga.p8044a.p8046b.C102999b) r0
            com.google.android.apps.gsa.nga.api.a.cb r1 = com.google.android.apps.gsa.nga.api.a.cb.d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.nga.api.a.bz r1 = (com.google.android.apps.gsa.nga.api.a.bz) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.nga.api.a.cb r3 = (com.google.android.apps.gsa.nga.api.a.cb) r3
            r3.b = r8
            r8 = 6
            r3.a = r8
            com.google.protobuf.bv r8 = r1.build()
            com.google.android.apps.gsa.nga.api.a.cb r8 = (com.google.android.apps.gsa.nga.api.a.cb) r8
            r0.mo93556a(r8)
            goto L_0x009e
        L_0x008b:
            com.google.common.f.e r8 = f259360a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r0 = "Client op does not have DeviceActionsResponseArgs"
            r1 = 13138(0x3352, float:1.841E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            com.google.android.libraries.gsa.conversation.clientop.d r8 = new com.google.android.libraries.gsa.conversation.clientop.d
            r8.<init>(r7)
            throw r8
        L_0x009e:
            boolean r8 = r6.f259368i
            if (r8 == 0) goto L_0x00ff
            java.lang.String r8 = r7.f135936b
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x00ff
            com.google.assistant.e.j.ady r8 = com.google.assistant.p3897e.p3921j.ady.f134912f
            com.google.protobuf.eb r8 = r8.getParserForType()
            java.lang.String r0 = "provider_bind_app_actions_service_args"
            com.google.protobuf.MessageLite r8 = m153020c(r7, r0, r8)
            com.google.assistant.e.j.ady r8 = (com.google.assistant.p3897e.p3921j.ady) r8
            if (r8 == 0) goto L_0x00ec
            dagger.a r7 = r6.f259366g
            java.lang.Object r7 = r7.mo27525b()
            com.google.common.base.ax r7 = (com.google.common.base.C58833ax) r7
            java.lang.Object r7 = r7.mo56107c()
            com.google.android.apps.gsa.staticplugins.nga.a.b.b r7 = (com.google.android.apps.gsa.staticplugins.nga.p8044a.p8046b.C102999b) r7
            com.google.android.apps.gsa.nga.api.a.cb r8 = com.google.android.apps.gsa.nga.api.a.cb.d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.nga.api.a.bz r8 = (com.google.android.apps.gsa.nga.api.a.bz) r8
            com.google.android.apps.gsa.nga.api.a.u r0 = com.google.android.apps.gsa.nga.api.a.u.c
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.apps.gsa.nga.api.a.cb r1 = (com.google.android.apps.gsa.nga.api.a.cb) r1
            r0.getClass()
            r1.b = r0
            r0 = 12
            r1.a = r0
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.apps.gsa.nga.api.a.cb r8 = (com.google.android.apps.gsa.nga.api.a.cb) r8
            r7.mo93556a(r8)
            goto L_0x00ff
        L_0x00ec:
            com.google.common.f.e r8 = f259360a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r0 = "Client op does not have ProviderBindAppActionsServiceArgs"
            r1 = 13137(0x3351, float:1.8409E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            com.google.android.libraries.gsa.conversation.clientop.d r8 = new com.google.android.libraries.gsa.conversation.clientop.d
            r8.<init>(r7)
            throw r8
        L_0x00ff:
            com.google.common.util.concurrent.cx r7 = com.google.android.libraries.gsa.conversation.clientop.C22538o.f62144n
            return r7
        L_0x0102:
            java.lang.String r0 = r7.f135936b
            java.lang.String r1 = "ui.SHOW_RENDERED_CARD"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0147
            dagger.a r0 = r6.f259364e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C89996bb.f246773c
            com.google.common.b.hd r0 = r0.mo79752r(r1)
            java.lang.String r1 = "card_rendering"
            java.lang.Object r2 = r0.get(r1)
            r3 = 0
            if (r2 == 0) goto L_0x012f
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = java.lang.Long.parseLong(r0)
            goto L_0x0130
        L_0x012f:
            r0 = r3
        L_0x0130:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0142
            com.google.android.libraries.gsa.k.g r2 = r6.f259363d
            com.google.android.apps.gsa.staticplugins.accl.performers.by r3 = new com.google.android.apps.gsa.staticplugins.accl.performers.by
            r3.<init>(r6, r7, r8)
            java.lang.String r7 = "DisplayUi"
            com.google.common.util.concurrent.cx r7 = r2.mo28203c(r7, r0, r3)
            return r7
        L_0x0142:
            com.google.common.util.concurrent.cx r7 = r6.mo87495b(r7, r8)
            return r7
        L_0x0147:
            boolean r0 = com.google.android.apps.gsa.staticplugins.accl.p7338h.C92846a.m152879a(r8)
            java.lang.String r1 = "device.WAIT_FOR_AUTHENTICATION"
            if (r0 == 0) goto L_0x0187
            java.lang.String r0 = r7.f135936b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0187
            dagger.a r7 = r6.f259367h
            java.lang.Object r7 = r7.mo27525b()
            com.google.common.base.ax r7 = (com.google.common.base.C58833ax) r7
            boolean r7 = r7.mo56113h()
            if (r7 == 0) goto L_0x0177
            dagger.a r7 = r6.f259367h
            java.lang.Object r7 = r7.mo27525b()
            com.google.common.base.ax r7 = (com.google.common.base.C58833ax) r7
            java.lang.Object r7 = r7.mo56107c()
            com.google.android.apps.gsa.shared.bisto.au r7 = (com.google.android.apps.gsa.shared.bisto.C89623au) r7
            r7.mo83494a()
            goto L_0x0184
        L_0x0177:
            com.google.common.f.e r7 = f259360a
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r8 = "PersonalResultsNotification is absent for a bisto query."
            r0 = 13136(0x3350, float:1.8407E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r0)).mo56386p(r8)
        L_0x0184:
            com.google.common.util.concurrent.cx r7 = com.google.android.libraries.gsa.conversation.clientop.C22538o.f62144n
            return r7
        L_0x0187:
            r0 = r8
            com.google.android.libraries.gsa.conversation.clientop.c r0 = (com.google.android.libraries.gsa.conversation.clientop.C22407c) r0
            com.google.common.base.ax r2 = r0.f61902d
            boolean r2 = r2.mo56113h()
            if (r2 != 0) goto L_0x0193
            goto L_0x01bb
        L_0x0193:
            com.google.common.base.ax r0 = r0.f61902d
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.libraries.gsa.conversation.f.l r0 = (com.google.android.libraries.gsa.conversation.p1852f.C22585l) r0
            com.google.common.base.ax r0 = r0.f62228b
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x01bb
            java.lang.Object r2 = r0.mo56107c()
            boolean r2 = r2 instanceof com.google.android.apps.gsa.search.core.p6491a.C84349ah
            if (r2 == 0) goto L_0x01bb
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.search.core.a.ah r0 = (com.google.android.apps.gsa.search.core.p6491a.C84349ah) r0
            com.google.android.apps.gsa.shared.search.Query r0 = r0.f229566a
            java.lang.String r2 = "android.opa.extra.TRIGGERED_BY_HEADSET"
            boolean r0 = r0.mo84363bw(r2)
            if (r0 != 0) goto L_0x0217
        L_0x01bb:
            dagger.a r0 = r6.f259364e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247259dl
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x026e
            dagger.a r0 = r6.f259369j
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.google.a.az r0 = (com.google.android.apps.gsa.search.core.google.p6790a.C85807az) r0
            boolean r2 = r0.mo79452a()
            if (r2 != 0) goto L_0x0217
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f232029b
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247419gm
            boolean r2 = r2.mo79746e(r4)
            if (r2 == 0) goto L_0x01e4
            goto L_0x0217
        L_0x01e4:
            android.content.Context r0 = r0.f232028a
            java.lang.Class<android.media.AudioManager> r2 = android.media.AudioManager.class
            java.lang.Object r0 = r0.getSystemService(r2)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.google.common.b.ij r2 = com.google.common.p4522b.C58528ij.m90011K(r2, r4)
            r4 = 2
            android.media.AudioDeviceInfo[] r0 = r0.getDevices(r4)
            int r4 = r0.length
        L_0x0202:
            if (r3 >= r4) goto L_0x026e
            r5 = r0[r3]
            int r5 = r5.getType()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L_0x0217
            int r3 = r3 + 1
            goto L_0x0202
        L_0x0217:
            java.lang.String r0 = r7.f135936b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x026e
            dagger.a r0 = r6.f259367h
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0261
            dagger.a r0 = r6.f259364e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247237dP
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x024f
            dagger.a r0 = r6.f259367h
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.shared.bisto.au r0 = (com.google.android.apps.gsa.shared.bisto.C89623au) r0
            r0.mo83495b()
            goto L_0x026e
        L_0x024f:
            dagger.a r0 = r6.f259367h
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.shared.bisto.au r0 = (com.google.android.apps.gsa.shared.bisto.C89623au) r0
            r0.mo83494a()
            goto L_0x026e
        L_0x0261:
            com.google.common.f.e r0 = f259360a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "PersonalResultsNotification is absent for a non-bisto query."
            r2 = 13134(0x334e, float:1.8405E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
        L_0x026e:
            com.google.android.libraries.gsa.conversation.h.x r0 = r6.f259362c
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90833j(r8)
            com.google.common.util.concurrent.cx r7 = r0.mo27814b(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.C92978ca.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo87495b(C51809dy dyVar, C22434e eVar) {
        C60870cx b = this.f259362c.mo27814b(dyVar, C58833ax.m90833j(eVar));
        C90875ai.m148465b(new C92920bw(this, eVar), b, this.f259363d, "Show rendered card").mo85223a(C92921bx.f259236a);
        return b;
    }
}

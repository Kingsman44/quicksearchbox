package com.google.android.apps.gsa.staticplugins.deeplink.p7793e;

import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84665c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.logger.p7050a.C89835a;
import com.google.android.apps.gsa.shared.p7066m.C89968ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2998g.p2999a.C38362c;
import com.google.android.libraries.search.p2998g.p2999a.C38370k;
import com.google.android.libraries.search.p3003h.p3004a.C38400d;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.e.d */
/* compiled from: PG */
public final class C99503d extends C86734a implements C84665c {

    /* renamed from: a */
    private static final C59071e f278431a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.deeplink.e.d");

    /* renamed from: b */
    private final C86124t f278432b;

    /* renamed from: c */
    private final C86610af f278433c;

    /* renamed from: f */
    private final C68214a f278434f;

    /* renamed from: g */
    private final C89835a f278435g;

    /* renamed from: h */
    private final C68214a f278436h;

    /* renamed from: i */
    private final C68214a f278437i;

    /* renamed from: j */
    private final C22871g f278438j;

    /* renamed from: k */
    private final C68214a f278439k;

    /* renamed from: l */
    private final C38400d f278440l;

    public C99503d(C86124t tVar, C86610af afVar, C68214a aVar, C89835a aVar2, C68214a aVar3, C68214a aVar4, C22871g gVar, C68214a aVar5, C38400d dVar) {
        super(C118575h.WORKER_DEEPLINK, "deeplink");
        this.f278432b = tVar;
        this.f278433c = afVar;
        this.f278434f = aVar;
        this.f278435g = aVar2;
        this.f278436h = aVar3;
        this.f278437i = aVar4;
        this.f278438j = gVar;
        this.f278439k = aVar5;
        this.f278440l = dVar;
    }

    /* renamed from: c */
    private final Intent m165030c(String str) {
        Uri uri;
        if (str == null || !URLUtil.isValidUrl(str)) {
            uri = Uri.parse(this.f278432b.mo79758x(C89968ag.f246502b));
            uri.getClass();
        } else {
            uri = Uri.parse(str);
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        return intent;
    }

    /* renamed from: e */
    private final void m165031e(C86775r rVar, C38370k kVar) {
        if ((kVar.f101595a & 8) != 0) {
            C38362c cVar = kVar.f101599e;
            if (cVar == null) {
                cVar = C38362c.f101570c;
            }
            rVar.mo80391m(m165030c(cVar.f101573b));
            return;
        }
        rVar.mo80391m(m165030c((String) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0126, code lost:
        if (((com.google.android.libraries.search.p2998g.p2999a.p3000a.C38340e) r8).f101522d.equals(r14.f278432b.mo79758x(com.google.android.apps.gsa.shared.p7066m.C90014bt.f247052Q)) != false) goto L_0x016f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78403a(com.google.android.libraries.search.p2998g.p2999a.C38375p r15) {
        /*
            r14 = this;
            com.google.android.apps.gsa.search.core.service.af r0 = r14.f278433c
            boolean r0 = r0.mo80227h()
            r1 = 0
            r2 = 0
            r3 = 2
            if (r0 != 0) goto L_0x0010
            r15 = 7
            com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99499c.m165021a(r15, r2, r1, r1, r3)
            return
        L_0x0010:
            com.google.android.apps.gsa.search.core.service.af r0 = r14.f278433c
            com.google.android.apps.gsa.search.core.service.r r0 = r0.f233977l
            java.lang.String r4 = r15.f101606b
            java.lang.String r4 = r15.f101607c
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r4 = r15.f101611g
            int r4 = com.google.android.libraries.search.p2998g.p2999a.C38374o.m67655a(r4)
            r5 = 1
            if (r4 != 0) goto L_0x0024
            r4 = 1
        L_0x0024:
            com.google.android.libraries.search.g.a.k r6 = r15.f101609e
            if (r6 != 0) goto L_0x002a
            com.google.android.libraries.search.g.a.k r6 = com.google.android.libraries.search.p2998g.p2999a.C38370k.f101593f
        L_0x002a:
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r6)
            com.google.android.libraries.search.g.a.r r15 = r15.f101610f
            if (r15 != 0) goto L_0x0034
            com.google.android.libraries.search.g.a.r r15 = com.google.android.libraries.search.p2998g.p2999a.C38377r.f101613e
        L_0x0034:
            com.google.android.libraries.search.g.a.e r7 = com.google.android.libraries.search.p2998g.p2999a.C38364e.SESSION_DEEPLINK
            int r7 = r4 + -1
            if (r7 == r5) goto L_0x0396
            switch(r7) {
                case 9: goto L_0x004f;
                case 10: goto L_0x0396;
                case 11: goto L_0x004f;
                default: goto L_0x003d;
            }
        L_0x003d:
            android.content.Intent r5 = r14.m165030c(r1)
            r0.mo80391m(r5)
            java.lang.Object r1 = r6.orElse(r1)
            com.google.android.libraries.search.g.a.k r1 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r1
            com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99499c.m165021a(r4, r2, r1, r15, r3)
            goto L_0x03a8
        L_0x004f:
            com.google.android.apps.gsa.shared.logger.a.a r7 = r14.f278435g
            java.lang.Object r8 = r6.get()
            com.google.android.libraries.search.g.a.k r8 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r8
            com.google.android.libraries.search.g.a.h r8 = r8.f101597c
            if (r8 != 0) goto L_0x005d
            com.google.android.libraries.search.g.a.h r8 = com.google.android.libraries.search.p2998g.p2999a.C38367h.f101583d
        L_0x005d:
            int r8 = r8.f101585a
            r8 = r8 & r3
            java.lang.String r9 = "and.gsa.deeplink"
            if (r8 == 0) goto L_0x0077
            java.lang.Object r8 = r6.get()
            com.google.android.libraries.search.g.a.k r8 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r8
            com.google.android.libraries.search.g.a.h r8 = r8.f101597c
            if (r8 != 0) goto L_0x0070
            com.google.android.libraries.search.g.a.h r8 = com.google.android.libraries.search.p2998g.p2999a.C38367h.f101583d
        L_0x0070:
            java.lang.String r8 = r8.f101587c
            java.lang.String r8 = com.google.android.apps.gsa.shared.util.p7174l.C91053a.m148741a(r9, r8)
            goto L_0x0078
        L_0x0077:
            r8 = r9
        L_0x0078:
            r7.f243162a = r8
            java.lang.String r7 = r7.f243162a
            java.lang.Object r7 = r6.get()
            com.google.android.libraries.search.g.a.k r7 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r7
            com.google.android.libraries.search.g.a.f r7 = r7.f101598d
            if (r7 != 0) goto L_0x0088
            com.google.android.libraries.search.g.a.f r7 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x0088:
            int r7 = r7.f101580a
            com.google.android.libraries.search.g.a.e r7 = com.google.android.libraries.search.p2998g.p2999a.C38364e.m67654a(r7)
            int r8 = r7.ordinal()
            java.lang.String r10 = "DeeplinkWorker"
            if (r8 == 0) goto L_0x0221
            if (r8 == r5) goto L_0x00ac
            com.google.common.f.e r15 = f278431a
            com.google.common.f.x r15 = r15.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r15.mo56378ag(r1, r10)
            java.lang.String r1 = "Unrecognized deeplink action. This is probably a developer error. %s"
            r2 = 19251(0x4b33, float:2.6976E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r2)).mo56389s(r1, r7)
            goto L_0x03a8
        L_0x00ac:
            java.lang.Object r2 = r6.get()
            com.google.android.libraries.search.g.a.k r2 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r2
            com.google.android.libraries.search.g.a.f r6 = r2.f101598d
            if (r6 != 0) goto L_0x00b8
            com.google.android.libraries.search.g.a.f r6 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x00b8:
            int r7 = r6.f101580a
            if (r7 != r5) goto L_0x00c1
            java.lang.Object r6 = r6.f101581b
            com.google.android.apps.gsa.search.shared.service.b.bw r6 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw) r6
            goto L_0x00c3
        L_0x00c1:
            com.google.android.apps.gsa.search.shared.service.b.bw r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw.f237477c
        L_0x00c3:
            com.google.protobuf.bt r7 = com.google.android.libraries.search.p2998g.p2999a.p3000a.C38338c.f101516a
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)
            r6.mo58887l(r7)
            com.google.protobuf.bf r8 = r6.f169962ag
            com.google.protobuf.bs r7 = r7.f169971d
            boolean r7 = r8.mo58857o(r7)
            if (r7 == 0) goto L_0x0210
            com.google.protobuf.bt r7 = com.google.android.libraries.search.p2998g.p2999a.p3000a.C38338c.f101516a
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)
            r6.mo58887l(r7)
            com.google.protobuf.bf r8 = r6.f169962ag
            com.google.protobuf.bs r9 = r7.f169971d
            java.lang.Object r8 = r8.mo58854l(r9)
            if (r8 != 0) goto L_0x00ec
            java.lang.Object r7 = r7.f169969b
            goto L_0x00f0
        L_0x00ec:
            java.lang.Object r7 = r7.mo58889c(r8)
        L_0x00f0:
            com.google.android.libraries.search.g.a.a.e r7 = (com.google.android.libraries.search.p2998g.p2999a.p3000a.C38340e) r7
            com.google.android.apps.gsa.search.core.i.t r8 = r14.f278432b
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247314en
            boolean r8 = r8.mo79746e(r9)
            if (r8 == 0) goto L_0x0129
            com.google.protobuf.bt r8 = com.google.android.libraries.search.p2998g.p2999a.p3000a.C38338c.f101516a
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r6.mo58887l(r8)
            com.google.protobuf.bf r9 = r6.f169962ag
            com.google.protobuf.bs r10 = r8.f169971d
            java.lang.Object r9 = r9.mo58854l(r10)
            if (r9 != 0) goto L_0x0112
            java.lang.Object r8 = r8.f169969b
            goto L_0x0116
        L_0x0112:
            java.lang.Object r8 = r8.mo58889c(r9)
        L_0x0116:
            com.google.android.libraries.search.g.a.a.e r8 = (com.google.android.libraries.search.p2998g.p2999a.p3000a.C38340e) r8
            java.lang.String r8 = r8.f101522d
            com.google.android.apps.gsa.search.core.i.t r9 = r14.f278432b
            com.google.android.apps.gsa.shared.m.h r10 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247052Q
            java.lang.String r9 = r9.mo79758x(r10)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0129
            goto L_0x016f
        L_0x0129:
            int r8 = r7.f101520b
            int r8 = com.google.android.libraries.search.p2998g.p2999a.p3000a.C38337b.m67650a(r8)
            if (r8 != 0) goto L_0x0132
            goto L_0x0134
        L_0x0132:
            if (r8 != r5) goto L_0x016f
        L_0x0134:
            java.lang.String r8 = r7.f101521c
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x016f
            java.lang.String r7 = r7.f101522d
            java.lang.String r8 = "com.google.android.apps.googleassistant"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x016f
            dagger.a r7 = r14.f278436h
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.nga.api.bx r7 = (com.google.android.apps.gsa.nga.api.C74720bx) r7
            com.google.android.apps.gsa.nga.api.NgaState r7 = r7.mo71089f()
            boolean r7 = r7.a()
            if (r7 == 0) goto L_0x016f
            dagger.a r1 = r14.f278437i
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.nga.api.bq r1 = (com.google.android.apps.gsa.nga.api.bq) r1
            int r6 = r6.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r6)
            if (r6 != 0) goto L_0x016a
            com.google.android.apps.gsa.search.shared.service.b.bu r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
        L_0x016a:
            r1.d(r6)
            goto L_0x021c
        L_0x016f:
            dagger.a r7 = r14.f278434f
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.core.service.e.q r7 = (com.google.android.apps.gsa.search.core.service.p6848e.C86695q) r7
            com.google.protobuf.bt r8 = com.google.android.libraries.search.p2998g.p2999a.p3000a.C38338c.f101516a
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r6.mo58887l(r8)
            com.google.protobuf.bf r6 = r6.f169962ag
            com.google.protobuf.bs r9 = r8.f169971d
            java.lang.Object r6 = r6.mo58854l(r9)
            if (r6 != 0) goto L_0x018d
            java.lang.Object r6 = r8.f169969b
            goto L_0x0191
        L_0x018d:
            java.lang.Object r6 = r8.mo58889c(r6)
        L_0x0191:
            com.google.android.libraries.search.g.a.a.e r6 = (com.google.android.libraries.search.p2998g.p2999a.p3000a.C38340e) r6
            com.google.android.apps.gsa.search.shared.service.c.b.bb r8 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb.f239082a
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.search.shared.service.c.b.ba r8 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba) r8
            com.google.android.libraries.search.g.a.b.f r9 = com.google.android.libraries.search.p2998g.p2999a.p3001b.C38355f.f101543s
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.search.g.a.b.e r9 = (com.google.android.libraries.search.p2998g.p2999a.p3001b.C38354e) r9
            int r10 = r6.f101519a
            r10 = r10 & r5
            if (r10 == 0) goto L_0x01c7
            int r10 = r6.f101520b
            int r10 = com.google.android.libraries.search.p2998g.p2999a.p3000a.C38337b.m67650a(r10)
            if (r10 != 0) goto L_0x01b1
            r10 = 1
        L_0x01b1:
            int r10 = com.google.android.libraries.search.p2998g.p2999a.p3001b.C38351b.m67651a(r10)
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.android.libraries.search.g.a.b.f r11 = (com.google.android.libraries.search.p2998g.p2999a.p3001b.C38355f) r11
            if (r10 == 0) goto L_0x01c6
            r11.f101546b = r10
            int r1 = r11.f101545a
            r1 = r1 | r5
            r11.f101545a = r1
            goto L_0x01c7
        L_0x01c6:
            throw r1
        L_0x01c7:
            int r1 = r6.f101519a
            r1 = r1 & r3
            if (r1 == 0) goto L_0x01df
            java.lang.String r1 = r6.f101521c
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.libraries.search.g.a.b.f r10 = (com.google.android.libraries.search.p2998g.p2999a.p3001b.C38355f) r10
            r1.getClass()
            int r11 = r10.f101545a
            r11 = r11 | r3
            r10.f101545a = r11
            r10.f101547c = r1
        L_0x01df:
            int r1 = r6.f101519a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x01f9
            java.lang.String r1 = r6.f101522d
            r9.copyOnWrite()
            com.google.protobuf.bv r6 = r9.instance
            com.google.android.libraries.search.g.a.b.f r6 = (com.google.android.libraries.search.p2998g.p2999a.p3001b.C38355f) r6
            r1.getClass()
            int r10 = r6.f101545a
            r10 = r10 | 4
            r6.f101545a = r10
            r6.f101548d = r1
        L_0x01f9:
            com.google.protobuf.bt r1 = com.google.android.libraries.search.p2998g.p2999a.p3001b.C38358i.f101564a
            com.google.protobuf.bv r6 = r9.build()
            com.google.android.libraries.search.g.a.b.f r6 = (com.google.android.libraries.search.p2998g.p2999a.p3001b.C38355f) r6
            r8.mo58885m(r1, r6)
            com.google.protobuf.bv r1 = r8.build()
            com.google.android.apps.gsa.search.shared.service.c.b.bb r1 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb) r1
            java.lang.String r6 = "opa"
            r7.mo80275j(r6, r1)
            goto L_0x021c
        L_0x0210:
            com.google.android.apps.gsa.search.shared.service.j r1 = new com.google.android.apps.gsa.search.shared.service.j
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw) r6)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r1 = r1.mo82013a()
            r0.mo80387i(r1)
        L_0x021c:
            com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99499c.m165021a(r4, r5, r2, r15, r3)
            goto L_0x03a8
        L_0x0221:
            java.lang.Object r1 = r6.get()
            com.google.android.libraries.search.g.a.k r1 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r1
            com.google.android.libraries.search.g.a.f r6 = r1.f101598d
            if (r6 != 0) goto L_0x022d
            com.google.android.libraries.search.g.a.f r6 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x022d:
            int r7 = r6.f101580a
            if (r7 != r3) goto L_0x0236
            java.lang.Object r6 = r6.f101581b
            com.google.android.libraries.search.g.a.u r6 = (com.google.android.libraries.search.p2998g.p2999a.C38380u) r6
            goto L_0x0238
        L_0x0236:
            com.google.android.libraries.search.g.a.u r6 = com.google.android.libraries.search.p2998g.p2999a.C38380u.f101620d
        L_0x0238:
            com.google.android.apps.gsa.search.shared.service.c.b.bb r6 = r6.f101624c
            if (r6 != 0) goto L_0x023e
            com.google.android.apps.gsa.search.shared.service.c.b.bb r6 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb.f239082a
        L_0x023e:
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.android.apps.gsa.search.shared.service.c.b.ba r6 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba) r6
            com.google.protobuf.bt r7 = com.google.android.libraries.search.p2998g.p2999a.C38378s.f101619a
            r6.mo58885m(r7, r15)
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.apps.gsa.search.shared.service.c.b.bb r6 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb) r6
            com.google.protobuf.bt r7 = com.google.android.libraries.search.p2998g.p2999a.p3001b.C38361l.f101569a
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)
            r6.mo58887l(r7)
            com.google.protobuf.bf r8 = r6.f169962ag
            com.google.protobuf.bs r7 = r7.f169971d
            boolean r7 = r8.mo58857o(r7)
            if (r7 == 0) goto L_0x0308
            com.google.protobuf.bt r7 = com.google.android.libraries.search.p2998g.p2999a.p3001b.C38361l.f101569a
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)
            r6.mo58887l(r7)
            com.google.protobuf.bf r8 = r6.f169962ag
            com.google.protobuf.bs r11 = r7.f169971d
            java.lang.Object r8 = r8.mo58854l(r11)
            if (r8 != 0) goto L_0x0278
            java.lang.Object r7 = r7.f169969b
            goto L_0x027c
        L_0x0278:
            java.lang.Object r7 = r7.mo58889c(r8)
        L_0x027c:
            com.google.android.libraries.search.g.a.b.k r7 = (com.google.android.libraries.search.p2998g.p2999a.p3001b.C38360k) r7
            java.lang.String r7 = r7.f101568b
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x0308
            android.net.Uri r8 = android.net.Uri.parse(r7)
            java.lang.String r11 = "q"
            java.lang.String r8 = r8.getQueryParameter(r11)
            r8.getClass()
            com.google.android.libraries.search.h.a.h r11 = com.google.android.libraries.search.p3003h.p3004a.C38404h.f101652g
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.libraries.search.h.a.f r11 = (com.google.android.libraries.search.p3003h.p3004a.C38402f) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.android.libraries.search.h.a.h r12 = (com.google.android.libraries.search.p3003h.p3004a.C38404h) r12
            int r13 = r12.f101654a
            r13 = r13 | r5
            r12.f101654a = r13
            r12.f101655b = r8
            r11.copyOnWrite()
            com.google.protobuf.bv r8 = r11.instance
            com.google.android.libraries.search.h.a.h r8 = (com.google.android.libraries.search.p3003h.p3004a.C38404h) r8
            r7.getClass()
            int r12 = r8.f101654a
            r12 = r12 | 8
            r8.f101654a = r12
            r8.f101659f = r7
            com.google.protobuf.bv r7 = r11.build()
            com.google.android.libraries.search.h.a.h r7 = (com.google.android.libraries.search.p3003h.p3004a.C38404h) r7
            com.google.android.libraries.search.h.a.d r8 = r14.f278440l
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r12 = "com.google.android.googlequicksearchbox.GOOGLE_SEARCH"
            r11.<init>(r12)
            android.content.Intent r7 = r8.mo41411a(r11, r7)
            if (r7 == 0) goto L_0x02da
            java.lang.String r8 = "com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION"
            r7.putExtra(r8, r3)
            java.lang.String r8 = "SKIP_EXIT_ANIMATION"
            r7.putExtra(r8, r5)
        L_0x02da:
            if (r7 == 0) goto L_0x0308
            com.google.android.libraries.search.g.a.h r2 = r1.f101597c
            if (r2 != 0) goto L_0x02e3
            com.google.android.libraries.search.g.a.h r6 = com.google.android.libraries.search.p2998g.p2999a.C38367h.f101583d
            goto L_0x02e4
        L_0x02e3:
            r6 = r2
        L_0x02e4:
            int r6 = r6.f101585a
            r6 = r6 & r3
            if (r6 == 0) goto L_0x02f3
            if (r2 != 0) goto L_0x02ed
            com.google.android.libraries.search.g.a.h r2 = com.google.android.libraries.search.p2998g.p2999a.C38367h.f101583d
        L_0x02ed:
            java.lang.String r2 = r2.f101587c
            java.lang.String r9 = com.google.android.apps.gsa.shared.util.p7174l.C91053a.m148741a(r9, r2)
        L_0x02f3:
            java.lang.String r2 = "source"
            r7.putExtra(r2, r9)
            dagger.a r2 = r14.f278439k
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.util.t.g r2 = (com.google.android.apps.gsa.shared.util.p7184t.C91097g) r2
            r2.mo65089a(r7)
            com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99499c.m165021a(r4, r5, r1, r15, r3)
            goto L_0x03a8
        L_0x0308:
            com.google.android.libraries.search.g.a.e r7 = com.google.android.libraries.search.p2998g.p2999a.C38364e.SESSION_DEEPLINK
            com.google.android.libraries.search.g.a.f r8 = r1.f101598d
            if (r8 != 0) goto L_0x0310
            com.google.android.libraries.search.g.a.f r8 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x0310:
            int r8 = r8.f101580a
            com.google.android.libraries.search.g.a.e r8 = com.google.android.libraries.search.p2998g.p2999a.C38364e.m67654a(r8)
            boolean r7 = r7.equals(r8)
            com.google.common.base.C58838bb.m90883r(r7)
            com.google.android.libraries.search.g.a.f r7 = r1.f101598d
            if (r7 != 0) goto L_0x0323
            com.google.android.libraries.search.g.a.f r7 = com.google.android.libraries.search.p2998g.p2999a.C38365f.f101578c
        L_0x0323:
            int r8 = r7.f101580a
            if (r8 != r3) goto L_0x032c
            java.lang.Object r7 = r7.f101581b
            com.google.android.libraries.search.g.a.u r7 = (com.google.android.libraries.search.p2998g.p2999a.C38380u) r7
            goto L_0x032e
        L_0x032c:
            com.google.android.libraries.search.g.a.u r7 = com.google.android.libraries.search.p2998g.p2999a.C38380u.f101620d
        L_0x032e:
            java.lang.String r7 = com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99497a.m165019a(r7)
            if (r7 != 0) goto L_0x034a
            com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99499c.m165021a(r4, r2, r1, r15, r3)
            com.google.common.f.e r15 = f278431a
            com.google.common.f.x r15 = r15.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r15.mo56378ag(r1, r10)
            java.lang.String r1 = "Unsupported SessionType in SessionDeeplink. This should never happen"
            r2 = 19252(0x4b34, float:2.6978E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r2)).mo56386p(r1)
            goto L_0x03a8
        L_0x034a:
            dagger.a r8 = r14.f278434f     // Catch:{ o -> 0x035b }
            java.lang.Object r8 = r8.mo27525b()     // Catch:{ o -> 0x035b }
            com.google.android.apps.gsa.search.core.service.e.q r8 = (com.google.android.apps.gsa.search.core.service.p6848e.C86695q) r8     // Catch:{ o -> 0x035b }
            r8.mo80275j(r7, r6)     // Catch:{ o -> 0x035b }
            com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99499c.m165021a(r4, r5, r1, r15, r3)
            goto L_0x03a8
        L_0x0359:
            r0 = move-exception
            goto L_0x0392
        L_0x035b:
            r5 = move-exception
            com.google.android.apps.gsa.search.core.i.t r6 = r14.f278432b     // Catch:{ all -> 0x0359 }
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C89968ag.f246505e     // Catch:{ all -> 0x0359 }
            boolean r6 = r6.mo79746e(r7)     // Catch:{ all -> 0x0359 }
            if (r6 == 0) goto L_0x037c
            com.google.common.f.e r6 = f278431a     // Catch:{ all -> 0x0359 }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x0359 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0359 }
            r6.mo56378ag(r7, r10)     // Catch:{ all -> 0x0359 }
            java.lang.String r7 = "Deeplink session not found, falling back"
            r8 = 19254(0x4b36, float:2.698E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r5)).mo56372aa(r8)).mo56386p(r7)     // Catch:{ all -> 0x0359 }
            r14.m165031e(r0, r1)     // Catch:{ all -> 0x0359 }
            goto L_0x038e
        L_0x037c:
            com.google.common.f.e r6 = f278431a     // Catch:{ all -> 0x0359 }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x0359 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0359 }
            r6.mo56378ag(r7, r10)     // Catch:{ all -> 0x0359 }
            java.lang.String r7 = "Deeplink session not found, fallback disabled."
            r8 = 19253(0x4b35, float:2.6979E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r5)).mo56372aa(r8)).mo56386p(r7)     // Catch:{ all -> 0x0359 }
        L_0x038e:
            com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99499c.m165021a(r4, r2, r1, r15, r3)
            goto L_0x03a8
        L_0x0392:
            com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99499c.m165021a(r4, r2, r1, r15, r3)
            throw r0
        L_0x0396:
            java.lang.Object r1 = r6.get()
            com.google.android.libraries.search.g.a.k r1 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r1
            r14.m165031e(r0, r1)
            java.lang.Object r1 = r6.get()
            com.google.android.libraries.search.g.a.k r1 = (com.google.android.libraries.search.p2998g.p2999a.C38370k) r1
            com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99499c.m165021a(r4, r2, r1, r15, r3)
        L_0x03a8:
            if (r0 == 0) goto L_0x03b8
            com.google.android.libraries.gsa.k.g r15 = r14.f278438j
            com.google.android.apps.gsa.staticplugins.deeplink.e.c r1 = new com.google.android.apps.gsa.staticplugins.deeplink.e.c
            r1.<init>(r0)
            java.lang.String r0 = "b/120556101 band-aid-fix"
            r2 = 2000(0x7d0, double:9.88E-321)
            r15.mo28213m(r0, r2, r1)
        L_0x03b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.deeplink.p7793e.C99503d.mo78403a(com.google.android.libraries.search.g.a.p):void");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}

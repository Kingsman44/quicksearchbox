package com.google.android.apps.gsa.staticplugins.p7714cv.p7719c;

import android.content.Context;
import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.speech.hotword.p7289d.C92375a;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7724h.C98784k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.c.d */
/* compiled from: PG */
public final class C98721d implements C84295m {

    /* renamed from: a */
    public static final C59071e f275751a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.c.d");

    /* renamed from: b */
    public final C58833ax f275752b;

    /* renamed from: c */
    private final C92216a f275753c;

    /* renamed from: d */
    private final C90536a f275754d;

    /* renamed from: e */
    private final AtomicBoolean f275755e = new AtomicBoolean(false);

    /* renamed from: f */
    private final C98784k f275756f;

    /* renamed from: g */
    private final C86124t f275757g;

    /* renamed from: h */
    private final C92375a f275758h;

    /* renamed from: i */
    private final C68214a f275759i;

    /* renamed from: j */
    private final C22871g f275760j;

    public C98721d(C92216a aVar, C90536a aVar2, C98784k kVar, boolean z, Context context, C21370a aVar3, C86124t tVar, C92375a aVar4, C68214a aVar5, C22871g gVar) {
        this.f275753c = aVar;
        this.f275754d = aVar2;
        this.f275756f = kVar;
        this.f275757g = tVar;
        this.f275758h = aVar4;
        this.f275759i = aVar5;
        this.f275760j = gVar;
        this.f275752b = z ? C58833ax.m90834k(new C98731n(context, aVar3)) : C58836b.f156633a;
    }

    /* renamed from: a */
    public final void mo77831a(C90523o oVar) {
        if (!this.f275755e.getAndSet(true)) {
            this.f275753c.mo70939a(oVar);
        }
    }

    /* renamed from: c */
    public final void mo77832c(C90523o oVar) {
        if (!this.f275755e.get()) {
            this.f275753c.mo70940b(oVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:339:0x075f  */
    /* JADX WARNING: Removed duplicated region for block: B:368:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77833d(com.google.speech.p5208h.C66611ci r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r0 = r2.f181209b
            com.google.speech.h.ch r0 = com.google.speech.p5208h.C66610ch.m97260a(r0)
            if (r0 != 0) goto L_0x0010
            com.google.speech.h.ch r0 = com.google.speech.p5208h.C66610ch.IN_PROGRESS
        L_0x0010:
            int r0 = r0.f181205e
            int r0 = r2.f181209b
            com.google.speech.h.ch r0 = com.google.speech.p5208h.C66610ch.m97260a(r0)
            if (r0 != 0) goto L_0x001c
            com.google.speech.h.ch r0 = com.google.speech.p5208h.C66610ch.IN_PROGRESS
        L_0x001c:
            com.google.speech.h.ch r3 = com.google.speech.p5208h.C66610ch.DONE_ERROR
            if (r0 != r3) goto L_0x0024
            int r0 = r2.f181210c
            java.lang.String r0 = r2.f181211d
        L_0x0024:
            com.google.protobuf.bt r0 = com.google.speech.p5208h.C66624cv.f181248e
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r3 = r2.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r3.mo58857o(r0)
            if (r0 == 0) goto L_0x0055
            com.google.protobuf.bt r0 = com.google.speech.p5208h.C66624cv.f181248e
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r3 = r2.f169962ag
            com.google.protobuf.bs r4 = r0.f169971d
            java.lang.Object r3 = r3.mo58854l(r4)
            if (r3 != 0) goto L_0x004d
            java.lang.Object r0 = r0.f169969b
            goto L_0x0051
        L_0x004d:
            java.lang.Object r0 = r0.mo58889c(r3)
        L_0x0051:
            com.google.speech.h.cv r0 = (com.google.speech.p5208h.C66624cv) r0
            boolean r0 = r0.f181251b
        L_0x0055:
            com.google.protobuf.bt r0 = com.google.speech.p5208h.C66629d.f181275b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r3 = r2.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r3.mo58857o(r0)
            r3 = 4
            r4 = 1
            if (r0 == 0) goto L_0x0177
            com.google.protobuf.bt r0 = com.google.speech.p5208h.C66629d.f181275b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r5 = r2.f169962ag
            com.google.protobuf.bs r6 = r0.f169971d
            java.lang.Object r5 = r5.mo58854l(r6)
            if (r5 != 0) goto L_0x0080
            java.lang.Object r0 = r0.f169969b
            goto L_0x0084
        L_0x0080:
            java.lang.Object r0 = r0.mo58889c(r5)
        L_0x0084:
            com.google.assistant.e.e.a.j r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "AssistantResponse["
            r5.<init>(r6)
            int r6 = r0.f133266a
            r6 = r6 & r3
            java.lang.String r7 = "]"
            if (r6 == 0) goto L_0x00ba
            com.google.assistant.e.e.a.i r6 = r0.f133270e
            if (r6 != 0) goto L_0x009a
            com.google.assistant.e.e.a.i r6 = com.google.assistant.p3897e.p3910e.p3911a.C51194i.f133258e
        L_0x009a:
            java.lang.String r8 = "Metadata[type:"
            r5.append(r8)
            int r6 = r6.f133263d
            int r6 = com.google.assistant.p3897e.p3910e.p3911a.C51193h.m86083a(r6)
            if (r6 != 0) goto L_0x00a8
            r6 = 1
        L_0x00a8:
            int r6 = r6 + -1
            if (r6 == r4) goto L_0x00b2
            java.lang.String r6 = "UNDEFINED"
            r5.append(r6)
            goto L_0x00b7
        L_0x00b2:
            java.lang.String r6 = "CONTEXTUAL_CARDS"
            r5.append(r6)
        L_0x00b7:
            r5.append(r7)
        L_0x00ba:
            com.google.protobuf.cq r6 = r0.f133269d
            int r6 = r6.size()
            if (r6 == 0) goto L_0x0174
            java.lang.String r6 = "OpaSuggestions["
            r5.append(r6)
            com.google.protobuf.cq r0 = r0.f133269d
            java.util.Iterator r0 = r0.iterator()
        L_0x00cd:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0171
            java.lang.Object r6 = r0.next()
            com.google.assistant.e.e.a.p r6 = (com.google.assistant.p3897e.p3910e.p3911a.C51201p) r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "OpaSuggestion[type:"
            r8.<init>(r9)
            int r9 = r6.f133293b
            int r9 = com.google.assistant.p3897e.p3910e.p3911a.C51200o.m86084a(r9)
            if (r9 != 0) goto L_0x00e9
            r9 = 1
        L_0x00e9:
            int r9 = r9 + -1
            if (r9 == 0) goto L_0x00fb
            if (r9 == r4) goto L_0x00f5
            java.lang.String r9 = "SCREEN_SEARCH_GREETING"
            r8.append(r9)
            goto L_0x0100
        L_0x00f5:
            java.lang.String r9 = "SCREEN_SEARCH"
            r8.append(r9)
            goto L_0x0100
        L_0x00fb:
            java.lang.String r9 = "DEFAULT"
            r8.append(r9)
        L_0x0100:
            java.lang.String r9 = ",displayed_text:"
            r8.append(r9)
            java.lang.String r9 = r6.f133294c
            r8.append(r9)
            int r9 = r6.f133292a
            r9 = r9 & 8
            if (r9 == 0) goto L_0x0165
            java.lang.String r9 = ",ActionSuggestion["
            r8.append(r9)
            com.google.protos.au.h r6 = r6.f133295d
            if (r6 != 0) goto L_0x011b
            com.google.protos.au.h r6 = com.google.protos.p4892au.C63830h.f172621c
        L_0x011b:
            com.google.protobuf.cq r6 = r6.f172624b
            java.util.Iterator r6 = r6.iterator()
        L_0x0121:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x0162
            java.lang.Object r9 = r6.next()
            com.google.protos.au.d r9 = (com.google.protos.p4892au.C63826d) r9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Action[package_id:"
            r10.<init>(r11)
            java.lang.String r11 = r9.f172616c
            r10.append(r11)
            java.lang.String r11 = ",text:"
            r10.append(r11)
            java.lang.String r11 = r9.f172617d
            r10.append(r11)
            java.lang.String r11 = ",action_uri:"
            r10.append(r11)
            java.lang.String r11 = r9.f172618e
            r10.append(r11)
            java.lang.String r11 = ",icon_uri:"
            r10.append(r11)
            java.lang.String r9 = r9.f172619f
            r10.append(r9)
            r10.append(r7)
            java.lang.String r9 = r10.toString()
            r8.append(r9)
            goto L_0x0121
        L_0x0162:
            r8.append(r7)
        L_0x0165:
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            r5.append(r6)
            goto L_0x00cd
        L_0x0171:
            r5.append(r7)
        L_0x0174:
            r5.append(r7)
        L_0x0177:
            com.google.protobuf.bt r0 = com.google.speech.p5224k.p5225a.C67186ad.f182611f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r5 = r2.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r5.mo58857o(r0)
            if (r0 == 0) goto L_0x01ab
            com.google.protobuf.bt r0 = com.google.speech.p5224k.p5225a.C67186ad.f182611f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r5 = r2.f169962ag
            com.google.protobuf.bs r6 = r0.f169971d
            java.lang.Object r5 = r5.mo58854l(r6)
            if (r5 != 0) goto L_0x01a0
            java.lang.Object r0 = r0.f169969b
            goto L_0x01a4
        L_0x01a0:
            java.lang.Object r0 = r0.mo58889c(r5)
        L_0x01a4:
            com.google.speech.k.a.ad r0 = (com.google.speech.p5224k.p5225a.C67186ad) r0
            com.google.protobuf.z r0 = r0.f182614b
            r0.mo59031d()
        L_0x01ab:
            com.google.protobuf.bt r0 = com.google.speech.p5224k.p5225a.C67238p.f182737f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r5 = r2.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r5.mo58857o(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0267
            com.google.protobuf.bt r0 = com.google.speech.p5224k.p5225a.C67238p.f182737f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r6 = r2.f169962ag
            com.google.protobuf.bs r7 = r0.f169971d
            java.lang.Object r6 = r6.mo58854l(r7)
            if (r6 != 0) goto L_0x01d5
            java.lang.Object r0 = r0.f169969b
            goto L_0x01d9
        L_0x01d5:
            java.lang.Object r0 = r0.mo58889c(r6)
        L_0x01d9:
            com.google.speech.k.a.p r0 = (com.google.speech.p5224k.p5225a.C67238p) r0
            int r6 = r0.f182740b
            if (r6 != r4) goto L_0x0267
            java.lang.Object r0 = r0.f182741c
            com.google.speech.recognizer.a.ag r0 = (com.google.speech.recognizer.p5233a.C67438ag) r0
            int r6 = r0.f183260c
            com.google.speech.recognizer.a.ao r6 = com.google.speech.recognizer.p5233a.C67446ao.m97470a(r6)
            if (r6 != 0) goto L_0x01ed
            com.google.speech.recognizer.a.ao r6 = com.google.speech.recognizer.p5233a.C67446ao.STATUS_SUCCESS
        L_0x01ed:
            int r6 = r6.f183298f
            int r6 = r0.f183259b
            int r6 = r0.f183258a
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0229
            com.google.speech.recognizer.a.x r6 = r0.f183262e
            if (r6 != 0) goto L_0x01fd
            com.google.speech.recognizer.a.x r6 = com.google.speech.recognizer.p5233a.C67476x.f183390i
        L_0x01fd:
            com.google.protobuf.cq r6 = r6.f183393b
            int r6 = r6.size()
            r7 = 0
        L_0x0204:
            if (r7 >= r6) goto L_0x0219
            com.google.speech.recognizer.a.x r8 = r0.f183262e
            if (r8 != 0) goto L_0x020c
            com.google.speech.recognizer.a.x r8 = com.google.speech.recognizer.p5233a.C67476x.f183390i
        L_0x020c:
            com.google.protobuf.cq r8 = r8.f183393b
            java.lang.Object r8 = r8.get(r7)
            com.google.speech.recognizer.a.v r8 = (com.google.speech.recognizer.p5233a.C67474v) r8
            java.lang.String r8 = r8.f183387b
            int r7 = r7 + 1
            goto L_0x0204
        L_0x0219:
            com.google.speech.recognizer.a.x r6 = r0.f183262e
            if (r6 != 0) goto L_0x0220
            com.google.speech.recognizer.a.x r7 = com.google.speech.recognizer.p5233a.C67476x.f183390i
            goto L_0x0221
        L_0x0220:
            r7 = r6
        L_0x0221:
            long r7 = r7.f183394c
            if (r6 != 0) goto L_0x0227
            com.google.speech.recognizer.a.x r6 = com.google.speech.recognizer.p5233a.C67476x.f183390i
        L_0x0227:
            long r6 = r6.f183395d
        L_0x0229:
            int r6 = r0.f183258a
            r6 = r6 & r3
            if (r6 == 0) goto L_0x0267
            com.google.speech.recognizer.a.ak r6 = r0.f183261d
            if (r6 != 0) goto L_0x0234
            com.google.speech.recognizer.a.ak r6 = com.google.speech.recognizer.p5233a.C67442ak.f183276i
        L_0x0234:
            com.google.protobuf.cq r6 = r6.f183281d
            r6.size()
            com.google.speech.recognizer.a.ak r6 = r0.f183261d
            if (r6 != 0) goto L_0x023f
            com.google.speech.recognizer.a.ak r6 = com.google.speech.recognizer.p5233a.C67442ak.f183276i
        L_0x023f:
            com.google.protobuf.cq r6 = r6.f183281d
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0257
            com.google.speech.recognizer.a.ak r6 = r0.f183261d
            if (r6 != 0) goto L_0x024d
            com.google.speech.recognizer.a.ak r6 = com.google.speech.recognizer.p5233a.C67442ak.f183276i
        L_0x024d:
            com.google.protobuf.cq r6 = r6.f183281d
            java.lang.Object r6 = r6.get(r5)
            com.google.speech.recognizer.a.p r6 = (com.google.speech.recognizer.p5233a.C67468p) r6
            java.lang.String r6 = r6.f183367b
        L_0x0257:
            com.google.speech.recognizer.a.ak r0 = r0.f183261d
            if (r0 != 0) goto L_0x025e
            com.google.speech.recognizer.a.ak r6 = com.google.speech.recognizer.p5233a.C67442ak.f183276i
            goto L_0x025f
        L_0x025e:
            r6 = r0
        L_0x025f:
            long r6 = r6.f183279b
            if (r0 != 0) goto L_0x0265
            com.google.speech.recognizer.a.ak r0 = com.google.speech.recognizer.p5233a.C67442ak.f183276i
        L_0x0265:
            long r6 = r0.f183280c
        L_0x0267:
            com.google.protobuf.bt r0 = com.google.speech.p5224k.p5225a.C67209b.f182667e
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r6 = r2.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r6.mo58857o(r0)
            r6 = 2
            if (r0 == 0) goto L_0x02af
            com.google.protobuf.bt r0 = com.google.speech.p5224k.p5225a.C67209b.f182667e
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r7 = r2.f169962ag
            com.google.protobuf.bs r8 = r0.f169971d
            java.lang.Object r7 = r7.mo58854l(r8)
            if (r7 != 0) goto L_0x0291
            java.lang.Object r0 = r0.f169969b
            goto L_0x0295
        L_0x0291:
            java.lang.Object r0 = r0.mo58889c(r7)
        L_0x0295:
            com.google.speech.k.a.b r0 = (com.google.speech.p5224k.p5225a.C67209b) r0
            int r7 = r0.f182669a
            r8 = r7 & 1
            if (r8 == 0) goto L_0x02a7
            com.google.bb.a.hi r0 = r0.f182670b
            if (r0 != 0) goto L_0x02a3
            com.google.bb.a.hi r0 = com.google.p4152bb.p4153a.C55140hi.f145150b
        L_0x02a3:
            r0.toString()
            goto L_0x02af
        L_0x02a7:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x02af
            com.google.protobuf.z r0 = r0.f182671c
            r0.mo59031d()
        L_0x02af:
            com.google.android.apps.gsa.speech.hotword.d.a r7 = r1.f275758h
            com.google.protobuf.bt r0 = com.google.speech.p5208h.C66629d.f181275b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r8 = r2.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r8.mo58857o(r0)
            if (r0 != 0) goto L_0x02c6
            goto L_0x05fa
        L_0x02c6:
            com.google.protobuf.bt r0 = com.google.speech.p5208h.C66629d.f181275b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r9 = r2.f169962ag
            com.google.protobuf.bs r10 = r0.f169971d
            java.lang.Object r9 = r9.mo58854l(r10)
            if (r9 != 0) goto L_0x02dc
            java.lang.Object r0 = r0.f169969b
            goto L_0x02e0
        L_0x02dc:
            java.lang.Object r0 = r0.mo58889c(r9)
        L_0x02e0:
            r9 = r0
            com.google.assistant.e.e.a.j r9 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r9
            int r0 = r9.f133266a
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x02f8
            com.google.assistant.e.j.en r0 = r9.f133275j
            if (r0 != 0) goto L_0x02ef
            com.google.assistant.e.j.en r0 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x02ef:
            com.google.assistant.e.j.ex r0 = r0.f136685e
            if (r0 != 0) goto L_0x02f5
            com.google.assistant.e.j.ex r0 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x02f5:
            com.google.protobuf.cq r0 = r0.f136712a
            goto L_0x0300
        L_0x02f8:
            com.google.assistant.e.j.ex r0 = r9.f133273h
            if (r0 != 0) goto L_0x02fe
            com.google.assistant.e.j.ex r0 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x02fe:
            com.google.protobuf.cq r0 = r0.f136712a
        L_0x0300:
            java.util.Iterator r0 = r0.iterator()
        L_0x0304:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x0365
            java.lang.Object r10 = r0.next()
            com.google.assistant.e.j.kc r10 = (com.google.assistant.p3897e.p3921j.C52232kc) r10
            java.lang.String r11 = "asst.response.logging.params"
            java.lang.String r12 = r10.f137065b
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0304
            com.google.assistant.e.j.ka r11 = r10.f137066c
            if (r11 != 0) goto L_0x0320
            com.google.assistant.e.j.ka r11 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x0320:
            java.lang.String r12 = "assistant.api.params.ResponseLoggingParams"
            java.lang.String r11 = r11.f137060b
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0304
            com.google.assistant.e.j.ka r0 = r10.f137066c     // Catch:{ ct -> 0x034d }
            if (r0 != 0) goto L_0x0330
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x034d }
        L_0x0330:
            com.google.protobuf.z r0 = r0.f137061c     // Catch:{ ct -> 0x034d }
            com.google.assistant.e.i.a.lq r10 = com.google.assistant.p3897e.p3917i.p3918a.C51544lq.f134342j     // Catch:{ ct -> 0x034d }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r10, (com.google.protobuf.C63088z) r0)     // Catch:{ ct -> 0x034d }
            com.google.assistant.e.i.a.lq r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51544lq) r0     // Catch:{ ct -> 0x034d }
            int r10 = r0.f134344a     // Catch:{ ct -> 0x034d }
            r10 = r10 & r6
            if (r10 == 0) goto L_0x034a
            com.google.assistant.e.i.a.ln r0 = r0.f134345b     // Catch:{ ct -> 0x034d }
            if (r0 != 0) goto L_0x0345
            com.google.assistant.e.i.a.ln r0 = com.google.assistant.p3897e.p3917i.p3918a.C51541ln.f134330c     // Catch:{ ct -> 0x034d }
        L_0x0345:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ ct -> 0x034d }
            goto L_0x0367
        L_0x034a:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a     // Catch:{ ct -> 0x034d }
            goto L_0x0367
        L_0x034d:
            r0 = move-exception
            com.google.common.f.e r10 = com.google.android.apps.gsa.speech.hotword.p7289d.C92375a.f257589a
            com.google.common.f.x r10 = r10.mo56225c()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r12 = "ServerHotwordRespHdlr"
            r10.mo56378ag(r11, r12)
            java.lang.String r11 = "ConversationProto could not be parsed"
            r12 = 12594(0x3132, float:1.7648E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56382g(r0)).mo56372aa(r12)).mo56386p(r11)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x0367
        L_0x0365:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0367:
            boolean r10 = r0.mo56113h()
            if (r10 == 0) goto L_0x05fa
            java.lang.String r10 = r9.f133277l
            int r10 = r10.length()
            long r10 = (long) r10
            com.google.android.apps.gsa.shared.m.c r12 = r7.f257593e
            com.google.android.apps.gsa.shared.m.f r13 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250057dn
            long r12 = r12.mo79743a(r13)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0382
            r10 = 1
            goto L_0x0383
        L_0x0382:
            r10 = 0
        L_0x0383:
            com.google.android.apps.gsa.shared.speech.hotword.q r11 = r7.f257590b
            java.lang.Object r12 = r0.mo56107c()
            com.google.assistant.e.i.a.ln r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51541ln) r12
            r11.mo84741a(r12, r9)
            java.lang.Object r9 = r0.mo56107c()
            com.google.assistant.e.i.a.ln r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51541ln) r9
            int r9 = r9.f134332a
            r9 = r9 & r6
            if (r9 == 0) goto L_0x0462
            com.google.android.apps.gsa.shared.speech.dumper.ag r9 = r7.f257594f
            com.google.android.libraries.f.a r11 = r7.f257595g
            long r11 = r11.mo26870b()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.Object r12 = r0.mo56107c()
            com.google.assistant.e.i.a.ln r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51541ln) r12
            int r12 = r12.f134333b
            int r12 = com.google.assistant.p3897e.p3917i.p3918a.C51540lm.m86213a(r12)
            if (r12 != 0) goto L_0x03b4
            r12 = 1
        L_0x03b4:
            int r12 = r12 + -1
            r13 = 3
            if (r12 == r4) goto L_0x03bf
            if (r12 == r6) goto L_0x03bd
            r12 = 4
            goto L_0x03c0
        L_0x03bd:
            r12 = 3
            goto L_0x03c0
        L_0x03bf:
            r12 = 2
        L_0x03c0:
            if (r10 == 0) goto L_0x03c3
            r13 = 2
        L_0x03c3:
            com.google.android.libraries.storage.protostore.ab r14 = r9.f253129b
            com.google.common.util.concurrent.cx r14 = r14.mo46042d()
            java.lang.Object r14 = com.google.common.util.concurrent.C60856cj.m92910s(r14)
            com.google.common.o.yr r14 = (com.google.common.p4552o.C60675yr) r14
            com.google.protobuf.cq r14 = r14.f164608l
            java.util.Iterator r14 = r14.iterator()
            r15 = 0
        L_0x03d6:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x0460
            java.lang.Object r16 = r14.next()
            r8 = r16
            com.google.common.o.yo r8 = (com.google.common.p4552o.C60672yo) r8
            long r5 = r8.f164591b
            long r17 = r11.longValue()
            long r17 = r17 - r5
            r19 = 6000(0x1770, double:2.9644E-320)
            int r21 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r21 > 0) goto L_0x0458
            int r3 = r8.f164592c
            int r3 = com.google.common.p4552o.C60671yn.m92632a(r3)
            if (r3 != 0) goto L_0x03fb
            goto L_0x0458
        L_0x03fb:
            r4 = 5
            if (r3 != r4) goto L_0x0458
            int r3 = r8.f164593d
            int r3 = com.google.common.p4552o.C60671yn.m92632a(r3)
            if (r3 == 0) goto L_0x0458
            if (r3 != r4) goto L_0x0458
            com.google.common.o.yo r3 = com.google.common.p4552o.C60672yo.f164588e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.yl r3 = (com.google.common.p4552o.C60669yl) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.yo r4 = (com.google.common.p4552o.C60672yo) r4
            int r8 = r4.f164590a
            r11 = 1
            r8 = r8 | r11
            r4.f164590a = r8
            r4.f164591b = r5
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.yo r4 = (com.google.common.p4552o.C60672yo) r4
            int r12 = r12 + -1
            r4.f164592c = r12
            int r5 = r4.f164590a
            r6 = 2
            r5 = r5 | r6
            r4.f164590a = r5
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.yo r4 = (com.google.common.p4552o.C60672yo) r4
            int r13 = r13 + -1
            r4.f164593d = r13
            int r5 = r4.f164590a
            r6 = 4
            r5 = r5 | r6
            r4.f164590a = r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.common.o.yo r3 = (com.google.common.p4552o.C60672yo) r3
            com.google.android.libraries.storage.protostore.ab r4 = r9.f253129b
            com.google.android.apps.gsa.shared.speech.dumper.x r5 = new com.google.android.apps.gsa.shared.speech.dumper.x
            r5.<init>(r15, r3)
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r3 = r4.mo46039a(r5, r3)
            com.google.android.apps.gsa.p8883x.C118826c.m197213c(r3)
            goto L_0x0462
        L_0x0458:
            int r15 = r15 + 1
            r3 = 4
            r4 = 1
            r5 = 0
            r6 = 2
            goto L_0x03d6
        L_0x0460:
            com.google.android.apps.gsa.x.c r3 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
        L_0x0462:
            com.google.android.apps.gsa.shared.m.b.f r3 = r7.f257591c
            boolean r3 = r3.mo83846I()
            if (r3 == 0) goto L_0x05fa
            com.google.android.apps.gsa.speech.audio.g r3 = r7.f257592d
            com.google.android.apps.gsa.speech.audio.e r4 = com.google.android.apps.gsa.speech.audio.C92185e.f257011b
            com.google.android.apps.gsa.speech.audio.f r3 = r3.mo86868a(r4)
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.i.a.ln r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51541ln) r0
            int r0 = r0.f134333b
            int r0 = com.google.assistant.p3897e.p3917i.p3918a.C51540lm.m86213a(r0)
            if (r0 != 0) goto L_0x0482
        L_0x0480:
            r0 = 0
            goto L_0x0488
        L_0x0482:
            r4 = 2
            if (r0 != r4) goto L_0x0480
            if (r10 == 0) goto L_0x0480
            r0 = 1
        L_0x0488:
            com.google.android.apps.gsa.shared.m.b.f r4 = r7.f257591c
            java.lang.String r4 = r4.mo83886af()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            com.google.android.apps.gsa.speech.audio.d r6 = com.google.android.apps.gsa.speech.audio.C92173d.OK_HEY_GOOGLE_ADAPTATION_PENDING
            java.util.Map r6 = r3.mo86862i(r4, r6)
            com.google.android.apps.gsa.speech.audio.d r7 = com.google.android.apps.gsa.speech.audio.C92173d.OK_HEY_GOOGLE_ADAPTATION_PENDING
            java.lang.String r7 = r7.name()
            java.lang.Object r6 = r6.get(r7)
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x04bf
            com.google.common.f.e r4 = com.google.android.apps.gsa.speech.audio.C92195f.f257041a
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r6 = "There are no pending adaptation utterances. shouldAdapt: %b"
            r7 = 12056(0x2f18, float:1.6894E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56389s(r6, r5)
            if (r0 == 0) goto L_0x04b8
            com.google.android.apps.gsa.u.b r0 = com.google.android.apps.gsa.p8852u.C118569b.SPEAKER_ID_ADAPTATION_PROCESSING_NO_UTTERANCES_ERROR_COUNT
            goto L_0x04ba
        L_0x04b8:
            com.google.android.apps.gsa.u.b r0 = com.google.android.apps.gsa.p8852u.C118569b.SPEAKER_ID_ADAPTATION_PROCESSING_ADAPT_FALSE_WITH_NO_UTTERANCE
        L_0x04ba:
            r3.mo86866m(r0)
            goto L_0x05fa
        L_0x04bf:
            int r7 = r6.size()
            java.lang.String r8 = "Couldn't delete utterance."
            r9 = 2
            if (r7 < r9) goto L_0x04fc
            com.google.common.f.e r0 = com.google.android.apps.gsa.speech.audio.C92195f.f257041a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r4 = "There are multiple adaptation utterances. shouldAdapt: %b"
            r7 = 12054(0x2f16, float:1.6891E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56389s(r4, r5)
            com.google.android.apps.gsa.u.b r0 = com.google.android.apps.gsa.p8852u.C118569b.SPEAKER_ID_ADAPTATION_PROCESSING_MULTIPLE_UTTERANCES_ERROR_COUNT
            r3.mo86866m(r0)
            java.util.Iterator r0 = r6.iterator()
        L_0x04de:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x05fa
            java.lang.Object r3 = r0.next()
            java.io.File r3 = (java.io.File) r3
            boolean r3 = r3.delete()
            if (r3 != 0) goto L_0x04de
            com.google.common.f.e r3 = com.google.android.apps.gsa.speech.audio.C92195f.f257041a
            com.google.common.f.x r3 = r3.mo56225c()
            r4 = 12055(0x2f17, float:1.6893E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r4)).mo56386p(r8)
            goto L_0x04de
        L_0x04fc:
            if (r0 != 0) goto L_0x051d
            com.google.android.apps.gsa.u.b r0 = com.google.android.apps.gsa.p8852u.C118569b.SPEAKER_ID_ADAPTATION_PROCESSING_ADAPT_FALSE
            r3.mo86866m(r0)
            r3 = 0
            java.lang.Object r0 = r6.get(r3)
            java.io.File r0 = (java.io.File) r0
            boolean r0 = r0.delete()
            if (r0 != 0) goto L_0x05fa
            com.google.common.f.e r0 = com.google.android.apps.gsa.speech.audio.C92195f.f257041a
            com.google.common.f.x r0 = r0.mo56225c()
            r3 = 12053(0x2f15, float:1.689E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r8)
            goto L_0x05fa
        L_0x051d:
            com.google.android.apps.gsa.speech.audio.d r0 = com.google.android.apps.gsa.speech.audio.C92173d.OK_HEY_GOOGLE_ADAPTATION_VERIFIED
            java.io.File r0 = r3.mo86858e(r4, r0)
            r5 = 0
            java.lang.Object r7 = r6.get(r5)
            java.io.File r7 = (java.io.File) r7
            boolean r0 = r7.renameTo(r0)
            if (r0 != 0) goto L_0x055b
            com.google.common.f.e r0 = com.google.android.apps.gsa.speech.audio.C92195f.f257041a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r4 = "Couldn't rename utterance, attempting to delete."
            r7 = 12051(0x2f13, float:1.6887E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56386p(r4)
            com.google.android.apps.gsa.u.b r0 = com.google.android.apps.gsa.p8852u.C118569b.SPEAKER_ID_ADAPTATION_PROCESSING_FILE_ERROR_COUNT
            r3.mo86866m(r0)
            java.lang.Object r0 = r6.get(r5)
            java.io.File r0 = (java.io.File) r0
            boolean r0 = r0.delete()
            if (r0 != 0) goto L_0x05fa
            com.google.common.f.e r0 = com.google.android.apps.gsa.speech.audio.C92195f.f257041a
            com.google.common.f.x r0 = r0.mo56225c()
            r3 = 12052(0x2f14, float:1.6888E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r8)
            goto L_0x05fa
        L_0x055b:
            com.google.android.apps.gsa.u.b r0 = com.google.android.apps.gsa.p8852u.C118569b.SPEAKER_ID_ADAPTATION_PROCESSING_COMPLETE
            r3.mo86866m(r0)
            com.google.android.apps.gsa.speech.audio.d r0 = com.google.android.apps.gsa.speech.audio.C92173d.OK_HEY_GOOGLE_ADAPTATION_VERIFIED
            java.util.Map r0 = r3.mo86862i(r4, r0)
            com.google.android.apps.gsa.speech.audio.d r5 = com.google.android.apps.gsa.speech.audio.C92173d.OK_HEY_GOOGLE_ADAPTATION_VERIFIED
            java.lang.String r5 = r5.name()
            java.lang.Object r0 = r0.get(r5)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x05fa
            int r0 = r0.size()
            r5 = 4
            if (r0 <= r5) goto L_0x05fa
            com.google.android.apps.gsa.speech.audio.d r0 = com.google.android.apps.gsa.speech.audio.C92173d.OK_HEY_GOOGLE_ADAPTATION_VERIFIED
            java.util.Map r4 = r3.mo86862i(r4, r0)
            java.lang.String r0 = r0.name()
            java.lang.Object r0 = r4.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x058f
            r5 = 0
            goto L_0x05e0
        L_0x058f:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.google.android.apps.gsa.speech.audio.e r4 = r3.f257044d
            java.lang.String r4 = r4.f257013d
            java.lang.String r4 = java.util.regex.Pattern.quote(r4)
            r6 = 0
            r5[r6] = r4
            java.lang.String r4 = "^([0-9]*)\\-(.*)\\-(.*)\\.%s$"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
            r6 = 0
        L_0x05ad:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x05e0
            java.lang.Object r7 = r0.next()
            java.io.File r7 = (java.io.File) r7
            java.lang.String r8 = r7.getName()
            java.util.regex.Matcher r8 = r4.matcher(r8)
            boolean r9 = r8.matches()
            if (r9 == 0) goto L_0x05ad
            r9 = 1
            java.lang.String r8 = r8.group(r9)
            if (r6 == 0) goto L_0x05da
            long r9 = java.lang.Long.parseLong(r8)
            long r11 = r6.longValue()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x05ad
        L_0x05da:
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r5 = r7
            goto L_0x05ad
        L_0x05e0:
            if (r5 == 0) goto L_0x05ed
            boolean r0 = r5.delete()
            if (r0 != 0) goto L_0x05e9
            goto L_0x05ed
        L_0x05e9:
            com.google.android.apps.gsa.u.b r0 = com.google.android.apps.gsa.p8852u.C118569b.SPEAKER_ID_ADAPTATION_PROCESSING_DELETE_OLD_UTTERANCE
            goto L_0x04ba
        L_0x05ed:
            com.google.common.f.e r0 = com.google.android.apps.gsa.speech.audio.C92195f.f257041a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r3 = "Encountered error deleting adaptation file."
            r4 = 12048(0x2f10, float:1.6883E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
        L_0x05fa:
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f275757g
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C89978aq.f246614m
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x0634
            dagger.a r0 = r1.f275759i
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0634
            dagger.a r0 = r1.f275759i
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.q.a.g r0 = (com.google.android.apps.gsa.p6482q.p6483a.C84234g) r0
            com.google.common.util.concurrent.cx r0 = r0.mo77710b(r2)
            com.google.android.libraries.gsa.k.g r3 = r1.f275760j
            com.google.android.apps.gsa.staticplugins.cv.c.b r4 = com.google.android.apps.gsa.staticplugins.p7714cv.p7719c.C98719b.f275749a
            com.google.android.apps.gsa.shared.util.c.ag r5 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r6 = "cache S3 response"
            r5.<init>(r0, r3, r6, r4)
            com.google.android.apps.gsa.staticplugins.cv.c.c r0 = com.google.android.apps.gsa.staticplugins.p7714cv.p7719c.C98720c.f275750a
            r5.mo85223a(r0)
        L_0x0634:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f275755e
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x064c
            int r0 = r2.f181209b
            com.google.speech.h.ch r0 = com.google.speech.p5208h.C66610ch.m97260a(r0)
            if (r0 != 0) goto L_0x0646
            com.google.speech.h.ch r0 = com.google.speech.p5208h.C66610ch.IN_PROGRESS
        L_0x0646:
            com.google.speech.h.ch r3 = com.google.speech.p5208h.C66610ch.DONE_SUCCESS
            if (r0 != r3) goto L_0x064b
            goto L_0x064c
        L_0x064b:
            return
        L_0x064c:
            com.google.common.base.ax r0 = r1.f275752b
            boolean r3 = r0.mo56113h()
            if (r3 == 0) goto L_0x06b7
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.cv.c.n r0 = (com.google.android.apps.gsa.staticplugins.p7714cv.p7719c.C98731n) r0
            java.util.zip.ZipOutputStream r3 = r0.f275798e     // Catch:{ IOException -> 0x06a8 }
            if (r3 != 0) goto L_0x066e
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x06a8 }
            r3.<init>()     // Catch:{ IOException -> 0x06a8 }
            r0.f275797d = r3     // Catch:{ IOException -> 0x06a8 }
            java.util.zip.ZipOutputStream r3 = new java.util.zip.ZipOutputStream     // Catch:{ IOException -> 0x06a8 }
            java.io.ByteArrayOutputStream r4 = r0.f275797d     // Catch:{ IOException -> 0x06a8 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x06a8 }
            r0.f275798e = r3     // Catch:{ IOException -> 0x06a8 }
        L_0x066e:
            java.util.zip.ZipOutputStream r3 = r0.f275798e     // Catch:{ IOException -> 0x06a8 }
            byte[] r4 = r23.toByteArray()     // Catch:{ IOException -> 0x06a8 }
            java.util.zip.ZipEntry r5 = new java.util.zip.ZipEntry     // Catch:{ IOException -> 0x06a8 }
            int r6 = r0.f275799f     // Catch:{ IOException -> 0x06a8 }
            r7 = 1
            int r6 = r6 + r7
            r0.f275799f = r6     // Catch:{ IOException -> 0x06a8 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x06a8 }
            r7.<init>()     // Catch:{ IOException -> 0x06a8 }
            r7.append(r6)     // Catch:{ IOException -> 0x06a8 }
            java.lang.String r6 = ".bin"
            r7.append(r6)     // Catch:{ IOException -> 0x06a8 }
            java.lang.String r6 = r7.toString()     // Catch:{ IOException -> 0x06a8 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x06a8 }
            com.google.android.libraries.f.a r0 = r0.f275796c     // Catch:{ IOException -> 0x06a8 }
            long r6 = r0.mo26870b()     // Catch:{ IOException -> 0x06a8 }
            r5.setTime(r6)     // Catch:{ IOException -> 0x06a8 }
            int r0 = r4.length     // Catch:{ IOException -> 0x06a8 }
            long r6 = (long) r0     // Catch:{ IOException -> 0x06a8 }
            r5.setSize(r6)     // Catch:{ IOException -> 0x06a8 }
            r3.putNextEntry(r5)     // Catch:{ IOException -> 0x06a8 }
            r3.write(r4)     // Catch:{ IOException -> 0x06a8 }
            r3.closeEntry()     // Catch:{ IOException -> 0x06a8 }
            goto L_0x06b7
        L_0x06a8:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.p7714cv.p7719c.C98731n.f275794a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = "Error recording stream."
            r4 = 31030(0x7936, float:4.3482E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x06b7:
            com.google.android.apps.gsa.staticplugins.cv.h.k r0 = r1.f275756f
            com.google.android.apps.gsa.shared.speech.d.a r3 = r1.f275754d
            com.google.android.apps.gsa.shared.speech.k r0 = r0.mo91299b(r2, r3)
            com.google.android.apps.gsa.speech.b.a r3 = r1.f275753c
            r3.mo70941c(r0)
            com.google.protobuf.bt r0 = com.google.speech.p5224k.p5225a.C67238p.f182737f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r3 = r0.f169971d
            java.lang.Object r2 = r2.mo58854l(r3)
            if (r2 != 0) goto L_0x06da
            java.lang.Object r0 = r0.f169969b
            goto L_0x06de
        L_0x06da:
            java.lang.Object r0 = r0.mo58889c(r2)
        L_0x06de:
            com.google.speech.k.a.p r0 = (com.google.speech.p5224k.p5225a.C67238p) r0
            int r2 = r0.f182740b
            r3 = 1
            if (r2 != r3) goto L_0x075c
            java.lang.Object r0 = r0.f182741c
            com.google.speech.recognizer.a.ag r0 = (com.google.speech.recognizer.p5233a.C67438ag) r0
            com.google.speech.recognizer.a.x r2 = r0.f183262e
            if (r2 != 0) goto L_0x06ef
            com.google.speech.recognizer.a.x r2 = com.google.speech.recognizer.p5233a.C67476x.f183390i
        L_0x06ef:
            int r2 = r2.f183392a
            r3 = 2
            r2 = r2 & r3
            r3 = 0
            if (r2 == 0) goto L_0x0704
            com.google.speech.recognizer.a.x r2 = r0.f183262e
            if (r2 != 0) goto L_0x06fd
            com.google.speech.recognizer.a.x r2 = com.google.speech.recognizer.p5233a.C67476x.f183390i
        L_0x06fd:
            long r5 = r2.f183395d
            long r5 = java.lang.Math.max(r3, r5)
            goto L_0x0705
        L_0x0704:
            r5 = r3
        L_0x0705:
            com.google.speech.recognizer.a.ak r2 = r0.f183263f
            if (r2 != 0) goto L_0x070b
            com.google.speech.recognizer.a.ak r2 = com.google.speech.recognizer.p5233a.C67442ak.f183276i
        L_0x070b:
            int r2 = r2.f183278a
            r7 = 4
            r2 = r2 & r7
            if (r2 == 0) goto L_0x071d
            com.google.speech.recognizer.a.ak r2 = r0.f183263f
            if (r2 != 0) goto L_0x0717
            com.google.speech.recognizer.a.ak r2 = com.google.speech.recognizer.p5233a.C67442ak.f183276i
        L_0x0717:
            long r7 = r2.f183280c
            long r5 = java.lang.Math.max(r5, r7)
        L_0x071d:
            com.google.speech.recognizer.a.ak r2 = r0.f183264g
            if (r2 != 0) goto L_0x0724
            com.google.speech.recognizer.a.ak r7 = com.google.speech.recognizer.p5233a.C67442ak.f183276i
            goto L_0x0725
        L_0x0724:
            r7 = r2
        L_0x0725:
            int r7 = r7.f183278a
            r8 = 4
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0735
            if (r2 != 0) goto L_0x072f
            com.google.speech.recognizer.a.ak r2 = com.google.speech.recognizer.p5233a.C67442ak.f183276i
        L_0x072f:
            long r7 = r2.f183280c
            long r5 = java.lang.Math.max(r5, r7)
        L_0x0735:
            com.google.speech.recognizer.a.ak r0 = r0.f183261d
            if (r0 != 0) goto L_0x073c
            com.google.speech.recognizer.a.ak r2 = com.google.speech.recognizer.p5233a.C67442ak.f183276i
            goto L_0x073d
        L_0x073c:
            r2 = r0
        L_0x073d:
            int r2 = r2.f183278a
            r7 = 4
            r2 = r2 & r7
            if (r2 == 0) goto L_0x074d
            if (r0 != 0) goto L_0x0747
            com.google.speech.recognizer.a.ak r0 = com.google.speech.recognizer.p5233a.C67442ak.f183276i
        L_0x0747:
            long r7 = r0.f183280c
            long r5 = java.lang.Math.max(r5, r7)
        L_0x074d:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0752
            goto L_0x075c
        L_0x0752:
            com.google.android.apps.gsa.shared.speech.j r8 = new com.google.android.apps.gsa.shared.speech.j
            r2 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r2
            r2 = 2
            r8.<init>(r2, r5)
            goto L_0x075d
        L_0x075c:
            r8 = 0
        L_0x075d:
            if (r8 == 0) goto L_0x0764
            com.google.android.apps.gsa.speech.b.a r0 = r1.f275753c
            r0.mo70941c(r8)
        L_0x0764:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7714cv.p7719c.C98721d.mo77833d(com.google.speech.h.ci):void");
    }
}

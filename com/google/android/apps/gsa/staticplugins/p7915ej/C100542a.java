package com.google.android.apps.gsa.staticplugins.p7915ej;

import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.bd;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.search.core.p6519al.p6713dm.C85393a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86152a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86639bf;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ej.a */
/* compiled from: PG */
public final class C100542a extends C86734a implements C85393a {

    /* renamed from: a */
    private static final C59071e f281107a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ej.a");

    /* renamed from: b */
    private final C68214a f281108b;

    /* renamed from: c */
    private final Context f281109c;

    /* renamed from: f */
    private final C86124t f281110f;

    /* renamed from: g */
    private final C68214a f281111g;

    /* renamed from: h */
    private final C68214a f281112h;

    /* renamed from: i */
    private final C68214a f281113i;

    /* renamed from: j */
    private final C68214a f281114j;

    /* renamed from: k */
    private final C68214a f281115k;

    /* renamed from: l */
    private final bm f281116l;

    /* renamed from: m */
    private final C86152a f281117m;

    /* renamed from: n */
    private final C58833ax f281118n;

    /* renamed from: o */
    private final C84515a f281119o;

    /* renamed from: p */
    private final C86639bf f281120p;

    /* renamed from: q */
    private final C84516aa f281121q;

    /* renamed from: r */
    private final C58833ax f281122r;

    /* renamed from: s */
    private final C68214a f281123s;

    /* renamed from: t */
    private final C58833ax f281124t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100542a(C68214a aVar, C68214a aVar2, C68214a aVar3, Context context, C86124t tVar, C68214a aVar4, C68214a aVar5, C68214a aVar6, bm bmVar, C86152a aVar7, C58833ax axVar, C84515a aVar8, C86639bf bfVar, C84516aa aaVar, C58833ax axVar2, C68214a aVar9, C58833ax axVar3) {
        super(C118575h.WORKER_UI_LAUNCH, "uilaunch");
        this.f281108b = aVar;
        this.f281111g = aVar2;
        this.f281109c = context;
        this.f281110f = tVar;
        this.f281113i = aVar4;
        this.f281115k = aVar3;
        this.f281114j = aVar5;
        this.f281112h = aVar6;
        this.f281116l = bmVar;
        this.f281117m = aVar7;
        this.f281118n = axVar;
        this.f281119o = aVar8;
        this.f281120p = bfVar;
        this.f281121q = aaVar;
        this.f281122r = axVar2;
        this.f281123s = aVar9;
        this.f281124t = axVar3;
    }

    /* renamed from: e */
    private final void m166635e(C87565h hVar) {
        String a;
        if (this.f281122r.mo56113h() && (a = this.f281117m.f232820b.mo79804a()) != null) {
            ((bd) this.f281122r.mo56107c()).n(a, hVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo78916a(com.google.android.apps.gsa.search.shared.service.ClientConfig r18, int r19, com.google.android.apps.gsa.shared.search.Query r20, long r21, boolean r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            dagger.a r6 = r0.f281108b
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.search.core.service.af r6 = (com.google.android.apps.gsa.search.core.service.C86610af) r6
            com.google.android.apps.gsa.search.core.service.r r7 = r6.f233977l
            boolean r6 = r6.mo80227h()
            r8 = 0
            if (r6 == 0) goto L_0x0118
            boolean r6 = r20.mo84339bX()
            if (r6 == 0) goto L_0x0043
            boolean r6 = r20.mo84392cY()
            if (r6 == 0) goto L_0x0043
            boolean r6 = r20.mo84339bX()
            if (r6 == 0) goto L_0x0043
            com.google.common.base.ax r6 = r0.f281124t
            boolean r6 = r6.mo56113h()
            if (r6 != 0) goto L_0x0036
            goto L_0x0043
        L_0x0036:
            com.google.common.base.ax r1 = r0.f281124t
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.search.core.al.v.a r1 = (com.google.android.apps.gsa.search.core.p6519al.p6763v.C85605a) r1
            com.google.common.util.concurrent.cx r1 = r1.mo79092a(r3)
            return r1
        L_0x0043:
            boolean r6 = r18.mo81888f()
            if (r6 != 0) goto L_0x0052
            boolean r6 = r20.mo84397cd()
            if (r6 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r6 = 0
            goto L_0x0053
        L_0x0052:
            r6 = 1
        L_0x0053:
            com.google.common.o.amo r10 = com.google.common.p4552o.amo.SEARCH_NOW
            com.google.common.o.amo r11 = r1.f236951d
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0069
            com.google.android.apps.gsa.search.core.i.t r10 = r0.f281110f
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250611aI
            boolean r10 = r10.mo79746e(r11)
            if (r10 == 0) goto L_0x0069
            r10 = 1
            goto L_0x006a
        L_0x0069:
            r10 = 0
        L_0x006a:
            com.google.android.apps.gsa.shared.util.BitFlags r11 = r1.f236949b
            long r11 = r11.f253762b
            r13 = 1073741824(0x40000000, double:5.304989477E-315)
            boolean r11 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r11, r13)
            if (r11 != 0) goto L_0x007b
            if (r10 != 0) goto L_0x007b
            r10 = 1
            goto L_0x007c
        L_0x007b:
            r10 = 0
        L_0x007c:
            com.google.android.apps.gsa.search.core.service.bf r11 = r0.f281120p
            android.content.Context r12 = r0.f281109c
            r13 = 6
            r14 = 10
            if (r2 == r13) goto L_0x0089
            if (r2 != r14) goto L_0x008a
            r2 = 10
        L_0x0089:
            r8 = 1
        L_0x008a:
            com.google.common.base.C58838bb.m90868c(r8)
            java.lang.String r8 = r20.mo84355bn()
            r15 = r10
            if (r7 == 0) goto L_0x009d
            long r9 = r7.f234389k
            int r16 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r16 != 0) goto L_0x009d
            r7.mo80390l()
        L_0x009d:
            if (r2 != r13) goto L_0x00ac
            com.google.android.apps.gsa.search.core.aj.a.a r7 = r11.f234066a
            if (r8 == 0) goto L_0x00a5
            r9 = r8
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r9 = "and.gsa.int"
        L_0x00a7:
            android.content.Intent r7 = r7.mo78219b(r9)
            goto L_0x00b3
        L_0x00ac:
            if (r2 != r14) goto L_0x0110
            r7 = 0
            android.content.Intent r7 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145443a(r12, r7)
        L_0x00b3:
            r9 = r15
            com.google.android.apps.gsa.search.core.service.C86639bf.m139563a(r7, r4, r9)
            java.lang.String r4 = "suppress_uel_logging"
            r5 = 1
            r7.putExtra(r4, r5)
            java.lang.String r4 = "velvet-query"
            r7.putExtra(r4, r3)
            if (r6 == 0) goto L_0x00c9
            java.lang.String r4 = "disable_logo_header_transition"
            r7.putExtra(r4, r5)
        L_0x00c9:
            boolean r4 = android.text.TextUtils.isEmpty(r8)
            if (r4 != 0) goto L_0x00d4
            java.lang.String r4 = "source"
            r7.putExtra(r4, r8)
        L_0x00d4:
            r4 = 32768(0x8000, float:4.5918E-41)
            if (r2 != r14) goto L_0x00e5
            r7.addFlags(r4)
            com.google.android.apps.gsa.shared.monet.b.af.n r2 = r3.f252761S
            int r2 = r2.f251999l
            java.lang.String r3 = "lobby_initial_tab"
            r7.putExtra(r3, r2)
        L_0x00e5:
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.ACETONE_NOW
            com.google.common.o.amo r1 = r1.f236951d
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00f2
            r7.addFlags(r4)
        L_0x00f2:
            if (r23 == 0) goto L_0x00fb
            java.lang.String r1 = "on_lockscreen"
            r2 = 1
            r7.putExtra(r1, r2)
            goto L_0x00fc
        L_0x00fb:
            r2 = 1
        L_0x00fc:
            dagger.a r1 = r0.f281111g
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.util.t.g r1 = (com.google.android.apps.gsa.shared.util.p7184t.C91097g) r1
            r1.mo65089a(r7)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            return r1
        L_0x0110:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Unexpected uiToLaunch value."
            r1.<init>(r2)
            throw r1
        L_0x0118:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7915ej.C100542a.mo78916a(com.google.android.apps.gsa.search.shared.service.ClientConfig, int, com.google.android.apps.gsa.shared.search.Query, long, boolean):com.google.common.util.concurrent.cx");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x023f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78917b(int r17, com.google.android.apps.gsa.shared.search.Query r18, long r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            r4 = 11
            r5 = 3
            r6 = 0
            r7 = 6
            r8 = 4
            if (r1 == r5) goto L_0x001c
            if (r1 == r8) goto L_0x0018
            if (r1 == r7) goto L_0x0018
            if (r1 == r4) goto L_0x0018
            return
        L_0x0018:
            r10 = r18
            goto L_0x01b0
        L_0x001c:
            boolean r10 = r18.mo84450de()
            r11 = 0
            if (r10 != 0) goto L_0x0029
            boolean r10 = r18.mo84463dq()
            if (r10 == 0) goto L_0x0097
        L_0x0029:
            dagger.a r10 = r0.f281113i
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r10 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r10
            android.accounts.Account r10 = r10.mo79668a()
            if (r10 == 0) goto L_0x0097
            com.google.android.apps.gsa.assistant.shared.bm r10 = r0.f281116l
            boolean r10 = r10.u()
            if (r10 == 0) goto L_0x0097
            com.google.android.apps.gsa.assistant.shared.bm r10 = r0.f281116l
            boolean r10 = r10.n()
            if (r10 != 0) goto L_0x0097
            java.lang.String r1 = r18.mo84355bn()
            com.google.android.apps.gsa.assistant.shared.l.e r4 = com.google.android.apps.gsa.assistant.shared.l.e.bL
            boolean r5 = r18.mo84450de()
            if (r5 == 0) goto L_0x0055
            com.google.android.apps.gsa.assistant.shared.l.e r4 = com.google.android.apps.gsa.assistant.shared.l.e.ak
        L_0x0055:
            com.google.android.apps.gsa.search.shared.h.h r5 = new com.google.android.apps.gsa.search.shared.h.h
            r5.<init>()
            r5.f236560f = r11
            r5.f236563i = r2
            r5.f236556b = r4
            r5.f236523a = r1
            dagger.a r1 = r0.f281115k
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.shared.i.b r1 = (com.google.android.apps.gsa.search.shared.p6931i.C87573b) r1
            com.google.android.apps.gsa.assist.a.m r1 = r1.f236596a
            boolean r1 = r1.mo17534a()
            if (r1 == 0) goto L_0x0082
            dagger.a r1 = r0.f281115k
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.shared.i.b r1 = (com.google.android.apps.gsa.search.shared.p6931i.C87573b) r1
            android.os.Bundle r2 = r5.mo81685a()
            r1.mo81705c(r2)
            return
        L_0x0082:
            r0.m166635e(r5)
            com.google.common.base.ax r1 = r0.f281118n
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.search.shared.h.k r1 = (com.google.android.apps.gsa.search.shared.p6930h.C87568k) r1
            android.content.Context r2 = r0.f281109c
            android.os.Bundle r3 = r5.mo81685a()
            r1.mo81688b(r2, r3)
            return
        L_0x0097:
            boolean r10 = r18.mo84456dj()
            if (r10 == 0) goto L_0x0018
            com.google.android.apps.gsa.assistant.shared.bm r10 = r0.f281116l
            boolean r10 = r10.s()
            r12 = 29
            if (r10 == 0) goto L_0x017a
            r10 = r18
            com.google.android.apps.gsa.shared.speech.HotwordResultMetadata r13 = r10.f252756N
            java.lang.String r14 = r18.mo84355bn()
            if (r13 == 0) goto L_0x00b7
            boolean r15 = r13.mo84614p()
            if (r15 == 0) goto L_0x00b8
        L_0x00b7:
            r11 = 1
        L_0x00b8:
            if (r11 == 0) goto L_0x00d7
            dagger.a r15 = r0.f281114j
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.assist.c.a.a r15 = (com.google.android.apps.gsa.assist.p503c.p504a.C9388a) r15
            boolean r15 = r15.mo17583e()
            if (r15 == 0) goto L_0x00d7
            dagger.a r15 = r0.f281112h
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r15 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r15
            com.google.android.apps.gsa.assist.a.i r15 = r15.f236453o
            com.google.android.apps.gsa.assist.a.f r9 = com.google.android.apps.gsa.assist.p501a.C9318f.CONTEXTUAL
            r15.mo17529f(r9)
        L_0x00d7:
            com.google.android.apps.gsa.search.shared.h.h r9 = new com.google.android.apps.gsa.search.shared.h.h
            r9.<init>()
            com.google.android.apps.gsa.search.core.aj.aa r15 = r0.f281121q
            boolean r15 = r15.mo78228b()
            if (r15 == 0) goto L_0x00ed
            java.lang.String r14 = "and.opa.lockscreen.hotword"
            r9.f236523a = r14
            com.google.android.apps.gsa.assistant.shared.l.e r14 = com.google.android.apps.gsa.assistant.shared.l.e.bs
            r9.f236556b = r14
            goto L_0x0108
        L_0x00ed:
            if (r14 == 0) goto L_0x0100
            java.lang.String r15 = "and.opa.untrained.hotword"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0100
            r9.f236523a = r15
            com.google.android.apps.gsa.assistant.shared.l.e r14 = com.google.android.apps.gsa.assistant.shared.l.e.bg
            r9.f236556b = r14
            r9.f236560f = r7
            goto L_0x0108
        L_0x0100:
            java.lang.String r14 = "and.opa.hotword"
            r9.f236523a = r14
            com.google.android.apps.gsa.assistant.shared.l.e r14 = com.google.android.apps.gsa.assistant.shared.l.e.aU
            r9.f236556b = r14
        L_0x0108:
            if (r11 != 0) goto L_0x010d
            r0.m166635e(r9)
        L_0x010d:
            android.os.Bundle r9 = r9.mo81685a()
            com.google.android.apps.gsa.shared.speech.HotwordResultMetadata.m147627u(r9, r13)
            java.lang.String r13 = "HandoverId"
            r9.putLong(r13, r2)
            dagger.a r13 = r0.f281108b
            java.lang.Object r13 = r13.mo27525b()
            com.google.android.apps.gsa.search.core.service.af r13 = (com.google.android.apps.gsa.search.core.service.C86610af) r13
            com.google.android.apps.gsa.search.core.service.r r13 = r13.f233977l
            if (r13 == 0) goto L_0x0135
            com.google.android.apps.gsa.search.shared.service.al r14 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r15 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.DO_NOT_COMMIT_TO_TOUCH_ON_PAUSE
            r14.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r15)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r14 = r14.mo81964a()
            com.google.android.apps.gsa.search.core.service.n r13 = r13.f234383e
            r13.mo80379b(r14)
        L_0x0135:
            if (r11 == 0) goto L_0x0154
            dagger.a r11 = r0.f281115k
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.search.shared.i.b r11 = (com.google.android.apps.gsa.search.shared.p6931i.C87573b) r11
            com.google.android.apps.gsa.assist.a.m r11 = r11.f236596a
            boolean r11 = r11.mo17534a()
            if (r11 != 0) goto L_0x0148
            goto L_0x0198
        L_0x0148:
            dagger.a r1 = r0.f281115k
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.shared.i.b r1 = (com.google.android.apps.gsa.search.shared.p6931i.C87573b) r1
            r1.mo81705c(r9)
            goto L_0x0161
        L_0x0154:
            com.google.common.base.ax r1 = r0.f281118n
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.search.shared.h.k r1 = (com.google.android.apps.gsa.search.shared.p6930h.C87568k) r1
            android.content.Context r2 = r0.f281109c
            r1.mo81688b(r2, r9)
        L_0x0161:
            boolean r1 = r18.mo84403cj()
            if (r1 != 0) goto L_0x0179
            dagger.a r1 = r0.f281123s
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r1 = (com.google.android.apps.gsa.shared.logger.C89911f) r1
            r2 = 118619255(0x711fc77, float:1.098278E-34)
            com.google.android.apps.gsa.shared.logger.e r1 = r1.mo83755a(r6, r2, r12)
            r1.mo83721a()
        L_0x0179:
            return
        L_0x017a:
            r10 = r18
            dagger.a r9 = r0.f281113i
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r9 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r9
            android.accounts.Account r9 = r9.mo79668a()
            if (r9 == 0) goto L_0x0198
            com.google.common.f.e r9 = f281107a
            com.google.common.f.x r9 = r9.mo56224b()
            java.lang.String r11 = "Not using assist layer: not supported"
            r13 = 33502(0x82de, float:4.6946E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r13)).mo56386p(r11)
        L_0x0198:
            boolean r9 = r18.mo84403cj()
            if (r9 == 0) goto L_0x01b0
            dagger.a r9 = r0.f281123s
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r9 = (com.google.android.apps.gsa.shared.logger.C89911f) r9
            r11 = 118618584(0x711f9d8, float:1.098201E-34)
            com.google.android.apps.gsa.shared.logger.e r9 = r9.mo83755a(r6, r11, r12)
            r9.mo83721a()
        L_0x01b0:
            android.content.Context r9 = r0.f281109c
            if (r1 != r7) goto L_0x01cb
            java.lang.String r4 = r18.mo84355bn()
            if (r4 == 0) goto L_0x01bf
            java.lang.String r4 = r18.mo84355bn()
            goto L_0x01c1
        L_0x01bf:
            java.lang.String r4 = "and.gsa.int"
        L_0x01c1:
            com.google.android.apps.gsa.search.core.aj.a.a r5 = r0.f281119o
            r4.getClass()
            android.content.Intent r6 = r5.mo78219b(r4)
            goto L_0x01ef
        L_0x01cb:
            if (r1 != r4) goto L_0x01d4
            java.lang.String r4 = "com.google.android.apps.gsa.binaries.clockwork.assistant.AssistantActivity"
            android.content.Intent r6 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145444b(r9, r4)
            goto L_0x01ef
        L_0x01d4:
            if (r1 != r8) goto L_0x01e7
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f281110f
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90114fl.f250730d
            boolean r4 = r4.mo79746e(r5)
            if (r4 != 0) goto L_0x01ef
            java.lang.String r4 = "com.google.android.apps.gsa.lockscreenentry.LockscreenEntryActivity"
            android.content.Intent r6 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145444b(r9, r4)
            goto L_0x01ef
        L_0x01e7:
            if (r1 != r5) goto L_0x024b
            java.lang.String r4 = "com.google.android.apps.gsa.queryentry.QueryEntryActivity"
            android.content.Intent r6 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145444b(r9, r4)
        L_0x01ef:
            if (r6 == 0) goto L_0x022f
            r4 = 32768(0x8000, float:4.5918E-41)
            r6.addFlags(r4)
            java.lang.String r4 = "and.gsa.widget.mic"
            java.lang.String r5 = r18.mo84355bn()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x020a
            java.lang.String r4 = "handover-session-id"
            r6.putExtra(r4, r2)
            r4 = 1
            goto L_0x020e
        L_0x020a:
            r4 = 1
            com.google.android.apps.gsa.search.core.service.C86639bf.m139563a(r6, r2, r4)
        L_0x020e:
            if (r1 != r8) goto L_0x0215
            java.lang.String r1 = "on_lockscreen"
            r6.putExtra(r1, r4)
        L_0x0215:
            android.os.Bundle r1 = r6.getExtras()
            com.google.android.apps.gsa.search.shared.h.h r2 = new com.google.android.apps.gsa.search.shared.h.h
            r2.<init>(r1)
            boolean r1 = r18.mo84403cj()
            if (r1 == 0) goto L_0x023d
            r0.m166635e(r2)
            android.os.Bundle r1 = r2.mo81685a()
            r6.putExtras(r1)
            goto L_0x023d
        L_0x022f:
            com.google.common.f.e r1 = f281107a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "createIntentForHeadlessVoiceSearch(): Failed to create intent."
            r3 = 33497(0x82d9, float:4.6939E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
        L_0x023d:
            if (r6 == 0) goto L_0x024a
            dagger.a r1 = r0.f281111g
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.util.t.g r1 = (com.google.android.apps.gsa.shared.util.p7184t.C91097g) r1
            r1.mo65089a(r6)
        L_0x024a:
            return
        L_0x024b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected uiToLaunch value: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            goto L_0x0260
        L_0x025f:
            throw r2
        L_0x0260:
            goto L_0x025f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7915ej.C100542a.mo78917b(int, com.google.android.apps.gsa.shared.search.Query, long):void");
    }

    /* renamed from: c */
    public final void mo78918c() {
        C86775r rVar = ((C86610af) this.f281108b.mo27525b()).f233977l;
        if (rVar != null) {
            rVar.f234383e.mo80379b(new C87684al(C88244um.DO_NOT_COMMIT_TO_TOUCH_ON_PAUSE).mo81964a());
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ServiceWorker");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}

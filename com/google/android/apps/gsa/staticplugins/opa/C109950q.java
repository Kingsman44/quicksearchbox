package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.google.android.apps.gsa.assist.p505d.C9406a;
import com.google.android.apps.gsa.assistant.shared.bd;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.opa.C83575af;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106174o;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106391p;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113191cv;
import com.google.android.apps.gsa.staticplugins.opa.util.C113851cf;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.q */
/* compiled from: PG */
public final class C109950q implements C83575af {

    /* renamed from: a */
    View f306360a;

    /* renamed from: b */
    private final C86124t f306361b;

    /* renamed from: c */
    private final C21370a f306362c;

    /* renamed from: d */
    private final C9406a f306363d;

    /* renamed from: e */
    private final C91093c f306364e;

    /* renamed from: f */
    private final SharedPreferences f306365f;

    /* renamed from: g */
    private final C58833ax f306366g;

    /* renamed from: h */
    private final C84516aa f306367h;

    /* renamed from: i */
    private final C68214a f306368i;

    /* renamed from: j */
    private final bd f306369j;

    /* renamed from: k */
    private final Context f306370k;

    /* renamed from: l */
    private final C58833ax f306371l;

    /* renamed from: m */
    private final C58833ax f306372m;

    /* renamed from: n */
    private final C58833ax f306373n;

    /* renamed from: o */
    private final C58833ax f306374o;

    /* renamed from: p */
    private final C68214a f306375p;

    /* renamed from: q */
    private final C68214a f306376q;

    /* renamed from: r */
    private final Optional f306377r;

    /* renamed from: s */
    private final C58833ax f306378s;

    /* renamed from: t */
    private final C113851cf f306379t;

    /* renamed from: u */
    private final C106174o f306380u;

    public C109950q(C9406a aVar, C91093c cVar, C21370a aVar2, C86124t tVar, SharedPreferences sharedPreferences, C58833ax axVar, C84516aa aaVar, C106174o oVar, C68214a aVar3, bd bdVar, Context context, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C68214a aVar4, C68214a aVar5, Optional optional, C68214a aVar6, C58833ax axVar6, C113851cf cfVar) {
        this.f306362c = aVar2;
        this.f306361b = tVar;
        this.f306363d = aVar;
        this.f306364e = cVar;
        this.f306365f = sharedPreferences;
        this.f306366g = axVar;
        this.f306367h = aaVar;
        this.f306380u = oVar;
        this.f306368i = aVar3;
        this.f306369j = bdVar;
        this.f306370k = context;
        this.f306371l = axVar2;
        this.f306372m = axVar3;
        this.f306373n = axVar4;
        this.f306374o = axVar5;
        this.f306375p = aVar4;
        this.f306376q = aVar5;
        this.f306377r = optional;
        this.f306378s = axVar6;
        this.f306379t = cfVar;
        if (tVar.mo79746e(C90037cp.f248420aA)) {
            ((C106391p) aVar6.mo27525b()).mo95496e();
        }
    }

    /* renamed from: b */
    private final boolean m183126b(e eVar) {
        return ((C113191cv) this.f306376q.mo27525b()).mo99905a() && this.f306361b.mo79749o(C90063do.f249514ev).contains(Integer.valueOf(eVar.ca));
    }

    /* renamed from: c */
    private final boolean m183127c(e eVar, String str) {
        return ((C113191cv) this.f306376q.mo27525b()).mo99908d(eVar) && !this.f306369j.r(str);
    }

    /* renamed from: d */
    private final boolean m183128d(e eVar, boolean z) {
        if (!this.f306361b.mo79746e(C90063do.f249515ew) && !z && m183126b(eVar)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03b2, code lost:
        if (r0.f306380u.f296314a == false) goto L_0x03b5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76908a(android.os.Bundle r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r2 & 4
            r5 = 0
            if (r3 == 0) goto L_0x000d
            r3 = 1
            goto L_0x000e
        L_0x000d:
            r3 = 0
        L_0x000e:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.content.Intent r6 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142326y(r26)
            if (r6 == 0) goto L_0x0018
            r7 = 1
            goto L_0x0019
        L_0x0018:
            r7 = 0
        L_0x0019:
            java.lang.String r8 = "android.intent.extra.ASSIST_PACKAGE"
            java.lang.String r9 = r1.getString(r8)
            com.google.common.base.ax r10 = r0.f306371l
            boolean r10 = r10.mo56113h()
            if (r10 == 0) goto L_0x00a9
            if (r6 == 0) goto L_0x00a9
            java.lang.String r10 = "launch_ambient_mode_from_assist"
            boolean r10 = r6.getBooleanExtra(r10, r5)
            if (r10 == 0) goto L_0x00a9
            java.lang.String r2 = "launch_ambient_ignore_immersives"
            boolean r2 = r6.getBooleanExtra(r2, r5)
            if (r2 == 0) goto L_0x0054
            dagger.a r2 = r0.f306375p
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bw r2 = (com.google.android.apps.gsa.staticplugins.opa.util.C113807bw) r2
            if (r9 == 0) goto L_0x004c
            com.google.android.apps.gsa.search.core.l.a r2 = r2.f315198a
            com.google.android.apps.gsa.search.core.l.j r2 = r2.f232820b
            java.lang.String r11 = r2.mo79805b(r9)
            goto L_0x004d
        L_0x004c:
            r11 = 0
        L_0x004d:
            boolean r2 = com.google.android.apps.gsa.staticplugins.opa.util.C113807bw.m188394c(r11)
            if (r2 != 0) goto L_0x0070
            goto L_0x0071
        L_0x0054:
            dagger.a r2 = r0.f306375p
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bw r2 = (com.google.android.apps.gsa.staticplugins.opa.util.C113807bw) r2
            android.content.Context r3 = r0.f306370k
            if (r9 == 0) goto L_0x0069
            com.google.android.apps.gsa.search.core.l.a r4 = r2.f315198a
            com.google.android.apps.gsa.search.core.l.j r4 = r4.f232820b
            java.lang.String r11 = r4.mo79805b(r9)
            goto L_0x006a
        L_0x0069:
            r11 = 0
        L_0x006a:
            boolean r2 = r2.mo100657b(r3, r9, r11)
            if (r2 == 0) goto L_0x0071
        L_0x0070:
            return
        L_0x0071:
            java.lang.String r2 = "ambient_screen_extras"
            android.os.Bundle r2 = r6.getBundleExtra(r2)
            java.lang.String r3 = "launch_opa_amb_act"
            boolean r3 = r6.getBooleanExtra(r3, r5)
            com.google.common.base.ax r4 = r0.f306371l
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.samson.activity.t r4 = (com.google.android.apps.gsa.staticplugins.opa.samson.activity.C110041t) r4
            android.content.Context r6 = r0.f306370k
            com.google.common.base.ax r2 = r4.mo98330a(r6, r2, r3)
            boolean r3 = r2.mo56113h()
            if (r3 == 0) goto L_0x009e
            com.google.android.apps.gsa.assist.d.a r3 = r0.f306363d
            java.lang.Object r2 = r2.mo56107c()
            android.content.Intent r2 = (android.content.Intent) r2
            com.google.android.apps.gsa.assist.cb r3 = (com.google.android.apps.gsa.assist.C9397cb) r3
            r3.startAssistantActivity(r2)
        L_0x009e:
            com.google.android.apps.gsa.assist.d.a r2 = r0.f306363d
            r2.setUiEnabled(r5)
            com.google.android.apps.gsa.assist.d.a r2 = r0.f306363d
            r2.mo17598e(r1)
            return
        L_0x00a9:
            com.google.common.base.ax r10 = r0.f306371l
            boolean r10 = r10.mo56113h()
            if (r10 == 0) goto L_0x00d7
            if (r6 == 0) goto L_0x00d7
            java.lang.String r10 = "com.google.android.apps.gsa.smartspace.EXTRA_LAUNCH_OOBE_PAGE"
            boolean r10 = r6.getBooleanExtra(r10, r5)
            if (r10 == 0) goto L_0x00d7
            java.lang.String r2 = "com.google.android.apps.gsa.smartspace.EXTRA_OOBE_LAUNCH_INTENT"
            android.os.Parcelable r2 = r6.getParcelableExtra(r2)
            android.content.Intent r2 = (android.content.Intent) r2
            if (r2 == 0) goto L_0x00cc
            com.google.android.apps.gsa.assist.d.a r3 = r0.f306363d
            com.google.android.apps.gsa.assist.cb r3 = (com.google.android.apps.gsa.assist.C9397cb) r3
            r3.startAssistantActivity(r2)
        L_0x00cc:
            com.google.android.apps.gsa.assist.d.a r2 = r0.f306363d
            r2.setUiEnabled(r5)
            com.google.android.apps.gsa.assist.d.a r2 = r0.f306363d
            r2.mo17598e(r1)
            return
        L_0x00d7:
            r12 = 0
            if (r7 == 0) goto L_0x00e2
            java.lang.String r10 = "HandoverId"
            long r14 = r6.getLongExtra(r10, r12)
            goto L_0x00e3
        L_0x00e2:
            r14 = r12
        L_0x00e3:
            int r10 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x00f6
            com.google.android.apps.gsa.assistant.shared.bd r10 = r0.f306369j
            java.lang.String r10 = r10.l()
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L_0x00f7
            r12 = 1
            goto L_0x00f7
        L_0x00f6:
            r12 = r14
        L_0x00f7:
            if (r7 == 0) goto L_0x0105
            android.os.Bundle r10 = r6.getExtras()
            boolean r10 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142297au(r10)
            if (r10 == 0) goto L_0x0105
            r10 = 1
            goto L_0x0106
        L_0x0105:
            r10 = 0
        L_0x0106:
            int r14 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142309h(r26)
            r15 = 2
            if (r14 != r15) goto L_0x010f
            r15 = 1
            goto L_0x0110
        L_0x010f:
            r15 = 0
        L_0x0110:
            if (r10 == 0) goto L_0x0119
            com.google.android.apps.gsa.shared.speech.HotwordResultMetadata r17 = com.google.android.apps.gsa.shared.speech.HotwordResultMetadata.m147626t(r6)
            r11 = r17
            goto L_0x011a
        L_0x0119:
            r11 = 0
        L_0x011a:
            com.google.android.apps.gsa.assist.d.a r4 = r0.f306363d
            android.content.Context r4 = r4.getContext()
            boolean r4 = com.google.android.apps.gsa.opa.C83583an.m133148c(r4)
            if (r4 == 0) goto L_0x0127
            return
        L_0x0127:
            if (r15 != 0) goto L_0x0134
            if (r9 == 0) goto L_0x0134
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r4.putString(r8, r9)
            goto L_0x0135
        L_0x0134:
            r4 = 0
        L_0x0135:
            com.google.android.apps.gsa.search.core.aj.aa r8 = r0.f306367h
            boolean r8 = r8.mo78228b()
            com.google.android.apps.gsa.assistant.shared.l.e r5 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r26)
            r20 = r4
            com.google.android.apps.gsa.assistant.shared.l.e r4 = com.google.android.apps.gsa.assistant.shared.l.e.a
            if (r5 != r4) goto L_0x0178
            if (r3 == 0) goto L_0x0178
            if (r8 == 0) goto L_0x0178
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f306361b
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247431gy
            boolean r4 = r4.mo79746e(r5)
            if (r4 != 0) goto L_0x0178
            com.google.android.apps.gsa.assistant.shared.bd r4 = r0.f306369j
            boolean r4 = r4.v(r9)
            if (r4 == 0) goto L_0x015c
            goto L_0x0178
        L_0x015c:
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f306361b
            com.google.android.apps.gsa.shared.m.f r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250028cl
            long r1 = r1.mo79743a(r2)
            r15 = 0
            r16 = 0
            r17 = 0
            int r2 = (int) r1
            r19 = 0
            r18 = r2
            android.content.Intent r1 = com.google.android.apps.gsa.opa.C83583an.m133146a(r14, r15, r16, r17, r18, r19)
            com.google.android.apps.gsa.shared.util.t.c r2 = r0.f306364e
            r2.mo65089a(r1)
            return
        L_0x0178:
            com.google.android.apps.gsa.assistant.shared.f r2 = com.google.android.apps.gsa.assistant.shared.g.a(r1, r2, r8)
            com.google.android.apps.gsa.assistant.shared.n r2 = (com.google.android.apps.gsa.assistant.shared.n) r2
            com.google.android.apps.gsa.assistant.shared.l.e r4 = r2.b
            java.lang.String r2 = r2.a
            com.google.android.apps.gsa.search.core.i.t r5 = r0.f306361b
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249515ew
            boolean r5 = r5.mo79746e(r8)
            if (r5 == 0) goto L_0x01aa
            boolean r5 = r0.m183126b(r4)
            if (r5 != 0) goto L_0x0193
            goto L_0x01aa
        L_0x0193:
            android.content.Context r2 = r0.f306370k
            android.content.Intent r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.p8550e.C112096b.m185961a(r2)
            com.google.android.apps.gsa.shared.util.t.c r3 = r0.f306364e
            r3.mo65089a(r2)
            com.google.android.apps.gsa.assist.d.a r2 = r0.f306363d
            r3 = 0
            r2.setUiEnabled(r3)
            com.google.android.apps.gsa.assist.d.a r2 = r0.f306363d
            r2.mo17598e(r1)
            return
        L_0x01aa:
            android.os.Bundle r5 = android.os.Bundle.EMPTY
            if (r7 == 0) goto L_0x01b2
            android.os.Bundle r5 = r6.getExtras()
        L_0x01b2:
            boolean r7 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142298av(r26)
            if (r7 != 0) goto L_0x01c1
            boolean r7 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142298av(r5)
            if (r7 == 0) goto L_0x01bf
            goto L_0x01c1
        L_0x01bf:
            r7 = 0
            goto L_0x01c2
        L_0x01c1:
            r7 = 1
        L_0x01c2:
            if (r15 == 0) goto L_0x01cd
            if (r7 != 0) goto L_0x01cd
            boolean r8 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142251Z(r5)
            if (r8 != 0) goto L_0x01cd
            r2 = 0
        L_0x01cd:
            int r8 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142304c(r26)
            com.google.android.apps.gsa.staticplugins.opa.util.cf r1 = r0.f306379t
            r21 = r12
            com.google.android.apps.gsa.assist.d.a r12 = r0.f306363d
            com.google.android.apps.gsa.assist.cb r12 = (com.google.android.apps.gsa.assist.C9397cb) r12
            com.google.android.apps.gsa.assist.a.a r12 = r12.f32610g
            long r12 = r12.f32327a
            boolean r1 = r1.mo100698a(r4, r12)
            r12 = 3
            if (r1 == 0) goto L_0x01e7
            r1 = 8
            goto L_0x022c
        L_0x01e7:
            boolean r1 = r0.m183127c(r4, r9)
            if (r1 == 0) goto L_0x01ef
            r1 = 7
            goto L_0x022c
        L_0x01ef:
            boolean r1 = r0.m183128d(r4, r15)
            if (r1 == 0) goto L_0x01f7
        L_0x01f5:
            r1 = 1
            goto L_0x022c
        L_0x01f7:
            if (r3 == 0) goto L_0x0221
            com.google.android.apps.gsa.search.core.aj.aa r1 = r0.f306367h
            boolean r1 = r1.mo78228b()
            java.lang.String r3 = "voice"
            if (r1 == 0) goto L_0x0205
            r1 = r3
            goto L_0x020b
        L_0x0205:
            android.content.SharedPreferences r1 = r0.f306365f
            java.lang.String r1 = com.google.android.apps.gsa.staticplugins.opa.util.C113761ad.m188326a(r1)
        L_0x020b:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0213
            if (r15 == 0) goto L_0x01f5
        L_0x0213:
            if (r8 != 0) goto L_0x0217
            r1 = 2
            goto L_0x022c
        L_0x0217:
            if (r8 == r12) goto L_0x021f
            r1 = 4
            if (r8 == r1) goto L_0x021d
            goto L_0x0223
        L_0x021d:
            r1 = 6
            goto L_0x022c
        L_0x021f:
            r1 = 5
            goto L_0x022c
        L_0x0221:
            if (r6 != 0) goto L_0x0225
        L_0x0223:
            r1 = 0
            goto L_0x022c
        L_0x0225:
            java.lang.String r1 = "requested_mic_state"
            r3 = 0
            int r1 = r6.getIntExtra(r1, r3)
        L_0x022c:
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142257aE(r5)
            if (r3 != 0) goto L_0x023b
            if (r15 == 0) goto L_0x0239
            if (r10 == 0) goto L_0x0239
            if (r7 != 0) goto L_0x0239
            goto L_0x023b
        L_0x0239:
            r3 = 0
            goto L_0x023c
        L_0x023b:
            r3 = 1
        L_0x023c:
            long r12 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142316o(r26)
            dagger.a r8 = r0.f306368i
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.cx r8 = (com.google.android.apps.gsa.staticplugins.opa.util.C113869cx) r8
            com.google.android.apps.gsa.search.core.i.t r10 = r0.f306361b
            boolean r8 = r8.mo100733f(r10, r4)
            if (r8 == 0) goto L_0x0258
            boolean r8 = r0.m183127c(r4, r9)
            if (r8 != 0) goto L_0x0258
            r8 = 1
            goto L_0x0259
        L_0x0258:
            r8 = 0
        L_0x0259:
            boolean r10 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142270aR(r5)
            if (r10 != 0) goto L_0x0266
            com.google.android.apps.gsa.assistant.shared.l.e r10 = com.google.android.apps.gsa.assistant.shared.l.e.aO
            if (r4 != r10) goto L_0x0264
            goto L_0x0266
        L_0x0264:
            r10 = 0
            goto L_0x0267
        L_0x0266:
            r10 = 1
        L_0x0267:
            boolean r23 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142254aB(r5)
            if (r23 != 0) goto L_0x0278
            boolean r23 = r0.m183127c(r4, r9)
            if (r23 == 0) goto L_0x0274
            goto L_0x0278
        L_0x0274:
            r24 = r7
            r6 = 0
            goto L_0x027b
        L_0x0278:
            r24 = r7
            r6 = 1
        L_0x027b:
            com.google.android.apps.gsa.search.shared.h.h r7 = new com.google.android.apps.gsa.search.shared.h.h
            r7.<init>(r5)
            r7.f236523a = r2
            r2 = 1
            r7.f236561g = r2
            r7.f236562h = r2
            r7.f236556b = r4
            r7.f236558d = r14
            r7.f236574t = r11
            r11 = r14
            r2 = r15
            r14 = r21
            r7.f236563i = r14
            r7.f236560f = r1
            r1 = r20
            r7.f236573s = r1
            com.google.android.apps.gsa.assist.d.a r1 = r0.f306363d
            com.google.android.apps.gsa.assist.cb r1 = (com.google.android.apps.gsa.assist.C9397cb) r1
            com.google.android.apps.gsa.assist.a.a r1 = r1.f32610g
            long r14 = r1.f32327a
            r7.f236575u = r14
            r7.f236559e = r3
            r7.f236510N = r12
            r7.f236498B = r8
            r1 = 0
            r7.f236514R = r1
            int r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142304c(r26)
            r7.f236518V = r1
            r7.f236499C = r10
            r7.f236541al = r6
            dagger.a r1 = r0.f306375p
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bw r1 = (com.google.android.apps.gsa.staticplugins.opa.util.C113807bw) r1
            android.content.Context r3 = r0.f306370k
            r6 = r26
            r1.mo100656a(r3, r6, r7)
            android.os.Bundle r1 = r7.mo81685a()
            boolean r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142258aF(r1)
            if (r1 != 0) goto L_0x02dc
            android.os.Bundle r1 = r7.mo81685a()
            boolean r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142263aK(r1)
            if (r1 == 0) goto L_0x02da
            goto L_0x02dc
        L_0x02da:
            r1 = 0
            goto L_0x02dd
        L_0x02dc:
            r1 = 1
        L_0x02dd:
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f306361b
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247669lX
            boolean r3 = r3.mo79746e(r10)
            if (r3 == 0) goto L_0x02ef
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142285ai(r4)
            if (r3 == 0) goto L_0x02ef
            r3 = 1
            goto L_0x02f0
        L_0x02ef:
            r3 = 0
        L_0x02f0:
            if (r1 != 0) goto L_0x0305
            r1 = 3
            if (r11 == r1) goto L_0x0303
            if (r8 == 0) goto L_0x02fb
            com.google.android.apps.gsa.assistant.shared.l.e r1 = com.google.android.apps.gsa.assistant.shared.l.e.ba
            if (r4 != r1) goto L_0x0303
        L_0x02fb:
            boolean r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142264aL(r5)
            if (r1 != 0) goto L_0x0303
            if (r3 == 0) goto L_0x0305
        L_0x0303:
            r1 = 1
            goto L_0x0306
        L_0x0305:
            r1 = 0
        L_0x0306:
            r7.f236497A = r1
            if (r9 == 0) goto L_0x030f
            com.google.android.apps.gsa.assistant.shared.bd r1 = r0.f306369j
            r1.n(r9, r7)
        L_0x030f:
            com.google.common.base.ax r1 = r0.f306372m
            boolean r3 = r1.mo56113h()
            if (r3 == 0) goto L_0x038a
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.tapas.ui.z r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113583z) r1
            boolean r1 = r1.mo100316a()
            if (r1 == 0) goto L_0x038a
            r1 = 1
            r7.f236505I = r1
            com.google.common.base.ax r3 = r0.f306372m
            java.lang.Object r3 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.tapas.ui.z r3 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113583z) r3
            com.google.android.apps.gsa.assist.d.a r5 = r0.f306363d
            r5.setUiEnabled(r1)
            com.google.android.apps.gsa.assist.d.a r5 = r0.f306363d
            android.app.Dialog r5 = r5.getWindow()
            android.view.Window r5 = r5.getWindow()
            if (r5 == 0) goto L_0x035c
            android.content.Context r8 = r0.f306370k
            boolean r8 = com.google.android.apps.gsa.shared.util.p7162d.C90962a.m148577a(r8)
            if (r1 == r8) goto L_0x034a
            r1 = 4626(0x1212, float:6.482E-42)
            goto L_0x034c
        L_0x034a:
            r1 = 4610(0x1202, float:6.46E-42)
        L_0x034c:
            android.view.View r8 = r5.getDecorView()
            r8.setSystemUiVisibility(r1)
            r1 = 56
            r5.addFlags(r1)
            r1 = 0
            r5.setNavigationBarColor(r1)
        L_0x035c:
            android.content.Context r1 = r3.f314496a
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r3 = 2131626671(0x7f0e0aaf, float:1.8880585E38)
            r5 = 0
            android.view.View r1 = r1.inflate(r3, r5)
            r3 = 2131435111(0x7f0b1e67, float:1.8492055E38)
            android.view.View r3 = r1.findViewById(r3)
            r8 = 1
            r3.setLayerType(r8, r5)
            r3 = 8
            r1.setVisibility(r3)
            r0.f306360a = r1
            com.google.android.apps.gsa.assist.d.a r3 = r0.f306363d
            r5 = r3
            com.google.android.apps.gsa.assist.cb r5 = (com.google.android.apps.gsa.assist.C9397cb) r5
            r5.f32620q = r1
            android.view.View r1 = r0.f306360a
            r3.setContentView(r1)
            r1 = 1
            goto L_0x038b
        L_0x038a:
            r1 = 0
        L_0x038b:
            boolean r3 = r0.m183128d(r4, r2)
            if (r3 == 0) goto L_0x0396
            r3 = 1
            r7.f236550au = r3
            r7.f236541al = r3
        L_0x0396:
            android.os.Bundle r3 = r7.mo81685a()
            boolean r4 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142251Z(r3)
            if (r4 == 0) goto L_0x03a5
            int r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142308g(r3)
            goto L_0x03b8
        L_0x03a5:
            r4 = 268468224(0x10008000, float:2.5342157E-29)
            if (r2 == 0) goto L_0x03b5
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            if (r24 == 0) goto L_0x03b8
            com.google.android.apps.gsa.staticplugins.opa.ah.o r5 = r0.f306380u
            boolean r5 = r5.f296314a
            if (r5 == 0) goto L_0x03b5
            goto L_0x03b8
        L_0x03b5:
            r2 = 268468224(0x10008000, float:2.5342157E-29)
        L_0x03b8:
            android.content.SharedPreferences r4 = r0.f306365f
            java.lang.String r5 = "opa_last_stop_timestamp"
            r7 = -1
            long r4 = r4.getLong(r5, r7)
            com.google.android.apps.gsa.search.core.i.t r9 = r0.f306361b
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247778na
            boolean r9 = r9.mo79746e(r10)
            if (r9 == 0) goto L_0x03f7
            com.google.android.apps.gsa.search.core.i.t r9 = r0.f306361b
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247208cn
            boolean r9 = r9.mo79746e(r10)
            if (r9 == 0) goto L_0x03f7
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x03f7
            com.google.android.libraries.f.a r7 = r0.f306362c
            long r7 = r7.mo26870b()
            long r7 = r7 - r4
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            com.google.android.apps.gsa.search.core.i.t r5 = r0.f306361b
            com.google.android.apps.gsa.shared.m.f r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247209co
            long r9 = r5.mo79743a(r9)
            long r4 = r4.toMillis(r9)
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x03f7
            r4 = -134250497(0xfffffffff7ff7fff, float:-1.03643107E34)
            r2 = r2 & r4
        L_0x03f7:
            com.google.common.base.ax r4 = r0.f306366g
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.util.bv r4 = (com.google.android.apps.gsa.staticplugins.opa.util.C113806bv) r4
            com.google.android.apps.gsa.assist.d.a r5 = r0.f306363d
            android.content.Context r5 = r5.getContext()
            android.content.Intent r2 = r4.mo100655a(r5, r3, r2)
            com.google.common.o.uf r3 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.tz r3 = (com.google.common.p4552o.C60548tz) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            int r5 = r4.f164093a
            r7 = 2
            r5 = r5 | r7
            r4.f164093a = r5
            r5 = 1022(0x3fe, float:1.432E-42)
            r4.f164258m = r5
            com.google.common.base.ax r4 = r0.f306373n
            boolean r5 = r4.mo56113h()
            if (r5 == 0) goto L_0x046b
            com.google.common.base.ax r5 = r0.f306374o
            boolean r5 = r5.mo56113h()
            if (r5 == 0) goto L_0x046b
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.apps.gsa.nga.api.bo r4 = (com.google.android.apps.gsa.nga.api.C74714bo) r4
            com.google.common.o.ahi r4 = r4.mo71080b()
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.common.o.uf r5 = (com.google.common.p4552o.C60555uf) r5
            int r4 = r4.f158764y
            r5.f164236cn = r4
            int r4 = r5.f164255j
            r4 = r4 | 16
            r5.f164255j = r4
            com.google.common.base.ax r4 = r0.f306374o
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.apps.gsa.nga.shared.v.h r4 = (com.google.android.apps.gsa.nga.shared.p6407v.C83278h) r4
            com.google.assistant.ab.w.g r4 = r4.mo75573b()
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.common.o.uf r5 = (com.google.common.p4552o.C60555uf) r5
            r4.getClass()
            r5.f164237co = r4
            int r4 = r5.f164255j
            r4 = r4 | 32
            r5.f164255j = r4
        L_0x046b:
            com.google.protobuf.bv r3 = r3.build()
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            r4 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r3, r4, r4, r4)
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f306361b
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247430gx
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x0487
            com.google.android.apps.gsa.assist.d.a r3 = r0.f306363d
            com.google.android.apps.gsa.assist.cb r3 = (com.google.android.apps.gsa.assist.C9397cb) r3
            r3.startAssistantActivity(r2)
            goto L_0x048c
        L_0x0487:
            com.google.android.apps.gsa.shared.util.t.c r3 = r0.f306364e
            r3.mo65089a(r2)
        L_0x048c:
            j$.util.Optional r2 = r0.f306377r
            boolean r2 = r2.isPresent()
            if (r2 == 0) goto L_0x04a1
            j$.util.Optional r2 = r0.f306377r
            java.lang.Object r2 = r2.get()
            com.google.android.apps.gsa.staticplugins.opa.ai.a.b r2 = (com.google.android.apps.gsa.staticplugins.opa.p8186ai.p8187a.C106178b) r2
            com.google.android.apps.gsa.staticplugins.opa.ai.a r3 = com.google.android.apps.gsa.staticplugins.opa.p8186ai.C106176a.VOICE_INTERACTION_SESSION
            r2.mo95346b(r3)
        L_0x04a1:
            if (r1 != 0) goto L_0x04ae
            com.google.android.apps.gsa.assist.d.a r1 = r0.f306363d
            r2 = 0
            r1.setUiEnabled(r2)
            com.google.android.apps.gsa.assist.d.a r1 = r0.f306363d
            r1.mo17598e(r6)
        L_0x04ae:
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f306361b
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249431dR
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x04ca
            com.google.common.base.ax r1 = r0.f306378s
            boolean r2 = r1.mo56113h()
            if (r2 == 0) goto L_0x04ca
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.ao r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.C111704ao) r1
            r2 = 0
            r1.mo99209a(r2)
        L_0x04ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109950q.mo76908a(android.os.Bundle, int):void");
    }
}

package com.google.android.apps.gsa.staticplugins.opa;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.staticplugins.opa.util.C113869cx;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* compiled from: PG */
public class EnterOpaActivity extends C109299iv {

    /* renamed from: a */
    public static final C59071e f295596a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivity");

    /* renamed from: b */
    public SharedPreferences f295597b;

    /* renamed from: c */
    public C68214a f295598c;

    /* renamed from: d */
    public C68214a f295599d;

    /* renamed from: e */
    public C86124t f295600e;

    /* renamed from: f */
    public C68214a f295601f;

    /* renamed from: g */
    public C113869cx f295602g;

    /* renamed from: h */
    public C58833ax f295603h;

    /* renamed from: i */
    public C58833ax f295604i;

    /* renamed from: j */
    public C58833ax f295605j;

    /* renamed from: k */
    public C68214a f295606k;

    /* renamed from: l */
    private Bundle f295607l = null;

    /* renamed from: m */
    private KeyguardManager f295608m;

    /* renamed from: a */
    public final void mo95145a(Bundle bundle) {
        ((C87568k) ((C58833ax) this.f295601f.mo27525b()).mo56107c()).mo81688b(getApplicationContext(), bundle);
        finish();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.apps.gsa.e.f r1 = com.google.android.apps.gsa.e.f.ah
            com.google.android.apps.gsa.p5846e.C74504a.m120462a(r1)
            super.onCreate(r18)
            android.content.ComponentName r1 = r17.getComponentName()
            java.lang.String r1 = r1.getClassName()
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivityFromHoldback"
            boolean r3 = r2.equals(r1)
            r4 = 1
            if (r3 == 0) goto L_0x0039
            android.content.SharedPreferences r3 = r0.f295597b
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r5 = "opa_enabled_from_settings"
            android.content.SharedPreferences$Editor r3 = r3.putBoolean(r5, r4)
            r3.apply()
            dagger.a r3 = r0.f295598c
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bm r3 = (com.google.android.apps.gsa.assistant.shared.bm) r3
            android.content.Context r5 = r17.getApplicationContext()
            r3.e(r5)
        L_0x0039:
            android.content.Intent r3 = r17.getIntent()
            boolean r3 = com.google.android.apps.gsa.staticplugins.opa.util.C113893x.m188579a(r3)
            r5 = 2
            if (r3 == 0) goto L_0x004f
            android.content.Intent r3 = r17.getIntent()
            android.net.Uri r3 = r3.getData()
            com.google.android.apps.gsa.staticplugins.opa.util.C113893x.m188580b(r3, r5)
        L_0x004f:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivity"
            boolean r3 = r3.equals(r1)
            r6 = 3
            r7 = 4
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x011d
            android.content.Intent r1 = r17.getIntent()
            java.lang.String r2 = "opa_zero_state_deep_link_url"
            java.lang.String r1 = r1.getStringExtra(r2)
            boolean r1 = com.google.common.base.C58837ba.m90859h(r1)
            if (r1 != 0) goto L_0x0106
            android.content.Intent r1 = r17.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            r1.getClass()
            dagger.a r2 = r0.f295606k
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.shared.h.n r2 = (com.google.android.apps.gsa.search.shared.p6930h.C87571n) r2
            java.lang.String r1 = com.google.android.apps.gsa.search.shared.p6930h.C87571n.m142343g(r1)
            java.lang.String r2 = "#buildOpaIntentZeroStateExtras(): Failed to parse the url."
            if (r1 != 0) goto L_0x0092
            com.google.common.f.e r1 = f295596a
            com.google.common.f.x r1 = r1.mo56226d()
            r3 = 22826(0x592a, float:3.1986E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0102
        L_0x0092:
            dagger.a r3 = r0.f295606k
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.shared.h.n r3 = (com.google.android.apps.gsa.search.shared.p6930h.C87571n) r3
            com.google.assistant.s.a.ih r1 = com.google.android.apps.gsa.search.shared.p6930h.C87571n.m142340d(r1)
            if (r1 != 0) goto L_0x00ac
            com.google.common.f.e r1 = f295596a
            com.google.common.f.x r1 = r1.mo56226d()
            r3 = 22825(0x5929, float:3.1985E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0102
        L_0x00ac:
            com.google.android.apps.gsa.search.shared.h.h r2 = new com.google.android.apps.gsa.search.shared.h.h
            r2.<init>()
            r2.f236499C = r4
            int r3 = r1.f139698d
            int r3 = com.google.assistant.p3994s.p3995a.C53284ie.m86806a(r3)
            if (r3 != 0) goto L_0x00bc
            goto L_0x00c0
        L_0x00bc:
            if (r3 != r6) goto L_0x00c0
            r3 = 1
            goto L_0x00c1
        L_0x00c0:
            r3 = 0
        L_0x00c1:
            r2.f236519W = r3
            dagger.a r3 = r0.f295606k
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.shared.h.n r3 = (com.google.android.apps.gsa.search.shared.p6930h.C87571n) r3
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.s.a.hw r1 = (com.google.assistant.p3994s.p3995a.C53275hw) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.s.a.ih r3 = (com.google.assistant.p3994s.p3995a.C53287ih) r3
            int r10 = r3.f139696b
            if (r10 != r6) goto L_0x00e0
            r3.f139696b = r9
            r3.f139697c = r8
        L_0x00e0:
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.s.a.ih r3 = (com.google.assistant.p3994s.p3995a.C53287ih) r3
            int r6 = r3.f139696b
            if (r6 != r7) goto L_0x00ef
            r3.f139696b = r9
            r3.f139697c = r8
        L_0x00ef:
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.s.a.ih r1 = (com.google.assistant.p3994s.p3995a.C53287ih) r1
            java.lang.String r1 = com.google.android.apps.gsa.search.shared.p6930h.C87571n.m142342f(r1)
            r2.f236520X = r1
            r1 = 6
            r2.f236560f = r1
            android.os.Bundle r8 = r2.mo81685a()
        L_0x0102:
            r8.getClass()
            goto L_0x0111
        L_0x0106:
            android.content.Intent r1 = r17.getIntent()
            android.os.Bundle r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142227B(r1)
            if (r1 == 0) goto L_0x011c
            r8 = r1
        L_0x0111:
            com.google.android.apps.gsa.assistant.shared.l.e r1 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r8)
            r16 = r8
            r8 = r1
            r1 = r16
            goto L_0x031e
        L_0x011c:
            throw r8
        L_0x011d:
            android.content.Intent r3 = r17.getIntent()
            java.lang.String r10 = "launched_by_dock"
            boolean r3 = r3.getBooleanExtra(r10, r9)
            if (r3 == 0) goto L_0x0144
            com.google.android.apps.gsa.search.shared.h.h r1 = new com.google.android.apps.gsa.search.shared.h.h
            r1.<init>()
            java.lang.String r2 = "and.opa.aod.logo"
            r1.f236523a = r2
            com.google.android.apps.gsa.assistant.shared.l.e r2 = com.google.android.apps.gsa.assistant.shared.l.e.ae
            r1.f236556b = r2
            r1.f236560f = r7
            r1.f236507K = r4
            r1.f236499C = r4
            r1.f236500D = r4
            android.os.Bundle r1 = r1.mo81685a()
            goto L_0x031e
        L_0x0144:
            android.content.Intent r3 = r17.getIntent()
            boolean r3 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148756i(r3)
            java.lang.String r10 = "android.intent.extra.TEXT"
            if (r3 == 0) goto L_0x01c2
            android.content.Intent r1 = r17.getIntent()
            com.google.android.apps.gsa.assistant.shared.l.e r1 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148750c(r1)
            android.content.Intent r2 = r17.getIntent()
            boolean r3 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148755h(r2)
            if (r3 == 0) goto L_0x0187
            java.lang.String r3 = r2.getStringExtra(r10)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L_0x017a
            com.google.common.f.e r2 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.f254322a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Got define intent with no text."
            r6 = 11427(0x2ca3, float:1.6013E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56386p(r3)
            goto L_0x01ba
        L_0x017a:
            java.lang.String r6 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148753f(r3, r0)
            com.google.android.apps.gsa.shared.search.b.g r3 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148751d(r2, r6, r3)
            android.os.Bundle r2 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148749b(r2, r6, r3)
            goto L_0x01bb
        L_0x0187:
            boolean r3 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148757j(r2)
            if (r3 == 0) goto L_0x01ba
            java.lang.String r3 = r2.getStringExtra(r10)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L_0x01a5
            com.google.common.f.e r2 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.f254322a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Got translate intent with no text."
            r6 = 11428(0x2ca4, float:1.6014E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56386p(r3)
            goto L_0x01ba
        L_0x01a5:
            java.util.Locale r6 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61898bh.m94556a(r2)
            j$.util.Optional r6 = p3186j$.util.Optional.ofNullable(r6)
            java.lang.String r7 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148754g(r3, r6, r0)
            com.google.android.apps.gsa.shared.search.b.g r3 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148752e(r2, r3, r6, r0)
            android.os.Bundle r2 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148749b(r2, r7, r3)
            goto L_0x01bb
        L_0x01ba:
            r2 = r8
        L_0x01bb:
            if (r2 == 0) goto L_0x01c1
            r8 = r1
            r1 = r2
            goto L_0x031e
        L_0x01c1:
            throw r8
        L_0x01c2:
            android.content.Intent r3 = r17.getIntent()
            java.lang.String r3 = r3.getAction()
            java.lang.String r11 = "android.intent.action.SEND"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x020d
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.content.Intent r2 = r17.getIntent()
            java.lang.String r2 = r2.getType()
            java.lang.String r3 = "type"
            r1.putString(r3, r2)
            android.content.Intent r2 = r17.getIntent()
            java.lang.CharSequence r2 = r2.getCharSequenceExtra(r10)
            r1.putCharSequence(r10, r2)
            android.content.Intent r2 = r17.getIntent()
            java.lang.String r3 = "android.intent.extra.STREAM"
            android.os.Parcelable r2 = r2.getParcelableExtra(r3)
            r1.putParcelable(r3, r2)
            com.google.android.apps.gsa.search.shared.h.h r2 = new com.google.android.apps.gsa.search.shared.h.h
            r2.<init>()
            r2.f236542am = r1
            r2.f236499C = r4
            r2.f236519W = r4
            android.os.Bundle r1 = r2.mo81685a()
            goto L_0x031e
        L_0x020d:
            int r3 = r1.hashCode()
            java.lang.String r8 = "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivityFromLauncher"
            java.lang.String r10 = "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivityFromAssist"
            java.lang.String r11 = "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivityFromMicWidget"
            java.lang.String r12 = "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivityFromDeeplink"
            switch(r3) {
                case -2000675585: goto L_0x023d;
                case -856100417: goto L_0x0235;
                case 326081458: goto L_0x022d;
                case 1379073922: goto L_0x0225;
                case 1402382969: goto L_0x021d;
                default: goto L_0x021c;
            }
        L_0x021c:
            goto L_0x0245
        L_0x021d:
            boolean r3 = r1.equals(r8)
            if (r3 == 0) goto L_0x0245
            r3 = 0
            goto L_0x0246
        L_0x0225:
            boolean r3 = r1.equals(r10)
            if (r3 == 0) goto L_0x0245
            r3 = 2
            goto L_0x0246
        L_0x022d:
            boolean r3 = r1.equals(r11)
            if (r3 == 0) goto L_0x0245
            r3 = 4
            goto L_0x0246
        L_0x0235:
            boolean r3 = r1.equals(r12)
            if (r3 == 0) goto L_0x0245
            r3 = 1
            goto L_0x0246
        L_0x023d:
            boolean r3 = r1.equals(r2)
            if (r3 == 0) goto L_0x0245
            r3 = 3
            goto L_0x0246
        L_0x0245:
            r3 = -1
        L_0x0246:
            if (r3 == 0) goto L_0x025f
            if (r3 == r4) goto L_0x025c
            if (r3 == r5) goto L_0x0259
            if (r3 == r6) goto L_0x0256
            if (r3 == r7) goto L_0x0253
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.a
            goto L_0x0261
        L_0x0253:
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.x
            goto L_0x0261
        L_0x0256:
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.bH
            goto L_0x0261
        L_0x0259:
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.ah
            goto L_0x0261
        L_0x025c:
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.aw
            goto L_0x0261
        L_0x025f:
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.bj
        L_0x0261:
            int r14 = r3.ordinal()
            r15 = 23
            if (r14 == r15) goto L_0x028f
            r15 = 59
            if (r14 == r15) goto L_0x028c
            r15 = 74
            if (r14 == r15) goto L_0x0289
            r15 = 113(0x71, float:1.58E-43)
            if (r14 == r15) goto L_0x0286
            r15 = 129(0x81, float:1.81E-43)
            if (r14 == r15) goto L_0x0283
            r15 = 137(0x89, float:1.92E-43)
            if (r14 == r15) goto L_0x0280
            java.lang.String r14 = "and.opa"
            goto L_0x0291
        L_0x0280:
            java.lang.String r14 = "and.opa.upgrade.settings"
            goto L_0x0291
        L_0x0283:
            java.lang.String r14 = "and.opa.eyes.from.qsb.lens.icon"
            goto L_0x0291
        L_0x0286:
            java.lang.String r14 = "and.opa.launcher.icon"
            goto L_0x0291
        L_0x0289:
            java.lang.String r14 = "and.opa.deeplink"
            goto L_0x0291
        L_0x028c:
            java.lang.String r14 = "and.opa.assistgesture"
            goto L_0x0291
        L_0x028f:
            java.lang.String r14 = "and.opa.widget.mic"
        L_0x0291:
            android.content.SharedPreferences r15 = r0.f295597b
            java.lang.String r15 = com.google.android.apps.gsa.staticplugins.opa.util.C113761ad.m188326a(r15)
            java.lang.String r9 = "typing"
            boolean r9 = r15.equals(r9)
            if (r4 == r9) goto L_0x02a1
            r9 = 2
            goto L_0x02a2
        L_0x02a1:
            r9 = 1
        L_0x02a2:
            com.google.android.apps.gsa.staticplugins.opa.util.cx r15 = r0.f295602g
            com.google.android.apps.gsa.search.core.i.t r13 = r0.f295600e
            boolean r13 = r15.mo100733f(r13, r3)
            com.google.android.apps.gsa.assistant.shared.l.e r15 = com.google.android.apps.gsa.assistant.shared.l.e.aJ
            if (r3 == r15) goto L_0x02b2
            com.google.android.apps.gsa.assistant.shared.l.e r15 = com.google.android.apps.gsa.assistant.shared.l.e.bz
            if (r3 != r15) goto L_0x02c3
        L_0x02b2:
            dagger.a r15 = r0.f295599d
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.libraries.lens.view.s.a r15 = (com.google.android.libraries.lens.view.p2162s.C27683a) r15
            boolean r15 = r15.mo33174a()
            if (r15 == 0) goto L_0x02c3
            r9 = 1
            r15 = 1
            goto L_0x02c4
        L_0x02c3:
            r15 = 0
        L_0x02c4:
            com.google.android.apps.gsa.search.shared.h.h r7 = new com.google.android.apps.gsa.search.shared.h.h
            r7.<init>()
            r7.f236561g = r4
            r7.f236560f = r9
            r9 = r13 | r15
            r7.f236497A = r9
            r7.f236523a = r14
            r7.f236556b = r3
            int r9 = r1.hashCode()
            switch(r9) {
                case -2000675585: goto L_0x02fd;
                case -856100417: goto L_0x02f5;
                case 326081458: goto L_0x02ed;
                case 1379073922: goto L_0x02e5;
                case 1402382969: goto L_0x02dd;
                default: goto L_0x02dc;
            }
        L_0x02dc:
            goto L_0x0305
        L_0x02dd:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0305
            r1 = 0
            goto L_0x0306
        L_0x02e5:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x0305
            r1 = 3
            goto L_0x0306
        L_0x02ed:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0305
            r1 = 1
            goto L_0x0306
        L_0x02f5:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x0305
            r1 = 2
            goto L_0x0306
        L_0x02fd:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0305
            r1 = 4
            goto L_0x0306
        L_0x0305:
            r1 = -1
        L_0x0306:
            if (r1 == 0) goto L_0x0313
            if (r1 == r4) goto L_0x0313
            if (r1 == r5) goto L_0x0313
            if (r1 == r6) goto L_0x0313
            r2 = 4
            if (r1 == r2) goto L_0x0314
            r2 = 0
            goto L_0x0314
        L_0x0313:
            r2 = 1
        L_0x0314:
            r7.f236558d = r2
            r7.f236498B = r13
            android.os.Bundle r8 = r7.mo81685a()
            r1 = r8
            r8 = r3
        L_0x031e:
            com.google.android.apps.gsa.assistant.shared.l.e r2 = com.google.android.apps.gsa.assistant.shared.l.e.ah
            if (r8 != r2) goto L_0x0325
            r0.f295607l = r1
            return
        L_0x0325:
            android.content.Context r2 = r17.getApplicationContext()
            java.lang.String r3 = "keyguard"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2
            r0.f295608m = r2
            com.google.android.apps.gsa.assistant.shared.l.e r2 = com.google.android.apps.gsa.assistant.shared.l.e.ae
            if (r8 != r2) goto L_0x036a
            boolean r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142270aR(r1)
            if (r2 == 0) goto L_0x036a
            com.google.common.base.ax r2 = r0.f295603h
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x036a
            com.google.common.base.ax r2 = r0.f295603h
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.assistant.shared.aa r2 = (com.google.android.apps.gsa.assistant.shared.C73798aa) r2
            int r2 = r2.mo65277a()
            if (r2 == r5) goto L_0x036a
            android.app.KeyguardManager r2 = r0.f295608m
            boolean r2 = r2.isDeviceLocked()
            if (r2 != 0) goto L_0x035c
            goto L_0x036a
        L_0x035c:
            r0.setShowWhenLocked(r4)
            android.app.KeyguardManager r2 = r0.f295608m
            com.google.android.apps.gsa.staticplugins.opa.ik r3 = new com.google.android.apps.gsa.staticplugins.opa.ik
            r3.<init>(r0, r1)
            r2.requestDismissKeyguard(r0, r3)
            return
        L_0x036a:
            java.lang.String r2 = "opa-query"
            java.lang.Object r2 = r1.get(r2)
            if (r2 != 0) goto L_0x03a2
            java.lang.String r2 = "opa-query-string"
            java.lang.Object r2 = r1.get(r2)
            if (r2 == 0) goto L_0x037b
            goto L_0x03a2
        L_0x037b:
            com.google.common.base.ax r2 = r0.f295605j
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x03a2
            com.google.common.base.ax r2 = r0.f295605j
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.nga.api.bx r2 = (com.google.android.apps.gsa.nga.api.C74720bx) r2
            com.google.android.apps.gsa.nga.api.NgaState r2 = r2.mo71089f()
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x03a2
            android.os.Bundle r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142229D(r1)
            if (r2 != 0) goto L_0x03a2
            boolean r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142270aR(r1)
            if (r2 != 0) goto L_0x03a2
            goto L_0x03a3
        L_0x03a2:
            r4 = 0
        L_0x03a3:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x03c2
            com.google.common.base.ax r2 = r0.f295604i
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.nga.api.bq r2 = (com.google.android.apps.gsa.nga.api.bq) r2
            java.lang.String r3 = "source"
            java.lang.String r1 = r1.getString(r3)
            r2.p(r1)
            r17.finish()
            return
        L_0x03c2:
            r0.mo95145a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivity.onCreate(android.os.Bundle):void");
    }

    public final void onResume() {
        super.onResume();
        Bundle bundle = this.f295607l;
        if (bundle != null) {
            Context applicationContext = getApplicationContext();
            C88489j jVar = new C88489j(C87739bu.START_OPA_ACTIVITY_FOR_L_ASSIST);
            jVar.mo82015c(bundle);
            C88483e.m142828c(applicationContext, jVar.mo82013a());
            finish();
        }
    }
}

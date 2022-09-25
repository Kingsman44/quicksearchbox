package com.google.android.apps.gsa.staticplugins.opa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.p059a.C0963k;
import com.google.android.apps.gsa.assistant.shared.d;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.search.shared.p6931i.C87573b;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.C90773bq;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8316b.C107713b;
import com.google.android.apps.gsa.staticplugins.opa.util.C113812ca;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114735e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114860dc;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.gb */
/* compiled from: PG */
public final class C109065gb extends C109273ih {

    /* renamed from: a */
    public static final C59071e f303614a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.gb");

    /* renamed from: A */
    private final C114860dc f303615A;

    /* renamed from: B */
    private final C114735e f303616B;

    /* renamed from: C */
    private final boolean f303617C;

    /* renamed from: D */
    private final C58833ax f303618D;

    /* renamed from: E */
    private final d f303619E;

    /* renamed from: F */
    private final C109056fz f303620F;

    /* renamed from: G */
    private final C39141kp f303621G;

    /* renamed from: H */
    private final C68214a f303622H;

    /* renamed from: I */
    private final String f303623I;

    /* renamed from: J */
    private final C105977ab f303624J;

    /* renamed from: K */
    private final C106000ac f303625K;

    /* renamed from: L */
    private final C106071ad f303626L;

    /* renamed from: M */
    private final C113812ca f303627M;

    /* renamed from: b */
    public final Activity f303628b;

    /* renamed from: c */
    public final C22871g f303629c;

    /* renamed from: d */
    public final C87573b f303630d;

    /* renamed from: f */
    private final C86124t f303631f;

    /* renamed from: g */
    private final Context f303632g;

    /* renamed from: h */
    private final C109051fu f303633h;

    /* renamed from: i */
    private final C109049fs f303634i;

    /* renamed from: j */
    private final C109050ft f303635j;

    /* renamed from: k */
    private final C109064ga f303636k;

    /* renamed from: l */
    private final C107713b f303637l;

    /* renamed from: m */
    private final C21370a f303638m;

    /* renamed from: n */
    private final PackageManager f303639n;

    /* renamed from: o */
    private final C107698i f303640o;

    /* renamed from: p */
    private final C90464f f303641p;

    /* renamed from: q */
    private final C86054o f303642q;

    /* renamed from: r */
    private final C58833ax f303643r;

    /* renamed from: s */
    private final C68214a f303644s;

    /* renamed from: t */
    private final C109790aj f303645t;

    /* renamed from: u */
    private final SharedPreferences f303646u;

    /* renamed from: v */
    private final C109739nm f303647v;

    /* renamed from: w */
    private final C58833ax f303648w;

    /* renamed from: x */
    private final C68214a f303649x;

    /* renamed from: y */
    private final C68214a f303650y;

    /* renamed from: z */
    private final C87571n f303651z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109065gb(C91097g gVar, C109051fu fuVar, C109049fs fsVar, C109050ft ftVar, C109064ga gaVar, C105977ab abVar, C107713b bVar, C90464f fVar, C106000ac acVar, C106071ad adVar, C109056fz fzVar, Activity activity, C86124t tVar, C107698i iVar, C21370a aVar, PackageManager packageManager, C86054o oVar, C58833ax axVar, C68214a aVar2, C109790aj ajVar, C113812ca caVar, SharedPreferences sharedPreferences, C109739nm nmVar, C58833ax axVar2, C68214a aVar3, C22871g gVar2, C68214a aVar4, C87571n nVar, C114860dc dcVar, C114735e eVar, boolean z, C58833ax axVar3, C87573b bVar2, d dVar, C39141kp kpVar, C68214a aVar5) {
        super(gVar);
        this.f303631f = tVar;
        this.f303626L = adVar;
        this.f303628b = activity;
        Context applicationContext = activity.getApplicationContext();
        this.f303632g = applicationContext;
        this.f303633h = fuVar;
        this.f303634i = fsVar;
        this.f303635j = ftVar;
        this.f303636k = gaVar;
        this.f303624J = abVar;
        this.f303637l = bVar;
        this.f303625K = acVar;
        this.f303627M = caVar;
        this.f303640o = iVar;
        this.f303641p = fVar;
        this.f303642q = oVar;
        this.f303638m = aVar;
        this.f303639n = packageManager;
        this.f303643r = axVar;
        this.f303644s = aVar2;
        this.f303645t = ajVar;
        this.f303646u = sharedPreferences;
        this.f303647v = nmVar;
        this.f303648w = axVar2;
        this.f303649x = aVar3;
        this.f303629c = gVar2;
        this.f303650y = aVar4;
        this.f303651z = nVar;
        this.f303615A = dcVar;
        this.f303616B = eVar;
        this.f303617C = z;
        this.f303618D = axVar3;
        this.f303619E = dVar;
        this.f303620F = fzVar;
        this.f303630d = bVar2;
        this.f303623I = C90773bq.m148323e(applicationContext);
        this.f303621G = kpVar;
        this.f303622H = aVar5;
    }

    /* renamed from: g */
    static boolean m181582g(Intent intent) {
        Uri data;
        String scheme;
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction()) || (data = intent.getData()) == null || (scheme = data.getScheme()) == null) {
            return false;
        }
        if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https")) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private final boolean m181583i(Uri uri) {
        if (this.f303618D.mo56113h() && ((C74720bx) this.f303618D.mo56107c()).mo71089f().a()) {
            return false;
        }
        Intent intent = new C0963k().mo3582a().f3074a;
        intent.setData(uri);
        ResolveInfo resolveActivity = this.f303639n.resolveActivity(intent, 65536);
        String str = null;
        if (!(resolveActivity == null || resolveActivity.activityInfo == null)) {
            str = resolveActivity.activityInfo.packageName;
        }
        if (str == null) {
            return false;
        }
        return C90721ae.f253800i.contains(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
        if (com.google.common.p4522b.C58557jl.m90139t(r6.f303631f.mo79745c(com.google.android.apps.gsa.shared.p7066m.C90014bt.f247060Y), com.google.android.libraries.p1646ay.C19601c.m37397d(r7)) == false) goto L_0x009f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo65089a(android.content.Intent r7) {
        /*
            r6 = this;
            dagger.a r0 = r6.f303649x
            java.lang.Object r0 = r0.mo27525b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L_0x0134
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f303631f
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247379fz
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x0134
            java.lang.String r0 = r7.getAction()
            java.lang.String r2 = r7.getPackage()
            android.content.ComponentName r3 = r7.getComponent()
            if (r3 == 0) goto L_0x0030
            android.content.ComponentName r3 = r7.getComponent()
            java.lang.String r3 = r3.flattenToString()
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            com.google.android.apps.gsa.search.core.i.t r4 = r6.f303631f
            com.google.android.apps.gsa.shared.m.h r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247089aa
            com.google.common.b.gu r4 = r4.mo79745c(r5)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0041
            goto L_0x0134
        L_0x0041:
            com.google.android.apps.gsa.search.core.i.t r3 = r6.f303631f
            com.google.android.apps.gsa.shared.m.h r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247328fA
            com.google.common.b.gu r3 = r3.mo79745c(r4)
            boolean r3 = com.google.common.p4522b.C58557jl.m90139t(r3, r0)
            if (r3 == 0) goto L_0x0051
            goto L_0x0127
        L_0x0051:
            com.google.android.apps.gsa.search.core.i.t r3 = r6.f303631f
            com.google.android.apps.gsa.shared.m.h r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247061Z
            com.google.common.b.gu r3 = r3.mo79745c(r4)
            boolean r0 = com.google.common.p4522b.C58557jl.m90139t(r3, r0)
            if (r0 != 0) goto L_0x0134
            if (r2 == 0) goto L_0x0079
            java.lang.String r0 = "com.waze"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            com.google.android.apps.gsa.assistant.shared.d r0 = r6.f303619E
            androidx.lifecycle.LiveData r0 = r0.a()
            java.lang.Object r0 = r0.mo3842a()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0134
        L_0x0079:
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f303631f
            com.google.android.apps.gsa.shared.m.h r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247090ab
            com.google.common.b.gu r0 = r0.mo79745c(r3)
            boolean r0 = com.google.common.p4522b.C58557jl.m90139t(r0, r2)
            if (r0 != 0) goto L_0x0134
            boolean r0 = com.google.android.libraries.p1646ay.C19601c.m37398e(r7)
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = com.google.android.libraries.p1646ay.C19601c.m37397d(r7)
            com.google.android.apps.gsa.search.core.i.t r2 = r6.f303631f
            com.google.android.apps.gsa.shared.m.h r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247060Y
            com.google.common.b.gu r2 = r2.mo79745c(r3)
            boolean r0 = com.google.common.p4522b.C58557jl.m90139t(r2, r0)
            if (r0 != 0) goto L_0x0134
        L_0x009f:
            java.lang.String r0 = "opa_allow_launch_intent_on_lockscreen"
            r2 = 0
            boolean r0 = r7.getBooleanExtra(r0, r2)
            if (r0 != 0) goto L_0x0134
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f303631f
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249700w
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = "interactive_element"
            java.lang.String r2 = r7.getStringExtra(r0)
            if (r2 == 0) goto L_0x0127
            java.lang.String r0 = r7.getStringExtra(r0)
            com.google.common.l.i r2 = com.google.common.p4541l.C59326i.f157517e
            java.lang.Object r3 = p3186j$.util.Objects.requireNonNull(r0)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = r2.mo56829i(r3)
            if (r2 == 0) goto L_0x0127
            com.google.common.l.i r2 = com.google.common.p4541l.C59326i.f157516d     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            byte[] r0 = r2.mo56836k(r0)     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            com.google.assistant.e.c.c.dg r3 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r0, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            com.google.assistant.e.c.c.dg r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r0     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            com.google.assistant.e.j.du r0 = r0.f132833e     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            if (r0 != 0) goto L_0x00e4
            com.google.assistant.e.j.du r0 = com.google.assistant.p3897e.p3921j.C51805du.f135924e     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
        L_0x00e4:
            java.lang.String r2 = "tap_input"
            com.google.protobuf.dn r0 = r0.f135929d     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            boolean r3 = r0.containsKey(r2)     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            if (r3 == 0) goto L_0x0113
            java.lang.Object r0 = r0.get(r2)     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            com.google.assistant.e.j.ka r0 = (com.google.assistant.p3897e.p3921j.C52230ka) r0     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            com.google.protobuf.z r0 = r0.f137061c     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            com.google.assistant.e.j.lo r3 = com.google.assistant.p3897e.p3921j.C52271lo.f137214c     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            com.google.assistant.e.j.lo r0 = (com.google.assistant.p3897e.p3921j.C52271lo) r0     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            com.google.android.apps.gsa.search.core.i.t r2 = r6.f303631f     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            com.google.android.apps.gsa.shared.m.h r3 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249681d     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            com.google.common.b.gu r2 = r2.mo79745c(r3)     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            java.lang.String r0 = r0.f137217b     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            boolean r0 = r2.contains(r0)     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            if (r0 == 0) goto L_0x0127
            goto L_0x0134
        L_0x0113:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            r0.<init>()     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
            throw r0     // Catch:{ ct -> 0x0119, IllegalArgumentException -> 0x0127 }
        L_0x0119:
            r0 = move-exception
            com.google.common.f.e r2 = f303614a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Invalid interactive_element to parse."
            r4 = 22719(0x58bf, float:3.1836E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
        L_0x0127:
            com.google.android.apps.gsa.staticplugins.opa.ac r0 = r6.f303625K
            com.google.android.apps.gsa.staticplugins.opa.fo r2 = new com.google.android.apps.gsa.staticplugins.opa.fo
            r2.<init>(r6, r7)
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r0.f295940a
            r7.mo97416D(r2)
            return r1
        L_0x0134:
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f303631f
            com.google.android.apps.gsa.shared.m.h r2 = com.google.android.apps.gsa.shared.p7066m.C89996bb.f246773c
            com.google.common.b.hd r0 = r0.mo79752r(r2)
            java.lang.String r2 = "result_interaction"
            java.lang.Object r3 = r0.get(r2)
            r4 = 0
            if (r3 == 0) goto L_0x0151
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            long r2 = java.lang.Long.parseLong(r0)
            goto L_0x0152
        L_0x0151:
            r2 = r4
        L_0x0152:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0163
            com.google.android.libraries.gsa.k.g r0 = r6.f303629c
            com.google.android.apps.gsa.staticplugins.opa.fn r4 = new com.google.android.apps.gsa.staticplugins.opa.fn
            r4.<init>(r6, r7)
            java.lang.String r7 = "ChatUiIntentStarter#startActivity"
            r0.mo28213m(r7, r2, r4)
            return r1
        L_0x0163:
            boolean r7 = r6.mo97560h(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109065gb.mo65089a(android.content.Intent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:201:0x05d0, code lost:
        if (r14 == 130) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0197, code lost:
        if (super.mo65089a(r17) == false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01fe, code lost:
        if (r3 != false) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02fb, code lost:
        if (r0.f303637l.mo96175b(r1) == false) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if (super.mo65089a(r17) == false) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x05e3  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05f2  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo97560h(android.content.Intent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "com.google.opa.QUERY"
            java.lang.String r5 = r1.getStringExtra(r2)
            java.lang.String r3 = "com.google.opa.SHOULD_REQUEST_TTS_HINT"
            r4 = 3
            r6 = 2
            r10 = 1
            r7 = 0
            if (r5 != 0) goto L_0x05a0
            java.lang.String r5 = "com.google.opa.webview.REFINEMENT_QUERY"
            android.os.Parcelable r5 = r1.getParcelableExtra(r5)
            com.google.android.apps.gsa.shared.search.Query r5 = (com.google.android.apps.gsa.shared.search.Query) r5
            if (r5 != 0) goto L_0x058e
            android.net.Uri r5 = r17.getData()
            if (r5 != 0) goto L_0x0023
            goto L_0x0041
        L_0x0023:
            java.lang.String r5 = "ImageViewerActivity"
            java.lang.String r8 = com.google.android.libraries.p1646ay.C19601c.m37397d(r17)
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0041
            com.google.android.libraries.search.logging.d.kp r5 = r0.f303621G
            java.lang.String r8 = "isVelourImageViewer"
            r5.mo41701p(r8)
            r5 = 8388608(0x800000, float:1.17549435E-38)
            r1.addFlags(r5)
            boolean r5 = super.mo65089a(r17)
            if (r5 != 0) goto L_0x0684
        L_0x0041:
            com.google.common.base.ax r5 = r0.f303648w
            boolean r5 = r5.mo56113h()
            if (r5 != 0) goto L_0x004b
            goto L_0x010a
        L_0x004b:
            com.google.android.libraries.search.logging.d.kp r5 = r0.f303621G
            java.lang.String r8 = "Calendar"
            r5.mo41701p(r8)
            com.google.common.base.ax r5 = r0.f303648w
            java.lang.Object r5 = r5.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.util.calendar.e r5 = (com.google.android.apps.gsa.staticplugins.opa.util.calendar.C113825e) r5
            java.lang.String r5 = "com.google.android.apps.gsa.staticplugins.opa.util.CalendarIntentRewriter.FALLBACK_URL"
            java.lang.String r5 = r1.getStringExtra(r5)
            if (r5 != 0) goto L_0x0065
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a
            goto L_0x008b
        L_0x0065:
            java.lang.String r8 = "com.google.android.apps.gsa.staticplugins.opa.util.CalendarIntentRewriter.EVENT_ID"
            java.lang.String r8 = r1.getStringExtra(r8)
            java.lang.String r9 = "com.google.android.apps.gsa.staticplugins.opa.util.CalendarIntentRewriter.CALENDAR_ID"
            java.lang.String r9 = r1.getStringExtra(r9)
            java.lang.String r11 = "com.google.android.apps.gsa.staticplugins.opa.util.CalendarIntentRewriter.SOURCE_PROFILE"
            java.lang.String r11 = r1.getStringExtra(r11)
            java.lang.String r12 = "WORK"
            boolean r11 = p3186j$.util.Objects.equals(r11, r12)
            if (r10 == r11) goto L_0x0081
            r11 = 1
            goto L_0x0082
        L_0x0081:
            r11 = 2
        L_0x0082:
            com.google.android.apps.gsa.staticplugins.opa.util.calendar.OpenCalendarEventIntentData r12 = new com.google.android.apps.gsa.staticplugins.opa.util.calendar.OpenCalendarEventIntentData
            r12.<init>(r5, r8, r9, r11)
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90834k(r12)
        L_0x008b:
            boolean r8 = r5.mo56113h()
            if (r8 == 0) goto L_0x010a
            com.google.common.base.ax r1 = r0.f303648w
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.util.calendar.e r1 = (com.google.android.apps.gsa.staticplugins.opa.util.calendar.C113825e) r1
            java.lang.Object r2 = r5.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.util.calendar.OpenCalendarEventIntentData r2 = (com.google.android.apps.gsa.staticplugins.opa.util.calendar.OpenCalendarEventIntentData) r2
            boolean r1 = r1.mo100683d(r2)
            if (r1 == 0) goto L_0x00da
            com.google.common.base.ax r1 = r0.f303648w
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.util.calendar.e r1 = (com.google.android.apps.gsa.staticplugins.opa.util.calendar.C113825e) r1
            java.lang.Object r2 = r5.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.util.calendar.OpenCalendarEventIntentData r2 = (com.google.android.apps.gsa.staticplugins.opa.util.calendar.OpenCalendarEventIntentData) r2
            com.google.common.util.concurrent.cx r1 = r1.mo100682c(r2)
            com.google.android.apps.gsa.staticplugins.opa.fw r2 = new com.google.android.apps.gsa.staticplugins.opa.fw
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            com.google.common.base.ax r4 = r0.f303648w
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.util.calendar.e r4 = (com.google.android.apps.gsa.staticplugins.opa.util.calendar.C113825e) r4
            java.lang.Object r5 = r5.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.util.calendar.OpenCalendarEventIntentData r5 = (com.google.android.apps.gsa.staticplugins.opa.util.calendar.OpenCalendarEventIntentData) r5
            android.content.Intent r4 = r4.mo100680a(r5)
            r2.<init>(r3, r4)
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r1, r2, r3)
            goto L_0x0684
        L_0x00da:
            com.google.common.base.ax r1 = r0.f303648w
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.util.calendar.e r1 = (com.google.android.apps.gsa.staticplugins.opa.util.calendar.C113825e) r1
            java.lang.Object r2 = r5.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.util.calendar.OpenCalendarEventIntentData r2 = (com.google.android.apps.gsa.staticplugins.opa.util.calendar.OpenCalendarEventIntentData) r2
            com.google.common.util.concurrent.cx r3 = r1.mo100682c(r2)
            com.google.android.apps.gsa.staticplugins.opa.util.calendar.d r4 = new com.google.android.apps.gsa.staticplugins.opa.util.calendar.d
            r4.<init>(r1, r2)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            java.lang.Class<java.lang.Exception> r2 = java.lang.Exception.class
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60846c.m92879h(r3, r2, r4, r1)
            com.google.android.apps.gsa.staticplugins.opa.fy r2 = new com.google.android.apps.gsa.staticplugins.opa.fy
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r2.<init>(r3)
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r1, r2, r3)
            goto L_0x0684
        L_0x010a:
            java.lang.String r5 = "interactive_element"
            java.lang.String r5 = r1.getStringExtra(r5)
            if (r5 != 0) goto L_0x0113
            goto L_0x0163
        L_0x0113:
            com.google.common.l.i r8 = com.google.common.p4541l.C59326i.f157517e
            boolean r8 = r8.mo56829i(r5)
            if (r8 == 0) goto L_0x0163
            com.google.android.libraries.search.logging.d.kp r8 = r0.f303621G
            java.lang.String r9 = "CmlClientInputInteraction"
            r8.mo41701p(r9)
            com.google.common.l.i r8 = com.google.common.p4541l.C59326i.f157517e     // Catch:{ ct -> 0x0156 }
            byte[] r8 = r8.mo56836k(r5)     // Catch:{ ct -> 0x0156 }
            com.google.assistant.e.c.c.dg r9 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g     // Catch:{ ct -> 0x0156 }
            com.google.protobuf.bv r8 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r9, (byte[]) r8)     // Catch:{ ct -> 0x0156 }
            com.google.assistant.e.c.c.dg r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r8     // Catch:{ ct -> 0x0156 }
            com.google.common.base.ax r5 = com.google.android.apps.gsa.staticplugins.opa.util.C113762ae.m188327a(r8)
            boolean r8 = r5.mo56113h()
            if (r8 == 0) goto L_0x0163
            boolean r2 = r1.getBooleanExtra(r3, r10)
            java.lang.String r3 = "com.google.opa.SHOULD_SCROLL_DOWN"
            boolean r3 = r1.getBooleanExtra(r3, r7)
            com.google.android.apps.gsa.staticplugins.opa.ft r4 = r0.f303635j
            java.lang.Object r5 = r5.mo56107c()
            com.google.android.apps.gsa.search.shared.service.ClientEventData r5 = (com.google.android.apps.gsa.search.shared.service.ClientEventData) r5
            r4.mo97421I(r5, r2, r3)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.e r2 = r0.f303616B
            r2.mo101558f(r1)
            goto L_0x0684
        L_0x0156:
            com.google.common.f.e r3 = f303614a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r8 = "Invalid interactive element received %s"
            r9 = 22723(0x58c3, float:3.1842E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r9)).mo56389s(r8, r5)
        L_0x0163:
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f303631f
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247370fq
            boolean r3 = r3.mo79746e(r5)
            java.lang.String r5 = "com.google.android.googlequicksearchbox"
            if (r3 != 0) goto L_0x0170
            goto L_0x0199
        L_0x0170:
            boolean r3 = m181582g(r17)
            if (r3 == 0) goto L_0x0199
            com.google.android.libraries.search.logging.d.kp r3 = r0.f303621G
            java.lang.String r8 = "ActionLinkUrl"
            r3.mo41701p(r8)
            java.lang.String r3 = r17.getDataString()
            if (r3 == 0) goto L_0x0199
            java.lang.String r8 = "https://assistant.google.com/services/invoke"
            boolean r3 = r3.startsWith(r8)
            if (r3 == 0) goto L_0x0199
            com.google.android.apps.gsa.staticplugins.opa.fs r3 = r0.f303634i
            r3.mo97502bL()
            r1.setPackage(r5)
            boolean r3 = super.mo65089a(r17)
            if (r3 != 0) goto L_0x0684
        L_0x0199:
            boolean r3 = m181582g(r17)
            if (r3 == 0) goto L_0x02a3
            com.google.android.libraries.search.logging.d.kp r3 = r0.f303621G
            java.lang.String r8 = "WebUri"
            r3.mo41701p(r8)
            java.lang.String r3 = "use_webview"
            boolean r3 = r1.getBooleanExtra(r3, r7)
            if (r3 != 0) goto L_0x01af
            goto L_0x0202
        L_0x01af:
            java.lang.String r3 = "hide_status_bar"
            boolean r8 = r1.getBooleanExtra(r3, r7)
            java.lang.String r9 = "use_landscape_orientation"
            boolean r11 = r1.hasExtra(r9)
            if (r11 == 0) goto L_0x01c3
            boolean r9 = r1.getBooleanExtra(r9, r7)
            r9 = r9 ^ r10
            goto L_0x01c4
        L_0x01c3:
            r9 = 2
        L_0x01c4:
            r17.getData()
            java.lang.String r11 = "full_screen"
            r1.putExtra(r11, r10)
            r1.putExtra(r3, r8)
            java.lang.String r3 = "screen_orientation"
            r1.putExtra(r3, r9)
            com.google.android.apps.gsa.shared.az.a r3 = com.google.android.apps.gsa.search.shared.inappwebpage.C87574a.f236603a
            android.content.Intent r3 = r3.mo83277a(r1)
            java.lang.String r8 = "bot_game_id"
            boolean r9 = r1.hasExtra(r8)
            if (r9 == 0) goto L_0x01fa
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r11 = "opacallback.EXTRA_GAME_ID"
            java.lang.String r8 = r1.getStringExtra(r8)
            r9.putString(r11, r8)
            com.google.android.apps.gsa.staticplugins.opa.OpaResultCallback r8 = new com.google.android.apps.gsa.staticplugins.opa.OpaResultCallback
            r8.<init>(r10, r9)
            boolean r3 = super.mo65090b(r3, r8)
            goto L_0x01fe
        L_0x01fa:
            boolean r3 = super.mo65089a(r3)
        L_0x01fe:
            if (r3 == 0) goto L_0x0202
            goto L_0x0684
        L_0x0202:
            android.net.Uri r3 = r17.getData()
            com.google.android.libraries.f.a r8 = r0.f303638m
            long r8 = r8.mo26871c()
            r11 = 0
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0219
            com.google.android.libraries.f.a r1 = r0.f303638m
            r1.mo26871c()
            goto L_0x0684
        L_0x0219:
            boolean r3 = r0.m181583i(r3)
            if (r3 != 0) goto L_0x0221
            goto L_0x02a3
        L_0x0221:
            java.lang.String r3 = "DISPATCHED_TO_CHROMEPLATE_CHECK"
            boolean r8 = r1.getBooleanExtra(r3, r7)
            if (r8 != 0) goto L_0x02a3
            java.lang.String r2 = "android.intent.category.BROWSABLE"
            r1.addCategory(r2)
            com.google.android.apps.gsa.search.shared.service.j r2 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.BROWSABLE_INTENT_LAUNCHED_IN_CLIENT
            r2.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r5)
            r2.mo82015c(r1)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r2 = r2.mo82013a()
            r1.putExtra(r3, r10)
            r3 = 7
            java.lang.String r5 = "com.google.android.apps.gsa.customtabs.SOURCE"
            int r3 = r1.getIntExtra(r5, r3)
            com.google.common.o.rz r3 = com.google.common.p4552o.C60494rz.m92598a(r3)
            com.google.common.o.rz r6 = com.google.common.p4552o.C60494rz.AMP
            if (r3 == r6) goto L_0x0265
            int r3 = r3.f163762v
            r1.putExtra(r5, r3)
            android.content.Context r3 = r0.f303632g
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131100207(0x7f06022f, float:1.7812789E38)
            int r3 = r3.getColor(r5)
            java.lang.String r5 = "android.support.customtabs.extra.TOOLBAR_COLOR"
            r1.putExtra(r5, r3)
        L_0x0265:
            android.content.Context r3 = r0.f303632g
            r5 = 2130772164(0x7f0100c4, float:1.7147439E38)
            r6 = 2130772169(0x7f0100c9, float:1.7147449E38)
            androidx.core.app.j r3 = androidx.core.app.C1823j.m4996a(r3, r5, r6)
            androidx.core.app.h r3 = (androidx.core.app.C1821h) r3
            android.app.ActivityOptions r3 = r3.f5645a
            android.os.Bundle r3 = r3.toBundle()
            java.lang.String r5 = "com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION"
            r1.putExtra(r5, r4)
            java.lang.String r4 = "com.google.android.apps.gsa.shared.util.starter.IntentStarter.CUSTOM_TRANSITION"
            r1.putExtra(r4, r3)
            android.content.Context r3 = r0.f303632g
            r4 = 2130772163(0x7f0100c3, float:1.7147437E38)
            r5 = 2130772170(0x7f0100ca, float:1.714745E38)
            androidx.core.app.j r3 = androidx.core.app.C1823j.m4996a(r3, r4, r5)
            androidx.core.app.h r3 = (androidx.core.app.C1821h) r3
            android.app.ActivityOptions r3 = r3.f5645a
            android.os.Bundle r3 = r3.toBundle()
            java.lang.String r4 = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE"
            r1.putExtra(r4, r3)
            com.google.android.apps.gsa.staticplugins.opa.az.i r1 = r0.f303640o
            r1.mo96219b(r2)
            goto L_0x0684
        L_0x02a3:
            java.lang.String r3 = "com.google.opa.HELP"
            boolean r3 = r1.getBooleanExtra(r3, r7)
            if (r3 != 0) goto L_0x053b
            java.lang.String r3 = r17.getDataString()
            if (r3 == 0) goto L_0x02c7
            java.lang.String r8 = "opa-android://send_feedback"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x02c7
            com.google.android.libraries.search.logging.d.kp r1 = r0.f303621G
            java.lang.String r2 = "Feedback"
            r1.mo41701p(r2)
            com.google.android.apps.gsa.staticplugins.opa.ga r1 = r0.f303636k
            r1.mo97429Q()
            goto L_0x0684
        L_0x02c7:
            java.lang.String r3 = "opa_exit_signed_out_mode_and_relaunch"
            boolean r3 = r1.getBooleanExtra(r3, r7)
            r8 = 0
            if (r3 != 0) goto L_0x0447
            java.lang.String r2 = "is_android_setting_internal_intent"
            boolean r2 = r1.getBooleanExtra(r2, r7)
            if (r2 != 0) goto L_0x0436
            java.lang.String r2 = "opa_record_third_party_disclosures_acknowledged"
            boolean r2 = r1.getBooleanExtra(r2, r7)
            if (r2 != 0) goto L_0x040f
            java.lang.String r2 = r17.getDataString()
            if (r2 == 0) goto L_0x02fd
            java.lang.String r3 = "opa-android://launch_keyboard"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x02fd
            com.google.android.libraries.search.logging.d.kp r2 = r0.f303621G
            java.lang.String r3 = "Keyboard"
            r2.mo41701p(r3)
            com.google.android.apps.gsa.staticplugins.opa.b.b r2 = r0.f303637l
            boolean r2 = r2.mo96175b(r1)
            if (r2 != 0) goto L_0x0684
        L_0x02fd:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.dc r2 = r0.f303615A
            boolean r2 = r2.mo101661f(r1)
            if (r2 != 0) goto L_0x03e6
            if (r1 == 0) goto L_0x0322
            java.lang.String r2 = "android.intent.action.DRL_HISTORY"
            java.lang.String r3 = r17.getAction()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0314
            goto L_0x0322
        L_0x0314:
            com.google.android.libraries.search.logging.d.kp r1 = r0.f303621G
            java.lang.String r2 = "DrlHistory"
            r1.mo41701p(r2)
            com.google.android.apps.gsa.staticplugins.opa.fz r1 = r0.f303620F
            r1.mo97425M()
            goto L_0x0684
        L_0x0322:
            java.lang.String r2 = "com.google.android.apps.gsa.shared.util.starter.IntentStarter.ERROR_TOAST_ID"
            int r3 = r1.getIntExtra(r2, r7)
            if (r3 != 0) goto L_0x033a
            boolean r3 = m181582g(r17)
            if (r10 == r3) goto L_0x0334
            r3 = 2132082904(0x7f1500d8, float:1.9805935E38)
            goto L_0x0337
        L_0x0334:
            r3 = 2132090133(0x7f151d15, float:1.9820597E38)
        L_0x0337:
            r1.putExtra(r2, r3)
        L_0x033a:
            dagger.a r2 = r0.f303644s
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.x.a r2 = (com.google.android.apps.gsa.search.core.p6883x.C87280a) r2
            r2.mo80926a(r1)
            java.lang.String r2 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r17)
            if (r2 != 0) goto L_0x03b2
            android.app.Activity r2 = r0.f303628b
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.util.List r2 = r2.queryIntentActivities(r1, r7)
            java.util.Iterator r2 = r2.iterator()
        L_0x0359:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03b2
            java.lang.Object r3 = r2.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r4 = r3.activityInfo
            if (r4 == 0) goto L_0x0359
            android.content.pm.ActivityInfo r4 = r3.activityInfo
            java.lang.String r4 = r4.packageName
            if (r4 == 0) goto L_0x0359
            android.content.pm.ActivityInfo r4 = r3.activityInfo
            java.lang.String r4 = r4.name
            if (r4 == 0) goto L_0x0359
            android.content.pm.ActivityInfo r4 = r3.activityInfo
            java.lang.String r4 = r4.packageName
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0359
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.name
            java.lang.Boolean r3 = com.google.android.apps.gsa.h.g.e.a(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0359
            java.lang.String r2 = r17.getAction()
            java.lang.String r3 = "com.google.android.googlequicksearchbox.GOOGLE_SEARCH"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x03a9
            java.lang.String r3 = "com.google.android.googlequicksearchbox.INTERNAL_GOOGLE_SEARCH"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x03a9
            java.lang.String r3 = "android.intent.action.WEB_SEARCH"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x03b2
        L_0x03a9:
            com.google.android.apps.gsa.staticplugins.opa.util.ca r2 = r0.f303627M
            java.lang.String r2 = r2.f315214a
            java.lang.String r3 = "source"
            r1.putExtra(r3, r2)
        L_0x03b2:
            java.lang.String r2 = r17.getPackage()
            if (r2 == 0) goto L_0x03cd
            java.lang.String r3 = "com.google.android.apps.messaging"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x03cd
            dagger.a r2 = r0.f303650y
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.util.s.a r2 = (com.google.android.apps.gsa.shared.util.p7183s.C91088a) r2
            android.content.Context r3 = r0.f303632g
            r2.mo85355d(r3, r1)
        L_0x03cd:
            android.net.Uri r2 = r17.getData()
            boolean r2 = r0.m181583i(r2)
            if (r2 == 0) goto L_0x03e1
            com.google.android.apps.gsa.staticplugins.opa.fp r2 = new com.google.android.apps.gsa.staticplugins.opa.fp
            r2.<init>(r0)
            boolean r1 = super.mo65090b(r1, r2)
            return r1
        L_0x03e1:
            boolean r1 = super.mo65089a(r17)
            return r1
        L_0x03e6:
            com.google.android.libraries.search.logging.d.kp r2 = r0.f303621G
            java.lang.String r3 = "ZeroState"
            r2.mo41701p(r3)
            com.google.android.apps.gsa.search.shared.h.n r2 = r0.f303651z
            boolean r2 = r2.mo81696h(r1)
            if (r2 == 0) goto L_0x0408
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f303631f
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247287eM
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x0408
            com.google.android.apps.gsa.search.shared.h.n r2 = r0.f303651z
            android.content.Context r3 = r0.f303632g
            r2.mo81700l(r3, r1, r8)
            goto L_0x0684
        L_0x0408:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.dc r2 = r0.f303615A
            r2.mo101659d(r1, r8)
            goto L_0x0684
        L_0x040f:
            com.google.android.libraries.search.logging.d.kp r1 = r0.f303621G
            java.lang.String r2 = "3pDisclosuresAcknowledged"
            r1.mo41701p(r2)
            com.google.android.apps.gsa.search.core.google.gaia.o r1 = r0.f303642q
            android.accounts.Account r1 = r1.mo79668a()
            if (r1 != 0) goto L_0x042f
            android.content.SharedPreferences r1 = r0.f303646u
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "opa_has_acknowledged_third_party_disclosures"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r10)
            r1.apply()
            goto L_0x0684
        L_0x042f:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.aj r2 = r0.f303645t
            r2.mo98128j(r1, r4)
            goto L_0x0684
        L_0x0436:
            com.google.android.libraries.search.logging.d.kp r2 = r0.f303621G
            java.lang.String r3 = "AndroidSetting"
            r2.mo41701p(r3)
            com.google.android.apps.gsa.staticplugins.opa.fr r2 = new com.google.android.apps.gsa.staticplugins.opa.fr
            r2.<init>()
            super.mo65090b(r1, r2)
            goto L_0x0684
        L_0x0447:
            com.google.android.libraries.search.logging.d.kp r3 = r0.f303621G
            java.lang.String r4 = "ExitSignedOutModeAndRelaunch"
            r3.mo41701p(r4)
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f303631f
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248950Q
            boolean r3 = r3.mo79746e(r4)
            if (r3 != 0) goto L_0x0465
            com.google.android.apps.gsa.search.core.google.gaia.o r3 = r0.f303642q
            android.accounts.Account r3 = r3.mo79668a()
            if (r3 == 0) goto L_0x0465
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.aj r4 = r0.f303645t
            r4.mo98124f(r3)
        L_0x0465:
            android.os.Bundle r3 = r17.getExtras()
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142270aR(r3)
            if (r3 != 0) goto L_0x04ab
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f303631f
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247246dY
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x04ab
            com.google.android.apps.gsa.staticplugins.opa.ad r3 = r0.f303626L
            com.google.android.apps.gsa.staticplugins.opa.fj r3 = r3.f296112a
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r3 = r3.f303450o
            boolean r4 = r3 instanceof com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g
            if (r4 == 0) goto L_0x04ab
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.g r3 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g) r3
            com.google.common.base.ax r3 = r3.mo100833bf()
            java.lang.Object r3 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r3 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h) r3
            boolean r3 = r3.mo100908dj()
            if (r3 == 0) goto L_0x04ab
            java.lang.String r3 = "string_client_input"
            java.lang.String r3 = r1.getStringExtra(r3)
            if (r3 == 0) goto L_0x04ab
            com.google.common.l.i r4 = com.google.common.p4541l.C59326i.f157517e
            boolean r4 = r4.mo56829i(r3)
            if (r4 == 0) goto L_0x04ab
            com.google.common.l.i r4 = com.google.common.p4541l.C59326i.f157517e
            byte[] r8 = r4.mo56836k(r3)
        L_0x04ab:
            if (r8 == 0) goto L_0x04ae
            r7 = 1
        L_0x04ae:
            if (r8 == 0) goto L_0x04b2
            r2 = 4
            goto L_0x04b3
        L_0x04b2:
            r2 = 2
        L_0x04b3:
            android.app.Activity r3 = r0.f303628b
            android.content.Intent r3 = r3.getIntent()
            android.os.Bundle r3 = r3.getExtras()
            java.lang.String r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142241P(r3)
            if (r3 != 0) goto L_0x04c5
            java.lang.String r3 = "and.opa"
        L_0x04c5:
            android.os.Bundle r1 = r17.getExtras()
            com.google.android.apps.gsa.search.shared.h.h r4 = new com.google.android.apps.gsa.search.shared.h.h
            r4.<init>(r1)
            r4.f236560f = r2
            r4.f236523a = r3
            r4.f236497A = r7
            r4.f236515S = r10
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f303631f
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248950Q
            boolean r1 = r1.mo79746e(r2)
            r1 = r1 ^ r10
            r4.f236516T = r1
            if (r7 == 0) goto L_0x04e7
            byte[] r8 = (byte[]) r8
            r4.f236517U = r8
        L_0x04e7:
            android.os.Bundle r1 = r4.mo81685a()
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f303631f
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247692lu
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x04fc
            com.google.android.apps.gsa.staticplugins.opa.nm r2 = r0.f303647v
            com.google.common.base.ax r2 = r2.mo98062c(r1)
            goto L_0x0502
        L_0x04fc:
            com.google.android.apps.gsa.staticplugins.opa.nm r2 = r0.f303647v
            com.google.common.base.ax r2 = r2.mo98061b(r1)
        L_0x0502:
            boolean r3 = r2.mo56113h()
            if (r3 == 0) goto L_0x0527
            boolean r1 = r0.f303617C
            if (r1 == 0) goto L_0x051c
            java.lang.Object r1 = r2.mo56107c()
            android.content.Intent r1 = (android.content.Intent) r1
            com.google.android.apps.gsa.staticplugins.opa.fq r2 = new com.google.android.apps.gsa.staticplugins.opa.fq
            r2.<init>(r0)
            super.mo65090b(r1, r2)
            goto L_0x0684
        L_0x051c:
            java.lang.Object r1 = r2.mo56107c()
            android.content.Intent r1 = (android.content.Intent) r1
            super.mo65089a(r1)
            goto L_0x0684
        L_0x0527:
            android.app.Activity r2 = r0.f303628b
            r2.finish()
            com.google.common.base.ax r2 = r0.f303643r
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.search.shared.h.k r2 = (com.google.android.apps.gsa.search.shared.p6930h.C87568k) r2
            android.content.Context r3 = r0.f303632g
            r2.mo81688b(r3, r1)
            goto L_0x0684
        L_0x053b:
            com.google.android.libraries.search.logging.d.kp r2 = r0.f303621G
            java.lang.String r3 = "Help"
            r2.mo41701p(r3)
            java.lang.String r2 = "com.google.opa.HELP_CONTEXT"
            java.lang.String r2 = r1.getStringExtra(r2)
            java.lang.String r3 = "com.google.opa.HELP_OPEN_TO_CONTACT_OPTION"
            int r3 = r1.getIntExtra(r3, r7)
            java.lang.String r4 = "com.google.opa.HELP_APP_PKG_NAME"
            java.lang.String r4 = r1.getStringExtra(r4)
            java.lang.String r5 = "com.google.opa.HELP_TRANSCRIPT"
            java.lang.String r1 = r1.getStringExtra(r5)
            com.google.android.apps.gsa.shared.r.c r5 = new com.google.android.apps.gsa.shared.r.c
            r5.<init>()
            com.google.android.apps.gsa.search.core.google.gaia.o r6 = r0.f303642q
            android.accounts.Account r6 = r6.mo79668a()
            r5.f252691c = r6
            r5.f252708t = r3
            boolean r3 = com.google.common.base.C58879cp.m90962d(r2)
            if (r3 != 0) goto L_0x0571
            r5.f252690b = r2
        L_0x0571:
            boolean r2 = com.google.common.base.C58879cp.m90962d(r4)
            if (r2 != 0) goto L_0x057c
            java.lang.String r2 = "genie-eng:app_pkg_name"
            r5.mo84198b(r2, r4)
        L_0x057c:
            boolean r2 = com.google.common.base.C58879cp.m90962d(r1)
            if (r2 != 0) goto L_0x0587
            java.lang.String r2 = "assistant_transcript"
            r5.mo84198b(r2, r1)
        L_0x0587:
            com.google.android.apps.gsa.shared.r.f r1 = r0.f303641p
            r1.mo84209b(r5, r7)
            goto L_0x0684
        L_0x058e:
            com.google.android.libraries.search.logging.d.kp r1 = r0.f303621G
            java.lang.String r2 = "WebViewRefinement"
            r1.mo41701p(r2)
            com.google.android.apps.gsa.staticplugins.opa.ab r1 = r0.f303624J
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r1.f295882a
            java.lang.String r2 = r5.f252770i
            r1.mo97426N(r2, r5)
            goto L_0x0684
        L_0x05a0:
            com.google.android.libraries.search.logging.d.kp r8 = r0.f303621G
            java.lang.String r9 = "InlineRefinement"
            r8.mo41701p(r9)
            java.lang.String r8 = "com.google.opa.DISPLAY_QUERY"
            java.lang.String r8 = r1.getStringExtra(r8)
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90833j(r8)
            java.lang.Object r8 = r8.mo56109e(r5)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "com.google.opa.REFINEMENT_CONTEXT_TOKEN"
            java.lang.String r9 = r1.getStringExtra(r9)
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r12 = "android.opa.extra.TRIGGERED_BY"
            r13 = 48
            int r14 = r1.getIntExtra(r12, r13)
            r15 = 157(0x9d, float:2.2E-43)
            r13 = 130(0x82, float:1.82E-43)
            if (r14 == r15) goto L_0x05d6
            if (r14 != r13) goto L_0x05d3
            goto L_0x05da
        L_0x05d3:
            r2 = 48
            goto L_0x0625
        L_0x05d6:
            if (r14 == r13) goto L_0x05da
            r13 = 0
            goto L_0x05db
        L_0x05da:
            r13 = 1
        L_0x05db:
            com.google.android.apps.gsa.search.core.google.gaia.o r14 = r0.f303642q
            android.accounts.Account r14 = r14.mo79668a()
            if (r14 == 0) goto L_0x05f2
            dagger.a r15 = r0.f303622H
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.assistant.settings.shared.ae r15 = (com.google.android.apps.gsa.assistant.settings.shared.ae) r15
            java.lang.String r14 = r14.name
            java.util.Locale r14 = r15.d(r14)
            goto L_0x05f6
        L_0x05f2:
            java.util.Locale r14 = java.util.Locale.getDefault()
        L_0x05f6:
            com.google.android.libraries.search.logging.d.kp r15 = r0.f303621G
            java.lang.String r2 = r0.f303623I
            java.lang.String r14 = r14.toString()
            com.google.common.base.cr r15 = r15.f102801L
            java.lang.Object r15 = r15.mo6453a()
            com.google.android.libraries.au.d r15 = (com.google.android.libraries.p1635au.C19567d) r15
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r7] = r2
            r4[r10] = r14
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            r4[r6] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            r6 = 3
            r4[r6] = r2
            java.lang.String r2 = ""
            r6 = 4
            r4[r6] = r2
            r13 = 1
            r15.mo24822a(r13, r4)
            goto L_0x05d3
        L_0x0625:
            int r2 = r1.getIntExtra(r12, r2)
            r11.putInt(r12, r2)
            java.lang.String r2 = "snapshot_origin_context"
            boolean r4 = r1.hasExtra(r2)
            if (r4 == 0) goto L_0x0653
            java.lang.String r2 = r1.getStringExtra(r2)
            java.lang.String r4 = "OnMyWayHomeSetupSnapshotOriginContext"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0646
            r2 = 115(0x73, float:1.61E-43)
            r11.putInt(r12, r2)
            goto L_0x0653
        L_0x0646:
            java.lang.String r4 = "OnMyWayHomeEditSnapshotOriginContext"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0653
            r2 = 118(0x76, float:1.65E-43)
            r11.putInt(r12, r2)
        L_0x0653:
            java.lang.String r2 = "com.google.opa.SEND_ORIGINAL_IMAGE"
            boolean r4 = r1.getBooleanExtra(r2, r7)
            if (r4 == 0) goto L_0x065e
            r11.putBoolean(r2, r10)
        L_0x065e:
            boolean r2 = r1.getBooleanExtra(r3, r10)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            java.lang.String r3 = "ved"
            java.lang.String r1 = r1.getStringExtra(r3)
            java.lang.String r7 = com.google.common.base.C58837ba.m90858g(r1)
            com.google.android.apps.gsa.staticplugins.opa.fu r3 = r0.f303633h
            r4 = r8
            r6 = r9
            r8 = r2
            r9 = r11
            r3.mo97423K(r4, r5, r6, r7, r8, r9)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.e r1 = r0.f303616B
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CONVERSATION_CANCELED_BY_NEW_QUERY
            r1.mo101555c(r2)
        L_0x0684:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109065gb.mo97560h(android.content.Intent):boolean");
    }
}

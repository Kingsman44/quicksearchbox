package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.settings.shared.aa;
import com.google.android.apps.gsa.assistant.settings.shared.ab;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114540i;
import com.google.android.apps.gsa.staticplugins.opa.util.C113759ab;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2186a.C28297a;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.setupcompat.p3550b.C45250g;
import com.google.android.setupdesign.p3556e.C45304a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* compiled from: PG */
public class SuwActivity extends C110491o {

    /* renamed from: a */
    public static final C59071e f307872a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.setupwizard.SuwActivity");

    /* renamed from: b */
    public C86054o f307873b;

    /* renamed from: c */
    public bm f307874c;

    /* renamed from: d */
    public C110464an f307875d;

    /* renamed from: e */
    public C68214a f307876e;

    /* renamed from: f */
    public ae f307877f;

    /* renamed from: g */
    public C114540i f307878g;

    /* renamed from: h */
    public C90021c f307879h;

    /* renamed from: i */
    public C113759ab f307880i;

    /* renamed from: j */
    public ab f307881j;

    /* renamed from: k */
    public C22871g f307882k;

    /* renamed from: l */
    public C28306ab f307883l;

    /* renamed from: m */
    public C28310af f307884m;

    /* renamed from: n */
    public aa f307885n;

    /* renamed from: b */
    public final void mo98670b(int i) {
        ((C59052c) ((C59052c) f307872a.mo56224b()).mo56372aa(26397)).mo56387q("continueSetupWizard: resultCode = %d", i);
        Intent intent = new Intent();
        C110464an anVar = this.f307875d;
        C110482f fVar = (C110482f) C110490n.f308029e.createBuilder();
        int i2 = 3;
        int i3 = true != anVar.f307957b.u() ? 3 : 2;
        fVar.copyOnWrite();
        C110490n nVar = (C110490n) fVar.instance;
        nVar.f308032b = i3 - 1;
        nVar.f308031a |= 1;
        Account a = anVar.f307956a.mo79668a();
        C110483g gVar = (C110483g) C110485i.f308019c.createBuilder();
        int i4 = (a == null || !anVar.f307958c.c(a.name)) ? 3 : 2;
        gVar.copyOnWrite();
        C110485i iVar = (C110485i) gVar.instance;
        iVar.f308022b = i4 - 1;
        iVar.f308021a |= 1;
        C110485i iVar2 = (C110485i) gVar.build();
        fVar.copyOnWrite();
        C110490n nVar2 = (C110490n) fVar.instance;
        iVar2.getClass();
        nVar2.f308033c = iVar2;
        nVar2.f308031a |= 2;
        C110487k kVar = (C110487k) C110489m.f308025c.createBuilder();
        if (true == anVar.f307959d.mo87249w()) {
            i2 = 2;
        }
        kVar.copyOnWrite();
        C110489m mVar = (C110489m) kVar.instance;
        mVar.f308028b = i2 - 1;
        mVar.f308027a |= 1;
        C110489m mVar2 = (C110489m) kVar.build();
        fVar.copyOnWrite();
        C110490n nVar3 = (C110490n) fVar.instance;
        mVar2.getClass();
        nVar3.f308034d = mVar2;
        nVar3.f308031a |= 4;
        intent.putExtra("setupWizardMetrics", ((C110490n) fVar.build()).toByteArray());
        setResult(i, intent);
        finish();
        if (C45304a.m80745a(this) != -1) {
            overridePendingTransition(0, 0);
        } else {
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    /* renamed from: d */
    public final void mo98671d() {
        new C90873ag(this.f307878g.mo101391a("opa_suw_completed", false), this.f307882k, "HasCompletedSuw", new C110456af(this)).mo85223a(new C110457ag(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0170, code lost:
        if (r15.equals("glif_v2_light") != false) goto L_0x0174;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0194  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98672e(boolean r15) {
        /*
            r14 = this;
            android.content.Intent r0 = r14.getIntent()
            r0.getClass()
            com.google.common.f.e r1 = f307872a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "onCreate: create. starting SUW sequence"
            r3 = 26405(0x6725, float:3.7001E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            java.lang.String r1 = "hardwareButtonTraining"
            r2 = 0
            boolean r1 = r0.getBooleanExtra(r1, r2)
            java.lang.String r3 = "hotword"
            r4 = 1
            boolean r5 = r0.getBooleanExtra(r3, r4)
            java.lang.String r6 = "valuePropSkippable"
            boolean r6 = r0.getBooleanExtra(r6, r2)
            boolean r7 = com.google.android.setupcompat.p3550b.C45250g.m80607c(r0)
            android.os.Bundle r8 = r0.getExtras()
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            if (r8 == 0) goto L_0x0063
            java.util.Set r10 = r8.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x003f:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0063
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "opaSuw"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L_0x003f
            java.lang.String r12 = r8.getString(r11)
            if (r12 == 0) goto L_0x003f
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L_0x003f
            r9.putString(r11, r12)
            goto L_0x003f
        L_0x0063:
            com.google.common.f.e r8 = f307872a
            com.google.common.f.x r10 = r8.mo56224b()
            java.lang.String r11 = "opaSuwIntentExtras = %s"
            r12 = 26394(0x671a, float:3.6986E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56389s(r11, r9)
            com.google.android.apps.gsa.staticplugins.opa.setupwizard.ax r10 = com.google.android.apps.gsa.staticplugins.opa.setupwizard.C110475ay.m184028g()
            r10.mo98711d(r15)
            r10.mo98710c(r1)
            r10.mo98712e(r5)
            r10.mo98709b(r6)
            r10.mo98713f(r7)
            r15 = r10
            com.google.android.apps.gsa.staticplugins.opa.setupwizard.c r15 = (com.google.android.apps.gsa.staticplugins.opa.setupwizard.C110479c) r15
            r15.f308000a = r9
            com.google.android.apps.gsa.staticplugins.opa.setupwizard.ay r15 = r10.mo98708a()
            com.google.common.f.x r1 = r8.mo56224b()
            java.lang.String r5 = "config = %s"
            r6 = 26395(0x671b, float:3.6987E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r6)).mo56389s(r5, r15)
            com.google.android.apps.gsa.shared.m.c r1 = r14.f307879h
            com.google.android.apps.gsa.shared.m.f r5 = com.google.android.apps.gsa.shared.p7066m.C90062dn.f249224w
            long r5 = r1.mo79743a(r5)
            int r1 = (int) r5
            com.google.common.f.x r5 = r8.mo56224b()
            java.lang.String r6 = "orientationMode = %d"
            r7 = 26396(0x671c, float:3.6989E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56387q(r6, r1)
            com.google.android.apps.gsa.opaonboarding.am r5 = com.google.android.apps.gsa.opaonboarding.C83880an.m133553o()
            r6 = r5
            com.google.android.apps.gsa.opaonboarding.g r6 = (com.google.android.apps.gsa.opaonboarding.C83940g) r6
            java.lang.String r7 = "SetupWizard_Phone"
            r6.f228605a = r7
            com.google.android.apps.gsa.opaonboarding.e r7 = new com.google.android.apps.gsa.opaonboarding.e
            r8 = 0
            r7.<init>(r2, r8, r8)
            r6.f228607c = r7
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r8 = "has_completed_suw"
            boolean r9 = r15.mo98717d()
            r7.putBoolean(r8, r9)
            java.lang.String r8 = "hardware_button_training"
            boolean r9 = r15.mo98716c()
            r7.putBoolean(r8, r9)
            boolean r8 = r15.mo98718e()
            r7.putBoolean(r3, r8)
            java.lang.String r3 = "skip_vp"
            boolean r8 = r15.mo98715b()
            r7.putBoolean(r3, r8)
            java.lang.String r3 = "is_deferred_suw"
            boolean r8 = r15.mo98719f()
            r7.putBoolean(r3, r8)
            java.lang.String r3 = "opa_suw_intent_extras"
            android.os.Bundle r15 = r15.mo98714a()
            r7.putBundle(r3, r15)
            r6.f228606b = r7
            java.lang.String r15 = "theme"
            java.lang.String r3 = r0.getStringExtra(r15)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r7 = "setupwizard.theme"
            if (r6 == 0) goto L_0x010b
            java.lang.String r3 = com.google.android.apps.gsa.shared.util.p7158b.C90744a.m148217a(r7)
        L_0x010b:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            r8 = 2
            r9 = -1
            if (r6 == 0) goto L_0x0114
            goto L_0x013c
        L_0x0114:
            int r6 = r3.hashCode()
            r10 = -1241052239(0xffffffffb6070bb1, float:-2.0123373E-6)
            if (r6 == r10) goto L_0x012d
            r10 = 115650330(0x6e4af1a, float:8.6021356E-35)
            if (r6 == r10) goto L_0x0123
            goto L_0x0137
        L_0x0123:
            java.lang.String r6 = "glif_v3"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0137
            r3 = 1
            goto L_0x0138
        L_0x012d:
            java.lang.String r6 = "glif_v3_light"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0137
            r3 = 0
            goto L_0x0138
        L_0x0137:
            r3 = -1
        L_0x0138:
            if (r3 == 0) goto L_0x017b
            if (r3 == r4) goto L_0x017b
        L_0x013c:
            java.lang.String r15 = r0.getStringExtra(r15)
            boolean r3 = android.text.TextUtils.isEmpty(r15)
            if (r3 == 0) goto L_0x014a
            java.lang.String r15 = com.google.android.apps.gsa.shared.util.p7158b.C90744a.m148217a(r7)
        L_0x014a:
            boolean r3 = android.text.TextUtils.isEmpty(r15)
            if (r3 == 0) goto L_0x0151
            goto L_0x017c
        L_0x0151:
            int r3 = r15.hashCode()
            r6 = -2128555920(0xffffffff8120d070, float:-2.9536905E-38)
            if (r3 == r6) goto L_0x016a
            r2 = 115650329(0x6e4af19, float:8.602135E-35)
            if (r3 == r2) goto L_0x0160
            goto L_0x0173
        L_0x0160:
            java.lang.String r2 = "glif_v2"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x0173
            r2 = 1
            goto L_0x0174
        L_0x016a:
            java.lang.String r3 = "glif_v2_light"
            boolean r15 = r15.equals(r3)
            if (r15 == 0) goto L_0x0173
            goto L_0x0174
        L_0x0173:
            r2 = -1
        L_0x0174:
            if (r2 == 0) goto L_0x0179
            if (r2 == r4) goto L_0x0179
            goto L_0x017c
        L_0x0179:
            r4 = 2
            goto L_0x017c
        L_0x017b:
            r4 = 5
        L_0x017c:
            r5.mo77226f(r4)
            com.google.common.o.a.w r15 = com.google.common.p4552o.p4553a.C59567w.f158058g
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.common.o.a.v r15 = (com.google.common.p4552o.p4553a.C59566v) r15
            android.content.Intent r2 = r14.getIntent()
            boolean r2 = com.google.android.setupcompat.p3550b.C45250g.m80607c(r2)
            if (r2 == 0) goto L_0x0194
            com.google.android.apps.gsa.assistant.b.a.b r2 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.DEFERRED_ANDROID_SETUP_WIZARD
            goto L_0x0196
        L_0x0194:
            com.google.android.apps.gsa.assistant.b.a.b r2 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.ANDROID_SETUP_WIZARD
        L_0x0196:
            r15.copyOnWrite()
            com.google.protobuf.bv r3 = r15.instance
            com.google.common.o.a.w r3 = (com.google.common.p4552o.p4553a.C59567w) r3
            int r2 = r2.f32835aq
            r3.f158062c = r2
            int r2 = r3.f158060a
            r2 = r2 | r8
            r3.f158060a = r2
            com.google.protobuf.bv r15 = r15.build()
            com.google.common.o.a.w r15 = (com.google.common.p4552o.p4553a.C59567w) r15
            r5.mo77222b(r15)
            r5.mo77225e(r1)
            com.google.android.apps.gsa.opaonboarding.an r15 = r5.mo77221a()
            android.content.Intent r15 = r15.mo77240n()
            com.google.android.setupcompat.p3550b.C45250g.m80605a(r0, r15)
            r0 = 15
            com.google.android.setupdesign.p3556e.C45304a.m80751g(r14, r15, r0)
            r15 = 17432576(0x10a0000, float:2.5346597E-38)
            r0 = 17432577(0x10a0001, float:2.53466E-38)
            r14.overridePendingTransition(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.setupwizard.SuwActivity.mo98672e(boolean):void");
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        int i3 = -1;
        if (i == 16) {
            if (i2 == -1) {
                mo98670b(-1);
            } else if (i2 == 1) {
                mo98670b(1);
            } else if (i2 == 0) {
                mo98670b(0);
            } else {
                ((C59052c) ((C59052c) f307872a.mo56225c()).mo56372aa(26403)).mo56387q("Unknown resultCode = %d", i2);
            }
        } else if (i != 15) {
        } else {
            if (i2 == -1) {
                if (true != this.f307874c.u()) {
                    i3 = 1;
                }
                mo98670b(i3);
            } else if (i2 == 1) {
                mo98670b(1);
            } else if (i2 == 0) {
                mo98670b(0);
            } else {
                ((C59052c) ((C59052c) f307872a.mo56225c()).mo56372aa(26402)).mo56387q("Unknown resultCode = %d", i2);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.az);
        super.onCreate(bundle);
        if (bundle != null) {
            ((C59052c) ((C59052c) f307872a.mo56224b()).mo56372aa(26404)).mo56386p("onCreate: recreate. not starting SUW sequence");
            return;
        }
        setContentView(R.layout.suw_activity);
        this.f307873b.mo79680n();
        Account a = this.f307873b.mo79668a();
        String str = null;
        if (a != null && !TextUtils.isEmpty(a.name)) {
            str = a.name;
        }
        C28423g b = str != null ? C28297a.m52922b(str) : C28297a.m52923c();
        int i = true != C45250g.m80607c(getIntent()) ? 158166 : 158167;
        C28306ab abVar = this.f307883l;
        C28313c a2 = this.f307884m.mo33805a(C28427h.m53115a(i));
        a2.mo33859g(C28375ak.m53061c(57255));
        a2.mo33859g(b);
        int i2 = C28485y.f77298f;
        abVar.mo33801b(findViewById(16908290), a2);
        new C90873ag(this.f307880i.mo100603a(), this.f307882k, "syncConfigFlagsAndStartNextStep", new C110454ad(this)).mo85223a(new C110455ae(this));
    }
}

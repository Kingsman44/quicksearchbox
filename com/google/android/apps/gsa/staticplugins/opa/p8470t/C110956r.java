package com.google.android.apps.gsa.staticplugins.opa.p8470t;

import android.accounts.Account;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.aa;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.bg;
import com.google.android.apps.gsa.assistant.shared.bl;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90044cw;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.p7066m.C90064dp;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.C90124fv;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.C90771bo;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90744a;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114540i;
import com.google.android.apps.gsa.staticplugins.opa.util.C113764ag;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.apps.gsa.staticplugins.opa.util.C113868cw;
import com.google.android.libraries.gsa.p1864f.p1867b.C22814a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59752ei;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60607wd;
import com.google.common.p4552o.C60609wf;
import com.google.common.p4552o.C60610wg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.t.r */
/* compiled from: PG */
public final class C110956r implements bm, C90991b {

    /* renamed from: a */
    public static final C59071e f309082a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.t.r");

    /* renamed from: A */
    private boolean f309083A = false;

    /* renamed from: B */
    private final Set f309084B = new HashSet();

    /* renamed from: C */
    private final boolean f309085C;

    /* renamed from: D */
    private boolean f309086D = false;

    /* renamed from: E */
    private final C68214a f309087E;

    /* renamed from: F */
    private final C91123v f309088F;

    /* renamed from: b */
    long f309089b = 0;

    /* renamed from: c */
    long f309090c = 0;

    /* renamed from: d */
    boolean f309091d;

    /* renamed from: e */
    public final Optional f309092e;

    /* renamed from: f */
    private C59753ej f309093f = null;

    /* renamed from: g */
    private final Context f309094g;

    /* renamed from: h */
    private final C86124t f309095h;

    /* renamed from: i */
    private final SharedPreferences f309096i;

    /* renamed from: j */
    private final bg f309097j;

    /* renamed from: k */
    private final C69464a f309098k;

    /* renamed from: l */
    private final C68214a f309099l;

    /* renamed from: m */
    private final C68214a f309100m;

    /* renamed from: n */
    private final C68214a f309101n;

    /* renamed from: o */
    private final C21370a f309102o;

    /* renamed from: p */
    private final C89911f f309103p;

    /* renamed from: q */
    private final C68214a f309104q;

    /* renamed from: r */
    private final C68214a f309105r;

    /* renamed from: s */
    private final C68214a f309106s;

    /* renamed from: t */
    private final C68214a f309107t;

    /* renamed from: u */
    private final String f309108u;

    /* renamed from: v */
    private final C68214a f309109v;

    /* renamed from: w */
    private final boolean f309110w;

    /* renamed from: x */
    private final C68214a f309111x;

    /* renamed from: y */
    private final C114540i f309112y;

    /* renamed from: z */
    private final C22871g f309113z;

    public C110956r(Context context, C86124t tVar, SharedPreferences sharedPreferences, bg bgVar, C69464a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C21370a aVar5, C89911f fVar, C68214a aVar6, C68214a aVar7, C68214a aVar8, C91123v vVar, String str, C68214a aVar9, boolean z, C68214a aVar10, C68214a aVar11, C114540i iVar, C22871g gVar, C68214a aVar12, Optional optional) {
        this.f309094g = context;
        this.f309095h = tVar;
        this.f309096i = sharedPreferences;
        this.f309097j = bgVar;
        this.f309098k = aVar;
        this.f309099l = aVar2;
        this.f309100m = aVar3;
        this.f309101n = aVar4;
        this.f309102o = aVar5;
        this.f309103p = fVar;
        this.f309104q = aVar6;
        this.f309105r = aVar7;
        this.f309106s = aVar8;
        this.f309088F = vVar;
        this.f309108u = str;
        this.f309109v = aVar9;
        this.f309110w = z;
        this.f309107t = aVar10;
        this.f309111x = aVar11;
        this.f309112y = iVar;
        this.f309113z = gVar;
        this.f309087E = aVar12;
        this.f309092e = optional;
        this.f309085C = tVar.mo79746e(C90029ch.f248261av);
    }

    /* renamed from: D */
    private static Intent m184713D(boolean z) {
        Intent intent = new Intent("com.google.android.systemui.OPA_ENABLED");
        intent.addFlags(268435456);
        intent.putExtra("OPA_ENABLED", z);
        return intent;
    }

    /* renamed from: E */
    private final void m184714E(boolean z, Context context) {
        if (mo98976r()) {
            C58976aa aaVar = C58975e.f156826a;
            context.sendBroadcast(m184713D(z));
            boolean z2 = false;
            try {
                this.f309094g.getPackageManager().getPackageInfo("com.google.android.apps.nexuslauncher", 0);
                if (z && this.f309095h.mo79746e(C90110fh.f250691bu)) {
                    z2 = true;
                }
                Intent D = m184713D(z2);
                D.setPackage("com.google.android.apps.nexuslauncher");
                context.sendBroadcast(D);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: F */
    private final void m184715F(boolean z, Context context) {
        if (mo98976r()) {
            C58976aa aaVar = C58975e.f156826a;
            Intent intent = new Intent("com.google.android.systemui.OPA_USER_ENABLED");
            intent.addFlags(268435456);
            intent.putExtra("OPA_USER_ENABLED", z);
            context.sendBroadcast(intent, "com.android.systemui.permission.SELF");
        }
        C59104x b = f309082a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaEligibilityChecker");
        ((C59052c) ((C59052c) b).mo56372aa(24272)).mo56386p("send OpaEligibilityChange broadcast to CommonBroadcastReceiver");
        context.sendBroadcast(new Intent().setClassName(context, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver").setAction("com.google.android.apps.gsa.broadcastreceiver.ACTION_OPA_ELIGIBILITY_CHANGE"));
    }

    /* renamed from: G */
    private final void m184716G() {
        boolean z = true;
        m184717H("opa_wake_up_with_assistant_enabled", mo98979u() && mo98981w() && mo98970l() && this.f309095h.mo79746e(C90014bt.f247815ob) && m184720K((int) this.f309095h.mo79743a(C90014bt.f247824ok)));
        int a = (int) this.f309095h.mo79743a(C90124fv.f250883a);
        if (a != 0 && m184720K(a)) {
            m184717H("opa_clock_xpromo_timer_enabled", mo98979u() && mo98981w() && !mo98970l() && this.f309095h.mo79746e(C90014bt.f247191cW));
            m184717H("opa_clock_xpromo_alarm_enabled", mo98979u() && mo98981w() && !mo98970l() && this.f309095h.mo79746e(C90014bt.f247190cV));
        }
        if (!mo98979u() || !mo98981w() || mo98970l()) {
            z = false;
        }
        m184717H("opa_calendar_xpromo_enabled", z);
    }

    /* renamed from: H */
    private final void m184717H(String str, boolean z) {
        if (this.f309096i.getBoolean(str, false) != z) {
            this.f309096i.edit().putBoolean(str, z).apply();
        }
    }

    /* renamed from: I */
    private final void m184718I(Context context, String str, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f309108u, str), true != z ? 2 : 1, 1);
        } catch (IllegalArgumentException e) {
            C59104x c = f309082a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpaEligibilityChecker");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24281)).mo56389s("Failed to set component enabled setting for %s", str);
            this.f309103p.mo83755a((Throwable) null, 64400343, 29).mo83721a();
        }
    }

    /* renamed from: J */
    private final void m184719J(boolean z) {
        if (this.f309092e.isPresent()) {
            C90873ag agVar = new C90873ag(this.f309113z.mo28202b("AssistantEligibilityWriter#setAssistantEnabled", new C110943e(this, z)), this.f309113z, "AssistantEligibilityWriter#log", new C110947i());
            agVar.mo85224b(RuntimeException.class, new C110948j(z));
            agVar.mo85223a(new C110949k(z));
        }
    }

    /* renamed from: K */
    private final boolean m184720K(int i) {
        try {
            PackageInfo packageInfo = this.f309094g.getPackageManager().getPackageInfo("com.google.android.deskclock", 0);
            if (packageInfo == null || packageInfo.versionCode < i) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            C59104x b = f309082a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OpaEligibilityChecker");
            ((C59052c) ((C59052c) b).mo56372aa(24286)).mo56386p("Clock app not installed.");
        }
        return false;
    }

    /* renamed from: L */
    private final boolean m184721L() {
        return this.f309095h.mo79746e(C90014bt.f247530ir) || ((Boolean) ((Optional) this.f309087E.mo27525b()).map(C110950l.f309076a).orElse(false)).booleanValue();
    }

    /* renamed from: A */
    public final void mo98957A() {
        if (!this.f309088F.mo85390b()) {
            if (this.f309095h.mo79746e(C90037cp.f248610f)) {
                new C90873ag(mo98958B(), this.f309113z, "shouldShowAssistantLauncherFuture", new C110945g(this)).mo85223a(new C110946h(this));
            } else {
                mo98959C(false);
            }
        }
    }

    /* renamed from: B */
    public final C60870cx mo98958B() {
        if (!m184721L() || !mo98979u() || ((C113868cw) this.f309106s.mo27525b()).mo100727a()) {
            return C60856cj.m92900i(false);
        }
        return this.f309112y.mo101391a("opa_launcher_icon_added", false);
    }

    /* renamed from: C */
    public final void mo98959C(Boolean bool) {
        if (bool == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        if (m184721L()) {
            m184718I(this.f309094g, "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivityFromLauncher", bool.booleanValue());
        }
        Context context = this.f309094g;
        boolean booleanValue = bool.booleanValue();
        PackageManager packageManager = context.getPackageManager();
        boolean z = false;
        if (!C90771bo.m148273b(context, UserHandleCompat.m148154a()) && packageManager.hasSystemFeature("android.hardware.microphone")) {
            C90744a.m148218b();
            if (!C90744a.m148218b() && (!booleanValue || this.f309095h.mo79746e(C90014bt.f247424gr))) {
                z = true;
            }
        }
        m184718I(context, "com.google.android.googlequicksearchbox.VoiceSearchActivity", z);
    }

    /* renamed from: a */
    public final int mo98960a() {
        if (!mo98979u()) {
            return 0;
        }
        if (mo98976r()) {
            return 1;
        }
        return !mo98972n() ? this.f309096i.getBoolean("opa_upgrade_bypassed_screens", false) ? 5 : 4 : mo98971m() ? 3 : 2;
    }

    /* renamed from: b */
    public final String mo98961b() {
        String str;
        if (!this.f309088F.mo85390b() || !this.f309095h.mo79746e(C90086ek.f250270V)) {
            str = this.f309095h.mo79746e(C90014bt.f247174cF) ? ((ae) this.f309101n.mo27525b()).d(C58837ba.m90858g(((C86054o) this.f309100m.mo27525b()).mo79659F())).toLanguageTag() : null;
        } else {
            str = ((C85710c) this.f309109v.mo27525b()).mo79343a();
        }
        return str == null ? Locale.getDefault().toLanguageTag() : str;
    }

    /* renamed from: c */
    public final void mo98962c(Context context) {
        mo98963e(context);
    }

    /* renamed from: e */
    public final void mo98963e(Context context) {
        C59753ej ejVar;
        this.f309086D = true;
        C58976aa aaVar = C58975e.f156826a;
        boolean z = false;
        boolean z2 = this.f309096i.getBoolean("key_opa_eligible", false);
        boolean z3 = mo98979u() || mo98984z(e.a) != 2;
        if (z2 != z3 || !this.f309083A) {
            m184714E(z3, context);
            m184715F(z3 && mo98981w(), context);
            this.f309096i.edit().putBoolean("key_opa_eligible", z3).apply();
            m184718I(context, "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivityFromDeeplink", z3);
            if (!this.f309083A) {
                m184719J(mo98981w());
            }
            mo98957A();
        } else if (mo98975q()) {
            m184714E(z3, context);
            m184715F(z3 && mo98981w(), context);
        }
        if (z3 && this.f309096i.getLong("opa_eligibility_change_timestamp", 0) == 0) {
            this.f309096i.edit().putLong("opa_eligibility_change_timestamp", this.f309102o.mo26870b()).apply();
        }
        if (z2 != z3) {
            Set<bl> set = (Set) this.f309098k.mo17428b();
            if (set.isEmpty()) {
                C59104x c = f309082a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OpaEligibilityChecker");
                ((C59052c) ((C59052c) c).mo56372aa(24279)).mo56386p("Zero OpaEligibilityChangeListener provided");
            }
            for (bl jM : set) {
                jM.jM(z3);
            }
            this.f309096i.edit().putLong("opa_eligibility_change_timestamp", this.f309102o.mo26870b()).apply();
        }
        if (z2 != z3 || (this.f309085C && !((String) this.f309107t.mo27525b()).equals(this.f309096i.getString("opa_eligibility_logging_version", (String) null)))) {
            this.f309096i.edit().putString("opa_eligibility_logging_version", (String) this.f309107t.mo27525b()).apply();
            int i = true != z3 ? 935 : 931;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = i;
            if (!z3 && this.f309085C) {
                C60607wd wdVar = (C60607wd) C60610wg.f164428k.createBuilder();
                if (this.f309084B.isEmpty()) {
                    this.f309084B.add(C60609wf.UNKNOWN);
                }
                Set<C60609wf> set2 = this.f309084B;
                wdVar.copyOnWrite();
                C60610wg wgVar = (C60610wg) wdVar.instance;
                C62961ch chVar = wgVar.f164431b;
                if (!chVar.mo58948c()) {
                    wgVar.f164431b = C62942bv.mutableCopy(chVar);
                }
                for (C60609wf wfVar : set2) {
                    wgVar.f164431b.mo58916g(wfVar.f164427m);
                }
                for (C60609wf wfVar2 : this.f309084B) {
                    if (wfVar2 == C60609wf.LOCALE) {
                        String b = mo98961b();
                        wdVar.copyOnWrite();
                        C60610wg wgVar2 = (C60610wg) wdVar.instance;
                        b.getClass();
                        wgVar2.f164430a |= 1;
                        wgVar2.f164432c = b;
                        C58485gu c2 = this.f309095h.mo79745c(C90014bt.f247586ju);
                        wdVar.copyOnWrite();
                        C60610wg wgVar3 = (C60610wg) wdVar.instance;
                        C62971cq cqVar = wgVar3.f164433d;
                        if (!cqVar.mo58948c()) {
                            wgVar3.f164433d = C62942bv.mutableCopy(cqVar);
                        }
                        C62947c.addAll((Iterable) c2, (List) wgVar3.f164433d);
                        C58485gu c3 = this.f309095h.mo79745c(C90044cw.f248727b);
                        wdVar.copyOnWrite();
                        C60610wg wgVar4 = (C60610wg) wdVar.instance;
                        C62971cq cqVar2 = wgVar4.f164434e;
                        if (!cqVar2.mo58948c()) {
                            wgVar4.f164434e = C62942bv.mutableCopy(cqVar2);
                        }
                        C62947c.addAll((Iterable) c3, (List) wgVar4.f164434e);
                        C58485gu c4 = this.f309095h.mo79745c(C90044cw.f248726a);
                        wdVar.copyOnWrite();
                        C60610wg wgVar5 = (C60610wg) wdVar.instance;
                        C62971cq cqVar3 = wgVar5.f164435f;
                        if (!cqVar3.mo58948c()) {
                            wgVar5.f164435f = C62942bv.mutableCopy(cqVar3);
                        }
                        C62947c.addAll((Iterable) c4, (List) wgVar5.f164435f);
                        boolean e = this.f309095h.mo79746e(C90014bt.f247174cF);
                        wdVar.copyOnWrite();
                        C60610wg wgVar6 = (C60610wg) wdVar.instance;
                        wgVar6.f164430a |= 2;
                        wgVar6.f164436g = e;
                        boolean e2 = this.f309095h.mo79746e(C90044cw.f248725D);
                        wdVar.copyOnWrite();
                        C60610wg wgVar7 = (C60610wg) wdVar.instance;
                        wgVar7.f164430a |= 4;
                        wgVar7.f164437h = e2;
                    }
                    if (wfVar2 == C60609wf.METHOD_ERROR && (ejVar = this.f309093f) != null) {
                        wdVar.copyOnWrite();
                        C60610wg wgVar8 = (C60610wg) wdVar.instance;
                        wgVar8.f164439j = ejVar;
                        wgVar8.f164430a |= 16;
                    }
                    if (wfVar2 == C60609wf.DEVICE_CHECKER) {
                        int i2 = Build.VERSION.SDK_INT;
                        wdVar.copyOnWrite();
                        C60610wg wgVar9 = (C60610wg) wdVar.instance;
                        wgVar9.f164430a |= 8;
                        wgVar9.f164438i = i2;
                    }
                }
                C60610wg wgVar10 = (C60610wg) wdVar.build();
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                wgVar10.getClass();
                ufVar2.f164194bv = wgVar10;
                ufVar2.f164252g |= LinearLayoutManager.INVALID_OFFSET;
            }
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
        if (!this.f309096i.getBoolean("key_opa_explore_enabled_oneoff", false)) {
            m184718I(this.f309094g, "com.google.android.apps.gsa.staticplugins.opa.hq.OpaHqActivity", true);
            m184718I(this.f309094g, "com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.AgentDirectoryActivity", true);
            this.f309096i.edit().putBoolean("key_opa_explore_enabled_oneoff", true).apply();
        }
        boolean z4 = this.f309096i.getBoolean("key_opa_explore_eligible", false);
        boolean v = mo98980v();
        if (z4 != v || !this.f309083A) {
            this.f309096i.edit().putBoolean("key_opa_explore_eligible", v).apply();
        }
        m184716G();
        if (mo98979u() && mo98981w() && this.f309095h.mo79746e(C90014bt.f247596kD)) {
            z = true;
        }
        m184717H("shell_app_launcher_icon_shortcuts_enabled", z);
        m184717H("opa_settings_udc_entry_point_enabled", this.f309095h.mo79746e(C90014bt.f247224dC));
        m184718I(this.f309094g, "com.google.android.apps.gsa.staticplugins.opa.widget.impl.OpaWidgetProvider", this.f309095h.mo79746e(C90037cp.f248544cS));
        int a = mo98960a();
        if (this.f309092e.isPresent()) {
            C90873ag agVar = new C90873ag(this.f309113z.mo28202b("AssistantEligibilityWriter#setAssistantEligible", new C110953o(this, a)), this.f309113z, "AssistantEligibilityWriter#log", new C110954p());
            agVar.mo85224b(RuntimeException.class, new C110955q(a));
            agVar.mo85223a(new C110944f(a));
        }
        this.f309083A = true;
    }

    /* renamed from: f */
    public final void mo98964f() {
        this.f309096i.edit().putBoolean("opa_chat_ui_onboarding_completed:".concat(String.valueOf(((C86054o) this.f309100m.mo27525b()).mo79659F())), true).apply();
    }

    /* renamed from: g */
    public final void mo98965g() {
        this.f309096i.edit().putBoolean("opa_chat_ui_seen", true).apply();
        m184716G();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OpaEligibilityChecker");
        fVar.mo85279c("isOpaEligible").mo85276a(C90752i.m148228b(Boolean.valueOf(mo98979u())));
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85279c("isDeviceOpaEligible").mo85276a(C90752i.m148228b(Boolean.valueOf(mo98975q())));
        e.mo85279c("isDevicePrebuiltWithOpa").mo85276a(C90752i.m148228b(Boolean.valueOf(mo98976r())));
        e.mo85279c("isLocaleOpaEligible").mo85276a(C90752i.m148228b(Boolean.valueOf(mo98978t())));
        e.mo85279c("opaLanguage").mo85276a(C90752i.m148229c(mo98961b()));
        fVar.mo85279c("opaEligibility").mo85276a(C90752i.m148230d(Integer.valueOf(mo98960a())));
        fVar.mo85279c("hasTriggeredOpaUpgrade").mo85276a(C90752i.m148228b(Boolean.valueOf(mo98971m())));
        new C90873ag(mo98958B(), this.f309113z, "shouldShowAssistantLauncherFuture", new C110951m(fVar)).mo85223a(C110952n.f309078a);
    }

    /* renamed from: h */
    public final void mo98966h() {
        this.f309096i.edit().putBoolean("opa_upgrade_triggered", true).apply();
    }

    /* renamed from: i */
    public final void mo98967i(boolean z) {
        this.f309096i.edit().putBoolean("opa_enabled", z).apply();
        ((C92486a) this.f309099l.mo27525b()).mo87239m(z, EventForDump.m147676e(12, "setOpaUserEnabled"));
        boolean z2 = false;
        if (mo98979u() && z) {
            z2 = true;
        }
        m184715F(z2, this.f309094g);
        m184719J(z);
    }

    /* renamed from: j */
    public final boolean mo98968j() {
        return this.f309096i.getBoolean("opa_chat_ui_onboarding_completed:".concat(String.valueOf(((C86054o) this.f309100m.mo27525b()).mo79659F())), false);
    }

    /* renamed from: k */
    public final boolean mo98969k() {
        return this.f309096i.getInt("opa_hotword_training_seen_count", 0) > 0;
    }

    /* renamed from: l */
    public final boolean mo98970l() {
        return this.f309096i.getBoolean("opa_chat_ui_seen", false);
    }

    /* renamed from: m */
    public final boolean mo98971m() {
        return this.f309096i.getBoolean("opa_upgrade_triggered", false);
    }

    /* renamed from: n */
    public final boolean mo98972n() {
        if (mo98976r()) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (!mo98979u()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } else {
            boolean l = mo98970l();
            C58976aa aaVar3 = C58975e.f156826a;
            return !l;
        }
    }

    /* renamed from: o */
    public final boolean mo98973o() {
        C58976aa aaVar = C58975e.f156826a;
        C90744a.m148218b();
        return C90744a.m148218b();
    }

    /* renamed from: p */
    public final boolean mo98974p() {
        return m184720K((int) this.f309095h.mo79743a(C90053de.f248961aa));
    }

    /* renamed from: q */
    public final boolean mo98975q() {
        int i;
        C60609wf wfVar;
        Account a;
        if (this.f309095h.mo79746e(C90014bt.f247427gu) && (a = ((C86054o) this.f309100m.mo27525b()).mo79668a()) != null && ((cb) this.f309111x.mo27525b()).f(a) && !this.f309094g.getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME").setPackage("com.google.android.apps.kids.home"), 65536).isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f309084B.add(C60609wf.KID_HOME_ENABLED);
            return false;
        } else if (mo98976r()) {
            return true;
        } else {
            if (m184721L()) {
                int i2 = this.f309096i.getInt("ram_mb", -1);
                int a2 = (int) this.f309095h.mo79743a(C90014bt.f247494iH);
                if (i2 != -1 && i2 >= a2) {
                    return true;
                }
                C58976aa aaVar2 = C58975e.f156826a;
                if (i2 == -1) {
                    this.f309084B.add(C60609wf.RAM_UNSET);
                    long b = this.f309102o.mo26870b();
                    if (b - this.f309089b < Duration.ofDays(1).toMillis()) {
                        return false;
                    }
                    this.f309089b = b;
                    Object systemService = this.f309094g.getSystemService("activity");
                    if (!(systemService instanceof ActivityManager)) {
                        i = -1;
                    } else {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                        long j = memoryInfo.totalMem / 1048576;
                        i = (j <= 0 || j > 2147483647L) ? -2 : (int) j;
                    }
                    if (i == -1) {
                        this.f309084B.add(C60609wf.RAM_UNSET_ACTIVITY_MANAGER_MISS);
                        return false;
                    } else if (i == -2) {
                        this.f309084B.add(C60609wf.RAM_INVALID);
                        return false;
                    } else {
                        if (this.f309095h.mo79746e(C90029ch.f248260au)) {
                            this.f309096i.edit().putInt("ram_mb", i).apply();
                        }
                        Set set = this.f309084B;
                        if (i < a2) {
                            wfVar = C60609wf.RAM_UNSET_RECOVERED_CAPACITY_FAIL;
                        } else {
                            wfVar = C60609wf.RAM_UNSET_RECOVERED;
                        }
                        set.add(wfVar);
                        return false;
                    }
                } else {
                    this.f309084B.add(C60609wf.RAM_CAPACITY);
                    return false;
                }
            } else if (this.f309096i.getBoolean("opa_enabled_from_settings", false) || this.f309096i.getBoolean("opa_chat_ui_seen", false)) {
                return true;
            } else {
                this.f309084B.add(C60609wf.DEVICE_CHECKER);
                return false;
            }
        }
    }

    /* renamed from: r */
    public final boolean mo98976r() {
        C58976aa aaVar = C58975e.f156826a;
        C90744a.m148218b();
        return C90744a.m148218b();
    }

    /* renamed from: s */
    public final boolean mo98977s() {
        boolean z = true;
        if (!mo98979u()) {
            C58976aa aaVar = C58975e.f156826a;
            return mo98984z(e.a) == 3;
        } else if (mo98976r()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return true;
        } else if (!mo98981w()) {
            C58976aa aaVar3 = C58975e.f156826a;
            return false;
        } else if (!mo98972n()) {
            C58976aa aaVar4 = C58975e.f156826a;
            return true;
        } else {
            String string = this.f309096i.getString("hotword_enrollment_account", BuildConfig.FLAVOR);
            boolean z2 = !TextUtils.isEmpty(string) && this.f309097j.c(string);
            if (!mo98971m() || !z2) {
                z = false;
            }
            C58976aa aaVar5 = C58975e.f156826a;
            mo98971m();
            return z;
        }
    }

    /* renamed from: t */
    public final boolean mo98978t() {
        if (this.f309110w && ((Boolean) this.f309105r.mo27525b()).booleanValue()) {
            return true;
        }
        if ((this.f309095h.mo79746e(C90044cw.f248725D) && this.f309095h.mo79746e(C90014bt.f247174cF) && aa.h(mo98961b(), this.f309095h)) || C113764ag.m188330a(mo98961b(), this.f309095h)) {
            return true;
        }
        this.f309084B.add(C60609wf.LOCALE);
        return false;
    }

    /* renamed from: u */
    public final boolean mo98979u() {
        if (!this.f309086D && this.f309095h.mo79746e(C90029ch.f248259at)) {
            if (this.f309102o.mo26870b() - this.f309090c < Duration.ofSeconds((long) ((int) this.f309095h.mo79743a(C90029ch.f248270bd))).toMillis()) {
                return this.f309091d;
            }
        }
        this.f309086D = false;
        this.f309090c = this.f309102o.mo26870b();
        try {
            boolean z = mo98975q() && mo98978t();
            this.f309091d = z;
            return z;
        } catch (NoSuchMethodError e) {
            C59104x c = f309082a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpaEligibilityChecker");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24296)).mo56386p("opa ineligible due to NoSuchMethodError");
            if (this.f309084B.add(C60609wf.METHOD_ERROR)) {
                this.f309093f = C22814a.m42630b((C59752ei) C59753ej.f161449e.createBuilder(), e, 5, 10);
            }
            return false;
        }
    }

    /* renamed from: v */
    public final boolean mo98980v() {
        if (!mo98979u() || ((Boolean) this.f309105r.mo27525b()).booleanValue()) {
            return false;
        }
        if (mo98978t() && this.f309095h.mo79758x(C90064dp.f249652b).equals("EXPLORE")) {
            return true;
        }
        C90129h hVar = C90014bt.f247531is;
        String b = mo98961b();
        C58485gu c = this.f309095h.mo79745c(hVar);
        C58976aa aaVar = C58975e.f156826a;
        if (!C90772bp.m148274A(c, b)) {
            return false;
        }
        if (((C113787bc) this.f309104q.mo27525b()).mo100629i(false)) {
            C113787bc bcVar = (C113787bc) this.f309104q.mo27525b();
            if (!bcVar.f315133b.mo79746e(C90014bt.f247613kU) || !bcVar.mo100632l()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    public final boolean mo98981w() {
        if (this.f309095h.mo79746e(C90014bt.f247153bl)) {
            return false;
        }
        return this.f309096i.getBoolean("opa_enabled", true);
    }

    /* renamed from: x */
    public final boolean mo98982x() {
        return this.f309095h.mo79746e(C90014bt.f247387gG) || this.f309095h.mo79746e(C90110fh.f250670bO);
    }

    /* renamed from: y */
    public final int mo98983y() {
        return mo98984z(e.a);
    }

    /* renamed from: z */
    public final int mo98984z(e eVar) {
        if (mo98979u()) {
            return 1;
        }
        if (mo98975q() && !mo98978t()) {
            if (this.f309095h.mo79746e(C90037cp.f248418Z)) {
                if (!this.f309096i.getString("opa_fre_language_picker_user_selection", BuildConfig.FLAVOR).isEmpty()) {
                    return 2;
                }
                if (this.f309096i.getInt("opa_fre_language_picker_dismiss_count", 0) < ((int) this.f309095h.mo79743a(C90037cp.f248433aN)) || eVar == e.bB) {
                    return 3;
                }
            } else if (this.f309096i.getBoolean("opa_fre_language_picker_shown", false)) {
                return 3;
            }
        }
        return 2;
    }
}

package com.google.android.libraries.assistant.auto.tng.morris.onboarding;

import android.content.Intent;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0813f;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1076c.C14645a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.api.controller.C46013bx;
import com.google.assistant.p3897e.p3929l.p3930a.C52685ar;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.assistant.p3897e.p3929l.p3930a.C52690aw;
import com.google.assistant.p3897e.p3929l.p3930a.C52708bn;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.onboarding.m */
/* compiled from: PG */
public final class C15441m implements C45987ay {

    /* renamed from: a */
    public static final C59071e f46307a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.onboarding.m");

    /* renamed from: b */
    public final AssistantOnboardingActivity f46308b;

    /* renamed from: c */
    public final C86124t f46309c;

    /* renamed from: d */
    public final C14096x f46310d;

    /* renamed from: e */
    public final C14645a f46311e;

    /* renamed from: f */
    public final C60950i f46312f;

    /* renamed from: g */
    public String f46313g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f46314h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C60870cx f46315i = C60856cj.m92898g();

    /* renamed from: j */
    private final C28306ab f46316j;

    /* renamed from: k */
    private final C28310af f46317k;

    /* renamed from: l */
    private final C0816c f46318l;

    /* renamed from: m */
    private Optional f46319m = Optional.empty();

    public C15441m(AssistantOnboardingActivity assistantOnboardingActivity, C45989b bVar, C86124t tVar, C14096x xVar, C14645a aVar, C60950i iVar, C28306ab abVar, C28310af afVar) {
        this.f46308b = assistantOnboardingActivity;
        this.f46309c = tVar;
        this.f46310d = xVar;
        this.f46311e = aVar;
        this.f46312f = iVar;
        this.f46316j = abVar;
        this.f46317k = afVar;
        this.f46318l = assistantOnboardingActivity.mo3336s(new C0813f(), assistantOnboardingActivity.f2708i, new C15440l(assistantOnboardingActivity));
        C58838bb.m90884s(assistantOnboardingActivity.getIntent().hasExtra("account_id"), "Account missing");
        bVar.mo50083f(C46013bx.m82200d().mo50146a());
        bVar.mo50082e(this);
    }

    /* renamed from: n */
    private static C52686as m32143n(C60870cx cxVar) {
        if (!cxVar.isDone()) {
            return C52686as.f138291q;
        }
        try {
            return (C52686as) C60856cj.m92909r(cxVar);
        } catch (RuntimeException | ExecutionException e) {
            C59104x c = f46307a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MorrisOobe.AsstActivity");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(45874)).mo56386p("Exception thrown by Future expected to be done");
            return C52686as.f138291q;
        }
    }

    /* renamed from: o */
    private final void m32144o(C52686as asVar) {
        this.f46319m = Optional.m71637of(asVar);
        this.f46311e.mo21590d(asVar);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo19982a(C45985aw awVar) {
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C59104x c = f46307a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "MorrisOobe.AsstActivity");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(45886)).mo56386p("onAccountError");
        this.f46308b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19985d(com.google.apps.tiktok.account.api.controller.C45986ax r7) {
        /*
            r6 = this;
            com.google.android.libraries.assistant.auto.tng.morris.onboarding.AssistantOnboardingActivity r7 = r6.f46308b
            android.content.Intent r7 = r7.getIntent()
            java.lang.String r0 = "account_name"
            java.lang.String r7 = r7.getStringExtra(r0)
            boolean r0 = com.google.common.base.C58837ba.m90859h(r7)
            if (r0 == 0) goto L_0x0017
            com.google.android.libraries.logging.ve.g r7 = com.google.android.libraries.logging.p2185ve.p2186a.C28297a.m52923c()
            goto L_0x001b
        L_0x0017:
            com.google.android.libraries.logging.ve.g r7 = com.google.android.libraries.logging.p2185ve.p2186a.C28297a.m52922b(r7)
        L_0x001b:
            com.google.android.libraries.logging.ve.ab r0 = r6.f46316j
            com.google.android.libraries.assistant.auto.tng.morris.onboarding.AssistantOnboardingActivity r1 = r6.f46308b
            com.google.android.libraries.logging.ve.af r2 = r6.f46317k
            r3 = 104514(0x19842, float:1.46455E-40)
            com.google.android.libraries.logging.ve.h r3 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r3)
            com.google.android.libraries.logging.ve.c r2 = r2.mo33805a(r3)
            r2.mo33859g(r7)
            int r7 = com.google.android.libraries.logging.p2185ve.C28485y.f77298f
            r7 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r7 = r1.findViewById(r7)
            r0.mo33801b(r7, r2)
            com.google.android.apps.gsa.search.core.i.t r7 = r6.f46309c
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248848bC
            boolean r7 = r7.mo79746e(r0)
            if (r7 != 0) goto L_0x0056
            java.lang.String r7 = r6.f46314h
            com.google.android.libraries.assistant.auto.tng.morris.onboarding.bh r0 = new com.google.android.libraries.assistant.auto.tng.morris.onboarding.bh
            r0.<init>()
            dagger.hilt.android.internal.managers.C68324h.m98669f(r0)
            com.google.apps.tiktok.inject.p3659d.C47243l.m84040b(r0, r7)
            r6.mo22326h(r0)
            return
        L_0x0056:
            java.lang.String r7 = r6.f46313g
            int r0 = r7.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1608006735: goto L_0x0097;
                case -465344926: goto L_0x008d;
                case 479417057: goto L_0x0083;
                case 1660138342: goto L_0x0079;
                case 1995572768: goto L_0x006f;
                case 2080916266: goto L_0x0065;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x00a1
        L_0x0065:
            java.lang.String r0 = "notification_ds_all_perm"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00a1
            r7 = 2
            goto L_0x00a2
        L_0x006f:
            java.lang.String r0 = "notification_ds_na_perm"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00a1
            r7 = 4
            goto L_0x00a2
        L_0x0079:
            java.lang.String r0 = "notification_ds_new_user"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00a1
            r7 = 1
            goto L_0x00a2
        L_0x0083:
            java.lang.String r0 = "notification_ds_bt_perm"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00a1
            r7 = 5
            goto L_0x00a2
        L_0x008d:
            java.lang.String r0 = "notification_ds_ar_perm"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00a1
            r7 = 3
            goto L_0x00a2
        L_0x0097:
            java.lang.String r0 = "opa_setting"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00a1
            r7 = 0
            goto L_0x00a2
        L_0x00a1:
            r7 = -1
        L_0x00a2:
            if (r7 == 0) goto L_0x010b
            if (r7 == r5) goto L_0x00ff
            if (r7 == r4) goto L_0x00cb
            if (r7 == r3) goto L_0x00cb
            if (r7 == r2) goto L_0x00c3
            if (r7 == r1) goto L_0x00af
            goto L_0x00bd
        L_0x00af:
            boolean r7 = r6.mo22330l()
            if (r7 == 0) goto L_0x00bd
            com.google.android.libraries.assistant.auto.tng.morris.onboarding.r r7 = com.google.android.libraries.assistant.auto.tng.morris.onboarding.C15446r.m32162a()
            r6.mo22326h(r7)
            return
        L_0x00bd:
            com.google.android.libraries.assistant.auto.tng.morris.onboarding.AssistantOnboardingActivity r7 = r6.f46308b
            r7.finish()
            return
        L_0x00c3:
            com.google.android.libraries.assistant.auto.tng.morris.onboarding.am r7 = com.google.android.libraries.assistant.auto.tng.morris.onboarding.C15405am.m32069f()
            r6.mo22326h(r7)
            return
        L_0x00cb:
            com.google.android.apps.gsa.search.core.i.t r7 = r6.f46309c
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248766A
            boolean r7 = r7.mo79746e(r0)
            if (r7 == 0) goto L_0x00dd
            com.google.android.libraries.assistant.auto.tng.morris.onboarding.b r7 = com.google.android.libraries.assistant.auto.tng.morris.onboarding.C15419b.m32100a()
            r6.mo22326h(r7)
            return
        L_0x00dd:
            boolean r7 = r6.mo22330l()
            if (r7 == 0) goto L_0x00eb
            com.google.android.libraries.assistant.auto.tng.morris.onboarding.r r7 = com.google.android.libraries.assistant.auto.tng.morris.onboarding.C15446r.m32162a()
            r6.mo22326h(r7)
            return
        L_0x00eb:
            boolean r7 = r6.mo22331m()
            if (r7 == 0) goto L_0x00f9
            com.google.android.libraries.assistant.auto.tng.morris.onboarding.am r7 = com.google.android.libraries.assistant.auto.tng.morris.onboarding.C15405am.m32069f()
            r6.mo22326h(r7)
            return
        L_0x00f9:
            com.google.android.libraries.assistant.auto.tng.morris.onboarding.AssistantOnboardingActivity r7 = r6.f46308b
            r7.finish()
            return
        L_0x00ff:
            com.google.android.libraries.assistant.auto.tng.morris.onboarding.ar r7 = new com.google.android.libraries.assistant.auto.tng.morris.onboarding.ar
            r7.<init>()
            dagger.hilt.android.internal.managers.C68324h.m98669f(r7)
            r6.mo22326h(r7)
            return
        L_0x010b:
            com.google.android.libraries.assistant.auto.tng.morris.onboarding.ah r7 = new com.google.android.libraries.assistant.auto.tng.morris.onboarding.ah
            r7.<init>()
            dagger.hilt.android.internal.managers.C68324h.m98669f(r7)
            r6.mo22326h(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.onboarding.C15441m.mo19985d(com.google.apps.tiktok.account.api.controller.ax):void");
    }

    /* renamed from: e */
    public final void mo22323e() {
        C58976aa aaVar = C58975e.f156826a;
        mo22328j(C52690aw.OPTED_OUT_FROM_PREVIEW);
        this.f46310d.mo21405i(4);
        this.f46308b.setResult(0);
    }

    /* renamed from: f */
    public final void mo22324f() {
        C58976aa aaVar = C58975e.f156826a;
        this.f46310d.mo21405i(4);
        this.f46308b.setResult(-1);
    }

    /* renamed from: g */
    public final void mo22325g() {
        C36619a.m65147c(this.f46308b);
        Intent b = C36619a.m65146b(this.f46308b);
        if (b == null) {
            C59104x d = f46307a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MorrisOobe.AsstActivity");
            ((C59052c) ((C59052c) d).mo56372aa(45893)).mo56386p("Intent is null: notification listener permission activity could not be resolved");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f46318l.mo526b(b);
    }

    /* renamed from: h */
    public final void mo22326h(Fragment fragment) {
        C58976aa aaVar = C58975e.f156826a;
        C0154a aVar = new C0154a(this.f46308b.f727a.f739a.f744e);
        aVar.mo689v(16908290, fragment, (String) null);
        aVar.mo509f();
    }

    /* renamed from: i */
    public final void mo22327i(C52708bn bnVar) {
        C58976aa aaVar = C58975e.f156826a;
        C52685ar arVar = (C52685ar) ((C52686as) this.f46319m.orElse(C52686as.f138291q)).toBuilder();
        arVar.copyOnWrite();
        C52686as asVar = (C52686as) arVar.instance;
        asVar.f138295c = bnVar.f138363g;
        asVar.f138293a |= 4;
        m32144o((C52686as) arVar.build());
    }

    /* renamed from: j */
    public final void mo22328j(C52690aw awVar) {
        C58976aa aaVar = C58975e.f156826a;
        C52685ar arVar = (C52685ar) ((C52686as) this.f46319m.orElse(C52686as.f138291q)).toBuilder();
        arVar.copyOnWrite();
        C52686as asVar = (C52686as) arVar.instance;
        asVar.f138307o = awVar.f138318g;
        asVar.f138293a |= C89885b.NOW_VALUE;
        m32144o((C52686as) arVar.build());
    }

    /* renamed from: k */
    public final void mo22329k() {
        this.f46308b.getWindow().getDecorView().setSystemUiVisibility(4866);
    }

    /* renamed from: l */
    public final boolean mo22330l() {
        if (!this.f46309c.mo79746e(C90051dc.f248772G)) {
            if (this.f46319m.isEmpty()) {
                this.f46319m = Optional.m71637of(m32143n(this.f46315i));
            }
            if (!((C52686as) this.f46319m.get()).f138297e && !((C52686as) this.f46319m.get()).f138298f) {
                return false;
            }
        }
        if (this.f46319m.isEmpty()) {
            this.f46319m = Optional.m71637of(m32143n(this.f46315i));
        }
        C52708bn a = C52708bn.m86698a(((C52686as) this.f46319m.get()).f138295c);
        if (a == null) {
            a = C52708bn.BT_TRIGGER_DEFAULT;
        }
        if (a == C52708bn.BT_TRIGGER_DEFAULT || a == C52708bn.BT_TRIGGER_UNKNOWN_STATE) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo22331m() {
        return !C36619a.m65149e(this.f46308b);
    }
}

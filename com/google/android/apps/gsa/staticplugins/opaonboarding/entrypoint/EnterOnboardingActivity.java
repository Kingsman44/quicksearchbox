package com.google.android.apps.gsa.staticplugins.opaonboarding.entrypoint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;
import dagger.C68214a;

/* compiled from: PG */
public class EnterOnboardingActivity extends Activity {

    /* renamed from: a */
    public static final C59071e f321324a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opaonboarding.entrypoint.EnterOnboardingActivity");

    /* renamed from: b */
    public C68214a f321325b;

    /* renamed from: c */
    public C68214a f321326c;

    /* renamed from: d */
    public C68214a f321327d;

    /* renamed from: e */
    public C68214a f321328e;

    /* renamed from: f */
    public C68214a f321329f;

    /* renamed from: g */
    private boolean f321330g;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.entrypoint.EnterOnboardingActivity$a */
    /* compiled from: PG */
    public interface C115876a {
        /* renamed from: qX */
        void mo102296qX(EnterOnboardingActivity enterOnboardingActivity);
    }

    /* renamed from: a */
    public final void mo102293a(boolean z) {
        C59104x b = f321324a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "EnterOnbActivity");
        ((C59052c) ((C59052c) b).mo56372aa(30128)).mo56358K("handleAuthenticationCheckResult: authenticated = %b, destroyed = %b", z, this.f321330g);
        if (!z || this.f321330g) {
            setResult(1001);
            finish();
            return;
        }
        try {
            C115879c cVar = (C115879c) this.f321329f.mo27525b();
            Intent intent = getIntent();
            intent.getClass();
            int intExtra = intent.getIntExtra("com.google.android.apps.gsa.opa.EXTRA_ENTRY_POINT", 0);
            C59104x b2 = C115879c.f321333a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "EnterOnbDispatcher");
            ((C59052c) ((C59052c) b2).mo56372aa(30130)).mo56387q("entryPoint = %d", intExtra);
            Intent intent2 = null;
            if (intExtra == 1) {
                Bundle bundle = new Bundle();
                bundle.putString("dreamliner_seq_args", intent.getStringExtra("dock_id"));
                C83879am o = C83880an.m133553o();
                ((C83940g) o).f228605a = "dreamliner_seq";
                ((C83940g) o).f228607c = new C83938e(0, (String) null, (String) null);
                ((C83940g) o).f228606b = bundle;
                C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
                C9439b bVar = C9439b.OPA_DREAMLINER_ONBOARDING;
                vVar.copyOnWrite();
                C59567w wVar = (C59567w) vVar.instance;
                wVar.f158062c = bVar.f32835aq;
                wVar.f158060a |= 2;
                o.mo77222b((C59567w) vVar.build());
                intent2 = o.mo77221a().mo77240n();
            } else if (intExtra == 2) {
                String stringExtra = intent.getStringExtra("com.google.android.apps.gsa.opa.EXTRA_ACCOUNT_NAME");
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("udc_consent:is_udc_required", false);
                C83879am o2 = C83880an.m133553o();
                ((C83940g) o2).f228605a = "GoogleHome:udc_consent";
                ((C83940g) o2).f228606b = bundle2;
                ((C83940g) o2).f228607c = new C83938e(1, stringExtra, (String) null);
                C59566v vVar2 = (C59566v) C59567w.f158058g.createBuilder();
                C9439b bVar2 = C9439b.ASSISTANT_GOOGLE_HOME_CONSENT_PERSISTENT_CTA;
                vVar2.copyOnWrite();
                C59567w wVar2 = (C59567w) vVar2.instance;
                wVar2.f158062c = bVar2.f32835aq;
                wVar2.f158060a |= 2;
                o2.mo77222b((C59567w) vVar2.build());
                intent2 = o2.mo77221a().mo77240n();
            } else if (intExtra != 3) {
                C59104x c = C115879c.f321333a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "EnterOnbDispatcher");
                ((C59052c) ((C59052c) c).mo56372aa(30131)).mo56387q("No sequence mapping for entryPoint = %d", intExtra);
            } else {
                C83879am o3 = C83880an.m133553o();
                ((C83940g) o3).f228605a = "OpaZeroStateLHConsentSequence";
                ((C83940g) o3).f228607c = new C83938e(0, (String) null, (String) null);
                C59566v vVar3 = (C59566v) C59567w.f158058g.createBuilder();
                C9439b bVar3 = C9439b.OPA_ZERO_STATE_LOCATION_CONSENT_ONBOARDING;
                vVar3.copyOnWrite();
                C59567w wVar3 = (C59567w) vVar3.instance;
                wVar3.f158062c = bVar3.f32835aq;
                wVar3.f158060a |= 2;
                o3.mo77222b((C59567w) vVar3.build());
                intent2 = o3.mo77221a().mo77240n();
            }
            if (intent2 != null) {
                intent2.addFlags(33554432);
                startActivity(intent2);
            }
        } finally {
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.aI);
        super.onCreate(bundle);
        ((C115876a) C47266f.m84076a(this, C115876a.class)).mo102296qX(this);
        ((C22871g) this.f321326c.mo27525b()).mo28211k(((C22871g) this.f321325b.mo27525b()).mo28201a("EnterOnbActivity.AuthCheck", new C115877a(this)), "EnterOnbActivity.HandleSig", new C115878b(this));
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f321330g = true;
    }
}

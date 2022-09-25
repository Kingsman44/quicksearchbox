package com.google.android.libraries.assistant.auto.jumpboost.p664b.p665a;

import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.ViewGroup;
import com.google.android.apps.auto.sdk.C8971c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.jumpboost.p691h.p692a.C11807b;
import com.google.android.libraries.assistant.auto.jumpboost.p691h.p692a.C11808c;
import com.google.android.libraries.assistant.auto.jumpboost.p691h.p692a.C11812g;
import com.google.android.libraries.assistant.auto.jumpboost.p691h.p693b.C11818a;
import com.google.android.libraries.assistant.auto.jumpboost.p691h.p693b.C11819b;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13118ab;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.MediaRecFragment;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.voiceplate.FusionVoicePlateFragment;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2485a.C32246g;
import com.google.android.libraries.search.p2476a.p2479c.C32209j;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.api.controller.C46012bw;
import com.google.apps.tiktok.account.api.controller.C46013bx;
import com.google.apps.tiktok.account.api.controller.C46054v;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.b.a.a */
/* compiled from: PG */
public final class C11447a extends C11448b implements C45987ay {

    /* renamed from: f */
    private static final C59071e f37233f = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.b.a.a");

    /* renamed from: a */
    public C45989b f37234a;

    /* renamed from: b */
    public C28310af f37235b;

    /* renamed from: c */
    public C28306ab f37236c;

    /* renamed from: d */
    public C21370a f37237d;

    /* renamed from: e */
    public C8971c f37238e = null;

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        AccountId accountId = awVar.f120815a.f120816a;
        C11818a aVar = (C11818a) C11819b.f38001c.createBuilder();
        long d = this.f37237d.mo26872d();
        aVar.copyOnWrite();
        C11819b bVar = (C11819b) aVar.instance;
        bVar.f38003a |= 1;
        bVar.f38004b = d;
        C11807b bVar2 = new C11807b();
        C68324h.m98669f(bVar2);
        C47247a.m84047b(bVar2, accountId);
        C47243l.m84039a(bVar2, (C11819b) aVar.build());
        C0154a aVar2 = new C0154a(mo51122q());
        aVar2.mo689v(R.id.assistant_projected_container, bVar2, "AssistantProjectedRootFragmentTag");
        aVar2.mo518o(bVar2);
        aVar2.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        if (!(th instanceof C46054v) || !(th.getCause() instanceof C32209j)) {
            ((C59052c) ((C59052c) ((C59052c) f37233f.mo56224b()).mo56382g(th)).mo56372aa(43333)).mo56386p("onAccountError");
        } else {
            this.f37234a.mo50081d(C58485gu.m89846n(C32246g.class));
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28306ab abVar = this.f37236c;
        C28313c a = this.f37235b.mo33805a(C28427h.m53115a(125281));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        a.mo33859g(C28375ak.m53061c(128432));
        a.mo33861i(C28439i.f77216b);
        abVar.mo33801b((ViewGroup) this.f122878z.findViewById(16908290), a);
    }

    /* renamed from: i */
    public final void mo19986i(Intent intent) {
        Fragment c = mo51122q().f634a.mo671c("AssistantProjectedRootFragmentTag");
        if (c == null) {
            ((C59052c) ((C59052c) f37233f.mo56226d()).mo56372aa(43338)).mo56386p("The fragment is not ready to consume the intent");
        } else if (!(c instanceof C11807b)) {
            ((C59052c) ((C59052c) C11808c.f37973a.mo56225c()).mo56372aa(43477)).mo56389s("The fragment %s is not supported AssistantProjectedFragment", c.getClass());
        } else {
            C11812g a = ((C11807b) c).mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            if (!intent.getBooleanExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_STOP_VOICE_SESSION", false)) {
                C59104x d = C11812g.f37977a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AsProjectedFP");
                ((C59052c) ((C59052c) d).mo56372aa(43503)).mo56389s("Unsupported new intent: %s", intent);
            } else {
                Fragment fragment = a.f37983g.getChildFragmentManager().f650q;
                if (fragment == null) {
                    C59104x d2 = C11812g.f37977a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "AsProjectedFP");
                    ((C59052c) ((C59052c) d2).mo56372aa(43502)).mo56386p("No navHost is attached to the root fragment");
                } else if (a.mo20167d(fragment) || a.mo20166c(fragment)) {
                    List i = fragment.getChildFragmentManager().f634a.mo677i();
                    if (i.isEmpty()) {
                        C59104x d3 = C11812g.f37977a.mo56226d();
                        d3.mo56378ag(C58975e.f156826a, "AsProjectedFP");
                        ((C59052c) ((C59052c) d3).mo56372aa(43500)).mo56386p("No child fragments under the nav host");
                    } else if (a.mo20167d(fragment)) {
                        a.f37989m.mo19974a(C37179a.f97657eQ);
                        Fragment fragment2 = (Fragment) i.get(0);
                        if (fragment2 instanceof FusionVoicePlateFragment) {
                            ((FusionVoicePlateFragment) fragment2).mo17754z().mo20952a();
                            return;
                        }
                        throw new IllegalArgumentException("The fragment is not supported FusionVoicePlateFragment.");
                    } else {
                        Fragment fragment3 = (Fragment) i.get(0);
                        if (fragment3 instanceof MediaRecFragment) {
                            C13118ab a2 = ((MediaRecFragment) fragment3).mo17754z();
                            a2.f40695t.mo19974a(C37179a.f97476av);
                            a2.mo20913d(true);
                            return;
                        }
                        throw new IllegalArgumentException("The fragment is not supported MediaRecFragment.");
                    }
                } else {
                    C59104x d4 = C11812g.f37977a.mo56226d();
                    d4.mo56378ag(C58975e.f156826a, "AsProjectedFP");
                    ((C59052c) ((C59052c) d4).mo56372aa(43501)).mo56386p("Unsupported nav destination for stopping voice session");
                }
            }
        }
        ((C59052c) ((C59052c) f37233f.mo56226d()).mo56372aa(43336)).mo56386p("Can't resolve the intent inside the fragment");
    }

    /* renamed from: jP */
    public final void mo19987jP(Bundle bundle) {
        C45989b bVar = this.f37234a;
        C46012bw g = C46013bx.m82203g();
        g.mo50147b().mo55395g(C32246g.class);
        bVar.mo50083f(g.mo50146a());
        bVar.mo50082e(this);
        super.mo19987jP((Bundle) null);
    }
}

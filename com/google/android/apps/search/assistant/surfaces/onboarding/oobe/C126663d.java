package com.google.android.apps.search.assistant.surfaces.onboarding.oobe;

import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.p2476a.p2479c.C32209j;
import com.google.android.libraries.search.p2476a.p2479c.p2480a.C32169d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C46054v;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.protos.p4759ad.p4760a.p4761a.p4788b.p4789a.p4790a.p4791a.p4792a.p4793a.C63143a;
import com.google.protos.p4759ad.p4760a.p4761a.p4788b.p4789a.p4790a.p4791a.p4792a.p4793a.C63145c;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.d */
/* compiled from: PG */
final class C126663d implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C126664e f348807a;

    public C126663d(C126664e eVar) {
        this.f348807a = eVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C126664e eVar = this.f348807a;
        AccountId accountId = awVar.f120815a.f120816a;
        C63145c cVar = eVar.f348813f;
        if (cVar != null) {
            C126679q qVar = new C126679q();
            C68324h.m98669f(qVar);
            C47247a.m84047b(qVar, accountId);
            C47243l.m84039a(qVar, cVar);
            C0154a aVar = new C0154a(eVar.f348809b.f727a.f739a.f744e);
            aVar.mo689v(R.id.assistant_oobe_fragment_container, qVar, (String) null);
            aVar.mo509f();
        }
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        if (!(th instanceof C46054v) || !(th.getCause() instanceof C32209j)) {
            ((C59052c) ((C59052c) ((C59052c) C126664e.f348808a.mo56225c()).mo56382g(th)).mo56372aa(37081)).mo56386p("Account error.");
            this.f348807a.f348809b.finish();
            this.f348807a.f348809b.overridePendingTransition(0, 0);
            return;
        }
        this.f348807a.f348810c.mo50081d(C58485gu.m89846n(C32169d.class));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C126664e eVar = this.f348807a;
        int a = C63143a.m96188a(eVar.f348813f.f170516a);
        int i = 152768;
        if (a != 0 && a == 3) {
            i = 152767;
        }
        C28306ab abVar = eVar.f348811d;
        OobeActivity oobeActivity = eVar.f348809b;
        C28313c a2 = eVar.f348812e.mo33805a(C28427h.m53115a(i));
        a2.mo33861i(C28439i.f77216b);
        a2.mo33859g(C28375ak.m53061c(57255));
        a2.mo33859g(C45954d.m82060a(axVar.f120816a));
        int i2 = C28485y.f77298f;
        abVar.mo33801b(oobeActivity.mo1322k().mo1177e(16908290), a2);
    }
}

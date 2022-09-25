package com.google.android.apps.search.podcasts;

import android.content.Intent;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140150n;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140980a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.performance.primes.metrics.p2414h.C31499r;
import com.google.android.libraries.search.p2476a.p2479c.C32209j;
import com.google.android.libraries.search.p2476a.p2479c.p2480a.C32169d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C46054v;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60430py;
import com.google.common.p4552o.C60431pz;
import com.google.common.p4552o.C60441qd;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4225bm.p4229c.C56113b;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.d */
/* compiled from: PG */
final class C140193d implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C140198e f380887a;

    public C140193d(C140198e eVar) {
        this.f380887a = eVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        AccountId accountId = awVar.f120815a.f120816a;
        C140639m mVar = new C140639m();
        C68324h.m98669f(mVar);
        C47247a.m84047b(mVar, accountId);
        C0154a aVar = new C0154a(this.f380887a.f380899b.f727a.f739a.f744e);
        aVar.mo689v(R.id.podcasts_main_fragment_container, mVar, "podcasts_main_fragment");
        aVar.mo518o(mVar);
        aVar.mo509f();
        C141182w a = mVar.mo17754z();
        C46439e eVar = a.f383296j;
        C60870cx c = a.f383298l.mo115678c();
        eVar.mo50428h(C46438d.m82809a(c).f121541a, (Object) null, a.f383300n);
        C141182w a2 = mVar.mo17754z();
        C46439e eVar2 = a2.f383296j;
        C46438d dVar = new C46438d(C47633f.m84733g(a2.f383297k.mo115472c()).mo51515h(C140150n.f380812a, C60826bg.f164896a));
        eVar2.mo50428h(dVar.f121541a, (Object) null, a2.f383299m);
        C141182w a3 = mVar.mo17754z();
        C0167am activity = a3.f383288b.getActivity();
        if (activity != null) {
            a3.f383304r.mo115673a(activity);
        }
        this.f380887a.f380901d.mo115698b(awVar.f120815a.f120816a);
        C31499r.f84816a.mo37197a(this.f380887a.f380899b);
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        if (!(th instanceof C46054v) || !(th.getCause() instanceof C32209j)) {
            ((C59052c) ((C59052c) ((C59052c) C140198e.f380898a.mo56225c()).mo56382g(th)).mo56372aa(41495)).mo56386p("onAccountError()");
            this.f380887a.f380899b.finish();
            return;
        }
        this.f380887a.f380899b.setIntent(new Intent());
        this.f380887a.f380902e.mo50081d(C58485gu.m89846n(C32169d.class));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C140198e eVar = this.f380887a;
        C28306ab abVar = eVar.f380900c;
        PodcastsActivity podcastsActivity = eVar.f380899b;
        C28313c a = abVar.f76990a.mo33805a(C28427h.m53115a(40819));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        a.mo33859g(C28375ak.m53061c(93990));
        C56113b a2 = this.f380887a.mo115495a();
        C60441qd qdVar = C60441qd.f163569a;
        C69664n.m101061g(a2, "entryPointType");
        C69664n.m101061g(qdVar, "utmParams");
        C60430py pyVar = (C60430py) C60431pz.f163541h.createBuilder();
        pyVar.copyOnWrite();
        C60431pz pzVar = (C60431pz) pyVar.instance;
        pzVar.f163548f = a2.f149497u;
        pzVar.f163543a |= 64;
        pyVar.copyOnWrite();
        C60431pz pzVar2 = (C60431pz) pyVar.instance;
        qdVar.getClass();
        pzVar2.f163549g = qdVar;
        pzVar2.f163543a |= 128;
        a.mo33858f(new C28353e(C140980a.f382762a, pyVar.build()));
        int i = C28485y.f77298f;
        abVar.mo33801b(podcastsActivity.mo1322k().mo1177e(16908290), a);
    }
}

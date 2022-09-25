package com.google.android.apps.search.googleapp.discover.feedback;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.p8867w.p8879i.C118805f;
import com.google.android.apps.gsa.p8867w.p8879i.C118806g;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134279k;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57097l;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57099n;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class FeedbackLauncher implements C2376g {

    /* renamed from: a */
    public static final C59071e f365749a = C59071e.m91331h();

    /* renamed from: b */
    public final Fragment f365750b;

    /* renamed from: c */
    public final AccountId f365751c;

    /* renamed from: d */
    public final C134301c f365752d;

    /* renamed from: e */
    public final boolean f365753e;

    /* renamed from: f */
    private final C47477n f365754f;

    /* renamed from: g */
    private final C68214a f365755g;

    /* renamed from: h */
    private final C46128f f365756h;

    /* renamed from: i */
    private final boolean f365757i;

    /* renamed from: j */
    private final boolean f365758j;

    /* renamed from: k */
    private final long f365759k;

    /* renamed from: l */
    private final C134766q f365760l;

    /* renamed from: m */
    private final C46439e f365761m;

    /* renamed from: n */
    private final C134303e f365762n = new C134303e(this);

    /* renamed from: o */
    private final C118806g f365763o;

    public FeedbackLauncher(C47477n nVar, C118806g gVar, C68214a aVar, Fragment fragment, AccountId accountId, C46128f fVar, C134301c cVar, boolean z, boolean z2, boolean z3, long j, C134766q qVar, C46439e eVar) {
        C69664n.m101061g(aVar, "discoverDebugDataProviderLazy");
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(fVar, "gcoreAccountName");
        C69664n.m101061g(qVar, "tngDiscoverSurface");
        C69664n.m101061g(eVar, "futuresMixin");
        this.f365754f = nVar;
        this.f365763o = gVar;
        this.f365755g = aVar;
        this.f365750b = fragment;
        this.f365751c = accountId;
        this.f365756h = fVar;
        this.f365752d = cVar;
        this.f365757i = z;
        this.f365753e = z2;
        this.f365758j = z3;
        this.f365759k = j;
        this.f365760l = qVar;
        this.f365761m = eVar;
    }

    /* renamed from: g */
    public final void mo111667g(C57097l lVar) {
        if (lVar == null) {
            lVar = C57097l.f152427b;
            C69664n.m101060f(lVar, "getDefaultInstance()");
        }
        if (this.f365757i) {
            this.f365761m.mo50445g(new C46438d(this.f365756h.mo50215b(this.f365751c)), C46436b.m82808a(lVar), this.f365762n);
        } else {
            mo111668h(lVar, false);
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        this.f365761m.mo50429i(this.f365762n);
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: h */
    public final void mo111668h(C57097l lVar, boolean z) {
        C47474k g = C47475l.m84477g();
        g.mo51310d(true);
        C47465c cVar = (C47465c) g;
        cVar.f123249a = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT";
        cVar.f123252d = true != C133933a.m217248a(this.f365750b.getContext()) ? 2 : 3;
        C46663a aVar = new C46663a();
        aVar.mo50686d(C46667e.KEY_VALUE);
        aVar.mo50684b(false);
        aVar.f121916a = C63088z.m96143E(this.f365760l.f366956e.name());
        g.mo51333f("Feed Surface Type", aVar.mo50683a());
        C118806g gVar = this.f365763o;
        g.mo51308b().mo55429h("agsa_classic_state_dump", gVar.f331375b.mo19399b(new C118805f(gVar)));
        g.mo51308b().mo55429h("google_app_discover", ((C134279k) this.f365755g.mo27525b()).mo111673b(z));
        if (z && this.f365758j) {
            C46663a aVar2 = new C46663a();
            aVar2.mo50686d(C46667e.KEY_VALUE);
            aVar2.mo50684b(false);
            aVar2.f121916a = C63088z.m96143E("true");
            g.mo51333f("is_googler", aVar2.mo50683a());
        }
        if (this.f365759k > 0) {
            C46663a aVar3 = new C46663a();
            aVar3.mo50686d(C46667e.KEY_VALUE);
            aVar3.mo50684b(false);
            aVar3.f121916a = C63088z.m96143E(String.valueOf(this.f365759k));
            g.mo51333f("channel_study_experiment_id", aVar3.mo50683a());
        }
        for (C57099n nVar : lVar.f152429a) {
            if (nVar != null) {
                int i = nVar.f152432a;
                if (!((i & 1) == 0 || (i & 2) == 0)) {
                    String str = nVar.f152433b;
                    C46663a aVar4 = new C46663a();
                    aVar4.mo50686d(C46667e.KEY_VALUE);
                    aVar4.mo50684b(true);
                    aVar4.f121916a = C63088z.m96143E(nVar.f152434c);
                    g.mo51333f(str, aVar4.mo50683a());
                }
            }
        }
        this.f365754f.mo51336a(g.mo51332e());
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}

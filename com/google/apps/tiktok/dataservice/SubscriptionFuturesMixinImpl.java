package com.google.apps.tiktok.dataservice;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.C46427an;
import com.google.apps.tiktok.tracing.contrib.androidx.TracedDefaultLifecycleObserver;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import java.util.concurrent.Executor;

/* compiled from: PG */
public final class SubscriptionFuturesMixinImpl extends C46801dp {

    /* renamed from: a */
    public SubscriptionMixinViewModel f121944a;

    /* renamed from: b */
    public final C46427an f121945b;

    public SubscriptionFuturesMixinImpl(final Fragment fragment, Executor executor) {
        C46427an anVar = new C46427an(executor, true);
        this.f121945b = anVar;
        anVar.mo50407c();
        fragment.getLifecycle().mo5790b(new TracedDefaultLifecycleObserver(new C2376g() {
            /* renamed from: gV */
            public final void mo3520gV(C2391v vVar) {
                SubscriptionFuturesMixinImpl.this.f121944a = (SubscriptionMixinViewModel) new C2368bp(fragment).mo5770a(SubscriptionMixinViewModel.class);
            }

            /* renamed from: gW */
            public final void mo3521gW(C2391v vVar) {
                SubscriptionFuturesMixinImpl.this.f121945b.mo50407c();
                SubscriptionFuturesMixinImpl.this.f121945b.mo50404a();
                SubscriptionMixinViewModel subscriptionMixinViewModel = SubscriptionFuturesMixinImpl.this.f121944a;
                for (C46815ec ecVar : subscriptionMixinViewModel.f121948a.values()) {
                    C46794dj djVar = ecVar.f122198i;
                    C46792di diVar = C46794dj.f122160a;
                    C58833ax d = djVar.mo50728d();
                    ecVar.f122198i = new C46684ab(1 + djVar.mo50725a(), diVar, false, d, C58836b.f156633a);
                }
                subscriptionMixinViewModel.f121949b.mo50440c();
            }

            /* renamed from: gX */
            public final /* synthetic */ void mo3522gX(C2391v vVar) {
            }

            /* renamed from: gY */
            public final /* synthetic */ void mo3523gY(C2391v vVar) {
            }

            /* renamed from: gZ */
            public final void mo3524gZ(C2391v vVar) {
                SubscriptionFuturesMixinImpl.this.f121945b.mo50406b();
                SubscriptionFuturesMixinImpl.this.f121944a.f121949b.mo50444g();
                SubscriptionFuturesMixinImpl.this.f121944a.f121950c.mo50406b();
            }

            /* renamed from: ha */
            public final void mo3525ha(C2391v vVar) {
                SubscriptionFuturesMixinImpl.this.f121944a.f121950c.mo50407c();
                SubscriptionFuturesMixinImpl.this.f121945b.mo50407c();
            }
        }));
    }

    /* renamed from: a */
    public final void mo50707a(C46689ag agVar, C46792di diVar) {
        C19559g.m37304c();
        C58838bb.m90884s(!(diVar instanceof C46685ac), "Callbacks that implement BackgroundCallbacks must be registered with subscribeWithBackground().");
        this.f121945b.execute(new C46798dm(this, agVar, diVar));
    }

    /* renamed from: b */
    public final void mo50708b(C46689ag agVar, C46788de deVar, C46792di diVar) {
        C19559g.m37304c();
        C58838bb.m90884s(!(diVar instanceof C46685ac), "Callbacks that implement BackgroundCallbacks must be registered with subscribeWithBackground().");
        this.f121945b.execute(new C46799dn(this, agVar, deVar, diVar));
    }

    /* renamed from: c */
    public final void mo50709c(C46689ag agVar, C46792di diVar) {
        this.f121945b.execute(new C46797dl(this, agVar, diVar));
    }
}

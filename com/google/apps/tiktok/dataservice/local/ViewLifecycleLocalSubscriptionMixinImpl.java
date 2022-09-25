package com.google.apps.tiktok.dataservice.local;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46785db;
import com.google.apps.tiktok.lifecycle.C47439h;
import com.google.apps.tiktok.tracing.contrib.androidx.TracedDefaultLifecycleObserver;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58852bp;
import java.util.concurrent.Executor;

/* compiled from: PG */
public final class ViewLifecycleLocalSubscriptionMixinImpl extends C46855i {

    /* renamed from: a */
    public C46855i f122234a = null;

    /* renamed from: b */
    private final Fragment f122235b;

    /* renamed from: c */
    private final C46785db f122236c;

    /* renamed from: d */
    private final Executor f122237d;

    public ViewLifecycleLocalSubscriptionMixinImpl(Fragment fragment, C46785db dbVar, Executor executor) {
        this.f122235b = fragment;
        this.f122236c = dbVar;
        this.f122237d = executor;
    }

    /* renamed from: a */
    private final C46855i m83424a() {
        C19559g.m37304c();
        try {
            C58838bb.m90884s(this.f122235b.getViewLifecycleOwner().getLifecycle().mo5789a() == C2383n.INITIALIZED, "A @ViewLifecycle LocalSubscriptionMixin may only register callbacks in `onCreateView()`. Please refer to the `@ViewLifecycle` annotation's Javadoc for a full description of how to use this LocalSubscriptionMixin correctly.");
            if (this.f122234a == null) {
                try {
                    C47439h a = C47439h.m84309a(this.f122235b.getViewLifecycleOwner(), this.f122235b);
                    this.f122234a = new C46867u(new LocalSubscriptionMixinResultPropagator(new LocalSubscriptionMixinImpl(this.f122235b.getViewLifecycleOwner().getLifecycle(), a, this.f122237d), a, this.f122236c, this.f122237d, this.f122235b.getViewLifecycleOwner().getLifecycle()));
                    this.f122235b.getViewLifecycleOwner().getLifecycle().mo5790b(new TracedDefaultLifecycleObserver(new C2376g() {
                        /* renamed from: gV */
                        public final /* synthetic */ void mo3520gV(C2391v vVar) {
                        }

                        /* renamed from: gW */
                        public final void mo3521gW(C2391v vVar) {
                            ViewLifecycleLocalSubscriptionMixinImpl.this.f122234a = null;
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

                        /* renamed from: ha */
                        public final /* synthetic */ void mo3525ha(C2391v vVar) {
                        }
                    }));
                } catch (IllegalStateException e) {
                    throw new IllegalStateException("Both an unqualified and a `@ViewLifecycle LocalSubscriptionMixin` have been injectedin this Fragment scope. Only one of the two LocalSubscriptionMixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle`LocalSubscriptionMixin exclusively.", e);
                }
            }
            return this.f122234a;
        } catch (IllegalStateException e2) {
            throw new IllegalStateException("A @ViewLifecycle LocalSubscriptionMixin may only register callbacks in `onCreateView()`. Please refer to the `@ViewLifecycle` annotation's Javadoc for a full description of how to use this LocalSubscriptionMixin correctly.", e2);
        }
    }

    /* renamed from: g */
    public final C46854h mo50827g(int i, C46852f fVar) {
        return ((C46865s) m83424a()).mo50826j(i, fVar, C58836b.f156633a);
    }

    /* renamed from: h */
    public final C46854h mo50828h(int i, C46851e eVar, C46852f fVar) {
        return ((C46865s) m83424a()).mo50826j(i, fVar, C58833ax.m90834k(eVar));
    }

    /* renamed from: i */
    public final C46854h mo50829i(int i, C46851e eVar, C58852bp bpVar, C58852bp bpVar2) {
        return m83424a().mo50829i(i, eVar, bpVar, bpVar2);
    }
}

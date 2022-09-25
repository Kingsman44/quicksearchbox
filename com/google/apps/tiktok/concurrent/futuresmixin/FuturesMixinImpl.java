package com.google.apps.tiktok.concurrent.futuresmixin;

import android.os.StrictMode;
import android.support.p031v4.app.FragmentManager;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2371bs;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47569bt;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashSet;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
final class FuturesMixinImpl extends C46439e implements C2376g {

    /* renamed from: a */
    public static final C59071e f121512a = C59071e.m91332i("com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinImpl");

    /* renamed from: b */
    private FuturesMixinViewModel f121513b;

    /* renamed from: c */
    private final C69464a f121514c;

    /* renamed from: d */
    private final C2371bs f121515d;

    /* renamed from: e */
    private final C2384o f121516e;

    /* renamed from: f */
    private final C46442h f121517f = new C46442h();

    /* renamed from: g */
    private boolean f121518g = false;

    /* renamed from: h */
    private boolean f121519h = false;

    /* renamed from: i */
    private final Set f121520i = new HashSet();

    public FuturesMixinImpl(C69464a aVar, C2371bs bsVar, C2384o oVar) {
        this.f121514c = aVar;
        this.f121515d = bsVar;
        oVar.mo5790b(this);
        this.f121516e = oVar;
    }

    /* renamed from: k */
    private final void m82786k() {
        for (C46440f d : this.f121520i) {
            this.f121513b.f121522b.mo50441d(d);
        }
        this.f121520i.clear();
        this.f121519h = true;
        C19559g.m37302a().removeCallbacks(this.f121517f);
        this.f121517f.f121542a.clear();
        this.f121517f.f121543b = null;
        this.f121518g = true;
        FuturesMixinViewModel futuresMixinViewModel = this.f121513b;
        futuresMixinViewModel.f121525e = true;
        futuresMixinViewModel.f121522b.mo50444g();
        for (ParcelableFuture parcelableFuture : futuresMixinViewModel.f121523c) {
            if (!parcelableFuture.f121529b) {
                C46440f fVar = (C46440f) futuresMixinViewModel.f121522b.mo50439b(parcelableFuture.f121528a);
                C47558bi t = C47831fm.m85025t("onPending FuturesMixin", C47562bm.f123426a, true);
                try {
                    fVar.mo18068i(parcelableFuture.f121531d);
                    t.close();
                } catch (Throwable th) {
                    C46447m.m82822a(th, th);
                }
            } else {
                try {
                    futuresMixinViewModel.f121522b.mo50439b(parcelableFuture.f121528a);
                } catch (NullPointerException e) {
                    throw new IllegalStateException("future=".concat(String.valueOf(String.valueOf(parcelableFuture))), e);
                }
            }
            parcelableFuture.mo50434c(futuresMixinViewModel);
        }
        return;
        throw th;
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        this.f121513b = (FuturesMixinViewModel) new C2368bp(this.f121515d).mo5770a(FuturesMixinViewModel.class);
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        FuturesMixinViewModel futuresMixinViewModel = this.f121513b;
        C58838bb.m90884s(!futuresMixinViewModel.f121525e, "FuturesMixinViewModel.stopCallbacks() must be called before it becomes detached from its parent.");
        futuresMixinViewModel.f121522b.mo50440c();
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        if (!this.f121518g) {
            m82786k();
        }
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        C58838bb.m90884s(!this.f121518g, "FuturesMixin.onStart() was manually invoked, and is now re-running.");
        m82786k();
    }

    /* renamed from: h */
    public final void mo50428h(C60870cx cxVar, Object obj, C46440f fVar) {
        C19559g.m37304c();
        C58838bb.m90884s(!((FragmentManager) this.f121514c.mo17428b()).mo461ab(), "Futures should not be triggered by lifecycle changes, and cannot be listened to while a Fragment is stopped. Consider using SubscriptionMixin instead. See go/tiktok/concurrent/futuresmixin.md. listen() was called while the Fragment's state is saved - work started at this point in the lifecycle can't be persisted, and can lose state.");
        if (C47569bt.m84666b()) {
            StrictMode.noteSlowCall("FuturesMixin called from Lifecycle");
        }
        this.f121513b.mo50431a(cxVar, obj, fVar);
        if (!this.f121518g) {
            Throwable th = new Throwable();
            th.fillInStackTrace();
            ((C59052c) ((C59052c) ((C59052c) f121512a.mo56226d()).mo56382g(th)).mo56372aa(54731)).mo56386p("listen() called outside listening window");
            this.f121517f.f121542a.add(fVar);
            this.f121517f.f121543b = C47810es.m84977q(new C46441g());
            C46442h hVar = this.f121517f;
            C19559g.m37302a().removeCallbacks(hVar);
            C19559g.m37302a().post(hVar);
        }
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        if (this.f121518g) {
            FuturesMixinViewModel futuresMixinViewModel = this.f121513b;
            futuresMixinViewModel.f121525e = false;
            for (ParcelableFuture c : futuresMixinViewModel.f121523c) {
                c.mo50434c((C46453s) null);
            }
            this.f121518g = false;
        }
    }

    /* renamed from: i */
    public final void mo50429i(C46440f fVar) {
        C19559g.m37304c();
        C58838bb.m90884s(!this.f121519h, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        C58838bb.m90884s(!this.f121516e.mo5789a().mo5788a(C2383n.STARTED), "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        C58838bb.m90884s(!this.f121518g, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        this.f121520i.add(fVar);
    }

    /* renamed from: j */
    public final void mo50430j(C46438d dVar, C46436b bVar, C46440f fVar) {
        C19559g.m37304c();
        C58838bb.m90884s(!((FragmentManager) this.f121514c.mo17428b()).mo461ab(), "Listen called outside safe window. State loss is possible.");
        this.f121513b.mo50431a(dVar.f121541a, bVar.f121539a, fVar);
    }
}

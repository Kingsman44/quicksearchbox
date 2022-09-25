package com.google.android.apps.search.googleapp.launcher.minusone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133189b;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133252d;
import com.google.android.apps.search.googleapp.p10257g.C135428c;
import com.google.android.apps.search.googleapp.p10257g.C135430e;
import com.google.android.apps.search.googleapp.p10257g.C135431f;
import com.google.android.apps.search.googleapp.p10257g.C135434i;
import com.google.android.apps.search.googleapp.p10257g.C135435j;
import com.google.android.apps.search.googleapp.p10257g.C135451x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.protobuf.C62942bv;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.bh */
/* compiled from: PG */
public final class C136601bh extends C136643cu implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136602bi f371858a;

    /* renamed from: c */
    private Context f371859c;

    /* renamed from: d */
    private final C2393x f371860d = new C2393x(this);

    /* renamed from: e */
    private boolean f371861e;

    @Deprecated
    public C136601bh() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C136602bi mo17754z() {
        C136602bi biVar = this.f371858a;
        if (biVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f371861e) {
            return biVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo113265b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f371859c == null) {
            this.f371859c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f371859c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f371860d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136600bg.m222010a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C136602bi a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.googleapp_minus_one_header_fragment, viewGroup, false);
            C69664n.m101059e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) inflate;
            a.f371863b.mo113061a(115193, viewGroup2);
            if (a.f371864c.getChildFragmentManager().f634a.mo670b(R.id.googleapp_doodle_fragment) == null) {
                C0154a aVar = new C0154a(a.f371864c.getChildFragmentManager());
                Set set = C135435j.f368973a;
                AccountId accountId = a.f371862a;
                C135428c cVar = (C135428c) C135431f.f368964f.createBuilder();
                C135430e eVar = C135430e.MINUS_ONE;
                cVar.copyOnWrite();
                C135431f fVar = (C135431f) cVar.instance;
                fVar.f368967b = eVar.f368963g;
                fVar.f368966a |= 1;
                cVar.copyOnWrite();
                C135431f fVar2 = (C135431f) cVar.instance;
                fVar2.f368966a |= 2;
                fVar2.f368968c = true;
                boolean z = a.f371866e;
                cVar.copyOnWrite();
                C135431f fVar3 = (C135431f) cVar.instance;
                fVar3.f368966a |= 8;
                fVar3.f368970e = z;
                C62942bv build = cVar.build();
                C69664n.m101060f(build, "newBuilder()\n           …d)\n              .build()");
                aVar.mo511h(R.id.googleapp_doodle_fragment, C135434i.m219595a(accountId, (C135431f) build), (String) null, 1);
                aVar.mo509f();
            }
            if (a.f371864c.getChildFragmentManager().f634a.mo670b(R.id.googleapp_account_disc_fragment) == null) {
                C0154a aVar2 = new C0154a(a.f371864c.getChildFragmentManager());
                aVar2.mo511h(R.id.googleapp_account_disc_fragment, C133252d.m216261a(a.f371862a, C133189b.f363045d), "GoogleApp_AccountDiscFragment", 1);
                aVar2.mo509f();
            }
            if (viewGroup2 != null) {
                C47831fm.m85019n();
                return viewGroup2;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C136600bg.m222010a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f371861e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136600bg.m222010a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C136600bg.m222010a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C135451x.class, new C136603bj(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136600bg.m222010a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f371861e) {
                super.onAttach(context);
                if (this.f371858a == null) {
                    this.f371858a = ((C136604bk) mo113297d().mo17653jN()).mo113266cL();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f371860d));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C136600bg.m222010a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}

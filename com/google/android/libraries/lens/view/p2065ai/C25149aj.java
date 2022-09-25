package com.google.android.libraries.lens.view.p2065ai;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2067ak.C25197ac;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2074ap.C25466f;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.ai.aj */
/* compiled from: PG */
public final class C25149aj extends C25163aw implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C25155ap f68488a;

    /* renamed from: b */
    private Context f68489b;

    /* renamed from: c */
    private final C2393x f68490c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f68491d = new C47515ab(this);

    /* renamed from: e */
    private boolean f68492e;

    @Deprecated
    public C25149aj() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C25155ap mo17754z() {
        C25155ap apVar = this.f68488a;
        if (apVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f68492e) {
            return apVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo30289b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f68489b == null) {
            this.f68489b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f68489b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f68491d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f68490c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f68491d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f68491d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f68491d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f68491d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo17754z().mo30295d(false);
    }

    public final void onCreate(Bundle bundle) {
        C25183u uVar;
        C25141ab abVar;
        this.f68491d.mo51381i();
        try {
            super.onCreate(bundle);
            C25155ap a = mo17754z();
            C25165c cVar = (C25165c) a.f68503b.getChildFragmentManager().f634a.mo670b(R.id.back_or_close_button_container);
            if (cVar == null) {
                AccountId accountId = a.f68504c;
                C25165c cVar2 = new C25165c();
                C68324h.m98669f(cVar2);
                C47247a.m84047b(cVar2, accountId);
                C0154a aVar = new C0154a(a.f68503b.getChildFragmentManager());
                aVar.mo511h(R.id.back_or_close_button_container, cVar2, (String) null, 1);
                aVar.mo509f();
                cVar = cVar2;
            }
            a.f68514m = cVar.mo17754z();
            if (!a.f68513l) {
                uVar = null;
            } else {
                C25175m mVar = (C25175m) a.f68503b.getChildFragmentManager().f634a.mo670b(R.id.donate_data_info_button_container);
                if (mVar == null) {
                    AccountId accountId2 = a.f68504c;
                    C25175m mVar2 = new C25175m();
                    C68324h.m98669f(mVar2);
                    C47247a.m84047b(mVar2, accountId2);
                    C0154a aVar2 = new C0154a(a.f68503b.getChildFragmentManager());
                    aVar2.mo511h(R.id.donate_data_info_button_container, mVar2, (String) null, 1);
                    aVar2.mo509f();
                    mVar = mVar2;
                }
                uVar = mVar.mo17754z();
            }
            a.f68515n = uVar;
            if (!a.f68503b.getContext().getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
                abVar = null;
            } else {
                C25187y yVar = (C25187y) a.f68503b.getChildFragmentManager().f634a.mo670b(R.id.flash_button_container);
                if (yVar == null) {
                    AccountId accountId3 = a.f68504c;
                    C25187y yVar2 = new C25187y();
                    C68324h.m98669f(yVar2);
                    C47247a.m84047b(yVar2, accountId3);
                    C0154a aVar3 = new C0154a(a.f68503b.getChildFragmentManager());
                    aVar3.mo511h(R.id.flash_button_container, yVar2, (String) null, 1);
                    aVar3.mo509f();
                    yVar = yVar2;
                }
                abVar = yVar.mo17754z();
            }
            a.f68516o = abVar;
            C25143ad adVar = (C25143ad) a.f68503b.getChildFragmentManager().f634a.mo670b(R.id.overflow_menu_button_container);
            if (adVar == null) {
                adVar = C25147ah.m46469a(a.f68504c);
                C0154a aVar4 = new C0154a(a.f68503b.getChildFragmentManager());
                aVar4.mo511h(R.id.overflow_menu_button_container, adVar, (String) null, 1);
                aVar4.mo509f();
            }
            a.f68517p = adVar.mo17754z();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f68491d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f68491d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C25155ap a = mo17754z();
            a.f68519r = layoutInflater.inflate(R.layout.overlay_buttons, viewGroup, false);
            a.f68518q = (ViewStub) a.f68519r.findViewById(R.id.overlay_header_logo_stub);
            a.f68506e.f69401a.mo5704e(a.f68503b.getViewLifecycleOwner(), new C25151al(a));
            a.f68510i.mo5704e(a.f68503b.getViewLifecycleOwner(), new C25152am(a));
            a.f68511j.mo50707a(a.f68512k.mo30780a(), new C25154ao(a));
            View view = a.f68519r;
            if (view != null) {
                C47831fm.m85019n();
                return view;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f68491d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f68491d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f68491d.mo51376d();
        try {
            super.onDetach();
            this.f68492e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f68491d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f68491d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f68491d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f68491d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f68491d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f68491d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f68491d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f68491d.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C25155ap a = mo17754z();
            C47393f.m84233d(this, C25173k.class, new C25157aq(a));
            C47393f.m84233d(this, C25184v.class, new C25158ar(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25148ai.m46472a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f68491d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f68491d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f68491d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f68491d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f68491d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f68491d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f68491d.mo51381i();
        try {
            if (!this.f68492e) {
                super.onAttach(context);
                if (this.f68488a == null) {
                    Object jN = mo30309d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C25149aj) {
                        C25149aj ajVar = (C25149aj) fragment;
                        C68225k.m98532d(ajVar);
                        this.f68488a = new C25155ap(ajVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C24974a) ((C74176nj) jN).f206836d.f205261ac.mo17428b(), (C21370a) ((C74176nj) jN).f206677a.i.mo17428b(), (C25466f) ((C74176nj) jN).f206836d.f205224S.mo17428b(), (C25172j) ((C74176nj) jN).f206836d.f205322bk.mo17428b(), (C25537t) ((C74176nj) jN).f206836d.f205273ao.mo17428b(), (C47400m) ((C74176nj) jN).f206730b.f198027a.f199472ff.mo17428b(), (C25197ac) ((C74176nj) jN).f206730b.f198027a.f199551hE.mo17428b(), (C25225bd) ((C74176nj) jN).f206677a.a.f203105jf.mo17428b(), (C27232l) ((C74176nj) jN).f206836d.f205441w.mo17428b(), (C25752a) ((C74176nj) jN).f206836d.f205279au.mo17428b(), (C58833ax) ((C74176nj) jN).f206836d.f205439u.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69680eQ(), ((C74176nj) jN).f206730b.f198027a.mo67014gb().mo60910c(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60891e());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f68491d, this.f68490c));
                    } else {
                        String obj = C25155ap.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f68491d;
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
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C25148ai.m46472a(th2, th3);
            }
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}

package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7975c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3861at.C50438xb;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.c.d */
/* compiled from: PG */
public final class C101577d extends C101574a implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101578e f283440a;

    /* renamed from: b */
    private Context f283441b;

    /* renamed from: c */
    private final C2393x f283442c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f283443d = new C47515ab(this);

    /* renamed from: e */
    private boolean f283444e;

    @Deprecated
    public C101577d() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C101578e j = mo17754z();
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), j.f283446b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92403d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f283441b == null) {
            this.f283441b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f283441b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f283443d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f283442c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f283443d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C101578e mo17754z() {
        C101578e eVar = this.f283440a;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f283444e) {
            return eVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f283443d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f283443d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            C101578e j = mo17754z();
            if (i == 405) {
                if (i2 != 4) {
                    j.f283449e.mo83702b(C89849ae.VOICE_MATCH_PAYMENTS_OPT_IN_FAILED);
                } else {
                    j.f283449e.mo83702b(C89849ae.VOICE_MATCH_PAYMENTS_OPT_IN_SUCCESS);
                }
                C47393f.m84236g(new C101783w(), j.f283446b);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f283443d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f283443d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f283443d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f283443d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C101578e j = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.hotword_enrollment_payments_opt_in, viewGroup, false);
            C59104x b = C101578e.f283445a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PaymentsOptInFragment");
            ((C59052c) ((C59052c) b).mo56372aa(20343)).mo56386p("showing Payments opt-in fragment");
            C0260w wVar = (C0260w) j.f283448d.mo17428b();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("PAYMENTS_SETTINGS_UI_KEY", new ProtoLiteParcelable((MessageLite) j.f283447c));
            wVar.setArguments(bundle2);
            wVar.setTargetFragment(j.f283446b, 405);
            wVar.show(j.f283446b.getParentFragmentManager(), "PaymentsVMOptInFragment");
            j.f283449e.mo83702b(C89849ae.VOICE_MATCH_PAYMENTS_OPT_IN_START);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f283443d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f283443d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f283443d.mo51376d();
        try {
            super.onDetach();
            this.f283444e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f283443d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f283443d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f283443d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f283443d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f283443d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f283443d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f283443d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101576c.m167955a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f283443d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f283443d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f283443d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f283443d;
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
        C47515ab abVar = this.f283443d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f283443d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f283443d;
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
        this.f283443d.mo51381i();
        try {
            if (!this.f283444e) {
                super.onAttach(context);
                if (this.f283440a == null) {
                    Object jN = mo92402b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101577d) {
                        C101577d dVar = (C101577d) fragment;
                        C68225k.m98532d(dVar);
                        Bundle a = ((C74178nm) jN).mo70044a();
                        C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C50438xb xbVar = (C50438xb) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C50438xb.f131260n, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                        C68225k.m98532d(xbVar);
                        this.f283440a = new C101578e(dVar, xbVar, ((C74178nm) jN).f207136c.f205622cR, (C89859i) ((C74178nm) jN).f207130a.a.f202586Q.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f283443d, this.f283442c));
                    } else {
                        String obj = C101578e.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f283443d;
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
                C101576c.m167955a(th, th2);
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

package com.google.android.libraries.lens.view.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28446p;
import com.google.android.libraries.logging.p2185ve.C28447q;
import com.google.android.libraries.logging.p2185ve.C28448r;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59928cj;
import com.google.common.p4552o.p4563i.C59930cl;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import org.chromium.net.NetError;

/* renamed from: com.google.android.libraries.lens.view.onboarding.h */
/* compiled from: PG */
public final class C27510h extends C27501bg implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C27515m f75226a;

    /* renamed from: b */
    private Context f75227b;

    /* renamed from: c */
    private final C2393x f75228c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f75229d = new C47515ab(this);

    /* renamed from: e */
    private boolean f75230e;

    @Deprecated
    public C27510h() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C27515m mo17754z() {
        C27515m mVar = this.f75226a;
        if (mVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f75230e) {
            return mVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo33037b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f75227b == null) {
            this.f75227b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f75227b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f75229d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f75228c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f75229d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f75229d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f75229d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f75229d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f75229d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f75229d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75229d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C27515m a = mo17754z();
            ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(new ContextThemeWrapper(layoutInflater.getContext(), 2132150759)).inflate(R.layout.onboarding_camera_denial_fragment, viewGroup, false);
            C28306ab abVar = a.f75244g;
            abVar.mo33801b(viewGroup2, abVar.f76990a.mo33805a(C28427h.m53115a(134811)));
            Button button = (Button) viewGroup2.findViewById(R.id.lens_onboarding_camera_denial_open_camera_button);
            C28306ab abVar2 = a.f75244g;
            abVar2.mo33801b(button, abVar2.f76990a.mo33805a(C28427h.m53115a(142151)));
            button.setOnClickListener(new C47591co(a.f75242e, "Clicked Open Camera Button", new C27513k(a)));
            Button button2 = (Button) viewGroup2.findViewById(R.id.lens_onboarding_camera_denial_open_settings_button);
            C28306ab abVar3 = a.f75244g;
            abVar3.mo33801b(button2, abVar3.f76990a.mo33805a(C28427h.m53115a(97260)));
            button2.setOnClickListener(new C47591co(a.f75242e, "Clicked Open Settings Button", new C27514l(a)));
            a.mo33053a(viewGroup2);
            C28448r rVar = a.f75241d;
            C28446p a2 = C28447q.m53152a(126855);
            C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
            C59928cj cjVar = (C59928cj) C59930cl.f161974c.createBuilder();
            cjVar.copyOnWrite();
            C59930cl clVar = (C59930cl) cjVar.instance;
            clVar.f161977b = 5;
            clVar.f161976a |= 1;
            bhVar.copyOnWrite();
            C59900bi biVar = (C59900bi) bhVar.instance;
            C59930cl clVar2 = (C59930cl) cjVar.build();
            clVar2.getClass();
            biVar.f161898f = clVar2;
            biVar.f161893a |= 1024;
            a2.f77232a.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
            a2.mo33898b(C45954d.m82060a(a.f75243f.f69824a));
            rVar.mo33855a(a2.mo33897a());
            int i = a.f75238a.f75235c;
            if (i > 0) {
                viewGroup2.setAlpha(0.0f);
                if (i > 150) {
                    viewGroup2.animate().alpha(1.0f).setStartDelay((long) (i + NetError.ERR_SSL_PINNED_KEY_NOT_IN_CERT_CHAIN)).setDuration(150);
                } else {
                    viewGroup2.animate().alpha(1.0f).setDuration((long) i);
                }
            }
            C47831fm.m85019n();
            return viewGroup2;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f75229d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f75229d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f75229d.mo51376d();
        try {
            super.onDetach();
            this.f75230e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f75229d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f75229d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f75229d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f75229d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f75229d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f75229d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f75229d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27509g.m51217a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f75229d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f75229d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f75229d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f75229d;
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
        C47515ab abVar = this.f75229d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f75229d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f75229d;
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
        this.f75229d.mo51381i();
        try {
            if (!this.f75230e) {
                super.onAttach(context);
                if (this.f75226a == null) {
                    Object jN = mo33038d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C27512j jVar = (C27512j) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C27512j.f75231d, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(jVar);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C27510h) {
                        C27510h hVar = (C27510h) fragment;
                        C68225k.m98532d(hVar);
                        this.f75226a = new C27515m(jVar, hVar, (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C28448r) ((C74176nj) jN).f206677a.b.f200191et.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C25684e) ((C74176nj) jN).f206836d.f205219N.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f75229d, this.f75228c));
                    } else {
                        String obj = C27515m.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f75229d;
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
                C27509g.m51217a(th, th2);
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

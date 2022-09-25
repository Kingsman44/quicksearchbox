package com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126985f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126986g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126991l;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126992m;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127147g;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent.b */
/* compiled from: PG */
public final class C127826b extends C127840o implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: g */
    private C127828c f351818g;

    /* renamed from: h */
    private Context f351819h;

    /* renamed from: i */
    private final C2393x f351820i = new C2393x(this);

    /* renamed from: j */
    private final C47515ab f351821j = new C47515ab(this);

    /* renamed from: k */
    private boolean f351822k;

    @Deprecated
    public C127826b() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29375a(int i) {
        C127828c b = mo17754z();
        C127826b bVar = b.f351827b;
        C127118j jVar = b.f351826a;
        C127147g gVar = b.f351828c;
        int i2 = i - 1;
        if (i2 == 0 || i2 == 4) {
            ((C59052c) ((C59052c) C127837l.f351843a.mo56224b()).mo56372aa(37614)).mo56386p("consent granted");
            C58838bb.m90866a(bVar.f351844b, "Expected non-null textInputParam");
            C46459k.m82829b(jVar.mo107931g(C127407d.m208363c(C127454b.CLIENT_INPUT, bVar.f351844b)), "Failed to resend client input", new Object[0]);
        } else {
            C126986g gVar2 = (C126986g) C126988i.f349669h.createBuilder();
            C126985f fVar = C126985f.ERROR_JIT_CONSENT_DECLINED;
            gVar2.copyOnWrite();
            C126988i iVar = (C126988i) gVar2.instance;
            iVar.f349676f = fVar.f349668l;
            iVar.f349671a |= 1;
            C126991l lVar = (C126991l) C126992m.f349681d.createBuilder();
            String str = bVar.f351845c;
            C58838bb.m90866a(str, "Expected non-null reject text.");
            lVar.copyOnWrite();
            C126992m mVar = (C126992m) lVar.instance;
            mVar.f349683a |= 2;
            mVar.f349685c = str;
            gVar2.copyOnWrite();
            C126988i iVar2 = (C126988i) gVar2.instance;
            C126992m mVar2 = (C126992m) lVar.build();
            mVar2.getClass();
            iVar2.f349675e = mVar2;
            iVar2.f349674d = 7;
            C46459k.m82829b(gVar.mo107971b((C126988i) gVar2.build()), "Failed to resend reject text", new Object[0]);
        }
        C0167am activity = b.f351827b.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: b */
    public final C127828c mo17754z() {
        C127828c cVar = this.f351818g;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f351822k) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo108229d() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f351819h == null) {
            this.f351819h = new C47236e((Fragment) this, super.getContext());
        }
        return this.f351819h;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f351821j.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f351820i;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f351821j.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f351821j.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f351821j.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f351821j.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C47573bx f = this.f351821j.mo51378f("DialogFragment:onCancel");
        try {
            super.onCancel(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f351821j.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f351821j.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f351821j.mo51381i();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f351821j.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f351821j.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f351821j.mo51376d();
        try {
            super.onDetach();
            this.f351822k = true;
            d.close();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f351821j.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f351821j.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f351821j.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f351821j.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f351821j.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f351821j.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f351821j.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f351821j.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f351821j.mo51381i();
        try {
            super.onViewCreated(view, bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C127824a.m208847a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f351821j;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f351821j;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f351821j;
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
        C47515ab abVar = this.f351821j;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f351821j;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f351821j;
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
        this.f351821j.mo51381i();
        try {
            if (!this.f351822k) {
                super.onAttach(context);
                if (this.f351818g == null) {
                    Object jN = mo108233f().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C127826b) {
                        C127826b bVar = (C127826b) fragment;
                        C68225k.m98532d(bVar);
                        this.f351818g = new C127828c(bVar, ((C74176nj) jN).mo70009s(), (C127147g) ((C74176nj) jN).f206730b.f198027a.f199278bx.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f351821j, this.f351820i));
                    } else {
                        String obj = C127828c.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f351821j;
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
                C127824a.m208847a(th, th2);
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

package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.p10272a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.anh;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.sdk.avs.C24898o;
import com.google.android.libraries.lens.sdk.avs.data.C24877l;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.a.h */
/* compiled from: PG */
public final class C135597h extends C135605p implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C135603n f369347a;

    /* renamed from: b */
    private Context f369348b;

    /* renamed from: c */
    private final C2393x f369349c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f369350d = new C47515ab(this);

    /* renamed from: e */
    private boolean f369351e;

    @Deprecated
    public C135597h() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C135603n mo17754z() {
        C135603n nVar = this.f369347a;
        if (nVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f369351e) {
            return nVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112403b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f369348b == null) {
            this.f369348b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f369348b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f369350d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f369349c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f369350d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f369350d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f369350d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f369350d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C135603n a = mo17754z();
        a.mo112409b((ImageView) a.f369368c.requireView().findViewById(R.id.googleapp_browser_contextmenu_imagepreview), (RelativeLayout) a.f369368c.requireView().findViewById(R.id.googleapp_browser_context_menu_image_container));
    }

    public final void onCreate(Bundle bundle) {
        this.f369350d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f369350d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f369350d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C135603n a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_browser_imageitem_contextmenu, viewGroup, false);
            C28306ab abVar = a.f369371f;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(152592)));
            C135594e eVar = a.f369370e;
            ImageView imageView = (ImageView) inflate.findViewById(R.id.googleapp_browser_contextmenu_imagepreview);
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.googleapp_browser_context_menu_image_container);
            C28306ab abVar2 = a.f369371f;
            imageView.getClass();
            relativeLayout.getClass();
            abVar2.getClass();
            C28443m mVar = (C28443m) eVar.f369342a.mo17428b();
            mVar.getClass();
            C47770dh dhVar = (C47770dh) eVar.f369343b.mo17428b();
            dhVar.getClass();
            Boolean bool = (Boolean) eVar.f369344c.mo17428b();
            bool.getClass();
            a.f369376k = new C135593d(imageView, relativeLayout, abVar2, mVar, dhVar, bool.booleanValue());
            C135593d dVar = a.f369376k;
            dVar.getClass();
            a.f369375j = new C135604o(dVar);
            if (bundle != null) {
                C135604o oVar = a.f369375j;
                oVar.getClass();
                Bundle bundle2 = bundle.getBundle("QueryResultBundle");
                bundle2.getClass();
                oVar.f369381b = new C24877l(bundle2);
                a.mo112408a(a.f369367b, inflate, true);
            } else {
                a.mo112408a(a.f369367b, inflate, false);
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f369350d.mo51374b();
        try {
            super.onDestroy();
            C135603n a = mo17754z();
            a.f369374i.ifPresentOrElse(new C135598i(a), C135599j.f369353a);
            b.close();
            return;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f369350d.mo51375c();
        try {
            super.onDestroyView();
            C135603n a = mo17754z();
            if (a.f369373h != null) {
                ViewTreeObserver viewTreeObserver = a.f369368c.requireView().findViewById(R.id.googleapp_browser_context_menu_image_container_parent).getViewTreeObserver();
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = a.f369373h;
                onGlobalLayoutListener.getClass();
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            c.close();
            return;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f369350d.mo51376d();
        try {
            super.onDetach();
            this.f369351e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f369350d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f369350d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f369350d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f369350d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f369350d.mo51381i();
        try {
            C135604o oVar = mo17754z().f369375j;
            oVar.getClass();
            C24877l lVar = oVar.f369381b;
            lVar.getClass();
            bundle.putBundle("QueryResultBundle", lVar.f67960a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f369350d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f369350d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135596g.m219839a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f369350d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f369350d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f369350d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f369350d;
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
        C47515ab abVar = this.f369350d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f369350d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f369350d;
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
        this.f369350d.mo51381i();
        try {
            if (!this.f369351e) {
                super.onAttach(context);
                if (this.f369347a == null) {
                    Object jN = mo112410d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C135597h) {
                        C135597h hVar = (C135597h) fragment;
                        C68225k.m98532d(hVar);
                        String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                        C68225k.m98532d(b);
                        C24898o oVar = new C24898o((Context) ((C74176nj) jN).f206677a.d.f201488a.g.mo17428b());
                        C69464a aVar = ((C74176nj) jN).f206677a.a.f202879fR;
                        anh anh = ((C74176nj) jN).f206730b;
                        C46439e eVar = (C46439e) ((C74176nj) jN).f206942f.mo17428b();
                        this.f369347a = new C135603n(hVar, b, (C47449e) ((C74176nj) jN).f206677a.gH.mo17428b(), oVar, new C135594e(aVar, anh.f198663m, anh.f198027a.f199527gh), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f369350d, this.f369349c));
                    } else {
                        String obj = C135603n.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f369350d;
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
                C135596g.m219839a(th, th2);
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

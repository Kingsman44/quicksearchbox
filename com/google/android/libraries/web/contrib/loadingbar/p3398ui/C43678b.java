package com.google.android.libraries.web.contrib.loadingbar.p3398ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.contrib.loadingbar.p3397a.C43675b;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58893dc;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.libraries.web.contrib.loadingbar.ui.b */
/* compiled from: PG */
public final class C43678b extends C43691n implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C43679c f113965a;

    /* renamed from: b */
    private Context f113966b;

    /* renamed from: c */
    private final C2393x f113967c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f113968d = new C47515ab(this);

    /* renamed from: e */
    private boolean f113969e;

    @Deprecated
    public C43678b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C43679c mo17754z() {
        C43679c cVar = this.f113965a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f113969e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo46698b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f113966b == null) {
            this.f113966b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f113966b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f113968d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f113967c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f113968d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f113968d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f113968d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f113968d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f113968d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f113968d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f113968d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C43679c a = mo17754z();
            LoadingBarView loadingBarView = (LoadingBarView) layoutInflater.inflate(R.layout.webx_loading_bar, viewGroup, false);
            Drawable drawable = loadingBarView.getContext().getDrawable(a.f113972c);
            C58893dc.m90996a(drawable);
            loadingBarView.setProgressDrawable(drawable);
            a.f113977h = loadingBarView.mo17754z();
            C43687j jVar = a.f113977h;
            C43675b bVar = a.f113976g;
            int i = bVar.f113960a;
            if ((i & 1) != 0) {
                jVar.f113989c = bVar.f113961b;
            }
            if ((i & 2) != 0) {
                C147454r rVar = new C147454r(300.0f, bVar.f113962c);
                jVar.f113987a.f397996b = rVar;
                jVar.f113988b.f397996b = rVar;
            }
            a.f113974e.mo50707a(a.f113975f.mo46469b(), a.f113971b);
            C47831fm.m85019n();
            return loadingBarView;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f113968d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f113968d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f113968d.mo51376d();
        try {
            super.onDetach();
            this.f113969e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f113968d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f113968d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f113968d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f113968d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f113968d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f113968d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f113968d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43677a.m77067a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f113968d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f113968d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f113968d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f113968d;
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
        C47515ab abVar = this.f113968d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f113968d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f113968d;
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
        this.f113968d.mo51381i();
        try {
            if (!this.f113969e) {
                super.onAttach(context);
                if (this.f113965a == null) {
                    this.f113965a = ((C43681d) mo46705d().mo17653jN()).mo46699fG();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f113968d, this.f113967c));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f113968d;
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
                C43677a.m77067a(th, th2);
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

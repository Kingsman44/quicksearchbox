package com.google.android.libraries.web.contrib.p3360c.p3361a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.WebConfig;
import com.google.android.libraries.web.coordinator.C43727a;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3420k.C43855b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.contrib.c.a.c */
/* compiled from: PG */
public final class C43406c extends C43404a implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    public final C2393x f113402a = new C2393x(this);

    /* renamed from: b */
    private C43409f f113403b;

    /* renamed from: c */
    private Context f113404c;

    /* renamed from: d */
    private final C47515ab f113405d = new C47515ab(this);

    /* renamed from: e */
    private boolean f113406e;

    @Deprecated
    public C43406c() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo46504b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f113404c == null) {
            this.f113404c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f113404c;
    }

    /* renamed from: f */
    public final C43409f mo17754z() {
        C43409f fVar = this.f113403b;
        if (fVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f113406e) {
            return fVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f113405d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f113402a;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f113405d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f113405d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f113405d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f113405d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f113405d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f113405d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f113405d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C43409f f = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            if (f.mo46508a() == null && !f.f113418j && bundle == null) {
                AccountId accountId = f.f113411c;
                String str = f.f113410b;
                C43259j jVar = new C43259j();
                jVar.f113060c = f.f113416h.f114484b;
                WebConfig a = jVar.mo46371a();
                C69664n.m101061g(accountId, "accountId");
                C43855b bVar = new C43855b();
                C68324h.m98669f(bVar);
                C47247a.m84047b(bVar, accountId);
                C47243l.m84040b(bVar, str);
                C43727a.m77221a(bVar, a);
                Bundle arguments = bVar.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putBoolean("webx-nest-coords", true);
                bVar.setArguments(arguments);
                FragmentManager childFragmentManager = f.f113413e.getChildFragmentManager();
                C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
                C0154a aVar = new C0154a(childFragmentManager);
                aVar.mo685r(bVar, "independent-web-fragment");
                aVar.mo509f();
                f.f113414f.mo50707a(bVar.mo17754z().f114293a.mo46469b(), f.f113417i);
            } else {
                f.f113414f.mo50707a(new C46719bc(f.f113412d, C43407d.f113407a, "dummycontentkey"), f.f113417i);
            }
            f.f113418j = true;
            C47831fm.m85019n();
            return null;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f113405d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f113405d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f113405d.mo51376d();
        try {
            super.onDetach();
            this.f113406e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f113405d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f113405d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f113405d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f113405d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f113405d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f113405d.mo51381i();
        try {
            super.onStart();
            C43409f f = mo17754z();
            C43855b a = f.mo46508a();
            if (a != null) {
                C43376u a2 = a.mo17754z().f114293a.mo46468a();
                C69664n.m101060f(a2, "webFragment.peer().webStateDataService.webState");
                if (f.mo46509b(a2)) {
                    FragmentManager childFragmentManager = f.f113413e.getChildFragmentManager();
                    C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
                    C0154a aVar = new C0154a(childFragmentManager);
                    aVar.mo516m(a);
                    aVar.mo509f();
                }
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f113405d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C43405b.m76594a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f113405d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f113405d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f113405d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f113405d;
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
        C47515ab abVar = this.f113405d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f113405d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f113405d;
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
        this.f113405d.mo51381i();
        try {
            if (!this.f113406e) {
                super.onAttach(context);
                if (this.f113403b == null) {
                    this.f113403b = ((C43411g) mo46503a().mo17653jN()).mo46510fC();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f113405d, this.f113402a));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f113405d;
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
                C43405b.m76594a(th, th2);
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

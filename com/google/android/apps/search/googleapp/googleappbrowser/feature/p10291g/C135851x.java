package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
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
import com.google.common.p4552o.C60422pq;
import com.google.common.p4552o.C60423pr;
import com.google.protobuf.C62940bt;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.x */
/* compiled from: PG */
public final class C135851x extends C135826ax implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C135808af f370000a;

    /* renamed from: b */
    private Context f370001b;

    /* renamed from: c */
    private final C2393x f370002c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f370003d = new C47515ab(this);

    /* renamed from: e */
    private boolean f370004e;

    @Deprecated
    public C135851x() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C135808af mo17754z() {
        C135808af afVar = this.f370000a;
        if (afVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f370004e) {
            return afVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo112576b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f370001b == null) {
            this.f370001b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f370001b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f370003d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f370002c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f370003d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f370003d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f370003d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f370003d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f370003d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f370003d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f370003d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C135808af a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_browser_fragment_instacart, viewGroup, false);
            C28306ab abVar = a.f369917f;
            C28313c a2 = abVar.f76990a.mo33805a(C28427h.m53115a(148923));
            boolean z = a.f369915d.f163520b;
            C62940bt btVar = C135786a.f369870a;
            C60422pq pqVar = (C60422pq) C60423pr.f163516c.createBuilder();
            pqVar.copyOnWrite();
            C60423pr prVar = (C60423pr) pqVar.instance;
            prVar.f163519a |= 1;
            prVar.f163520b = z;
            a2.mo33858f(new C28353e(btVar, (C60423pr) pqVar.build()));
            abVar.mo33801b(inflate, a2);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f370003d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f370003d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f370003d.mo51376d();
        try {
            super.onDetach();
            this.f370004e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f370003d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f370003d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f370003d.mo51381i();
        try {
            super.onPause();
            C135808af a = mo17754z();
            a.f369925n.removeAllListeners();
            if (a.f369925n.isStarted()) {
                a.f369925n.cancel();
                a.f369924m.cancel();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f370003d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f370003d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f370003d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f370003d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135850w.m220404a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f370003d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f370003d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f370003d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f370003d;
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
        C47515ab abVar = this.f370003d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f370003d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f370003d;
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
        this.f370003d.mo51381i();
        try {
            if (!this.f370004e) {
                super.onAttach(context);
                if (this.f370000a == null) {
                    this.f370000a = ((C135809ag) mo112577d().mo17653jN()).mo112567cq();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f370003d, this.f370002c));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f370003d;
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
                C135850w.m220404a(th, th2);
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

package com.google.android.apps.search.transcription.voiceime.standalone.settings;

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
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10981h;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10984k;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.C47853m;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47711b;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47713d;
import com.google.common.util.concurrent.C60887da;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.transcription.voiceime.standalone.settings.j */
/* compiled from: PG */
public final class C142032j extends C142025c implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: f */
    private C142036n f385363f;

    /* renamed from: g */
    private Context f385364g;

    /* renamed from: h */
    private final C2393x f385365h = new C2393x(this);

    /* renamed from: i */
    private final C47515ab f385366i = new C47515ab(this);

    /* renamed from: j */
    private boolean f385367j;

    @Deprecated
    public C142032j() {
        C19559g.m37304c();
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f385364g == null) {
            this.f385364g = new C47236e((Fragment) this, super.getContext());
        }
        return this.f385364g;
    }

    /* renamed from: fZ */
    public final void mo8407fZ(Bundle bundle, String str) {
        C142036n o = mo17754z();
        o.f385372b.mo8408ga(R.xml.transcription_preferences);
        o.mo116986c().f12742n = new C47711b(o.f385376f, "Profanity filter Setting Changed", new C142033k(o));
        o.mo116985b().f12742n = new C47711b(o.f385376f, "Voice languages Setting Changed", new C142034l(o));
        o.mo116984a().f12742n = new C47711b(o.f385376f, "Primary language Setting Changed", new C142035m(o));
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f385366i.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f385365h;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f385366i.mo51380h(eyVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final /* synthetic */ C68324h mo116979m() {
        return new C47243l(this);
    }

    /* renamed from: o */
    public final C142036n mo17754z() {
        C142036n nVar = this.f385363f;
        if (nVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f385367j) {
            return nVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f385366i.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f385366i.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f385366i.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f385366i.mo51381i();
        try {
            super.onCreate(bundle);
            C142036n o = mo17754z();
            C46801dp dpVar = o.f385374d;
            C10984k kVar = o.f385373c;
            dpVar.mo50707a(new C46719bc(kVar.f36122b, new C10981h(kVar), "Transcription:VoiceImeSettings"), o.f385377g);
            o.f385375e.mo50429i(o.f385378h);
            o.f385375e.mo50429i(o.f385379i);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f385366i.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f385366i.mo51381i();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f385366i.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f385366i.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f385366i.mo51376d();
        try {
            super.onDetach();
            this.f385367j = true;
            d.close();
            return;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f385366i.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f385366i.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54439e.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f385366i.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f385366i.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f385366i.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f385366i.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f385366i.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f385366i.mo51381i();
        try {
            super.onViewCreated(view, bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C142031i.m230582a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f385366i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f385366i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f385366i;
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
        C47515ab abVar = this.f385366i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f385366i;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f385366i;
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
        this.f385366i.mo51381i();
        try {
            if (!this.f385367j) {
                super.onAttach(context);
                if (this.f385363f == null) {
                    Object jN = mo116978b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C142032j) {
                        C142032j jVar = (C142032j) fragment;
                        C68225k.m98532d(jVar);
                        this.f385363f = new C142036n(jVar, new C10984k((C46723bg) ((C74178nm) jN).f207130a.ap.mo17428b(), (C42876ab) ((C74178nm) jN).f207130a.d.f201711eK.mo17428b(), (C46778cv) ((C74178nm) jN).f207130a.ao.mo17428b(), (C60887da) ((C74178nm) jN).f207130a.p.mo17428b(), ((C74178nm) jN).f207130a.cU(), (C60887da) ((C74178nm) jN).f207130a.n.mo17428b()), (C46801dp) ((C74178nm) jN).f207138e.mo17428b(), (C46439e) ((C74178nm) jN).f207139f.mo17428b(), new C47713d((C47853m) ((C74178nm) jN).f207127X.mo17428b()));
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f385366i, this.f385365h));
                    } else {
                        String obj = C142036n.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f385366i;
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
                C142031i.m230582a(th, th2);
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

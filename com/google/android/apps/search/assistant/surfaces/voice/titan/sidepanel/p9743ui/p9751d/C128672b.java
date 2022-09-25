package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.p9751d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128582b;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128587e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128593k;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9738b.C128583a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9738b.C128584b;
import com.google.android.googlequicksearchbox.R;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.d.b */
/* compiled from: PG */
public final class C128672b extends C128685o implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C128676f f353719a;

    /* renamed from: b */
    private Context f353720b;

    /* renamed from: c */
    private final C2393x f353721c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f353722d = new C47515ab(this);

    /* renamed from: e */
    private boolean f353723e;

    @Deprecated
    public C128672b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C128676f mo17754z() {
        C128676f fVar = this.f353719a;
        if (fVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f353723e) {
            return fVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo108611b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f353720b == null) {
            this.f353720b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f353720b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f353722d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f353721c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f353722d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f353722d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f353722d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f353722d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f353722d.mo51381i();
        try {
            super.onCreate(bundle);
            C128676f a = mo17754z();
            a.f353729c.mo50429i(a.f353735i);
            if (a.f353727a.getChildFragmentManager().f634a.mo670b(R.id.assistant_side_panel_p6glow_container) == null) {
                int i = C128593k.f353562h;
                C128582b b = C128587e.m209856b(a.f353728b);
                C0154a aVar = new C0154a(a.f353727a.getChildFragmentManager());
                aVar.mo511h(R.id.assistant_side_panel_p6glow_container, b, (String) null, 1);
                aVar.mo509f();
            }
            a.f353733g.mo50828h(R.id.assistant_side_panel_p6glow_container, a.f353734h.mo108053a(), new C128675e(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f353722d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f353722d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C128676f a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.assistant_side_panel_fragment_layout, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.assistant_side_panel_right_icon);
            C69664n.m101060f(findViewById, "this.findViewById(R.id.a…nt_side_panel_right_icon)");
            a.f353730d.mo108810b(33439, findViewById);
            C69664n.m101060f(inflate, "inflater.inflate(R.layou…eyboardIcon\n      )\n    }");
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f353722d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f353722d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f353722d.mo51376d();
        try {
            super.onDetach();
            this.f353723e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f353722d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f353722d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f353722d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f353722d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f353722d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f353722d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f353722d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f353722d.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C128676f a2 = mo17754z();
            C47393f.m84233d(this, C128583a.class, new C128678h(a2));
            C47393f.m84233d(this, C128584b.class, new C128679i(a2));
            a.f123128b.findViewById(R.id.assistant_side_panel_right_icon).setTag(R.id.tiktok_event_internal_trace, "onKeyboardClicked");
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_side_panel_right_icon), new C128680j(a2));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128671a.m209985a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f353722d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f353722d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f353722d;
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
        C47515ab abVar = this.f353722d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f353722d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f353722d;
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
        this.f353722d.mo51381i();
        try {
            if (!this.f353723e) {
                super.onAttach(context);
                if (this.f353719a == null) {
                    this.f353719a = ((C128681k) mo108615d().mo17653jN()).mo108613E();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f353722d, this.f353721c));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f353722d;
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
                C128671a.m209985a(th, th2);
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

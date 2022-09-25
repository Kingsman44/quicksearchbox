package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

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
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h.C128914l;
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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.i */
/* compiled from: PG */
public final class C128911i extends C128906d implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C128914l f354261a;

    /* renamed from: b */
    private Context f354262b;

    /* renamed from: c */
    private final C2393x f354263c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f354264d = new C47515ab(this);

    /* renamed from: e */
    private boolean f354265e;

    @Deprecated
    public C128911i() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo108743b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f354262b == null) {
            this.f354262b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f354262b;
    }

    /* renamed from: f */
    public final C128914l mo17754z() {
        C128914l lVar = this.f354261a;
        if (lVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f354265e) {
            return lVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f354264d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f354263c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f354264d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f354264d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f354264d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f354264d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f354264d.mo51381i();
        try {
            super.onCreate(bundle);
            C128914l f = mo17754z();
            f.f354277k.mo50429i(C128914l.C128915a.f354282a);
            f.f354275i.mo108671h();
            f.f354273g.mo50828h(0, f.f354274h.mo108706g(), new C128923t(f));
            f.f354273g.mo50828h(1, f.f354274h.mo108705f(), new C128921r(f));
            f.f354273g.mo50828h(2, f.f354274h.mo108703d(), new C128917n(f));
            f.f354273g.mo50828h(3, f.f354274h.mo108704e(), new C128918o(f));
            f.f354273g.mo50828h(4, f.f354274h.mo108700a(), new C128912j(f));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f354264d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f354264d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.assistant_voice_plate, viewGroup, false);
            C69664n.m101060f(inflate, "inflater.inflate(R.layou…_plate, container, false)");
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f354264d.mo51374b();
        try {
            super.onDestroy();
            mo17754z().f354275i.mo108672i();
            b.close();
            return;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f354264d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f354264d.mo51376d();
        try {
            super.onDetach();
            this.f354265e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f354264d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f354264d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f354264d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f354264d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f354264d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f354264d.mo51381i();
        try {
            super.onStart();
            mo17754z().f354278l.mo108758a();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f354264d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f354264d.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_voice_plate_root), new C128926w(mo17754z()));
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_plate_container), new C128927x());
            C128914l f = mo17754z();
            C69664n.m101061g(view, "view");
            View findViewById = view.findViewById(R.id.assistant_plate_navbar_guideline);
            C69664n.m101060f(findViewById, BuildConfig.FLAVOR);
            C128567c.m209821d(findViewById, new C128925v(findViewById, f));
            View findViewById2 = view.findViewById(R.id.assistant_voice_plate_p6glow_view);
            C69664n.m101060f(findViewById2, BuildConfig.FLAVOR);
            C128567c.m209821d(findViewById2, new C128924u(findViewById2, f));
            f.f354276j.mo108810b(152868, view.findViewById(R.id.assistant_voice_plate_root));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128910h.m210414a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f354264d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f354264d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f354264d;
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
        C47515ab abVar = this.f354264d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f354264d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f354264d;
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
        this.f354264d.mo51381i();
        try {
            if (!this.f354265e) {
                super.onAttach(context);
                if (this.f354261a == null) {
                    this.f354261a = ((C128928y) mo108742a().mo17653jN()).mo108755I();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f354264d, this.f354263c));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f354264d;
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
                C128910h.m210414a(th, th2);
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

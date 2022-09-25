package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9778l.C128948b;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.impl.C128973i;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.p9783a.p9784a.C128962a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.p9783a.p9784a.C128963b;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.suggestions.impl.h */
/* compiled from: PG */
public final class C128972h extends C128965a implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C128973i f354378a;

    /* renamed from: b */
    private Context f354379b;

    /* renamed from: c */
    private final C2393x f354380c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f354381d = new C47515ab(this);

    /* renamed from: e */
    private boolean f354382e;

    @Deprecated
    public C128972h() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo108776b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f354379b == null) {
            this.f354379b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f354379b;
    }

    /* renamed from: f */
    public final C128973i mo17754z() {
        C128973i iVar = this.f354378a;
        if (iVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f354382e) {
            return iVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f354381d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f354380c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f354381d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f354381d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f354381d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f354381d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f354381d.mo51381i();
        try {
            super.onCreate(bundle);
            C128973i f = mo17754z();
            f.f354385c.mo50429i(C128973i.C128974a.f354394a);
            f.f354384b.mo50828h(0, new C128962a(f.f354391i), new C128975j(f));
            f.f354384b.mo50828h(1, new C128963b(f.f354391i), new C128976k(f));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f354381d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f354381d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C128973i f = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.assistant_voice_plate_suggestions, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.assistant_voice_plate_recycler_view);
            C69664n.m101060f(findViewById, "view.findViewById(R.id.a…oice_plate_recycler_view)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            recyclerView.setLayoutManager(new SuggestionsFragmentPeer$onCreateView$1(f, recyclerView.getContext()));
            f.f354386d.mo108810b(154683, recyclerView);
            recyclerView.setAdapter(f.f354387e);
            C69664n.m101060f(inflate, "view");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f354381d.mo51374b();
        try {
            super.onDestroy();
            C128948b bVar = mo17754z().f354388f;
            if (bVar != null) {
                bVar.mo108768a();
            }
            b.close();
            return;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f354381d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f354381d.mo51376d();
        try {
            super.onDetach();
            this.f354382e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f354381d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f354381d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f354381d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f354381d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f354381d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f354381d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f354381d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128971g.m210528a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f354381d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f354381d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f354381d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f354381d;
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
        C47515ab abVar = this.f354381d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f354381d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f354381d;
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
        this.f354381d.mo51381i();
        try {
            if (!this.f354382e) {
                super.onAttach(context);
                if (this.f354378a == null) {
                    this.f354378a = ((C128978m) mo108775a().mo17653jN()).mo108782N();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f354381d, this.f354380c));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f354381d;
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
                C128971g.m210528a(th, th2);
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

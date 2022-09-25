package com.google.android.libraries.lens.view.gallery;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0646fh;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.p109f.p110a.C2248v;
import com.google.android.apps.gsa.binaries.satin.app.C73958bn;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.anh;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.asp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2099c.C25941f;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.gallery.data.C26393l;
import com.google.android.libraries.lens.view.gallery.data.C26398q;
import com.google.android.libraries.lens.view.gallery.p2111d.C26353ao;
import com.google.android.libraries.lens.view.gallery.p2111d.C26364j;
import com.google.android.libraries.lens.view.gallery.p2111d.C26365k;
import com.google.android.libraries.lens.view.gallery.p2111d.C26367m;
import com.google.android.libraries.lens.view.gallery.p2111d.C26368n;
import com.google.android.libraries.lens.view.gallery.p2111d.C26369o;
import com.google.android.libraries.lens.view.gallery.p2112e.C26408a;
import com.google.android.libraries.lens.view.gallery.p2112e.C26418k;
import com.google.android.libraries.lens.view.onboarding.C27481an;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2074ap.C25466f;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2078at.C25512ar;
import com.google.android.libraries.lens.view.p2078at.C25534q;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.sampleimages.C27697a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28448r;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.lens.p4711m.C62632i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.gallery.i */
/* compiled from: PG */
public final class C26422i extends C26319at implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C26299ac f71905a;

    /* renamed from: b */
    private Context f71906b;

    /* renamed from: c */
    private final C2393x f71907c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f71908d = new C47515ab(this);

    /* renamed from: e */
    private boolean f71909e;

    @Deprecated
    public C26422i() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C26299ac mo17754z() {
        C26299ac acVar = this.f71905a;
        if (acVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f71909e) {
            return acVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo31520b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f71906b == null) {
            this.f71906b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f71906b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f71908d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f71907c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f71908d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f71908d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f71908d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f71908d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C26299ac a = mo17754z();
        View findViewById = a.f71495c.requireView().findViewById(R.id.lens_gallery_floating_permission_button);
        a.mo31511k(findViewById);
        if (configuration.orientation == 1 && findViewById != null) {
            findViewById.setTranslationY(0.0f);
        }
    }

    public final void onCreate(Bundle bundle) {
        this.f71908d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f71908d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f71908d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C26299ac a = mo17754z();
            a.f71471C = (GalleryFrameLayout) LayoutInflater.from(new ContextThemeWrapper(layoutInflater.getContext(), 2132150759)).inflate(R.layout.lens_gallery, viewGroup, false);
            C28306ab abVar = a.f71507o;
            abVar.mo33801b(a.f71471C, abVar.f76990a.mo33805a(C28427h.m53115a(118189)));
            a.f71472D = a.f71471C.findViewById(R.id.lens_gallery_main);
            a.f71473E = a.f71471C.findViewById(R.id.lens_camera_cutout);
            a.f71474F = (GalleryRecyclerView) a.f71471C.findViewById(R.id.lens_gallery_recycler_view);
            a.f71475G = a.f71471C.findViewById(R.id.lens_gallery_scrim);
            if (a.f71500h.mo33017b()) {
                View view = a.f71473E;
                view.getClass();
                View findViewById = view.findViewById(R.id.lens_camera_cutout_image);
                findViewById.getClass();
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.getClass();
                Context b = a.mo31502b();
                int dimensionPixelSize = b.getResources().getDimensionPixelSize(R.dimen.lens_gallery_big_camera_cutout_image_size);
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
                findViewById.setLayoutParams(layoutParams);
                int dimensionPixelSize2 = (dimensionPixelSize - b.getResources().getDimensionPixelSize(R.dimen.lens_gallery_camera_cutout_icon_size)) / 2;
                findViewById.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                a.mo31510j();
            }
            a.f71476H = new C26418k(a.f71475G);
            a.f71476H.mo31624b(a.f71474F);
            GalleryRecyclerView galleryRecyclerView = a.f71474F;
            galleryRecyclerView.mHasFixedSize = true;
            galleryRecyclerView.setItemAnimator((C0646fh) null);
            a.f71477I = new C26408a(a.f71495c.getResources(), true ^ a.f71500h.mo33017b());
            a.f71472D.setBackground(a.f71477I);
            GalleryFrameLayout galleryFrameLayout = a.f71471C;
            GalleryRecyclerView galleryRecyclerView2 = a.f71474F;
            galleryFrameLayout.f71457c = galleryRecyclerView2;
            galleryFrameLayout.f71458d = a;
            galleryRecyclerView2.f71463a = new C26433t(a);
            galleryRecyclerView2.addItemDecoration$ar$ds(new C26303ad(a));
            GalleryRecyclerView galleryRecyclerView3 = a.f71474F;
            galleryRecyclerView3.mOnItemTouchListeners.add(new C26434u(a));
            a.f71474F.addOnScrollListener(new C26435v(a));
            C28306ab abVar2 = a.f71507o;
            abVar2.mo33801b(a.f71474F, abVar2.f76990a.mo33805a(C28427h.m53115a(118193)));
            C28306ab abVar3 = a.f71507o;
            abVar3.mo33801b(a.f71472D, abVar3.f76990a.mo33805a(C28427h.m53115a(127435)));
            a.f71496d.mo31599f(a.f71495c.getViewLifecycleOwner(), new C26426m(a));
            a.f71499g.mo5704e(a.f71495c.getViewLifecycleOwner(), new C26427n(a));
            a.f71503k.mo30531a().mo5704e(a.f71495c.getViewLifecycleOwner(), new C26428o(a));
            a.f71504l.f69401a.mo5704e(a.f71495c.getViewLifecycleOwner(), new C26436w(a));
            if (a.f71501i) {
                View inflate = ((ViewStub) a.f71471C.findViewById(R.id.lens_gallery_floating_permission_button_stub)).inflate();
                inflate.getClass();
                C28306ab abVar4 = a.f71507o;
                abVar4.mo33801b(inflate, abVar4.f76990a.mo33805a(C28427h.m53115a(152482)));
                inflate.setOnClickListener(new C47591co(a.f71509q, "Clicked Images Permission Button", new C26429p(a)));
                a.mo31511k(inflate);
                if (C62632i.m94823h(a.f71511s.mo32701h())) {
                    TextView textView = (TextView) inflate.findViewById(R.id.lens_gallery_permission_button_text);
                    textView.getClass();
                    textView.setText(R.string.lens_gallery_translate_entrypoint_permission_explainer);
                }
            }
            GalleryFrameLayout galleryFrameLayout2 = a.f71471C;
            if (galleryFrameLayout2 != null) {
                C47831fm.m85019n();
                return galleryFrameLayout2;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f71908d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f71908d.mo51375c();
        try {
            super.onDestroyView();
            C26418k kVar = mo17754z().f71476H;
            kVar.getClass();
            kVar.mo31623a();
            c.close();
            return;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f71908d.mo51376d();
        try {
            super.onDetach();
            this.f71909e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f71908d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f71908d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f71908d.mo51381i();
        try {
            super.onPause();
            C26299ac a = mo17754z();
            if (a.f71514v.isRunning()) {
                a.f71514v.end();
            }
            C2248v vVar = a.f71478J;
            if (vVar != null) {
                vVar.mo5583b();
                a.f71478J = null;
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f71908d.mo51377e();
        try {
            super.onResume();
            C26299ac a = mo17754z();
            if (a.f71480L) {
                a.f71493a.execute(C47810es.m84977q(new C26425l(a)));
            }
            e.close();
            return;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f71908d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f71908d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f71908d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f71908d.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C26299ac a = mo17754z();
            C47393f.m84233d(this, C26367m.class, new C26304ae(a));
            C47393f.m84233d(this, C27697a.class, new C26305af(a));
            C47393f.m84233d(this, C26369o.class, new C26306ag(a));
            C47393f.m84233d(this, C25534q.class, new C26307ah(a));
            C47393f.m84233d(this, C25512ar.class, new C26308ai(a));
            C47393f.m84233d(this, C26368n.class, new C26309aj(a));
            C47393f.m84233d(this, C26365k.class, new C26310ak(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26421h.m48711a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f71908d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f71908d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f71908d;
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
        C47515ab abVar = this.f71908d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f71908d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f71908d;
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
        C26422i iVar;
        this.f71908d.mo51381i();
        try {
            if (!this.f71909e) {
                super.onAttach(context);
                if (this.f71905a == null) {
                    try {
                        Object jN = mo31521d().mo17653jN();
                        Executor executor = (Executor) ((C74176nj) jN).f206677a.lL.mo17428b();
                        AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                        Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                        if (fragment instanceof C26422i) {
                            C26422i iVar2 = (C26422i) fragment;
                            C68225k.m98532d(iVar2);
                            C73958bn bnVar = ((C74176nj) jN).f206836d;
                            C69464a aVar = bnVar.f205391d;
                            C69464a aVar2 = ((C74176nj) jN).f206889e;
                            aqy aqy = ((C74176nj) jN).f206677a;
                            C69464a aVar3 = aqy.i;
                            C69464a aVar4 = ((C74176nj) jN).f206781by;
                            C69464a aVar5 = aqy.gH;
                            asp asp = aqy.a;
                            C69464a aVar6 = asp.f202879fR;
                            C69464a aVar7 = ((C74176nj) jN).f206782bz;
                            C69464a aVar8 = aqy.b.f200191et;
                            C69464a aVar9 = bnVar.f205219N;
                            C26422i iVar3 = iVar2;
                            C69464a aVar10 = asp.f202880fS;
                            AccountId accountId2 = accountId;
                            C69464a aVar11 = bnVar.f205220O;
                            Executor executor2 = executor;
                            C69464a aVar12 = ((C74176nj) jN).f206778bv;
                            anh anh = ((C74176nj) jN).f206730b;
                            C69464a aVar13 = aVar11;
                            C69464a aVar14 = anh.f198663m;
                            C69464a aVar15 = bnVar.f205441w;
                            C69464a aVar16 = anh.f198027a.f199555hI;
                            C69464a aVar17 = bnVar.f205261ac;
                            C69464a aVar18 = aVar8;
                            C69464a aVar19 = aVar9;
                            C69464a aVar20 = aVar10;
                            C69464a aVar21 = aVar15;
                            C69464a aVar22 = aVar17;
                            C26364j jVar = new C26364j(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar18, aVar19, aVar20, aVar13, aVar12, aVar14, aVar21, aVar16, aVar22, bnVar.f205268aj, ((C74176nj) jN).f206731bA, asp.f203105jf);
                            Object gC = ((C74176nj) jN).f206730b.f198027a.mo66989gC();
                            C26316aq aqVar = new C26316aq((C25504aj) ((C74176nj) jN).f206836d.f205220O.mo17428b(), (C28448r) ((C74176nj) jN).f206677a.b.f200191et.mo17428b(), (C25684e) ((C74176nj) jN).f206836d.f205219N.mo17428b(), (C25225bd) ((C74176nj) jN).f206677a.a.f203105jf.mo17428b());
                            C26398q qVar = (C26398q) gC;
                            C26299ac acVar = r4;
                            C26353ao aoVar = new C26353ao((C37215b) ((C74176nj) jN).f206730b.f198027a.f199167S.mo17428b(), (Executor) ((C74176nj) jN).f206677a.lB.mo17428b());
                            C26316aq aqVar2 = aqVar;
                            C26299ac acVar2 = new C26299ac(executor2, accountId2, iVar3, jVar, (C26393l) ((C74176nj) jN).f206836d.f205267ai.mo17428b(), (C25537t) ((C74176nj) jN).f206836d.f205273ao.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C24974a) ((C74176nj) jN).f206836d.f205261ac.mo17428b(), (C25752a) ((C74176nj) jN).f206836d.f205279au.mo17428b(), (C27481an) ((C74176nj) jN).f206836d.f205268aj.mo17428b(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199555hI.mo17428b()).booleanValue(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199557hK.mo17428b()).booleanValue(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199554hH.mo17428b()).booleanValue(), (C25504aj) ((C74176nj) jN).f206836d.f205220O.mo17428b(), qVar, (C25466f) ((C74176nj) jN).f206836d.f205224S.mo17428b(), aqVar2, aoVar, (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C26059ax) ((C74176nj) jN).f206836d.f205225T.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C25989d) ((C74176nj) jN).f206836d.f205212G.mo17428b(), (C27232l) ((C74176nj) jN).f206836d.f205441w.mo17428b(), (C25941f) ((C74176nj) jN).f206836d.f205284az.mo17428b(), (C25225bd) ((C74176nj) jN).f206677a.a.f203105jf.mo17428b());
                            iVar = this;
                            iVar.f71905a = acVar;
                            super.getLifecycle().mo5790b(new TracedFragmentLifecycle(iVar.f71908d, iVar.f71907c));
                        } else {
                            String obj = C26299ac.class.toString();
                            String valueOf = String.valueOf(fragment.getClass());
                            throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        C47831fm.m85019n();
                        throw th2;
                    }
                } else {
                    iVar = this;
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = iVar.f71908d;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            C47831fm.m85019n();
            throw th22;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}

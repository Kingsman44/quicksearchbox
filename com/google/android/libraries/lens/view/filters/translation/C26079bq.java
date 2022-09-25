package com.google.android.libraries.lens.view.filters.translation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import androidx.lifecycle.LiveData;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.translation.C26114cy;
import com.google.android.libraries.lens.view.filters.translation.onboardinglanguagemenu.OnboardingLanguageMenuFragmentPeer;
import com.google.android.libraries.lens.view.filters.translation.tooltip.C26223d;
import com.google.android.libraries.lens.view.flags.C26243ad;
import com.google.android.libraries.lens.view.p2067ak.C25222ba;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.p3505b.C44534d;
import com.google.android.material.p3505b.C44535e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.experiments.C46897i;
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
import com.google.apps.tiktok.tracing.C47754cs;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3709a.p3710a.C47691a;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3709a.p3710a.C47692b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import java.util.Locale;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.bq */
/* compiled from: PG */
public final class C26079bq extends C26228v implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C26104co f70886a;

    /* renamed from: b */
    private Context f70887b;

    /* renamed from: c */
    private final C2393x f70888c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f70889d = new C47515ab(this);

    /* renamed from: e */
    private boolean f70890e;

    @Deprecated
    public C26079bq() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo31279b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f70887b == null) {
            this.f70887b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f70887b;
    }

    /* renamed from: f */
    public final C26104co mo17754z() {
        C26104co coVar = this.f70886a;
        if (coVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f70890e) {
            return coVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f70889d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f70888c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f70889d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f70889d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C26104co f = mo17754z();
            C2391v viewLifecycleOwner = f.f70930m.getViewLifecycleOwner();
            f.f70920c.mo5704e(viewLifecycleOwner, new C26082bt(f));
            f.f70919b.mo5704e(viewLifecycleOwner, new C26096cg(f));
            f.f70925h.mo5704e(viewLifecycleOwner, new C26097ch(f));
            f.f70926i.mo5704e(viewLifecycleOwner, new C26098ci(f));
            LiveData liveData = f.f70921d;
            C47692b bVar = f.f70940w;
            C26077bo boVar = f.f70938u;
            Objects.requireNonNull(boVar);
            liveData.mo5704e(viewLifecycleOwner, new C47691a(bVar, new C26099cj(boVar), "downloadInfoLiveData"));
            LiveData liveData2 = f.f70922e;
            C47692b bVar2 = f.f70940w;
            C26077bo boVar2 = f.f70938u;
            Objects.requireNonNull(boVar2);
            liveData2.mo5704e(viewLifecycleOwner, new C47691a(bVar2, new C26100ck(boVar2), "noSpaceInfoLiveData"));
            LiveData liveData3 = f.f70923f;
            C47692b bVar3 = f.f70940w;
            C26077bo boVar3 = f.f70938u;
            Objects.requireNonNull(boVar3);
            liveData3.mo5704e(viewLifecycleOwner, new C47691a(bVar3, new C26101cl(boVar3), "removeInfoLiveData"));
            LiveData liveData4 = f.f70924g;
            C47692b bVar4 = f.f70940w;
            C26077bo boVar4 = f.f70938u;
            Objects.requireNonNull(boVar4);
            liveData4.mo5704e(viewLifecycleOwner, new C47691a(bVar4, new C26102cm(boVar4), "cancelInfoLiveData"));
            f.f70927j.mo5704e(viewLifecycleOwner, new C26103cn(f));
            f.f70928k.mo5704e(viewLifecycleOwner, new C26083bu(f));
            C25752a aVar = f.f70929l;
            C26114cy cyVar = f.f70918a;
            Objects.requireNonNull(cyVar);
            aVar.mo5704e(viewLifecycleOwner, new C26094ce(cyVar));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f70889d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f70889d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo17754z().f70934q.mo31315h();
    }

    public final void onCreate(Bundle bundle) {
        this.f70889d.mo51381i();
        try {
            super.onCreate(bundle);
            C26104co f = mo17754z();
            f.f70919b = f.f70932o.mo30903g();
            C26059ax axVar = f.f70933p;
            axVar.mo31256k();
            f.f70925h = axVar.f70827q;
            C26059ax axVar2 = f.f70933p;
            axVar2.mo31256k();
            f.f70926i = axVar2.f70826p;
            C26059ax axVar3 = f.f70933p;
            f.f70920c = axVar3.f70830t;
            f.f70921d = axVar3.f70832v;
            f.f70922e = axVar3.f70835y;
            f.f70923f = axVar3.f70833w;
            f.f70924g = axVar3.f70834x;
            C26120dc dcVar = f.f70934q;
            f.f70927j = dcVar.f70975a;
            f.f70928k = dcVar.f70976b;
            f.f70929l = dcVar.f70977c;
            if (!axVar3.f70796J) {
                axVar3.f70796J = true;
                C60870cx k = axVar3.f70819i.mo33438k();
                C26048am amVar = new C26048am(axVar3);
                C60856cj.m92911t(k, C47810es.m84974n(amVar), axVar3.f70818h);
            }
            f.f70933p.f70819i.mo33445r();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f70889d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f70889d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C26104co f = mo17754z();
            boolean b = C44534d.m78715b();
            if (b) {
                layoutInflater = LayoutInflater.from(C44534d.m78716c(new ContextThemeWrapper(layoutInflater.getContext(), 2132150715)));
            }
            boolean z = false;
            View inflate = layoutInflater.inflate(R.layout.lens_translate_filter_settings, viewGroup, false);
            C28306ab abVar = f.f70935r;
            C28313c a = abVar.f76990a.mo33805a(C28427h.m53115a(139741));
            a.mo33859g(C45954d.m82060a(f.f70941x.f69824a));
            abVar.mo33801b(inflate, a);
            boolean j = f.f70934q.mo31317j();
            f.f70918a = new C26114cy(inflate, f.f70937t);
            C26114cy cyVar = f.f70918a;
            boolean z2 = f.f70942y;
            Context context = layoutInflater.getContext();
            int i = 8;
            if (z2) {
                cyVar.f70965m = true;
                cyVar.f70957e.setVisibility(8);
                cyVar.f70959g.setVisibility(8);
                cyVar.f70958f.setVisibility(0);
                cyVar.f70960h.setVisibility(0);
                cyVar.f70956d.setPadding(cyVar.f70954b.getDimensionPixelSize(R.dimen.lens_translate_language_picker_chip_padding_horizontal_large), cyVar.f70954b.getDimensionPixelSize(R.dimen.lens_translate_language_picker_chip_padding_vertical_large), cyVar.f70954b.getDimensionPixelSize(R.dimen.lens_translate_language_picker_chip_padding_horizontal_large), cyVar.f70954b.getDimensionPixelSize(R.dimen.lens_translate_language_picker_chip_padding_vertical_large));
                cyVar.f70961i.setTextSize(0, cyVar.f70954b.getDimension(R.dimen.lens_translate_language_picker_chip_button_text_size_large));
            }
            ImageView imageView = cyVar.f70964l;
            if (true == j) {
                i = 0;
            }
            imageView.setVisibility(i);
            MaterialButton b2 = cyVar.mo31299b();
            MaterialButton c = cyVar.mo31300c();
            if (b) {
                ColorStateList valueOf = ColorStateList.valueOf(context.getColor(17170503));
                b2.mo47556m(valueOf);
                c.mo47556m(valueOf);
                ColorStateList valueOf2 = ColorStateList.valueOf(context.getColor(17170511));
                b2.setTextColor(valueOf2);
                if (b2.f115970c != valueOf2) {
                    b2.f115970c = valueOf2;
                    b2.mo47558o(false);
                }
                c.setTextColor(valueOf2);
            } else {
                int color = context.getColor(R.color.google_blue100);
                ColorStateList valueOf3 = ColorStateList.valueOf(color);
                b2.mo47556m(valueOf3);
                c.mo47556m(valueOf3);
                cyVar.f70961i.mo2367i(C26114cy.m48185a(color, context.getColor(R.color.lens_color_on_surface_variant)));
                cyVar.f70961i.mo2366h(C26114cy.m48185a(context.getColor(R.color.google_blue600), C44535e.m78719b(cyVar.f70961i, R.attr.colorSurface)));
            }
            cyVar.mo31304g(cyVar.mo31299b());
            cyVar.mo31299b().addOnLayoutChangeListener(new C26112cw(cyVar));
            f.f70935r.mo33801b(f.f70918a.mo31299b(), f.f70935r.f76990a.mo33805a(C28427h.m53115a(129928)));
            f.f70935r.mo33801b(f.f70918a.mo31300c(), f.f70935r.f76990a.mo33805a(C28427h.m53115a(129929)));
            if (j) {
                C28306ab abVar2 = f.f70935r;
                abVar2.mo33801b(f.f70918a.f70964l, abVar2.f76990a.mo33805a(C28427h.m53115a(141727)));
                C28306ab abVar3 = f.f70935r;
                abVar3.mo33801b(f.f70918a.f70961i, abVar3.f76990a.mo33805a(C28427h.m53115a(138304)));
            }
            f.f70918a.mo31299b().setOnClickListener(new C47591co(f.f70939v, "Click source", new C26084bv(f)));
            f.f70918a.mo31300c().setOnClickListener(new C47591co(f.f70939v, "Click target", new C26085bw(f)));
            if (j) {
                f.f70918a.f70961i.setOnCheckedChangeListener(new C47754cs(f.f70939v, new C26086bx(f), "Toggle show translation"));
                f.f70918a.f70964l.setOnClickListener(new C47591co(f.f70939v, "Click options caret", new C26087by(f)));
            }
            C26059ax axVar = f.f70933p;
            if (axVar.f70798L && Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage()) && !axVar.f70794H) {
                z = true;
            }
            if ((axVar.f70825o || axVar.f70824n) && z) {
                axVar.f70822l.mo19974a(C37194a.f98598dB);
            }
            if (axVar.f70824n && z) {
                C26059ax axVar2 = f.f70933p;
                axVar2.f70816f.f68662a.mo30363c(C25222ba.f68661a);
                axVar2.f70800N++;
                OnboardingLanguageMenuFragmentPeer.m48379a(f.f70931n).showNow(f.f70930m.getChildFragmentManager(), "LensTranslateOnboardingLanguageMenu");
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f70889d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f70889d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f70889d.mo51376d();
        try {
            super.onDetach();
            this.f70890e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f70889d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f70889d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f70889d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f70889d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f70889d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f70889d.mo51381i();
        try {
            super.onStart();
            C26104co f = mo17754z();
            f.mo31293e();
            C26116cz czVar = (C26116cz) f.f70926i.mo3842a();
            czVar.getClass();
            f.mo31294f(czVar.mo31308c());
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f70889d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f70889d.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C26104co f = mo17754z();
            C47393f.m84233d(this, C26223d.C26224a.class, new C26105cp(f));
            C47393f.m84233d(this, C26114cy.C26115a.class, new C26106cq(f));
            C47393f.m84233d(this, OnboardingLanguageMenuFragmentPeer.C26204b.class, new C26107cr(f));
            C47393f.m84233d(this, OnboardingLanguageMenuFragmentPeer.C26205c.class, new C26108cs(f));
            C47393f.m84233d(this, OnboardingLanguageMenuFragmentPeer.C26203a.class, new C26109ct(f));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26078bp.m48139a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f70889d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f70889d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f70889d;
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
        C47515ab abVar = this.f70889d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f70889d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f70889d;
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
        this.f70889d.mo51381i();
        try {
            if (!this.f70890e) {
                super.onAttach(context);
                if (this.f70886a == null) {
                    Object jN = mo31448a().mo17653jN();
                    C26243ad adVar = (C26243ad) ((C74176nj) jN).f206677a.a.f203100ja.mo17428b();
                    C26077bo boVar = new C26077bo((C26059ax) ((C74176nj) jN).f206836d.f205225T.mo17428b(), (C25537t) ((C74176nj) jN).f206836d.f205273ao.mo17428b(), (C26217r) ((C74176nj) jN).f206836d.f205216K.mo17428b(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a);
                    C47692b bVar = new C47692b((C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                    this.f70886a = new C26104co((Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (LensConnectivityManager) ((C74176nj) jN).f206836d.f205208C.mo17428b(), (C25225bd) ((C74176nj) jN).f206677a.a.f203105jf.mo17428b(), (C26059ax) ((C74176nj) jN).f206836d.f205225T.mo17428b(), (C26120dc) ((C74176nj) jN).f206836d.f205262ad.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C25684e) ((C74176nj) jN).f206836d.f205219N.mo17428b(), (C26217r) ((C74176nj) jN).f206836d.f205216K.mo17428b(), boVar, (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), bVar, ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo67018gf().f185310a.mo17428b()).mo50901a("com.google.android.apps.search.lens.user 45373591").mo50907f(), ((C74176nj) jN).f206730b.f198027a.mo67018gf().mo60917a());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f70889d, this.f70888c));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f70889d;
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
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C26078bp.m48139a(th2, th3);
            }
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}

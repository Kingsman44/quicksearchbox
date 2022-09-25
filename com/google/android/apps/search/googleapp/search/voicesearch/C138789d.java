package com.google.android.apps.search.googleapp.search.voicesearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.p10516t.p10520d.C139697a;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.search.p10410f.C137447w;
import com.google.android.apps.search.googleapp.search.voicesearch.C138859r;
import com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher.VoiceSearchLanguageSwitcherSpinner;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.LogoView;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138767d;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138772i;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a.C138880n;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.apps.search.googleapp.startup.p10514a.C139676e;
import com.google.android.apps.search.soundsearch.p10653b.C141639a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.protobuf.C62972cr;
import dagger.C68214a;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Locale;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.d */
/* compiled from: PG */
public final class C138789d extends C138707ak implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C138859r f377539a;

    /* renamed from: c */
    private Context f377540c;

    /* renamed from: d */
    private final C2393x f377541d = new C2393x(this);

    /* renamed from: e */
    private boolean f377542e;

    @Deprecated
    public C138789d() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C138859r mo17754z() {
        C138859r rVar = this.f377539a;
        if (rVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f377542e) {
            return rVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114484b() {
        return new C47242k(this);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        C138859r a = mo17754z();
        printWriter.println(String.valueOf(str).concat("google_app_search"));
        Stream map = DesugarArrays.stream((T[]) a.f377711m.mo113742c().mo50688b().mo59170I(C62972cr.f170009a).split("\n")).map(new C138798h(str));
        Objects.requireNonNull(printWriter);
        map.forEach(new C138799i(printWriter));
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f377540c == null) {
            this.f377540c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f377540c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f377541d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138721c.m225315a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C47558bi a;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C138859r a2 = mo17754z();
            a = C47831fm.m85006a("RecordAudioFragmentPeer#onCreateView");
            View inflate = layoutInflater.inflate(R.layout.googleapp_record_audio_screen, viewGroup, false);
            inflate.getClass();
            inflate.findViewById(R.id.googleapp_voice_search_plate).setOnClickListener(new C47591co(a2.f377714p, "tapped voice plate", new C138800j(a2)));
            C2043bi.m5555ai(inflate, new C138801k(a2, inflate));
            View findViewById = inflate.findViewById(R.id.googleapp_search_a_song);
            findViewById.setOnClickListener(new C47591co(a2.f377714p, "click the sound search button", new C138802l(a2)));
            C28306ab abVar = a2.f377715q;
            abVar.mo33801b(findViewById, abVar.f76990a.mo33805a(C28427h.m53115a(125789)));
            LogoView logoView = (LogoView) inflate.findViewById(R.id.googleapp_logo_view);
            boolean z = a2.f377721w;
            logoView.f377577e = z;
            logoView.mo114546c(z);
            logoView.mo114547d(54.0f, 54.0f);
            C28306ab abVar2 = a2.f377715q;
            abVar2.mo33801b(logoView, abVar2.f76990a.mo33805a(C28427h.m53115a(96087)));
            logoView.f377574b = new C138913u(a2);
            logoView.setOnClickListener(new C47591co(a2.f377714p, "tapped logo view", new C138854m(a2)));
            a2.f377713o.mo50707a(a2.f377717s.mo114523b(), new C138859r.C138862a());
            a2.f377705g.mo115161a(a2.f377709k, inflate, new C138855n(a2));
            if (a2.f377723y) {
                C138859r.m225589c((ConstraintLayout) inflate);
                a2.f377713o.mo50707a(new C46719bc(a2.f377704f, new C138856o(a2), "voice_language_settings_key"), a2.f377696E);
                if (a2.f377720v) {
                    a2.f377713o.mo50707a(new C46719bc(a2.f377704f, new C138857p(a2), "is_auto_switch_enabled_key"), a2.f377697F);
                }
                a2.f377703e.mo115167b(new C138796f(a2));
                a2.f377715q.mo33801b(inflate.findViewById(R.id.googleapp_voice_search_language_switcher), a2.f377715q.f76990a.mo33805a(C28427h.m53115a(147034)));
            }
            a.close();
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C138721c.m225315a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f377542e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C138721c.m225315a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C138721c.m225315a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C138859r a = mo17754z();
            if (!a.f377717s.mo114525d()) {
                if (!((PowerManager) a.f377709k.requireContext().getSystemService("power")).isInteractive()) {
                    a.mo114608i(5);
                } else if (!a.f377709k.getActivity().isChangingConfigurations()) {
                    a.mo114608i(3);
                }
                if (a.f377723y && a.mo114603a() != null && !a.f377709k.getActivity().isChangingConfigurations()) {
                    VoiceSearchLanguageSwitcherSpinner a2 = a.mo114603a();
                    if (a2.f377556e) {
                        a2.f377556e = false;
                        a2.onDetachedFromWindow();
                    }
                }
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138721c.m225315a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.google.android.apps.search.googleapp.search.voicesearch.b.c, java.lang.Object] */
    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f377542e) {
                super.onAttach(context);
                if (this.f377539a == null) {
                    Object jN = mo114485d().mo17653jN();
                    C89859i iVar = (C89859i) ((C74176nj) jN).f206677a.c.f201254bi.mo17428b();
                    boolean f = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45353443").mo50907f();
                    boolean kA = ((C74176nj) jN).f206730b.f198027a.mo67087kA();
                    boolean lO = ((C74176nj) jN).f206730b.f198027a.mo67154lO();
                    boolean lP = ((C74176nj) jN).f206730b.f198027a.mo67155lP();
                    boolean kB = ((C74176nj) jN).f206730b.f198027a.mo67088kB();
                    C38802e a = C139697a.m227129a(((C74176nj) jN).f206730b.f198027a.mo66885eE());
                    ? bJ = ((C74176nj) jN).f206677a.d.mo67760bJ();
                    C139680b bVar = (C139680b) ((C74176nj) jN).f206836d.f205429k.mo17428b();
                    C139684f eb = ((C74176nj) jN).mo69691eb();
                    C46723bg bgVar = (C46723bg) ((C74176nj) jN).f206677a.ap.mo17428b();
                    C139676e eVar = (C139676e) ((C74176nj) jN).f206836d.f205434p.mo17428b();
                    C141639a eC = ((C74176nj) jN).mo69666eC();
                    C28443m mVar = (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b();
                    C68214a a2 = C68219e.m98518a(((C74176nj) jN).f206677a.b.f200016bd);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C138789d) {
                        C138789d dVar = (C138789d) fragment;
                        C68225k.m98532d(dVar);
                        this.f377539a = new C138859r(true, iVar, f, kA, lO, lP, kB, a, bJ, bVar, eb, bgVar, eVar, eC, mVar, a2, dVar, (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), (C137447w) ((C74176nj) jN).f206730b.f198027a.f199478fl.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C138767d) ((C74176nj) jN).f206730b.f198027a.f199545gz.mo17428b(), (C138772i) ((C74176nj) jN).f206730b.f198027a.f199544gy.mo17428b(), (C139708c) ((C74176nj) jN).f206730b.f198027a.f199482fp.mo17428b(), (C138880n) ((C74176nj) jN).f206730b.f198027a.f199283cB.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f377541d));
                    } else {
                        String obj = C138859r.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
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
                C138721c.m225315a(th2, th3);
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

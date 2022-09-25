package com.google.android.apps.search.googleapp.search.voicesearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.search.p10410f.C137447w;
import com.google.android.apps.search.googleapp.search.srp.C137886r;
import com.google.android.apps.search.googleapp.search.srp.C137889t;
import com.google.android.apps.search.googleapp.search.srp.C137890u;
import com.google.android.apps.search.googleapp.search.voicesearch.C138705aj;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.LogoView;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138728b;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138767d;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138772i;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.apps.search.googleapp.startup.p10514a.C139676e;
import com.google.android.apps.search.soundsearch.p10653b.C141639a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Locale;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.x */
/* compiled from: PG */
public final class C138916x extends C138708al implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C138705aj f377847a;

    /* renamed from: c */
    private Context f377848c;

    /* renamed from: d */
    private final C2393x f377849d = new C2393x(this);

    /* renamed from: e */
    private boolean f377850e;

    @Deprecated
    public C138916x() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C138705aj mo17754z() {
        C138705aj ajVar = this.f377847a;
        if (ajVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f377850e) {
            return ajVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114487b() {
        return new C47242k(this);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        C138705aj a = mo17754z();
        printWriter.println(String.valueOf(str).concat("google_app_search"));
        Stream map = DesugarArrays.stream((T[]) a.f377246k.mo113742c().mo50688b().mo59170I(C62972cr.f170009a).split("\n")).map(new C138918z(str));
        Objects.requireNonNull(printWriter);
        map.forEach(new C138696aa(printWriter));
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f377848c == null) {
            this.f377848c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f377848c;
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
        return this.f377849d;
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
            C138915w.m225744a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C47558bi a;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C138705aj a2 = mo17754z();
            C47558bi a3 = C47831fm.m85006a("SearchBoxTranscriptionFragmentPeer#onCreateView");
            try {
                View inflate = layoutInflater.inflate(R.layout.googleapp_search_box_transcription_screen, viewGroup, false);
                inflate.getClass();
                inflate.findViewById(R.id.googleapp_sbt_voice_search_plate).setOnClickListener(new C47591co(a2.f377248m, "tapped voice plate", new C138697ab(a2)));
                C2043bi.m5555ai(inflate, new C138698ac(inflate));
                View findViewById = inflate.findViewById(R.id.googleapp_search_a_song);
                findViewById.setOnClickListener(new C47591co(a2.f377248m, "click the sound search button", new C138699ad(a2)));
                C28306ab abVar = a2.f377250o;
                abVar.mo33801b(findViewById, abVar.f76990a.mo33805a(C28427h.m53115a(125789)));
                LogoView logoView = (LogoView) inflate.findViewById(R.id.googleapp_logo_view);
                boolean z = a2.f377254s;
                logoView.f377577e = z;
                logoView.mo114546c(z);
                logoView.mo114547d(54.0f, 54.0f);
                C28306ab abVar2 = a2.f377250o;
                abVar2.mo33801b(logoView, abVar2.f76990a.mo33805a(C28427h.m53115a(96087)));
                logoView.f377574b = new C138704ai(a2);
                logoView.setOnClickListener(new C47591co(a2.f377248m, "tapped logo view", new C138700ae(a2)));
                if (a2.f377245j.getChildFragmentManager().f634a.mo670b(R.id.googleapp_voice_header_container) == null) {
                    a = C47831fm.m85006a("SearchBoxTranscriptionFragmentPeer#attachHeaderFragment");
                    C137889t tVar = (C137889t) C137890u.f375180d.createBuilder();
                    tVar.copyOnWrite();
                    C137890u uVar = (C137890u) tVar.instance;
                    uVar.f375182a |= 1;
                    uVar.f375183b = true;
                    String string = a2.f377239d.getResources().getString(R.string.listening_text);
                    tVar.copyOnWrite();
                    C137890u uVar2 = (C137890u) tVar.instance;
                    string.getClass();
                    uVar2.f375182a |= 2;
                    uVar2.f375184c = string;
                    C0154a aVar = new C0154a(a2.f377245j.getChildFragmentManager());
                    aVar.mo511h(R.id.googleapp_voice_header_container, C137886r.m224179a(a2.f377237b, (C137890u) tVar.build()), "VOICE_HEADER_FRAGMENT", 1);
                    aVar.mo509f();
                    a.close();
                }
                a2.f377247l.mo50707a(a2.f377252q.mo114523b(), new C138705aj.C138706a());
                a2.f377241f.mo115161a(a2.f377245j, inflate, new C138701af(a2));
                a3.close();
                C47831fm.m85019n();
                return inflate;
            } catch (Throwable th) {
                a3.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C138915w.m225744a(th2, th3);
            }
            throw th2;
        }
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f377850e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C138915w.m225744a(th, th);
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
            C138915w.m225744a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C138705aj a = mo17754z();
            if (!a.f377252q.mo114525d()) {
                if (!a.f377244i.isInteractive()) {
                    a.mo114482h(5);
                } else if (!a.f377245j.getActivity().isChangingConfigurations()) {
                    a.mo114482h(3);
                }
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138915w.m225744a(th, th);
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

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f377850e) {
                super.onAttach(context);
                if (this.f377847a == null) {
                    Object jN = mo114488d().mo17653jN();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    C89859i iVar = (C89859i) ((C74176nj) jN).f206677a.c.f201254bi.mo17428b();
                    boolean kA = ((C74176nj) jN).f206730b.f198027a.mo67087kA();
                    boolean kB = ((C74176nj) jN).f206730b.f198027a.mo67088kB();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C139680b bVar = (C139680b) ((C74176nj) jN).f206836d.f205429k.mo17428b();
                    C139676e eVar = (C139676e) ((C74176nj) jN).f206836d.f205434p.mo17428b();
                    C141639a eC = ((C74176nj) jN).mo69666eC();
                    C28443m mVar = (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b();
                    PowerManager powerManager = (PowerManager) ((C74176nj) jN).f206677a.ae.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C138916x) {
                        C138916x xVar = (C138916x) fragment;
                        C68225k.m98532d(xVar);
                        this.f377847a = new C138705aj(context2, true, iVar, kA, kB, accountId, bVar, eVar, eC, mVar, powerManager, xVar, (C137447w) ((C74176nj) jN).f206730b.f198027a.f199478fl.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C138728b) ((C74176nj) jN).f206677a.d.f201629ci.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C138767d) ((C74176nj) jN).f206730b.f198027a.f199545gz.mo17428b(), (C138772i) ((C74176nj) jN).f206730b.f198027a.f199544gy.mo17428b(), (C139708c) ((C74176nj) jN).f206730b.f198027a.f199482fp.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f377849d));
                    } else {
                        String obj = C138705aj.class.toString();
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
                C138915w.m225744a(th2, th3);
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

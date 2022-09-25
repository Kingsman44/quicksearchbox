package com.google.android.apps.gsa.staticplugins.opa.appactions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.shared.appactions.ShortcutConfirmationLayout;
import com.google.android.apps.gsa.assistant.shared.appactions.n;
import com.google.android.apps.gsa.assistant.shared.appactions.o;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107275f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
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
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.be */
/* compiled from: PG */
public final class C107266be extends C107253av implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C107268bg f298556a;

    /* renamed from: c */
    private Context f298557c;

    /* renamed from: d */
    private final C2393x f298558d = new C2393x(this);

    /* renamed from: e */
    private boolean f298559e;

    @Deprecated
    public C107266be() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo95880b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f298557c == null) {
            this.f298557c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f298557c;
    }

    /* renamed from: f */
    public final C107268bg mo17754z() {
        C107268bg bgVar = this.f298556a;
        if (bgVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f298559e) {
            return bgVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
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
        return this.f298558d;
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
            C107265bd.m178080a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C107268bg f = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.fragment_shortcut_confirmation, viewGroup, false);
            f.f298564d.f76997b.mo33800a(C28427h.m53115a(105507)).mo33809b(inflate);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C107265bd.m178080a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f298559e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C107265bd.m178080a(th, th);
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
            C107265bd.m178080a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C107268bg f = mo17754z();
            n d = o.d();
            d.b(f.f298562b.f298585b);
            d.c(true);
            ((ShortcutConfirmationLayout) view.findViewById(R.id.shortcut_confirmation_layout)).mo65284a(new C107267bf(f), d.a());
            if (f.f298562b.f298586c) {
                f.f298563c.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_CONFIRMATION_PAGE_LOADED);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C107265bd.m178080a(th, th);
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
            if (!this.f298559e) {
                super.onAttach(context);
                if (this.f298556a == null) {
                    Object jN = mo95879a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C107266be) {
                        C107266be beVar = (C107266be) fragment;
                        C68225k.m98532d(beVar);
                        Bundle a = ((C74178nm) jN).mo70044a();
                        C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C107275f fVar = (C107275f) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C107275f.f298582d, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                        C68225k.m98532d(fVar);
                        this.f298556a = new C107268bg(beVar, fVar, (C73812a) ((C74178nm) jN).f207130a.b.f200258gG.mo17428b(), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b(), (C28443m) ((C74178nm) jN).f207130a.a.f202879fR.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f298558d));
                    } else {
                        String obj = C107268bg.class.toString();
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
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C107265bd.m178080a(th, th2);
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

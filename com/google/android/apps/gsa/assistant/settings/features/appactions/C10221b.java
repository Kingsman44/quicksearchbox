package com.google.android.apps.gsa.assistant.settings.features.appactions;

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
import com.google.android.apps.gsa.assistant.settings.base.C9511m;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10186a;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10189d;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10191f;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10194i;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10257b;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10264i;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10266k;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10267l;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10277v;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p568d.C10309a;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p568d.C10310b;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p568d.C10311c;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
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
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.b */
/* compiled from: PG */
public final class C10221b extends C10283cb implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C10308d f34692a;

    /* renamed from: c */
    private Context f34693c;

    /* renamed from: d */
    private final C2393x f34694d = new C2393x(this);

    /* renamed from: e */
    private boolean f34695e;

    @Deprecated
    public C10221b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C10308d mo17754z() {
        C10308d dVar = this.f34692a;
        if (dVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f34695e) {
            return dVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18351b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f34693c == null) {
            this.f34693c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f34693c;
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
        return this.f34694d;
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
            C10185a.m25059a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C10308d a = mo17754z();
            if (bundle == null) {
                a.f34925d.mo65297d();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10185a.m25059a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C10277v vVar;
        C10267l lVar;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C10308d a = mo17754z();
            int i = 0;
            View inflate = layoutInflater.inflate(R.layout.app_actions_settings, viewGroup, false);
            if (a.f34926e.mo79746e(C90019by.f248074h)) {
                C10311c cVar = a.f34924c;
                cVar.f34932d = Optional.m71637of(cVar.f34930b.mo28205e(C90877ak.m148471e(cVar.f34930b.mo28201a("Fetch app usage", new C10309a(cVar)), 5, TimeUnit.SECONDS, cVar.f34931c), "Fetch app usage catching timeout", TimeoutException.class, C10310b.f34928a));
            }
            if (bundle == null) {
                C10257b bVar = a.f34923b;
                int i2 = bVar.f34778a;
                if (i2 == 0) {
                    i = 3;
                } else if (i2 == 1) {
                    i = 1;
                } else if (i2 == 2) {
                    i = 2;
                }
                int i3 = i - 1;
                if (i == 0) {
                    throw null;
                } else if (i3 != 0) {
                    if (i3 != 1) {
                        C10264i iVar = (C10264i) C10267l.f34802e.createBuilder();
                        C10266k kVar = C10266k.MAIN_PAGE;
                        iVar.copyOnWrite();
                        C10267l lVar2 = (C10267l) iVar.instance;
                        lVar2.f34807d = kVar.f34801d;
                        lVar2.f34804a |= 1;
                        lVar = (C10267l) iVar.build();
                    } else if (i2 == 2) {
                        lVar = (C10267l) bVar.f34779b;
                    } else {
                        lVar = C10267l.f34802e;
                    }
                    a.mo18406c(lVar);
                } else {
                    if (i2 == 1) {
                        vVar = (C10277v) bVar.f34779b;
                    } else {
                        vVar = C10277v.f34824h;
                    }
                    a.mo18407e(vVar);
                }
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C10185a.m25059a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            mo17754z().f34925d.mo65294a(C89849ae.APP_ACTIONS_SETTINGS_ABORT);
            b.close();
            return;
        } catch (Throwable th) {
            C10185a.m25059a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f34695e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C10185a.m25059a(th, th);
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
            C10185a.m25059a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            ((C9511m) mo17754z().f34922a.getActivity()).mo17822A();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10185a.m25059a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            mo17754z().mo18404a();
            e.close();
            return;
        } catch (Throwable th) {
            C10185a.m25059a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C10308d a = mo17754z();
            C47393f.m84233d(this, C10186a.class, new C10374e(a));
            C47393f.m84233d(this, C10194i.class, new C10377f(a));
            C47393f.m84233d(this, C10189d.class, new C10409g(a));
            C47393f.m84233d(this, C10191f.class, new C10410h(a));
            C47393f.m84233d(this, C10416n.class, new C10411i(a));
            this.f54442o.mo24720k(bundle);
            mo17754z().mo18404a();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10185a.m25059a(th, th);
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
            if (!this.f34695e) {
                super.onAttach(context);
                if (this.f34692a == null) {
                    Object jN = mo18374d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C10221b) {
                        C10221b bVar = (C10221b) fragment;
                        C68225k.m98532d(bVar);
                        Bundle a = ((C74178nm) jN).mo70044a();
                        C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C10257b bVar2 = (C10257b) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C10257b.f34776c, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                        C68225k.m98532d(bVar2);
                        this.f34692a = new C10308d(bVar, (C10311c) ((C74178nm) jN).f207136c.f205575bX.mo17428b(), (C73812a) ((C74178nm) jN).f207130a.b.f200258gG.mo17428b(), (C90021c) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), bVar2);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f34694d));
                    } else {
                        String obj = C10308d.class.toString();
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
                C10185a.m25059a(th, th2);
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

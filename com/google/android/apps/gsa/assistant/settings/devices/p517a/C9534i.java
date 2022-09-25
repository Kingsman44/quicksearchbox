package com.google.android.apps.gsa.assistant.settings.devices.p517a;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.binaries.satin.app.C73964bv;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.home.p1958f.p1960b.p1961a.C23812a;
import com.google.android.libraries.home.p1958f.p1960b.p1961a.C23813b;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
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
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.a.i */
/* compiled from: PG */
public final class C9534i extends C9530e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C9535j f33046a;

    /* renamed from: c */
    private Context f33047c;

    /* renamed from: d */
    private final C2393x f33048d = new C2393x(this);

    /* renamed from: e */
    private boolean f33049e;

    @Deprecated
    public C9534i() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo17855b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f33047c == null) {
            this.f33047c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f33047c;
    }

    /* renamed from: f */
    public final C9535j mo17754z() {
        C9535j jVar = this.f33046a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f33049e) {
            return jVar;
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
        return this.f33048d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C0167am activity;
        C47573bx a = this.f122869b.mo51373a("Fragment:onActivityResult");
        try {
            mo51110k(i, i2, intent);
            C9535j f = mo17754z();
            if (i == 224 && (activity = f.f33050a.getActivity()) != null) {
                activity.finish();
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C9533h.m24179a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C9533h.m24179a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        Intent intent;
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C9535j f = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            C9532g gVar = f.f33051b;
            String str = gVar.f33045c;
            if (gVar.f33044b == 20) {
                intent = C23813b.m44343a(f.f33050a.getActivity(), C23812a.f65228a.buildUpon().appendQueryParameter("hgs_device_id", str).build(), f.f33053d.mo17848a());
            } else {
                C0167am activity = f.f33050a.getActivity();
                Account a = f.f33052c.a();
                a.getClass();
                String str2 = a.name;
                intent = C23813b.m44343a(activity, C23812a.f65229b.buildUpon().appendPath("deviceSettings").appendQueryParameter("userEmail", str2).appendQueryParameter("castAgentDeviceId", str).build(), f.f33053d.mo17848a());
            }
            f.f33050a.startActivityForResult(intent, 224);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C9533h.m24179a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C9535j f = mo17754z();
            FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
            C28295m.m52919e(frameLayout, new C28292j(f.f33053d.mo17849b()));
            C89949q.m146521e(C28285c.m52874a(frameLayout, 61687), false);
            C47831fm.m85019n();
            return frameLayout;
        } catch (Throwable th) {
            C9533h.m24179a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f33049e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C9533h.m24179a(th, th);
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
            C9533h.m24179a(th, th);
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
            if (!this.f33049e) {
                super.onAttach(context);
                if (this.f33046a == null) {
                    Object jN = mo17854a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C9534i) {
                        C9534i iVar = (C9534i) fragment;
                        C68225k.m98532d(iVar);
                        Bundle a = ((C74178nm) jN).mo70044a();
                        C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C9532g gVar = (C9532g) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C9532g.f33041d, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                        C68225k.m98532d(gVar);
                        int i = C23813b.f65230a;
                        this.f33046a = new C9535j(iVar, gVar, (h) ((C74178nm) jN).f207130a.a.f202853es.mo17428b(), C73964bv.m118206fX());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f33048d));
                    } else {
                        String obj = C9535j.class.toString();
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
                C9533h.m24179a(th, th2);
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

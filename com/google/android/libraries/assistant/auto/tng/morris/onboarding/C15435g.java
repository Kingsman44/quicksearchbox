package com.google.android.libraries.assistant.auto.tng.morris.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.googlequicksearchbox.R;
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
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.onboarding.g */
/* compiled from: PG */
public final class C15435g extends C15451w implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C15438j f46295a;

    /* renamed from: c */
    private Context f46296c;

    /* renamed from: d */
    private final C2393x f46297d = new C2393x(this);

    /* renamed from: e */
    private boolean f46298e;

    @Deprecated
    public C15435g() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C15435g m32132a() {
        C15435g gVar = new C15435g();
        C68324h.m98669f(gVar);
        return gVar;
    }

    /* renamed from: b */
    public final C15438j mo17754z() {
        C15438j jVar = this.f46295a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f46298e) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo22322d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f46296c == null) {
            this.f46296c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f46296c;
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
        return this.f46297d;
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
            C15434f.m32131a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C15438j b = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            View inflate = layoutInflater.inflate(R.layout.morris_app_launcher_fragment, viewGroup, false);
            Button button = (Button) inflate.findViewById(R.id.next_button);
            b.f46303a.mo51253b(button, new C15436h(b, button));
            Button button2 = (Button) inflate.findViewById(R.id.clear_icon);
            b.f46303a.mo51253b(button2, new C15437i(b, button2));
            b.f46305c.mo21444a(inflate, 111978);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C15434f.m32131a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f46298e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C15434f.m32131a(th, th);
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
            C15434f.m32131a(th, th);
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
            if (!this.f46298e) {
                super.onAttach(context);
                if (this.f46295a == null) {
                    Object jN = mo22338f().mo17653jN();
                    this.f46295a = new C15438j((C47400m) ((C74178nm) jN).f207130a.d.f201806g.mo17428b(), (C28443m) ((C74178nm) jN).f207130a.a.f202879fR.mo17428b(), ((C74178nm) jN).f207130a.a.mo68330fc());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f46297d));
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
                C15434f.m32131a(th, th2);
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

package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136451d;
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

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.a.g */
/* compiled from: PG */
public final class C136504g extends C136497ae implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136508k f371617a;

    /* renamed from: c */
    private Context f371618c;

    /* renamed from: d */
    private final C2393x f371619d = new C2393x(this);

    /* renamed from: e */
    private boolean f371620e;

    @Deprecated
    public C136504g() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C136508k mo17754z() {
        C136508k kVar = this.f371617a;
        if (kVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f371620e) {
            return kVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo113093b() {
        return C47244m.m84042d(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f371618c == null) {
            this.f371618c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f371618c;
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
        return this.f371619d;
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
            C136503f.m221828a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C136508k a = mo17754z();
            a.f371635l = a.f371627d.f371754b;
            if (bundle != null) {
                a.f371635l = bundle.getBoolean("open_panel_on_create", false);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136503f.m221828a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C136508k a = mo17754z();
            a.f371628e.mo113057a(String.format(Locale.US, "onCreateView: slidingFragmentArgs: openPanelOnCreate = %s", new Object[]{Boolean.valueOf(a.f371635l)}));
            View inflate = layoutInflater.inflate(R.layout.googleapp_sliding_fragment, viewGroup, false);
            C136512o oVar = new C136512o(a.f371626c);
            C136521x a2 = oVar.mo17754z();
            a2.mo113141i(a2.f371671h);
            C136521x a3 = oVar.mo17754z();
            a3.f371685v.mo113057a("setPanelContent");
            a3.f371668e = inflate;
            a3.f371667d.addView(a3.f371668e);
            oVar.mo17754z().mo113151s(new C136507j(a));
            if (a.f371635l) {
                oVar.mo17754z().mo113152t();
            }
            C136492a aVar = new C136492a(a.f371626c);
            C136499b a4 = aVar.mo17754z();
            C136451d dVar = a.f371627d.f371755c;
            if (dVar == null) {
                dVar = C136451d.f371493e;
            }
            a4.f371611b = dVar.f371498d;
            a.mo113105d(aVar.mo17754z());
            C136521x a5 = oVar.mo17754z();
            View view = a5.f371669f;
            if (view != null) {
                a5.f371667d.removeView(view);
            }
            a5.f371669f = aVar;
            a5.f371667d.addView(a5.f371669f, 0);
            Window window = a.f371631h;
            if (window != null) {
                window.getDecorView().addOnLayoutChangeListener(new C136506i(a));
            }
            C47831fm.m85019n();
            return oVar;
        } catch (Throwable th) {
            C136503f.m221828a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C136512o c2 = mo17754z().mo113104c();
            if (c2 != null) {
                c2.mo17754z().mo113151s((C136507j) null);
            }
            c.close();
            return;
        } catch (Throwable th) {
            C136503f.m221828a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f371620e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136503f.m221828a(th, th);
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
            C136503f.m221828a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            bundle.putBoolean("open_panel_on_create", mo17754z().mo113109h());
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136503f.m221828a(th, th);
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
            if (!this.f371620e) {
                super.onAttach(context);
                if (this.f371617a == null) {
                    this.f371617a = ((C136509l) mo113094d().mo17653jN()).mo113112L();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f371619d));
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
                C136503f.m221828a(th, th2);
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

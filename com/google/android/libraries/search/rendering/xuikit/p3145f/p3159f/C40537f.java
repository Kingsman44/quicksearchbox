package com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f;

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
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.C21196h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40058w;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3142k.C40458b;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3151e.C40503c;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3151e.C40504d;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3151e.C40506f;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40541j;
import com.google.android.libraries.search.video.p3191a.C41450i;
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
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4317v.C56829f;
import dagger.hilt.p5299a.C68288b;
import java.util.List;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.f.f */
/* compiled from: PG */
public final class C40537f extends C40533b implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C40541j f106392a;

    /* renamed from: c */
    private Context f106393c;

    /* renamed from: d */
    private final C2393x f106394d = new C2393x(this);

    /* renamed from: e */
    private boolean f106395e;

    @Deprecated
    public C40537f() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo42491b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f106393c == null) {
            this.f106393c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f106393c;
    }

    /* renamed from: f */
    public final C40541j mo17754z() {
        C40541j jVar = this.f106392a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f106395e) {
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
        return this.f106394d;
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
            C40536e.m70261a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C40541j f = mo17754z();
            f.f106407j.mo32554n().mo42409a();
            C40458b p = f.f106407j.mo32555p();
            List<String> list = C40541j.f106399b;
            C58480gp f2 = C58485gu.m89838f(list.size());
            for (String c : list) {
                f2.mo55395g(p.mo42456c(c));
            }
            f2.mo55394f();
            f.f106408k.mo43980a(C41450i.f108261a);
            C40506f fVar = f.f106403f;
            C19559g.m37304c();
            fVar.f106273b.mo44350b(C56829f.class, new C40503c(fVar));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C40536e.m70261a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C40541j f = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            f.f106407j.mo32553l();
            C21196h hVar = new C21196h(f.f106401d.getContext(), f.f106407j.mo32548g().mo26713a());
            hVar.setId(R.id.xblend_fragment_elements_view);
            f.f106402e.mo50707a(C40535d.m70260b(f.f106401d).mo42316e(), new C40541j.C40542a(hVar));
            C47831fm.m85019n();
            return hVar;
        } catch (Throwable th) {
            C40536e.m70261a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C40541j f = mo17754z();
            C21196h hVar = (C21196h) f.f106401d.requireView().findViewById(R.id.xblend_fragment_elements_view);
            if (hVar != null) {
                hVar.mo26215b((byte[]) null);
            }
            C40058w wVar = f.f106406i;
            if (wVar != null) {
                wVar.mo42158f();
            }
            C40506f fVar = f.f106403f;
            fVar.f106274c.execute(C47810es.m84977q(new C40504d(fVar)));
            c.close();
            return;
        } catch (Throwable th) {
            C40536e.m70261a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f106395e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C40536e.m70261a(th, th);
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
            C40536e.m70261a(th, th);
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
            if (!this.f106395e) {
                super.onAttach(context);
                if (this.f106392a == null) {
                    this.f106392a = ((C40545m) mo42490a().mo17653jN()).mo42498fg();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f106394d));
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
                C40536e.m70261a(th, th2);
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

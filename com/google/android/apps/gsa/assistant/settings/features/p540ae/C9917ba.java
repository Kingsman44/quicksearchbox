package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.assistant.settings.shared.ui.PageDescriptionView;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3861at.C50268qu;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58370cn;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.text.Collator;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.ba */
/* compiled from: PG */
public final class C9917ba extends C9960e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C9920bd f34013a;

    /* renamed from: c */
    private Context f34014c;

    /* renamed from: d */
    private final C2393x f34015d = new C2393x(this);

    /* renamed from: e */
    private boolean f34016e;

    @Deprecated
    public C9917ba() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18119b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f34014c == null) {
            this.f34014c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f34014c;
    }

    /* renamed from: f */
    public final C9920bd mo17754z() {
        C9920bd bdVar = this.f34013a;
        if (bdVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f34016e) {
            return bdVar;
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
        return this.f34015d;
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
            C9913az.m24675a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C73778a.m108339b(mo17754z().f34019a);
            View inflate = layoutInflater.inflate(R.layout.main_page_subsection, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C9913az.m24675a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f34016e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C9913az.m24675a(th, th);
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
            C9913az.m24675a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C9920bd f = mo17754z();
            PageDescriptionView findViewById = view.findViewById(R.id.page_description);
            findViewById.f(f.f34020b.f130723b);
            findViewById.d(f.f34020b.f130724c);
            ((RecyclerView) view.findViewById(R.id.recycler_view)).setAdapter(f.f34021c);
            f.f34021c.mo50772a((List) Collection.EL.stream(f.f34020b.f130725d).sorted(Comparator.CC.comparing(C9918bb.f34017a, Collator.getInstance())).collect(C58370cn.f155946a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C9913az.m24675a(th, th);
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
            if (!this.f34016e) {
                super.onAttach(context);
                if (this.f34013a == null) {
                    Object jN = mo18158a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C9917ba) {
                        C9917ba baVar = (C9917ba) fragment;
                        C68225k.m98532d(baVar);
                        Bundle a = ((C74178nm) jN).mo70044a();
                        C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C50268qu quVar = (C50268qu) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C50268qu.f130720e, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                        C68225k.m98532d(quVar);
                        this.f34013a = new C9920bd(baVar, quVar, (C9912ay) ((C74178nm) jN).mo70042Y());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f34015d));
                    } else {
                        String obj = C9920bd.class.toString();
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
                C9913az.m24675a(th, th2);
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

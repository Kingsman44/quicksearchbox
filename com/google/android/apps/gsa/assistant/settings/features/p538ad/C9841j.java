package com.google.android.apps.gsa.assistant.settings.features.p538ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9849r;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9796ac;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9805ak;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9822r;
import com.google.android.apps.gsa.assistant.settings.shared.d.c;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73790r;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.binaries.satin.app.C73964bv;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46775cs;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3676b.C47386p;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47754cs;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.j */
/* compiled from: PG */
public final class C9841j extends C9831b implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C9849r f33845a;

    /* renamed from: c */
    private Context f33846c;

    /* renamed from: d */
    private final C2393x f33847d = new C2393x(this);

    /* renamed from: e */
    private boolean f33848e;

    @Deprecated
    public C9841j() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18061b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f33846c == null) {
            this.f33846c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f33846c;
    }

    /* renamed from: f */
    public final C9849r mo17754z() {
        C9849r rVar = this.f33845a;
        if (rVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f33848e) {
            return rVar;
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
        return this.f33847d;
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
            C9840i.m24602a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C9849r f = mo17754z();
            C73778a.m108339b(f.f33861a);
            View inflate = layoutInflater.inflate(R.layout.fragment_lockscreen, viewGroup, false);
            C46801dp dpVar = f.f33863c;
            C9805ak akVar = f.f33862b;
            dpVar.mo50707a(new C46775cs(((C9796ac) akVar).f33781c, new C46719bc(((C9796ac) akVar).f33779a, new C9822r((C9796ac) akVar), "lockscreensettingsdata")), new C9849r.C9850a(f.f33861a, f.f33865e, f.f33866f, f.f33867g));
            f.f33868h.f76997b.mo33800a(C28427h.m53115a(121500)).mo33809b(inflate);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C9840i.m24602a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f33848e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C9840i.m24602a(th, th);
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
            C9840i.m24602a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C9849r f = mo17754z();
            int i = ItemView.a;
            ItemView findViewById = view.findViewById(R.id.assistant_on_lockscreen_toggle);
            ItemView findViewById2 = view.findViewById(R.id.skip_voice_recognition_toggle);
            ItemView findViewById3 = view.findViewById(R.id.assistant_cast_on_lockscreen_toggle);
            if (f.f33870j.mo79746e(C90014bt.f247382gB)) {
                findViewById2.setVisibility(8);
                if (f.f33870j.mo79746e(C90059dk.f249119bc)) {
                    findViewById3.setVisibility(0);
                }
            }
            Switch t = findViewById.t();
            Switch t2 = findViewById2.t();
            Switch t3 = findViewById3.t();
            f.f33868h.f76997b.mo33800a(C28427h.m53115a(121499)).mo33809b(t);
            f.f33868h.f76997b.mo33800a(C28427h.m53115a(121501)).mo33809b(t2);
            f.f33868h.f76997b.mo33800a(C28427h.m53115a(152827)).mo33809b(t3);
            t.setOnClickListener(new C9842k(f, t));
            t2.setOnClickListener(new C9843l(f, t2));
            t3.setOnClickListener(new C9844m(f, t3));
            t.setOnCheckedChangeListener(new C47754cs(f.f33864d, new C9845n(f, t2, t3), "toggled AOL switch"));
            t2.setOnCheckedChangeListener(new C47754cs(f.f33864d, new C9846o(f), "toggled SVR switch"));
            t3.setOnCheckedChangeListener(new C47754cs(f.f33864d, new C9847p(f), "toggled ACOL switch"));
            findViewById.o(c.b(f.f33861a.getContext(), f.f33861a.getString(R.string.assistant_on_lockscreen_description), f.f33870j.mo79758x(C90014bt.f247392gL)));
            C73790r.m108349a(findViewById.d());
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C9840i.m24602a(th, th);
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
            if (!this.f33848e) {
                super.onAttach(context);
                if (this.f33845a == null) {
                    Object jN = mo18060a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C9841j) {
                        C9841j jVar = (C9841j) fragment;
                        C68225k.m98532d(jVar);
                        C47386p S = ((C74178nm) jN).mo70036S();
                        C73964bv bvVar = ((C74178nm) jN).f207136c;
                        this.f33845a = new C9849r(jVar, ((C74178nm) jN).f207130a.a.mo68619l(), (C46801dp) ((C74178nm) jN).f207138e.mo17428b(), (C47770dh) ((C74178nm) jN).f207130a.a.f202593X.mo17428b(), S, bvVar.f205597bt, (C91097g) bvVar.f205799i.mo17428b(), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b(), (C28443m) ((C74178nm) jN).f207130a.a.f202879fR.mo17428b(), (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f33847d));
                    } else {
                        String obj = C9849r.class.toString();
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
                C9840i.m24602a(th, th2);
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

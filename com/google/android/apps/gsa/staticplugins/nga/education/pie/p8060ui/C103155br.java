package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103032a;
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
import com.google.common.p4526f.p4527a.C58970a;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.br */
/* compiled from: PG */
public final class C103155br extends C103130at implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C103159bv f287870a;

    /* renamed from: c */
    private Context f287871c;

    /* renamed from: d */
    private final C2393x f287872d = new C2393x(this);

    /* renamed from: e */
    private boolean f287873e;

    @Deprecated
    public C103155br() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo93646b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f287871c == null) {
            this.f287871c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f287871c;
    }

    /* renamed from: f */
    public final C103159bv mo17754z() {
        C103159bv bvVar = this.f287870a;
        if (bvVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f287873e) {
            return bvVar;
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
        return this.f287872d;
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
            C103154bq.m171051a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C103159bv f = mo17754z();
            C80246cm cmVar = C80246cm.UI_STATE_UNKNOWN;
            int ordinal = f.f287880d.ordinal();
            if (ordinal != 2) {
                i = R.layout.nga_pie_practice_interrupted_fragment;
                if (ordinal == 3) {
                    f.f287879c.mo93659d();
                } else if (ordinal == 8 || ordinal == 9) {
                    f.f287879c.mo93660e();
                    i = R.layout.nga_pie_lightweight_practice_interrupted_fragment;
                } else {
                    ((C58970a) ((C58970a) C103159bv.f287877a.mo56225c()).mo56372aa(21467)).mo56386p("Unsupported retry view");
                }
            } else {
                f.f287879c.mo93659d();
                i = R.layout.nga_pie_practice_complete_fragment;
            }
            View inflate = layoutInflater.inflate(i, viewGroup, false);
            if (f.f287880d == C80246cm.LIGHTWEIGHT_GENERIC_FAILURE) {
                ((TextView) inflate.findViewById(R.id.nga_pie_lightweight_practice_interrupted_title)).setText(R.string.nga_pie_practice_interrupted_generic_title);
                ((TextView) inflate.findViewById(R.id.nga_pie_lightweight_practice_interrupted_subtitle)).setText(R.string.nga_pie_practice_interrupted_generic_subtitle);
                C103143bf.m171039f(inflate);
            }
            inflate.findViewById(R.id.nga_pie_done_button).setOnClickListener(new C103156bs(f));
            inflate.findViewById(R.id.nga_pie_practice_more_button).setOnClickListener(new C103157bt(f));
            inflate.findViewById(R.id.nga_pie_exit_button).setOnClickListener(new C103158bu(f));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C103154bq.m171051a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f287873e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C103154bq.m171051a(th, th);
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
            C103154bq.m171051a(th, th);
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
            if (!this.f287873e) {
                super.onAttach(context);
                if (this.f287870a == null) {
                    Object jN = mo93645a().mo17653jN();
                    C80244ck s = ((C74178nm) jN).mo70077s();
                    C103032a aVar = (C103032a) ((C74178nm) jN).f207130a.b.f200011bY.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C103155br) {
                        C103155br brVar = (C103155br) fragment;
                        C68225k.m98532d(brVar);
                        this.f287870a = new C103159bv(s, aVar, brVar);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f287872d));
                    } else {
                        String obj = C103159bv.class.toString();
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
                C103154bq.m171051a(th, th2);
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

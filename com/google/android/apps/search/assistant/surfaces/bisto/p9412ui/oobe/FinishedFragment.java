package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

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
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.aqe;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124669ch;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.ScreenStateView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.p10712d.C142324bc;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.dataservice.local.C46854h;
import com.google.apps.tiktok.dataservice.local.C46855i;
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
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.FinishedFragment */
/* compiled from: PG */
public final class FinishedFragment extends C124854by implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C124809al f344252a;

    /* renamed from: c */
    private Context f344253c;

    /* renamed from: d */
    private final C2393x f344254d = new C2393x(this);

    /* renamed from: e */
    private boolean f344255e;

    @Deprecated
    public FinishedFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C124809al mo17754z() {
        C124809al alVar = this.f344252a;
        if (alVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f344255e) {
            return alVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo106628b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f344253c == null) {
            this.f344253c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f344253c;
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
        return this.f344254d;
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
            C124805ah.m204580a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C124809al a = mo17754z();
            a.f344338e = a.f344337d.mo50827g(R.id.assistant_subscription_finished, a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C124805ah.m204580a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C124809al a = mo17754z();
            boolean z = false;
            ScreenStateView screenStateView = (ScreenStateView) layoutInflater.inflate(R.layout.assistant_oobe_template_screen_root, viewGroup, false);
            a.f344334a.requireActivity().f2707h.mo3338a(new C124808ak(a));
            if (bundle != null) {
                z = true;
            }
            a.f344341h = z;
            if (z && bundle.getParcelable("dci") != null) {
                a.f344340g = (C142324bc) ((ProtoParsers.ParcelableProto) bundle.getParcelable("dci")).mo58938a(C142324bc.f386113s, C62921ba.m95368a());
            }
            a.f344335b.mo106718d(a.f344339f.f344420b, new C124806ai(a));
            screenStateView.mo106777c();
            C47831fm.m85019n();
            return screenStateView;
        } catch (Throwable th) {
            C124805ah.m204580a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f344255e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C124805ah.m204580a(th, th);
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
            C124805ah.m204580a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C124809al a = mo17754z();
            a.f344336c.mo106637a().mo106662b("Finished");
            a.f344336c.mo106637a().mo106661a(true);
            if (a.f344341h) {
                C46854h hVar = a.f344338e;
                hVar.getClass();
                hVar.mo50866a(a);
            }
            e.close();
            return;
        } catch (Throwable th) {
            C124805ah.m204580a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            bundle.putParcelable("dci", new ProtoParsers.InternalDontUse((byte[]) null, mo17754z().f344340g));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C124805ah.m204580a(th, th);
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
            if (!this.f344255e) {
                super.onAttach(context);
                if (this.f344252a == null) {
                    Object jN = mo106678d().mo17653jN();
                    C124848bs p = ((C74176nj) jN).mo70006p();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof FinishedFragment) {
                        FinishedFragment finishedFragment = (FinishedFragment) fragment;
                        C68225k.m98532d(finishedFragment);
                        aqe aqe = ((C74176nj) jN).f206730b.f198027a;
                        C124669ch chVar = (C124669ch) aqe.f199391eD.mo17428b();
                        this.f344252a = new C124809al(p, finishedFragment, ((C74176nj) jN).mo70005o(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), new C124883ch((cb) aqe.f199175a.a.f202905fr.mo17428b(), (C60888db) aqe.f199175a.n.mo17428b()), (C46128f) ((C74176nj) jN).f206730b.f198504j.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f344254d));
                    } else {
                        String obj = C124809al.class.toString();
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
                C124805ah.m204580a(th, th2);
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

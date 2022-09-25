package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.util.C129339b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32480m;
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
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.k */
/* compiled from: PG */
public final class C129078k extends C129092y implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129085r f354591a;

    /* renamed from: c */
    private Context f354592c;

    /* renamed from: d */
    private final C2393x f354593d = new C2393x(this);

    /* renamed from: e */
    private boolean f354594e;

    @Deprecated
    public C129078k() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129085r mo17754z() {
        C129085r rVar = this.f354591a;
        if (rVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f354594e) {
            return rVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo108837b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f354592c == null) {
            this.f354592c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f354592c;
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
        return this.f354593d;
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
            C129077j.m210702a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C129085r a = mo17754z();
            a.f354610f = bundle == null;
            String str = a.f354608d;
            C69664n.m101061g(str, "sessionKey");
            ((ActionsServiceSessionCleanupViewModel) a.f354609e.mo5768a()).f354560a = str;
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129077j.m210702a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.assistant_actions_service_fragment, viewGroup, false);
            C69664n.m101060f(inflate, "inflater.inflate(\n      …achToRoot= */ false\n    )");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C129077j.m210702a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f354594e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129077j.m210702a(th, th);
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
            C129077j.m210702a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C129085r a = mo17754z();
            C69664n.m101061g(view, "layout");
            a.mo108839a().addView(new C32480m(a.f354607c), new FrameLayout.LayoutParams(0, 0, 17));
            C129339b.m211160a(view, a, a.f354606b);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129077j.m210702a(th, th);
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
            if (!this.f354594e) {
                super.onAttach(context);
                if (this.f354591a == null) {
                    Object jN = mo108842d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C129080m mVar = (C129080m) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C129080m.f354595d, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(mVar);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C129078k) {
                        C129078k kVar = (C129078k) fragment;
                        C68225k.m98532d(kVar);
                        this.f354591a = new C129085r(mVar, kVar, ((C74176nj) jN).mo69441Q(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), ((C74176nj) jN).mo69790gU(), ((C74176nj) jN).mo69793gX());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f354593d));
                    } else {
                        String obj = C129085r.class.toString();
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
                C129077j.m210702a(th, th2);
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
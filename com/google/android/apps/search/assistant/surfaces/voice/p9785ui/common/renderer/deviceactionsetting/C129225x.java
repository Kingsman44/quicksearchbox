package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.p197u.C4230o;
import androidx.slice.C4114m;
import androidx.slice.widget.SliceView;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl.C129205s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import com.google.apps.tiktok.tracing.contrib.androidx.p3698c.C47618b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60887da;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.x */
/* compiled from: PG */
public final class C129225x extends C129179af implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129174aa f354967a;

    /* renamed from: c */
    private Context f354968c;

    /* renamed from: d */
    private final C2393x f354969d = new C2393x(this);

    /* renamed from: e */
    private boolean f354970e;

    @Deprecated
    public C129225x() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129174aa mo17754z() {
        C129174aa aaVar = this.f354967a;
        if (aaVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f354970e) {
            return aaVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo108887b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f354968c == null) {
            this.f354968c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f354968c;
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
        return this.f354969d;
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
            C129224w.m210966a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            mo17754z().f354827b.setEnterTransition(new C4230o());
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129224w.m210966a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C129174aa a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.f354830e.mo50707a(a.f354829d.mo108898a(a.f354831f), a.f354833h);
            View inflate = layoutInflater.inflate(R.layout.assistant_ma_settings_slice_card_with_icon, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C129224w.m210966a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            C129174aa a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.f354829d.mo108899b(a.f354831f);
            b.close();
            return;
        } catch (Throwable th) {
            C129224w.m210966a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f354970e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129224w.m210966a(th, th);
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
            C129224w.m210966a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C129174aa a = mo17754z();
            ImageView imageView = (ImageView) view.findViewById(R.id.assistant_icon);
            Integer num = a.f354832g;
            if (num != null) {
                imageView.setImageDrawable(a.f354828c.getDrawable(num.intValue()));
            }
            View findViewById = view.findViewById(R.id.assistant_slice_view);
            findViewById.getClass();
            SliceView sliceView = (SliceView) findViewById;
            sliceView.mo8673h(1);
            sliceView.mo8669d(C129226y.f354971a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129224w.m210966a(th, th);
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
            if (!this.f354970e) {
                super.onAttach(context);
                if (this.f354967a == null) {
                    Object jN = mo108888d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C129225x) {
                        C129225x xVar = (C129225x) fragment;
                        C68225k.m98532d(xVar);
                        this.f354967a = new C129174aa(xVar, (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), new C129205s((Context) ((C74176nj) jN).f206677a.g.mo17428b(), (C60887da) ((C74176nj) jN).f206677a.n.mo17428b(), (C4114m) ((C74176nj) jN).f206677a.d.f201589bv.mo17428b(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), (C21370a) ((C74176nj) jN).f206677a.i.mo17428b(), new C47618b((C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b())), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69848hf());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f354969d));
                    } else {
                        String obj = C129174aa.class.toString();
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
                C129224w.m210966a(th, th2);
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

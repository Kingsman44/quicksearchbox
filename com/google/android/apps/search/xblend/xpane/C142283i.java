package com.google.android.apps.search.xblend.xpane;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C1878d;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40358k;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3155c.C40514e;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40539h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.dataservice.C46723bg;
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
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.xblend.xpane.i */
/* compiled from: PG */
public final class C142283i extends C142277c implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C142287m f386003a;

    /* renamed from: c */
    private Context f386004c;

    /* renamed from: d */
    private final C2393x f386005d = new C2393x(this);

    /* renamed from: e */
    private boolean f386006e;

    @Deprecated
    public C142283i() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo117107b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f386004c == null) {
            this.f386004c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f386004c;
    }

    /* renamed from: f */
    public final C142287m mo17754z() {
        C142287m mVar = this.f386003a;
        if (mVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f386006e) {
            return mVar;
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
        return this.f386005d;
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
            C142282h.m231026a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C142287m f = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            Object tag = f.mo117112a().getTag(R.id.xblend_xpane_activity_ve);
            C56943g gVar = null;
            f.f386021h = tag instanceof C28439i ? (C28439i) tag : null;
            View inflate = layoutInflater.inflate(R.layout.xblend_xpane_fragment, viewGroup, false);
            boolean z = f.f386015b.f386012c;
            int i = R.id.xblend_xpane_fragment_content_slot;
            if (z) {
                ((FrameLayout) inflate.findViewById(R.id.xblend_xpane_fragment_content_slot)).addView(layoutInflater.inflate(R.layout.xblend_swipe_to_refresh, viewGroup, false));
            }
            if (true == f.f386015b.f386012c) {
                i = R.id.xblend_xpane_fragment_swipe_refresh_content_slot;
            }
            C0154a aVar = new C0154a(f.f386017d.getChildFragmentManager());
            aVar.mo689v(i, C40539h.m70274a(f.f386016c), "XBlendFragment");
            aVar.mo509f();
            C56943g gVar2 = f.f386015b.f386011b;
            if (gVar2 == null) {
                gVar2 = C56943g.f151982f;
            }
            C69664n.m101060f(gVar2, "params.address");
            f.f386020g = gVar2;
            C56943g gVar3 = f.f386020g;
            if (gVar3 == null) {
                C69664n.m101065k("address");
            } else {
                gVar = gVar3;
            }
            f.mo117116i(gVar, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C142282h.m231026a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            SwipeRefreshLayout d = mo17754z().mo117115d();
            if (d != null) {
                d.f13508a = null;
            }
            c.close();
            return;
        } catch (Throwable th) {
            C142282h.m231026a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f386006e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C142282h.m231026a(th, th);
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
            C142282h.m231026a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        SwipeRefreshLayout d;
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C142287m f = mo17754z();
            C69664n.m101061g(view, "view");
            if (f.f386015b.f386012c && (d = f.mo117115d()) != null) {
                d.mo8790i(C1878d.m5128a(d.getContext(), R.color.agsa_color_primary));
                d.f13513f.setBackgroundColor(C1878d.m5128a(d.getContext(), R.color.agsa_color_surface_elevation_2));
                d.mo8811p();
                d.f13508a = new C142290o(f);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C142282h.m231026a(th, th);
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
            if (!this.f386006e) {
                super.onAttach(context);
                if (this.f386003a == null) {
                    Object jN = mo117106a().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C142286l lVar = (C142286l) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C142286l.f386008e, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(lVar);
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C142283i) {
                        C142283i iVar = (C142283i) fragment;
                        C68225k.m98532d(iVar);
                        C142287m mVar = r4;
                        C142287m mVar2 = new C142287m(lVar, accountId, iVar, Optional.empty(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C40480q) ((C74176nj) jN).f206730b.f198176cq.mo17428b(), new C40514e((C71422aw) ((C74176nj) jN).f206677a.H.mo17428b(), ((C74176nj) jN).mo69748ff(), ((C74176nj) jN).mo69747fe(), ((C74176nj) jN).mo69789gT(), (C46723bg) ((C74176nj) jN).f206677a.ap.mo17428b(), (InstanceStateStoreFactory) ((C74176nj) jN).f206772bp.mo17428b()), (C40364q) ((C74176nj) jN).f206677a.b.f200004bR.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C40358k) ((C74176nj) jN).f206677a.b.f200003bQ.mo17428b());
                        this.f386003a = mVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f386005d));
                    } else {
                        String obj = C142287m.class.toString();
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
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C142282h.m231026a(th2, th3);
            }
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}

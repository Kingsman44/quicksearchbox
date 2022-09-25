package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9876e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130303a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128585c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128586d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128587e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128593k;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9738b.C128583a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9738b.C128584b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.e.c */
/* compiled from: PG */
public final class C130253c extends C130251a implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C130258h f357088a;

    /* renamed from: c */
    private Context f357089c;

    /* renamed from: d */
    private final C2393x f357090d = new C2393x(this);

    /* renamed from: e */
    private boolean f357091e;

    @Deprecated
    public C130253c() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109611b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f357089c == null) {
            this.f357089c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f357089c;
    }

    /* renamed from: f */
    public final C130258h mo17754z() {
        C130258h hVar = this.f357088a;
        if (hVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f357091e) {
            return hVar;
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
        return this.f357090d;
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
            C130252b.m212657a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C130258h f = mo17754z();
            f.f357100d.mo50429i(f.f357101e);
            FragmentManager childFragmentManager = f.f357098b.getChildFragmentManager();
            if (childFragmentManager.f634a.mo670b(R.id.assistant_response_layer_p6glow_container) == null) {
                boolean z = bundle == null;
                C0154a aVar = new C0154a(childFragmentManager);
                AccountId accountId = f.f357103g;
                C128585c cVar = (C128585c) C128586d.f353551d.createBuilder();
                cVar.copyOnWrite();
                C128586d dVar = (C128586d) cVar.instance;
                dVar.f353553a |= 1;
                dVar.f353554b = z;
                int i = C128593k.f353562h;
                aVar.mo511h(R.id.assistant_response_layer_p6glow_container, C128587e.m209855a(accountId, (C128586d) cVar.build()), (String) null, 1);
                aVar.mo509f();
            }
            f.f357104h.mo50828h(R.id.assistant_response_layer_p6glow_container, f.f357105i.mo108053a(), new C130254d(f));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130252b.m212657a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_response_layer_voice_input_bar_container, viewGroup, false);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C130252b.m212657a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f357091e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C130252b.m212657a(th, th);
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
            C130252b.m212657a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C130258h f = mo17754z();
            C47393f.m84233d(this, C130303a.class, new C130260i(f));
            C47393f.m84233d(this, C128583a.class, new C130261j(f));
            C47393f.m84233d(this, C128584b.class, new C130262k(f));
            this.f54442o.mo24720k(bundle);
            C130258h f2 = mo17754z();
            f2.f357102f.mo51252a((ImageView) f2.f357098b.requireView().findViewById(R.id.assistant_response_layer_keyboard_indicator), new C130303a(BuildConfig.FLAVOR));
            C128567c.m209821d(view, new C130255e(view));
            View r = C2043bi.m5589r(view, R.id.assistant_response_layer_p6glow_container);
            C128567c.m209821d(r, new C130256f(r));
            View r2 = C2043bi.m5589r(view, R.id.assistant_response_layer_keyboard_indicator);
            C128567c.m209821d(r2, new C130257g(view, r2));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130252b.m212657a(th, th);
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
            if (!this.f357091e) {
                super.onAttach(context);
                if (this.f357088a == null) {
                    this.f357088a = ((C130263l) mo109610a().mo17653jN()).mo109615bg();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f357090d));
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
                C130252b.m212657a(th, th2);
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

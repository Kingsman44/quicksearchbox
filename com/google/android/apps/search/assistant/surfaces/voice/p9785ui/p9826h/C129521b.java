package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9826h;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128582b;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128587e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128593k;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9738b.C128583a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9738b.C128584b;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9740d.C128610a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9740d.C128611b;
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
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.h.b */
/* compiled from: PG */
public final class C129521b extends C129536p implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129529j f355561a;

    /* renamed from: c */
    private Context f355562c;

    /* renamed from: d */
    private final C2393x f355563d = new C2393x(this);

    /* renamed from: e */
    private boolean f355564e;

    @Deprecated
    public C129521b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129529j mo17754z() {
        C129529j jVar = this.f355561a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f355564e) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109074b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f355562c == null) {
            this.f355562c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f355562c;
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
        return this.f355563d;
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
            C129514a.m211446a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C129529j a = mo17754z();
            a.f355580i.mo50429i(a.f355574c);
            ((C59052c) ((C59052c) C129529j.f355572a.mo56224b()).mo56372aa(38729)).mo56386p("OverAppFragment onCreate called");
            if (a.f355573b.getChildFragmentManager().f634a.mo670b(R.id.assistant_p6glow_container) == null) {
                AccountId accountId = a.f355575d;
                int i = C128593k.f353562h;
                C69664n.m101061g(accountId, "accountId");
                C128582b b = C128587e.m209856b(accountId);
                C0154a aVar = new C0154a(a.f355573b.getChildFragmentManager());
                aVar.mo511h(R.id.assistant_p6glow_container, b, (String) null, 1);
                aVar.mo509f();
            }
            a.f355577f.mo107946e(R.id.assistant_overapp_local_subscription, new C129525f(a), C129526g.f355569a);
            a.f355577f.mo107947f(a.f355579h, R.id.assistant_overapp_error_subscription, a.f355576e);
            a.f355579h.mo50828h(R.id.assistant_p6glow_container, a.f355578g.mo108053a(), new C129527h(a));
            a.f355579h.mo50828h(R.id.assistant_overapp_transcription_subscription, a.f355577f.mo107945d(), new C129528i(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129514a.m211446a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z();
            ((C59052c) ((C59052c) C129529j.f355572a.mo56224b()).mo56372aa(38726)).mo56386p("OverAppFragment-onCreateView");
            View inflate = layoutInflater.inflate(R.layout.assistant_over_app_plate_fragment, viewGroup, false);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C129514a.m211446a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f355564e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129514a.m211446a(th, th);
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
            C129514a.m211446a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C129529j a2 = mo17754z();
            C47393f.m84233d(this, C128583a.class, new C129531k(a2));
            C47393f.m84233d(this, C128584b.class, new C129532l(a2));
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_left_icon), new C129533m(a2));
            this.f54442o.mo24720k(bundle);
            mo17754z();
            View r = C2043bi.m5589r(view, R.id.assistant_plate_shadow);
            Context context = view.getContext();
            C69664n.m101061g(context, "context");
            int[] intArray = context.getResources().getIntArray(R.array.assistant_shadow_colors);
            C69664n.m101060f(intArray, "context.resources.getInt….assistant_shadow_colors)");
            float[] fArr = C128611b.f353603a;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            shapeDrawable.setShaderFactory(new C128610a(intArray, fArr));
            r.setBackground(shapeDrawable);
            View r2 = C2043bi.m5589r(view, R.id.assistant_p6glow_container);
            C128567c.m209821d(r2, new C129523d(r2));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129514a.m211446a(th, th);
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
            if (!this.f355564e) {
                super.onAttach(context);
                if (this.f355561a == null) {
                    this.f355561a = ((C129534n) mo109078d().mo17653jN()).mo109076aX();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f355563d));
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
                C129514a.m211446a(th, th2);
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

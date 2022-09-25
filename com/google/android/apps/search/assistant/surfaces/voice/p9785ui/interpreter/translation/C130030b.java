package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

import android.animation.ObjectAnimator;
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
import com.google.android.libraries.p1623at.p1632e.C19559g;
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
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.b */
/* compiled from: PG */
public final class C130030b extends C130052x implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C130033e f356569a;

    /* renamed from: c */
    private Context f356570c;

    /* renamed from: d */
    private final C2393x f356571d = new C2393x(this);

    /* renamed from: e */
    private boolean f356572e;

    @Deprecated
    public C130030b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C130033e mo17754z() {
        C130033e eVar = this.f356569a;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f356572e) {
            return eVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109432b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f356570c == null) {
            this.f356570c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f356570c;
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
        return this.f356571d;
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
            C130029a.m212289a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            mo17754z();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130029a.m212289a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.assistant_interpreter_listening, viewGroup, false);
            C69664n.m101060f(inflate, "inflater.inflate(\n      …achToRoot= */ false\n    )");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C130029a.m212289a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            C130033e a = mo17754z();
            C59052c cVar = (C59052c) C130033e.f356576a.mo56224b();
            cVar.mo56379ah(new C59094n(38660));
            cVar.mo56386p("onDestroy called");
            ObjectAnimator objectAnimator = a.f356579d;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            a.f356579d = null;
            b.close();
            return;
        } catch (Throwable th) {
            C130029a.m212289a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f356572e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C130029a.m212289a(th, th);
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
            C130029a.m212289a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C130033e a = mo17754z();
            C69664n.m101061g(view, "containerView");
            C59052c cVar = (C59052c) C130033e.f356576a.mo56224b();
            cVar.mo56379ah(new C59094n(38656));
            cVar.mo56386p("fadeInLanguageNameBox");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a.mo109438a(), View.ALPHA, new float[]{0.0f, 0.25f});
            ofFloat.setDuration(a.f356577b.toMillis());
            ofFloat.setInterpolator(a.f356578c);
            ofFloat.setRepeatCount(0);
            ofFloat.addListener(new C130032d(a));
            ofFloat.start();
            a.f356579d = ofFloat;
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130029a.m212289a(th, th);
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
            if (!this.f356572e) {
                super.onAttach(context);
                if (this.f356569a == null) {
                    this.f356569a = ((C130034f) mo109465d().mo17653jN()).mo109440aQ();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f356571d));
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
                C130029a.m212289a(th, th2);
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

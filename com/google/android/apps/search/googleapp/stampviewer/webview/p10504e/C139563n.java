package com.google.android.apps.search.googleapp.stampviewer.webview.p10504e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.p119j.p120a.p121a.C2301c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.contrib.errorpage.p3373a.p3374a.C43509a;
import com.google.android.libraries.web.contrib.errorpage.p3373a.p3374a.C43511c;
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
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.e.n */
/* compiled from: PG */
public final class C139563n extends C139570u implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139566q f379421a;

    /* renamed from: c */
    private Context f379422c;

    /* renamed from: d */
    private final C2393x f379423d = new C2393x(this);

    /* renamed from: e */
    private boolean f379424e;

    @Deprecated
    public C139563n() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C139566q mo17754z() {
        C139566q qVar = this.f379421a;
        if (qVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f379424e) {
            return qVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo115062b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f379422c == null) {
            this.f379422c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f379422c;
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
        return this.f379423d;
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
            C139562m.m226848a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C139566q a = mo17754z();
            a.f379428b.mo50828h(R.id.googleapp_stampviewer_spinner_overlay_fragment_error_page_subscription, new C43509a((C43511c) a.f379429c), new C139564o(a));
            a.f379428b.mo50828h(R.id.googleapp_stampviewer_spinner_overlay_fragment_loading_state_subscription, a.f379430d.mo115054b(), new C139565p(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139562m.m226848a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139566q a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_amp_web_view_spinner, viewGroup, false);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new C2301c());
            rotateAnimation.setDuration(1000);
            rotateAnimation.setRepeatCount(-1);
            inflate.findViewById(R.id.googleapp_stamp_viewer_spinner_image).startAnimation(rotateAnimation);
            C28306ab abVar = a.f379427a;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(125926)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C139562m.m226848a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f379424e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139562m.m226848a(th, th);
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
            C139562m.m226848a(th, th);
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
            if (!this.f379424e) {
                super.onAttach(context);
                if (this.f379421a == null) {
                    this.f379421a = ((C139567r) mo115068d().mo17653jN()).mo115064dU();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f379423d));
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
                C139562m.m226848a(th, th2);
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

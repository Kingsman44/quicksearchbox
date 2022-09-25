package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
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
import com.google.assistant.p3897e.p3921j.p3926e.C51885cs;
import com.google.common.base.C58844bh;
import com.google.common.p4526f.C59052c;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.c */
/* compiled from: PG */
public final class C129836c extends C129849p implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private CanvasWebAppFragmentPeer f356227a;

    /* renamed from: c */
    private Context f356228c;

    /* renamed from: d */
    private final C2393x f356229d = new C2393x(this);

    /* renamed from: e */
    private boolean f356230e;

    @Deprecated
    public C129836c() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final CanvasWebAppFragmentPeer mo17754z() {
        CanvasWebAppFragmentPeer canvasWebAppFragmentPeer = this.f356227a;
        if (canvasWebAppFragmentPeer == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f356230e) {
            return canvasWebAppFragmentPeer;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109289b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f356228c == null) {
            this.f356228c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f356228c;
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
        return this.f356229d;
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
            C129818b.m211963a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            CanvasWebAppFragmentPeer a = mo17754z();
            ((PostMessageMixinImpl) a.f356152f).mo46952c(R.id.assistant_immersive_post_message_listener, C58844bh.ALWAYS_TRUE, new C129837d(a), false, (JSONObject) null);
            a.f356154h.mo50429i(a.f356153g);
            a.f356154h.mo50429i(a.f356156j);
            a.f356154h.mo50429i(a.f356163q);
            a.f356154h.mo50429i(a.f356166t);
            a.f356168v.mo5790b(a.f356169w);
            a.f356172z.mo108516a(R.id.assistant_canvas_tts_timepoint_event_subscription, new C129843j(new C129838e(a)));
            a.f356147A.mo108516a(R.id.assistant_canvas_tts_mark_event_subscription, new C129844k(new C129839f(a)));
            a.f356170x = (CanvasWebAppViewModel) new C2368bp(a.f356150d).mo5770a(CanvasWebAppViewModel.class);
            if (a.f356150d.getChildFragmentManager().f634a.mo671c("WebFragment") == null) {
                if (a.f356171y.f178090a == null) {
                    C51885cs csVar = C51885cs.f136078y;
                }
                C43255f m = C43257h.m76306m("https://appassets.androidplatform.net/assets/tng/immersive_shim.html");
                m.mo46344e(true);
                a.f356160n.mo46333b(m.mo46365k());
                C0154a aVar = new C0154a(a.f356150d.getChildFragmentManager());
                aVar.mo511h(R.id.assistant_web_content, C43864j.m77435a(a.f356151e, "https://appassets.androidplatform.net/assets/tng/immersive_shim.html"), "WebFragment", 1);
                aVar.mo509f();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129818b.m211963a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            CanvasWebAppFragmentPeer a = mo17754z();
            ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56224b()).mo56372aa(38473)).mo56386p("onCreateView");
            View inflate = layoutInflater.inflate(R.layout.assistant_canvas_web_fragment, viewGroup, false);
            a.f356161o.mo108810b(154013, inflate);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C129818b.m211963a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f356230e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129818b.m211963a(th, th);
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
            C129818b.m211963a(th, th);
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
            if (!this.f356230e) {
                super.onAttach(context);
                if (this.f356227a == null) {
                    this.f356227a = ((C129845l) mo109293d().mo17653jN()).mo109291aB();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f356229d));
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
                C129818b.m211963a(th, th2);
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

package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9647e.p9648a.C127822a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129584b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129621e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.C129484h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9822d.C129470a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9822d.p9823a.C129471a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9822d.p9823a.C129472b;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9730b.p9731a.p9732a.C128562b;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9730b.p9731a.p9732a.C128563c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128582b;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128587e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128593k;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9738b.C128583a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9738b.C128584b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.d */
/* compiled from: PG */
public final class C129469d extends C129504z implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129484h f355466a;

    /* renamed from: c */
    private Context f355467c;

    /* renamed from: d */
    private final C2393x f355468d = new C2393x(this);

    /* renamed from: e */
    private boolean f355469e;

    @Deprecated
    public C129469d() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129484h mo17754z() {
        C129484h hVar = this.f355466a;
        if (hVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f355469e) {
            return hVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109044b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f355467c == null) {
            this.f355467c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f355467c;
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
        return this.f355468d;
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
            C129445c.m211338a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C129484h a = mo17754z();
            a.f355514v = C129621e.m211643a(a.f355511s, "INPUT_FEATURE", "BLUE_BAR");
            a.f355505m.mo50429i(a.f355515w);
            if (a.f355494b.getChildFragmentManager().f634a.mo670b(R.id.assistant_p6glow_container) == null) {
                int i = C128593k.f353562h;
                C128582b b = C128587e.m209856b(a.f355495c);
                C0154a aVar = new C0154a(a.f355494b.getChildFragmentManager());
                aVar.mo511h(R.id.assistant_p6glow_container, b, (String) null, 1);
                aVar.mo509f();
            }
            a.f355499g.mo50829i(R.id.assistant_input_ww_subscription, new C127822a(a.f355517y), new C129491m(a), C129492n.f355527a);
            a.f355497e.mo107946e(R.id.assistant_input_client_op_local_subscription, new C129493o(a), C129494p.f355529a);
            a.f355497e.mo107947f(a.f355499g, R.id.assistant_input_error_subscription, a.f355496d);
            a.f355499g.mo50828h(R.id.assistant_p6glow_container, a.f355506n.mo108053a(), new C129495q(a));
            a.f355499g.mo50828h(R.id.assistant_input_timeout_subscription, new C128562b((C128563c) a.f355507o), new C129496r(a));
            a.f355499g.mo50828h(R.id.assistant_input_assistant_state_subscription, a.f355497e.mo107943b(), new C129497s(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129445c.m211338a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C129484h a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.assistant_input_plate_fragment, viewGroup, false);
            C46801dp dpVar = a.f355498f;
            Object b = a.f355516x.f355422a.mo17428b();
            C69664n.m101060f(b, "featureDataSourceProvider.get()");
            C46689ag agVar = (C46689ag) b;
            C129409b bVar = a.f355500h;
            C129584b bVar2 = a.f355514v;
            if (bVar2 == null) {
                C69664n.m101065k("postponeLatch");
                bVar2 = null;
            }
            dpVar.mo50707a(agVar, new C129484h.C129486b(bVar, bVar2));
            C46801dp dpVar2 = a.f355498f;
            C129470a aVar = a.f355501i;
            dpVar2.mo50707a(new C46719bc(((C129472b) aVar).f355472b, new C129471a((C129472b) aVar), C129472b.f355470a), new C129499u(a));
            View r = C2043bi.m5589r(inflate, R.id.assistant_right_icon);
            C69664n.m101060f(r, "requireViewById<View>(vi….id.assistant_right_icon)");
            a.f355509q.mo108810b(92647, r);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C129445c.m211338a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f355469e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129445c.m211338a(th, th);
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
            C129445c.m211338a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            mo17754z().f355510r.mo19974a(C37176a.f97221hU);
            e.close();
            return;
        } catch (Throwable th) {
            C129445c.m211338a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C129484h a = mo17754z();
            C47393f.m84233d(this, C128583a.class, new C129500v(a));
            C47393f.m84233d(this, C128584b.class, new C129501w(a));
            this.f54442o.mo24720k(bundle);
            C129484h a2 = mo17754z();
            C69664n.m101061g(view, "view");
            View r = C2043bi.m5589r(view, R.id.assistant_p6glow_container);
            C69664n.m101060f(r, "requireViewById<View>(vi…sistant_p6glow_container)");
            C128567c.m209821d(r, new C129490l(r));
            View r2 = C2043bi.m5589r(view, R.id.assistant_right_icon);
            C69664n.m101060f(r2, "requireViewById<View>(vi….id.assistant_right_icon)");
            C128567c.m209821d(r2, new C129489k(view, r2));
            View r3 = C2043bi.m5589r(view, R.id.assistant_plate_dev_badge);
            C69664n.m101060f(r3, "requireViewById<View>(vi…ssistant_plate_dev_badge)");
            r3.setVisibility(true != a2.f355513u ? 8 : 0);
            C128567c.m209821d(r3, new C129488j(view, r3));
            View r4 = C2043bi.m5589r(view, R.id.assistant_bluebar_container);
            C69664n.m101060f(r4, "requireViewById<ViewGrou…istant_bluebar_container)");
            ViewGroup viewGroup = (ViewGroup) r4;
            viewGroup.setOnHierarchyChangeListener(new C129487i(viewGroup));
            C2043bi.m5589r(view, R.id.assistant_right_icon).setOnClickListener(new C47591co(a2.f355502j, "Keyboard icon clicked", new C129498t(a2)));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129445c.m211338a(th, th);
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
            if (!this.f355469e) {
                super.onAttach(context);
                if (this.f355466a == null) {
                    this.f355466a = ((C129502x) mo109059d().mo17653jN()).mo109057aD();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f355468d));
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
                C129445c.m211338a(th, th2);
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

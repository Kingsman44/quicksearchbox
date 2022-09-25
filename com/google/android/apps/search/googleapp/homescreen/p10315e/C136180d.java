package com.google.android.apps.search.googleapp.homescreen.p10315e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.homescreen.p10315e.p10317b.C136164e;
import com.google.android.apps.search.googleapp.homescreen.p10315e.p10317b.C136173n;
import com.google.android.apps.search.googleapp.homescreen.p10315e.p10317b.C136177r;
import com.google.android.gms.contextmanager.p10785a.C144027c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.location.C38695am;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.experiments.C46897i;
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
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4580v.C60950i;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.e.d */
/* compiled from: PG */
public final class C136180d extends C136157a implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136183g f370859a;

    /* renamed from: c */
    private Context f370860c;

    /* renamed from: d */
    private final C2393x f370861d = new C2393x(this);

    /* renamed from: e */
    private boolean f370862e;

    @Deprecated
    public C136180d() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112809b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f370860c == null) {
            this.f370860c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f370860c;
    }

    /* renamed from: f */
    public final C136183g mo17754z() {
        C136183g gVar = this.f370859a;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f370862e) {
            return gVar;
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
        return this.f370861d;
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
            C136179c.m221275a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C136183g f = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.googleapp_weather_widget_fragment, viewGroup, false);
            C69664n.m101059e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) inflate;
            LinearLayout linearLayout = (LinearLayout) viewGroup2.findViewById(R.id.googleapp_weather_container);
            C28306ab abVar = f.f370871f;
            abVar.mo33801b(linearLayout, abVar.f76990a.mo33805a(C28427h.m53115a(97428)));
            linearLayout.setOnClickListener(new C47591co(f.f370873h, "Weather chip tapped", new C136181e(f)));
            C46801dp dpVar = f.f370869d;
            C46689ag agVar = (C46689ag) f.f370868c.f370858c.mo5768a();
            C69664n.m101060f(agVar, "dataSource");
            dpVar.mo50707a(agVar, new C136182f(f, viewGroup2));
            C47831fm.m85019n();
            return viewGroup2;
        } catch (Throwable th) {
            C136179c.m221275a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f370862e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136179c.m221275a(th, th);
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
            C136179c.m221275a(th, th);
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

    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object, com.google.android.libraries.search.location.aa] */
    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f370862e) {
                super.onAttach(context);
                if (this.f370859a == null) {
                    Object jN = mo112808a().mo17653jN();
                    C144027c cVar = (C144027c) ((C74176nj) jN).f206677a.d.f201625ce.mo17428b();
                    this.f370859a = new C136183g((Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), new C136177r(new C136173n(((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 151").mo50903b(), (C42876ab) ((C74176nj) jN).f206730b.f198027a.f199538gs.mo17428b(), (Executor) ((C74176nj) jN).f206677a.n.mo17428b(), (Executor) ((C74176nj) jN).f206677a.p.mo17428b(), new C38695am((Context) ((C74176nj) jN).f206677a.g.mo17428b(), ((C74176nj) jN).f206730b.mo66470is()), (Context) ((C74176nj) jN).f206677a.g.mo17428b(), (C21370a) ((C74176nj) jN).f206677a.i.mo17428b()), new C136164e(((C74176nj) jN).mo69755fm(), (C46723bg) ((C74176nj) jN).f206677a.ap.mo17428b())), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C60950i) ((C74176nj) jN).f206677a.bC.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), ((C74176nj) jN).mo69670eG(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45357040").mo50907f());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f370861d));
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
                C136179c.m221275a(th2, th3);
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

package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a.C39959o;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a.p3108a.C39944b;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a.p3108a.C39945c;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
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
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4401a.C57722f;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.a.i */
/* compiled from: PG */
public final class C39953i extends C39967u implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C39959o f105032a;

    /* renamed from: c */
    private Context f105033c;

    /* renamed from: d */
    private final C2393x f105034d = new C2393x(this);

    /* renamed from: e */
    private boolean f105035e;

    @Deprecated
    public C39953i() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C39959o mo17754z() {
        C39959o oVar = this.f105032a;
        if (oVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f105035e) {
            return oVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo42094b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f105033c == null) {
            this.f105033c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f105033c;
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
        return this.f105034d;
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
            C39952h.m69391a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C39959o a = mo17754z();
            C30306o oVar = a.f105047f;
            oVar.f81934a.f81880a.add(a.f105049h);
            a.f105046e.mo50707a(a.f105045d.mo50245b(), new C39959o.C39960a(a.f105047f, a.f105044c));
            a.f105046e.mo50707a(new C39944b(a.f105050i, C39959o.m69402a(a.f105053l)), a.f105051j);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C39952h.m69391a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            C39959o a = mo17754z();
            C30306o oVar = a.f105047f;
            oVar.f81934a.f81880a.remove(a.f105049h);
            b.close();
            return;
        } catch (Throwable th) {
            C39952h.m69391a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f105035e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C39952h.m69391a(th, th);
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
            C39952h.m69391a(th, th);
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
            if (!this.f105035e) {
                super.onAttach(context);
                if (this.f105032a == null) {
                    Object jN = mo42096d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C57722f fVar = (C57722f) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C57722f.f154210d, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(fVar);
                    this.f105032a = new C39959o(fVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C46175b) ((C74176nj) jN).f206730b.f198398h.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69663e(), new C39945c((C21370a) ((C74176nj) jN).f206677a.i.mo17428b(), (C47449e) ((C74176nj) jN).f206677a.gH.mo17428b(), (ScheduledExecutorService) ((C74176nj) jN).f206677a.p.mo17428b()), (C40364q) ((C74176nj) jN).f206677a.b.f200004bR.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f105034d));
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
                C39952h.m69391a(th, th2);
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

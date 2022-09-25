package com.google.android.apps.gsa.staticplugins.opa.appactions;

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
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d.C107277a;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d.C107279c;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d.C107290n;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e.C107298a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36265d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3861at.C50463y;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.b */
/* compiled from: PG */
public final class C107258b extends C107248aq implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C107297e f298541a;

    /* renamed from: c */
    private Context f298542c;

    /* renamed from: d */
    private final C2393x f298543d = new C2393x(this);

    /* renamed from: e */
    private boolean f298544e;

    @Deprecated
    public C107258b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C107297e mo17754z() {
        C107297e eVar = this.f298541a;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f298544e) {
            return eVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo95870b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f298542c == null) {
            this.f298542c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f298542c;
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
        return this.f298543d;
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
            C107228a.m177983a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C107297e a = mo17754z();
            a.f298613d.mo65296c(C89849ae.APP_ACITONS_INTENT_SHORTCUTS_CREATION_START);
            ((C59052c) ((C59052c) C107297e.f298610a.mo56224b()).mo56372aa(23545)).mo56386p("[INTENT_SHORTCUT] Start creating intent shortcut");
            C36265d dVar = a.f298616g.f298571c;
            if (dVar == null) {
                dVar = C36265d.f94713k;
            }
            a.f298618i = a.f298615f.mo95896a(dVar);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C107228a.m177983a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z();
            View inflate = layoutInflater.inflate(R.layout.activity_app_shortcut, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C107228a.m177983a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f298544e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C107228a.m177983a(th, th);
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
            C107228a.m177983a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C107297e a = mo17754z();
            C107279c cVar = a.f298614e;
            C107308i iVar = a.f298618i;
            iVar.getClass();
            C50463y a2 = cVar.mo95891a(iVar, false);
            a.f298613d.mo65295b(C89849ae.APP_ACTIONS_INTENT_SHORTCUTS_REQUEST_CREATED);
            new C90873ag(a.f298612c.mo95894b(a2), a.f298617h, "sendIntentShortcutCreationRequest", new C107269c(a)).mo85223a(new C107276d(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C107228a.m177983a(th, th);
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
            if (!this.f298544e) {
                super.onAttach(context);
                if (this.f298541a == null) {
                    Object jN = mo95871d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C107258b) {
                        C107258b bVar = (C107258b) fragment;
                        C68225k.m98532d(bVar);
                        C107277a aVar = (C107277a) ((C74178nm) jN).f207130a.d.f201707eG.mo17428b();
                        C107298a aVar2 = new C107298a();
                        C62921ba baVar = (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b();
                        C46439e eVar = (C46439e) ((C74178nm) jN).f207139f.mo17428b();
                        ((C74178nm) jN).mo70019B();
                        this.f298541a = new C107297e(bVar, (C107290n) ((C74178nm) jN).f207130a.d.f201706eF.mo17428b(), ((C74178nm) jN).f207130a.d.mo67680J(), (C73812a) ((C74178nm) jN).f207130a.b.f200258gG.mo17428b(), aVar2, ((C74178nm) jN).mo70020C(), (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f298543d));
                    } else {
                        String obj = C107297e.class.toString();
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
                C107228a.m177983a(th, th2);
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

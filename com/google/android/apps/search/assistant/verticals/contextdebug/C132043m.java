package com.google.android.apps.search.assistant.verticals.contextdebug;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.verticals.contextdebug.p10038a.C132026a;
import com.google.android.apps.search.assistant.verticals.contextdebug.p10039b.C132031b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.assistant.p2566g.C33417l;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import com.google.android.libraries.web.webview.p3485h.C44412a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.dataservice.C46689ag;
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
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50539g;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50540h;
import com.google.common.base.C58838bb;
import com.google.common.base.C58844bh;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.m */
/* compiled from: PG */
public final class C132043m extends C132028aa implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C132052v f360407a;

    /* renamed from: c */
    private Context f360408c;

    /* renamed from: d */
    private final C2393x f360409d = new C2393x(this);

    /* renamed from: e */
    private boolean f360410e;

    @Deprecated
    public C132043m() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C132052v mo17754z() {
        C132052v vVar = this.f360407a;
        if (vVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f360410e) {
            return vVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo110387b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f360408c == null) {
            this.f360408c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f360408c;
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
        return this.f360409d;
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
            C132042l.m214490a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C132052v a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_context_debug_fragment, viewGroup, false);
            int i = 1;
            if (a.f360426e.getChildFragmentManager().f634a.mo671c("WebFragment") == null) {
                AccountId accountId = a.f360423b;
                C50540h a2 = a.mo110394a();
                if ((a2.f131537a & 1) != 0) {
                    str = a2.f131541e;
                } else {
                    str = (String) a.f360424c.orElseThrow(C132050t.f360419a);
                }
                C43861g a3 = C43864j.m77435a(accountId, str);
                C0154a aVar = new C0154a(a.f360426e.getChildFragmentManager());
                aVar.mo511h(R.id.assistant_web_fragment_container, a3, "WebFragment", 1);
                aVar.mo509f();
            }
            if (C44412a.m78441b()) {
                ((PostMessageMixinImpl) a.f360428g).mo46952c(R.id.assistant_contextdebug_post_message_id, C58844bh.ALWAYS_TRUE, new C132049s(a), false, (JSONObject) null);
            } else {
                ((C59052c) ((C59052c) C132052v.f360422a.mo56226d()).mo56372aa(39503)).mo56386p("PostMessage instant channel is unavailable");
            }
            C46801dp dpVar = a.f360432k;
            C46689ag b = a.f360433l.mo46469b();
            C39141kp kpVar = a.f360434m;
            int a4 = C50539g.m85841a(a.mo110394a().f131542f);
            if (a4 != 0) {
                i = a4;
            }
            dpVar.mo50707a(b, new C132051u(kpVar, i));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C132042l.m214490a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f360410e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C132042l.m214490a(th, th);
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
            C132042l.m214490a(th, th);
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
            if (!this.f360410e) {
                super.onAttach(context);
                if (this.f360407a == null) {
                    Object jN = mo110388d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C132031b bVar = (C132031b) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C132031b.f360388c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(bVar);
                    String e = ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66984fy().f184850a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45353859").mo50906e();
                    C68225k.m98532d(e);
                    boolean a = ((C74176nj) jN).f206730b.f198027a.mo66984fy().mo60463a();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C132043m) {
                        C132043m mVar = (C132043m) fragment;
                        C68225k.m98532d(mVar);
                        this.f360407a = new C132052v(accountId, bVar, e, a, mVar, new C132041k(((C74176nj) jN).mo69794gY()), ((C74176nj) jN).mo69740fX(), ((C74176nj) jN).mo69787gR(), new C132040j((C60887da) ((C74176nj) jN).f206677a.n.mo17428b(), (C33417l) ((C74176nj) jN).f207098y.mo17428b(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C46175b) ((C74176nj) jN).f206730b.f198398h.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66984fy().mo60463a()), (C132026a) ((C74176nj) jN).f206677a.b.f200305hA.mo17428b(), (C60887da) ((C74176nj) jN).f206677a.n.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69736fT(), (C39141kp) ((C74176nj) jN).f206677a.v.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f360409d));
                    } else {
                        String obj = C132052v.class.toString();
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
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C132042l.m214490a(th2, th3);
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

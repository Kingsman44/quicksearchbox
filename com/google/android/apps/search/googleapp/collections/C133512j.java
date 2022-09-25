package com.google.android.apps.search.googleapp.collections;

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
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.collections.p10143b.C133501b;
import com.google.android.apps.search.googleapp.collections.p10143b.C133502c;
import com.google.android.apps.search.googleapp.collections.p10143b.C133503d;
import com.google.android.apps.search.googleapp.collections.p10143b.C133504e;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46788de;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.Objects;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69077ct;

/* renamed from: com.google.android.apps.search.googleapp.collections.j */
/* compiled from: PG */
public final class C133512j extends C133497ad implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C133521s f363782a;

    /* renamed from: c */
    private Context f363783c;

    /* renamed from: d */
    private final C2393x f363784d = new C2393x(this);

    /* renamed from: e */
    private boolean f363785e;

    @Deprecated
    public C133512j() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C133521s mo17754z() {
        C133521s sVar = this.f363782a;
        if (sVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f363785e) {
            return sVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo111199b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f363783c == null) {
            this.f363783c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f363783c;
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
        return this.f363784d;
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
            C133511i.m216714a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C133521s a = mo17754z();
            RequestBlockMixin requestBlockMixin = a.f363798c;
            C133525v vVar = a.f363804i;
            Objects.requireNonNull(vVar);
            requestBlockMixin.mo46748c(R.id.googleapp_collections_google_homepage_link, new C133515m(vVar), new C133516n(a));
            C133525v vVar2 = a.f363804i;
            Objects.requireNonNull(vVar2);
            requestBlockMixin.mo46748c(R.id.googleapp_collections_saves_or_image_links, new C133517o(vVar2), new C133518p(a));
            C133525v vVar3 = a.f363804i;
            Objects.requireNonNull(vVar3);
            requestBlockMixin.mo46748c(R.id.googleapp_collections_search_link_with_query, new C133519q(vVar3), new C133516n(a));
            requestBlockMixin.mo46749d(R.id.googleapp_collections_third_party_links, new C133520r(a));
            if (a.f363803h.mo46339h()) {
                a.f363805j.mo111204a(a.mo111211a());
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133511i.m216714a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C133521s a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_collections_screen_fragment, viewGroup, false);
            a.f363808m.mo33801b(inflate, a.f363807l.mo33805a(C28427h.m53115a(124796)));
            View findViewById = inflate.findViewById(R.id.googleapp_collections_web_fragment_container);
            if (a.f363799d.getChildFragmentManager().f634a.mo671c("WEB_FRAGMENT") == null) {
                C43861g b = C43864j.m77436b(a.f363797b);
                C0154a aVar = new C0154a(a.f363799d.getChildFragmentManager());
                aVar.mo511h(R.id.googleapp_collections_web_fragment_container, b, "WEB_FRAGMENT", 1);
                aVar.mo509f();
                a.f363805j.mo111204a(a.mo111211a());
            }
            C2043bi.m5555ai(findViewById, new C133495ab(findViewById, C133494aa.TOP, C133494aa.BOTTOM));
            a.f363800e.mo50708b(a.f363801f.mo46469b(), C46788de.DONT_CARE, a.f363810o);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C133511i.m216714a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f363785e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C133511i.m216714a(th, th);
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
            C133511i.m216714a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C133491a.class, new C133523t(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133511i.m216714a(th, th);
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
            if (!this.f363785e) {
                super.onAttach(context);
                if (this.f363782a == null) {
                    Object jN = mo111200d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C133514l bx = ((C74176nj) jN).mo69554bx();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C133512j) {
                        C133512j jVar = (C133512j) fragment;
                        C68225k.m98532d(jVar);
                        this.f363782a = new C133521s(accountId, bx, jVar, ((C74176nj) jN).mo69726fJ(), ((C74176nj) jN).mo69736fT(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C136832c) ((C74176nj) jN).f206730b.f198022V.mo17428b(), new C133525v((C136832c) ((C74176nj) jN).f206730b.f198022V.mo17428b()), ((C74176nj) jN).mo69766fx(), new C133502c(((C74176nj) jN).mo69766fx(), new C133501b(((C74176nj) jN).f206730b.mo66150cq()), (C133503d) ((C74176nj) jN).mo69850hh()), new C133504e(((C74176nj) jN).mo69697eh(), (C133503d) ((C74176nj) jN).mo69850hh(), ((C46897i) new C69077ct(((C74176nj) jN).f206730b.f198027a.f199228b.f198009I).f185291a.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45357972").mo50907f()), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f363784d));
                    } else {
                        String obj = C133521s.class.toString();
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
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C133511i.m216714a(th2, th3);
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

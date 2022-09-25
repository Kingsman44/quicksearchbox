package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.aqe;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10285c.C135736j;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e.C135767j;
import com.google.android.apps.search.googleapp.googleappbrowser.p10261b.C135505b;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.bottomsheetbehavior.LockableBottomSheetBehavior;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10308a.C136042d;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10309b.C136071a;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10309b.C136072b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.p3353c.p3355b.C43348q;
import com.google.android.libraries.web.shared.lifecycle.C44103d;
import com.google.android.libraries.web.shared.lifecycle.C44106g;
import com.google.android.libraries.web.weblayer.contrib.p3453b.C44163a;
import com.google.android.libraries.web.weblayer.contrib.p3453b.C44168b;
import com.google.android.libraries.web.weblayer.contrib.p3453b.C44169c;
import com.google.android.libraries.web.weblayer.contrib.p3453b.p3454a.C44167d;
import com.google.android.libraries.web.weblayer.contrib.p3457e.C44195b;
import com.google.android.libraries.web.weblayer.contrib.p3457e.C44196c;
import com.google.android.libraries.web.weblayer.contrib.p3457e.C44197d;
import com.google.android.libraries.web.weblayer.contrib.p3457e.C44201h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.local.C46855i;
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
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3711b.C47697e;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60888db;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.z */
/* compiled from: PG */
public final class C136108z extends C136080bf implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    public final C2393x f370673a = new C2393x(this);

    /* renamed from: c */
    private C136053ak f370674c;

    /* renamed from: d */
    private Context f370675d;

    /* renamed from: e */
    private boolean f370676e;

    @Deprecated
    public C136108z() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C136053ak mo17754z() {
        C136053ak akVar = this.f370674c;
        if (akVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f370676e) {
            return akVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112738b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f370675d == null) {
            this.f370675d = new C47236e((Fragment) this, super.getContext());
        }
        return this.f370675d;
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
        return this.f370673a;
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
            C136107y.m221138a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C136053ak a = mo17754z();
            a.f370518f.mo50828h(R.id.googleapp_browser_bottombar_controller_subscription, new C136071a(a.f370523k), new C136052aj(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136107y.m221138a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C136053ak a = mo17754z();
            int i = 0;
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.googleapp_browser_fragment_bottombar, viewGroup, false);
            a.f370526n.mo33801b(viewGroup2.findViewById(R.id.googleapp_browser_bottomsheet_container), a.f370526n.f76990a.mo33805a(C28427h.m53115a(115059)));
            a.mo112715b(true);
            if (!a.f370531s) {
                viewGroup2.findViewById(R.id.googleapp_browser_bottomsheet_draghandle).setVisibility(8);
            }
            if (a.f370530r) {
                C136066aw awVar = a.f370528p;
                View findViewById = viewGroup2.findViewById(R.id.googleapp_browser_bottomsheet_draghandle);
                awVar.f370574k = findViewById;
                if (awVar.f370565b) {
                    if (true != awVar.f370567d.f115861D) {
                        i = 4;
                    }
                    findViewById.setVisibility(i);
                }
            }
            View findViewById2 = viewGroup2.findViewById(R.id.googleapp_browser_bottomsheet_container);
            LockableBottomSheetBehavior lockableBottomSheetBehavior = a.f370522j;
            C1773f fVar = new C1773f(-1, -1);
            fVar.mo4974a(lockableBottomSheetBehavior);
            findViewById2.setLayoutParams(fVar);
            a.f370516d.mo50707a(a.f370520h.mo46469b(), a.f370527o);
            C136066aw awVar2 = a.f370528p;
            awVar2.f370573j = viewGroup2;
            C44197d dVar = a.f370517e;
            if (!dVar.f114975b.mo46385c().equals(C43271v.WEB_VIEW)) {
                C44103d dVar2 = new C44103d(dVar.f114974a, C44201h.class);
                C44195b bVar = new C44195b(awVar2);
                C44196c cVar = new C44196c(awVar2);
                dVar2.f114795a = bVar;
                dVar2.f114796b = cVar;
                dVar2.f114797c = true;
                dVar2.mo47075a("ScrollEventMixin#register");
            }
            C44169c cVar2 = a.f370519g;
            C136066aw awVar3 = a.f370528p;
            if (!cVar2.f114919b.mo46385c().equals(C43271v.WEB_VIEW)) {
                C44103d dVar3 = new C44103d(cVar2.f114918a, C44167d.class);
                C44163a aVar = new C44163a(awVar3);
                C44168b bVar2 = new C44168b(awVar3);
                dVar3.f114795a = aVar;
                dVar3.f114796b = bVar2;
                dVar3.f114797c = true;
                dVar3.mo47075a("BrowserControlsMixin#register");
            }
            if (viewGroup2 != null) {
                C47831fm.m85019n();
                return viewGroup2;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C136107y.m221138a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C136053ak a = mo17754z();
            LockableBottomSheetBehavior lockableBottomSheetBehavior = a.f370522j;
            lockableBottomSheetBehavior.f115869L.remove(a.f370521i);
            c.close();
            return;
        } catch (Throwable th) {
            C136107y.m221138a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f370676e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136107y.m221138a(th, th);
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
            C136107y.m221138a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C136053ak a = mo17754z();
            C47393f.m84233d(this, C135505b.class, new C136055al(a));
            C47393f.m84233d(this, C136057an.class, new C136056am(a));
            this.f54442o.mo24720k(bundle);
            C136053ak a2 = mo17754z();
            a2.f370521i.mo112713c(a2.f370528p);
            Optional optional = a2.f370529q;
            C136042d dVar = a2.f370521i;
            Objects.requireNonNull(dVar);
            optional.ifPresent(new C136048af(dVar));
            a2.f370521i.mo112713c(a2.f370532t);
            a2.f370521i.mo112713c(a2.f370533u);
            if (!a2.f370515c) {
                a2.f370521i.mo112713c(new C136100r(view.findViewById(R.id.googleapp_browser_bottomsheet_bottombar_container), view.findViewById(R.id.googleapp_browser_bottomsheet_bottombar_superg), view));
            }
            Collection.EL.stream(a2.f370524l.values()).filter(C136045ac.f370505a).forEach(C136049ag.f370509a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136107y.m221138a(th, th);
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
        C136108z zVar = this;
        zVar.f122869b.mo51381i();
        try {
            if (!zVar.f370676e) {
                super.onAttach(context);
                if (zVar.f370674c == null) {
                    Object jN = mo112739d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C136108z) {
                        C136108z zVar2 = (C136108z) fragment;
                        C68225k.m98532d(zVar2);
                        C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                        C44197d dVar = new C44197d(new C44106g((Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, (C60888db) ((C74176nj) jN).f206677a.j.mo17428b()), (C43269t) ((C74176nj) jN).f207085l.mo17428b());
                        C46855i iVar = (C46855i) ((C74176nj) jN).f207083j.mo17428b();
                        C44169c cVar = new C44169c(new C44106g((Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, (C60888db) ((C74176nj) jN).f206677a.j.mo17428b()), (C43269t) ((C74176nj) jN).f207085l.mo17428b());
                        C43348q fT = ((C74176nj) jN).mo69736fT();
                        C136072b cv = ((C74176nj) jN).mo69605cv();
                        C58528ij F = C58528ij.m90006F(((C74176nj) jN).mo69831hI());
                        C58495hd n = C58495hd.m89900n("GoogleOnContentEmbeddedFragment", new C135767j((AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo67119kg(), ((C74176nj) jN).mo69605cv(), (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a));
                        AccountId accountId2 = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                        C69664n.m101061g(accountId2, "accountId");
                        C58495hd n2 = C58495hd.m89900n("FindInPageBarFragmentPeer", new C135736j(accountId2));
                        C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                        C47697e eVar = new C47697e((C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                        C136060aq aqVar = new C136060aq(((C74176nj) jN).f206677a.a.f202879fR);
                        C69464a aVar = ((C74176nj) jN).f206677a.n;
                        C136060aq aqVar2 = aqVar;
                        aqe aqe = ((C74176nj) jN).f206730b.f198027a;
                        C47697e eVar2 = eVar;
                        C136060aq aqVar3 = aqVar2;
                        C136067ax axVar = new C136067ax(aVar, aqe.f199525gf, aqe.f199536gq);
                        zVar = this;
                        zVar.f370674c = new C136053ak(accountId, zVar2, dpVar, dVar, iVar, cVar, fT, cv, F, n, n2, abVar, eVar2, aqVar3, axVar, ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45366633").mo50907f(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199536gq.mo17428b()).booleanValue());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(zVar.f122869b, zVar.f370673a));
                    } else {
                        String obj = C136053ak.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = zVar.f122869b;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            th = th;
            Throwable th2 = th;
            C47831fm.m85019n();
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

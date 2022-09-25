package com.google.android.apps.search.googleapp.googleappbrowser;

import android.app.assist.AssistContent;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import androidx.navigation.C3896q;
import androidx.navigation.fragment.C3884h;
import com.google.android.apps.search.googleapp.activity.C133416bc;
import com.google.android.apps.search.googleapp.activity.p10137b.C133411h;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135459e;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135464j;
import com.google.android.apps.search.googleapp.p10527u.C139761b;
import com.google.android.apps.search.googleapp.p10527u.C139768i;
import com.google.android.apps.search.googleapp.p10527u.C139775p;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.inject.C47231d;
import com.google.protobuf.C62934bn;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.bd */
/* compiled from: PG */
public final class C135511bd implements C139761b, C139768i, C133416bc {

    /* renamed from: a */
    public final C46485f f369142a;

    /* renamed from: b */
    public final C133411h f369143b;

    /* renamed from: c */
    public final C28306ab f369144c;

    /* renamed from: d */
    public final C28310af f369145d;

    /* renamed from: e */
    public final C3896q f369146e = new C135510bc(this);

    /* renamed from: f */
    private final Fragment f369147f;

    /* renamed from: g */
    private final C135462h f369148g;

    public C135511bd(Fragment fragment, C135462h hVar, C46485f fVar, C133411h hVar2, C28306ab abVar, C28310af afVar) {
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(fVar, "accountNavigation");
        C69664n.m101061g(hVar2, "navigationBarStateDataService");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(afVar, "visualElements");
        this.f369147f = fragment;
        this.f369148g = hVar;
        this.f369142a = fVar;
        this.f369143b = hVar2;
        this.f369144c = abVar;
        this.f369145d = afVar;
    }

    /* renamed from: l */
    private final C139761b m219700l() {
        return (C139761b) m219701m(C139761b.class);
    }

    /* renamed from: m */
    private final Object m219701m(Class cls) {
        Fragment fragment = mo112375k().getChildFragmentManager().f650q;
        if (fragment != null && (fragment instanceof C47231d)) {
            C47231d dVar = (C47231d) fragment;
            if (cls.isInstance(dVar.mo17754z())) {
                Object z = dVar.mo17754z();
                C69664n.m101059e(z, "null cannot be cast to non-null type T of com.google.android.apps.search.googleapp.googleappbrowser.GoogleAppBrowserNavigationRootFragmentPeer.castPrimaryNavigationFragment$lambda-4");
                return z;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo111136a(AssistContent assistContent) {
        C69664n.m101061g(assistContent, "outContent");
        C133416bc bcVar = (C133416bc) m219701m(C133416bc.class);
        if (bcVar != null) {
            bcVar.mo111136a(assistContent);
        }
    }

    /* renamed from: b */
    public final void mo111219b(C139779t tVar) {
        C69664n.m101061g(tVar, "destinationTab");
        C139761b l = m219700l();
        if (l != null) {
            l.mo111219b(tVar);
        }
    }

    /* renamed from: c */
    public final void mo111220c(C139775p pVar) {
        C69664n.m101061g(pVar, "tabParams");
        C139761b l = m219700l();
        if (l != null) {
            l.mo111220c(pVar);
        }
    }

    /* renamed from: d */
    public final void mo111221d() {
        C139761b l = m219700l();
        if (l != null) {
            l.mo111221d();
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo111222e() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo111223f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo111224g() {
        C139768i iVar = (C139768i) m219701m(C139768i.class);
        if (iVar == null || !iVar.mo111224g()) {
            return mo112375k().mo8129a().mo8061u();
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo111225h() {
        C139761b l = m219700l();
        if (l != null) {
            return l.mo111225h();
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo111226i() {
        C139761b l = m219700l();
        if (l != null) {
            return l.mo111226i();
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo111227j() {
        C139761b l = m219700l();
        if (l != null) {
            return l.mo111227j();
        }
        return true;
    }

    /* renamed from: k */
    public final C3884h mo112375k() {
        C3884h hVar = (C3884h) this.f369147f.getChildFragmentManager().f634a.mo670b(R.id.googleapp_browser_navigation_container);
        if (hVar != null) {
            return hVar;
        }
        C46485f fVar = this.f369142a;
        C62934bn builder = this.f369148g.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C135464j a = C69664n.m101061g((C135459e) builder, "builder");
        a.mo112353b();
        C3884h b = fVar.mo50481b(R.navigation.googleapp_browser_nav_graph, C46490k.m82868a(a.mo112352a()).mo50504d());
        FragmentManager childFragmentManager = this.f369147f.getChildFragmentManager();
        C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
        C0154a aVar = new C0154a(childFragmentManager);
        aVar.mo511h(R.id.googleapp_browser_navigation_container, b, (String) null, 1);
        aVar.mo518o(b);
        aVar.mo509f();
        return b;
    }
}

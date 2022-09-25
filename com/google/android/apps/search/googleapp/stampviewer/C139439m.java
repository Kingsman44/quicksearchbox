package com.google.android.apps.search.googleapp.stampviewer;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139324f;
import com.google.android.apps.search.googleapp.stampviewer.p10493e.C139387f;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.apps.search.googleapp.stampviewer.p10495g.C139413p;
import com.google.android.apps.search.googleapp.stampviewer.preview.C139483z;
import com.google.android.apps.search.googleapp.stampviewer.viewpager.C139491b;
import com.google.android.apps.search.googleapp.stampviewer.viewpager.C139492c;
import com.google.android.apps.search.googleapp.stampviewer.viewpager.C139499j;
import com.google.android.apps.search.googleapp.stampviewer.viewpager.C139500k;
import com.google.android.apps.search.googleapp.stampviewer.viewpager.C139503n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47707g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4566l.C60200dk;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.p5494b.C69803b;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.m */
/* compiled from: PG */
public final class C139439m {

    /* renamed from: v */
    private static final C59071e f379146v = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.m");

    /* renamed from: a */
    public final AccountId f379147a;

    /* renamed from: b */
    public final C139324f f379148b;

    /* renamed from: c */
    public final C139433j f379149c;

    /* renamed from: d */
    public final C139317ac f379150d;

    /* renamed from: e */
    public final C47707g f379151e;

    /* renamed from: f */
    public final C28306ab f379152f;

    /* renamed from: g */
    public final C139387f f379153g;

    /* renamed from: h */
    public final C139492c f379154h;

    /* renamed from: i */
    public final int f379155i;

    /* renamed from: j */
    public final boolean f379156j;

    /* renamed from: k */
    public final C139503n f379157k;

    /* renamed from: l */
    public final C139500k f379158l;

    /* renamed from: m */
    public C139499j f379159m;

    /* renamed from: n */
    public C136247a f379160n;

    /* renamed from: o */
    public final C37215b f379161o;

    /* renamed from: p */
    public C139491b f379162p;

    /* renamed from: q */
    public int f379163q;

    /* renamed from: r */
    public int f379164r;

    /* renamed from: s */
    public C139483z f379165s;

    /* renamed from: t */
    public C69803b f379166t = null;

    /* renamed from: u */
    public final C139413p f379167u;

    /* renamed from: w */
    private final C28443m f379168w;

    public C139439m(AccountId accountId, C139324f fVar, C139413p pVar, C139433j jVar, C47707g gVar, C28306ab abVar, C28443m mVar, C139387f fVar2, C139492c cVar, long j, boolean z, C139503n nVar, C139500k kVar, C69464a aVar, C69464a aVar2, C37215b bVar) {
        this.f379147a = accountId;
        this.f379148b = fVar;
        this.f379149c = jVar;
        this.f379150d = new C139317ac();
        this.f379167u = pVar;
        this.f379151e = gVar;
        this.f379152f = abVar;
        this.f379168w = mVar;
        this.f379153g = fVar2;
        this.f379162p = null;
        this.f379154h = cVar;
        this.f379155i = (int) j;
        this.f379156j = z;
        this.f379157k = nVar;
        this.f379158l = kVar;
        this.f379161o = bVar;
        if (jVar.getActivity() != null) {
            this.f379160n = (C136247a) aVar.mo17428b();
        }
        if (jVar.getActivity() != null) {
            ((IncognitoLifecycleObserver) aVar2.mo17428b()).mo112948g();
        }
    }

    /* renamed from: c */
    public static void m226587c(String str, ConstraintLayout constraintLayout) {
        C1756o oVar = new C1756o();
        oVar.mo4889i(constraintLayout);
        oVar.mo4885e(R.id.googleapp_stamp_viewer_view_pager).f5342e.f5347A = str;
        oVar.mo4888h(constraintLayout);
    }

    /* renamed from: d */
    private final void m226588d() {
        C139324f fVar = this.f379148b;
        this.f379164r = fVar.f378929c;
        C139317ac acVar = this.f379150d;
        C62971cq cqVar = fVar.f378928b;
        synchronized (acVar.f378902a) {
            acVar.f378902a.clear();
            acVar.mo114893d((List) Collection.EL.stream(cqVar).map(C139487t.f379270a).collect(Collectors.toCollection(C139488u.f379271a)));
        }
        this.f379163q = this.f379150d.mo114890a();
    }

    /* renamed from: a */
    public final void mo114964a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("stampViewerCurrentPosition") || !bundle.containsKey("stampViewerAmpWebViewParamsList")) {
            m226588d();
            return;
        }
        this.f379164r = bundle.getInt("stampViewerCurrentPosition");
        try {
            List k = ProtoParsers.m95528k(bundle, "stampViewerAmpWebViewParamsList", C139392b.f379029j, C62921ba.m95368a());
            C139317ac acVar = this.f379150d;
            synchronized (acVar.f378902a) {
                acVar.f378902a.clear();
                acVar.mo114893d(k);
            }
            this.f379163q = this.f379150d.mo114890a();
        } catch (BadParcelableException | C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f379146v.mo56226d()).mo56382g(e)).mo56372aa(41370)).mo56386p("Failed to recreate fragment");
            m226588d();
        }
    }

    /* renamed from: b */
    public final void mo114965b(int i, ViewPager viewPager, C60200dk dkVar, boolean z) {
        viewPager.mo9147l(i);
        C139491b bVar = this.f379162p;
        bVar.getClass();
        Optional map = bVar.mo115008o(i).map(C139437k.f379144a);
        if (map.isEmpty()) {
            ((C59052c) ((C59052c) f379146v.mo56226d()).mo56372aa(41371)).mo56386p("Can't log stamp tap event because view is not yet available");
        } else if (z) {
            C28443m mVar = this.f379168w;
            C28440j a = C28442l.m53135a();
            a.mo33895b(C28442l.m53143i(dkVar));
            a.mo33895b(C28375ak.m53063e(2));
            mVar.mo33853c(a.mo33894a(), C28485y.m53234a((View) map.get()));
        } else {
            C28443m mVar2 = this.f379168w;
            C28440j h = C28442l.m53142h();
            h.mo33895b(C28442l.m53143i(dkVar));
            mVar2.mo33853c(h.mo33894a(), C28485y.m53234a((View) map.get()));
        }
    }
}

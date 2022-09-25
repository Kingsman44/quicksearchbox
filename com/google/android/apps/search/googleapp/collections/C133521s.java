package com.google.android.apps.search.googleapp.collections;

import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.view.View;
import com.google.android.apps.search.googleapp.collections.p10143b.C133502c;
import com.google.android.apps.search.googleapp.collections.p10143b.C133504e;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.collections.s */
/* compiled from: PG */
public final class C133521s {

    /* renamed from: a */
    public static final C59071e f363796a = C59071e.m91332i("com.google.android.apps.search.googleapp.collections.s");

    /* renamed from: b */
    public final AccountId f363797b;

    /* renamed from: c */
    public final RequestBlockMixin f363798c;

    /* renamed from: d */
    public final C133512j f363799d;

    /* renamed from: e */
    public final C46801dp f363800e;

    /* renamed from: f */
    public final C43377v f363801f;

    /* renamed from: g */
    public final C136832c f363802g;

    /* renamed from: h */
    public final C43262m f363803h;

    /* renamed from: i */
    public final C133525v f363804i;

    /* renamed from: j */
    public final C133502c f363805j;

    /* renamed from: k */
    public final C133504e f363806k;

    /* renamed from: l */
    public final C28310af f363807l;

    /* renamed from: m */
    public final C28306ab f363808m;

    /* renamed from: n */
    public C43369n f363809n = C43369n.UNSPECIFIED;

    /* renamed from: o */
    public final C46792di f363810o = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C133521s.f363796a.mo56226d()).mo56382g(th)).mo56372aa(40058)).mo56386p("Failed to get WebState.");
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            C133521s sVar = C133521s.this;
            View view = sVar.f363799d.getView();
            if (view != null) {
                C43369n a = C43369n.m76519a(uVar.f113330c);
                if (a == null) {
                    a = C43369n.UNSPECIFIED;
                }
                sVar.f363809n = a;
                switch (sVar.f363809n.ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                        sVar.mo111216f();
                        return;
                    case 4:
                        sVar.mo111214d();
                        sVar.mo111213c(view);
                        return;
                    case 5:
                        sVar.mo111214d();
                        C43363h hVar = uVar.f113331d;
                        if (hVar == null) {
                            hVar = C43363h.f113275f;
                        }
                        C43362g a2 = C43362g.m76515a(hVar.f113278b);
                        if (a2 == null) {
                            a2 = C43362g.UNSPECIFIED;
                        }
                        if (a2 != C43362g.SSL) {
                            C43363h hVar2 = uVar.f113331d;
                            if (hVar2 == null) {
                                hVar2 = C43363h.f113275f;
                            }
                            C43362g a3 = C43362g.m76515a(hVar2.f113278b);
                            if (a3 == null) {
                                a3 = C43362g.UNSPECIFIED;
                            }
                            if (a3 == C43362g.UNSPECIFIED) {
                                sVar.mo111212b(view, R.string.googleapp_collections_internal_error_message);
                                return;
                            } else {
                                sVar.mo111212b(view, R.string.googleapp_collections_connection_error_message);
                                return;
                            }
                        } else {
                            sVar.mo111213c(view);
                            return;
                        }
                    case 6:
                        sVar.mo111214d();
                        return;
                    default:
                        sVar.mo111216f();
                        return;
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: p */
    private final C133514l f363811p;

    public C133521s(AccountId accountId, C133514l lVar, C133512j jVar, RequestBlockMixin requestBlockMixin, C43377v vVar, C46801dp dpVar, C136832c cVar, C133525v vVar2, C43262m mVar, C133502c cVar2, C133504e eVar, C28310af afVar, C28306ab abVar) {
        this.f363797b = accountId;
        this.f363811p = lVar;
        this.f363799d = jVar;
        this.f363798c = requestBlockMixin;
        this.f363801f = vVar;
        this.f363800e = dpVar;
        this.f363802g = cVar;
        this.f363803h = mVar;
        this.f363804i = vVar2;
        this.f363805j = cVar2;
        this.f363806k = eVar;
        this.f363807l = afVar;
        this.f363808m = abVar;
    }

    /* renamed from: g */
    private final CircularProgressIndicator m216728g() {
        View view = this.f363799d.getView();
        if (view != null) {
            return (CircularProgressIndicator) view.findViewById(R.id.googleapp_collections_progress_bar);
        }
        return null;
    }

    /* renamed from: a */
    public final String mo111211a() {
        String str = this.f363811p.f363789b;
        Uri.Builder buildUpon = Uri.parse("https://www.google.com/collections").buildUpon();
        if (!str.isEmpty()) {
            for (String appendPath : Uri.parse(str).getPathSegments()) {
                buildUpon.appendPath(appendPath);
            }
        }
        return buildUpon.build().toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo111212b(View view, int i) {
        view.setVisibility(4);
        if (((C133505c) this.f363799d.getChildFragmentManager().f634a.mo671c("ERROR_FRAGMENT")) == null) {
            AccountId accountId = this.f363797b;
            C69664n.m101061g(accountId, "accountId");
            C133505c cVar = new C133505c();
            C68324h.m98669f(cVar);
            C47247a.m84047b(cVar, accountId);
            Bundle bundle = new Bundle();
            bundle.putInt("collectionsWebViewDialogMessage", i);
            cVar.setArguments(bundle);
            C0154a aVar = new C0154a(this.f363799d.getChildFragmentManager());
            aVar.mo685r(cVar, "ERROR_FRAGMENT");
            aVar.mo509f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo111213c(View view) {
        view.setVisibility(0);
        C133505c cVar = (C133505c) this.f363799d.getChildFragmentManager().f634a.mo671c("ERROR_FRAGMENT");
        if (cVar != null) {
            C0154a aVar = new C0154a(this.f363799d.getChildFragmentManager());
            aVar.mo516m(cVar);
            aVar.mo509f();
        }
    }

    /* renamed from: d */
    public final void mo111214d() {
        CircularProgressIndicator g = m216728g();
        if (g != null) {
            g.setVisibility(8);
            g.mo48272e();
        }
    }

    /* renamed from: e */
    public final void mo111215e() {
        this.f363803h.mo46336e();
    }

    /* renamed from: f */
    public final void mo111216f() {
        CircularProgressIndicator g = m216728g();
        if (g != null) {
            g.setVisibility(0);
            g.mo48278i();
        }
    }
}

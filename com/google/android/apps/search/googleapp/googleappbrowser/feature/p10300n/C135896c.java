package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10300n;

import android.view.View;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10300n.p10301a.C135889d;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43664l;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.n.c */
/* compiled from: PG */
public final class C135896c {

    /* renamed from: a */
    public static final C59071e f370110a = C59071e.m91331h();

    /* renamed from: b */
    public final C43664l f370111b;

    /* renamed from: c */
    public final AccountId f370112c;

    /* renamed from: d */
    public final C135895b f370113d;

    /* renamed from: e */
    public final C46801dp f370114e;

    /* renamed from: f */
    public final C28306ab f370115f;

    /* renamed from: g */
    public final C43377v f370116g;

    /* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.n.c$a */
    /* compiled from: PG */
    final class C135897a implements C46792di {

        /* renamed from: a */
        private final View f370117a;

        /* renamed from: b */
        private final View f370118b;

        public C135897a(View view, View view2) {
            C69664n.m101061g(view, "ampUrlBar");
            C69664n.m101061g(view2, "webxUrlBar");
            this.f370117a = view;
            this.f370118b = view2;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
            C59052c cVar = (C59052c) ((C59052c) C135896c.f370110a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(40643));
            cVar.mo56386p("Failed to fetch WebState.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            C69664n.m101061g(uVar, "state");
            String str = uVar.f113329b;
            C69664n.m101060f(str, "state.currentUrl");
            if (C135889d.m220486a(str)) {
                this.f370117a.setVisibility(0);
                this.f370118b.setVisibility(8);
                return;
            }
            this.f370118b.setVisibility(0);
            this.f370117a.setVisibility(8);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C135896c(C43664l lVar, AccountId accountId, C135895b bVar, C46801dp dpVar, C28306ab abVar, C43377v vVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(abVar, "viewVisualElements");
        this.f370111b = lVar;
        this.f370112c = accountId;
        this.f370113d = bVar;
        this.f370114e = dpVar;
        this.f370115f = abVar;
        this.f370116g = vVar;
    }
}

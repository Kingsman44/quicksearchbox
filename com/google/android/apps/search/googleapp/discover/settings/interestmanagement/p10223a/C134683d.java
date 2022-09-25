package com.google.android.apps.search.googleapp.discover.settings.interestmanagement.p10223a;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.libraries.web.coordinator.C43730b;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.interestmanagement.a.d */
/* compiled from: PG */
public final class C134683d {

    /* renamed from: a */
    public static final C59071e f366760a = C59071e.m91331h();

    /* renamed from: b */
    public final String f366761b;

    /* renamed from: c */
    public final C134682c f366762c;

    /* renamed from: d */
    public final AccountId f366763d;

    /* renamed from: e */
    public final C46801dp f366764e;

    /* renamed from: f */
    public final C28306ab f366765f;

    /* renamed from: g */
    public final C43377v f366766g;

    /* renamed from: h */
    public final Fragment f366767h;

    /* renamed from: i */
    public final C134684a f366768i = new C134684a();

    /* renamed from: com.google.android.apps.search.googleapp.discover.settings.interestmanagement.a.d$a */
    /* compiled from: PG */
    final class C134684a implements C46792di {
        public C134684a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
            C59052c cVar = (C59052c) ((C59052c) C134683d.f366760a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(40420));
            cVar.mo56386p("Failed to get WebState.");
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            C69664n.m101061g(uVar, "webState");
            C43369n a = C43369n.m76519a(uVar.f113330c);
            if (a == null) {
                a = C43369n.UNSPECIFIED;
            }
            if (a == C43369n.FAILED) {
                C43363h hVar = uVar.f113331d;
                if (hVar == null) {
                    hVar = C43363h.f113275f;
                }
                C69664n.m101060f(hVar, "webState.error");
                C59052c cVar = (C59052c) C134683d.f366760a.mo56226d();
                C43362g a2 = C43362g.m76515a(hVar.f113278b);
                if (a2 == null) {
                    a2 = C43362g.UNSPECIFIED;
                }
                String name = a2.name();
                String str = hVar.f113279c;
                cVar.mo56379ah(new C59094n(40421));
                cVar.mo56354G("Error loading page with type: %s and msg: %s", name, str);
                C0154a aVar = new C0154a(C134683d.this.f366762c.getChildFragmentManager());
                aVar.mo689v(R.id.googleapp_interestmanagement_web_fragment_container, C134683d.this.f366767h, "ERROR_PANE_FRAGMENT");
                aVar.mo509f();
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C134683d(String str, C134682c cVar, AccountId accountId, C46801dp dpVar, C28306ab abVar, C43377v vVar, Fragment fragment, IncognitoLifecycleObserver incognitoLifecycleObserver, C43730b bVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(incognitoLifecycleObserver, "incognitoLifecycleObserver");
        this.f366761b = str;
        this.f366762c = cVar;
        this.f366763d = accountId;
        this.f366764e = dpVar;
        this.f366765f = abVar;
        this.f366766g = vVar;
        this.f366767h = fragment;
        bVar.mo46766a();
        incognitoLifecycleObserver.mo112948g();
    }
}

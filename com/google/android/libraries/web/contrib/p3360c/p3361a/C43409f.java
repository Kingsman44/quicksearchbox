package com.google.android.libraries.web.contrib.p3360c.p3361a;

import android.os.Parcelable;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43370o;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.p3355b.C43338g;
import com.google.android.libraries.web.p3353c.p3355b.C43339h;
import com.google.android.libraries.web.p3420k.C43855b;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.contrib.c.a.f */
/* compiled from: PG */
public final class C43409f {

    /* renamed from: a */
    public static final C59071e f113409a = C59071e.m91331h();

    /* renamed from: b */
    public final String f113410b;

    /* renamed from: c */
    public final AccountId f113411c;

    /* renamed from: d */
    public final C46723bg f113412d;

    /* renamed from: e */
    public final C43406c f113413e;

    /* renamed from: f */
    public final C46801dp f113414f;

    /* renamed from: g */
    public final Executor f113415g;

    /* renamed from: h */
    public final Profile f113416h;

    /* renamed from: i */
    public final C434101 f113417i = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
            C59052c cVar = (C59052c) ((C59052c) C43409f.f113409a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(54084));
            cVar.mo56386p("Failed to fetch WebState");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            C69664n.m101061g(uVar, "state");
            C43855b a = C43409f.this.mo46508a();
            if (a != null && !a.isRemoving() && C43409f.this.mo46509b(uVar)) {
                C43409f fVar = C43409f.this;
                fVar.f113415g.execute(C47810es.m84977q(new C43408e(fVar)));
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: j */
    public boolean f113418j;

    public C43409f(String str, AccountId accountId, C46723bg bgVar, C43406c cVar, C46801dp dpVar, Executor executor) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bgVar, "dataSources");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(executor, "uiThreadExecutor");
        this.f113410b = str;
        this.f113411c = accountId;
        this.f113412d = bgVar;
        this.f113413e = cVar;
        this.f113414f = dpVar;
        this.f113415g = executor;
        Parcelable parcelable = cVar.requireArguments().getParcelable("profile");
        C69664n.m101058d(parcelable);
        this.f113416h = (Profile) parcelable;
    }

    /* renamed from: a */
    public final C43855b mo46508a() {
        return (C43855b) this.f113413e.getChildFragmentManager().f634a.mo671c("independent-web-fragment");
    }

    /* renamed from: b */
    public final boolean mo46509b(C43376u uVar) {
        C43338g gVar;
        C43369n a = C43369n.m76519a(uVar.f113330c);
        if (a == null) {
            a = C43369n.UNSPECIFIED;
        }
        if (C43370o.f113313a.contains(a)) {
            return true;
        }
        C43855b a2 = mo46508a();
        if (a2 == null || (gVar = (C43338g) ((C43339h) new WebModelProvider((Fragment) a2).mo47072a(C43339h.class)).f113209d.get()) == null || !gVar.mo46460y() || (uVar.f113328a & 64) != 0) {
            return false;
        }
        C43369n a3 = C43369n.m76519a(uVar.f113330c);
        if (a3 == null) {
            a3 = C43369n.UNSPECIFIED;
        }
        return a3 == C43369n.UNSPECIFIED;
    }
}

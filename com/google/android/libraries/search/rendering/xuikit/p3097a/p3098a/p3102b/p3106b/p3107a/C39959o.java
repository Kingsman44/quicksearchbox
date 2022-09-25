package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a;

import android.databinding.C0118a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.h.b.b;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a.p3108a.C39945c;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.p3616e.p3623f.C46355c;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4401a.C57722f;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.a.o */
/* compiled from: PG */
public final class C39959o {

    /* renamed from: a */
    public static final Drawable f105042a = new ColorDrawable(0);

    /* renamed from: b */
    public static final C59071e f105043b = C59071e.m91332i("com.google.android.libraries.search.rendering.xuikit.a.a.b.b.a.o");

    /* renamed from: c */
    public final AccountId f105044c;

    /* renamed from: d */
    public final C46175b f105045d;

    /* renamed from: e */
    public final C46801dp f105046e;

    /* renamed from: f */
    public final C30306o f105047f;

    /* renamed from: g */
    public final C30158c f105048g;

    /* renamed from: h */
    public final C39956l f105049h;

    /* renamed from: i */
    public final C39945c f105050i;

    /* renamed from: j */
    public final C39961b f105051j = new C39961b();

    /* renamed from: k */
    public final C40364q f105052k;

    /* renamed from: l */
    public C57722f f105053l;

    /* renamed from: m */
    public C58485gu f105054m;

    /* renamed from: n */
    public C39950f f105055n;

    /* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.a.o$a */
    /* compiled from: PG */
    final class C39960a implements C46792di {

        /* renamed from: a */
        public final AccountId f105056a;

        /* renamed from: b */
        private final C30306o f105057b;

        public C39960a(C30306o oVar, AccountId accountId) {
            this.f105057b = oVar;
            this.f105056a = accountId;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C39959o.f105043b.mo56225c()).mo56382g(th)).mo56372aa(53299)).mo56386p("Error while subscribing to account data service");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C58485gu guVar = (C58485gu) Collection.EL.stream((List) obj).filter(C39957m.f105040a).collect(C58370cn.f155946a);
            this.f105057b.f81934a.mo35795d(guVar);
            this.f105057b.f81934a.mo35796e((C46108a) Collection.EL.stream(guVar).filter(new C39958n(this)).findFirst().orElse(null));
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    /* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.a.o$b */
    /* compiled from: PG */
    final class C39961b implements C46792di {
        public C39961b() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C0118a.m116x(C39959o.f105043b.mo56225c(), "Error while subscribing to Mavatar drawables data service", 53300, th, C40364q.f106014a, C39959o.this.f105052k.mo42422a());
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C58485gu guVar = (C58485gu) Collection.EL.stream((List) obj).map(C39962p.f105059a).collect(C58370cn.f155946a);
            C58485gu guVar2 = C39959o.this.f105054m;
            if (guVar2 == null || !C58597ky.m90218i(guVar, guVar2)) {
                C39959o oVar = C39959o.this;
                oVar.f105054m = guVar;
                C39950f fVar = oVar.f105055n;
                if (fVar != null) {
                    fVar.mo42092b(guVar);
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C39959o(C57722f fVar, AccountId accountId, C46175b bVar, C46801dp dpVar, b bVar2, C39945c cVar, C40364q qVar) {
        this.f105053l = fVar;
        this.f105045d = bVar;
        this.f105044c = accountId;
        this.f105046e = dpVar;
        C46355c cVar2 = new C46355c(C58833ax.m90834k("google"));
        this.f105048g = cVar2;
        this.f105047f = new C30306o(cVar2);
        this.f105049h = new C39956l(bVar2, accountId);
        this.f105050i = cVar;
        this.f105052k = qVar;
    }

    /* renamed from: a */
    public static C58485gu m69402a(C57722f fVar) {
        return (C58485gu) Collection.EL.stream(fVar.f154215c).map(C39954j.f105036a).collect(C58370cn.f155946a);
    }
}

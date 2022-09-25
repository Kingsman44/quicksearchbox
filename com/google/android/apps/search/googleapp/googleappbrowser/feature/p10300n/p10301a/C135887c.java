package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10300n.p10301a;

import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43664l;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.shared.C44076a;
import com.google.android.libraries.web.shared.p3442b.C44081a;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.n.a.c */
/* compiled from: PG */
public final class C135887c {

    /* renamed from: a */
    public static final C59071e f370084a = C59071e.m91331h();

    /* renamed from: b */
    public final C43664l f370085b;

    /* renamed from: c */
    public final C28443m f370086c;

    /* renamed from: d */
    public final C47770dh f370087d;

    /* renamed from: e */
    public final C44081a f370088e;

    /* renamed from: f */
    public final C46801dp f370089f;

    /* renamed from: g */
    public final C43377v f370090g;

    /* renamed from: h */
    public final C28306ab f370091h;

    /* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.n.a.c$a */
    /* compiled from: PG */
    final class C135888a implements C46792di {

        /* renamed from: a */
        private final TextView f370092a;

        public C135888a(TextView textView) {
            C69664n.m101061g(textView, "textView");
            this.f370092a = textView;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
            C59052c cVar = (C59052c) ((C59052c) C135887c.f370084a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(40645));
            cVar.mo56386p("Failed to fetch WebState.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            C69664n.m101061g(uVar, "state");
            TextView textView = this.f370092a;
            String c = C44076a.m77820c(uVar.f113329b);
            if (c == null) {
                c = BuildConfig.FLAVOR;
            }
            textView.setText(c);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C135887c(C43664l lVar, C28443m mVar, C47770dh dhVar, C44081a aVar, C46801dp dpVar, C43377v vVar, C28306ab abVar) {
        C69664n.m101061g(mVar, "interactionLogger");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(aVar, "urlCopier");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(abVar, "viewVisualElements");
        this.f370085b = lVar;
        this.f370086c = mVar;
        this.f370087d = dhVar;
        this.f370088e = aVar;
        this.f370089f = dpVar;
        this.f370090g = vVar;
        this.f370091h = abVar;
    }
}

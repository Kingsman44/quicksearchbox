package com.google.android.apps.search.googleapp.discover.streamui.p10225a;

import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134706d;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58833ax;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57155l;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.p5496d.C69821c;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.a.a */
/* compiled from: PG */
public final class C134695a implements C69821c {

    /* renamed from: a */
    final /* synthetic */ C134698d f366802a;

    /* renamed from: b */
    private final String f366803b;

    /* renamed from: c */
    private final C57155l f366804c;

    /* renamed from: d */
    private boolean f366805d;

    public C134695a(C134698d dVar, String str, C57155l lVar) {
        C69664n.m101061g(str, "contentId");
        C69664n.m101061g(lVar, "animationTimings");
        this.f366802a = dVar;
        this.f366803b = str;
        this.f366804c = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25818a(Object obj) {
        C69664n.m101061g((C58833ax) obj, C42181t.f110467a);
        if (!this.f366805d) {
            this.f366805d = true;
        } else {
            C47393f.m84236g(new C134706d(this.f366803b, this.f366804c), this.f366802a.f366810b);
        }
    }
}

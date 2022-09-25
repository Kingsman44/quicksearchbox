package com.google.android.apps.search.googleapp.search.p10418j;

import com.google.apps.tiktok.coroutines.p3632a.C46595ad;
import com.google.apps.tiktok.coroutines.p3632a.C46599ah;
import com.google.apps.tiktok.coroutines.p3632a.C46600ai;
import com.google.apps.tiktok.coroutines.p3632a.C46601aj;
import com.google.apps.tiktok.coroutines.p3632a.C46602ak;
import com.google.apps.tiktok.coroutines.p3632a.C46603al;
import com.google.apps.tiktok.coroutines.p3632a.C46604am;
import com.google.apps.tiktok.coroutines.p3632a.C46605an;
import com.google.apps.tiktok.lifecycle.p3682a.C47415a;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71571du;
import p5462h.C69677g;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.j.j */
/* compiled from: PG */
public final class C137536j {

    /* renamed from: a */
    public static final C59071e f374077a = C59071e.m91331h();

    /* renamed from: b */
    public final C137534h f374078b;

    /* renamed from: c */
    public final C71571du f374079c;

    /* renamed from: d */
    private final C71422aw f374080d;

    /* renamed from: e */
    private final C47415a f374081e;

    public C137536j(C137534h hVar, C71422aw awVar) {
        C69664n.m101061g(hVar, "dataService");
        C69664n.m101061g(awVar, "coordinatorRetainedScope");
        this.f374078b = hVar;
        this.f374080d = awVar;
        C47415a aVar = new C47415a();
        this.f374081e = aVar;
        this.f374079c = C46595ad.m83090a(aVar.mo51258a(), awVar, new C137535i(this, (C69577g) null));
    }

    /* renamed from: a */
    public final void mo113802a() {
        this.f374081e.mo51259b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final boolean mo113803b() {
        C46605an anVar = (C46605an) this.f374079c.mo62784e();
        if ((anVar instanceof C46600ai) || (anVar instanceof C46602ak) || (anVar instanceof C46599ah)) {
            return true;
        }
        if (anVar instanceof C46601aj) {
            return ((Boolean) ((C46601aj) anVar).f121790a).booleanValue();
        }
        if (anVar instanceof C46604am) {
            return ((Boolean) ((C46604am) anVar).f121794a).booleanValue();
        }
        if (anVar instanceof C46603al) {
            return ((Boolean) ((C46603al) anVar).f121792a).booleanValue();
        }
        throw new C69677g();
    }
}

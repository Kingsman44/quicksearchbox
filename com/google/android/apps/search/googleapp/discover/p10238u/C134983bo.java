package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134281m;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134283o;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.bo */
/* compiled from: PG */
public final class C134983bo implements C134283o {

    /* renamed from: a */
    public final C60950i f367566a;

    /* renamed from: b */
    public final C42876ab f367567b;

    /* renamed from: c */
    private final C69585o f367568c;

    /* renamed from: d */
    private final Executor f367569d;

    /* renamed from: e */
    private final C71422aw f367570e;

    public C134983bo(C60950i iVar, C42876ab abVar, C69585o oVar, Executor executor, C71422aw awVar) {
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(abVar, "dataStore");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(awVar, "scope");
        this.f367566a = iVar;
        this.f367567b = abVar;
        this.f367568c = oVar;
        this.f367569d = executor;
        this.f367570e = awVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo111527a() {
        return C134281m.m217855a(this);
    }

    /* renamed from: b */
    public final void mo112104b(String str, C57259bn bnVar, C62722b bVar, Integer num) {
        C69664n.m101061g(bnVar, "requestReason");
        C46459k.m82829b(this.f367567b.mo46039a(new C134981bm(this, str, bnVar, bVar, num), this.f367569d), "Failed to add request to FeedClient debuggable", new Object[0]);
    }

    /* renamed from: c */
    public final Object mo111529c(C69577g gVar) {
        return C71803m.m105040a(this.f367568c, new C134982bn(this, (C69577g) null), gVar);
    }

    /* renamed from: d */
    public final C71422aw mo111530d() {
        return this.f367570e;
    }
}

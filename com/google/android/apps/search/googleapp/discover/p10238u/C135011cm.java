package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134281m;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134283o;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.cm */
/* compiled from: PG */
public final class C135011cm implements C134283o {

    /* renamed from: a */
    public final C60950i f367641a;

    /* renamed from: b */
    public final C42876ab f367642b;

    /* renamed from: c */
    public final Executor f367643c;

    /* renamed from: d */
    private final C69585o f367644d;

    /* renamed from: e */
    private final C71422aw f367645e;

    public C135011cm(C60950i iVar, C42876ab abVar, C69585o oVar, Executor executor, C71422aw awVar) {
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(abVar, "dataStore");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(awVar, "scope");
        this.f367641a = iVar;
        this.f367642b = abVar;
        this.f367644d = oVar;
        this.f367643c = executor;
        this.f367645e = awVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo111527a() {
        return C134281m.m217855a(this);
    }

    /* renamed from: c */
    public final Object mo111529c(C69577g gVar) {
        return C71803m.m105040a(this.f367644d, new C135010cl(this, (C69577g) null), gVar);
    }

    /* renamed from: d */
    public final C71422aw mo111530d() {
        return this.f367645e;
    }
}

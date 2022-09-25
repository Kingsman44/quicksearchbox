package com.google.android.libraries.web.webview.p3487i.p3488a.p3489a;

import com.google.android.libraries.web.profile.p3431a.C44051c;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.i.a.a.i */
/* compiled from: PG */
public final class C44434i implements C44051c {

    /* renamed from: a */
    public final C69585o f115507a;

    /* renamed from: b */
    private final C71422aw f115508b;

    /* renamed from: c */
    private final C69585o f115509c;

    public C44434i(C71422aw awVar, C69585o oVar, C69585o oVar2) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "mainImmediateContext");
        C69664n.m101061g(oVar2, "backgroundContext");
        this.f115508b = awVar;
        this.f115507a = oVar;
        this.f115509c = oVar2;
    }

    /* renamed from: a */
    public final C60870cx mo47012a(String str) {
        C69664n.m101061g(str, "url");
        return C71663i.m104692e(this.f115508b, C71424ay.UNDISPATCHED, new C44427b(this, str, (C69577g) null), 1);
    }

    /* renamed from: b */
    public final C60870cx mo47013b(String str, String str2) {
        C69664n.m101061g(str, "url");
        C69664n.m101061g(str2, "cookie");
        return C71663i.m104692e(this.f115508b, C71424ay.UNDISPATCHED, new C44428c(this, str, str2, (C69577g) null), 1);
    }

    /* renamed from: c */
    public final C60870cx mo47014c(String str, Iterable iterable) {
        C69664n.m101061g(str, "url");
        C69664n.m101061g(iterable, "cookies");
        return C71663i.m104692e(this.f115508b, C71424ay.UNDISPATCHED, new C44432g(this, str, iterable, (C69577g) null), 1);
    }

    /* renamed from: d */
    public final Object mo47015d(String str, C69577g gVar) {
        return C71803m.m105040a(this.f115509c, new C44426a(str, (C69577g) null), gVar);
    }

    /* renamed from: e */
    public final Object mo47016e(String str, Iterable iterable, C69577g gVar) {
        Object a = C71803m.m105040a(this.f115507a, new C44431f(iterable, this, str, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }
}

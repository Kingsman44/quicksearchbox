package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17215a;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17233b;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1392e.C17267a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66652ds;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: com.google.android.libraries.assistant.c.e.a.c.n */
/* compiled from: PG */
public final class C17249n implements C17215a {

    /* renamed from: a */
    public static final C59071e f50012a = C59071e.m91331h();

    /* renamed from: b */
    public final List f50013b;

    /* renamed from: c */
    public final C66652ds f50014c;

    /* renamed from: d */
    public final C17233b f50015d;

    /* renamed from: e */
    public final C17267a f50016e;

    /* renamed from: f */
    private final C71422aw f50017f;

    /* renamed from: g */
    private final List f50018g;

    public C17249n(C71422aw awVar, List list, List list2, C66652ds dsVar, C17233b bVar) {
        this.f50017f = awVar;
        this.f50013b = list;
        this.f50018g = list2;
        this.f50014c = dsVar;
        this.f50015d = bVar;
        this.f50016e = new C17267a(list2);
    }

    /* renamed from: b */
    public static final void m34427b(C69615a aVar) {
        try {
            aVar.mo5672a();
        } catch (Throwable th) {
            C59052c cVar = (C59052c) ((C59052c) f50012a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(42648));
            cVar.mo56384n();
        }
    }

    /* renamed from: a */
    public final C60870cx mo23243a() {
        C71604be c = C71803m.m105042c(this.f50017f, (C69585o) null, (C71424ay) null, new C17248m(this, (C69577g) null), 3);
        c.mo62873s(new C17245j(this));
        return C71663i.m104688a(c);
    }
}

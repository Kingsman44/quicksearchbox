package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2682f;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.Closeable;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.f.j */
/* compiled from: PG */
final class C34620j extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C34623m f91939a;

    /* renamed from: b */
    final /* synthetic */ C34613c f91940b;

    /* renamed from: c */
    final /* synthetic */ Closeable f91941c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34620j(C34623m mVar, C34613c cVar, Closeable closeable) {
        super(0);
        this.f91939a = mVar;
        this.f91940b = cVar;
        this.f91941c = closeable;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        C59052c cVar = (C59052c) C34622l.f91946a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordSuppression");
        C34623m mVar = this.f91939a;
        String str = this.f91940b.f91932c;
        cVar.mo56379ah(new C59094n(51415));
        cVar.mo56354G("Stopping hotword suppression(%s: %s).", mVar, str);
        this.f91941c.close();
        return C69788q.f186170a;
    }
}

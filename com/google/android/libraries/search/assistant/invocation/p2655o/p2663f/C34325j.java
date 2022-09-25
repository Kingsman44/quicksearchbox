package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.C121670a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p5462h.C69685i;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.j */
/* compiled from: PG */
final class C34325j extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ String f91268a;

    /* renamed from: b */
    final /* synthetic */ C121670a f91269b;

    /* renamed from: c */
    final /* synthetic */ C34326k f91270c;

    /* renamed from: d */
    final /* synthetic */ C69685i f91271d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34325j(String str, C121670a aVar, C34326k kVar, C69685i iVar) {
        super(1);
        this.f91268a = str;
        this.f91269b = aVar;
        this.f91270c = kVar;
        this.f91271d = iVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        C59052c cVar = (C59052c) C34326k.f91272a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.InvocationTracker");
        String str = this.f91268a;
        C61301b a = C34711b.m63445a(this.f91269b.mo105283a());
        cVar.mo56379ah(new C59094n(51338));
        cVar.mo56354G("Stop tracking invocation(%s => %s).", str, a);
        DesugarAtomicReference.updateAndGet(this.f91270c.f91275d, new C34324i(this.f91271d));
        return C69788q.f186170a;
    }
}

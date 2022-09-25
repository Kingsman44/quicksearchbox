package com.google.android.libraries.search.assistant.p2828y.p2850k;

import com.google.assistant.p3897e.p3917i.p3918a.C51286cb;
import com.google.assistant.p3897e.p3917i.p3918a.C51290cf;
import com.google.assistant.p3897e.p3917i.p3918a.C51291cg;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62962ci;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.y.k.d */
/* compiled from: PG */
final class C36985d extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C51286cb f96310a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36985d(C51286cb cbVar) {
        super(1);
        this.f96310a = cbVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        int intValue = ((Number) obj).intValue();
        C51286cb cbVar = this.f96310a;
        C51290cf cfVar = (C51290cf) C51291cg.f133521c.createBuilder();
        C69664n.m101060f(cfVar, "newBuilder()");
        C69664n.m101061g(cfVar, "builder");
        cfVar.copyOnWrite();
        C51291cg cgVar = (C51291cg) cfVar.instance;
        cgVar.f133523a |= 2;
        cgVar.f133524b = intValue;
        C62942bv build = cfVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C51291cg cgVar2 = (C51291cg) build;
        C69664n.m101061g(cgVar2, "value");
        C51303cs csVar = cbVar.f133515a;
        csVar.copyOnWrite();
        C51334dw dwVar = (C51334dw) csVar.instance;
        C62962ci ciVar = C51334dw.f133657N;
        cgVar2.getClass();
        dwVar.f133661B = cgVar2;
        dwVar.f133688b |= 16;
        return C69788q.f186170a;
    }
}

package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.p440an.p441a.C8841h;
import com.google.p4492ck.p4493a.p4494a.C58126a;
import com.google.p4492ck.p4493a.p4494a.C58127b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62971cq;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.ondevice.k.bw */
/* compiled from: PG */
public final /* synthetic */ class C24585bw implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58126a f67277a;

    /* renamed from: b */
    public final /* synthetic */ Map f67278b;

    /* renamed from: c */
    public final /* synthetic */ int f67279c;

    public /* synthetic */ C24585bw(C58126a aVar, Map map, int i) {
        this.f67277a = aVar;
        this.f67278b = map;
        this.f67279c = i;
    }

    public final void accept(Object obj) {
        C58126a aVar = this.f67277a;
        Map map = this.f67278b;
        int i = this.f67279c;
        Map.Entry entry = (Map.Entry) obj;
        String str = ((C8841h) entry.getKey()).f30255g;
        aVar.copyOnWrite();
        C58127b bVar = (C58127b) aVar.instance;
        C58127b bVar2 = C58127b.f155392g;
        str.getClass();
        C62971cq cqVar = bVar.f155397d;
        if (!cqVar.mo58948c()) {
            bVar.f155397d = C62942bv.mutableCopy(cqVar);
        }
        bVar.f155397d.add(str);
        float floatValue = ((Float) entry.getValue()).floatValue();
        aVar.copyOnWrite();
        C58127b bVar3 = (C58127b) aVar.instance;
        C62960cg cgVar = bVar3.f155398e;
        if (!cgVar.mo58948c()) {
            bVar3.f155398e = C62942bv.mutableCopy(cgVar);
        }
        bVar3.f155398e.mo58861g(floatValue);
        float intValue = ((float) ((Integer) Map.EL.getOrDefault(map, entry.getKey(), 0)).intValue()) / ((float) Math.max(i, 1));
        aVar.copyOnWrite();
        C58127b bVar4 = (C58127b) aVar.instance;
        C62960cg cgVar2 = bVar4.f155399f;
        if (!cgVar2.mo58948c()) {
            bVar4.f155399f = C62942bv.mutableCopy(cgVar2);
        }
        bVar4.f155399f.mo58861g(intValue);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

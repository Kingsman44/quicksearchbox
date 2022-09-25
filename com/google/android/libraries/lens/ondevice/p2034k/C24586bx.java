package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.p4492ck.p4493a.p4494a.C58126a;
import com.google.p4492ck.p4493a.p4494a.C58127b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62971cq;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.ondevice.k.bx */
/* compiled from: PG */
public final /* synthetic */ class C24586bx implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58126a f67280a;

    /* renamed from: b */
    public final /* synthetic */ Map f67281b;

    /* renamed from: c */
    public final /* synthetic */ int f67282c;

    public /* synthetic */ C24586bx(C58126a aVar, Map map, int i) {
        this.f67280a = aVar;
        this.f67281b = map;
        this.f67282c = i;
    }

    public final void accept(Object obj) {
        C58126a aVar = this.f67280a;
        Map map = this.f67281b;
        int i = this.f67282c;
        Map.Entry entry = (Map.Entry) obj;
        String str = (String) entry.getKey();
        aVar.copyOnWrite();
        C58127b bVar = (C58127b) aVar.instance;
        C58127b bVar2 = C58127b.f155392g;
        str.getClass();
        C62971cq cqVar = bVar.f155394a;
        if (!cqVar.mo58948c()) {
            bVar.f155394a = C62942bv.mutableCopy(cqVar);
        }
        bVar.f155394a.add(str);
        float floatValue = ((Float) entry.getValue()).floatValue();
        aVar.copyOnWrite();
        C58127b bVar3 = (C58127b) aVar.instance;
        C62960cg cgVar = bVar3.f155395b;
        if (!cgVar.mo58948c()) {
            bVar3.f155395b = C62942bv.mutableCopy(cgVar);
        }
        bVar3.f155395b.mo58861g(floatValue);
        float intValue = ((float) ((Integer) Map.EL.getOrDefault(map, entry.getKey(), 0)).intValue()) / ((float) Math.max(i, 1));
        aVar.copyOnWrite();
        C58127b bVar4 = (C58127b) aVar.instance;
        C62960cg cgVar2 = bVar4.f155396c;
        if (!cgVar2.mo58948c()) {
            bVar4.f155396c = C62942bv.mutableCopy(cgVar2);
        }
        bVar4.f155396c.mo58861g(intValue);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

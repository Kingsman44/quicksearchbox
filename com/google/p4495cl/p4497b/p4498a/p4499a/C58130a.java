package com.google.p4495cl.p4497b.p4498a.p4499a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.cl.b.a.a.a */
/* compiled from: PG */
public final class C58130a extends C62934bn implements C63001dt {
    public C58130a() {
        super(C58131b.f155403h);
    }

    /* renamed from: a */
    public final void mo54672a(Iterable iterable) {
        copyOnWrite();
        C58131b bVar = (C58131b) this.instance;
        C58131b bVar2 = C58131b.f155403h;
        C62961ch chVar = bVar.f155407c;
        if (!chVar.mo58948c()) {
            bVar.f155407c = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll(iterable, (List) bVar.f155407c);
    }

    /* renamed from: b */
    public final void mo54673b(Iterable iterable) {
        copyOnWrite();
        C58131b bVar = (C58131b) this.instance;
        C58131b bVar2 = C58131b.f155403h;
        bVar.mo54675a();
        C62947c.addAll(iterable, (List) bVar.f155409e);
    }

    /* renamed from: c */
    public final void mo54674c(String str) {
        copyOnWrite();
        C58131b bVar = (C58131b) this.instance;
        C58131b bVar2 = C58131b.f155403h;
        str.getClass();
        bVar.mo54676b();
        bVar.f155410f.add(str);
    }
}

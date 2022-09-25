package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.p375ai.p378b.C7746ik;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.ce */
/* compiled from: PG */
public final class C98411ce extends C62934bn implements C63001dt {
    public C98411ce() {
        super(C98414ch.f274733s);
    }

    /* renamed from: a */
    public final void mo91077a(Iterable iterable) {
        copyOnWrite();
        C98414ch chVar = (C98414ch) this.instance;
        C62962ci ciVar = C98414ch.f274732h;
        C62971cq cqVar = chVar.f274742i;
        if (!cqVar.mo58948c()) {
            chVar.f274742i = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) chVar.f274742i);
    }

    /* renamed from: b */
    public final void mo91078b(Iterable iterable) {
        copyOnWrite();
        C98414ch chVar = (C98414ch) this.instance;
        C62962ci ciVar = C98414ch.f274732h;
        C62971cq cqVar = chVar.f274747n;
        if (!cqVar.mo58948c()) {
            chVar.f274747n = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) chVar.f274747n);
    }

    /* renamed from: c */
    public final void mo91079c(Iterable iterable) {
        copyOnWrite();
        C98414ch chVar = (C98414ch) this.instance;
        C62962ci ciVar = C98414ch.f274732h;
        C62961ch chVar2 = chVar.f274741g;
        if (!chVar2.mo58948c()) {
            chVar.f274741g = C62942bv.mutableCopy(chVar2);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            chVar.f274741g.mo58916g(((C7746ik) it.next()).f27108J);
        }
    }

    /* renamed from: d */
    public final void mo91080d(int i) {
        copyOnWrite();
        C98414ch chVar = (C98414ch) this.instance;
        C62962ci ciVar = C98414ch.f274732h;
        chVar.mo91083a();
        chVar.f274740f.mo58916g(i);
    }

    /* renamed from: e */
    public final void mo91081e(int i) {
        copyOnWrite();
        C98414ch chVar = (C98414ch) this.instance;
        C62962ci ciVar = C98414ch.f274732h;
        chVar.mo91087e();
        chVar.f274748o.mo58916g(i);
    }
}

package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.s.b.az */
/* compiled from: PG */
public final class C19165az extends C62934bn implements C63001dt {
    public C19165az() {
        super(C19167ba.f53673s);
    }

    /* renamed from: a */
    public final void mo24301a(Iterable iterable) {
        copyOnWrite();
        C19167ba baVar = (C19167ba) this.instance;
        C62962ci ciVar = C19167ba.f53671c;
        C62971cq cqVar = baVar.f53688p;
        if (!cqVar.mo58948c()) {
            baVar.f53688p = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) baVar.f53688p);
    }

    /* renamed from: b */
    public final void mo24302b(Iterable iterable) {
        copyOnWrite();
        C19167ba baVar = (C19167ba) this.instance;
        C62962ci ciVar = C19167ba.f53671c;
        C62961ch chVar = baVar.f53677d;
        if (!chVar.mo58948c()) {
            baVar.f53677d = C62942bv.mutableCopy(chVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            baVar.f53677d.mo58916g(((C48672ag) it.next()).f125915O);
        }
    }

    /* renamed from: c */
    public final void mo24303c(Iterable iterable) {
        copyOnWrite();
        C19167ba baVar = (C19167ba) this.instance;
        C62962ci ciVar = C19167ba.f53671c;
        C62961ch chVar = baVar.f53676b;
        if (!chVar.mo58948c()) {
            baVar.f53676b = C62942bv.mutableCopy(chVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            baVar.f53676b.mo58916g(((C48672ag) it.next()).f125915O);
        }
    }
}

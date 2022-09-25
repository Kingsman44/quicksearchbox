package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.at.sr */
/* compiled from: PG */
public final class C50319sr extends C62934bn implements C63001dt {
    public C50319sr() {
        super(C50320ss.f130967c);
    }

    /* renamed from: a */
    public final void mo53393a(Iterable iterable) {
        copyOnWrite();
        C50320ss ssVar = (C50320ss) this.instance;
        C50320ss ssVar2 = C50320ss.f130967c;
        C62961ch chVar = ssVar.f130969a;
        if (!chVar.mo58948c()) {
            ssVar.f130969a = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll(iterable, (List) ssVar.f130969a);
    }

    /* renamed from: b */
    public final void mo53394b(String str) {
        copyOnWrite();
        C50320ss ssVar = (C50320ss) this.instance;
        C50320ss ssVar2 = C50320ss.f130967c;
        str.getClass();
        C62971cq cqVar = ssVar.f130970b;
        if (!cqVar.mo58948c()) {
            ssVar.f130970b = C62942bv.mutableCopy(cqVar);
        }
        ssVar.f130970b.add(str);
    }
}

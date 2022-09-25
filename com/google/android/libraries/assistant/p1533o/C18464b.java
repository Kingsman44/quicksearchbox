package com.google.android.libraries.assistant.p1533o;

import com.google.android.libraries.assistant.p1533o.p1534a.C18436a;
import com.google.android.libraries.assistant.p1533o.p1534a.C18437b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p5488io.grpc.C70293cv;

/* renamed from: com.google.android.libraries.assistant.o.b */
/* compiled from: PG */
final class C18464b implements C70293cv {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23994a(byte[] bArr) {
        Object obj;
        try {
            C18437b bVar = (C18437b) C62942bv.parseFrom((C62942bv) C18437b.f52327e, bArr, C62921ba.m95368a());
            C18436a aVar = (C18436a) C18437b.f52327e.createBuilder();
            int i = bVar.f52330b;
            aVar.copyOnWrite();
            C18437b bVar2 = (C18437b) aVar.instance;
            bVar2.f52329a |= 1;
            bVar2.f52330b = i;
            int i2 = bVar.f52331c;
            aVar.copyOnWrite();
            C18437b bVar3 = (C18437b) aVar.instance;
            bVar3.f52329a |= 2;
            bVar3.f52331c = i2;
            String str = bVar.f52332d;
            aVar.copyOnWrite();
            C18437b bVar4 = (C18437b) aVar.instance;
            str.getClass();
            bVar4.f52329a |= 4;
            bVar4.f52332d = str;
            C62940bt c = C62921ba.m95368a().mo58830c(C18437b.f52327e, bVar.f52330b);
            if (c != null && C18435a.m35910c(c)) {
                C62940bt r2 = C62942bv.checkIsLite(c);
                bVar.mo58887l(r2);
                Object l = bVar.f169962ag.mo58854l(r2.f169971d);
                if (l == null) {
                    obj = r2.f169969b;
                } else {
                    obj = r2.mo58889c(l);
                }
                aVar.mo58885m(c, obj);
            }
            return new C18488f((C18437b) aVar.build());
        } catch (C62974ct e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ byte[] mo23995b(Object obj) {
        return ((C18435a) obj).mo23985b().toByteArray();
    }
}

package com.google.protos.p4985f.p4986a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.j */
/* compiled from: PG */
public final class C64700j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64700j f175384b;

    /* renamed from: c */
    private static volatile C63010eb f175385c;

    /* renamed from: a */
    public C62971cq f175386a = emptyProtobufList();

    static {
        C64700j jVar = new C64700j();
        f175384b = jVar;
        C62942bv.registerDefaultInstance(C64700j.class, jVar);
    }

    private C64700j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f175384b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", C64698h.class});
            case 3:
                return new C64700j();
            case 4:
                return new C64699i();
            case 5:
                return f175384b;
            case 6:
                C63010eb ebVar = f175385c;
                if (ebVar == null) {
                    synchronized (C64700j.class) {
                        ebVar = f175385c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175384b);
                            f175385c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

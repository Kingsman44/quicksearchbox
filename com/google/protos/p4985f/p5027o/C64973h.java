package com.google.protos.p4985f.p5027o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.o.h */
/* compiled from: PG */
public final class C64973h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64973h f175959b;

    /* renamed from: c */
    private static volatile C63010eb f175960c;

    /* renamed from: a */
    public C62971cq f175961a = emptyProtobufList();

    static {
        C64973h hVar = new C64973h();
        f175959b = hVar;
        C62942bv.registerDefaultInstance(C64973h.class, hVar);
    }

    private C64973h() {
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
                return newMessageInfo(f175959b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", C64971f.class});
            case 3:
                return new C64973h();
            case 4:
                return new C64972g();
            case 5:
                return f175959b;
            case 6:
                C63010eb ebVar = f175960c;
                if (ebVar == null) {
                    synchronized (C64973h.class) {
                        ebVar = f175960c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175959b);
                            f175960c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

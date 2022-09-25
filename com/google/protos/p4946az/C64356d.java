package com.google.protos.p4946az;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.az.d */
/* compiled from: PG */
public final class C64356d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64356d f173957b;

    /* renamed from: c */
    private static volatile C63010eb f173958c;

    /* renamed from: a */
    public C62971cq f173959a = emptyProtobufList();

    static {
        C64356d dVar = new C64356d();
        f173957b = dVar;
        C62942bv.registerDefaultInstance(C64356d.class, dVar);
    }

    private C64356d() {
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
                return newMessageInfo(f173957b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64364l.class});
            case 3:
                return new C64356d();
            case 4:
                return new C64355c();
            case 5:
                return f173957b;
            case 6:
                C63010eb ebVar = f173958c;
                if (ebVar == null) {
                    synchronized (C64356d.class) {
                        ebVar = f173958c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173957b);
                            f173958c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

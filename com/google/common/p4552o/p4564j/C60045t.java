package com.google.common.p4552o.p4564j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.t */
/* compiled from: PG */
public final class C60045t extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C60045t f162295b;

    /* renamed from: c */
    private static volatile C63010eb f162296c;

    /* renamed from: a */
    public C62971cq f162297a = C62942bv.emptyProtobufList();

    static {
        C60045t tVar = new C60045t();
        f162295b = tVar;
        C62942bv.registerDefaultInstance(C60045t.class, tVar);
    }

    private C60045t() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f162295b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"a"});
            case 3:
                return new C60045t();
            case 4:
                return new C60044s();
            case 5:
                return f162295b;
            case 6:
                C63010eb ebVar = f162296c;
                if (ebVar == null) {
                    synchronized (C60045t.class) {
                        ebVar = f162296c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162295b);
                            f162296c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

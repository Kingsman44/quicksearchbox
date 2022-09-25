package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.ax */
/* compiled from: PG */
public final class C64575ax extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64575ax f175082b;

    /* renamed from: c */
    private static volatile C63010eb f175083c;

    /* renamed from: a */
    public C62971cq f175084a = emptyProtobufList();

    static {
        C64575ax axVar = new C64575ax();
        f175082b = axVar;
        C62942bv.registerDefaultInstance(C64575ax.class, axVar);
    }

    private C64575ax() {
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
                return newMessageInfo(f175082b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64571at.class});
            case 3:
                return new C64575ax();
            case 4:
                return new C64574aw();
            case 5:
                return f175082b;
            case 6:
                C63010eb ebVar = f175083c;
                if (ebVar == null) {
                    synchronized (C64575ax.class) {
                        ebVar = f175083c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175082b);
                            f175083c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

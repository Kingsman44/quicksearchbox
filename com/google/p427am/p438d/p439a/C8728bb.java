package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.bb */
/* compiled from: PG */
public final class C8728bb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8728bb f30064c;

    /* renamed from: d */
    private static volatile C63010eb f30065d;

    /* renamed from: a */
    public C62971cq f30066a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C8751by f30067b;

    static {
        C8728bb bbVar = new C8728bb();
        f30064c = bbVar;
        C62942bv.registerDefaultInstance(C8728bb.class, bbVar);
    }

    private C8728bb() {
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
                return newMessageInfo(f30064c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C8728bb();
            case 4:
                return new C8727ba();
            case 5:
                return f30064c;
            case 6:
                C63010eb ebVar = f30065d;
                if (ebVar == null) {
                    synchronized (C8728bb.class) {
                        ebVar = f30065d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30064c);
                            f30065d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

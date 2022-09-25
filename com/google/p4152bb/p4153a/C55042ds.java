package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.ds */
/* compiled from: PG */
public final class C55042ds extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55042ds f144811b;

    /* renamed from: c */
    private static volatile C63010eb f144812c;

    /* renamed from: a */
    public C62971cq f144813a = emptyProtobufList();

    static {
        C55042ds dsVar = new C55042ds();
        f144811b = dsVar;
        C62942bv.registerDefaultInstance(C55042ds.class, dsVar);
    }

    private C55042ds() {
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
                return newMessageInfo(f144811b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C55044du.class});
            case 3:
                return new C55042ds();
            case 4:
                return new C55041dr();
            case 5:
                return f144811b;
            case 6:
                C63010eb ebVar = f144812c;
                if (ebVar == null) {
                    synchronized (C55042ds.class) {
                        ebVar = f144812c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144811b);
                            f144812c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

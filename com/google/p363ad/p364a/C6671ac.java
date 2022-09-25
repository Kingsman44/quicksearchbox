package com.google.p363ad.p364a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ad.a.ac */
/* compiled from: PG */
public final class C6671ac extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C6671ac f19926b;

    /* renamed from: c */
    private static volatile C63010eb f19927c;

    /* renamed from: a */
    public C62971cq f19928a = C62942bv.emptyProtobufList();

    static {
        C6671ac acVar = new C6671ac();
        f19926b = acVar;
        C62942bv.registerDefaultInstance(C6671ac.class, acVar);
    }

    private C6671ac() {
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
                return newMessageInfo(f19926b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C6671ac();
            case 4:
                return new C6670ab();
            case 5:
                return f19926b;
            case 6:
                C63010eb ebVar = f19927c;
                if (ebVar == null) {
                    synchronized (C6671ac.class) {
                        ebVar = f19927c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19926b);
                            f19927c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

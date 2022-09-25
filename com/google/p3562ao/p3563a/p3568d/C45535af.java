package com.google.p3562ao.p3563a.p3568d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.af */
/* compiled from: PG */
public final class C45535af extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C45535af f119016b;

    /* renamed from: c */
    private static volatile C63010eb f119017c;

    /* renamed from: a */
    public C62971cq f119018a = emptyProtobufList();

    static {
        C45535af afVar = new C45535af();
        f119016b = afVar;
        C62942bv.registerDefaultInstance(C45535af.class, afVar);
    }

    private C45535af() {
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
                return newMessageInfo(f119016b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C45537ah.class});
            case 3:
                return new C45535af();
            case 4:
                return new C45534ae();
            case 5:
                return f119016b;
            case 6:
                C63010eb ebVar = f119017c;
                if (ebVar == null) {
                    synchronized (C45535af.class) {
                        ebVar = f119017c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119016b);
                            f119017c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

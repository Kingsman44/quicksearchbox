package com.google.p343ac.p352c.p354b.p355a.p356a;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ac.c.b.a.a.b */
/* compiled from: PG */
public final class C6658b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C6658b f19896b;

    /* renamed from: c */
    private static volatile C63010eb f19897c;

    /* renamed from: a */
    public C62971cq f19898a = emptyProtobufList();

    static {
        C6658b bVar = new C6658b();
        f19896b = bVar;
        C62942bv.registerDefaultInstance(C6658b.class, bVar);
    }

    private C6658b() {
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
                return newMessageInfo(f19896b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C62910ar.class});
            case 3:
                return new C6658b();
            case 4:
                return new C6657a();
            case 5:
                return f19896b;
            case 6:
                C63010eb ebVar = f19897c;
                if (ebVar == null) {
                    synchronized (C6658b.class) {
                        ebVar = f19897c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19896b);
                            f19897c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

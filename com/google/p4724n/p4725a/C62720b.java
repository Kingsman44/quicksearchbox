package com.google.p4724n.p4725a;

import com.google.frameworks.client.p4630b.C61329l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.n.a.b */
/* compiled from: PG */
public final class C62720b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62720b f169392b;

    /* renamed from: c */
    private static volatile C63010eb f169393c;

    /* renamed from: a */
    public C62971cq f169394a = emptyProtobufList();

    static {
        C62720b bVar = new C62720b();
        f169392b = bVar;
        C62942bv.registerDefaultInstance(C62720b.class, bVar);
    }

    private C62720b() {
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
                return newMessageInfo(f169392b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C61329l.class});
            case 3:
                return new C62720b();
            case 4:
                return new C62719a();
            case 5:
                return f169392b;
            case 6:
                C63010eb ebVar = f169393c;
                if (ebVar == null) {
                    synchronized (C62720b.class) {
                        ebVar = f169393c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169392b);
                            f169393c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

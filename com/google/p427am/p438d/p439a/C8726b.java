package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.b */
/* compiled from: PG */
public final class C8726b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8726b f30061b;

    /* renamed from: c */
    private static volatile C63010eb f30062c;

    /* renamed from: a */
    public C62971cq f30063a = emptyProtobufList();

    static {
        C8726b bVar = new C8726b();
        f30061b = bVar;
        C62942bv.registerDefaultInstance(C8726b.class, bVar);
    }

    private C8726b() {
        emptyProtobufList();
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
                return newMessageInfo(f30061b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C8763cj.class});
            case 3:
                return new C8726b();
            case 4:
                return new C8699a();
            case 5:
                return f30061b;
            case 6:
                C63010eb ebVar = f30062c;
                if (ebVar == null) {
                    synchronized (C8726b.class) {
                        ebVar = f30062c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30061b);
                            f30062c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

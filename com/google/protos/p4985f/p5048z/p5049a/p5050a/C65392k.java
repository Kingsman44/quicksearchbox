package com.google.protos.p4985f.p5048z.p5049a.p5050a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.a.a.k */
/* compiled from: PG */
public final class C65392k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65392k f177806b;

    /* renamed from: c */
    private static volatile C63010eb f177807c;

    /* renamed from: a */
    public C62971cq f177808a = C62942bv.emptyProtobufList();

    static {
        C65392k kVar = new C65392k();
        f177806b = kVar;
        C62942bv.registerDefaultInstance(C65392k.class, kVar);
    }

    private C65392k() {
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
                return newMessageInfo(f177806b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C65392k();
            case 4:
                return new C65391j();
            case 5:
                return f177806b;
            case 6:
                C63010eb ebVar = f177807c;
                if (ebVar == null) {
                    synchronized (C65392k.class) {
                        ebVar = f177807c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177806b);
                            f177807c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

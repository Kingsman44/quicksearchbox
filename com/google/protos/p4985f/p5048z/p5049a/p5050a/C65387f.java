package com.google.protos.p4985f.p5048z.p5049a.p5050a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.a.a.f */
/* compiled from: PG */
public final class C65387f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65387f f177799b;

    /* renamed from: c */
    private static volatile C63010eb f177800c;

    /* renamed from: a */
    public C62971cq f177801a = emptyProtobufList();

    static {
        C65387f fVar = new C65387f();
        f177799b = fVar;
        C62942bv.registerDefaultInstance(C65387f.class, fVar);
    }

    private C65387f() {
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
                return newMessageInfo(f177799b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C65386e.class});
            case 3:
                return new C65387f();
            case 4:
                return new C65384c();
            case 5:
                return f177799b;
            case 6:
                C63010eb ebVar = f177800c;
                if (ebVar == null) {
                    synchronized (C65387f.class) {
                        ebVar = f177800c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177799b);
                            f177800c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

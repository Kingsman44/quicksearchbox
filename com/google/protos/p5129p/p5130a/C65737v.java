package com.google.protos.p5129p.p5130a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.a.v */
/* compiled from: PG */
public final class C65737v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65737v f178587b;

    /* renamed from: d */
    private static volatile C63010eb f178588d;

    /* renamed from: a */
    public C62971cq f178589a = emptyProtobufList();

    /* renamed from: c */
    private byte f178590c = 2;

    static {
        C65737v vVar = new C65737v();
        f178587b = vVar;
        C62942bv.registerDefaultInstance(C65737v.class, vVar);
    }

    private C65737v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178590c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178590c = b;
                return null;
            case 2:
                return newMessageInfo(f178587b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C65736u.class});
            case 3:
                return new C65737v();
            case 4:
                return new C65734s();
            case 5:
                return f178587b;
            case 6:
                C63010eb ebVar = f178588d;
                if (ebVar == null) {
                    synchronized (C65737v.class) {
                        ebVar = f178588d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178587b);
                            f178588d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

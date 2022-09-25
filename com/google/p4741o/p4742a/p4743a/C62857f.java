package com.google.p4741o.p4742a.p4743a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.o.a.a.f */
/* compiled from: PG */
public final class C62857f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62857f f169740b;

    /* renamed from: c */
    private static volatile C63010eb f169741c;

    /* renamed from: a */
    public C62971cq f169742a = emptyProtobufList();

    static {
        C62857f fVar = new C62857f();
        f169740b = fVar;
        C62942bv.registerDefaultInstance(C62857f.class, fVar);
    }

    private C62857f() {
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
                return newMessageInfo(f169740b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C62853b.class});
            case 3:
                return new C62857f();
            case 4:
                return new C62856e();
            case 5:
                return f169740b;
            case 6:
                C63010eb ebVar = f169741c;
                if (ebVar == null) {
                    synchronized (C62857f.class) {
                        ebVar = f169741c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169740b);
                            f169741c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

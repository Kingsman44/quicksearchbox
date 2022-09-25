package com.google.p4283bv.p4412k.p4414b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.k.b.f */
/* compiled from: PG */
public final class C57842f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57842f f154542b;

    /* renamed from: c */
    private static volatile C63010eb f154543c;

    /* renamed from: a */
    public C62971cq f154544a = C62942bv.emptyProtobufList();

    static {
        C57842f fVar = new C57842f();
        f154542b = fVar;
        C62942bv.registerDefaultInstance(C57842f.class, fVar);
    }

    private C57842f() {
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
                return newMessageInfo(f154542b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            case 3:
                return new C57842f();
            case 4:
                return new C57841e();
            case 5:
                return f154542b;
            case 6:
                C63010eb ebVar = f154543c;
                if (ebVar == null) {
                    synchronized (C57842f.class) {
                        ebVar = f154543c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154542b);
                            f154543c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

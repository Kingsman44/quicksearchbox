package com.google.assistant.p3860as;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.w */
/* compiled from: PG */
public final class C49809w extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49809w f128657b;

    /* renamed from: c */
    private static volatile C63010eb f128658c;

    /* renamed from: a */
    public C62971cq f128659a = emptyProtobufList();

    static {
        C49809w wVar = new C49809w();
        f128657b = wVar;
        C62942bv.registerDefaultInstance(C49809w.class, wVar);
    }

    private C49809w() {
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
                return newMessageInfo(f128657b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49807u.class});
            case 3:
                return new C49809w();
            case 4:
                return new C49808v();
            case 5:
                return f128657b;
            case 6:
                C63010eb ebVar = f128658c;
                if (ebVar == null) {
                    synchronized (C49809w.class) {
                        ebVar = f128658c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128657b);
                            f128658c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

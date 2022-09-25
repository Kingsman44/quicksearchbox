package com.google.frameworks.p4619a.p4620a.p4621a.p4622a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.frameworks.a.a.a.a.e */
/* compiled from: PG */
public final class C61281e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61281e f165746c;

    /* renamed from: d */
    private static volatile C63010eb f165747d;

    /* renamed from: a */
    public int f165748a = 0;

    /* renamed from: b */
    public Object f165749b;

    static {
        C61281e eVar = new C61281e();
        f165746c = eVar;
        C62942bv.registerDefaultInstance(C61281e.class, eVar);
    }

    private C61281e() {
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
                return newMessageInfo(f165746c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C61281e();
            case 4:
                return new C61280d();
            case 5:
                return f165746c;
            case 6:
                C63010eb ebVar = f165747d;
                if (ebVar == null) {
                    synchronized (C61281e.class) {
                        ebVar = f165747d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165746c);
                            f165747d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

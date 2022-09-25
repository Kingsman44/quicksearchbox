package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.az */
/* compiled from: PG */
public final class C54682az extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54682az f143534b;

    /* renamed from: c */
    private static volatile C63010eb f143535c;

    /* renamed from: a */
    public int f143536a;

    static {
        C54682az azVar = new C54682az();
        f143534b = azVar;
        C62942bv.registerDefaultInstance(C54682az.class, azVar);
    }

    private C54682az() {
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
                return newMessageInfo(f143534b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C54682az();
            case 4:
                return new C54681ay();
            case 5:
                return f143534b;
            case 6:
                C63010eb ebVar = f143535c;
                if (ebVar == null) {
                    synchronized (C54682az.class) {
                        ebVar = f143535c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143534b);
                            f143535c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

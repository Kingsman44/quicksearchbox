package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.aj */
/* compiled from: PG */
public final class C54666aj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54666aj f143505b;

    /* renamed from: c */
    private static volatile C63010eb f143506c;

    /* renamed from: a */
    public C54680ax f143507a;

    static {
        C54666aj ajVar = new C54666aj();
        f143505b = ajVar;
        C62942bv.registerDefaultInstance(C54666aj.class, ajVar);
    }

    private C54666aj() {
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
                return newMessageInfo(f143505b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C54666aj();
            case 4:
                return new C54665ai();
            case 5:
                return f143505b;
            case 6:
                C63010eb ebVar = f143506c;
                if (ebVar == null) {
                    synchronized (C54666aj.class) {
                        ebVar = f143506c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143505b);
                            f143506c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

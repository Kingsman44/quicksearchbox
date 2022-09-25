package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.qj */
/* compiled from: PG */
public final class C52401qj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52401qj f137508c;

    /* renamed from: d */
    private static volatile C63010eb f137509d;

    /* renamed from: a */
    public int f137510a;

    /* renamed from: b */
    public int f137511b;

    static {
        C52401qj qjVar = new C52401qj();
        f137508c = qjVar;
        C62942bv.registerDefaultInstance(C52401qj.class, qjVar);
    }

    private C52401qj() {
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
                return newMessageInfo(f137508c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C52400qi.m86613b()});
            case 3:
                return new C52401qj();
            case 4:
                return new C52398qg();
            case 5:
                return f137508c;
            case 6:
                C63010eb ebVar = f137509d;
                if (ebVar == null) {
                    synchronized (C52401qj.class) {
                        ebVar = f137509d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137508c);
                            f137509d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

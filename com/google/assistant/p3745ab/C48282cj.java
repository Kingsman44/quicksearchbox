package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.cj */
/* compiled from: PG */
public final class C48282cj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48282cj f124875c;

    /* renamed from: d */
    private static volatile C63010eb f124876d;

    /* renamed from: a */
    public int f124877a;

    /* renamed from: b */
    public C48280ch f124878b;

    static {
        C48282cj cjVar = new C48282cj();
        f124875c = cjVar;
        C62942bv.registerDefaultInstance(C48282cj.class, cjVar);
    }

    private C48282cj() {
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
                return newMessageInfo(f124875c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48282cj();
            case 4:
                return new C48281ci();
            case 5:
                return f124875c;
            case 6:
                C63010eb ebVar = f124876d;
                if (ebVar == null) {
                    synchronized (C48282cj.class) {
                        ebVar = f124876d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124875c);
                            f124876d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

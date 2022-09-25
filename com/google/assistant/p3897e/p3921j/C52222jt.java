package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.e.j.jt */
/* compiled from: PG */
public final class C52222jt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52222jt f137033c;

    /* renamed from: e */
    private static volatile C63010eb f137034e;

    /* renamed from: a */
    public C63042fg f137035a;

    /* renamed from: b */
    public int f137036b;

    /* renamed from: d */
    private int f137037d;

    static {
        C52222jt jtVar = new C52222jt();
        f137033c = jtVar;
        C62942bv.registerDefaultInstance(C52222jt.class, jtVar);
    }

    private C52222jt() {
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
                return newMessageInfo(f137033c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C52222jt();
            case 4:
                return new C52221js();
            case 5:
                return f137033c;
            case 6:
                C63010eb ebVar = f137034e;
                if (ebVar == null) {
                    synchronized (C52222jt.class) {
                        ebVar = f137034e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137033c);
                            f137034e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

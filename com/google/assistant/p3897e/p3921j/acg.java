package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.acg */
/* compiled from: PG */
public final class acg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final acg f134804c;

    /* renamed from: d */
    private static volatile C63010eb f134805d;

    /* renamed from: a */
    public int f134806a;

    /* renamed from: b */
    public ace f134807b;

    static {
        acg acg = new acg();
        f134804c = acg;
        C62942bv.registerDefaultInstance(acg.class, acg);
    }

    private acg() {
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
                return newMessageInfo(f134804c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new acg();
            case 4:
                return new acf();
            case 5:
                return f134804c;
            case 6:
                C63010eb ebVar = f134805d;
                if (ebVar == null) {
                    synchronized (acg.class) {
                        ebVar = f134805d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134804c);
                            f134805d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

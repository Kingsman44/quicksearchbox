package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.amv */
/* compiled from: PG */
public final class amv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final amv f135400c;

    /* renamed from: d */
    private static volatile C63010eb f135401d;

    /* renamed from: a */
    public int f135402a;

    /* renamed from: b */
    public boolean f135403b;

    static {
        amv amv = new amv();
        f135400c = amv;
        C62942bv.registerDefaultInstance(amv.class, amv);
    }

    private amv() {
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
                return newMessageInfo(f135400c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new amv();
            case 4:
                return new amu();
            case 5:
                return f135400c;
            case 6:
                C63010eb ebVar = f135401d;
                if (ebVar == null) {
                    synchronized (amv.class) {
                        ebVar = f135401d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135400c);
                            f135401d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

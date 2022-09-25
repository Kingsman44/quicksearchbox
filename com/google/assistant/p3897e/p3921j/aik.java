package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aik */
/* compiled from: PG */
public final class aik extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aik f135176c;

    /* renamed from: d */
    private static volatile C63010eb f135177d;

    /* renamed from: a */
    public int f135178a;

    /* renamed from: b */
    public boolean f135179b;

    static {
        aik aik = new aik();
        f135176c = aik;
        C62942bv.registerDefaultInstance(aik.class, aik);
    }

    private aik() {
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
                return newMessageInfo(f135176c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aik();
            case 4:
                return new aij();
            case 5:
                return f135176c;
            case 6:
                C63010eb ebVar = f135177d;
                if (ebVar == null) {
                    synchronized (aik.class) {
                        ebVar = f135177d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135176c);
                            f135177d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

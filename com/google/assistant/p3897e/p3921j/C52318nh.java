package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.nh */
/* compiled from: PG */
public final class C52318nh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52318nh f137320b;

    /* renamed from: c */
    private static volatile C63010eb f137321c;

    /* renamed from: a */
    public boolean f137322a;

    static {
        C52318nh nhVar = new C52318nh();
        f137320b = nhVar;
        C62942bv.registerDefaultInstance(C52318nh.class, nhVar);
    }

    private C52318nh() {
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
                return newMessageInfo(f137320b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C52318nh();
            case 4:
                return new C52317ng();
            case 5:
                return f137320b;
            case 6:
                C63010eb ebVar = f137321c;
                if (ebVar == null) {
                    synchronized (C52318nh.class) {
                        ebVar = f137321c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137320b);
                            f137321c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

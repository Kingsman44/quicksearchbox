package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.sp */
/* compiled from: PG */
public final class C8021sp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8021sp f28168c;

    /* renamed from: d */
    private static volatile C63010eb f28169d;

    /* renamed from: a */
    public int f28170a = 0;

    /* renamed from: b */
    public Object f28171b;

    static {
        C8021sp spVar = new C8021sp();
        f28168c = spVar;
        C62942bv.registerDefaultInstance(C8021sp.class, spVar);
    }

    private C8021sp() {
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
                return newMessageInfo(f28168c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001့\u0000\u0002့\u0000", new Object[]{"b", "a"});
            case 3:
                return new C8021sp();
            case 4:
                return new C8020so();
            case 5:
                return f28168c;
            case 6:
                C63010eb ebVar = f28169d;
                if (ebVar == null) {
                    synchronized (C8021sp.class) {
                        ebVar = f28169d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28168c);
                            f28169d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

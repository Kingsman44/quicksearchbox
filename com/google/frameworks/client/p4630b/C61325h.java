package com.google.frameworks.client.p4630b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.frameworks.client.b.h */
/* compiled from: PG */
public final class C61325h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61325h f165845c;

    /* renamed from: d */
    private static volatile C63010eb f165846d;

    /* renamed from: a */
    public int f165847a = 0;

    /* renamed from: b */
    public Object f165848b;

    static {
        C61325h hVar = new C61325h();
        f165845c = hVar;
        C62942bv.registerDefaultInstance(C61325h.class, hVar);
    }

    private C61325h() {
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
                return newMessageInfo(f165845c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002့\u0000\u0003်\u0000", new Object[]{"b", "a"});
            case 3:
                return new C61325h();
            case 4:
                return new C61324g();
            case 5:
                return f165845c;
            case 6:
                C63010eb ebVar = f165846d;
                if (ebVar == null) {
                    synchronized (C61325h.class) {
                        ebVar = f165846d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165845c);
                            f165846d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p5124m.p5125a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.m.a.d */
/* compiled from: PG */
public final class C65601d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65601d f178302b;

    /* renamed from: c */
    private static volatile C63010eb f178303c;

    /* renamed from: a */
    public C62964ck f178304a = emptyLongList();

    static {
        C65601d dVar = new C65601d();
        f178302b = dVar;
        C62942bv.registerDefaultInstance(C65601d.class, dVar);
    }

    private C65601d() {
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
                return newMessageInfo(f178302b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"a"});
            case 3:
                return new C65601d();
            case 4:
                return new C65600c();
            case 5:
                return f178302b;
            case 6:
                C63010eb ebVar = f178303c;
                if (ebVar == null) {
                    synchronized (C65601d.class) {
                        ebVar = f178303c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178302b);
                            f178303c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

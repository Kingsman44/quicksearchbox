package com.google.protos.p5124m.p5125a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.m.a.b */
/* compiled from: PG */
public final class C65599b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65599b f178299b;

    /* renamed from: c */
    private static volatile C63010eb f178300c;

    /* renamed from: a */
    public C62961ch f178301a = emptyIntList();

    static {
        C65599b bVar = new C65599b();
        f178299b = bVar;
        C62942bv.registerDefaultInstance(C65599b.class, bVar);
    }

    private C65599b() {
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
                return newMessageInfo(f178299b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
            case 3:
                return new C65599b();
            case 4:
                return new C65598a();
            case 5:
                return f178299b;
            case 6:
                C63010eb ebVar = f178300c;
                if (ebVar == null) {
                    synchronized (C65599b.class) {
                        ebVar = f178300c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178299b);
                            f178300c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

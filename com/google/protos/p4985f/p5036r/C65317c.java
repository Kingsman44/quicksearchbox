package com.google.protos.p4985f.p5036r;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.r.c */
/* compiled from: PG */
public final class C65317c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65317c f176650b;

    /* renamed from: c */
    private static volatile C63010eb f176651c;

    /* renamed from: a */
    public int f176652a;

    static {
        C65317c cVar = new C65317c();
        f176650b = cVar;
        C62942bv.registerDefaultInstance(C65317c.class, cVar);
    }

    private C65317c() {
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
                return newMessageInfo(f176650b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C65317c();
            case 4:
                return new C65313a();
            case 5:
                return f176650b;
            case 6:
                C63010eb ebVar = f176651c;
                if (ebVar == null) {
                    synchronized (C65317c.class) {
                        ebVar = f176651c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176650b);
                            f176651c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

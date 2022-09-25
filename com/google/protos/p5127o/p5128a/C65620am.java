package com.google.protos.p5127o.p5128a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.o.a.am */
/* compiled from: PG */
public final class C65620am extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65620am f178324c;

    /* renamed from: d */
    private static volatile C63010eb f178325d;

    /* renamed from: a */
    public int f178326a;

    /* renamed from: b */
    public C65682h f178327b;

    static {
        C65620am amVar = new C65620am();
        f178324c = amVar;
        C62942bv.registerDefaultInstance(C65620am.class, amVar);
    }

    private C65620am() {
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
                return newMessageInfo(f178324c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65620am();
            case 4:
                return new C65619al();
            case 5:
                return f178324c;
            case 6:
                C63010eb ebVar = f178325d;
                if (ebVar == null) {
                    synchronized (C65620am.class) {
                        ebVar = f178325d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178324c);
                            f178325d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

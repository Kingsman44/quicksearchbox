package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.f.q.de */
/* compiled from: PG */
public final class C65144de extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65144de f176316c;

    /* renamed from: d */
    private static volatile C63010eb f176317d;

    /* renamed from: a */
    public int f176318a;

    /* renamed from: b */
    public C65682h f176319b;

    static {
        C65144de deVar = new C65144de();
        f176316c = deVar;
        C62942bv.registerDefaultInstance(C65144de.class, deVar);
    }

    private C65144de() {
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
                return newMessageInfo(f176316c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65144de();
            case 4:
                return new C65143dd();
            case 5:
                return f176316c;
            case 6:
                C63010eb ebVar = f176317d;
                if (ebVar == null) {
                    synchronized (C65144de.class) {
                        ebVar = f176317d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176316c);
                            f176317d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p5127o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.q */
/* compiled from: PG */
public final class C65691q extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65691q f178480e;

    /* renamed from: f */
    private static volatile C63010eb f178481f;

    /* renamed from: a */
    public int f178482a;

    /* renamed from: b */
    public int f178483b = 0;

    /* renamed from: c */
    public Object f178484c;

    /* renamed from: d */
    public C65688n f178485d;

    static {
        C65691q qVar = new C65691q();
        f178480e = qVar;
        C62942bv.registerDefaultInstance(C65691q.class, qVar);
    }

    private C65691q() {
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
                return newMessageInfo(f178480e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဉ\u0002", new Object[]{C45240c.f118157a, "b", "a", C65672b.class, C65680f.class, "d"});
            case 3:
                return new C65691q();
            case 4:
                return new C65690p();
            case 5:
                return f178480e;
            case 6:
                C63010eb ebVar = f178481f;
                if (ebVar == null) {
                    synchronized (C65691q.class) {
                        ebVar = f178481f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178480e);
                            f178481f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

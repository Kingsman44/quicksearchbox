package com.google.protos.p4985f.p4988b.p4990b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.b.q */
/* compiled from: PG */
public final class C64751q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64751q f175519d;

    /* renamed from: e */
    private static volatile C63010eb f175520e;

    /* renamed from: a */
    public int f175521a;

    /* renamed from: b */
    public int f175522b;

    /* renamed from: c */
    public int f175523c;

    static {
        C64751q qVar = new C64751q();
        f175519d = qVar;
        C62942bv.registerDefaultInstance(C64751q.class, qVar);
    }

    private C64751q() {
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
                return newMessageInfo(f175519d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", C64750p.f175518a, C45240c.f118157a});
            case 3:
                return new C64751q();
            case 4:
                return new C64749o();
            case 5:
                return f175519d;
            case 6:
                C63010eb ebVar = f175520e;
                if (ebVar == null) {
                    synchronized (C64751q.class) {
                        ebVar = f175520e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175519d);
                            f175520e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

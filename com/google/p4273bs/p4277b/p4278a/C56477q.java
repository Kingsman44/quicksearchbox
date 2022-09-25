package com.google.p4273bs.p4277b.p4278a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bs.b.a.q */
/* compiled from: PG */
public final class C56477q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56477q f150856a;

    /* renamed from: b */
    private static volatile C63010eb f150857b;

    static {
        C56477q qVar = new C56477q();
        f150856a = qVar;
        C62942bv.registerDefaultInstance(C56477q.class, qVar);
    }

    private C56477q() {
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
                return newMessageInfo(f150856a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56477q();
            case 4:
                return new C56476p();
            case 5:
                return f150856a;
            case 6:
                C63010eb ebVar = f150857b;
                if (ebVar == null) {
                    synchronized (C56477q.class) {
                        ebVar = f150857b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150856a);
                            f150857b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.v */
/* compiled from: PG */
public final class C65308v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65308v f176636a;

    /* renamed from: b */
    private static volatile C63010eb f176637b;

    static {
        C65308v vVar = new C65308v();
        f176636a = vVar;
        C62942bv.registerDefaultInstance(C65308v.class, vVar);
    }

    private C65308v() {
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
                return newMessageInfo(f176636a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65308v();
            case 4:
                return new C65307u();
            case 5:
                return f176636a;
            case 6:
                C63010eb ebVar = f176637b;
                if (ebVar == null) {
                    synchronized (C65308v.class) {
                        ebVar = f176637b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176636a);
                            f176637b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

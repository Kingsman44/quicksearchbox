package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ci */
/* compiled from: PG */
public final class C65117ci extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65117ci f176276a;

    /* renamed from: b */
    private static volatile C63010eb f176277b;

    static {
        C65117ci ciVar = new C65117ci();
        f176276a = ciVar;
        C62942bv.registerDefaultInstance(C65117ci.class, ciVar);
    }

    private C65117ci() {
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
                return newMessageInfo(f176276a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65117ci();
            case 4:
                return new C65116ch();
            case 5:
                return f176276a;
            case 6:
                C63010eb ebVar = f176277b;
                if (ebVar == null) {
                    synchronized (C65117ci.class) {
                        ebVar = f176277b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176276a);
                            f176277b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

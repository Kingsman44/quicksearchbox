package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.j */
/* compiled from: PG */
public final class C65296j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65296j f176618a;

    /* renamed from: b */
    private static volatile C63010eb f176619b;

    static {
        C65296j jVar = new C65296j();
        f176618a = jVar;
        C62942bv.registerDefaultInstance(C65296j.class, jVar);
    }

    private C65296j() {
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
                return newMessageInfo(f176618a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65296j();
            case 4:
                return new C65274i();
            case 5:
                return f176618a;
            case 6:
                C63010eb ebVar = f176619b;
                if (ebVar == null) {
                    synchronized (C65296j.class) {
                        ebVar = f176619b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176618a);
                            f176619b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

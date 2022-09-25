package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ck */
/* compiled from: PG */
public final class C65119ck extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65119ck f176278a;

    /* renamed from: b */
    private static volatile C63010eb f176279b;

    static {
        C65119ck ckVar = new C65119ck();
        f176278a = ckVar;
        C62942bv.registerDefaultInstance(C65119ck.class, ckVar);
    }

    private C65119ck() {
        emptyProtobufList();
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
                return newMessageInfo(f176278a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65119ck();
            case 4:
                return new C65118cj();
            case 5:
                return f176278a;
            case 6:
                C63010eb ebVar = f176279b;
                if (ebVar == null) {
                    synchronized (C65119ck.class) {
                        ebVar = f176279b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176278a);
                            f176279b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

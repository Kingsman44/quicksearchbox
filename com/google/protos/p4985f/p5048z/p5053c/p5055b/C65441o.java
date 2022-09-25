package com.google.protos.p4985f.p5048z.p5053c.p5055b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.c.b.o */
/* compiled from: PG */
public final class C65441o extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65441o f177890a;

    /* renamed from: b */
    private static volatile C63010eb f177891b;

    static {
        C65441o oVar = new C65441o();
        f177890a = oVar;
        C62942bv.registerDefaultInstance(C65441o.class, oVar);
    }

    private C65441o() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f177890a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65441o();
            case 4:
                return new C65440n();
            case 5:
                return f177890a;
            case 6:
                C63010eb ebVar = f177891b;
                if (ebVar == null) {
                    synchronized (C65441o.class) {
                        ebVar = f177891b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177890a);
                            f177891b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

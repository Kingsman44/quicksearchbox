package com.google.protos.p4985f.p5042u;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.protos.f.u.k */
/* compiled from: PG */
public final class C65349k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65349k f177727a;

    /* renamed from: b */
    private static volatile C63010eb f177728b;

    static {
        C65349k kVar = new C65349k();
        f177727a = kVar;
        C62942bv.registerDefaultInstance(C65349k.class, kVar);
    }

    private C65349k() {
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
                return newMessageInfo(f177727a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65349k();
            case 4:
                return new C65348j();
            case 5:
                return f177727a;
            case 6:
                C63010eb ebVar = f177728b;
                if (ebVar == null) {
                    synchronized (C65349k.class) {
                        ebVar = f177728b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177727a);
                            f177728b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

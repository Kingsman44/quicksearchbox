package com.google.android.gms.mdisync;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.mdisync.g */
/* compiled from: PG */
public final class C145086g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C145086g f392147a;

    /* renamed from: b */
    private static volatile C63010eb f392148b;

    static {
        C145086g gVar = new C145086g();
        f392147a = gVar;
        C62942bv.registerDefaultInstance(C145086g.class, gVar);
    }

    private C145086g() {
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
                return newMessageInfo(f392147a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C145086g();
            case 4:
                return new C145085f();
            case 5:
                return f392147a;
            case 6:
                C63010eb ebVar = f392148b;
                if (ebVar == null) {
                    synchronized (C145086g.class) {
                        ebVar = f392148b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392147a);
                            f392148b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

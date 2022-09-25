package com.google.android.gms.p10747b.p10748a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.b.a.n */
/* compiled from: PG */
public final class C142966n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142966n f387914a;

    /* renamed from: b */
    private static volatile C63010eb f387915b;

    static {
        C142966n nVar = new C142966n();
        f387914a = nVar;
        C62942bv.registerDefaultInstance(C142966n.class, nVar);
    }

    private C142966n() {
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
                return newMessageInfo(f387914a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C142966n();
            case 4:
                return new C142965m();
            case 5:
                return f387914a;
            case 6:
                C63010eb ebVar = f387915b;
                if (ebVar == null) {
                    synchronized (C142966n.class) {
                        ebVar = f387915b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f387914a);
                            f387915b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

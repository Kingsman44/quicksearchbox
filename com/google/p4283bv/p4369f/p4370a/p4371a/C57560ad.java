package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.ad */
/* compiled from: PG */
public final class C57560ad extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57560ad f153776a;

    /* renamed from: b */
    private static volatile C63010eb f153777b;

    static {
        C57560ad adVar = new C57560ad();
        f153776a = adVar;
        C62942bv.registerDefaultInstance(C57560ad.class, adVar);
    }

    private C57560ad() {
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
                return newMessageInfo(f153776a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C57560ad();
            case 4:
                return new C57559ac();
            case 5:
                return f153776a;
            case 6:
                C63010eb ebVar = f153777b;
                if (ebVar == null) {
                    synchronized (C57560ad.class) {
                        ebVar = f153777b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153776a);
                            f153777b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

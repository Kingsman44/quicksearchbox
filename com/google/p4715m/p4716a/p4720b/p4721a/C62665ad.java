package com.google.p4715m.p4716a.p4720b.p4721a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.ad */
/* compiled from: PG */
public final class C62665ad extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62665ad f169190b;

    /* renamed from: c */
    private static volatile C63010eb f169191c;

    /* renamed from: a */
    public C62971cq f169192a = emptyProtobufList();

    static {
        C62665ad adVar = new C62665ad();
        f169190b = adVar;
        C62942bv.registerDefaultInstance(C62665ad.class, adVar);
    }

    private C62665ad() {
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
                return newMessageInfo(f169190b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C62664ac.class});
            case 3:
                return new C62665ad();
            case 4:
                return new C62662aa();
            case 5:
                return f169190b;
            case 6:
                C63010eb ebVar = f169191c;
                if (ebVar == null) {
                    synchronized (C62665ad.class) {
                        ebVar = f169191c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169190b);
                            f169191c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

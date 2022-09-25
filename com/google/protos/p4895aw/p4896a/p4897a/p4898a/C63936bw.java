package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.bw */
/* compiled from: PG */
public final class C63936bw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63936bw f172908a;

    /* renamed from: b */
    private static volatile C63010eb f172909b;

    static {
        C63936bw bwVar = new C63936bw();
        f172908a = bwVar;
        C62942bv.registerDefaultInstance(C63936bw.class, bwVar);
    }

    private C63936bw() {
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
                return newMessageInfo(f172908a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63936bw();
            case 4:
                return new C63935bv();
            case 5:
                return f172908a;
            case 6:
                C63010eb ebVar = f172909b;
                if (ebVar == null) {
                    synchronized (C63936bw.class) {
                        ebVar = f172909b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172908a);
                            f172909b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

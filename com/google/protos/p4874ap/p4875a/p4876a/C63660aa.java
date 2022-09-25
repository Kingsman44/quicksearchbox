package com.google.protos.p4874ap.p4875a.p4876a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ap.a.a.aa */
/* compiled from: PG */
public final class C63660aa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63660aa f172141b;

    /* renamed from: c */
    private static volatile C63010eb f172142c;

    /* renamed from: a */
    public C62971cq f172143a = emptyProtobufList();

    static {
        C63660aa aaVar = new C63660aa();
        f172141b = aaVar;
        C62942bv.registerDefaultInstance(C63660aa.class, aaVar);
    }

    private C63660aa() {
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
                return newMessageInfo(f172141b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C63687z.class});
            case 3:
                return new C63660aa();
            case 4:
                return new C63685x();
            case 5:
                return f172141b;
            case 6:
                C63010eb ebVar = f172142c;
                if (ebVar == null) {
                    synchronized (C63660aa.class) {
                        ebVar = f172142c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172141b);
                            f172142c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

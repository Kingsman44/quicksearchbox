package com.google.protos.p4874ap.p4875a.p4876a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ap.a.a.u */
/* compiled from: PG */
public final class C63682u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63682u f172190b;

    /* renamed from: c */
    private static volatile C63010eb f172191c;

    /* renamed from: a */
    public C62971cq f172192a = emptyProtobufList();

    static {
        C63682u uVar = new C63682u();
        f172190b = uVar;
        C62942bv.registerDefaultInstance(C63682u.class, uVar);
    }

    private C63682u() {
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
                return newMessageInfo(f172190b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C63681t.class});
            case 3:
                return new C63682u();
            case 4:
                return new C63679r();
            case 5:
                return f172190b;
            case 6:
                C63010eb ebVar = f172191c;
                if (ebVar == null) {
                    synchronized (C63682u.class) {
                        ebVar = f172191c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172190b);
                            f172191c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

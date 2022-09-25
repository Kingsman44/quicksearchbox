package com.google.protos.p5127o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.aa */
/* compiled from: PG */
public final class C65646aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65646aa f178376c;

    /* renamed from: d */
    private static volatile C63010eb f178377d;

    /* renamed from: a */
    public int f178378a;

    /* renamed from: b */
    public long f178379b;

    static {
        C65646aa aaVar = new C65646aa();
        f178376c = aaVar;
        C62942bv.registerDefaultInstance(C65646aa.class, aaVar);
    }

    private C65646aa() {
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
                return newMessageInfo(f178376c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65646aa();
            case 4:
                return new C65700z();
            case 5:
                return f178376c;
            case 6:
                C63010eb ebVar = f178377d;
                if (ebVar == null) {
                    synchronized (C65646aa.class) {
                        ebVar = f178377d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178376c);
                            f178377d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

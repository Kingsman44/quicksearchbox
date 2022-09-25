package com.google.protos.p4985f.p5030q.p5032b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.ao */
/* compiled from: PG */
public final class C65030ao extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65030ao f176095d;

    /* renamed from: e */
    private static volatile C63010eb f176096e;

    /* renamed from: a */
    public int f176097a;

    /* renamed from: b */
    public long f176098b;

    /* renamed from: c */
    public long f176099c;

    static {
        C65030ao aoVar = new C65030ao();
        f176095d = aoVar;
        C62942bv.registerDefaultInstance(C65030ao.class, aoVar);
    }

    private C65030ao() {
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
                return newMessageInfo(f176095d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65030ao();
            case 4:
                return new C65029an();
            case 5:
                return f176095d;
            case 6:
                C63010eb ebVar = f176096e;
                if (ebVar == null) {
                    synchronized (C65030ao.class) {
                        ebVar = f176096e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176095d);
                            f176096e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

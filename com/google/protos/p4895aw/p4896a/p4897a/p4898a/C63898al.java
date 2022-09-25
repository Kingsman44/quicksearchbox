package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.protos.aw.a.a.a.al */
/* compiled from: PG */
public final class C63898al extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63898al f172775d;

    /* renamed from: e */
    private static volatile C63010eb f172776e;

    /* renamed from: a */
    public int f172777a;

    /* renamed from: b */
    public int f172778b;

    /* renamed from: c */
    public C63042fg f172779c;

    static {
        C63898al alVar = new C63898al();
        f172775d = alVar;
        C62942bv.registerDefaultInstance(C63898al.class, alVar);
    }

    private C63898al() {
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
                return newMessageInfo(f172775d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63898al();
            case 4:
                return new C63897ak();
            case 5:
                return f172775d;
            case 6:
                C63010eb ebVar = f172776e;
                if (ebVar == null) {
                    synchronized (C63898al.class) {
                        ebVar = f172776e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172775d);
                            f172776e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

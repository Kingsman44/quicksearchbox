package com.google.protos.p4985f.p5030q.p5032b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.al */
/* compiled from: PG */
public final class C65027al extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65027al f176090d;

    /* renamed from: e */
    private static volatile C63010eb f176091e;

    /* renamed from: a */
    public int f176092a;

    /* renamed from: b */
    public long f176093b;

    /* renamed from: c */
    public int f176094c;

    static {
        C65027al alVar = new C65027al();
        f176090d = alVar;
        C62942bv.registerDefaultInstance(C65027al.class, alVar);
    }

    private C65027al() {
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
                return newMessageInfo(f176090d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဂ\u0000\u0004င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65027al();
            case 4:
                return new C65026ak();
            case 5:
                return f176090d;
            case 6:
                C63010eb ebVar = f176091e;
                if (ebVar == null) {
                    synchronized (C65027al.class) {
                        ebVar = f176091e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176090d);
                            f176091e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

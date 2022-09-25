package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.y */
/* compiled from: PG */
public final class C57342y extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57342y f153200d;

    /* renamed from: e */
    private static volatile C63010eb f153201e;

    /* renamed from: a */
    public int f153202a;

    /* renamed from: b */
    public long f153203b;

    /* renamed from: c */
    public long f153204c;

    static {
        C57342y yVar = new C57342y();
        f153200d = yVar;
        C62942bv.registerDefaultInstance(C57342y.class, yVar);
    }

    private C57342y() {
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
                return newMessageInfo(f153200d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57342y();
            case 4:
                return new C57341x();
            case 5:
                return f153200d;
            case 6:
                C63010eb ebVar = f153201e;
                if (ebVar == null) {
                    synchronized (C57342y.class) {
                        ebVar = f153201e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153200d);
                            f153201e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4985f.p4988b.p4993d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.d.b */
/* compiled from: PG */
public final class C64782b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64782b f175579d;

    /* renamed from: e */
    private static volatile C63010eb f175580e;

    /* renamed from: a */
    public int f175581a;

    /* renamed from: b */
    public C64784d f175582b;

    /* renamed from: c */
    public C64800t f175583c;

    static {
        C64782b bVar = new C64782b();
        f175579d = bVar;
        C62942bv.registerDefaultInstance(C64782b.class, bVar);
    }

    private C64782b() {
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
                return newMessageInfo(f175579d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64782b();
            case 4:
                return new C64769a();
            case 5:
                return f175579d;
            case 6:
                C63010eb ebVar = f175580e;
                if (ebVar == null) {
                    synchronized (C64782b.class) {
                        ebVar = f175580e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175579d);
                            f175580e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

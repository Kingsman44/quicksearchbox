package com.google.protos.p5129p.p5131b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.as */
/* compiled from: PG */
public final class C65761as extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65761as f178776d;

    /* renamed from: e */
    private static volatile C63010eb f178777e;

    /* renamed from: a */
    public int f178778a;

    /* renamed from: b */
    public C51058ev f178779b;

    /* renamed from: c */
    public long f178780c;

    static {
        C65761as asVar = new C65761as();
        f178776d = asVar;
        C62942bv.registerDefaultInstance(C65761as.class, asVar);
    }

    private C65761as() {
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
                return newMessageInfo(f178776d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65761as();
            case 4:
                return new C65760ar();
            case 5:
                return f178776d;
            case 6:
                C63010eb ebVar = f178777e;
                if (ebVar == null) {
                    synchronized (C65761as.class) {
                        ebVar = f178777e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178776d);
                            f178777e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

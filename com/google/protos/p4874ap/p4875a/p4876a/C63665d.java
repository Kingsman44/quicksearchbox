package com.google.protos.p4874ap.p4875a.p4876a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ap.a.a.d */
/* compiled from: PG */
public final class C63665d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63665d f172146d;

    /* renamed from: e */
    private static volatile C63010eb f172147e;

    /* renamed from: a */
    public int f172148a;

    /* renamed from: b */
    public C62971cq f172149b = emptyProtobufList();

    /* renamed from: c */
    public long f172150c;

    static {
        C63665d dVar = new C63665d();
        f172146d = dVar;
        C62942bv.registerDefaultInstance(C63665d.class, dVar);
    }

    private C63665d() {
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
                return newMessageInfo(f172146d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"a", "b", C63669h.class, C45240c.f118157a});
            case 3:
                return new C63665d();
            case 4:
                return new C63664c();
            case 5:
                return f172146d;
            case 6:
                C63010eb ebVar = f172147e;
                if (ebVar == null) {
                    synchronized (C63665d.class) {
                        ebVar = f172147e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172146d);
                            f172147e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

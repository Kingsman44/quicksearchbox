package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.ep */
/* compiled from: PG */
public final class C64087ep extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64087ep f173258e;

    /* renamed from: f */
    private static volatile C63010eb f173259f;

    /* renamed from: a */
    public int f173260a;

    /* renamed from: b */
    public C64057dm f173261b;

    /* renamed from: c */
    public C64106x f173262c;

    /* renamed from: d */
    public C62971cq f173263d = emptyProtobufList();

    static {
        C64087ep epVar = new C64087ep();
        f173258e = epVar;
        C62942bv.registerDefaultInstance(C64087ep.class, epVar);
    }

    private C64087ep() {
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
                return newMessageInfo(f173258e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0004ဉ\u0002\u0005\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C64086eo.class});
            case 3:
                return new C64087ep();
            case 4:
                return new C64082ek();
            case 5:
                return f173258e;
            case 6:
                C63010eb ebVar = f173259f;
                if (ebVar == null) {
                    synchronized (C64087ep.class) {
                        ebVar = f173259f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173258e);
                            f173259f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

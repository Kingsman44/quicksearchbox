package com.google.android.apps.gsa.shared.p7117n.p7118a.p7119a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.n.a.a.b */
/* compiled from: PG */
public final class C90358b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C90358b f252349d;

    /* renamed from: e */
    private static volatile C63010eb f252350e;

    /* renamed from: a */
    public int f252351a;

    /* renamed from: b */
    public boolean f252352b;

    /* renamed from: c */
    public C62971cq f252353c = C62942bv.emptyProtobufList();

    static {
        C90358b bVar = new C90358b();
        f252349d = bVar;
        C62942bv.registerDefaultInstance(C90358b.class, bVar);
    }

    private C90358b() {
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
                return newMessageInfo(f252349d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဇ\u0001\u0003\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C90358b();
            case 4:
                return new C90357a();
            case 5:
                return f252349d;
            case 6:
                C63010eb ebVar = f252350e;
                if (ebVar == null) {
                    synchronized (C90358b.class) {
                        ebVar = f252350e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252349d);
                            f252350e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

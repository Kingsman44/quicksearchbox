package com.google.android.apps.gsa.tasks;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.tasks.ac */
/* compiled from: PG */
public final class C118468ac extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C118468ac f328813d;

    /* renamed from: e */
    private static volatile C63010eb f328814e;

    /* renamed from: a */
    public int f328815a;

    /* renamed from: b */
    public C62971cq f328816b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public long f328817c = -1;

    static {
        C118468ac acVar = new C118468ac();
        f328813d = acVar;
        C62942bv.registerDefaultInstance(C118468ac.class, acVar);
    }

    private C118468ac() {
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
                return newMessageInfo(f328813d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C118468ac();
            case 4:
                return new C118467ab();
            case 5:
                return f328813d;
            case 6:
                C63010eb ebVar = f328814e;
                if (ebVar == null) {
                    synchronized (C118468ac.class) {
                        ebVar = f328814e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f328813d);
                            f328814e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

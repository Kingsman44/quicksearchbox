package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.l */
/* compiled from: PG */
public final class C106600l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C106600l f297227d;

    /* renamed from: e */
    private static volatile C63010eb f297228e;

    /* renamed from: a */
    public int f297229a;

    /* renamed from: b */
    public boolean f297230b;

    /* renamed from: c */
    public C62971cq f297231c = emptyProtobufList();

    static {
        C106600l lVar = new C106600l();
        f297227d = lVar;
        C62942bv.registerDefaultInstance(C106600l.class, lVar);
    }

    private C106600l() {
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
                return newMessageInfo(f297227d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C106599k.class});
            case 3:
                return new C106600l();
            case 4:
                return new C106597i();
            case 5:
                return f297227d;
            case 6:
                C63010eb ebVar = f297228e;
                if (ebVar == null) {
                    synchronized (C106600l.class) {
                        ebVar = f297228e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f297227d);
                            f297228e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

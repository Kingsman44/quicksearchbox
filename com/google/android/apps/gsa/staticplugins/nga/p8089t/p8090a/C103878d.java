package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.d */
/* compiled from: PG */
public final class C103878d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C103878d f289178d;

    /* renamed from: e */
    private static volatile C63010eb f289179e;

    /* renamed from: a */
    public int f289180a;

    /* renamed from: b */
    public long f289181b;

    /* renamed from: c */
    public C62971cq f289182c = emptyProtobufList();

    static {
        C103878d dVar = new C103878d();
        f289178d = dVar;
        C62942bv.registerDefaultInstance(C103878d.class, dVar);
    }

    private C103878d() {
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
                return newMessageInfo(f289178d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C103874c.class});
            case 3:
                return new C103878d();
            case 4:
                return new C103820a();
            case 5:
                return f289178d;
            case 6:
                C63010eb ebVar = f289179e;
                if (ebVar == null) {
                    synchronized (C103878d.class) {
                        ebVar = f289179e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f289178d);
                            f289179e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

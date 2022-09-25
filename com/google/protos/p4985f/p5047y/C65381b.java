package com.google.protos.p4985f.p5047y;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.y.b */
/* compiled from: PG */
public final class C65381b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65381b f177785d;

    /* renamed from: e */
    private static volatile C63010eb f177786e;

    /* renamed from: a */
    public int f177787a;

    /* renamed from: b */
    public boolean f177788b;

    /* renamed from: c */
    public int f177789c;

    static {
        C65381b bVar = new C65381b();
        f177785d = bVar;
        C62942bv.registerDefaultInstance(C65381b.class, bVar);
    }

    private C65381b() {
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
                return newMessageInfo(f177785d, "\u0000\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0000\u0000\u0001\f\u0004\u0007\u0006\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65381b();
            case 4:
                return new C65380a();
            case 5:
                return f177785d;
            case 6:
                C63010eb ebVar = f177786e;
                if (ebVar == null) {
                    synchronized (C65381b.class) {
                        ebVar = f177786e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177785d);
                            f177786e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

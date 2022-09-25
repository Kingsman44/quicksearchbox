package com.google.frameworks.client.p4624a.p4629b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.frameworks.client.a.b.b */
/* compiled from: PG */
public final class C61305b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61305b f165801d;

    /* renamed from: e */
    private static volatile C63010eb f165802e;

    /* renamed from: a */
    public int f165803a;

    /* renamed from: b */
    public C61309f f165804b;

    /* renamed from: c */
    public C61315l f165805c;

    static {
        C61305b bVar = new C61305b();
        f165801d = bVar;
        C62942bv.registerDefaultInstance(C61305b.class, bVar);
    }

    private C61305b() {
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
                return newMessageInfo(f165801d, "\u0001\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0006ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C61305b();
            case 4:
                return new C61304a();
            case 5:
                return f165801d;
            case 6:
                C63010eb ebVar = f165802e;
                if (ebVar == null) {
                    synchronized (C61305b.class) {
                        ebVar = f165802e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165801d);
                            f165802e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

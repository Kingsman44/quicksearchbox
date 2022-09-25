package com.google.p4658k.p4659a.p4660a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.k.a.a.f */
/* compiled from: PG */
public final class C61730f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61730f f166767d;

    /* renamed from: e */
    private static volatile C63010eb f166768e;

    /* renamed from: a */
    public int f166769a;

    /* renamed from: b */
    public int f166770b;

    /* renamed from: c */
    public long f166771c;

    static {
        C61730f fVar = new C61730f();
        f166767d = fVar;
        C62942bv.registerDefaultInstance(C61730f.class, fVar);
    }

    private C61730f() {
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
                return newMessageInfo(f166767d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C61729e.f166766a, C45240c.f118157a});
            case 3:
                return new C61730f();
            case 4:
                return new C61728d();
            case 5:
                return f166767d;
            case 6:
                C63010eb ebVar = f166768e;
                if (ebVar == null) {
                    synchronized (C61730f.class) {
                        ebVar = f166768e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166767d);
                            f166768e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

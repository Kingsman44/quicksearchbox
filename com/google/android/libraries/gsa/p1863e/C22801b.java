package com.google.android.libraries.gsa.p1863e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.e.b */
/* compiled from: PG */
public final class C22801b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C22801b f62765d;

    /* renamed from: f */
    private static volatile C63010eb f62766f;

    /* renamed from: a */
    public int f62767a;

    /* renamed from: b */
    public C7718hj f62768b;

    /* renamed from: c */
    public int f62769c;

    /* renamed from: e */
    private byte f62770e = 2;

    static {
        C22801b bVar = new C22801b();
        f62765d = bVar;
        C62942bv.registerDefaultInstance(C22801b.class, bVar);
    }

    private C22801b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f62770e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f62770e = b;
                return null;
            case 2:
                return newMessageInfo(f62765d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C7681g.m22803b()});
            case 3:
                return new C22801b();
            case 4:
                return new C22800a();
            case 5:
                return f62765d;
            case 6:
                C63010eb ebVar = f62766f;
                if (ebVar == null) {
                    synchronized (C22801b.class) {
                        ebVar = f62766f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62765d);
                            f62766f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

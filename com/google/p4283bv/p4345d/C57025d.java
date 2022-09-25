package com.google.p4283bv.p4345d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.d */
/* compiled from: PG */
public final class C57025d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57025d f152240e;

    /* renamed from: g */
    private static volatile C63010eb f152241g;

    /* renamed from: a */
    public int f152242a;

    /* renamed from: b */
    public C60220t f152243b;

    /* renamed from: c */
    public C60220t f152244c;

    /* renamed from: d */
    public long f152245d;

    /* renamed from: f */
    private byte f152246f = 2;

    static {
        C57025d dVar = new C57025d();
        f152240e = dVar;
        C62942bv.registerDefaultInstance(C57025d.class, dVar);
    }

    private C57025d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152246f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152246f = b;
                return null;
            case 2:
                return newMessageInfo(f152240e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0002\u0005ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C57025d();
            case 4:
                return new C57024c();
            case 5:
                return f152240e;
            case 6:
                C63010eb ebVar = f152241g;
                if (ebVar == null) {
                    synchronized (C57025d.class) {
                        ebVar = f152241g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152240e);
                            f152241g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

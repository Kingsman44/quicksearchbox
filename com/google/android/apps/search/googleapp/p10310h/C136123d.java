package com.google.android.apps.search.googleapp.p10310h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.h.d */
/* compiled from: PG */
public final class C136123d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C136123d f370743d;

    /* renamed from: f */
    private static volatile C63010eb f370744f;

    /* renamed from: a */
    public int f370745a;

    /* renamed from: b */
    public C57315dp f370746b;

    /* renamed from: c */
    public C136131l f370747c;

    /* renamed from: e */
    private byte f370748e = 2;

    static {
        C136123d dVar = new C136123d();
        f370743d = dVar;
        C62942bv.registerDefaultInstance(C136123d.class, dVar);
    }

    private C136123d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f370748e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f370748e = b;
                return null;
            case 2:
                return newMessageInfo(f370743d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C136123d();
            case 4:
                return new C136122c();
            case 5:
                return f370743d;
            case 6:
                C63010eb ebVar = f370744f;
                if (ebVar == null) {
                    synchronized (C136123d.class) {
                        ebVar = f370744f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370743d);
                            f370744f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

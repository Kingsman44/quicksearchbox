package com.google.p427am.p432b.p433a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58081m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.bp */
/* compiled from: PG */
public final class C8664bp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8664bp f29971d;

    /* renamed from: e */
    private static volatile C63010eb f29972e;

    /* renamed from: a */
    public int f29973a;

    /* renamed from: b */
    public C58081m f29974b;

    /* renamed from: c */
    public C58081m f29975c;

    static {
        C8664bp bpVar = new C8664bp();
        f29971d = bpVar;
        C62942bv.registerDefaultInstance(C8664bp.class, bpVar);
    }

    private C8664bp() {
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
                return newMessageInfo(f29971d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8664bp();
            case 4:
                return new C8663bo();
            case 5:
                return f29971d;
            case 6:
                C63010eb ebVar = f29972e;
                if (ebVar == null) {
                    synchronized (C8664bp.class) {
                        ebVar = f29972e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29971d);
                            f29972e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

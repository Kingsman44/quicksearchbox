package com.google.common.p4552o;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.hv */
/* compiled from: PG */
public final class C59858hv extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C59858hv f161763g;

    /* renamed from: h */
    private static volatile C63010eb f161764h;

    /* renamed from: a */
    public int f161765a;

    /* renamed from: b */
    public C59856ht f161766b;

    /* renamed from: c */
    public C59856ht f161767c;

    /* renamed from: d */
    public C59798fz f161768d;

    /* renamed from: e */
    public C59978ib f161769e;

    /* renamed from: f */
    public C59825gr f161770f;

    static {
        C59858hv hvVar = new C59858hv();
        f161763g = hvVar;
        C62942bv.registerDefaultInstance(C59858hv.class, hvVar);
    }

    private C59858hv() {
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
                return newMessageInfo(f161763g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C59858hv();
            case 4:
                return new C59857hu();
            case 5:
                return f161763g;
            case 6:
                C63010eb ebVar = f161764h;
                if (ebVar == null) {
                    synchronized (C59858hv.class) {
                        ebVar = f161764h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161763g);
                            f161764h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4850an.p4855d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.g */
/* compiled from: PG */
public final class C63563g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63563g f171927e;

    /* renamed from: f */
    private static volatile C63010eb f171928f;

    /* renamed from: a */
    public int f171929a;

    /* renamed from: b */
    public C62961ch f171930b = emptyIntList();

    /* renamed from: c */
    public int f171931c = 1;

    /* renamed from: d */
    public int f171932d;

    static {
        C63563g gVar = new C63563g();
        f171927e = gVar;
        C62942bv.registerDefaultInstance(C63563g.class, gVar);
    }

    private C63563g() {
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
                return newMessageInfo(f171927e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u0016\u0003ဌ\u0001\u0004င\u0002", new Object[]{"a", "b", C45240c.f118157a, C63580j.f171975a, "d"});
            case 3:
                return new C63563g();
            case 4:
                return new C63560f();
            case 5:
                return f171927e;
            case 6:
                C63010eb ebVar = f171928f;
                if (ebVar == null) {
                    synchronized (C63563g.class) {
                        ebVar = f171928f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171927e);
                            f171928f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

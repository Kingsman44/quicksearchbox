package com.google.common.p4552o.p4570p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.aj */
/* compiled from: PG */
public final class C60354aj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60354aj f163354d;

    /* renamed from: e */
    private static volatile C63010eb f163355e;

    /* renamed from: a */
    public int f163356a;

    /* renamed from: b */
    public int f163357b;

    /* renamed from: c */
    public int f163358c;

    static {
        C60354aj ajVar = new C60354aj();
        f163354d = ajVar;
        C62942bv.registerDefaultInstance(C60354aj.class, ajVar);
    }

    private C60354aj() {
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
                return newMessageInfo(f163354d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60354aj();
            case 4:
                return new C60353ai();
            case 5:
                return f163354d;
            case 6:
                C63010eb ebVar = f163355e;
                if (ebVar == null) {
                    synchronized (C60354aj.class) {
                        ebVar = f163355e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163354d);
                            f163355e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

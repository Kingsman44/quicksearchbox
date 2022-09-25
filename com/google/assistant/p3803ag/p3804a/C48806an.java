package com.google.assistant.p3803ag.p3804a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3929l.p3930a.C52736co;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.an */
/* compiled from: PG */
public final class C48806an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48806an f126278a;

    /* renamed from: d */
    private static volatile C63010eb f126279d;

    /* renamed from: b */
    private int f126280b;

    /* renamed from: c */
    private C52736co f126281c;

    static {
        C48806an anVar = new C48806an();
        f126278a = anVar;
        C62942bv.registerDefaultInstance(C48806an.class, anVar);
    }

    private C48806an() {
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
                return newMessageInfo(f126278a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C48806an();
            case 4:
                return new C48805am();
            case 5:
                return f126278a;
            case 6:
                C63010eb ebVar = f126279d;
                if (ebVar == null) {
                    synchronized (C48806an.class) {
                        ebVar = f126279d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126278a);
                            f126279d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

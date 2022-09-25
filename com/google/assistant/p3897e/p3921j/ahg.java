package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ahg */
/* compiled from: PG */
public final class ahg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final ahg f135092e;

    /* renamed from: f */
    private static volatile C63010eb f135093f;

    /* renamed from: a */
    public int f135094a;

    /* renamed from: b */
    public boolean f135095b;

    /* renamed from: c */
    public boolean f135096c;

    /* renamed from: d */
    public boolean f135097d;

    static {
        ahg ahg = new ahg();
        f135092e = ahg;
        C62942bv.registerDefaultInstance(ahg.class, ahg);
    }

    private ahg() {
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
                return newMessageInfo(f135092e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new ahg();
            case 4:
                return new ahf();
            case 5:
                return f135092e;
            case 6:
                C63010eb ebVar = f135093f;
                if (ebVar == null) {
                    synchronized (ahg.class) {
                        ebVar = f135093f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135092e);
                            f135093f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

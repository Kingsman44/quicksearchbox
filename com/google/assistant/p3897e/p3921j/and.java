package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.and */
/* compiled from: PG */
public final class and extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final and f135419d;

    /* renamed from: e */
    private static volatile C63010eb f135420e;

    /* renamed from: a */
    public int f135421a;

    /* renamed from: b */
    public long f135422b;

    /* renamed from: c */
    public long f135423c;

    static {
        and and = new and();
        f135419d = and;
        C62942bv.registerDefaultInstance(and.class, and);
    }

    private and() {
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
                return newMessageInfo(f135419d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new and();
            case 4:
                return new anc();
            case 5:
                return f135419d;
            case 6:
                C63010eb ebVar = f135420e;
                if (ebVar == null) {
                    synchronized (and.class) {
                        ebVar = f135420e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135419d);
                            f135420e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

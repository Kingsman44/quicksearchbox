package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ve */
/* compiled from: PG */
public final class C52531ve extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52531ve f137886c;

    /* renamed from: d */
    private static volatile C63010eb f137887d;

    /* renamed from: a */
    public int f137888a;

    /* renamed from: b */
    public long f137889b;

    static {
        C52531ve veVar = new C52531ve();
        f137886c = veVar;
        C62942bv.registerDefaultInstance(C52531ve.class, veVar);
    }

    private C52531ve() {
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
                return newMessageInfo(f137886c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52531ve();
            case 4:
                return new C52530vd();
            case 5:
                return f137886c;
            case 6:
                C63010eb ebVar = f137887d;
                if (ebVar == null) {
                    synchronized (C52531ve.class) {
                        ebVar = f137887d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137886c);
                            f137887d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

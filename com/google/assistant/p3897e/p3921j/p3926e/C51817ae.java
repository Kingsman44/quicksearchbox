package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ae */
/* compiled from: PG */
public final class C51817ae extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51817ae f135948b;

    /* renamed from: d */
    private static volatile C63010eb f135949d;

    /* renamed from: a */
    public int f135950a;

    /* renamed from: c */
    private boolean f135951c;

    static {
        C51817ae aeVar = new C51817ae();
        f135948b = aeVar;
        C62942bv.registerDefaultInstance(C51817ae.class, aeVar);
    }

    private C51817ae() {
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
                return newMessageInfo(f135948b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", C45240c.f118157a});
            case 3:
                return new C51817ae();
            case 4:
                return new C51816ad();
            case 5:
                return f135948b;
            case 6:
                C63010eb ebVar = f135949d;
                if (ebVar == null) {
                    synchronized (C51817ae.class) {
                        ebVar = f135949d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135948b);
                            f135949d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

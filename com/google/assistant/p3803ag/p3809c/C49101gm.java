package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.gm */
/* compiled from: PG */
public final class C49101gm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49101gm f126991c;

    /* renamed from: d */
    private static volatile C63010eb f126992d;

    /* renamed from: a */
    public int f126993a;

    /* renamed from: b */
    public C49147q f126994b;

    static {
        C49101gm gmVar = new C49101gm();
        f126991c = gmVar;
        C62942bv.registerDefaultInstance(C49101gm.class, gmVar);
    }

    private C49101gm() {
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
                return newMessageInfo(f126991c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49101gm();
            case 4:
                return new C49100gl();
            case 5:
                return f126991c;
            case 6:
                C63010eb ebVar = f126992d;
                if (ebVar == null) {
                    synchronized (C49101gm.class) {
                        ebVar = f126992d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126991c);
                            f126992d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

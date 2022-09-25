package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.wl */
/* compiled from: PG */
public final class C52565wl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52565wl f137961c;

    /* renamed from: d */
    private static volatile C63010eb f137962d;

    /* renamed from: a */
    public int f137963a;

    /* renamed from: b */
    public C52407qp f137964b;

    static {
        C52565wl wlVar = new C52565wl();
        f137961c = wlVar;
        C62942bv.registerDefaultInstance(C52565wl.class, wlVar);
    }

    private C52565wl() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f137961c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C52565wl();
            case 4:
                return new C52564wk();
            case 5:
                return f137961c;
            case 6:
                C63010eb ebVar = f137962d;
                if (ebVar == null) {
                    synchronized (C52565wl.class) {
                        ebVar = f137962d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137961c);
                            f137962d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

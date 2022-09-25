package com.google.android.apps.p489g.p494d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.dj */
/* compiled from: PG */
public final class C9228dj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9228dj f31899c;

    /* renamed from: d */
    private static volatile C63010eb f31900d;

    /* renamed from: a */
    public int f31901a = 0;

    /* renamed from: b */
    public Object f31902b;

    static {
        C9228dj djVar = new C9228dj();
        f31899c = djVar;
        C62942bv.registerDefaultInstance(C9228dj.class, djVar);
    }

    private C9228dj() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m23692a(C9228dj djVar, String str) {
        str.getClass();
        djVar.f31901a = 1;
        djVar.f31902b = str;
    }

    /* renamed from: b */
    public static /* synthetic */ void m23693b(C9228dj djVar, String str) {
        str.getClass();
        djVar.f31901a = 2;
        djVar.f31902b = str;
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
                return newMessageInfo(f31899c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C9228dj();
            case 4:
                return new C9227di();
            case 5:
                return f31899c;
            case 6:
                C63010eb ebVar = f31900d;
                if (ebVar == null) {
                    synchronized (C9228dj.class) {
                        ebVar = f31900d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31899c);
                            f31900d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

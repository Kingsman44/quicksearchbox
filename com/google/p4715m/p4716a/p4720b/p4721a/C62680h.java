package com.google.p4715m.p4716a.p4720b.p4721a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.h */
/* compiled from: PG */
public final class C62680h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62680h f169227c;

    /* renamed from: d */
    private static volatile C63010eb f169228d;

    /* renamed from: a */
    public int f169229a;

    /* renamed from: b */
    public C62692t f169230b;

    static {
        C62680h hVar = new C62680h();
        f169227c = hVar;
        C62942bv.registerDefaultInstance(C62680h.class, hVar);
    }

    private C62680h() {
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
                return newMessageInfo(f169227c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62680h();
            case 4:
                return new C62679g();
            case 5:
                return f169227c;
            case 6:
                C63010eb ebVar = f169228d;
                if (ebVar == null) {
                    synchronized (C62680h.class) {
                        ebVar = f169228d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169227c);
                            f169228d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

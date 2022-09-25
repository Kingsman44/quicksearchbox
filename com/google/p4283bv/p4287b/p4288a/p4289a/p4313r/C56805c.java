package com.google.p4283bv.p4287b.p4288a.p4289a.p4313r;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.r.c */
/* compiled from: PG */
public final class C56805c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56805c f151584c;

    /* renamed from: d */
    private static volatile C63010eb f151585d;

    /* renamed from: a */
    public int f151586a;

    /* renamed from: b */
    public int f151587b;

    static {
        C56805c cVar = new C56805c();
        f151584c = cVar;
        C62942bv.registerDefaultInstance(C56805c.class, cVar);
    }

    private C56805c() {
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
                return newMessageInfo(f151584c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C56804b.f151583a});
            case 3:
                return new C56805c();
            case 4:
                return new C56803a();
            case 5:
                return f151584c;
            case 6:
                C63010eb ebVar = f151585d;
                if (ebVar == null) {
                    synchronized (C56805c.class) {
                        ebVar = f151585d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151584c);
                            f151585d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

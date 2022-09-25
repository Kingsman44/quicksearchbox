package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.c */
/* compiled from: PG */
public final class C51729c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51729c f135713c;

    /* renamed from: d */
    private static volatile C63010eb f135714d;

    /* renamed from: a */
    public int f135715a;

    /* renamed from: b */
    public int f135716b;

    static {
        C51729c cVar = new C51729c();
        f135713c = cVar;
        C62942bv.registerDefaultInstance(C51729c.class, cVar);
    }

    private C51729c() {
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
                return newMessageInfo(f135713c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C51642a.f134573a});
            case 3:
                return new C51729c();
            case 4:
                return new C51699b();
            case 5:
                return f135713c;
            case 6:
                C63010eb ebVar = f135714d;
                if (ebVar == null) {
                    synchronized (C51729c.class) {
                        ebVar = f135714d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135713c);
                            f135714d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.p343ac.p346b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ac.b.h */
/* compiled from: PG */
public final class C6646h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C6646h f19877c;

    /* renamed from: e */
    private static volatile C63010eb f19878e;

    /* renamed from: a */
    public int f19879a;

    /* renamed from: b */
    public C63088z f19880b = C63088z.f170246b;

    /* renamed from: d */
    private int f19881d;

    static {
        C6646h hVar = new C6646h();
        f19877c = hVar;
        C62942bv.registerDefaultInstance(C6646h.class, hVar);
    }

    private C6646h() {
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
                return newMessageInfo(f19877c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"d", "a", C6644f.f19876a, "b"});
            case 3:
                return new C6646h();
            case 4:
                return new C6643e();
            case 5:
                return f19877c;
            case 6:
                C63010eb ebVar = f19878e;
                if (ebVar == null) {
                    synchronized (C6646h.class) {
                        ebVar = f19878e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19877c);
                            f19878e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

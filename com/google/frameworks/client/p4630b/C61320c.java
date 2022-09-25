package com.google.frameworks.client.p4630b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.frameworks.client.b.c */
/* compiled from: PG */
public final class C61320c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61320c f165837d;

    /* renamed from: e */
    private static volatile C63010eb f165838e;

    /* renamed from: a */
    public int f165839a;

    /* renamed from: b */
    public double f165840b;

    /* renamed from: c */
    public long f165841c;

    static {
        C61320c cVar = new C61320c();
        f165837d = cVar;
        C62942bv.registerDefaultInstance(C61320c.class, cVar);
    }

    private C61320c() {
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
                return newMessageInfo(f165837d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C61320c();
            case 4:
                return new C61319b();
            case 5:
                return f165837d;
            case 6:
                C63010eb ebVar = f165838e;
                if (ebVar == null) {
                    synchronized (C61320c.class) {
                        ebVar = f165838e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165837d);
                            f165838e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

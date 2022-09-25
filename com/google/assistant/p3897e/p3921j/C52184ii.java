package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4757ac.p4758a.C63109h;

/* renamed from: com.google.assistant.e.j.ii */
/* compiled from: PG */
public final class C52184ii extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52184ii f136960f;

    /* renamed from: g */
    private static volatile C63010eb f136961g;

    /* renamed from: a */
    public int f136962a;

    /* renamed from: b */
    public C63109h f136963b;

    /* renamed from: c */
    public int f136964c;

    /* renamed from: d */
    public int f136965d;

    /* renamed from: e */
    public int f136966e;

    static {
        C52184ii iiVar = new C52184ii();
        f136960f = iiVar;
        C62942bv.registerDefaultInstance(C52184ii.class, iiVar);
    }

    private C52184ii() {
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
                return newMessageInfo(f136960f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C52182ig.f136959a});
            case 3:
                return new C52184ii();
            case 4:
                return new C52181if();
            case 5:
                return f136960f;
            case 6:
                C63010eb ebVar = f136961g;
                if (ebVar == null) {
                    synchronized (C52184ii.class) {
                        ebVar = f136961g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136960f);
                            f136961g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

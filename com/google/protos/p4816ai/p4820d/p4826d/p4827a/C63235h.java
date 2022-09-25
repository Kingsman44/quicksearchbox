package com.google.protos.p4816ai.p4820d.p4826d.p4827a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4701g.C62250a;
import com.google.lens.p4701g.C62331d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.d.a.h */
/* compiled from: PG */
public final class C63235h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63235h f170846d;

    /* renamed from: e */
    private static volatile C63010eb f170847e;

    /* renamed from: a */
    public int f170848a;

    /* renamed from: b */
    public int f170849b;

    /* renamed from: c */
    public int f170850c;

    static {
        C63235h hVar = new C63235h();
        f170846d = hVar;
        C62942bv.registerDefaultInstance(C63235h.class, hVar);
    }

    private C63235h() {
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
                return newMessageInfo(f170846d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C62331d.m94768b(), C45240c.f118157a, C62250a.f168059a});
            case 3:
                return new C63235h();
            case 4:
                return new C63234g();
            case 5:
                return f170846d;
            case 6:
                C63010eb ebVar = f170847e;
                if (ebVar == null) {
                    synchronized (C63235h.class) {
                        ebVar = f170847e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170846d);
                            f170847e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4850an.p4855d.p4863h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.p4854c.C63408ai;

/* renamed from: com.google.protos.an.d.h.j */
/* compiled from: PG */
public final class C63576j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63576j f171957a;

    /* renamed from: d */
    private static volatile C63010eb f171958d;

    /* renamed from: b */
    private C63408ai f171959b;

    /* renamed from: c */
    private byte f171960c = 2;

    static {
        C63576j jVar = new C63576j();
        f171957a = jVar;
        C62942bv.registerDefaultInstance(C63576j.class, jVar);
    }

    private C63576j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171960c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f171960c = b;
                return null;
            case 2:
                return newMessageInfo(f171957a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0001\u0003Љ", new Object[]{"b"});
            case 3:
                return new C63576j();
            case 4:
                return new C63575i();
            case 5:
                return f171957a;
            case 6:
                C63010eb ebVar = f171958d;
                if (ebVar == null) {
                    synchronized (C63576j.class) {
                        ebVar = f171958d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171957a);
                            f171958d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

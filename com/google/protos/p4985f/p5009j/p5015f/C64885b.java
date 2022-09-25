package com.google.protos.p4985f.p5009j.p5015f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.j.f.b */
/* compiled from: PG */
public final class C64885b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64885b f175793a;

    /* renamed from: b */
    private static volatile C63010eb f175794b;

    static {
        C64885b bVar = new C64885b();
        f175793a = bVar;
        C62942bv.registerDefaultInstance(C64885b.class, bVar);
    }

    private C64885b() {
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
                return newMessageInfo(f175793a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64885b();
            case 4:
                return new C64884a();
            case 5:
                return f175793a;
            case 6:
                C63010eb ebVar = f175794b;
                if (ebVar == null) {
                    synchronized (C64885b.class) {
                        ebVar = f175794b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175793a);
                            f175794b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

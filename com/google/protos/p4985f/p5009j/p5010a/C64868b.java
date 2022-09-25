package com.google.protos.p4985f.p5009j.p5010a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.j.a.b */
/* compiled from: PG */
public final class C64868b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64868b f175774a;

    /* renamed from: b */
    private static volatile C63010eb f175775b;

    static {
        C64868b bVar = new C64868b();
        f175774a = bVar;
        C62942bv.registerDefaultInstance(C64868b.class, bVar);
    }

    private C64868b() {
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
                return newMessageInfo(f175774a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C64868b();
            case 4:
                return new C64867a();
            case 5:
                return f175774a;
            case 6:
                C63010eb ebVar = f175775b;
                if (ebVar == null) {
                    synchronized (C64868b.class) {
                        ebVar = f175775b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175774a);
                            f175775b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

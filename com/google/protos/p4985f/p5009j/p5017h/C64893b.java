package com.google.protos.p4985f.p5009j.p5017h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.protos.f.j.h.b */
/* compiled from: PG */
public final class C64893b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64893b f175802a;

    /* renamed from: b */
    private static volatile C63010eb f175803b;

    static {
        C64893b bVar = new C64893b();
        f175802a = bVar;
        C62942bv.registerDefaultInstance(C64893b.class, bVar);
    }

    private C64893b() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f175802a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64893b();
            case 4:
                return new C64892a();
            case 5:
                return f175802a;
            case 6:
                C63010eb ebVar = f175803b;
                if (ebVar == null) {
                    synchronized (C64893b.class) {
                        ebVar = f175803b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175802a);
                            f175803b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4985f.p5043v.p5044a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.v.a.d */
/* compiled from: PG */
public final class C65362d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65362d f177753a;

    /* renamed from: b */
    private static volatile C63010eb f177754b;

    static {
        C65362d dVar = new C65362d();
        f177753a = dVar;
        C62942bv.registerDefaultInstance(C65362d.class, dVar);
    }

    private C65362d() {
        emptyProtobufList();
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
                return newMessageInfo(f177753a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65362d();
            case 4:
                return new C65361c();
            case 5:
                return f177753a;
            case 6:
                C63010eb ebVar = f177754b;
                if (ebVar == null) {
                    synchronized (C65362d.class) {
                        ebVar = f177754b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177753a);
                            f177754b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

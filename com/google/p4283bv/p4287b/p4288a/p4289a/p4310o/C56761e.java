package com.google.p4283bv.p4287b.p4288a.p4289a.p4310o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.o.e */
/* compiled from: PG */
public final class C56761e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56761e f151486a;

    /* renamed from: b */
    private static volatile C63010eb f151487b;

    static {
        C56761e eVar = new C56761e();
        f151486a = eVar;
        C62942bv.registerDefaultInstance(C56761e.class, eVar);
    }

    private C56761e() {
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
                return newMessageInfo(f151486a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56761e();
            case 4:
                return new C56760d();
            case 5:
                return f151486a;
            case 6:
                C63010eb ebVar = f151487b;
                if (ebVar == null) {
                    synchronized (C56761e.class) {
                        ebVar = f151487b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151486a);
                            f151487b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

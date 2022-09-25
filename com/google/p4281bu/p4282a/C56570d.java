package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.d */
/* compiled from: PG */
public final class C56570d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56570d f151046a;

    /* renamed from: b */
    private static volatile C63010eb f151047b;

    static {
        C56570d dVar = new C56570d();
        f151046a = dVar;
        C62942bv.registerDefaultInstance(C56570d.class, dVar);
    }

    private C56570d() {
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
                return newMessageInfo(f151046a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C56570d();
            case 4:
                return new C56543c();
            case 5:
                return f151046a;
            case 6:
                C63010eb ebVar = f151047b;
                if (ebVar == null) {
                    synchronized (C56570d.class) {
                        ebVar = f151047b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151046a);
                            f151047b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

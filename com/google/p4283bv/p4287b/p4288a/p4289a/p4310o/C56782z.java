package com.google.p4283bv.p4287b.p4288a.p4289a.p4310o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.o.z */
/* compiled from: PG */
public final class C56782z extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56782z f151518a;

    /* renamed from: b */
    private static volatile C63010eb f151519b;

    static {
        C56782z zVar = new C56782z();
        f151518a = zVar;
        C62942bv.registerDefaultInstance(C56782z.class, zVar);
    }

    private C56782z() {
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
                return newMessageInfo(f151518a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56782z();
            case 4:
                return new C56781y();
            case 5:
                return f151518a;
            case 6:
                C63010eb ebVar = f151519b;
                if (ebVar == null) {
                    synchronized (C56782z.class) {
                        ebVar = f151519b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151518a);
                            f151519b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

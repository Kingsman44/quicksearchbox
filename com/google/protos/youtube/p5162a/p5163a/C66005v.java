package com.google.protos.youtube.p5162a.p5163a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.v */
/* compiled from: PG */
public final class C66005v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66005v f179500a;

    /* renamed from: b */
    private static volatile C63010eb f179501b;

    static {
        C66005v vVar = new C66005v();
        f179500a = vVar;
        C62942bv.registerDefaultInstance(C66005v.class, vVar);
    }

    private C66005v() {
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
                return newMessageInfo(f179500a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66005v();
            case 4:
                return new C66004u();
            case 5:
                return f179500a;
            case 6:
                C63010eb ebVar = f179501b;
                if (ebVar == null) {
                    synchronized (C66005v.class) {
                        ebVar = f179501b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179500a);
                            f179501b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

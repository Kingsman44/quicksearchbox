package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.hz */
/* compiled from: PG */
public final class C7734hz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7734hz f27038a;

    /* renamed from: b */
    private static volatile C63010eb f27039b;

    static {
        C7734hz hzVar = new C7734hz();
        f27038a = hzVar;
        C62942bv.registerDefaultInstance(C7734hz.class, hzVar);
    }

    private C7734hz() {
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
                return newMessageInfo(f27038a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7734hz();
            case 4:
                return new C7733hy();
            case 5:
                return f27038a;
            case 6:
                C63010eb ebVar = f27039b;
                if (ebVar == null) {
                    synchronized (C7734hz.class) {
                        ebVar = f27039b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27038a);
                            f27039b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.n */
/* compiled from: PG */
public final class C65300n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65300n f176624a;

    /* renamed from: b */
    private static volatile C63010eb f176625b;

    static {
        C65300n nVar = new C65300n();
        f176624a = nVar;
        C62942bv.registerDefaultInstance(C65300n.class, nVar);
    }

    private C65300n() {
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
                return newMessageInfo(f176624a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65300n();
            case 4:
                return new C65299m();
            case 5:
                return f176624a;
            case 6:
                C63010eb ebVar = f176625b;
                if (ebVar == null) {
                    synchronized (C65300n.class) {
                        ebVar = f176625b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176624a);
                            f176625b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.aw.b.ce */
/* compiled from: PG */
public final class C64022ce extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64022ce f173124a;

    /* renamed from: b */
    private static volatile C63010eb f173125b;

    static {
        C64022ce ceVar = new C64022ce();
        f173124a = ceVar;
        C62942bv.registerDefaultInstance(C64022ce.class, ceVar);
    }

    private C64022ce() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f173124a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64022ce();
            case 4:
                return new C64021cd();
            case 5:
                return f173124a;
            case 6:
                C63010eb ebVar = f173125b;
                if (ebVar == null) {
                    synchronized (C64022ce.class) {
                        ebVar = f173125b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173124a);
                            f173125b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

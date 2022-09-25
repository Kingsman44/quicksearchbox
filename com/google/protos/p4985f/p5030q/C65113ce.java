package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ce */
/* compiled from: PG */
public final class C65113ce extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65113ce f176272a;

    /* renamed from: b */
    private static volatile C63010eb f176273b;

    static {
        C65113ce ceVar = new C65113ce();
        f176272a = ceVar;
        C62942bv.registerDefaultInstance(C65113ce.class, ceVar);
    }

    private C65113ce() {
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
                return newMessageInfo(f176272a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65113ce();
            case 4:
                return new C65112cd();
            case 5:
                return f176272a;
            case 6:
                C63010eb ebVar = f176273b;
                if (ebVar == null) {
                    synchronized (C65113ce.class) {
                        ebVar = f176273b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176272a);
                            f176273b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

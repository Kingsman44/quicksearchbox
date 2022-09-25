package com.google.protos.p4985f.p5038s;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.s.b */
/* compiled from: PG */
public final class C65334b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65334b f176685a;

    /* renamed from: b */
    private static volatile C63010eb f176686b;

    static {
        C65334b bVar = new C65334b();
        f176685a = bVar;
        C62942bv.registerDefaultInstance(C65334b.class, bVar);
    }

    private C65334b() {
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
                return newMessageInfo(f176685a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65334b();
            case 4:
                return new C65331a();
            case 5:
                return f176685a;
            case 6:
                C63010eb ebVar = f176686b;
                if (ebVar == null) {
                    synchronized (C65334b.class) {
                        ebVar = f176686b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176685a);
                            f176686b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

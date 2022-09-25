package com.google.protos.p5160y.p5161a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.y.a.b */
/* compiled from: PG */
public final class C65969b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65969b f179438a;

    /* renamed from: b */
    private static volatile C63010eb f179439b;

    static {
        C65969b bVar = new C65969b();
        f179438a = bVar;
        C62942bv.registerDefaultInstance(C65969b.class, bVar);
    }

    private C65969b() {
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
                return newMessageInfo(f179438a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65969b();
            case 4:
                return new C65968a();
            case 5:
                return f179438a;
            case 6:
                C63010eb ebVar = f179439b;
                if (ebVar == null) {
                    synchronized (C65969b.class) {
                        ebVar = f179439b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179438a);
                            f179439b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

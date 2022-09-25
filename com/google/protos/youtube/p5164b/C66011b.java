package com.google.protos.youtube.p5164b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.b.b */
/* compiled from: PG */
public final class C66011b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66011b f179508a;

    /* renamed from: b */
    private static volatile C63010eb f179509b;

    static {
        C66011b bVar = new C66011b();
        f179508a = bVar;
        C62942bv.registerDefaultInstance(C66011b.class, bVar);
    }

    private C66011b() {
        emptyProtobufList();
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
                return newMessageInfo(f179508a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66011b();
            case 4:
                return new C66010a();
            case 5:
                return f179508a;
            case 6:
                C63010eb ebVar = f179509b;
                if (ebVar == null) {
                    synchronized (C66011b.class) {
                        ebVar = f179509b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179508a);
                            f179509b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4850an.p4855d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.b */
/* compiled from: PG */
public final class C63474b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63474b f171540a;

    /* renamed from: b */
    private static volatile C63010eb f171541b;

    static {
        C63474b bVar = new C63474b();
        f171540a = bVar;
        C62942bv.registerDefaultInstance(C63474b.class, bVar);
    }

    private C63474b() {
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
                return newMessageInfo(f171540a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63474b();
            case 4:
                return new C63439a();
            case 5:
                return f171540a;
            case 6:
                C63010eb ebVar = f171541b;
                if (ebVar == null) {
                    synchronized (C63474b.class) {
                        ebVar = f171541b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171540a);
                            f171541b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4985f.p5048z.p5053c.p5055b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.c.b.b */
/* compiled from: PG */
public final class C65424b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65424b f177858a;

    /* renamed from: b */
    private static volatile C63010eb f177859b;

    static {
        C65424b bVar = new C65424b();
        f177858a = bVar;
        C62942bv.registerDefaultInstance(C65424b.class, bVar);
    }

    private C65424b() {
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
                return newMessageInfo(f177858a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65424b();
            case 4:
                return new C65409a();
            case 5:
                return f177858a;
            case 6:
                C63010eb ebVar = f177859b;
                if (ebVar == null) {
                    synchronized (C65424b.class) {
                        ebVar = f177859b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177858a);
                            f177859b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

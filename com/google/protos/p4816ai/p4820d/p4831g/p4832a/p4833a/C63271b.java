package com.google.protos.p4816ai.p4820d.p4831g.p4832a.p4833a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.g.a.a.b */
/* compiled from: PG */
public final class C63271b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63271b f171003a;

    /* renamed from: b */
    private static volatile C63010eb f171004b;

    static {
        C63271b bVar = new C63271b();
        f171003a = bVar;
        C62942bv.registerDefaultInstance(C63271b.class, bVar);
    }

    private C63271b() {
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
                return newMessageInfo(f171003a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63271b();
            case 4:
                return new C63270a();
            case 5:
                return f171003a;
            case 6:
                C63010eb ebVar = f171004b;
                if (ebVar == null) {
                    synchronized (C63271b.class) {
                        ebVar = f171004b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171003a);
                            f171004b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

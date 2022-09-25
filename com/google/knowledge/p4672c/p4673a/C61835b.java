package com.google.knowledge.p4672c.p4673a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.c.a.b */
/* compiled from: PG */
public final class C61835b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61835b f167092a;

    /* renamed from: b */
    private static volatile C63010eb f167093b;

    static {
        C61835b bVar = new C61835b();
        f167092a = bVar;
        C62942bv.registerDefaultInstance(C61835b.class, bVar);
    }

    private C61835b() {
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
                return newMessageInfo(f167092a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C61835b();
            case 4:
                return new C61834a();
            case 5:
                return f167092a;
            case 6:
                C63010eb ebVar = f167093b;
                if (ebVar == null) {
                    synchronized (C61835b.class) {
                        ebVar = f167093b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167092a);
                            f167093b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

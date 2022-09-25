package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.b.a.a.a.d */
/* compiled from: PG */
public final class C50641d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50641d f131739a;

    /* renamed from: b */
    private static volatile C63010eb f131740b;

    static {
        C50641d dVar = new C50641d();
        f131739a = dVar;
        C62942bv.registerDefaultInstance(C50641d.class, dVar);
    }

    private C50641d() {
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
                return newMessageInfo(f131739a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50641d();
            case 4:
                return new C50640c();
            case 5:
                return f131739a;
            case 6:
                C63010eb ebVar = f131740b;
                if (ebVar == null) {
                    synchronized (C50641d.class) {
                        ebVar = f131740b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131739a);
                            f131740b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.assistant.p3863av.p3867b.p3868a.p3869a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.b.a.a.w */
/* compiled from: PG */
public final class C50555w extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50555w f131572a;

    /* renamed from: b */
    private static volatile C63010eb f131573b;

    static {
        C50555w wVar = new C50555w();
        f131572a = wVar;
        C62942bv.registerDefaultInstance(C50555w.class, wVar);
    }

    private C50555w() {
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
                return newMessageInfo(f131572a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50555w();
            case 4:
                return new C50554v();
            case 5:
                return f131572a;
            case 6:
                C63010eb ebVar = f131573b;
                if (ebVar == null) {
                    synchronized (C50555w.class) {
                        ebVar = f131573b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131572a);
                            f131573b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

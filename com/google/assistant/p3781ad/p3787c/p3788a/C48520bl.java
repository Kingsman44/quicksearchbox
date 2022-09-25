package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.bl */
/* compiled from: PG */
public final class C48520bl extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48520bl f125340a;

    /* renamed from: b */
    private static volatile C63010eb f125341b;

    static {
        C48520bl blVar = new C48520bl();
        f125340a = blVar;
        C62942bv.registerDefaultInstance(C48520bl.class, blVar);
    }

    private C48520bl() {
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
                return newMessageInfo(f125340a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48520bl();
            case 4:
                return new C48519bk();
            case 5:
                return f125340a;
            case 6:
                C63010eb ebVar = f125341b;
                if (ebVar == null) {
                    synchronized (C48520bl.class) {
                        ebVar = f125341b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125340a);
                            f125341b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

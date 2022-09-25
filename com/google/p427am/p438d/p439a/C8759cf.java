package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.am.d.a.cf */
/* compiled from: PG */
public final class C8759cf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8759cf f30115a;

    /* renamed from: b */
    private static volatile C63010eb f30116b;

    static {
        C8759cf cfVar = new C8759cf();
        f30115a = cfVar;
        C62942bv.registerDefaultInstance(C8759cf.class, cfVar);
    }

    private C8759cf() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f30115a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C8759cf();
            case 4:
                return new C8758ce();
            case 5:
                return f30115a;
            case 6:
                C63010eb ebVar = f30116b;
                if (ebVar == null) {
                    synchronized (C8759cf.class) {
                        ebVar = f30116b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30115a);
                            f30116b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

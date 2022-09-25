package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.p */
/* compiled from: PG */
public final class C52909p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52909p f138748a;

    /* renamed from: b */
    private static volatile C63010eb f138749b;

    static {
        C52909p pVar = new C52909p();
        f138748a = pVar;
        C62942bv.registerDefaultInstance(C52909p.class, pVar);
    }

    private C52909p() {
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
                return newMessageInfo(f138748a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52909p();
            case 4:
                return new C52908o();
            case 5:
                return f138748a;
            case 6:
                C63010eb ebVar = f138749b;
                if (ebVar == null) {
                    synchronized (C52909p.class) {
                        ebVar = f138749b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138748a);
                            f138749b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

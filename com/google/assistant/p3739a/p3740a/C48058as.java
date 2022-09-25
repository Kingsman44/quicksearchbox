package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.a.a.as */
/* compiled from: PG */
public final class C48058as extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48058as f124382a;

    /* renamed from: b */
    private static volatile C63010eb f124383b;

    static {
        C48058as asVar = new C48058as();
        f124382a = asVar;
        C62942bv.registerDefaultInstance(C48058as.class, asVar);
    }

    private C48058as() {
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
                return newMessageInfo(f124382a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48058as();
            case 4:
                return new C48057ar();
            case 5:
                return f124382a;
            case 6:
                C63010eb ebVar = f124383b;
                if (ebVar == null) {
                    synchronized (C48058as.class) {
                        ebVar = f124383b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124382a);
                            f124383b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

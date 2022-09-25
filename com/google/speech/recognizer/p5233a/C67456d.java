package com.google.speech.recognizer.p5233a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.recognizer.a.d */
/* compiled from: PG */
public final class C67456d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67456d f183343a;

    /* renamed from: b */
    private static volatile C63010eb f183344b;

    static {
        C67456d dVar = new C67456d();
        f183343a = dVar;
        C62942bv.registerDefaultInstance(C67456d.class, dVar);
    }

    private C67456d() {
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
                return newMessageInfo(f183343a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67456d();
            case 4:
                return new C67455c();
            case 5:
                return f183343a;
            case 6:
                C63010eb ebVar = f183344b;
                if (ebVar == null) {
                    synchronized (C67456d.class) {
                        ebVar = f183344b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183343a);
                            f183344b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

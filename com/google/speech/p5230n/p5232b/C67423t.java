package com.google.speech.p5230n.p5232b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.t */
/* compiled from: PG */
public final class C67423t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67423t f183233a;

    /* renamed from: b */
    private static volatile C63010eb f183234b;

    static {
        C67423t tVar = new C67423t();
        f183233a = tVar;
        C62942bv.registerDefaultInstance(C67423t.class, tVar);
    }

    private C67423t() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f183233a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67423t();
            case 4:
                return new C67422s();
            case 5:
                return f183233a;
            case 6:
                C63010eb ebVar = f183234b;
                if (ebVar == null) {
                    synchronized (C67423t.class) {
                        ebVar = f183234b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183233a);
                            f183234b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

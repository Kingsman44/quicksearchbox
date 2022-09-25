package com.google.speech.grammar.pumpkin;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.grammar.pumpkin.f */
/* compiled from: PG */
public final class C66514f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66514f f180900a;

    /* renamed from: b */
    private static volatile C63010eb f180901b;

    static {
        C66514f fVar = new C66514f();
        f180900a = fVar;
        C62942bv.registerDefaultInstance(C66514f.class, fVar);
    }

    private C66514f() {
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
                return newMessageInfo(f180900a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66514f();
            case 4:
                return new C66513e();
            case 5:
                return f180900a;
            case 6:
                C63010eb ebVar = f180901b;
                if (ebVar == null) {
                    synchronized (C66514f.class) {
                        ebVar = f180901b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180900a);
                            f180901b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

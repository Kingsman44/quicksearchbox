package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ce */
/* compiled from: PG */
public final class C14248ce extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14248ce f43118a;

    /* renamed from: b */
    private static volatile C63010eb f43119b;

    static {
        C14248ce ceVar = new C14248ce();
        f43118a = ceVar;
        C62942bv.registerDefaultInstance(C14248ce.class, ceVar);
    }

    private C14248ce() {
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
                return newMessageInfo(f43118a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14248ce();
            case 4:
                return new C14247cd();
            case 5:
                return f43118a;
            case 6:
                C63010eb ebVar = f43119b;
                if (ebVar == null) {
                    synchronized (C14248ce.class) {
                        ebVar = f43119b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43118a);
                            f43119b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.l */
/* compiled from: PG */
public final class C14486l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14486l f43777c;

    /* renamed from: d */
    private static volatile C63010eb f43778d;

    /* renamed from: a */
    public int f43779a;

    /* renamed from: b */
    public int f43780b;

    static {
        C14486l lVar = new C14486l();
        f43777c = lVar;
        C62942bv.registerDefaultInstance(C14486l.class, lVar);
    }

    private C14486l() {
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
                return newMessageInfo(f43777c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C14486l();
            case 4:
                return new C14459k();
            case 5:
                return f43777c;
            case 6:
                C63010eb ebVar = f43778d;
                if (ebVar == null) {
                    synchronized (C14486l.class) {
                        ebVar = f43778d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43777c);
                            f43778d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

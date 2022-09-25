package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.le */
/* compiled from: PG */
public final class C14491le extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14491le f43793b;

    /* renamed from: c */
    private static volatile C63010eb f43794c;

    /* renamed from: a */
    public int f43795a;

    static {
        C14491le leVar = new C14491le();
        f43793b = leVar;
        C62942bv.registerDefaultInstance(C14491le.class, leVar);
    }

    private C14491le() {
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
                return newMessageInfo(f43793b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C14491le();
            case 4:
                return new C14490ld();
            case 5:
                return f43793b;
            case 6:
                C63010eb ebVar = f43794c;
                if (ebVar == null) {
                    synchronized (C14491le.class) {
                        ebVar = f43794c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43793b);
                            f43794c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.cu */
/* compiled from: PG */
public final class C49591cu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49591cu f127964c;

    /* renamed from: d */
    private static volatile C63010eb f127965d;

    /* renamed from: a */
    public int f127966a;

    /* renamed from: b */
    public double f127967b;

    static {
        C49591cu cuVar = new C49591cu();
        f127964c = cuVar;
        C62942bv.registerDefaultInstance(C49591cu.class, cuVar);
    }

    private C49591cu() {
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
                return newMessageInfo(f127964c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002က\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49591cu();
            case 4:
                return new C49590ct();
            case 5:
                return f127964c;
            case 6:
                C63010eb ebVar = f127965d;
                if (ebVar == null) {
                    synchronized (C49591cu.class) {
                        ebVar = f127965d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127964c);
                            f127965d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

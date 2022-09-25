package com.google.assistant.p3890d.p3891a.p3892a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.d.a.a.d */
/* compiled from: PG */
public final class C50859d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50859d f132429b;

    /* renamed from: c */
    private static volatile C63010eb f132430c;

    /* renamed from: a */
    public C50857b f132431a;

    static {
        C50859d dVar = new C50859d();
        f132429b = dVar;
        C62942bv.registerDefaultInstance(C50859d.class, dVar);
    }

    private C50859d() {
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
                return newMessageInfo(f132429b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C50859d();
            case 4:
                return new C50858c();
            case 5:
                return f132429b;
            case 6:
                C63010eb ebVar = f132430c;
                if (ebVar == null) {
                    synchronized (C50859d.class) {
                        ebVar = f132430c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132429b);
                            f132430c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

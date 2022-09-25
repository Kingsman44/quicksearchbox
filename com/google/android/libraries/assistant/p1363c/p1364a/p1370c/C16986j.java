package com.google.android.libraries.assistant.p1363c.p1364a.p1370c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.a.c.j */
/* compiled from: PG */
public final class C16986j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C16986j f49619b;

    /* renamed from: c */
    private static volatile C63010eb f49620c;

    /* renamed from: a */
    public int f49621a;

    static {
        C16986j jVar = new C16986j();
        f49619b = jVar;
        C62942bv.registerDefaultInstance(C16986j.class, jVar);
    }

    private C16986j() {
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
                return newMessageInfo(f49619b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C16986j();
            case 4:
                return new C16985i();
            case 5:
                return f49619b;
            case 6:
                C63010eb ebVar = f49620c;
                if (ebVar == null) {
                    synchronized (C16986j.class) {
                        ebVar = f49620c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49619b);
                            f49620c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

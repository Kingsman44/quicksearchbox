package com.google.assistant.p3989p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.p.f */
/* compiled from: PG */
public final class C53053f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53053f f139045c;

    /* renamed from: d */
    private static volatile C63010eb f139046d;

    /* renamed from: a */
    public int f139047a;

    /* renamed from: b */
    public C63088z f139048b = C63088z.f170246b;

    static {
        C53053f fVar = new C53053f();
        f139045c = fVar;
        C62942bv.registerDefaultInstance(C53053f.class, fVar);
    }

    private C53053f() {
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
                return newMessageInfo(f139045c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53053f();
            case 4:
                return new C53052e();
            case 5:
                return f139045c;
            case 6:
                C63010eb ebVar = f139046d;
                if (ebVar == null) {
                    synchronized (C53053f.class) {
                        ebVar = f139046d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139045c);
                            f139046d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

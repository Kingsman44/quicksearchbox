package com.google.common.p4552o.p4553a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.f */
/* compiled from: PG */
public final class C59550f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59550f f158019c;

    /* renamed from: d */
    private static volatile C63010eb f158020d;

    /* renamed from: a */
    public int f158021a;

    /* renamed from: b */
    public int f158022b;

    static {
        C59550f fVar = new C59550f();
        f158019c = fVar;
        C62942bv.registerDefaultInstance(C59550f.class, fVar);
    }

    private C59550f() {
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
                return newMessageInfo(f158019c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C59549e.f158018a});
            case 3:
                return new C59550f();
            case 4:
                return new C59530d();
            case 5:
                return f158019c;
            case 6:
                C63010eb ebVar = f158020d;
                if (ebVar == null) {
                    synchronized (C59550f.class) {
                        ebVar = f158020d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158019c);
                            f158020d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4752a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.a.e */
/* compiled from: PG */
public final class C63093e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63093e f170253c;

    /* renamed from: d */
    private static volatile C63010eb f170254d;

    /* renamed from: a */
    public int f170255a;

    /* renamed from: b */
    public boolean f170256b;

    static {
        C63093e eVar = new C63093e();
        f170253c = eVar;
        C62942bv.registerDefaultInstance(C63093e.class, eVar);
    }

    private C63093e() {
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
                return newMessageInfo(f170253c, "\u0001\u0001\u0000\u0001\n\n\u0001\u0000\u0000\u0000\nဇ\t", new Object[]{"a", "b"});
            case 3:
                return new C63093e();
            case 4:
                return new C63092d();
            case 5:
                return f170253c;
            case 6:
                C63010eb ebVar = f170254d;
                if (ebVar == null) {
                    synchronized (C63093e.class) {
                        ebVar = f170254d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170253c);
                            f170254d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

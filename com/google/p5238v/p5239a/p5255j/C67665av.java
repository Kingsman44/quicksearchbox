package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.av */
/* compiled from: PG */
public final class C67665av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67665av f183629c;

    /* renamed from: d */
    private static volatile C63010eb f183630d;

    /* renamed from: a */
    public int f183631a;

    /* renamed from: b */
    public C63088z f183632b = C63088z.f170246b;

    static {
        C67665av avVar = new C67665av();
        f183629c = avVar;
        C62942bv.registerDefaultInstance(C67665av.class, avVar);
    }

    private C67665av() {
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
                return newMessageInfo(f183629c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"a", "b"});
            case 3:
                return new C67665av();
            case 4:
                return new C67664au();
            case 5:
                return f183629c;
            case 6:
                C63010eb ebVar = f183630d;
                if (ebVar == null) {
                    synchronized (C67665av.class) {
                        ebVar = f183630d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183629c);
                            f183630d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

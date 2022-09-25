package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.ac */
/* compiled from: PG */
public final class C63966ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63966ac f172991c;

    /* renamed from: d */
    private static volatile C63010eb f172992d;

    /* renamed from: a */
    public int f172993a;

    /* renamed from: b */
    public long f172994b;

    static {
        C63966ac acVar = new C63966ac();
        f172991c = acVar;
        C62942bv.registerDefaultInstance(C63966ac.class, acVar);
    }

    private C63966ac() {
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
                return newMessageInfo(f172991c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001စ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C63966ac();
            case 4:
                return new C63965ab();
            case 5:
                return f172991c;
            case 6:
                C63010eb ebVar = f172992d;
                if (ebVar == null) {
                    synchronized (C63966ac.class) {
                        ebVar = f172992d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172991c);
                            f172992d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

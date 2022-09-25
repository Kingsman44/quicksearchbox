package com.google.protos.p4850an.p4865e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.e.d */
/* compiled from: PG */
public final class C63590d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63590d f172003c;

    /* renamed from: d */
    private static volatile C63010eb f172004d;

    /* renamed from: a */
    public int f172005a = 0;

    /* renamed from: b */
    public Object f172006b;

    static {
        C63590d dVar = new C63590d();
        f172003c = dVar;
        C62942bv.registerDefaultInstance(C63590d.class, dVar);
    }

    private C63590d() {
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
                return newMessageInfo(f172003c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C63594h.class, C63588b.class});
            case 3:
                return new C63590d();
            case 4:
                return new C63589c();
            case 5:
                return f172003c;
            case 6:
                C63010eb ebVar = f172004d;
                if (ebVar == null) {
                    synchronized (C63590d.class) {
                        ebVar = f172004d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172003c);
                            f172004d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

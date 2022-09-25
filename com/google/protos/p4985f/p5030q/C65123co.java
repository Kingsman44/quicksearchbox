package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.protos.f.q.co */
/* compiled from: PG */
public final class C65123co extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65123co f176284c;

    /* renamed from: d */
    private static volatile C63010eb f176285d;

    /* renamed from: a */
    public int f176286a = 0;

    /* renamed from: b */
    public Object f176287b;

    static {
        C65123co coVar = new C65123co();
        f176284c = coVar;
        C62942bv.registerDefaultInstance(C65123co.class, coVar);
    }

    private C65123co() {
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
                return newMessageInfo(f176284c, "\u0001\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001်\u0000\u0002ဵ\u0000\u0003ဳ\u0000\u0004ျ\u0000\u0006ြ\u0000", new Object[]{"b", "a", C63070h.class});
            case 3:
                return new C65123co();
            case 4:
                return new C65122cn();
            case 5:
                return f176284c;
            case 6:
                C63010eb ebVar = f176285d;
                if (ebVar == null) {
                    synchronized (C65123co.class) {
                        ebVar = f176285d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176284c);
                            f176285d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

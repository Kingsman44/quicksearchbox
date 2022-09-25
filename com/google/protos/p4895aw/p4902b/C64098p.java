package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.p */
/* compiled from: PG */
public final class C64098p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64098p f173292c;

    /* renamed from: d */
    private static volatile C63010eb f173293d;

    /* renamed from: a */
    public int f173294a = 0;

    /* renamed from: b */
    public Object f173295b;

    static {
        C64098p pVar = new C64098p();
        f173292c = pVar;
        C62942bv.registerDefaultInstance(C64098p.class, pVar);
    }

    private C64098p() {
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
                return newMessageInfo(f173292c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C64068dx.class, C63979ap.class, C64026ci.class});
            case 3:
                return new C64098p();
            case 4:
                return new C64096n();
            case 5:
                return f173292c;
            case 6:
                C63010eb ebVar = f173293d;
                if (ebVar == null) {
                    synchronized (C64098p.class) {
                        ebVar = f173293d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173292c);
                            f173293d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

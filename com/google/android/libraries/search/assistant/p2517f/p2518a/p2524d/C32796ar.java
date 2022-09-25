package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.ar */
/* compiled from: PG */
public final class C32796ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32796ar f87973c;

    /* renamed from: d */
    private static volatile C63010eb f87974d;

    /* renamed from: a */
    public int f87975a = 0;

    /* renamed from: b */
    public Object f87976b;

    static {
        C32796ar arVar = new C32796ar();
        f87973c = arVar;
        C62942bv.registerDefaultInstance(C32796ar.class, arVar);
    }

    private C32796ar() {
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
                return newMessageInfo(f87973c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003့\u0000\u0004ြ\u0000\u0005ဿ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", C32791am.class, C32795aq.class, C32831bz.m60797b(), C32873s.class, C32793ao.class});
            case 3:
                return new C32796ar();
            case 4:
                return new C32788aj();
            case 5:
                return f87973c;
            case 6:
                C63010eb ebVar = f87974d;
                if (ebVar == null) {
                    synchronized (C32796ar.class) {
                        ebVar = f87974d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87973c);
                            f87974d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

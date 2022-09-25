package com.google.assistant.p4016z;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.p */
/* compiled from: PG */
public final class C53731p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53731p f141061c;

    /* renamed from: d */
    private static volatile C63010eb f141062d;

    /* renamed from: a */
    public int f141063a = 0;

    /* renamed from: b */
    public Object f141064b;

    static {
        C53731p pVar = new C53731p();
        f141061c = pVar;
        C62942bv.registerDefaultInstance(C53731p.class, pVar);
    }

    private C53731p() {
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
                return newMessageInfo(f141061c, "\u0001\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", C53721f.class, C53684ai.class, C53680ae.class, C53736u.class, C53678ac.class, C53682ag.class});
            case 3:
                return new C53731p();
            case 4:
                return new C53730o();
            case 5:
                return f141061c;
            case 6:
                C63010eb ebVar = f141062d;
                if (ebVar == null) {
                    synchronized (C53731p.class) {
                        ebVar = f141062d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141061c);
                            f141062d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

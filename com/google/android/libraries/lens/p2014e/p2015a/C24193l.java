package com.google.android.libraries.lens.p2014e.p2015a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.e.a.l */
/* compiled from: PG */
public final class C24193l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C24193l f66123c;

    /* renamed from: d */
    private static volatile C63010eb f66124d;

    /* renamed from: a */
    public int f66125a = 0;

    /* renamed from: b */
    public Object f66126b;

    static {
        C24193l lVar = new C24193l();
        f66123c = lVar;
        C62942bv.registerDefaultInstance(C24193l.class, lVar);
    }

    private C24193l() {
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
                return newMessageInfo(f66123c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C24188g.class, C24192k.class, C24185d.class, C24190i.class});
            case 3:
                return new C24193l();
            case 4:
                return new C24186e();
            case 5:
                return f66123c;
            case 6:
                C63010eb ebVar = f66124d;
                if (ebVar == null) {
                    synchronized (C24193l.class) {
                        ebVar = f66124d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66123c);
                            f66124d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

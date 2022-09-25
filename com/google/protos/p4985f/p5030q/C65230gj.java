package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.gj */
/* compiled from: PG */
public final class C65230gj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65230gj f176514c;

    /* renamed from: d */
    private static volatile C63010eb f176515d;

    /* renamed from: a */
    public int f176516a;

    /* renamed from: b */
    public boolean f176517b;

    static {
        C65230gj gjVar = new C65230gj();
        f176514c = gjVar;
        C62942bv.registerDefaultInstance(C65230gj.class, gjVar);
    }

    private C65230gj() {
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
                return newMessageInfo(f176514c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65230gj();
            case 4:
                return new C65229gi();
            case 5:
                return f176514c;
            case 6:
                C63010eb ebVar = f176515d;
                if (ebVar == null) {
                    synchronized (C65230gj.class) {
                        ebVar = f176515d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176514c);
                            f176515d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

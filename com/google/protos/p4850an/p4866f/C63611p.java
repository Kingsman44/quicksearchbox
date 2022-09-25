package com.google.protos.p4850an.p4866f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.f.p */
/* compiled from: PG */
public final class C63611p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63611p f172051c;

    /* renamed from: d */
    private static volatile C63010eb f172052d;

    /* renamed from: a */
    public int f172053a;

    /* renamed from: b */
    public int f172054b;

    static {
        C63611p pVar = new C63611p();
        f172051c = pVar;
        C62942bv.registerDefaultInstance(C63611p.class, pVar);
    }

    private C63611p() {
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
                return newMessageInfo(f172051c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C63610o.f172050a});
            case 3:
                return new C63611p();
            case 4:
                return new C63609n();
            case 5:
                return f172051c;
            case 6:
                C63010eb ebVar = f172052d;
                if (ebVar == null) {
                    synchronized (C63611p.class) {
                        ebVar = f172052d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172051c);
                            f172052d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.bj */
/* compiled from: PG */
public final class C63923bj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63923bj f172858c;

    /* renamed from: d */
    private static volatile C63010eb f172859d;

    /* renamed from: a */
    public C62961ch f172860a = emptyIntList();

    /* renamed from: b */
    public C62961ch f172861b = emptyIntList();

    static {
        C63923bj bjVar = new C63923bj();
        f172858c = bjVar;
        C62942bv.registerDefaultInstance(C63923bj.class, bjVar);
    }

    private C63923bj() {
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
                return newMessageInfo(f172858c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"a", "b"});
            case 3:
                return new C63923bj();
            case 4:
                return new C63922bi();
            case 5:
                return f172858c;
            case 6:
                C63010eb ebVar = f172859d;
                if (ebVar == null) {
                    synchronized (C63923bj.class) {
                        ebVar = f172859d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172858c);
                            f172859d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

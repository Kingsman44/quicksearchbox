package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.dk */
/* compiled from: PG */
public final class C67735dk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67735dk f183774c;

    /* renamed from: d */
    private static volatile C63010eb f183775d;

    /* renamed from: a */
    public int f183776a;

    /* renamed from: b */
    public C67737dm f183777b;

    static {
        C67735dk dkVar = new C67735dk();
        f183774c = dkVar;
        C62942bv.registerDefaultInstance(C67735dk.class, dkVar);
    }

    private C67735dk() {
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
                return newMessageInfo(f183774c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C67735dk();
            case 4:
                return new C67734dj();
            case 5:
                return f183774c;
            case 6:
                C63010eb ebVar = f183775d;
                if (ebVar == null) {
                    synchronized (C67735dk.class) {
                        ebVar = f183775d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183774c);
                            f183775d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

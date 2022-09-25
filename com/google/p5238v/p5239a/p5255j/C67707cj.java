package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.cj */
/* compiled from: PG */
public final class C67707cj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67707cj f183710c;

    /* renamed from: d */
    private static volatile C63010eb f183711d;

    /* renamed from: a */
    public int f183712a;

    /* renamed from: b */
    public int f183713b;

    static {
        C67707cj cjVar = new C67707cj();
        f183710c = cjVar;
        C62942bv.registerDefaultInstance(C67707cj.class, cjVar);
    }

    private C67707cj() {
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
                return newMessageInfo(f183710c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"a", "b"});
            case 3:
                return new C67707cj();
            case 4:
                return new C67706ci();
            case 5:
                return f183710c;
            case 6:
                C63010eb ebVar = f183711d;
                if (ebVar == null) {
                    synchronized (C67707cj.class) {
                        ebVar = f183711d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183710c);
                            f183711d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.cz */
/* compiled from: PG */
public final class C54045cz extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54045cz f141801b;

    /* renamed from: c */
    private static volatile C63010eb f141802c;

    /* renamed from: a */
    public int f141803a;

    static {
        C54045cz czVar = new C54045cz();
        f141801b = czVar;
        C62942bv.registerDefaultInstance(C54045cz.class, czVar);
    }

    private C54045cz() {
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
                return newMessageInfo(f141801b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C54045cz();
            case 4:
                return new C54044cy();
            case 5:
                return f141801b;
            case 6:
                C63010eb ebVar = f141802c;
                if (ebVar == null) {
                    synchronized (C54045cz.class) {
                        ebVar = f141802c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141801b);
                            f141802c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

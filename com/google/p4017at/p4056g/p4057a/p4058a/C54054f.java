package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.f */
/* compiled from: PG */
public final class C54054f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54054f f141816b;

    /* renamed from: c */
    private static volatile C63010eb f141817c;

    /* renamed from: a */
    public C54053e f141818a;

    static {
        C54054f fVar = new C54054f();
        f141816b = fVar;
        C62942bv.registerDefaultInstance(C54054f.class, fVar);
    }

    private C54054f() {
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
                return newMessageInfo(f141816b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C54054f();
            case 4:
                return new C54019c();
            case 5:
                return f141816b;
            case 6:
                C63010eb ebVar = f141817c;
                if (ebVar == null) {
                    synchronized (C54054f.class) {
                        ebVar = f141817c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141816b);
                            f141817c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

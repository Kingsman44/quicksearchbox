package com.google.p4017at.p4027c.p4031b.p4032a.p4033a;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.b.a.a.g */
/* compiled from: PG */
public final class C53877g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53877g f141381b;

    /* renamed from: c */
    private static volatile C63010eb f141382c;

    /* renamed from: a */
    public C57340w f141383a;

    static {
        C53877g gVar = new C53877g();
        f141381b = gVar;
        C62942bv.registerDefaultInstance(C53877g.class, gVar);
    }

    private C53877g() {
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
                return newMessageInfo(f141381b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C53877g();
            case 4:
                return new C53876f();
            case 5:
                return f141381b;
            case 6:
                C63010eb ebVar = f141382c;
                if (ebVar == null) {
                    synchronized (C53877g.class) {
                        ebVar = f141382c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141381b);
                            f141382c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

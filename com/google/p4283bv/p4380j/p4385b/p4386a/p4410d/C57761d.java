package com.google.p4283bv.p4380j.p4385b.p4386a.p4410d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.a.d.d */
/* compiled from: PG */
public final class C57761d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57761d f154343c;

    /* renamed from: d */
    private static volatile C63010eb f154344d;

    /* renamed from: a */
    public int f154345a;

    /* renamed from: b */
    public C57759b f154346b;

    static {
        C57761d dVar = new C57761d();
        f154343c = dVar;
        C62942bv.registerDefaultInstance(C57761d.class, dVar);
    }

    private C57761d() {
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
                return newMessageInfo(f154343c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57761d();
            case 4:
                return new C57760c();
            case 5:
                return f154343c;
            case 6:
                C63010eb ebVar = f154344d;
                if (ebVar == null) {
                    synchronized (C57761d.class) {
                        ebVar = f154344d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154343c);
                            f154344d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

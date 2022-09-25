package com.google.p4283bv.p4380j.p4385b.p4386a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bv.j.b.a.v */
/* compiled from: PG */
public final class C57790v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57790v f154399c;

    /* renamed from: e */
    private static volatile C63010eb f154400e;

    /* renamed from: a */
    public C63088z f154401a = C63088z.f170246b;

    /* renamed from: b */
    public C62971cq f154402b = C62942bv.emptyProtobufList();

    /* renamed from: d */
    private int f154403d;

    static {
        C57790v vVar = new C57790v();
        f154399c = vVar;
        C62942bv.registerDefaultInstance(C57790v.class, vVar);
    }

    private C57790v() {
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
                return newMessageInfo(f154399c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ည\u0001\u0003\u001a", new Object[]{"d", "a", "b"});
            case 3:
                return new C57790v();
            case 4:
                return new C57789u();
            case 5:
                return f154399c;
            case 6:
                C63010eb ebVar = f154400e;
                if (ebVar == null) {
                    synchronized (C57790v.class) {
                        ebVar = f154400e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154399c);
                            f154400e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

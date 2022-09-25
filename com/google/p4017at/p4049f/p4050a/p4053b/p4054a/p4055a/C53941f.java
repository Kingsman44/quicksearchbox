package com.google.p4017at.p4049f.p4050a.p4053b.p4054a.p4055a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.f.a.b.a.a.f */
/* compiled from: PG */
public final class C53941f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53941f f141530c;

    /* renamed from: e */
    private static volatile C63010eb f141531e;

    /* renamed from: a */
    public int f141532a;

    /* renamed from: b */
    public C53937b f141533b;

    /* renamed from: d */
    private int f141534d;

    static {
        C53941f fVar = new C53941f();
        f141530c = fVar;
        C62942bv.registerDefaultInstance(C53941f.class, fVar);
    }

    private C53941f() {
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
                return newMessageInfo(f141530c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", C53938c.f141529a, "b"});
            case 3:
                return new C53941f();
            case 4:
                return new C53940e();
            case 5:
                return f141530c;
            case 6:
                C63010eb ebVar = f141531e;
                if (ebVar == null) {
                    synchronized (C53941f.class) {
                        ebVar = f141531e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141530c);
                            f141531e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

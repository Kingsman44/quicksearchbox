package com.google.p4017at.p4027c.p4031b.p4038c.p4039a;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.b.c.a.b */
/* compiled from: PG */
public final class C53890b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53890b f141419c;

    /* renamed from: d */
    private static volatile C63010eb f141420d;

    /* renamed from: a */
    public C53903o f141421a;

    /* renamed from: b */
    public C57340w f141422b;

    static {
        C53890b bVar = new C53890b();
        f141419c = bVar;
        C62942bv.registerDefaultInstance(C53890b.class, bVar);
    }

    private C53890b() {
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
                return newMessageInfo(f141419c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C53890b();
            case 4:
                return new C53885a();
            case 5:
                return f141419c;
            case 6:
                C63010eb ebVar = f141420d;
                if (ebVar == null) {
                    synchronized (C53890b.class) {
                        ebVar = f141420d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141419c);
                            f141420d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4985f.p4997c.p4998a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.f.c.a.b */
/* compiled from: PG */
public final class C64813b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64813b f175628c;

    /* renamed from: d */
    private static volatile C63010eb f175629d;

    /* renamed from: a */
    public int f175630a;

    /* renamed from: b */
    public C63088z f175631b = C63088z.f170246b;

    static {
        C64813b bVar = new C64813b();
        f175628c = bVar;
        C62942bv.registerDefaultInstance(C64813b.class, bVar);
    }

    private C64813b() {
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
                return newMessageInfo(f175628c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64813b();
            case 4:
                return new C64812a();
            case 5:
                return f175628c;
            case 6:
                C63010eb ebVar = f175629d;
                if (ebVar == null) {
                    synchronized (C64813b.class) {
                        ebVar = f175629d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175628c);
                            f175629d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

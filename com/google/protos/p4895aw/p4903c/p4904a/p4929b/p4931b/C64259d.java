package com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4931b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.aw.c.a.b.b.d */
/* compiled from: PG */
public final class C64259d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64259d f173744c;

    /* renamed from: d */
    private static volatile C63010eb f173745d;

    /* renamed from: a */
    public int f173746a;

    /* renamed from: b */
    public C63088z f173747b = C63088z.f170246b;

    static {
        C64259d dVar = new C64259d();
        f173744c = dVar;
        C62942bv.registerDefaultInstance(C64259d.class, dVar);
    }

    private C64259d() {
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
                return newMessageInfo(f173744c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64259d();
            case 4:
                return new C64258c();
            case 5:
                return f173744c;
            case 6:
                C63010eb ebVar = f173745d;
                if (ebVar == null) {
                    synchronized (C64259d.class) {
                        ebVar = f173745d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173744c);
                            f173745d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

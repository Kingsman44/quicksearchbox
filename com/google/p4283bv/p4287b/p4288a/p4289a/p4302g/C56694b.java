package com.google.p4283bv.p4287b.p4288a.p4289a.p4302g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.g.b */
/* compiled from: PG */
public final class C56694b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56694b f151328c;

    /* renamed from: d */
    private static volatile C63010eb f151329d;

    /* renamed from: a */
    public int f151330a;

    /* renamed from: b */
    public long f151331b;

    static {
        C56694b bVar = new C56694b();
        f151328c = bVar;
        C62942bv.registerDefaultInstance(C56694b.class, bVar);
    }

    private C56694b() {
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
                return newMessageInfo(f151328c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56694b();
            case 4:
                return new C56693a();
            case 5:
                return f151328c;
            case 6:
                C63010eb ebVar = f151329d;
                if (ebVar == null) {
                    synchronized (C56694b.class) {
                        ebVar = f151329d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151328c);
                            f151329d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

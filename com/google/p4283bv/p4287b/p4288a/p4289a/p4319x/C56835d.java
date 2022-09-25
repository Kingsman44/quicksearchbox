package com.google.p4283bv.p4287b.p4288a.p4289a.p4319x;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.x.d */
/* compiled from: PG */
public final class C56835d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56835d f151640c;

    /* renamed from: e */
    private static volatile C63010eb f151641e;

    /* renamed from: a */
    public int f151642a;

    /* renamed from: b */
    public C56833b f151643b;

    /* renamed from: d */
    private int f151644d;

    static {
        C56835d dVar = new C56835d();
        f151640c = dVar;
        C62942bv.registerDefaultInstance(C56835d.class, dVar);
    }

    private C56835d() {
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
                return newMessageInfo(f151640c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C56835d();
            case 4:
                return new C56834c();
            case 5:
                return f151640c;
            case 6:
                C63010eb ebVar = f151641e;
                if (ebVar == null) {
                    synchronized (C56835d.class) {
                        ebVar = f151641e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151640c);
                            f151641e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.p4283bv.p4287b.p4288a.p4289a.p4297b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.b.d */
/* compiled from: PG */
public final class C56656d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56656d f151247c;

    /* renamed from: d */
    private static volatile C63010eb f151248d;

    /* renamed from: a */
    public int f151249a;

    /* renamed from: b */
    public boolean f151250b;

    static {
        C56656d dVar = new C56656d();
        f151247c = dVar;
        C62942bv.registerDefaultInstance(C56656d.class, dVar);
    }

    private C56656d() {
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
                return newMessageInfo(f151247c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56656d();
            case 4:
                return new C56655c();
            case 5:
                return f151247c;
            case 6:
                C63010eb ebVar = f151248d;
                if (ebVar == null) {
                    synchronized (C56656d.class) {
                        ebVar = f151248d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151247c);
                            f151248d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

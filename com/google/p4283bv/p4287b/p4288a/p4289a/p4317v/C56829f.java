package com.google.p4283bv.p4287b.p4288a.p4289a.p4317v;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.v.f */
/* compiled from: PG */
public final class C56829f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56829f f151628c;

    /* renamed from: d */
    private static volatile C63010eb f151629d;

    /* renamed from: a */
    public int f151630a;

    /* renamed from: b */
    public int f151631b;

    static {
        C56829f fVar = new C56829f();
        f151628c = fVar;
        C62942bv.registerDefaultInstance(C56829f.class, fVar);
    }

    private C56829f() {
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
                return newMessageInfo(f151628c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C56828e.m88228b()});
            case 3:
                return new C56829f();
            case 4:
                return new C56826c();
            case 5:
                return f151628c;
            case 6:
                C63010eb ebVar = f151629d;
                if (ebVar == null) {
                    synchronized (C56829f.class) {
                        ebVar = f151629d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151628c);
                            f151629d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

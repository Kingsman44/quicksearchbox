package com.google.p5277z.p5278a.p5279a.p5280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.z.a.a.a.f */
/* compiled from: PG */
public final class C67973f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67973f f184194c;

    /* renamed from: d */
    private static volatile C63010eb f184195d;

    /* renamed from: a */
    public int f184196a;

    /* renamed from: b */
    public C63070h f184197b;

    static {
        C67973f fVar = new C67973f();
        f184194c = fVar;
        C62942bv.registerDefaultInstance(C67973f.class, fVar);
    }

    private C67973f() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f184194c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0002", new Object[]{"a", "b"});
            case 3:
                return new C67973f();
            case 4:
                return new C67972e();
            case 5:
                return f184194c;
            case 6:
                C63010eb ebVar = f184195d;
                if (ebVar == null) {
                    synchronized (C67973f.class) {
                        ebVar = f184195d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184194c);
                            f184195d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

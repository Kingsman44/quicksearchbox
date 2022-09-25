package com.google.protos.p4985f.p5003f.p5004a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.f.f.a.g */
/* compiled from: PG */
public final class C64851g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64851g f175741c;

    /* renamed from: e */
    private static volatile C63010eb f175742e;

    /* renamed from: a */
    public C63088z f175743a = C63088z.f170246b;

    /* renamed from: b */
    public C62971cq f175744b = emptyProtobufList();

    /* renamed from: d */
    private int f175745d;

    static {
        C64851g gVar = new C64851g();
        f175741c = gVar;
        C62942bv.registerDefaultInstance(C64851g.class, gVar);
    }

    private C64851g() {
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
                return newMessageInfo(f175741c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c", new Object[]{"d", "a", "b"});
            case 3:
                return new C64851g();
            case 4:
                return new C64850f();
            case 5:
                return f175741c;
            case 6:
                C63010eb ebVar = f175742e;
                if (ebVar == null) {
                    synchronized (C64851g.class) {
                        ebVar = f175742e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175741c);
                            f175742e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4985f.p4988b.p4990b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.b.g */
/* compiled from: PG */
public final class C64741g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f175493b = new C64739e();

    /* renamed from: d */
    public static final C64741g f175494d;

    /* renamed from: f */
    private static volatile C63010eb f175495f;

    /* renamed from: a */
    public C62961ch f175496a = emptyIntList();

    /* renamed from: c */
    public C62910ar f175497c;

    /* renamed from: e */
    private int f175498e;

    static {
        C64741g gVar = new C64741g();
        f175494d = gVar;
        C62942bv.registerDefaultInstance(C64741g.class, gVar);
    }

    private C64741g() {
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
                return newMessageInfo(f175494d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001e\u0002ဉ\u0000", new Object[]{"e", "a", C64736b.m96452b(), C45240c.f118157a});
            case 3:
                return new C64741g();
            case 4:
                return new C64740f();
            case 5:
                return f175494d;
            case 6:
                C63010eb ebVar = f175495f;
                if (ebVar == null) {
                    synchronized (C64741g.class) {
                        ebVar = f175495f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175494d);
                            f175495f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

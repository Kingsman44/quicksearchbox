package com.google.p4283bv.p4287b.p4288a.p4289a.p4294ad;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.ad.f */
/* compiled from: PG */
public final class C56636f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56636f f151205c;

    /* renamed from: e */
    private static volatile C63010eb f151206e;

    /* renamed from: a */
    public C62971cq f151207a = emptyProtobufList();

    /* renamed from: b */
    public C56635e f151208b;

    /* renamed from: d */
    private int f151209d;

    static {
        C56636f fVar = new C56636f();
        f151205c = fVar;
        C62942bv.registerDefaultInstance(C56636f.class, fVar);
    }

    private C56636f() {
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
                return newMessageInfo(f151205c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"d", "a", C56642l.class, "b"});
            case 3:
                return new C56636f();
            case 4:
                return new C56633c();
            case 5:
                return f151205c;
            case 6:
                C63010eb ebVar = f151206e;
                if (ebVar == null) {
                    synchronized (C56636f.class) {
                        ebVar = f151206e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151205c);
                            f151206e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

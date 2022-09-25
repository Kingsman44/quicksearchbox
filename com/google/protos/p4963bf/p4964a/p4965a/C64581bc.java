package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.bc */
/* compiled from: PG */
public final class C64581bc extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64581bc f175093f;

    /* renamed from: g */
    private static volatile C63010eb f175094g;

    /* renamed from: a */
    public int f175095a;

    /* renamed from: b */
    public float f175096b;

    /* renamed from: c */
    public float f175097c;

    /* renamed from: d */
    public float f175098d;

    /* renamed from: e */
    public float f175099e;

    static {
        C64581bc bcVar = new C64581bc();
        f175093f = bcVar;
        C62942bv.registerDefaultInstance(C64581bc.class, bcVar);
    }

    private C64581bc() {
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
                return newMessageInfo(f175093f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64581bc();
            case 4:
                return new C64580bb();
            case 5:
                return f175093f;
            case 6:
                C63010eb ebVar = f175094g;
                if (ebVar == null) {
                    synchronized (C64581bc.class) {
                        ebVar = f175094g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175093f);
                            f175094g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

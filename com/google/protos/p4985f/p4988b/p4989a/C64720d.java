package com.google.protos.p4985f.p4988b.p4989a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.a.d */
/* compiled from: PG */
public final class C64720d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64720d f175437a;

    /* renamed from: e */
    private static volatile C63010eb f175438e;

    /* renamed from: b */
    private int f175439b;

    /* renamed from: c */
    private C64719c f175440c;

    /* renamed from: d */
    private byte f175441d = 2;

    static {
        C64720d dVar = new C64720d();
        f175437a = dVar;
        C62942bv.registerDefaultInstance(C64720d.class, dVar);
    }

    private C64720d() {
        emptyIntList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175441d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175441d = b;
                return null;
            case 2:
                return newMessageInfo(f175437a, "\u0001\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0001\u000bᐉ\u0015", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C64720d();
            case 4:
                return new C64717a();
            case 5:
                return f175437a;
            case 6:
                C63010eb ebVar = f175438e;
                if (ebVar == null) {
                    synchronized (C64720d.class) {
                        ebVar = f175438e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175437a);
                            f175438e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

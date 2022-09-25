package com.google.protos.p5132q;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4172bg.C55747h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.q.c */
/* compiled from: PG */
public final class C65860c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65860c f179028a;

    /* renamed from: e */
    private static volatile C63010eb f179029e;

    /* renamed from: b */
    private int f179030b;

    /* renamed from: c */
    private C55747h f179031c;

    /* renamed from: d */
    private byte f179032d = 2;

    static {
        C65860c cVar = new C65860c();
        f179028a = cVar;
        C62942bv.registerDefaultInstance(C65860c.class, cVar);
    }

    private C65860c() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179032d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179032d = b;
                return null;
            case 2:
                return newMessageInfo(f179028a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C65860c();
            case 4:
                return new C65859b();
            case 5:
                return f179028a;
            case 6:
                C63010eb ebVar = f179029e;
                if (ebVar == null) {
                    synchronized (C65860c.class) {
                        ebVar = f179029e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179028a);
                            f179029e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

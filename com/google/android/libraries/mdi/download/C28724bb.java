package com.google.android.libraries.mdi.download;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.libraries.mdi.download.bb */
/* compiled from: PG */
public final class C28724bb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C28724bb f78028e;

    /* renamed from: f */
    private static volatile C63010eb f78029f;

    /* renamed from: a */
    public int f78030a;

    /* renamed from: b */
    public C62971cq f78031b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C63070h f78032c;

    /* renamed from: d */
    public C28723ba f78033d;

    static {
        C28724bb bbVar = new C28724bb();
        f78028e = bbVar;
        C62942bv.registerDefaultInstance(C28724bb.class, bbVar);
    }

    private C28724bb() {
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
                return newMessageInfo(f78028e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C28724bb();
            case 4:
                return new C28719ay();
            case 5:
                return f78028e;
            case 6:
                C63010eb ebVar = f78029f;
                if (ebVar == null) {
                    synchronized (C28724bb.class) {
                        ebVar = f78029f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78028e);
                            f78029f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

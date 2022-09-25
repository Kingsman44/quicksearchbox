package com.google.protos.p4813ah.p4814a.p4815a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ah.a.a.j */
/* compiled from: PG */
public final class C63177j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63177j f170578d;

    /* renamed from: e */
    private static volatile C63010eb f170579e;

    /* renamed from: a */
    public int f170580a;

    /* renamed from: b */
    public int f170581b;

    /* renamed from: c */
    public int f170582c;

    static {
        C63177j jVar = new C63177j();
        f170578d = jVar;
        C62942bv.registerDefaultInstance(C63177j.class, jVar);
    }

    private C63177j() {
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
                return newMessageInfo(f170578d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003င\u0001\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63177j();
            case 4:
                return new C63176i();
            case 5:
                return f170578d;
            case 6:
                C63010eb ebVar = f170579e;
                if (ebVar == null) {
                    synchronized (C63177j.class) {
                        ebVar = f170579e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170578d);
                            f170579e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

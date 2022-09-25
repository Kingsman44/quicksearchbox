package com.google.protos.p4813ah.p4814a.p4815a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.protos.ah.a.a.d */
/* compiled from: PG */
public final class C63171d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63171d f170567a;

    /* renamed from: e */
    private static volatile C63010eb f170568e;

    /* renamed from: b */
    private int f170569b;

    /* renamed from: c */
    private C63771b f170570c;

    /* renamed from: d */
    private byte f170571d = 2;

    static {
        C63171d dVar = new C63171d();
        f170567a = dVar;
        C62942bv.registerDefaultInstance(C63171d.class, dVar);
    }

    private C63171d() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f170571d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f170571d = b;
                return null;
            case 2:
                return newMessageInfo(f170567a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\bᐉ\u0006", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63171d();
            case 4:
                return new C63170c();
            case 5:
                return f170567a;
            case 6:
                C63010eb ebVar = f170568e;
                if (ebVar == null) {
                    synchronized (C63171d.class) {
                        ebVar = f170568e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170567a);
                            f170568e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.protos.p4893av.p4894a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.protos.av.a.f */
/* compiled from: PG */
public final class C63849f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63849f f172656a;

    /* renamed from: f */
    private static volatile C63010eb f172657f;

    /* renamed from: b */
    private int f172658b;

    /* renamed from: c */
    private C63845b f172659c;

    /* renamed from: d */
    private C63771b f172660d;

    /* renamed from: e */
    private byte f172661e = 2;

    static {
        C63849f fVar = new C63849f();
        f172656a = fVar;
        C62942bv.registerDefaultInstance(C63849f.class, fVar);
    }

    private C63849f() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172661e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172661e = b;
                return null;
            case 2:
                return newMessageInfo(f172656a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0002\u0004ᐉ\u0000\u0005ᐉ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C63849f();
            case 4:
                return new C63848e();
            case 5:
                return f172656a;
            case 6:
                C63010eb ebVar = f172657f;
                if (ebVar == null) {
                    synchronized (C63849f.class) {
                        ebVar = f172657f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172656a);
                            f172657f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

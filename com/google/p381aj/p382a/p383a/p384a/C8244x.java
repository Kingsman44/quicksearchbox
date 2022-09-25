package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.a.x */
/* compiled from: PG */
public final class C8244x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8244x f28959a;

    /* renamed from: f */
    private static volatile C63010eb f28960f;

    /* renamed from: b */
    private int f28961b;

    /* renamed from: c */
    private C8242v f28962c;

    /* renamed from: d */
    private C8242v f28963d;

    /* renamed from: e */
    private byte f28964e = 2;

    static {
        C8244x xVar = new C8244x();
        f28959a = xVar;
        C62942bv.registerDefaultInstance(C8244x.class, xVar);
    }

    private C8244x() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28964e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28964e = b;
                return null;
            case 2:
                return newMessageInfo(f28959a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0000\u0004ᐉ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C8244x();
            case 4:
                return new C8243w();
            case 5:
                return f28959a;
            case 6:
                C63010eb ebVar = f28960f;
                if (ebVar == null) {
                    synchronized (C8244x.class) {
                        ebVar = f28960f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28959a);
                            f28960f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

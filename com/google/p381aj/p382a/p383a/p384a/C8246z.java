package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.a.z */
/* compiled from: PG */
public final class C8246z extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8246z f28965a;

    /* renamed from: e */
    private static volatile C63010eb f28966e;

    /* renamed from: b */
    private int f28967b;

    /* renamed from: c */
    private C8242v f28968c;

    /* renamed from: d */
    private byte f28969d = 2;

    static {
        C8246z zVar = new C8246z();
        f28965a = zVar;
        C62942bv.registerDefaultInstance(C8246z.class, zVar);
    }

    private C8246z() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28969d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28969d = b;
                return null;
            case 2:
                return newMessageInfo(f28965a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8246z();
            case 4:
                return new C8245y();
            case 5:
                return f28965a;
            case 6:
                C63010eb ebVar = f28966e;
                if (ebVar == null) {
                    synchronized (C8246z.class) {
                        ebVar = f28966e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28965a);
                            f28966e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

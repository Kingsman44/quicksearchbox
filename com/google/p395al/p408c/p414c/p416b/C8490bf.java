package com.google.p395al.p408c.p414c.p416b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.bf */
/* compiled from: PG */
public final class C8490bf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8490bf f29454b;

    /* renamed from: d */
    private static volatile C63010eb f29455d;

    /* renamed from: a */
    public C8464ag f29456a;

    /* renamed from: c */
    private int f29457c;

    static {
        C8490bf bfVar = new C8490bf();
        f29454b = bfVar;
        C62942bv.registerDefaultInstance(C8490bf.class, bfVar);
    }

    private C8490bf() {
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
                return newMessageInfo(f29454b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C8490bf();
            case 4:
                return new C8489be();
            case 5:
                return f29454b;
            case 6:
                C63010eb ebVar = f29455d;
                if (ebVar == null) {
                    synchronized (C8490bf.class) {
                        ebVar = f29455d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29454b);
                            f29455d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

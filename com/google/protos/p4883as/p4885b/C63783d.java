package com.google.protos.p4883as.p4885b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.as.b.d */
/* compiled from: PG */
public final class C63783d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63783d f172538b;

    /* renamed from: d */
    private static volatile C63010eb f172539d;

    /* renamed from: a */
    public boolean f172540a;

    /* renamed from: c */
    private int f172541c;

    static {
        C63783d dVar = new C63783d();
        f172538b = dVar;
        C62942bv.registerDefaultInstance(C63783d.class, dVar);
    }

    private C63783d() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f172538b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C63783d();
            case 4:
                return new C63782c();
            case 5:
                return f172538b;
            case 6:
                C63010eb ebVar = f172539d;
                if (ebVar == null) {
                    synchronized (C63783d.class) {
                        ebVar = f172539d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172538b);
                            f172539d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

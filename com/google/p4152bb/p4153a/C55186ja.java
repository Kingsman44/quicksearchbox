package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.ja */
/* compiled from: PG */
public final class C55186ja extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55186ja f145265b;

    /* renamed from: d */
    private static volatile C63010eb f145266d;

    /* renamed from: a */
    public boolean f145267a = true;

    /* renamed from: c */
    private int f145268c;

    static {
        C55186ja jaVar = new C55186ja();
        f145265b = jaVar;
        C62942bv.registerDefaultInstance(C55186ja.class, jaVar);
    }

    private C55186ja() {
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
                return newMessageInfo(f145265b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C55186ja();
            case 4:
                return new C55184iz();
            case 5:
                return f145265b;
            case 6:
                C63010eb ebVar = f145266d;
                if (ebVar == null) {
                    synchronized (C55186ja.class) {
                        ebVar = f145266d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145265b);
                            f145266d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

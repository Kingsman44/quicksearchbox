package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.f */
/* compiled from: PG */
public final class C142429f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142429f f386490d;

    /* renamed from: e */
    private static volatile C63010eb f386491e;

    /* renamed from: a */
    public int f386492a;

    /* renamed from: b */
    public boolean f386493b;

    /* renamed from: c */
    public boolean f386494c;

    static {
        C142429f fVar = new C142429f();
        f386490d = fVar;
        C62942bv.registerDefaultInstance(C142429f.class, fVar);
    }

    private C142429f() {
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
                return newMessageInfo(f386490d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C142429f();
            case 4:
                return new C142402e();
            case 5:
                return f386490d;
            case 6:
                C63010eb ebVar = f386491e;
                if (ebVar == null) {
                    synchronized (C142429f.class) {
                        ebVar = f386491e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386490d);
                            f386491e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

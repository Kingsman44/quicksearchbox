package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ok */
/* compiled from: PG */
public final class C60327ok extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60327ok f163257e;

    /* renamed from: f */
    private static volatile C63010eb f163258f;

    /* renamed from: a */
    public int f163259a;

    /* renamed from: b */
    public long f163260b;

    /* renamed from: c */
    public int f163261c;

    /* renamed from: d */
    public int f163262d;

    static {
        C60327ok okVar = new C60327ok();
        f163257e = okVar;
        C62942bv.registerDefaultInstance(C60327ok.class, okVar);
    }

    private C60327ok() {
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
                return newMessageInfo(f163257e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60327ok();
            case 4:
                return new C60326oj();
            case 5:
                return f163257e;
            case 6:
                C63010eb ebVar = f163258f;
                if (ebVar == null) {
                    synchronized (C60327ok.class) {
                        ebVar = f163258f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163257e);
                            f163258f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.p337aa;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aa.f */
/* compiled from: PG */
public final class C6619f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C6619f f19675e;

    /* renamed from: f */
    private static volatile C63010eb f19676f;

    /* renamed from: a */
    public int f19677a;

    /* renamed from: b */
    public long f19678b;

    /* renamed from: c */
    public long f19679c;

    /* renamed from: d */
    public boolean f19680d;

    static {
        C6619f fVar = new C6619f();
        f19675e = fVar;
        C62942bv.registerDefaultInstance(C6619f.class, fVar);
    }

    private C6619f() {
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
                return newMessageInfo(f19675e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C6619f();
            case 4:
                return new C6618e();
            case 5:
                return f19675e;
            case 6:
                C63010eb ebVar = f19676f;
                if (ebVar == null) {
                    synchronized (C6619f.class) {
                        ebVar = f19676f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19675e);
                            f19676f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

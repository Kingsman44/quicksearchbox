package com.google.protos.p4985f.p5030q;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.dt */
/* compiled from: PG */
public final class C65159dt extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C65159dt f176339f;

    /* renamed from: g */
    private static volatile C63010eb f176340g;

    /* renamed from: a */
    public boolean f176341a;

    /* renamed from: b */
    public boolean f176342b;

    /* renamed from: c */
    public boolean f176343c;

    /* renamed from: d */
    public boolean f176344d;

    /* renamed from: e */
    public boolean f176345e;

    static {
        C65159dt dtVar = new C65159dt();
        f176339f = dtVar;
        C62942bv.registerDefaultInstance(C65159dt.class, dtVar);
    }

    private C65159dt() {
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
                return newMessageInfo(f176339f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C65159dt();
            case 4:
                return new C65158ds();
            case 5:
                return f176339f;
            case 6:
                C63010eb ebVar = f176340g;
                if (ebVar == null) {
                    synchronized (C65159dt.class) {
                        ebVar = f176340g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176339f);
                            f176340g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

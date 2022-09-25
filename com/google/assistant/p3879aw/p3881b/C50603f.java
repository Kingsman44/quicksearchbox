package com.google.assistant.p3879aw.p3881b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.aff;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aw.b.f */
/* compiled from: PG */
public final class C50603f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50603f f131661e;

    /* renamed from: f */
    private static volatile C63010eb f131662f;

    /* renamed from: a */
    public int f131663a;

    /* renamed from: b */
    public int f131664b = 0;

    /* renamed from: c */
    public Object f131665c;

    /* renamed from: d */
    public aff f131666d;

    static {
        C50603f fVar = new C50603f();
        f131661e = fVar;
        C62942bv.registerDefaultInstance(C50603f.class, fVar);
    }

    private C50603f() {
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
                return newMessageInfo(f131661e, "\u0001\u0002\u0001\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003ြ\u0000\u0005ဉ\u0001", new Object[]{C45240c.f118157a, "b", "a", C50602e.class, "d"});
            case 3:
                return new C50603f();
            case 4:
                return new C50594a();
            case 5:
                return f131661e;
            case 6:
                C63010eb ebVar = f131662f;
                if (ebVar == null) {
                    synchronized (C50603f.class) {
                        ebVar = f131662f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131661e);
                            f131662f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

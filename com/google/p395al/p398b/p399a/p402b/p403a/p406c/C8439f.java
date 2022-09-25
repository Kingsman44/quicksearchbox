package com.google.p395al.p398b.p399a.p402b.p403a.p406c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p398b.p399a.p402b.p403a.p407d.C8441b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.b.a.b.a.c.f */
/* compiled from: PG */
public final class C8439f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8439f f29332d;

    /* renamed from: e */
    private static volatile C63010eb f29333e;

    /* renamed from: a */
    public C8441b f29334a;

    /* renamed from: b */
    public int f29335b;

    /* renamed from: c */
    public int f29336c;

    static {
        C8439f fVar = new C8439f();
        f29332d = fVar;
        C62942bv.registerDefaultInstance(C8439f.class, fVar);
    }

    private C8439f() {
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
                return newMessageInfo(f29332d, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002\t\u0003\u0004\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8439f();
            case 4:
                return new C8438e();
            case 5:
                return f29332d;
            case 6:
                C63010eb ebVar = f29333e;
                if (ebVar == null) {
                    synchronized (C8439f.class) {
                        ebVar = f29333e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29332d);
                            f29333e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

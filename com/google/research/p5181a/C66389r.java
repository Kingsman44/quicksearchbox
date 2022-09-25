package com.google.research.p5181a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.a.r */
/* compiled from: PG */
public final class C66389r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f180520d = new C66385n();

    /* renamed from: e */
    public static final C66389r f180521e;

    /* renamed from: f */
    private static volatile C63010eb f180522f;

    /* renamed from: a */
    public int f180523a;

    /* renamed from: b */
    public long f180524b;

    /* renamed from: c */
    public C62961ch f180525c = emptyIntList();

    static {
        C66389r rVar = new C66389r();
        f180521e = rVar;
        C62942bv.registerDefaultInstance(C66389r.class, rVar);
    }

    private C66389r() {
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
                return newMessageInfo(f180521e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001e", new Object[]{"a", "b", C45240c.f118157a, C66387p.m97186b()});
            case 3:
                return new C66389r();
            case 4:
                return new C66388q();
            case 5:
                return f180521e;
            case 6:
                C63010eb ebVar = f180522f;
                if (ebVar == null) {
                    synchronized (C66389r.class) {
                        ebVar = f180522f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180521e);
                            f180522f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

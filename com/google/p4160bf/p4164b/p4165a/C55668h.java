package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.h */
/* compiled from: PG */
public final class C55668h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55668h f146878e;

    /* renamed from: f */
    private static volatile C63010eb f146879f;

    /* renamed from: a */
    public int f146880a;

    /* renamed from: b */
    public int f146881b;

    /* renamed from: c */
    public String f146882c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f146883d;

    static {
        C55668h hVar = new C55668h();
        f146878e = hVar;
        C62942bv.registerDefaultInstance(C55668h.class, hVar);
    }

    private C55668h() {
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
                return newMessageInfo(f146878e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C55664d.f146876a, C45240c.f118157a, "d", C55666f.f146877a});
            case 3:
                return new C55668h();
            case 4:
                return new C55665e();
            case 5:
                return f146878e;
            case 6:
                C63010eb ebVar = f146879f;
                if (ebVar == null) {
                    synchronized (C55668h.class) {
                        ebVar = f146879f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146878e);
                            f146879f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

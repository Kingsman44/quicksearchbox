package com.google.common.p4552o.p4570p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.n */
/* compiled from: PG */
public final class C60393n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60393n f163432f;

    /* renamed from: g */
    private static volatile C63010eb f163433g;

    /* renamed from: a */
    public int f163434a;

    /* renamed from: b */
    public int f163435b;

    /* renamed from: c */
    public int f163436c;

    /* renamed from: d */
    public int f163437d;

    /* renamed from: e */
    public int f163438e;

    static {
        C60393n nVar = new C60393n();
        f163432f = nVar;
        C62942bv.registerDefaultInstance(C60393n.class, nVar);
    }

    private C60393n() {
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
                return newMessageInfo(f163432f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, C60391l.f163430a, "d", C60392m.f163431a, "e"});
            case 3:
                return new C60393n();
            case 4:
                return new C60390k();
            case 5:
                return f163432f;
            case 6:
                C63010eb ebVar = f163433g;
                if (ebVar == null) {
                    synchronized (C60393n.class) {
                        ebVar = f163433g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163432f);
                            f163433g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

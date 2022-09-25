package com.google.speech.p5228m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.bi */
/* compiled from: PG */
public final class C67305bi extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C67305bi f182944f;

    /* renamed from: g */
    private static volatile C63010eb f182945g;

    /* renamed from: a */
    public int f182946a;

    /* renamed from: b */
    public long f182947b;

    /* renamed from: c */
    public int f182948c;

    /* renamed from: d */
    public boolean f182949d = true;

    /* renamed from: e */
    public int f182950e;

    static {
        C67305bi biVar = new C67305bi();
        f182944f = biVar;
        C62942bv.registerDefaultInstance(C67305bi.class, biVar);
    }

    private C67305bi() {
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
                return newMessageInfo(f182944f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, C67304bh.f182943a, "d", "e", C67277ah.f182881a});
            case 3:
                return new C67305bi();
            case 4:
                return new C67303bg();
            case 5:
                return f182944f;
            case 6:
                C63010eb ebVar = f182945g;
                if (ebVar == null) {
                    synchronized (C67305bi.class) {
                        ebVar = f182945g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182944f);
                            f182945g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

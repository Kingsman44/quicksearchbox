package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.bo */
/* compiled from: PG */
public final class C48626bo extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48626bo f125662f;

    /* renamed from: g */
    private static volatile C63010eb f125663g;

    /* renamed from: a */
    public int f125664a;

    /* renamed from: b */
    public int f125665b;

    /* renamed from: c */
    public int f125666c;

    /* renamed from: d */
    public int f125667d;

    /* renamed from: e */
    public int f125668e;

    static {
        C48626bo boVar = new C48626bo();
        f125662f = boVar;
        C62942bv.registerDefaultInstance(C48626bo.class, boVar);
    }

    private C48626bo() {
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
                return newMessageInfo(f125662f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f", new Object[]{"b", C45240c.f118157a, "a", "d", "e"});
            case 3:
                return new C48626bo();
            case 4:
                return new C48623bl();
            case 5:
                return f125662f;
            case 6:
                C63010eb ebVar = f125663g;
                if (ebVar == null) {
                    synchronized (C48626bo.class) {
                        ebVar = f125663g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125662f);
                            f125663g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

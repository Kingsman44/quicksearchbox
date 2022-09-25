package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.bj */
/* compiled from: PG */
public final class C51849bj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51849bj f136012d;

    /* renamed from: f */
    private static volatile C63010eb f136013f;

    /* renamed from: a */
    public int f136014a;

    /* renamed from: b */
    public long f136015b;

    /* renamed from: c */
    public boolean f136016c;

    /* renamed from: e */
    private int f136017e;

    static {
        C51849bj bjVar = new C51849bj();
        f136012d = bjVar;
        C62942bv.registerDefaultInstance(C51849bj.class, bjVar);
    }

    private C51849bj() {
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
                return newMessageInfo(f136012d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", C51846bg.f136011a, "b", C45240c.f118157a});
            case 3:
                return new C51849bj();
            case 4:
                return new C51848bi();
            case 5:
                return f136012d;
            case 6:
                C63010eb ebVar = f136013f;
                if (ebVar == null) {
                    synchronized (C51849bj.class) {
                        ebVar = f136013f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136012d);
                            f136013f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

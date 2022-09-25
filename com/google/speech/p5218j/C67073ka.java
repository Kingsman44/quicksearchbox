package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ka */
/* compiled from: PG */
public final class C67073ka extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C67073ka f182324f;

    /* renamed from: g */
    private static volatile C63010eb f182325g;

    /* renamed from: a */
    public int f182326a;

    /* renamed from: b */
    public C67171p f182327b;

    /* renamed from: c */
    public int f182328c;

    /* renamed from: d */
    public int f182329d;

    /* renamed from: e */
    public long f182330e;

    static {
        C67073ka kaVar = new C67073ka();
        f182324f = kaVar;
        C62942bv.registerDefaultInstance(C67073ka.class, kaVar);
    }

    private C67073ka() {
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
                return newMessageInfo(f182324f, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0002\u0003င\u0003\tဂ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C67073ka();
            case 4:
                return new C67071jz();
            case 5:
                return f182324f;
            case 6:
                C63010eb ebVar = f182325g;
                if (ebVar == null) {
                    synchronized (C67073ka.class) {
                        ebVar = f182325g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182324f);
                            f182325g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

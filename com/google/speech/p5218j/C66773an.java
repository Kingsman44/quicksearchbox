package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.an */
/* compiled from: PG */
public final class C66773an extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66773an f181596d;

    /* renamed from: e */
    private static volatile C63010eb f181597e;

    /* renamed from: a */
    public int f181598a;

    /* renamed from: b */
    public boolean f181599b;

    /* renamed from: c */
    public long f181600c;

    static {
        C66773an anVar = new C66773an();
        f181596d = anVar;
        C62942bv.registerDefaultInstance(C66773an.class, anVar);
    }

    private C66773an() {
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
                return newMessageInfo(f181596d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66773an();
            case 4:
                return new C66772am();
            case 5:
                return f181596d;
            case 6:
                C63010eb ebVar = f181597e;
                if (ebVar == null) {
                    synchronized (C66773an.class) {
                        ebVar = f181597e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181596d);
                            f181597e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

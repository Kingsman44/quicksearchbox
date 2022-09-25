package com.google.assistant.p4008y.p4013d.p4014a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.d.a.h */
/* compiled from: PG */
public final class C53639h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53639h f140775d;

    /* renamed from: f */
    private static volatile C63010eb f140776f;

    /* renamed from: a */
    public int f140777a = 0;

    /* renamed from: b */
    public Object f140778b;

    /* renamed from: c */
    public int f140779c;

    /* renamed from: e */
    private int f140780e;

    static {
        C53639h hVar = new C53639h();
        f140775d = hVar;
        C62942bv.registerDefaultInstance(C53639h.class, hVar);
    }

    private C53639h() {
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
                return newMessageInfo(f140775d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003ျ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C53636e.f140774a, C53643l.class});
            case 3:
                return new C53639h();
            case 4:
                return new C53638g();
            case 5:
                return f140775d;
            case 6:
                C63010eb ebVar = f140776f;
                if (ebVar == null) {
                    synchronized (C53639h.class) {
                        ebVar = f140776f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140775d);
                            f140776f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

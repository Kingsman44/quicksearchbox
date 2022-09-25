package com.google.android.apps.p8919h.p8920a.p8921a.p8922a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5285d.p5290b.p5291a.p5292a.C68199l;

/* renamed from: com.google.android.apps.h.a.a.a.al */
/* compiled from: PG */
public final class C119103al extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C119103al f332227e;

    /* renamed from: f */
    private static volatile C63010eb f332228f;

    /* renamed from: a */
    public int f332229a = 0;

    /* renamed from: b */
    public Object f332230b;

    /* renamed from: c */
    public int f332231c;

    /* renamed from: d */
    public boolean f332232d;

    static {
        C119103al alVar = new C119103al();
        f332227e = alVar;
        C62942bv.registerDefaultInstance(C119103al.class, alVar);
    }

    private C119103al() {
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
                return newMessageInfo(f332227e, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\f\u0005\u0007", new Object[]{"b", "a", C119102ak.class, C119100ai.class, C68199l.class, C45240c.f118157a, "d"});
            case 3:
                return new C119103al();
            case 4:
                return new C119097af();
            case 5:
                return f332227e;
            case 6:
                C63010eb ebVar = f332228f;
                if (ebVar == null) {
                    synchronized (C119103al.class) {
                        ebVar = f332228f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332227e);
                            f332228f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

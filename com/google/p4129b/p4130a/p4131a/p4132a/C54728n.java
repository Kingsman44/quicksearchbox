package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.n */
/* compiled from: PG */
public final class C54728n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54728n f143627c;

    /* renamed from: d */
    private static volatile C63010eb f143628d;

    /* renamed from: a */
    public int f143629a = 0;

    /* renamed from: b */
    public Object f143630b;

    static {
        C54728n nVar = new C54728n();
        f143627c = nVar;
        C62942bv.registerDefaultInstance(C54728n.class, nVar);
    }

    private C54728n() {
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
                return newMessageInfo(f143627c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C54720f.class, C54723i.class, C54727m.class, C54725k.class});
            case 3:
                return new C54728n();
            case 4:
                return new C54721g();
            case 5:
                return f143627c;
            case 6:
                C63010eb ebVar = f143628d;
                if (ebVar == null) {
                    synchronized (C54728n.class) {
                        ebVar = f143628d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143627c);
                            f143628d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

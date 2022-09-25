package com.google.nlp.p4735b.p4736a.p4738b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.b.g */
/* compiled from: PG */
public final class C62825g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62825g f169654c;

    /* renamed from: d */
    private static volatile C63010eb f169655d;

    /* renamed from: a */
    public int f169656a = 0;

    /* renamed from: b */
    public Object f169657b;

    static {
        C62825g gVar = new C62825g();
        f169654c = gVar;
        C62942bv.registerDefaultInstance(C62825g.class, gVar);
    }

    private C62825g() {
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
                return newMessageInfo(f169654c, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"b", "a", C62820b.class, C62822d.class, C62820b.class, C62825g.class, C62820b.class, C62827i.class});
            case 3:
                return new C62825g();
            case 4:
                return new C62823e();
            case 5:
                return f169654c;
            case 6:
                C63010eb ebVar = f169655d;
                if (ebVar == null) {
                    synchronized (C62825g.class) {
                        ebVar = f169655d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169654c);
                            f169655d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

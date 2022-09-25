package com.google.p4017at.p4086k.p4087a.p4090b.p4091a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.b.a.w */
/* compiled from: PG */
public final class C54514w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54514w f143133c;

    /* renamed from: d */
    private static volatile C63010eb f143134d;

    /* renamed from: a */
    public boolean f143135a;

    /* renamed from: b */
    public boolean f143136b;

    static {
        C54514w wVar = new C54514w();
        f143133c = wVar;
        C62942bv.registerDefaultInstance(C54514w.class, wVar);
    }

    private C54514w() {
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
                return newMessageInfo(f143133c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C54514w();
            case 4:
                return new C54513v();
            case 5:
                return f143133c;
            case 6:
                C63010eb ebVar = f143134d;
                if (ebVar == null) {
                    synchronized (C54514w.class) {
                        ebVar = f143134d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143133c);
                            f143134d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

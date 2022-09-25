package com.google.protos.p4985f.p5020k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.k.al */
/* compiled from: PG */
public final class C64910al extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64910al f175821a;

    /* renamed from: c */
    private static volatile C63010eb f175822c;

    /* renamed from: b */
    private C62995dn f175823b = C62995dn.f170057a;

    static {
        C64910al alVar = new C64910al();
        f175821a = alVar;
        C62942bv.registerDefaultInstance(C64910al.class, alVar);
    }

    private C64910al() {
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
                return newMessageInfo(f175821a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C64907ai.f175818a});
            case 3:
                return new C64910al();
            case 4:
                return new C64906ah();
            case 5:
                return f175821a;
            case 6:
                C63010eb ebVar = f175822c;
                if (ebVar == null) {
                    synchronized (C64910al.class) {
                        ebVar = f175822c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175821a);
                            f175822c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

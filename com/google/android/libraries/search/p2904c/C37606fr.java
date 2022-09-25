package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.fr */
/* compiled from: PG */
public final class C37606fr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37606fr f99935c;

    /* renamed from: d */
    private static volatile C63010eb f99936d;

    /* renamed from: a */
    public int f99937a;

    /* renamed from: b */
    public int f99938b;

    static {
        C37606fr frVar = new C37606fr();
        f99935c = frVar;
        C62942bv.registerDefaultInstance(C37606fr.class, frVar);
    }

    private C37606fr() {
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
                return newMessageInfo(f99935c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C37607fs.f99939a});
            case 3:
                return new C37606fr();
            case 4:
                return new C37605fq();
            case 5:
                return f99935c;
            case 6:
                C63010eb ebVar = f99936d;
                if (ebVar == null) {
                    synchronized (C37606fr.class) {
                        ebVar = f99936d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99935c);
                            f99936d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

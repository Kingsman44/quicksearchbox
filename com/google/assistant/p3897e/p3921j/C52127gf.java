package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.gf */
/* compiled from: PG */
public final class C52127gf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52127gf f136785b;

    /* renamed from: c */
    private static volatile C63010eb f136786c;

    /* renamed from: a */
    public C62995dn f136787a = C62995dn.f170057a;

    static {
        C52127gf gfVar = new C52127gf();
        f136785b = gfVar;
        C62942bv.registerDefaultInstance(C52127gf.class, gfVar);
    }

    private C52127gf() {
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
                return newMessageInfo(f136785b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C52126ge.f136784a});
            case 3:
                return new C52127gf();
            case 4:
                return new C52125gd();
            case 5:
                return f136785b;
            case 6:
                C63010eb ebVar = f136786c;
                if (ebVar == null) {
                    synchronized (C52127gf.class) {
                        ebVar = f136786c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136785b);
                            f136786c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

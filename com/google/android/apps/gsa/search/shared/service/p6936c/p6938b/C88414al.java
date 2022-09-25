package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.al */
/* compiled from: PG */
public final class C88414al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88414al f239058c;

    /* renamed from: d */
    private static volatile C63010eb f239059d;

    /* renamed from: a */
    public int f239060a = 0;

    /* renamed from: b */
    public Object f239061b;

    static {
        C88414al alVar = new C88414al();
        f239058c = alVar;
        C62942bv.registerDefaultInstance(C88414al.class, alVar);
    }

    private C88414al() {
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
                return newMessageInfo(f239058c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C88412aj.class, C88416an.class});
            case 3:
                return new C88414al();
            case 4:
                return new C88413ak();
            case 5:
                return f239058c;
            case 6:
                C63010eb ebVar = f239059d;
                if (ebVar == null) {
                    synchronized (C88414al.class) {
                        ebVar = f239059d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239058c);
                            f239059d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

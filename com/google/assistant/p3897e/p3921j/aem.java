package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aem */
/* compiled from: PG */
public final class aem extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final aem f134938b;

    /* renamed from: d */
    private static volatile C63010eb f134939d;

    /* renamed from: a */
    public int f134940a;

    /* renamed from: c */
    private int f134941c;

    static {
        aem aem = new aem();
        f134938b = aem;
        C62942bv.registerDefaultInstance(aem.class, aem);
    }

    private aem() {
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
                return newMessageInfo(f134938b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", aej.f134937a});
            case 3:
                return new aem();
            case 4:
                return new ael();
            case 5:
                return f134938b;
            case 6:
                C63010eb ebVar = f134939d;
                if (ebVar == null) {
                    synchronized (aem.class) {
                        ebVar = f134939d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134938b);
                            f134939d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

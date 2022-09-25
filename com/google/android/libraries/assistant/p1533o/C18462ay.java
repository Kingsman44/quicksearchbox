package com.google.android.libraries.assistant.p1533o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.ay */
/* compiled from: PG */
public final class C18462ay extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C18462ay f52389b;

    /* renamed from: c */
    private static volatile C63010eb f52390c;

    /* renamed from: a */
    public boolean f52391a;

    static {
        C18462ay ayVar = new C18462ay();
        f52389b = ayVar;
        C62942bv.registerDefaultInstance(C18462ay.class, ayVar);
    }

    private C18462ay() {
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
                return newMessageInfo(f52389b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C18462ay();
            case 4:
                return new C18461ax();
            case 5:
                return f52389b;
            case 6:
                C63010eb ebVar = f52390c;
                if (ebVar == null) {
                    synchronized (C18462ay.class) {
                        ebVar = f52390c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52389b);
                            f52390c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.ao */
/* compiled from: PG */
public final class C142309ao extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142309ao f386072c;

    /* renamed from: d */
    private static volatile C63010eb f386073d;

    /* renamed from: a */
    public int f386074a;

    /* renamed from: b */
    public int f386075b;

    static {
        C142309ao aoVar = new C142309ao();
        f386072c = aoVar;
        C62942bv.registerDefaultInstance(C142309ao.class, aoVar);
    }

    private C142309ao() {
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
                return newMessageInfo(f386072c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C142307am.f386071a});
            case 3:
                return new C142309ao();
            case 4:
                return new C142306al();
            case 5:
                return f386072c;
            case 6:
                C63010eb ebVar = f386073d;
                if (ebVar == null) {
                    synchronized (C142309ao.class) {
                        ebVar = f386073d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386072c);
                            f386073d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

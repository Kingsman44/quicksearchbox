package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.di */
/* compiled from: PG */
public final class C60198di extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60198di f162862c;

    /* renamed from: d */
    private static volatile C63010eb f162863d;

    /* renamed from: a */
    public int f162864a;

    /* renamed from: b */
    public int f162865b;

    static {
        C60198di diVar = new C60198di();
        f162862c = diVar;
        C62942bv.registerDefaultInstance(C60198di.class, diVar);
    }

    private C60198di() {
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
                return newMessageInfo(f162862c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C60196dg.f162861a});
            case 3:
                return new C60198di();
            case 4:
                return new C60195df();
            case 5:
                return f162862c;
            case 6:
                C63010eb ebVar = f162863d;
                if (ebVar == null) {
                    synchronized (C60198di.class) {
                        ebVar = f162863d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162862c);
                            f162863d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

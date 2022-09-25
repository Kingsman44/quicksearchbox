package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.m */
/* compiled from: PG */
public final class C52054m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52054m f136620c;

    /* renamed from: d */
    private static volatile C63010eb f136621d;

    /* renamed from: a */
    public int f136622a;

    /* renamed from: b */
    public int f136623b;

    static {
        C52054m mVar = new C52054m();
        f136620c = mVar;
        C62942bv.registerDefaultInstance(C52054m.class, mVar);
    }

    private C52054m() {
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
                return newMessageInfo(f136620c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C52053l.f136619a});
            case 3:
                return new C52054m();
            case 4:
                return new C52052k();
            case 5:
                return f136620c;
            case 6:
                C63010eb ebVar = f136621d;
                if (ebVar == null) {
                    synchronized (C52054m.class) {
                        ebVar = f136621d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136620c);
                            f136621d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

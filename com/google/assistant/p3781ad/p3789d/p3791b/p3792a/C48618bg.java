package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.bg */
/* compiled from: PG */
public final class C48618bg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48618bg f125637b;

    /* renamed from: c */
    private static volatile C63010eb f125638c;

    /* renamed from: a */
    public C62995dn f125639a = C62995dn.f170057a;

    static {
        C48618bg bgVar = new C48618bg();
        f125637b = bgVar;
        C62942bv.registerDefaultInstance(C48618bg.class, bgVar);
    }

    private C48618bg() {
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
                return newMessageInfo(f125637b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C48617bf.f125636a});
            case 3:
                return new C48618bg();
            case 4:
                return new C48616be();
            case 5:
                return f125637b;
            case 6:
                C63010eb ebVar = f125638c;
                if (ebVar == null) {
                    synchronized (C48618bg.class) {
                        ebVar = f125638c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125637b);
                            f125638c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

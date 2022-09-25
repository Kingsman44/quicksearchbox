package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.ae */
/* compiled from: PG */
public final class C52672ae extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52672ae f138271a;

    /* renamed from: c */
    private static volatile C63010eb f138272c;

    /* renamed from: b */
    private C62995dn f138273b = C62995dn.f170057a;

    static {
        C52672ae aeVar = new C52672ae();
        f138271a = aeVar;
        C62942bv.registerDefaultInstance(C52672ae.class, aeVar);
    }

    private C52672ae() {
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
                return newMessageInfo(f138271a, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0001\u0000\u0000\u00042", new Object[]{"b", C52671ad.f138270a});
            case 3:
                return new C52672ae();
            case 4:
                return new C52670ac();
            case 5:
                return f138271a;
            case 6:
                C63010eb ebVar = f138272c;
                if (ebVar == null) {
                    synchronized (C52672ae.class) {
                        ebVar = f138272c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138271a);
                            f138272c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

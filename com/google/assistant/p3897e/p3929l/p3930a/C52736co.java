package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.co */
/* compiled from: PG */
public final class C52736co extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52736co f138403a;

    /* renamed from: c */
    private static volatile C63010eb f138404c;

    /* renamed from: b */
    private C62995dn f138405b = C62995dn.f170057a;

    static {
        C52736co coVar = new C52736co();
        f138403a = coVar;
        C62942bv.registerDefaultInstance(C52736co.class, coVar);
    }

    private C52736co() {
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
                return newMessageInfo(f138403a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C52735cn.f138402a});
            case 3:
                return new C52736co();
            case 4:
                return new C52734cm();
            case 5:
                return f138403a;
            case 6:
                C63010eb ebVar = f138404c;
                if (ebVar == null) {
                    synchronized (C52736co.class) {
                        ebVar = f138404c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138403a);
                            f138404c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

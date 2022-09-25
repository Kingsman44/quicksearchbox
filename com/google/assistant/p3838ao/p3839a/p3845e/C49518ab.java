package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.ab */
/* compiled from: PG */
public final class C49518ab extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49518ab f127753a;

    /* renamed from: c */
    private static volatile C63010eb f127754c;

    /* renamed from: b */
    private C62995dn f127755b = C62995dn.f170057a;

    static {
        C49518ab abVar = new C49518ab();
        f127753a = abVar;
        C62942bv.registerDefaultInstance(C49518ab.class, abVar);
    }

    private C49518ab() {
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
                return newMessageInfo(f127753a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", C49517aa.f127752a});
            case 3:
                return new C49518ab();
            case 4:
                return new C49635z();
            case 5:
                return f127753a;
            case 6:
                C63010eb ebVar = f127754c;
                if (ebVar == null) {
                    synchronized (C49518ab.class) {
                        ebVar = f127754c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127753a);
                            f127754c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

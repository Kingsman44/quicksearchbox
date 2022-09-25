package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.fp */
/* compiled from: PG */
public final class C51963fp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51963fp f136365c;

    /* renamed from: d */
    private static volatile C63010eb f136366d;

    /* renamed from: a */
    public int f136367a;

    /* renamed from: b */
    public int f136368b;

    static {
        C51963fp fpVar = new C51963fp();
        f136365c = fpVar;
        C62942bv.registerDefaultInstance(C51963fp.class, fpVar);
    }

    private C51963fp() {
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
                return newMessageInfo(f136365c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C51962fo.m86456b()});
            case 3:
                return new C51963fp();
            case 4:
                return new C51960fm();
            case 5:
                return f136365c;
            case 6:
                C63010eb ebVar = f136366d;
                if (ebVar == null) {
                    synchronized (C51963fp.class) {
                        ebVar = f136366d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136365c);
                            f136366d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

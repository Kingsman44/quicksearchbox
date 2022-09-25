package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.tg */
/* compiled from: PG */
public final class C52479tg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52479tg f137757d;

    /* renamed from: e */
    private static volatile C63010eb f137758e;

    /* renamed from: a */
    public int f137759a;

    /* renamed from: b */
    public adm f137760b;

    /* renamed from: c */
    public C52494tv f137761c;

    static {
        C52479tg tgVar = new C52479tg();
        f137757d = tgVar;
        C62942bv.registerDefaultInstance(C52479tg.class, tgVar);
    }

    private C52479tg() {
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
                return newMessageInfo(f137757d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52479tg();
            case 4:
                return new C52478tf();
            case 5:
                return f137757d;
            case 6:
                C63010eb ebVar = f137758e;
                if (ebVar == null) {
                    synchronized (C52479tg.class) {
                        ebVar = f137758e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137757d);
                            f137758e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

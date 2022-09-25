package com.google.assistant.p3745ab;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.bd */
/* compiled from: PG */
public final class C48247bd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48247bd f124805e;

    /* renamed from: f */
    private static volatile C63010eb f124806f;

    /* renamed from: a */
    public int f124807a;

    /* renamed from: b */
    public int f124808b;

    /* renamed from: c */
    public boolean f124809c;

    /* renamed from: d */
    public int f124810d;

    static {
        C48247bd bdVar = new C48247bd();
        f124805e = bdVar;
        C62942bv.registerDefaultInstance(C48247bd.class, bdVar);
    }

    private C48247bd() {
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
                return newMessageInfo(f124805e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0004င\u0003", new Object[]{"a", "b", C48246bc.f124804a, C45240c.f118157a, "d"});
            case 3:
                return new C48247bd();
            case 4:
                return new C48245bb();
            case 5:
                return f124805e;
            case 6:
                C63010eb ebVar = f124806f;
                if (ebVar == null) {
                    synchronized (C48247bd.class) {
                        ebVar = f124806f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124805e);
                            f124806f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

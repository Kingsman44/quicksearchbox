package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.je */
/* compiled from: PG */
public final class C52207je extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52207je f137009d;

    /* renamed from: e */
    private static volatile C63010eb f137010e;

    /* renamed from: a */
    public int f137011a;

    /* renamed from: b */
    public C52159hk f137012b;

    /* renamed from: c */
    public int f137013c;

    static {
        C52207je jeVar = new C52207je();
        f137009d = jeVar;
        C62942bv.registerDefaultInstance(C52207je.class, jeVar);
    }

    private C52207je() {
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
                return newMessageInfo(f137009d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C52205jc.f137008a});
            case 3:
                return new C52207je();
            case 4:
                return new C52204jb();
            case 5:
                return f137009d;
            case 6:
                C63010eb ebVar = f137010e;
                if (ebVar == null) {
                    synchronized (C52207je.class) {
                        ebVar = f137010e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137009d);
                            f137010e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

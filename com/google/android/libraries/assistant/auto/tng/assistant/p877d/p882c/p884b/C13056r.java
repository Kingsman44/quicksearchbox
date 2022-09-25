package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.r */
/* compiled from: PG */
public final class C13056r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C13056r f40527d;

    /* renamed from: e */
    private static volatile C63010eb f40528e;

    /* renamed from: a */
    public int f40529a;

    /* renamed from: b */
    public boolean f40530b;

    /* renamed from: c */
    public boolean f40531c;

    static {
        C13056r rVar = new C13056r();
        f40527d = rVar;
        C62942bv.registerDefaultInstance(C13056r.class, rVar);
    }

    private C13056r() {
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
                return newMessageInfo(f40527d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C13056r();
            case 4:
                return new C13055q();
            case 5:
                return f40527d;
            case 6:
                C63010eb ebVar = f40528e;
                if (ebVar == null) {
                    synchronized (C13056r.class) {
                        ebVar = f40528e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40527d);
                            f40528e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

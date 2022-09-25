package com.google.android.libraries.assistant.p1535p.p1536a.p1538b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.p.a.b.d */
/* compiled from: PG */
public final class C18516d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C18516d f52474d;

    /* renamed from: e */
    private static volatile C63010eb f52475e;

    /* renamed from: a */
    public int f52476a;

    /* renamed from: b */
    public C18519g f52477b;

    /* renamed from: c */
    public int f52478c;

    static {
        C18516d dVar = new C18516d();
        f52474d = dVar;
        C62942bv.registerDefaultInstance(C18516d.class, dVar);
    }

    private C18516d() {
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
                return newMessageInfo(f52474d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C18514b.m35981b()});
            case 3:
                return new C18516d();
            case 4:
                return new C18515c();
            case 5:
                return f52474d;
            case 6:
                C63010eb ebVar = f52475e;
                if (ebVar == null) {
                    synchronized (C18516d.class) {
                        ebVar = f52475e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52474d);
                            f52475e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

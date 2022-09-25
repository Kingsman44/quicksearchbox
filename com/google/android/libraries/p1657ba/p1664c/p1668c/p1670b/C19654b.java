package com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b;

import com.google.android.libraries.p1657ba.p1664c.p1668c.C19668f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4752a.C63090b;

/* renamed from: com.google.android.libraries.ba.c.c.b.b */
/* compiled from: PG */
public final class C19654b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19654b f54669d;

    /* renamed from: e */
    private static volatile C63010eb f54670e;

    /* renamed from: a */
    public int f54671a;

    /* renamed from: b */
    public C19668f f54672b;

    /* renamed from: c */
    public C63090b f54673c;

    static {
        C19654b bVar = new C19654b();
        f54669d = bVar;
        C62942bv.registerDefaultInstance(C19654b.class, bVar);
    }

    private C19654b() {
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
                return newMessageInfo(f54669d, "\u0001\u0002\u0000\u0001\b\t\u0002\u0000\u0000\u0000\bဉ\b\tဉ\u0003", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C19654b();
            case 4:
                return new C19653a();
            case 5:
                return f54669d;
            case 6:
                C63010eb ebVar = f54670e;
                if (ebVar == null) {
                    synchronized (C19654b.class) {
                        ebVar = f54670e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54669d);
                            f54670e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

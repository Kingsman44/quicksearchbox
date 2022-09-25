package com.google.android.libraries.p1657ba.p1664c.p1666b.p1667a;

import com.google.android.libraries.p1657ba.p1664c.p1668c.C19668f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ba.c.b.a.b */
/* compiled from: PG */
public final class C19648b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19648b f54652d;

    /* renamed from: e */
    private static volatile C63010eb f54653e;

    /* renamed from: a */
    public int f54654a;

    /* renamed from: b */
    public C19668f f54655b;

    /* renamed from: c */
    public int f54656c = -1;

    static {
        C19648b bVar = new C19648b();
        f54652d = bVar;
        C62942bv.registerDefaultInstance(C19648b.class, bVar);
    }

    private C19648b() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f54652d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0003င\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C19648b();
            case 4:
                return new C19647a();
            case 5:
                return f54652d;
            case 6:
                C63010eb ebVar = f54653e;
                if (ebVar == null) {
                    synchronized (C19648b.class) {
                        ebVar = f54653e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54652d);
                            f54653e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.assistant.p3897e.p3921j.p3925d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.d.b */
/* compiled from: PG */
public final class C51776b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51776b f135842e;

    /* renamed from: f */
    private static volatile C63010eb f135843f;

    /* renamed from: a */
    public int f135844a;

    /* renamed from: b */
    public C51780f f135845b;

    /* renamed from: c */
    public C51780f f135846c;

    /* renamed from: d */
    public C51784j f135847d;

    static {
        C51776b bVar = new C51776b();
        f135842e = bVar;
        C62942bv.registerDefaultInstance(C51776b.class, bVar);
    }

    private C51776b() {
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
                return newMessageInfo(f135842e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51776b();
            case 4:
                return new C51775a();
            case 5:
                return f135842e;
            case 6:
                C63010eb ebVar = f135843f;
                if (ebVar == null) {
                    synchronized (C51776b.class) {
                        ebVar = f135843f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135842e);
                            f135843f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

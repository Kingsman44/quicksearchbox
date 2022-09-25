package com.google.p4283bv.p4287b.p4288a.p4322b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.b.h */
/* compiled from: PG */
public final class C56852h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56852h f151675d;

    /* renamed from: e */
    private static volatile C63010eb f151676e;

    /* renamed from: a */
    public int f151677a;

    /* renamed from: b */
    public C62961ch f151678b = emptyIntList();

    /* renamed from: c */
    public int f151679c;

    static {
        C56852h hVar = new C56852h();
        f151675d = hVar;
        C62942bv.registerDefaultInstance(C56852h.class, hVar);
    }

    private C56852h() {
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
                return newMessageInfo(f151675d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u0016\u0003င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56852h();
            case 4:
                return new C56851g();
            case 5:
                return f151675d;
            case 6:
                C63010eb ebVar = f151676e;
                if (ebVar == null) {
                    synchronized (C56852h.class) {
                        ebVar = f151676e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151675d);
                            f151676e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.apps.gsa.nga.engine.p6026f.p6028b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.b.h */
/* compiled from: PG */
public final class C76013h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C76013h f210845d;

    /* renamed from: e */
    private static volatile C63010eb f210846e;

    /* renamed from: a */
    public C76023r f210847a;

    /* renamed from: b */
    public C76011f f210848b;

    /* renamed from: c */
    public C62971cq f210849c = emptyProtobufList();

    static {
        C76013h hVar = new C76013h();
        f210845d = hVar;
        C62942bv.registerDefaultInstance(C76013h.class, hVar);
    }

    private C76013h() {
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
                return newMessageInfo(f210845d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003\t", new Object[]{"b", C45240c.f118157a, C76008c.class, "a"});
            case 3:
                return new C76013h();
            case 4:
                return new C76012g();
            case 5:
                return f210845d;
            case 6:
                C63010eb ebVar = f210846e;
                if (ebVar == null) {
                    synchronized (C76013h.class) {
                        ebVar = f210846e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f210845d);
                            f210846e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

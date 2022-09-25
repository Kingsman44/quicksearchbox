package com.google.assistant.p3824am;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3988o.C53033c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.am.d */
/* compiled from: PG */
public final class C49245d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49245d f127309a;

    /* renamed from: d */
    private static volatile C63010eb f127310d;

    /* renamed from: b */
    private int f127311b;

    /* renamed from: c */
    private C53033c f127312c;

    static {
        C49245d dVar = new C49245d();
        f127309a = dVar;
        C62942bv.registerDefaultInstance(C49245d.class, dVar);
    }

    private C49245d() {
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
                return newMessageInfo(f127309a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C49245d();
            case 4:
                return new C49244c();
            case 5:
                return f127309a;
            case 6:
                C63010eb ebVar = f127310d;
                if (ebVar == null) {
                    synchronized (C49245d.class) {
                        ebVar = f127310d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127309a);
                            f127310d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

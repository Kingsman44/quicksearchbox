package com.google.assistant.p3897e.p3902c.p3905b.p3906a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.b.a.d */
/* compiled from: PG */
public final class C50927d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50927d f132578b;

    /* renamed from: d */
    private static volatile C63010eb f132579d;

    /* renamed from: a */
    public int f132580a = 1;

    /* renamed from: c */
    private int f132581c;

    static {
        C50927d dVar = new C50927d();
        f132578b = dVar;
        C62942bv.registerDefaultInstance(C50927d.class, dVar);
    }

    private C50927d() {
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
                return newMessageInfo(f132578b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C50925b.f132577a});
            case 3:
                return new C50927d();
            case 4:
                return new C50924a();
            case 5:
                return f132578b;
            case 6:
                C63010eb ebVar = f132579d;
                if (ebVar == null) {
                    synchronized (C50927d.class) {
                        ebVar = f132579d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132578b);
                            f132579d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

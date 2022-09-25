package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.d */
/* compiled from: PG */
public final class C19176d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C19176d f53709f;

    /* renamed from: g */
    private static volatile C63010eb f53710g;

    /* renamed from: a */
    public int f53711a;

    /* renamed from: b */
    public boolean f53712b;

    /* renamed from: c */
    public boolean f53713c;

    /* renamed from: d */
    public boolean f53714d;

    /* renamed from: e */
    public int f53715e;

    static {
        C19176d dVar = new C19176d();
        f53709f = dVar;
        C62942bv.registerDefaultInstance(C19176d.class, dVar);
    }

    private C19176d() {
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
                return newMessageInfo(f53709f, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C19192t.f53743a});
            case 3:
                return new C19176d();
            case 4:
                return new C19175c();
            case 5:
                return f53709f;
            case 6:
                C63010eb ebVar = f53710g;
                if (ebVar == null) {
                    synchronized (C19176d.class) {
                        ebVar = f53710g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53709f);
                            f53710g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

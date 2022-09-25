package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.vi */
/* compiled from: PG */
public final class C50391vi extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50391vi f131162d;

    /* renamed from: e */
    private static volatile C63010eb f131163e;

    /* renamed from: a */
    public int f131164a;

    /* renamed from: b */
    public int f131165b;

    /* renamed from: c */
    public C50395vm f131166c;

    static {
        C50391vi viVar = new C50391vi();
        f131162d = viVar;
        C62942bv.registerDefaultInstance(C50391vi.class, viVar);
    }

    private C50391vi() {
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
                return newMessageInfo(f131162d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C50386vd.f131153a, C45240c.f118157a});
            case 3:
                return new C50391vi();
            case 4:
                return new C50390vh();
            case 5:
                return f131162d;
            case 6:
                C63010eb ebVar = f131163e;
                if (ebVar == null) {
                    synchronized (C50391vi.class) {
                        ebVar = f131163e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131162d);
                            f131163e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

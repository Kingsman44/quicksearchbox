package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ep */
/* compiled from: PG */
public final class C52083ep extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52083ep f136689f;

    /* renamed from: g */
    private static volatile C63010eb f136690g;

    /* renamed from: a */
    public int f136691a;

    /* renamed from: b */
    public int f136692b = 0;

    /* renamed from: c */
    public Object f136693c;

    /* renamed from: d */
    public int f136694d;

    /* renamed from: e */
    public int f136695e;

    static {
        C52083ep epVar = new C52083ep();
        f136689f = epVar;
        C62942bv.registerDefaultInstance(C52083ep.class, epVar);
    }

    private C52083ep() {
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
                return newMessageInfo(f136689f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ြ\u0000\u0004ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C52078ek.class, C52076ei.class});
            case 3:
                return new C52083ep();
            case 4:
                return new C52082eo();
            case 5:
                return f136689f;
            case 6:
                C63010eb ebVar = f136690g;
                if (ebVar == null) {
                    synchronized (C52083ep.class) {
                        ebVar = f136690g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136689f);
                            f136690g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

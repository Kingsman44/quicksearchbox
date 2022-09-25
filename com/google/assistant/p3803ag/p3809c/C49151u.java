package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4184bj.p4189b.C55893j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.u */
/* compiled from: PG */
public final class C49151u extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49151u f127105d;

    /* renamed from: e */
    private static volatile C63010eb f127106e;

    /* renamed from: a */
    public int f127107a;

    /* renamed from: b */
    public C55893j f127108b;

    /* renamed from: c */
    public C49150t f127109c;

    static {
        C49151u uVar = new C49151u();
        f127105d = uVar;
        C62942bv.registerDefaultInstance(C49151u.class, uVar);
    }

    private C49151u() {
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
                return newMessageInfo(f127105d, "\u0001\u0002\u0000\u0001\u0001\u0018\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0018ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49151u();
            case 4:
                return new C49148r();
            case 5:
                return f127105d;
            case 6:
                C63010eb ebVar = f127106e;
                if (ebVar == null) {
                    synchronized (C49151u.class) {
                        ebVar = f127106e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127105d);
                            f127106e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

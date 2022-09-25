package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ba */
/* compiled from: PG */
public final class C51703ba extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51703ba f135634d;

    /* renamed from: e */
    private static volatile C63010eb f135635e;

    /* renamed from: a */
    public int f135636a;

    /* renamed from: b */
    public int f135637b = 1;

    /* renamed from: c */
    public int f135638c = 1;

    static {
        C51703ba baVar = new C51703ba();
        f135634d = baVar;
        C62942bv.registerDefaultInstance(C51703ba.class, baVar);
    }

    private C51703ba() {
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
                return newMessageInfo(f135634d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C51707be.m86367b(), C45240c.f118157a, C51697ay.m86364b()});
            case 3:
                return new C51703ba();
            case 4:
                return new C51698az();
            case 5:
                return f135634d;
            case 6:
                C63010eb ebVar = f135635e;
                if (ebVar == null) {
                    synchronized (C51703ba.class) {
                        ebVar = f135635e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135634d);
                            f135635e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

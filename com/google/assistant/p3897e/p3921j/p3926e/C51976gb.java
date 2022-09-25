package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.gb */
/* compiled from: PG */
public final class C51976gb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51976gb f136395b;

    /* renamed from: d */
    private static volatile C63010eb f136396d;

    /* renamed from: a */
    public C51975ga f136397a;

    /* renamed from: c */
    private int f136398c;

    static {
        C51976gb gbVar = new C51976gb();
        f136395b = gbVar;
        C62942bv.registerDefaultInstance(C51976gb.class, gbVar);
    }

    private C51976gb() {
    }

    /* renamed from: a */
    public final C51975ga mo53771a() {
        C51975ga gaVar = this.f136397a;
        return gaVar == null ? C51975ga.f136390c : gaVar;
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
                return newMessageInfo(f136395b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51976gb();
            case 4:
                return new C51972fy();
            case 5:
                return f136395b;
            case 6:
                C63010eb ebVar = f136396d;
                if (ebVar == null) {
                    synchronized (C51976gb.class) {
                        ebVar = f136396d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136395b);
                            f136396d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

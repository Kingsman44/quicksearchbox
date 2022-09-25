package com.google.assistant.p3886c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.ag */
/* compiled from: PG */
public final class C50695ag extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50695ag f131897e;

    /* renamed from: f */
    private static volatile C63010eb f131898f;

    /* renamed from: a */
    public int f131899a;

    /* renamed from: b */
    public long f131900b;

    /* renamed from: c */
    public int f131901c;

    /* renamed from: d */
    public boolean f131902d;

    static {
        C50695ag agVar = new C50695ag();
        f131897e = agVar;
        C62942bv.registerDefaultInstance(C50695ag.class, agVar);
    }

    private C50695ag() {
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
                return newMessageInfo(f131897e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50695ag();
            case 4:
                return new C50694af();
            case 5:
                return f131897e;
            case 6:
                C63010eb ebVar = f131898f;
                if (ebVar == null) {
                    synchronized (C50695ag.class) {
                        ebVar = f131898f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131897e);
                            f131898f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

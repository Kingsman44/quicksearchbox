package com.google.assistant.p3886c.p3889c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.c.e */
/* compiled from: PG */
public final class C50767e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50767e f132109d;

    /* renamed from: e */
    private static volatile C63010eb f132110e;

    /* renamed from: a */
    public int f132111a;

    /* renamed from: b */
    public int f132112b;

    /* renamed from: c */
    public int f132113c;

    static {
        C50767e eVar = new C50767e();
        f132109d = eVar;
        C62942bv.registerDefaultInstance(C50767e.class, eVar);
    }

    private C50767e() {
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
                return newMessageInfo(f132109d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50767e();
            case 4:
                return new C50766d();
            case 5:
                return f132109d;
            case 6:
                C63010eb ebVar = f132110e;
                if (ebVar == null) {
                    synchronized (C50767e.class) {
                        ebVar = f132110e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132109d);
                            f132110e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

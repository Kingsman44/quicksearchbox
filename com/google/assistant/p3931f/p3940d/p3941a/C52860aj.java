package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.aj */
/* compiled from: PG */
public final class C52860aj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52860aj f138686e;

    /* renamed from: f */
    private static volatile C63010eb f138687f;

    /* renamed from: a */
    public int f138688a = 0;

    /* renamed from: b */
    public Object f138689b;

    /* renamed from: c */
    public int f138690c = 0;

    /* renamed from: d */
    public Object f138691d;

    static {
        C52860aj ajVar = new C52860aj();
        f138686e = ajVar;
        C62942bv.registerDefaultInstance(C52860aj.class, ajVar);
    }

    private C52860aj() {
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
                return newMessageInfo(f138686e, "\u0000\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u00014\u0000\u00024\u0001\u0003:\u0000\u0004:\u0001", new Object[]{"b", "a", "d", C45240c.f118157a});
            case 3:
                return new C52860aj();
            case 4:
                return new C52859ai();
            case 5:
                return f138686e;
            case 6:
                C63010eb ebVar = f138687f;
                if (ebVar == null) {
                    synchronized (C52860aj.class) {
                        ebVar = f138687f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138686e);
                            f138687f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.aw */
/* compiled from: PG */
public final class C52873aw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52873aw f138715b;

    /* renamed from: c */
    private static volatile C63010eb f138716c;

    /* renamed from: a */
    public int f138717a;

    static {
        C52873aw awVar = new C52873aw();
        f138715b = awVar;
        C62942bv.registerDefaultInstance(C52873aw.class, awVar);
    }

    private C52873aw() {
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
                return newMessageInfo(f138715b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f", new Object[]{"a"});
            case 3:
                return new C52873aw();
            case 4:
                return new C52871au();
            case 5:
                return f138715b;
            case 6:
                C63010eb ebVar = f138716c;
                if (ebVar == null) {
                    synchronized (C52873aw.class) {
                        ebVar = f138716c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138715b);
                            f138716c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

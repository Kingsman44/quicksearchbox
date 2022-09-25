package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.at */
/* compiled from: PG */
public final class C52870at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52870at f138711c;

    /* renamed from: d */
    private static volatile C63010eb f138712d;

    /* renamed from: a */
    public int f138713a;

    /* renamed from: b */
    public C52866ap f138714b;

    static {
        C52870at atVar = new C52870at();
        f138711c = atVar;
        C62942bv.registerDefaultInstance(C52870at.class, atVar);
    }

    private C52870at() {
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
                return newMessageInfo(f138711c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C52870at();
            case 4:
                return new C52869as();
            case 5:
                return f138711c;
            case 6:
                C63010eb ebVar = f138712d;
                if (ebVar == null) {
                    synchronized (C52870at.class) {
                        ebVar = f138712d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138711c);
                            f138712d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

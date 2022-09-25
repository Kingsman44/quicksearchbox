package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.lu */
/* compiled from: PG */
public final class C51548lu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51548lu f134358c;

    /* renamed from: d */
    private static volatile C63010eb f134359d;

    /* renamed from: a */
    public int f134360a;

    /* renamed from: b */
    public boolean f134361b;

    static {
        C51548lu luVar = new C51548lu();
        f134358c = luVar;
        C62942bv.registerDefaultInstance(C51548lu.class, luVar);
    }

    private C51548lu() {
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
                return newMessageInfo(f134358c, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\tဇ\b", new Object[]{"a", "b"});
            case 3:
                return new C51548lu();
            case 4:
                return new C51547lt();
            case 5:
                return f134358c;
            case 6:
                C63010eb ebVar = f134359d;
                if (ebVar == null) {
                    synchronized (C51548lu.class) {
                        ebVar = f134359d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134358c);
                            f134359d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

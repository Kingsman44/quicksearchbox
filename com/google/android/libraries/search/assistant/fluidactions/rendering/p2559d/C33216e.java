package com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.d.e */
/* compiled from: PG */
public final class C33216e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33216e f88826c;

    /* renamed from: d */
    private static volatile C63010eb f88827d;

    /* renamed from: a */
    public int f88828a;

    /* renamed from: b */
    public int f88829b;

    static {
        C33216e eVar = new C33216e();
        f88826c = eVar;
        C62942bv.registerDefaultInstance(C33216e.class, eVar);
    }

    private C33216e() {
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
                return newMessageInfo(f88826c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C33216e();
            case 4:
                return new C33215d();
            case 5:
                return f88826c;
            case 6:
                C63010eb ebVar = f88827d;
                if (ebVar == null) {
                    synchronized (C33216e.class) {
                        ebVar = f88827d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88826c);
                            f88827d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

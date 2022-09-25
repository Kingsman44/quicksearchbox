package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.gp */
/* compiled from: PG */
public final class C142472gp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142472gp f386640c;

    /* renamed from: d */
    private static volatile C63010eb f386641d;

    /* renamed from: a */
    public int f386642a = 0;

    /* renamed from: b */
    public Object f386643b;

    static {
        C142472gp gpVar = new C142472gp();
        f386640c = gpVar;
        C62942bv.registerDefaultInstance(C142472gp.class, gpVar);
    }

    private C142472gp() {
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
                return newMessageInfo(f386640c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C142489hf.class, C142502hs.class});
            case 3:
                return new C142472gp();
            case 4:
                return new C142471go();
            case 5:
                return f386640c;
            case 6:
                C63010eb ebVar = f386641d;
                if (ebVar == null) {
                    synchronized (C142472gp.class) {
                        ebVar = f386641d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386640c);
                            f386641d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

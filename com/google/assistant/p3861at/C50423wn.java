package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.wn */
/* compiled from: PG */
public final class C50423wn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50423wn f131238c;

    /* renamed from: d */
    private static volatile C63010eb f131239d;

    /* renamed from: a */
    public int f131240a;

    /* renamed from: b */
    public C63088z f131241b = C63088z.f170246b;

    static {
        C50423wn wnVar = new C50423wn();
        f131238c = wnVar;
        C62942bv.registerDefaultInstance(C50423wn.class, wnVar);
    }

    private C50423wn() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f131238c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ည\u0003", new Object[]{"a", "b"});
            case 3:
                return new C50423wn();
            case 4:
                return new C50422wm();
            case 5:
                return f131238c;
            case 6:
                C63010eb ebVar = f131239d;
                if (ebVar == null) {
                    synchronized (C50423wn.class) {
                        ebVar = f131239d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131238c);
                            f131239d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

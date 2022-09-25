package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.vt */
/* compiled from: PG */
public final class C50402vt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50402vt f131188c;

    /* renamed from: d */
    private static volatile C63010eb f131189d;

    /* renamed from: a */
    public int f131190a;

    /* renamed from: b */
    public C50397vo f131191b;

    static {
        C50402vt vtVar = new C50402vt();
        f131188c = vtVar;
        C62942bv.registerDefaultInstance(C50402vt.class, vtVar);
    }

    private C50402vt() {
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
                return newMessageInfo(f131188c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50402vt();
            case 4:
                return new C50401vs();
            case 5:
                return f131188c;
            case 6:
                C63010eb ebVar = f131189d;
                if (ebVar == null) {
                    synchronized (C50402vt.class) {
                        ebVar = f131189d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131188c);
                            f131189d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

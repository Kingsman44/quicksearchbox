package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.g.k.aw */
/* compiled from: PG */
public final class C17487aw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17487aw f50491c;

    /* renamed from: d */
    private static volatile C63010eb f50492d;

    /* renamed from: a */
    public int f50493a = 0;

    /* renamed from: b */
    public Object f50494b;

    static {
        C17487aw awVar = new C17487aw();
        f50491c = awVar;
        C62942bv.registerDefaultInstance(C17487aw.class, awVar);
    }

    private C17487aw() {
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
                return newMessageInfo(f50491c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", C17488ax.f50495a, C17480ap.f50474a});
            case 3:
                return new C17487aw();
            case 4:
                return new C17486av();
            case 5:
                return f50491c;
            case 6:
                C63010eb ebVar = f50492d;
                if (ebVar == null) {
                    synchronized (C17487aw.class) {
                        ebVar = f50492d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50491c);
                            f50492d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

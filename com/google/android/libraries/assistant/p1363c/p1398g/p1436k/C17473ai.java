package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.g.k.ai */
/* compiled from: PG */
public final class C17473ai extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C17473ai f50457e;

    /* renamed from: f */
    private static volatile C63010eb f50458f;

    /* renamed from: a */
    public int f50459a;

    /* renamed from: b */
    public int f50460b = 0;

    /* renamed from: c */
    public Object f50461c;

    /* renamed from: d */
    public long f50462d;

    static {
        C17473ai aiVar = new C17473ai();
        f50457e = aiVar;
        C62942bv.registerDefaultInstance(C17473ai.class, aiVar);
    }

    private C17473ai() {
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
                return newMessageInfo(f50457e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000\u0003ဂ\u0002", new Object[]{C45240c.f118157a, "b", "a", C17474aj.f50463a, C17471ag.m34783b(), "d"});
            case 3:
                return new C17473ai();
            case 4:
                return new C17472ah();
            case 5:
                return f50457e;
            case 6:
                C63010eb ebVar = f50458f;
                if (ebVar == null) {
                    synchronized (C17473ai.class) {
                        ebVar = f50458f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50457e);
                            f50458f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

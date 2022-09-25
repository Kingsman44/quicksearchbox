package com.google.assistant.p4016z;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.aw */
/* compiled from: PG */
public final class C53698aw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53698aw f140958e;

    /* renamed from: f */
    private static volatile C63010eb f140959f;

    /* renamed from: a */
    public int f140960a;

    /* renamed from: b */
    public float f140961b;

    /* renamed from: c */
    public C53694as f140962c;

    /* renamed from: d */
    public int f140963d;

    static {
        C53698aw awVar = new C53698aw();
        f140958e = awVar;
        C62942bv.registerDefaultInstance(C53698aw.class, awVar);
    }

    private C53698aw() {
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
                return newMessageInfo(f140958e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C53696au.f140957a});
            case 3:
                return new C53698aw();
            case 4:
                return new C53695at();
            case 5:
                return f140958e;
            case 6:
                C63010eb ebVar = f140959f;
                if (ebVar == null) {
                    synchronized (C53698aw.class) {
                        ebVar = f140959f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140958e);
                            f140959f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

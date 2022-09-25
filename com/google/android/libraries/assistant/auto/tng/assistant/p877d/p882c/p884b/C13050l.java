package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.l */
/* compiled from: PG */
public final class C13050l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C13050l f40509d;

    /* renamed from: f */
    private static volatile C63010eb f40510f;

    /* renamed from: a */
    public int f40511a;

    /* renamed from: b */
    public C13048j f40512b;

    /* renamed from: c */
    public int f40513c;

    /* renamed from: e */
    private byte f40514e = 2;

    static {
        C13050l lVar = new C13050l();
        f40509d = lVar;
        C62942bv.registerDefaultInstance(C13050l.class, lVar);
    }

    private C13050l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f40514e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f40514e = b;
                return null;
            case 2:
                return newMessageInfo(f40509d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C13050l();
            case 4:
                return new C13049k();
            case 5:
                return f40509d;
            case 6:
                C63010eb ebVar = f40510f;
                if (ebVar == null) {
                    synchronized (C13050l.class) {
                        ebVar = f40510f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40509d);
                            f40510f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

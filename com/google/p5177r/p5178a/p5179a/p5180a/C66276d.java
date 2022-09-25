package com.google.p5177r.p5178a.p5179a.p5180a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.r.a.a.a.d */
/* compiled from: PG */
public final class C66276d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f180243b = new C66273a();

    /* renamed from: c */
    public static final C66276d f180244c;

    /* renamed from: d */
    private static volatile C63010eb f180245d;

    /* renamed from: a */
    public C62961ch f180246a = emptyIntList();

    static {
        C66276d dVar = new C66276d();
        f180244c = dVar;
        C62942bv.registerDefaultInstance(C66276d.class, dVar);
    }

    private C66276d() {
        emptyIntList();
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
                return newMessageInfo(f180244c, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
            case 3:
                return new C66276d();
            case 4:
                return new C66275c();
            case 5:
                return f180244c;
            case 6:
                C63010eb ebVar = f180245d;
                if (ebVar == null) {
                    synchronized (C66276d.class) {
                        ebVar = f180245d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180244c);
                            f180245d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.f */
/* compiled from: PG */
public final class C13044f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C13044f f40495e;

    /* renamed from: f */
    private static volatile C63010eb f40496f;

    /* renamed from: a */
    public int f40497a;

    /* renamed from: b */
    public String f40498b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f40499c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f40500d;

    static {
        C13044f fVar = new C13044f();
        f40495e = fVar;
        C62942bv.registerDefaultInstance(C13044f.class, fVar);
    }

    private C13044f() {
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
                return newMessageInfo(f40495e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C13044f();
            case 4:
                return new C13043e();
            case 5:
                return f40495e;
            case 6:
                C63010eb ebVar = f40496f;
                if (ebVar == null) {
                    synchronized (C13044f.class) {
                        ebVar = f40496f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40495e);
                            f40496f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

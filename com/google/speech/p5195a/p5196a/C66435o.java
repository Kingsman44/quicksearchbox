package com.google.speech.p5195a.p5196a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.a.a.o */
/* compiled from: PG */
public final class C66435o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66435o f180640d;

    /* renamed from: e */
    private static volatile C63010eb f180641e;

    /* renamed from: a */
    public int f180642a;

    /* renamed from: b */
    public String f180643b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C66434n f180644c;

    static {
        C66435o oVar = new C66435o();
        f180640d = oVar;
        C62942bv.registerDefaultInstance(C66435o.class, oVar);
    }

    private C66435o() {
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
                return newMessageInfo(f180640d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66435o();
            case 4:
                return new C66432l();
            case 5:
                return f180640d;
            case 6:
                C63010eb ebVar = f180641e;
                if (ebVar == null) {
                    synchronized (C66435o.class) {
                        ebVar = f180641e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180640d);
                            f180641e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

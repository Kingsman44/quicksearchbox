package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.fo */
/* compiled from: PG */
public final class C7669fo extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7669fo f26633e;

    /* renamed from: f */
    private static volatile C63010eb f26634f;

    /* renamed from: a */
    public int f26635a;

    /* renamed from: b */
    public String f26636b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f26637c;

    /* renamed from: d */
    public long f26638d;

    static {
        C7669fo foVar = new C7669fo();
        f26633e = foVar;
        C62942bv.registerDefaultInstance(C7669fo.class, foVar);
    }

    private C7669fo() {
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
                return newMessageInfo(f26633e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003စ\u0002", new Object[]{"a", "b", C45240c.f118157a, C7668fn.m22800b(), "d"});
            case 3:
                return new C7669fo();
            case 4:
                return new C7666fl();
            case 5:
                return f26633e;
            case 6:
                C63010eb ebVar = f26634f;
                if (ebVar == null) {
                    synchronized (C7669fo.class) {
                        ebVar = f26634f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26633e);
                            f26634f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

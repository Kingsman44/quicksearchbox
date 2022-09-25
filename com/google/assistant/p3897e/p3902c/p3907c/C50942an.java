package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.an */
/* compiled from: PG */
public final class C50942an extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50942an f132613b;

    /* renamed from: d */
    private static volatile C63010eb f132614d;

    /* renamed from: a */
    public String f132615a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f132616c;

    static {
        C50942an anVar = new C50942an();
        f132613b = anVar;
        C62942bv.registerDefaultInstance(C50942an.class, anVar);
    }

    private C50942an() {
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
                return newMessageInfo(f132613b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50942an();
            case 4:
                return new C50941am();
            case 5:
                return f132613b;
            case 6:
                C63010eb ebVar = f132614d;
                if (ebVar == null) {
                    synchronized (C50942an.class) {
                        ebVar = f132614d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132613b);
                            f132614d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

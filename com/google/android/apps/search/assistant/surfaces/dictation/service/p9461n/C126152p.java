package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.p */
/* compiled from: PG */
public final class C126152p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C126152p f347617d;

    /* renamed from: e */
    private static volatile C63010eb f347618e;

    /* renamed from: a */
    public int f347619a;

    /* renamed from: b */
    public boolean f347620b;

    /* renamed from: c */
    public int f347621c;

    static {
        C126152p pVar = new C126152p();
        f347617d = pVar;
        C62942bv.registerDefaultInstance(C126152p.class, pVar);
    }

    private C126152p() {
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
                return newMessageInfo(f347617d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C126152p();
            case 4:
                return new C126151o();
            case 5:
                return f347617d;
            case 6:
                C63010eb ebVar = f347618e;
                if (ebVar == null) {
                    synchronized (C126152p.class) {
                        ebVar = f347618e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f347617d);
                            f347618e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

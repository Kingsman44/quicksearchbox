package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2682f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.f.c */
/* compiled from: PG */
public final class C34613c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C34613c f91928d;

    /* renamed from: e */
    private static volatile C63010eb f91929e;

    /* renamed from: a */
    public int f91930a;

    /* renamed from: b */
    public int f91931b;

    /* renamed from: c */
    public String f91932c = BuildConfig.FLAVOR;

    static {
        C34613c cVar = new C34613c();
        f91928d = cVar;
        C62942bv.registerDefaultInstance(C34613c.class, cVar);
    }

    private C34613c() {
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
                return newMessageInfo(f91928d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C34613c();
            case 4:
                return new C34611a();
            case 5:
                return f91928d;
            case 6:
                C63010eb ebVar = f91929e;
                if (ebVar == null) {
                    synchronized (C34613c.class) {
                        ebVar = f91929e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91928d);
                            f91929e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

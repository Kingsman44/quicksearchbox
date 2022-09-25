package com.google.p4129b.p4130a.p4131a.p4132a.p4133a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.a.c */
/* compiled from: PG */
public final class C54653c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54653c f143482d;

    /* renamed from: e */
    private static volatile C63010eb f143483e;

    /* renamed from: a */
    public int f143484a;

    /* renamed from: b */
    public String f143485b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f143486c = BuildConfig.FLAVOR;

    static {
        C54653c cVar = new C54653c();
        f143482d = cVar;
        C62942bv.registerDefaultInstance(C54653c.class, cVar);
    }

    private C54653c() {
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
                return newMessageInfo(f143482d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54653c();
            case 4:
                return new C54652b();
            case 5:
                return f143482d;
            case 6:
                C63010eb ebVar = f143483e;
                if (ebVar == null) {
                    synchronized (C54653c.class) {
                        ebVar = f143483e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143482d);
                            f143483e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

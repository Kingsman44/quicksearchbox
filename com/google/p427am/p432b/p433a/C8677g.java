package com.google.p427am.p432b.p433a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.g */
/* compiled from: PG */
public final class C8677g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8677g f29998d;

    /* renamed from: e */
    private static volatile C63010eb f29999e;

    /* renamed from: a */
    public String f30000a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C8675e f30001b;

    /* renamed from: c */
    public C8651bc f30002c;

    static {
        C8677g gVar = new C8677g();
        f29998d = gVar;
        C62942bv.registerDefaultInstance(C8677g.class, gVar);
    }

    private C8677g() {
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
                return newMessageInfo(f29998d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8677g();
            case 4:
                return new C8676f();
            case 5:
                return f29998d;
            case 6:
                C63010eb ebVar = f29999e;
                if (ebVar == null) {
                    synchronized (C8677g.class) {
                        ebVar = f29999e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29998d);
                            f29999e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

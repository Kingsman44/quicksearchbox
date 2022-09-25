package com.google.knowledge.cerebra.sense.textclassifier.p4679c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.c.b */
/* compiled from: PG */
public final class C61848b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61848b f167133d;

    /* renamed from: e */
    private static volatile C63010eb f167134e;

    /* renamed from: a */
    public int f167135a;

    /* renamed from: b */
    public String f167136b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f167137c = BuildConfig.FLAVOR;

    static {
        C61848b bVar = new C61848b();
        f167133d = bVar;
        C62942bv.registerDefaultInstance(C61848b.class, bVar);
    }

    private C61848b() {
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
                return newMessageInfo(f167133d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C61848b();
            case 4:
                return new C61847a();
            case 5:
                return f167133d;
            case 6:
                C63010eb ebVar = f167134e;
                if (ebVar == null) {
                    synchronized (C61848b.class) {
                        ebVar = f167134e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167133d);
                            f167134e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.p4653i.p4654a.p4655a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.a.d */
/* compiled from: PG */
public final class C61653d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61653d f166550d;

    /* renamed from: e */
    private static volatile C63010eb f166551e;

    /* renamed from: a */
    public int f166552a;

    /* renamed from: b */
    public int f166553b = 1;

    /* renamed from: c */
    public String f166554c = BuildConfig.FLAVOR;

    static {
        C61653d dVar = new C61653d();
        f166550d = dVar;
        C62942bv.registerDefaultInstance(C61653d.class, dVar);
    }

    private C61653d() {
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
                return newMessageInfo(f166550d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C61650a.f166549a, C45240c.f118157a});
            case 3:
                return new C61653d();
            case 4:
                return new C61652c();
            case 5:
                return f166550d;
            case 6:
                C63010eb ebVar = f166551e;
                if (ebVar == null) {
                    synchronized (C61653d.class) {
                        ebVar = f166551e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166550d);
                            f166551e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

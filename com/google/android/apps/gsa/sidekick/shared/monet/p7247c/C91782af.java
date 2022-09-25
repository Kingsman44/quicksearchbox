package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.af */
/* compiled from: PG */
public final class C91782af extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C91782af f255942f;

    /* renamed from: g */
    private static volatile C63010eb f255943g;

    /* renamed from: a */
    public int f255944a;

    /* renamed from: b */
    public boolean f255945b;

    /* renamed from: c */
    public String f255946c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f255947d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f255948e;

    static {
        C91782af afVar = new C91782af();
        f255942f = afVar;
        C62942bv.registerDefaultInstance(C91782af.class, afVar);
    }

    private C91782af() {
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
                return newMessageInfo(f255942f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C91782af();
            case 4:
                return new C91781ae();
            case 5:
                return f255942f;
            case 6:
                C63010eb ebVar = f255943g;
                if (ebVar == null) {
                    synchronized (C91782af.class) {
                        ebVar = f255943g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255942f);
                            f255943g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

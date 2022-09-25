package com.google.android.apps.search.googleapp.discover.p10204p.p10209c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.c.n */
/* compiled from: PG */
public final class C134508n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C134508n f366301f;

    /* renamed from: g */
    private static volatile C63010eb f366302g;

    /* renamed from: a */
    public int f366303a;

    /* renamed from: b */
    public C62971cq f366304b = emptyProtobufList();

    /* renamed from: c */
    public String f366305c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f366306d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C134502h f366307e;

    static {
        C134508n nVar = new C134508n();
        f366301f = nVar;
        C62942bv.registerDefaultInstance(C134508n.class, nVar);
    }

    private C134508n() {
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
                return newMessageInfo(f366301f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001\u0005ဉ\u0002", new Object[]{"a", "b", C134510p.class, C45240c.f118157a, "d", "e"});
            case 3:
                return new C134508n();
            case 4:
                return new C134507m();
            case 5:
                return f366301f;
            case 6:
                C63010eb ebVar = f366302g;
                if (ebVar == null) {
                    synchronized (C134508n.class) {
                        ebVar = f366302g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366301f);
                            f366302g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.p4283bv.p4287b.p4288a.p4289a.p4305j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.j.b */
/* compiled from: PG */
public final class C56714b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56714b f151376e;

    /* renamed from: f */
    private static volatile C63010eb f151377f;

    /* renamed from: a */
    public int f151378a;

    /* renamed from: b */
    public String f151379b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151380c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f151381d = true;

    static {
        C56714b bVar = new C56714b();
        f151376e = bVar;
        C62942bv.registerDefaultInstance(C56714b.class, bVar);
    }

    private C56714b() {
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
                return newMessageInfo(f151376e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56714b();
            case 4:
                return new C56713a();
            case 5:
                return f151376e;
            case 6:
                C63010eb ebVar = f151377f;
                if (ebVar == null) {
                    synchronized (C56714b.class) {
                        ebVar = f151377f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151376e);
                            f151377f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

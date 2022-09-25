package com.google.p4184bj.p4214f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.f.b */
/* compiled from: PG */
public final class C56028b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56028b f149203d;

    /* renamed from: f */
    private static volatile C63010eb f149204f;

    /* renamed from: a */
    public int f149205a = 0;

    /* renamed from: b */
    public Object f149206b;

    /* renamed from: c */
    public String f149207c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f149208e;

    static {
        C56028b bVar = new C56028b();
        f149203d = bVar;
        C62942bv.registerDefaultInstance(C56028b.class, bVar);
    }

    private C56028b() {
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
                return newMessageInfo(f149203d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ြ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C56030d.class});
            case 3:
                return new C56028b();
            case 4:
                return new C56027a();
            case 5:
                return f149203d;
            case 6:
                C63010eb ebVar = f149204f;
                if (ebVar == null) {
                    synchronized (C56028b.class) {
                        ebVar = f149204f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149203d);
                            f149204f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.libraries.p1657ba.p1664c.p1668c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ba.c.c.d */
/* compiled from: PG */
public final class C19666d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19666d f54694d;

    /* renamed from: f */
    private static volatile C63010eb f54695f;

    /* renamed from: a */
    public float f54696a;

    /* renamed from: b */
    public String f54697b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f54698c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f54699e;

    static {
        C19666d dVar = new C19666d();
        f54694d = dVar;
        C62942bv.registerDefaultInstance(C19666d.class, dVar);
    }

    private C19666d() {
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
                return newMessageInfo(f54694d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ခ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C19666d();
            case 4:
                return new C19661c();
            case 5:
                return f54694d;
            case 6:
                C63010eb ebVar = f54695f;
                if (ebVar == null) {
                    synchronized (C19666d.class) {
                        ebVar = f54695f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54694d);
                            f54695f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

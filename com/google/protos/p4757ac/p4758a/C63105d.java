package com.google.protos.p4757ac.p4758a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ac.a.d */
/* compiled from: PG */
public final class C63105d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63105d f170333c;

    /* renamed from: d */
    private static volatile C63010eb f170334d;

    /* renamed from: a */
    public int f170335a;

    /* renamed from: b */
    public String f170336b = BuildConfig.FLAVOR;

    static {
        C63105d dVar = new C63105d();
        f170333c = dVar;
        C62942bv.registerDefaultInstance(C63105d.class, dVar);
    }

    private C63105d() {
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
                return newMessageInfo(f170333c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C63105d();
            case 4:
                return new C63104c();
            case 5:
                return f170333c;
            case 6:
                C63010eb ebVar = f170334d;
                if (ebVar == null) {
                    synchronized (C63105d.class) {
                        ebVar = f170334d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170333c);
                            f170334d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.bp */
/* compiled from: PG */
public final class C53106bp extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53106bp f139165f;

    /* renamed from: g */
    private static volatile C63010eb f139166g;

    /* renamed from: a */
    public int f139167a;

    /* renamed from: b */
    public String f139168b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139169c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f139170d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C53105bo f139171e;

    static {
        C53106bp bpVar = new C53106bp();
        f139165f = bpVar;
        C62942bv.registerDefaultInstance(C53106bp.class, bpVar);
    }

    private C53106bp() {
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
                return newMessageInfo(f139165f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C53106bp();
            case 4:
                return new C53099bi();
            case 5:
                return f139165f;
            case 6:
                C63010eb ebVar = f139166g;
                if (ebVar == null) {
                    synchronized (C53106bp.class) {
                        ebVar = f139166g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139165f);
                            f139166g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.df */
/* compiled from: PG */
public final class C57643df extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57643df f153945e;

    /* renamed from: f */
    private static volatile C63010eb f153946f;

    /* renamed from: a */
    public String f153947a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f153948b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f153949c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f153950d = BuildConfig.FLAVOR;

    static {
        C57643df dfVar = new C57643df();
        f153945e = dfVar;
        C62942bv.registerDefaultInstance(C57643df.class, dfVar);
    }

    private C57643df() {
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
                return newMessageInfo(f153945e, "\u0000\u0004\u0000\u0000\u0001\b\u0004\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0004Ȉ\bȈ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C57643df();
            case 4:
                return new C57642de();
            case 5:
                return f153945e;
            case 6:
                C63010eb ebVar = f153946f;
                if (ebVar == null) {
                    synchronized (C57643df.class) {
                        ebVar = f153946f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153945e);
                            f153946f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

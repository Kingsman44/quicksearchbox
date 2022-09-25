package com.google.protos.p4816ai.p4820d.p4821a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.a.h */
/* compiled from: PG */
public final class C63216h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63216h f170786f;

    /* renamed from: g */
    private static volatile C63010eb f170787g;

    /* renamed from: a */
    public int f170788a;

    /* renamed from: b */
    public int f170789b;

    /* renamed from: c */
    public String f170790c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f170791d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f170792e;

    static {
        C63216h hVar = new C63216h();
        f170786f = hVar;
        C62942bv.registerDefaultInstance(C63216h.class, hVar);
    }

    private C63216h() {
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
                return newMessageInfo(f170786f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C63214f.f170785a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C63216h();
            case 4:
                return new C63213e();
            case 5:
                return f170786f;
            case 6:
                C63010eb ebVar = f170787g;
                if (ebVar == null) {
                    synchronized (C63216h.class) {
                        ebVar = f170787g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170786f);
                            f170787g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

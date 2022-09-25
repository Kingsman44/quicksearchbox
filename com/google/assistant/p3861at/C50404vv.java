package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.vv */
/* compiled from: PG */
public final class C50404vv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50404vv f131192d;

    /* renamed from: e */
    private static volatile C63010eb f131193e;

    /* renamed from: a */
    public int f131194a;

    /* renamed from: b */
    public String f131195b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f131196c;

    static {
        C50404vv vvVar = new C50404vv();
        f131192d = vvVar;
        C62942bv.registerDefaultInstance(C50404vv.class, vvVar);
    }

    private C50404vv() {
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
                return newMessageInfo(f131192d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C49875cf.m85756b()});
            case 3:
                return new C50404vv();
            case 4:
                return new C50403vu();
            case 5:
                return f131192d;
            case 6:
                C63010eb ebVar = f131193e;
                if (ebVar == null) {
                    synchronized (C50404vv.class) {
                        ebVar = f131193e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131192d);
                            f131193e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.abb */
/* compiled from: PG */
public final class abb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final abb f128752e;

    /* renamed from: f */
    private static volatile C63010eb f128753f;

    /* renamed from: a */
    public int f128754a;

    /* renamed from: b */
    public C50509zs f128755b;

    /* renamed from: c */
    public String f128756c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63088z f128757d = C63088z.f170246b;

    static {
        abb abb = new abb();
        f128752e = abb;
        C62942bv.registerDefaultInstance(abb.class, abb);
    }

    private abb() {
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
                return newMessageInfo(f128752e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0002\u0006ည\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new abb();
            case 4:
                return new aba();
            case 5:
                return f128752e;
            case 6:
                C63010eb ebVar = f128753f;
                if (ebVar == null) {
                    synchronized (abb.class) {
                        ebVar = f128753f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128752e);
                            f128753f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

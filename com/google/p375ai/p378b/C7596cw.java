package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.cw */
/* compiled from: PG */
public final class C7596cw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7596cw f26255b;

    /* renamed from: d */
    private static volatile C63010eb f26256d;

    /* renamed from: a */
    public String f26257a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f26258c;

    static {
        C7596cw cwVar = new C7596cw();
        f26255b = cwVar;
        C62942bv.registerDefaultInstance(C7596cw.class, cwVar);
    }

    private C7596cw() {
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
                return newMessageInfo(f26255b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C7596cw();
            case 4:
                return new C7595cv();
            case 5:
                return f26255b;
            case 6:
                C63010eb ebVar = f26256d;
                if (ebVar == null) {
                    synchronized (C7596cw.class) {
                        ebVar = f26256d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26255b);
                            f26256d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

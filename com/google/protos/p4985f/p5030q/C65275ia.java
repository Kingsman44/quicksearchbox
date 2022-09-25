package com.google.protos.p4985f.p5030q;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ia */
/* compiled from: PG */
public final class C65275ia extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65275ia f176583b;

    /* renamed from: d */
    private static volatile C63010eb f176584d;

    /* renamed from: a */
    public String f176585a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f176586c;

    static {
        C65275ia iaVar = new C65275ia();
        f176583b = iaVar;
        C62942bv.registerDefaultInstance(C65275ia.class, iaVar);
    }

    private C65275ia() {
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
                return newMessageInfo(f176583b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0003", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C65275ia();
            case 4:
                return new C65273hz();
            case 5:
                return f176583b;
            case 6:
                C63010eb ebVar = f176584d;
                if (ebVar == null) {
                    synchronized (C65275ia.class) {
                        ebVar = f176584d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176583b);
                            f176584d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

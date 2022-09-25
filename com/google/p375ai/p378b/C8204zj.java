package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.zj */
/* compiled from: PG */
public final class C8204zj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8204zj f28806b;

    /* renamed from: d */
    private static volatile C63010eb f28807d;

    /* renamed from: a */
    public String f28808a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f28809c;

    static {
        C8204zj zjVar = new C8204zj();
        f28806b = zjVar;
        C62942bv.registerDefaultInstance(C8204zj.class, zjVar);
    }

    private C8204zj() {
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
                return newMessageInfo(f28806b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C8204zj();
            case 4:
                return new C8203zi();
            case 5:
                return f28806b;
            case 6:
                C63010eb ebVar = f28807d;
                if (ebVar == null) {
                    synchronized (C8204zj.class) {
                        ebVar = f28807d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28806b);
                            f28807d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

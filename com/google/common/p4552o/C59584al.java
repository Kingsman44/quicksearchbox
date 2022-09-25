package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.al */
/* compiled from: PG */
public final class C59584al extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59584al f159003e;

    /* renamed from: f */
    private static volatile C63010eb f159004f;

    /* renamed from: a */
    public int f159005a;

    /* renamed from: b */
    public String f159006b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f159007c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f159008d;

    static {
        C59584al alVar = new C59584al();
        f159003e = alVar;
        C62942bv.registerDefaultInstance(C59584al.class, alVar);
    }

    private C59584al() {
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
                return newMessageInfo(f159003e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C59584al();
            case 4:
                return new C59583ak();
            case 5:
                return f159003e;
            case 6:
                C63010eb ebVar = f159004f;
                if (ebVar == null) {
                    synchronized (C59584al.class) {
                        ebVar = f159004f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159003e);
                            f159004f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

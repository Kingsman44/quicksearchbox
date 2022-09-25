package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.bp */
/* compiled from: PG */
public final class C14232bp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14232bp f43070d;

    /* renamed from: e */
    private static volatile C63010eb f43071e;

    /* renamed from: a */
    public int f43072a = 0;

    /* renamed from: b */
    public Object f43073b;

    /* renamed from: c */
    public int f43074c;

    static {
        C14232bp bpVar = new C14232bp();
        f43070d = bpVar;
        C62942bv.registerDefaultInstance(C14232bp.class, bpVar);
    }

    private C14232bp() {
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
                return newMessageInfo(f43070d, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002?\u0000\u0003?\u0000\u0004?\u0000", new Object[]{"b", "a", C45240c.f118157a});
            case 3:
                return new C14232bp();
            case 4:
                return new C14231bo();
            case 5:
                return f43070d;
            case 6:
                C63010eb ebVar = f43071e;
                if (ebVar == null) {
                    synchronized (C14232bp.class) {
                        ebVar = f43071e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43070d);
                            f43071e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

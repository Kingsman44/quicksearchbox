package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ac */
/* compiled from: PG */
public final class C57351ac extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57351ac f153216b;

    /* renamed from: d */
    private static volatile C63010eb f153217d;

    /* renamed from: a */
    public String f153218a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f153219c;

    static {
        C57351ac acVar = new C57351ac();
        f153216b = acVar;
        C62942bv.registerDefaultInstance(C57351ac.class, acVar);
    }

    private C57351ac() {
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
                return newMessageInfo(f153216b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57351ac();
            case 4:
                return new C57350ab();
            case 5:
                return f153216b;
            case 6:
                C63010eb ebVar = f153217d;
                if (ebVar == null) {
                    synchronized (C57351ac.class) {
                        ebVar = f153217d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153216b);
                            f153217d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

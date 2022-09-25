package com.google.protos.p4953bc.p4955b.p4956a.p4957a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bc.b.a.a.m */
/* compiled from: PG */
public final class C64422m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64422m f174736b;

    /* renamed from: d */
    private static volatile C63010eb f174737d;

    /* renamed from: a */
    public String f174738a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f174739c;

    static {
        C64422m mVar = new C64422m();
        f174736b = mVar;
        C62942bv.registerDefaultInstance(C64422m.class, mVar);
    }

    private C64422m() {
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
                return newMessageInfo(f174736b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C64422m();
            case 4:
                return new C64421l();
            case 5:
                return f174736b;
            case 6:
                C63010eb ebVar = f174737d;
                if (ebVar == null) {
                    synchronized (C64422m.class) {
                        ebVar = f174737d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174736b);
                            f174737d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

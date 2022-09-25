package com.google.p5277z.p5282c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.c.ab */
/* compiled from: PG */
public final class C67992ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67992ab f184228b;

    /* renamed from: d */
    private static volatile C63010eb f184229d;

    /* renamed from: a */
    public String f184230a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f184231c;

    static {
        C67992ab abVar = new C67992ab();
        f184228b = abVar;
        C62942bv.registerDefaultInstance(C67992ab.class, abVar);
    }

    private C67992ab() {
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
                return newMessageInfo(f184228b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C67992ab();
            case 4:
                return new C67991aa();
            case 5:
                return f184228b;
            case 6:
                C63010eb ebVar = f184229d;
                if (ebVar == null) {
                    synchronized (C67992ab.class) {
                        ebVar = f184229d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184228b);
                            f184229d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

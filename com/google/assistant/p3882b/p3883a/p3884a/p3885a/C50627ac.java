package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.b.a.a.a.ac */
/* compiled from: PG */
public final class C50627ac extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50627ac f131708b;

    /* renamed from: d */
    private static volatile C63010eb f131709d;

    /* renamed from: a */
    public String f131710a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f131711c;

    static {
        C50627ac acVar = new C50627ac();
        f131708b = acVar;
        C62942bv.registerDefaultInstance(C50627ac.class, acVar);
    }

    private C50627ac() {
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
                return newMessageInfo(f131708b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50627ac();
            case 4:
                return new C50626ab();
            case 5:
                return f131708b;
            case 6:
                C63010eb ebVar = f131709d;
                if (ebVar == null) {
                    synchronized (C50627ac.class) {
                        ebVar = f131709d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131708b);
                            f131709d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

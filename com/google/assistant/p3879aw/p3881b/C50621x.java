package com.google.assistant.p3879aw.p3881b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aw.b.x */
/* compiled from: PG */
public final class C50621x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50621x f131696b;

    /* renamed from: d */
    private static volatile C63010eb f131697d;

    /* renamed from: a */
    public String f131698a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f131699c;

    static {
        C50621x xVar = new C50621x();
        f131696b = xVar;
        C62942bv.registerDefaultInstance(C50621x.class, xVar);
    }

    private C50621x() {
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
                return newMessageInfo(f131696b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50621x();
            case 4:
                return new C50620w();
            case 5:
                return f131696b;
            case 6:
                C63010eb ebVar = f131697d;
                if (ebVar == null) {
                    synchronized (C50621x.class) {
                        ebVar = f131697d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131696b);
                            f131697d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

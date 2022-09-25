package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.uy */
/* compiled from: PG */
public final class C50380uy extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50380uy f131144b;

    /* renamed from: d */
    private static volatile C63010eb f131145d;

    /* renamed from: a */
    public String f131146a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f131147c;

    static {
        C50380uy uyVar = new C50380uy();
        f131144b = uyVar;
        C62942bv.registerDefaultInstance(C50380uy.class, uyVar);
    }

    private C50380uy() {
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
                return newMessageInfo(f131144b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50380uy();
            case 4:
                return new C50379ux();
            case 5:
                return f131144b;
            case 6:
                C63010eb ebVar = f131145d;
                if (ebVar == null) {
                    synchronized (C50380uy.class) {
                        ebVar = f131145d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131144b);
                            f131145d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

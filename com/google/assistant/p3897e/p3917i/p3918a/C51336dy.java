package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.dy */
/* compiled from: PG */
public final class C51336dy extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51336dy f133713d;

    /* renamed from: e */
    private static volatile C63010eb f133714e;

    /* renamed from: a */
    public int f133715a;

    /* renamed from: b */
    public String f133716b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f133717c;

    static {
        C51336dy dyVar = new C51336dy();
        f133713d = dyVar;
        C62942bv.registerDefaultInstance(C51336dy.class, dyVar);
    }

    private C51336dy() {
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
                return newMessageInfo(f133713d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51336dy();
            case 4:
                return new C51335dx();
            case 5:
                return f133713d;
            case 6:
                C63010eb ebVar = f133714e;
                if (ebVar == null) {
                    synchronized (C51336dy.class) {
                        ebVar = f133714e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133713d);
                            f133714e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

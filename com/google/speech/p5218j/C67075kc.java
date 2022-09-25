package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.kc */
/* compiled from: PG */
public final class C67075kc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67075kc f182331b;

    /* renamed from: d */
    private static volatile C63010eb f182332d;

    /* renamed from: a */
    public String f182333a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f182334c;

    static {
        C67075kc kcVar = new C67075kc();
        f182331b = kcVar;
        C62942bv.registerDefaultInstance(C67075kc.class, kcVar);
    }

    private C67075kc() {
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
                return newMessageInfo(f182331b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C67075kc();
            case 4:
                return new C67074kb();
            case 5:
                return f182331b;
            case 6:
                C63010eb ebVar = f182332d;
                if (ebVar == null) {
                    synchronized (C67075kc.class) {
                        ebVar = f182332d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182331b);
                            f182332d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

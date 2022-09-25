package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ln */
/* compiled from: PG */
public final class C67113ln extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67113ln f182444b;

    /* renamed from: d */
    private static volatile C63010eb f182445d;

    /* renamed from: a */
    public String f182446a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f182447c;

    static {
        C67113ln lnVar = new C67113ln();
        f182444b = lnVar;
        C62942bv.registerDefaultInstance(C67113ln.class, lnVar);
    }

    private C67113ln() {
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
                return newMessageInfo(f182444b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C67113ln();
            case 4:
                return new C67112lm();
            case 5:
                return f182444b;
            case 6:
                C63010eb ebVar = f182445d;
                if (ebVar == null) {
                    synchronized (C67113ln.class) {
                        ebVar = f182445d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182444b);
                            f182445d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.apps.auto.p450a.p451a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.n */
/* compiled from: PG */
public final class C8921n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8921n f30942b;

    /* renamed from: d */
    private static volatile C63010eb f30943d;

    /* renamed from: a */
    public String f30944a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f30945c;

    static {
        C8921n nVar = new C8921n();
        f30942b = nVar;
        C62942bv.registerDefaultInstance(C8921n.class, nVar);
    }

    private C8921n() {
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
                return newMessageInfo(f30942b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C8921n();
            case 4:
                return new C8920m();
            case 5:
                return f30942b;
            case 6:
                C63010eb ebVar = f30943d;
                if (ebVar == null) {
                    synchronized (C8921n.class) {
                        ebVar = f30943d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30942b);
                            f30943d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

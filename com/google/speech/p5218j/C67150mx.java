package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.mx */
/* compiled from: PG */
public final class C67150mx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67150mx f182524d;

    /* renamed from: e */
    private static volatile C63010eb f182525e;

    /* renamed from: a */
    public int f182526a;

    /* renamed from: b */
    public int f182527b;

    /* renamed from: c */
    public String f182528c = BuildConfig.FLAVOR;

    static {
        C67150mx mxVar = new C67150mx();
        f182524d = mxVar;
        C62942bv.registerDefaultInstance(C67150mx.class, mxVar);
    }

    private C67150mx() {
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
                return newMessageInfo(f182524d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C67152mz.m97428b(), C45240c.f118157a});
            case 3:
                return new C67150mx();
            case 4:
                return new C67149mw();
            case 5:
                return f182524d;
            case 6:
                C63010eb ebVar = f182525e;
                if (ebVar == null) {
                    synchronized (C67150mx.class) {
                        ebVar = f182525e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182524d);
                            f182525e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

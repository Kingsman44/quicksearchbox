package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.dt */
/* compiled from: PG */
public final class C66206dt extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66206dt f180035d;

    /* renamed from: e */
    private static volatile C63010eb f180036e;

    /* renamed from: a */
    public int f180037a;

    /* renamed from: b */
    public float f180038b;

    /* renamed from: c */
    public float f180039c;

    static {
        C66206dt dtVar = new C66206dt();
        f180035d = dtVar;
        C62942bv.registerDefaultInstance(C66206dt.class, dtVar);
    }

    private C66206dt() {
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
                return newMessageInfo(f180035d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66206dt();
            case 4:
                return new C66205ds();
            case 5:
                return f180035d;
            case 6:
                C63010eb ebVar = f180036e;
                if (ebVar == null) {
                    synchronized (C66206dt.class) {
                        ebVar = f180036e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180035d);
                            f180036e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

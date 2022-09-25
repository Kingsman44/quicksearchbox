package com.google.protos.youtube.elements.p5166b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.at */
/* compiled from: PG */
public final class C66086at extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66086at f179707d;

    /* renamed from: e */
    private static volatile C63010eb f179708e;

    /* renamed from: a */
    public int f179709a;

    /* renamed from: b */
    public C66101f f179710b;

    /* renamed from: c */
    public String f179711c = BuildConfig.FLAVOR;

    static {
        C66086at atVar = new C66086at();
        f179707d = atVar;
        C62942bv.registerDefaultInstance(C66086at.class, atVar);
    }

    private C66086at() {
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
                return newMessageInfo(f179707d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66086at();
            case 4:
                return new C66085as();
            case 5:
                return f179707d;
            case 6:
                C63010eb ebVar = f179708e;
                if (ebVar == null) {
                    synchronized (C66086at.class) {
                        ebVar = f179708e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179707d);
                            f179708e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

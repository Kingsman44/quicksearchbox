package com.google.protos.youtube.elements.p5166b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.youtube.elements.b.ah */
/* compiled from: PG */
public final class C66074ah extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66074ah f179675d;

    /* renamed from: e */
    private static volatile C63010eb f179676e;

    /* renamed from: a */
    public int f179677a;

    /* renamed from: b */
    public String f179678b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f179679c = C63088z.f170246b;

    static {
        C66074ah ahVar = new C66074ah();
        f179675d = ahVar;
        C62942bv.registerDefaultInstance(C66074ah.class, ahVar);
    }

    private C66074ah() {
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
                return newMessageInfo(f179675d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66074ah();
            case 4:
                return new C66073ag();
            case 5:
                return f179675d;
            case 6:
                C63010eb ebVar = f179676e;
                if (ebVar == null) {
                    synchronized (C66074ah.class) {
                        ebVar = f179676e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179675d);
                            f179676e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

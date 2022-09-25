package com.google.p4102au.p4103a.p4104a.p4105a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.au.a.a.a.d */
/* compiled from: PG */
public final class C54566d extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C54566d f143260a;

    /* renamed from: f */
    private static volatile C63010eb f143261f;

    /* renamed from: b */
    private int f143262b;

    /* renamed from: c */
    private String f143263c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private String f143264d = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f143265e = 2;

    static {
        C54566d dVar = new C54566d();
        f143260a = dVar;
        C62942bv.registerDefaultInstance(C54566d.class, dVar);
    }

    private C54566d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143265e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f143265e = b;
                return null;
            case 2:
                return newMessageInfo(f143260a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C54566d();
            case 4:
                return new C54565c();
            case 5:
                return f143260a;
            case 6:
                C63010eb ebVar = f143261f;
                if (ebVar == null) {
                    synchronized (C54566d.class) {
                        ebVar = f143261f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143260a);
                            f143261f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

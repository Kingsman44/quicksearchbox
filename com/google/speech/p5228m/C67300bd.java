package com.google.speech.p5228m;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.bd */
/* compiled from: PG */
public final class C67300bd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67300bd f182931e;

    /* renamed from: g */
    private static volatile C63010eb f182932g;

    /* renamed from: a */
    public int f182933a;

    /* renamed from: b */
    public int f182934b;

    /* renamed from: c */
    public int f182935c;

    /* renamed from: d */
    public int f182936d;

    /* renamed from: f */
    private int f182937f;

    static {
        C67300bd bdVar = new C67300bd();
        f182931e = bdVar;
        C62942bv.registerDefaultInstance(C67300bd.class, bdVar);
    }

    private C67300bd() {
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
                return newMessageInfo(f182931e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0004င\u0003\u0005င\u0004", new Object[]{C10662f.f35572a, "a", C67277ah.f182881a, "b", C45240c.f118157a, "d"});
            case 3:
                return new C67300bd();
            case 4:
                return new C67299bc();
            case 5:
                return f182931e;
            case 6:
                C63010eb ebVar = f182932g;
                if (ebVar == null) {
                    synchronized (C67300bd.class) {
                        ebVar = f182932g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182931e);
                            f182932g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

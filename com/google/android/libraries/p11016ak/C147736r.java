package com.google.android.libraries.p11016ak;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ak.r */
/* compiled from: PG */
public final class C147736r extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C147736r f398657g;

    /* renamed from: h */
    private static volatile C63010eb f398658h;

    /* renamed from: a */
    public int f398659a;

    /* renamed from: b */
    public int f398660b;

    /* renamed from: c */
    public long f398661c;

    /* renamed from: d */
    public long f398662d;

    /* renamed from: e */
    public int f398663e;

    /* renamed from: f */
    public int f398664f;

    static {
        C147736r rVar = new C147736r();
        f398657g = rVar;
        C62942bv.registerDefaultInstance(C147736r.class, rVar);
    }

    private C147736r() {
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
                return newMessageInfo(f398657g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0002\u0004\u0002\u0005\u0004\u0006\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C147736r();
            case 4:
                return new C147735q();
            case 5:
                return f398657g;
            case 6:
                C63010eb ebVar = f398658h;
                if (ebVar == null) {
                    synchronized (C147736r.class) {
                        ebVar = f398658h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398657g);
                            f398658h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

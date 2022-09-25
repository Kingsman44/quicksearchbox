package com.google.research.p5181a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.a.m */
/* compiled from: PG */
public final class C66384m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66384m f180499e;

    /* renamed from: f */
    private static volatile C63010eb f180500f;

    /* renamed from: a */
    public int f180501a;

    /* renamed from: b */
    public C66389r f180502b;

    /* renamed from: c */
    public C66391t f180503c;

    /* renamed from: d */
    public C66328d f180504d;

    static {
        C66384m mVar = new C66384m();
        f180499e = mVar;
        C62942bv.registerDefaultInstance(C66384m.class, mVar);
    }

    private C66384m() {
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
                return newMessageInfo(f180499e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66384m();
            case 4:
                return new C66383l();
            case 5:
                return f180499e;
            case 6:
                C63010eb ebVar = f180500f;
                if (ebVar == null) {
                    synchronized (C66384m.class) {
                        ebVar = f180500f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180499e);
                            f180500f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

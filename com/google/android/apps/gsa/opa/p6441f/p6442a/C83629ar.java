package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.ar */
/* compiled from: PG */
public final class C83629ar extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C83629ar f227979f;

    /* renamed from: g */
    private static volatile C63010eb f227980g;

    /* renamed from: a */
    public int f227981a;

    /* renamed from: b */
    public int f227982b = 0;

    /* renamed from: c */
    public Object f227983c;

    /* renamed from: d */
    public int f227984d;

    /* renamed from: e */
    public long f227985e;

    static {
        C83629ar arVar = new C83629ar();
        f227979f = arVar;
        C62942bv.registerDefaultInstance(C83629ar.class, arVar);
    }

    private C83629ar() {
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
                return newMessageInfo(f227979f, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C83628aq.f227978a, "e", C83627ap.class, C83625an.class, C83621aj.class, C83623al.class});
            case 3:
                return new C83629ar();
            case 4:
                return new C83619ah();
            case 5:
                return f227979f;
            case 6:
                C63010eb ebVar = f227980g;
                if (ebVar == null) {
                    synchronized (C83629ar.class) {
                        ebVar = f227980g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227979f);
                            f227980g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

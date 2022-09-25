package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.ar */
/* compiled from: PG */
public final class C97892ar extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C97892ar f273324f;

    /* renamed from: g */
    private static volatile C63010eb f273325g;

    /* renamed from: a */
    public int f273326a;

    /* renamed from: b */
    public int f273327b = 0;

    /* renamed from: c */
    public Object f273328c;

    /* renamed from: d */
    public C97894at f273329d;

    /* renamed from: e */
    public long f273330e;

    static {
        C97892ar arVar = new C97892ar();
        f273324f = arVar;
        C62942bv.registerDefaultInstance(C97892ar.class, arVar);
    }

    private C97892ar() {
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
                return newMessageInfo(f273324f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ြ\u0000\u0004ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C97929s.class, C97927q.class});
            case 3:
                return new C97892ar();
            case 4:
                return new C97891aq();
            case 5:
                return f273324f;
            case 6:
                C63010eb ebVar = f273325g;
                if (ebVar == null) {
                    synchronized (C97892ar.class) {
                        ebVar = f273325g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273324f);
                            f273325g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5224k.p5225a.C67190ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.a.a.an */
/* compiled from: PG */
public final class C107475an extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C107475an f299054e;

    /* renamed from: g */
    private static volatile C63010eb f299055g;

    /* renamed from: a */
    public int f299056a;

    /* renamed from: b */
    public int f299057b = 0;

    /* renamed from: c */
    public Object f299058c;

    /* renamed from: d */
    public boolean f299059d;

    /* renamed from: f */
    private byte f299060f = 2;

    static {
        C107475an anVar = new C107475an();
        f299054e = anVar;
        C62942bv.registerDefaultInstance(C107475an.class, anVar);
    }

    private C107475an() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f299060f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f299060f = b;
                return null;
            case 2:
                return newMessageInfo(f299054e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ျ\u0000\u0002ᐼ\u0000\u0003ဇ\u0002", new Object[]{C45240c.f118157a, "b", "a", C67190ah.class, "d"});
            case 3:
                return new C107475an();
            case 4:
                return new C107474am();
            case 5:
                return f299054e;
            case 6:
                C63010eb ebVar = f299055g;
                if (ebVar == null) {
                    synchronized (C107475an.class) {
                        ebVar = f299055g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299054e);
                            f299055g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

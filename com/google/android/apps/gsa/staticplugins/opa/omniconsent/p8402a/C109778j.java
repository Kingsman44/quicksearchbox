package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.aee;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.a.j */
/* compiled from: PG */
public final class C109778j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C109778j f305889e;

    /* renamed from: f */
    private static volatile C63010eb f305890f;

    /* renamed from: a */
    public int f305891a;

    /* renamed from: b */
    public int f305892b;

    /* renamed from: c */
    public C63088z f305893c = C63088z.f170246b;

    /* renamed from: d */
    public boolean f305894d;

    static {
        C109778j jVar = new C109778j();
        f305889e = jVar;
        C62942bv.registerDefaultInstance(C109778j.class, jVar);
    }

    private C109778j() {
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
                return newMessageInfo(f305889e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0001\u0002ဇ\u0002\u0003ဌ\u0000", new Object[]{"a", C45240c.f118157a, "d", "b", aee.f129104a});
            case 3:
                return new C109778j();
            case 4:
                return new C109777i();
            case 5:
                return f305889e;
            case 6:
                C63010eb ebVar = f305890f;
                if (ebVar == null) {
                    synchronized (C109778j.class) {
                        ebVar = f305890f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f305889e);
                            f305890f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

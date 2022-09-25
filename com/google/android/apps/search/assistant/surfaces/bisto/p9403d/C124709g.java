package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.g */
/* compiled from: PG */
public final class C124709g extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C124709g f344049g;

    /* renamed from: h */
    private static volatile C63010eb f344050h;

    /* renamed from: a */
    public int f344051a;

    /* renamed from: b */
    public C124623ap f344052b;

    /* renamed from: c */
    public C124644bj f344053c;

    /* renamed from: d */
    public C124642bh f344054d;

    /* renamed from: e */
    public C124617aj f344055e;

    /* renamed from: f */
    public C124727y f344056f;

    static {
        C124709g gVar = new C124709g();
        f344049g = gVar;
        C62942bv.registerDefaultInstance(C124709g.class, gVar);
    }

    private C124709g() {
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
                return newMessageInfo(f344049g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C124709g();
            case 4:
                return new C124708f();
            case 5:
                return f344049g;
            case 6:
                C63010eb ebVar = f344050h;
                if (ebVar == null) {
                    synchronized (C124709g.class) {
                        ebVar = f344050h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344049g);
                            f344050h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

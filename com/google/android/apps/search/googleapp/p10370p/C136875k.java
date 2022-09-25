package com.google.android.apps.search.googleapp.p10370p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58072d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.p.k */
/* compiled from: PG */
public final class C136875k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C136875k f372537e;

    /* renamed from: f */
    private static volatile C63010eb f372538f;

    /* renamed from: a */
    public int f372539a;

    /* renamed from: b */
    public C58072d f372540b;

    /* renamed from: c */
    public C58072d f372541c;

    /* renamed from: d */
    public C62995dn f372542d = C62995dn.f170057a;

    static {
        C136875k kVar = new C136875k();
        f372537e = kVar;
        C62942bv.registerDefaultInstance(C136875k.class, kVar);
    }

    private C136875k() {
    }

    /* renamed from: a */
    public final C62995dn mo113419a() {
        C62995dn dnVar = this.f372542d;
        if (!dnVar.f170058b) {
            this.f372542d = dnVar.mo58980a();
        }
        return this.f372542d;
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
                return newMessageInfo(f372537e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u00032", new Object[]{"a", "b", C45240c.f118157a, "d", C136874j.f372536a});
            case 3:
                return new C136875k();
            case 4:
                return new C136873i();
            case 5:
                return f372537e;
            case 6:
                C63010eb ebVar = f372538f;
                if (ebVar == null) {
                    synchronized (C136875k.class) {
                        ebVar = f372538f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372537e);
                            f372538f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.apps.gsa.opa.p6448i.p6449a.p6450a.C83710a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.k */
/* compiled from: PG */
public final class C54920k extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54920k f144367f;

    /* renamed from: g */
    private static volatile C63010eb f144368g;

    /* renamed from: a */
    public int f144369a;

    /* renamed from: b */
    public boolean f144370b;

    /* renamed from: c */
    public float f144371c;

    /* renamed from: d */
    public float f144372d;

    /* renamed from: e */
    public int f144373e = 1;

    static {
        C54920k kVar = new C54920k();
        f144367f = kVar;
        C62942bv.registerDefaultInstance(C54920k.class, kVar);
    }

    private C54920k() {
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
                return newMessageInfo(f144367f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C83710a.f228163a});
            case 3:
                return new C54920k();
            case 4:
                return new C54919j();
            case 5:
                return f144367f;
            case 6:
                C63010eb ebVar = f144368g;
                if (ebVar == null) {
                    synchronized (C54920k.class) {
                        ebVar = f144368g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144367f);
                            f144368g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

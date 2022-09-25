package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.bm */
/* compiled from: PG */
public final class C54847bm extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54847bm f144016f;

    /* renamed from: g */
    private static volatile C63010eb f144017g;

    /* renamed from: a */
    public int f144018a;

    /* renamed from: b */
    public C54922m f144019b;

    /* renamed from: c */
    public C54918i f144020c;

    /* renamed from: d */
    public C54851bq f144021d;

    /* renamed from: e */
    public C54932w f144022e;

    static {
        C54847bm bmVar = new C54847bm();
        f144016f = bmVar;
        C62942bv.registerDefaultInstance(C54847bm.class, bmVar);
    }

    private C54847bm() {
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
                return newMessageInfo(f144016f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54847bm();
            case 4:
                return new C54846bl();
            case 5:
                return f144016f;
            case 6:
                C63010eb ebVar = f144017g;
                if (ebVar == null) {
                    synchronized (C54847bm.class) {
                        ebVar = f144017g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144016f);
                            f144017g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

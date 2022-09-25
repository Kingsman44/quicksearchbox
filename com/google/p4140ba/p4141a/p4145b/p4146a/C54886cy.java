package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.cy */
/* compiled from: PG */
public final class C54886cy extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54886cy f144206f;

    /* renamed from: g */
    private static volatile C63010eb f144207g;

    /* renamed from: a */
    public int f144208a;

    /* renamed from: b */
    public float f144209b;

    /* renamed from: c */
    public float f144210c;

    /* renamed from: d */
    public float f144211d;

    /* renamed from: e */
    public float f144212e;

    static {
        C54886cy cyVar = new C54886cy();
        f144206f = cyVar;
        C62942bv.registerDefaultInstance(C54886cy.class, cyVar);
    }

    private C54886cy() {
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
                return newMessageInfo(f144206f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54886cy();
            case 4:
                return new C54885cx();
            case 5:
                return f144206f;
            case 6:
                C63010eb ebVar = f144207g;
                if (ebVar == null) {
                    synchronized (C54886cy.class) {
                        ebVar = f144207g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144206f);
                            f144207g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

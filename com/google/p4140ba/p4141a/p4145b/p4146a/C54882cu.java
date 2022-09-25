package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.cu */
/* compiled from: PG */
public final class C54882cu extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54882cu f144180f;

    /* renamed from: g */
    private static volatile C63010eb f144181g;

    /* renamed from: a */
    public int f144182a;

    /* renamed from: b */
    public C54886cy f144183b;

    /* renamed from: c */
    public C54886cy f144184c;

    /* renamed from: d */
    public C54886cy f144185d;

    /* renamed from: e */
    public C54886cy f144186e;

    static {
        C54882cu cuVar = new C54882cu();
        f144180f = cuVar;
        C62942bv.registerDefaultInstance(C54882cu.class, cuVar);
    }

    private C54882cu() {
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
                return newMessageInfo(f144180f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54882cu();
            case 4:
                return new C54881ct();
            case 5:
                return f144180f;
            case 6:
                C63010eb ebVar = f144181g;
                if (ebVar == null) {
                    synchronized (C54882cu.class) {
                        ebVar = f144181g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144180f);
                            f144181g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

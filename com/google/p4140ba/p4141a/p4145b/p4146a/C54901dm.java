package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.dm */
/* compiled from: PG */
public final class C54901dm extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54901dm f144262f;

    /* renamed from: g */
    private static volatile C63010eb f144263g;

    /* renamed from: a */
    public int f144264a;

    /* renamed from: b */
    public C54905dq f144265b;

    /* renamed from: c */
    public C54905dq f144266c;

    /* renamed from: d */
    public C54905dq f144267d;

    /* renamed from: e */
    public C54905dq f144268e;

    static {
        C54901dm dmVar = new C54901dm();
        f144262f = dmVar;
        C62942bv.registerDefaultInstance(C54901dm.class, dmVar);
    }

    private C54901dm() {
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
                return newMessageInfo(f144262f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54901dm();
            case 4:
                return new C54900dl();
            case 5:
                return f144262f;
            case 6:
                C63010eb ebVar = f144263g;
                if (ebVar == null) {
                    synchronized (C54901dm.class) {
                        ebVar = f144263g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144262f);
                            f144263g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.dd */
/* compiled from: PG */
public final class C59949dd extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59949dd f162019f;

    /* renamed from: g */
    private static volatile C63010eb f162020g;

    /* renamed from: a */
    public int f162021a;

    /* renamed from: b */
    public C59947db f162022b;

    /* renamed from: c */
    public int f162023c;

    /* renamed from: d */
    public boolean f162024d;

    /* renamed from: e */
    public C62971cq f162025e = emptyProtobufList();

    static {
        C59949dd ddVar = new C59949dd();
        f162019f = ddVar;
        C62942bv.registerDefaultInstance(C59949dd.class, ddVar);
    }

    private C59949dd() {
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
                return newMessageInfo(f162019f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C59967q.class});
            case 3:
                return new C59949dd();
            case 4:
                return new C59948dc();
            case 5:
                return f162019f;
            case 6:
                C63010eb ebVar = f162020g;
                if (ebVar == null) {
                    synchronized (C59949dd.class) {
                        ebVar = f162020g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162019f);
                            f162020g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

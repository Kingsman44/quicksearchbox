package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aex */
/* compiled from: PG */
public final class aex extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final aex f134969f;

    /* renamed from: g */
    private static volatile C63010eb f134970g;

    /* renamed from: a */
    public int f134971a;

    /* renamed from: b */
    public C62971cq f134972b = emptyProtobufList();

    /* renamed from: c */
    public int f134973c;

    /* renamed from: d */
    public boolean f134974d = true;

    /* renamed from: e */
    public C62971cq f134975e = emptyProtobufList();

    static {
        aex aex = new aex();
        f134969f = aex;
        C62942bv.registerDefaultInstance(aex.class, aex);
    }

    private aex() {
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
                return newMessageInfo(f134969f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002ဌ\u0000\u0003ဇ\u0001\u0004\u001b", new Object[]{"a", "b", aco.class, C45240c.f118157a, aew.f134968a, "d", "e", acs.class});
            case 3:
                return new aex();
            case 4:
                return new aev();
            case 5:
                return f134969f;
            case 6:
                C63010eb ebVar = f134970g;
                if (ebVar == null) {
                    synchronized (aex.class) {
                        ebVar = f134970g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134969f);
                            f134970g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ahq */
/* compiled from: PG */
public final class ahq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final ahq f135112d;

    /* renamed from: e */
    private static volatile C63010eb f135113e;

    /* renamed from: a */
    public int f135114a;

    /* renamed from: b */
    public boolean f135115b;

    /* renamed from: c */
    public boolean f135116c;

    static {
        ahq ahq = new ahq();
        f135112d = ahq;
        C62942bv.registerDefaultInstance(ahq.class, ahq);
    }

    private ahq() {
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
                return newMessageInfo(f135112d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new ahq();
            case 4:
                return new ahp();
            case 5:
                return f135112d;
            case 6:
                C63010eb ebVar = f135113e;
                if (ebVar == null) {
                    synchronized (ahq.class) {
                        ebVar = f135113e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135112d);
                            f135113e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

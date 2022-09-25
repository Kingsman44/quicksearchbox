package com.google.assistant.p3803ag.p3809c;

import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.dc */
/* compiled from: PG */
public final class C49010dc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49010dc f126769c;

    /* renamed from: e */
    private static volatile C63010eb f126770e;

    /* renamed from: a */
    public C52393qb f126771a;

    /* renamed from: b */
    public C52403ql f126772b;

    /* renamed from: d */
    private int f126773d;

    static {
        C49010dc dcVar = new C49010dc();
        f126769c = dcVar;
        C62942bv.registerDefaultInstance(C49010dc.class, dcVar);
    }

    private C49010dc() {
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
                return newMessageInfo(f126769c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C49010dc();
            case 4:
                return new C49009db();
            case 5:
                return f126769c;
            case 6:
                C63010eb ebVar = f126770e;
                if (ebVar == null) {
                    synchronized (C49010dc.class) {
                        ebVar = f126770e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126769c);
                            f126770e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

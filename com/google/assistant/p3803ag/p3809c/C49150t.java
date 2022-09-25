package com.google.assistant.p3803ag.p3809c;

import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.t */
/* compiled from: PG */
public final class C49150t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49150t f127100c;

    /* renamed from: e */
    private static volatile C63010eb f127101e;

    /* renamed from: a */
    public C52393qb f127102a;

    /* renamed from: b */
    public C52403ql f127103b;

    /* renamed from: d */
    private int f127104d;

    static {
        C49150t tVar = new C49150t();
        f127100c = tVar;
        C62942bv.registerDefaultInstance(C49150t.class, tVar);
    }

    private C49150t() {
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
                return newMessageInfo(f127100c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C49150t();
            case 4:
                return new C49149s();
            case 5:
                return f127100c;
            case 6:
                C63010eb ebVar = f127101e;
                if (ebVar == null) {
                    synchronized (C49150t.class) {
                        ebVar = f127101e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127100c);
                            f127101e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

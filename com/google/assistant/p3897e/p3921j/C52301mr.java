package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.mr */
/* compiled from: PG */
public final class C52301mr extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52301mr f137291f;

    /* renamed from: g */
    private static volatile C63010eb f137292g;

    /* renamed from: a */
    public int f137293a;

    /* renamed from: b */
    public int f137294b;

    /* renamed from: c */
    public long f137295c;

    /* renamed from: d */
    public long f137296d;

    /* renamed from: e */
    public boolean f137297e;

    static {
        C52301mr mrVar = new C52301mr();
        f137291f = mrVar;
        C62942bv.registerDefaultInstance(C52301mr.class, mrVar);
    }

    private C52301mr() {
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
                return newMessageInfo(f137291f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", C52298mo.f137290a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C52301mr();
            case 4:
                return new C52300mq();
            case 5:
                return f137291f;
            case 6:
                C63010eb ebVar = f137292g;
                if (ebVar == null) {
                    synchronized (C52301mr.class) {
                        ebVar = f137292g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137291f);
                            f137292g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

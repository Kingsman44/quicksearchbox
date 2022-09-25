package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.ag.c.ha */
/* compiled from: PG */
public final class C49116ha extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49116ha f127027d;

    /* renamed from: g */
    private static volatile C63010eb f127028g;

    /* renamed from: a */
    public int f127029a;

    /* renamed from: b */
    public C49118hc f127030b;

    /* renamed from: c */
    public C63042fg f127031c;

    /* renamed from: e */
    private C48952az f127032e;

    /* renamed from: f */
    private byte f127033f = 2;

    static {
        C49116ha haVar = new C49116ha();
        f127027d = haVar;
        C62942bv.registerDefaultInstance(C49116ha.class, haVar);
    }

    private C49116ha() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127033f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127033f = b;
                return null;
            case 2:
                return newMessageInfo(f127027d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e"});
            case 3:
                return new C49116ha();
            case 4:
                return new C49114gz();
            case 5:
                return f127027d;
            case 6:
                C63010eb ebVar = f127028g;
                if (ebVar == null) {
                    synchronized (C49116ha.class) {
                        ebVar = f127028g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127027d);
                            f127028g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

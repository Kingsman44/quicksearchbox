package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.mq */
/* compiled from: PG */
public final class C88032mq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88032mq f238048c;

    /* renamed from: d */
    private static volatile C63010eb f238049d;

    /* renamed from: a */
    public int f238050a;

    /* renamed from: b */
    public int f238051b;

    static {
        C88032mq mqVar = new C88032mq();
        f238048c = mqVar;
        C62942bv.registerDefaultInstance(C88032mq.class, mqVar);
    }

    private C88032mq() {
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
                return newMessageInfo(f238048c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88032mq();
            case 4:
                return new C88031mp();
            case 5:
                return f238048c;
            case 6:
                C63010eb ebVar = f238049d;
                if (ebVar == null) {
                    synchronized (C88032mq.class) {
                        ebVar = f238049d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238048c);
                            f238049d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

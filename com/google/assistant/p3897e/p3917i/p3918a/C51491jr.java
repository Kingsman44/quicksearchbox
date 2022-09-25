package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.jr */
/* compiled from: PG */
public final class C51491jr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51491jr f134160c;

    /* renamed from: d */
    private static volatile C63010eb f134161d;

    /* renamed from: a */
    public int f134162a;

    /* renamed from: b */
    public C51493jt f134163b;

    static {
        C51491jr jrVar = new C51491jr();
        f134160c = jrVar;
        C62942bv.registerDefaultInstance(C51491jr.class, jrVar);
    }

    private C51491jr() {
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
                return newMessageInfo(f134160c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51491jr();
            case 4:
                return new C51490jq();
            case 5:
                return f134160c;
            case 6:
                C63010eb ebVar = f134161d;
                if (ebVar == null) {
                    synchronized (C51491jr.class) {
                        ebVar = f134161d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134160c);
                            f134161d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
